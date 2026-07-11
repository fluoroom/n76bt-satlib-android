# Audio System — Implementation Guide

The N76 can stream audio to and from the host over Bluetooth using multiple mechanisms.
This document covers PTT activation, audio capture, VOX, Bluetooth SCO, and the AFSK
software modem used for APRS / digital modes.

---

## 1. PTT control

### Via GAIA command (DO_PROG_FUNC)

```python
# Assert main PTT (start TX):
send_command(sock, 66, bytes([0x00, 0x0D]))   # action 13 = main_ptt

# Release PTT:
send_command(sock, 66, bytes([0x00, 0x1A]))   # action 26 = release_ptt
```

### Via physical PTT button (BLE FFE0 accessory)

See [bluetooth-transport.md § BLE PTT button](bluetooth-transport.md).

### TX timeout safety

The N76 enforces a TX time limit (configurable in BSS settings, `tx_time_limit` field).
Your implementation must always release PTT before this limit expires, or the radio
will cut TX automatically.

---

## 2. Audio path selection

The N76 routes audio through one of these paths (configured by BSS settings):

| `local_speaker` value | Speaker output |
|---|---|
| 0 | Off (muted) |
| 1 | Internal radio speaker |
| 2 | Phone/host via BT SCO |
| 3 | Both internal + phone |

For TX (microphone input), the radio uses:
- Internal radio microphone (when not in BT SCO call)
- Bluetooth SCO microphone from the paired phone (when SCO is active)

---

## 3. Audio capture parameters (Android reference)

The reference Android app captures audio with:

| Parameter | Value |
|---|---|
| Sample rate | **32000 Hz** |
| Channel config | CHANNEL_IN_MONO (`0x10` = 16) |
| Audio format | ENCODING_PCM_16BIT (`0x02` = 2) |
| Audio focus type | `AUDIOFOCUS_GAIN_TRANSIENT` (stream type 3) |

For any host implementation that wants to capture the TX audio locally before
relaying it, use 32000 Hz 16-bit mono PCM.

---

## 4. Bluetooth SCO (phone mic to radio TX)

Bluetooth SCO allows the phone's microphone to feed the radio's transmitter.

### SCO activation sequence

```
1. Check: BluetoothProfile.HEADSET is connected (profile state == 2)
2. Check: AudioManager.isBluetoothScoAvailableOffCall() == true
3. Register for broadcast: android.media.ACTION_SCO_AUDIO_STATE_UPDATED
4. Call AudioManager.startBluetoothSco()
5. Wait for SCO_AUDIO_STATE_CONNECTED (state == 1) — up to 3 s timeout
6. Capture audio from AudioRecord at 32000 Hz
7. On TX end: AudioManager.stopBluetoothSco()
8. Wait for SCO_AUDIO_STATE_DISCONNECTED (state == 0) — up to 3 s timeout
```

SCO state values:
| Value | Meaning |
|---|---|
| -1 | Error |
| 0  | Disconnected |
| 1  | Connected ← ready to record |
| 2  | Connecting |

---

## 5. VOX (Voice-Operated Transmit)

VOX activates PTT automatically when audio energy exceeds a threshold.

### BSS settings fields for VOX

| Field | Meaning |
|---|---|
| `vox_en` (bit 104) | 0=off, 1=VOX enabled |
| `vox_level` (bits 105–107) | Sensitivity 0–7 (7 = most sensitive) |
| `vox_delay` (bits 109–111) | Hang time after audio drops (index 0–7) |

### Enabling VOX

```python
settings["vox_en"]    = 1
settings["vox_level"] = 4    # moderate sensitivity
settings["vox_delay"] = 2    # ~200 ms hang time (exact mapping firmware-dependent)
blob = build_bss_settings(settings)
send_command(sock, 34, blob)
send_command(sock, 12)       # commit
```

### Toggling VOX via action

```python
send_command(sock, 66, bytes([0x00, 0x18]))   # DO_PROG_FUNC, action 24 = toggle_vox
```

---

## 6. TX start tone

Before the radio begins transmitting in PTT + audio streaming mode, the reference
app plays a "TX start" tone (`R.raw.start_tx`) and waits ~150–200 ms for the tone
to finish before beginning audio capture. This gives the radio's PA time to key up.

If you are implementing a host that streams audio to the radio, insert a similar delay:

```python
# After asserting PTT:
time.sleep(0.2)   # 200 ms — radio PA stabilisation + courtesy tone

# Now begin streaming audio frames
```

---

## 7. AFSK modem (for APRS / packet via audio)

The N76 app contains a software AFSK modem (`o5.c`) used when the host wants to
generate APRS beacons as audio tones (rather than via KISS TNC mode). The parameters:

| Parameter | Value |
|---|---|
| Sample rate | 32000 Hz |
| Bit depth | 16-bit signed PCM |
| Mark tone (bit 1) | 1200 Hz |
| Space tone (bit 0) | 2200 Hz |
| Baud rate | 1200 baud (Bell 202) |
| Pre-emphasis | Applied (de-emphasized on RX) |

### Bell 202 AFSK encoding

```python
import math, array

SAMPLE_RATE = 32000
MARK_HZ     = 1200
SPACE_HZ    = 2200
BAUD        = 1200
SAMPLES_PER_BIT = SAMPLE_RATE // BAUD   # = 26.666...; must track fractionally

def nrzi_encode(bits: list[int]) -> list[int]:
    """NRZI: transition on 0, no transition on 1."""
    out = []
    state = 1
    for b in bits:
        if b == 0:
            state ^= 1
        out.append(state)
    return out

def afsk_modulate(bits: list[int], amplitude: int = 16000) -> bytes:
    """Modulate a list of bits (after NRZI) to 16-bit PCM samples."""
    samples = array.array("h")   # signed 16-bit
    phase = 0.0
    samples_per_bit = SAMPLE_RATE / BAUD

    sample_count = 0.0
    for bit in bits:
        freq = MARK_HZ if bit == 1 else SPACE_HZ
        n = int(sample_count + samples_per_bit) - int(sample_count)
        for _ in range(n):
            s = int(amplitude * math.sin(2 * math.pi * phase))
            samples.append(max(-32767, min(32767, s)))
            phase += freq / SAMPLE_RATE
            if phase >= 1.0:
                phase -= 1.0
        sample_count += samples_per_bit

    return samples.tobytes()

def ax25_to_audio(ax25_frame: bytes) -> bytes:
    """
    Convert a raw AX.25 frame to AFSK audio suitable for playing into the radio.
    Includes flag bytes, bitstuffing, and NRZI encoding.
    """
    FLAG = 0x7E

    # Bitstuff the frame
    def bitstuff(data: bytes) -> list[int]:
        bits = []
        for b in data:
            for i in range(8):
                bits.append((b >> i) & 1)
        out = []
        consecutive_ones = 0
        for bit in bits:
            out.append(bit)
            if bit == 1:
                consecutive_ones += 1
                if consecutive_ones == 5:
                    out.append(0)   # insert stuffing 0
                    consecutive_ones = 0
            else:
                consecutive_ones = 0
        return out

    # Preamble: 12–16 flag bytes
    preamble_bits = []
    for _ in range(15):
        for i in range(8):
            preamble_bits.append((FLAG >> i) & 1)

    # Frame bits (with bitstuffing)
    frame_bits = bitstuff(ax25_frame)

    # Postamble: 2 flag bytes
    postamble_bits = []
    for _ in range(2):
        for i in range(8):
            postamble_bits.append((FLAG >> i) & 1)

    all_bits = preamble_bits + frame_bits + postamble_bits
    nrzi     = nrzi_encode(all_bits)
    return afsk_modulate(nrzi)
```

---

## 8. Audio reception (RX from radio to host)

The reference app uses an **Opus**-encoded UDP audio stream for network-relayed audio
(handled by `a2.e` via an RTP session). For direct Bluetooth audio the radio routes
to the SCO link.

For local reception on an Android device, audio is received via `AudioTrack` or
the Android `BluetoothHeadset` profile's audio routing.

For implementations that only need over-the-air packet detection (APRS), use the
KISS mode instead — the radio demodulates incoming packets in hardware and delivers
them as AX.25 frames over the serial link. No audio DSP is needed on the host.

---

## 9. Noise suppression

```python
# Enable noise suppression:
settings["ns_en"] = 1
blob = build_bss_settings(settings)
send_command(sock, 34, blob)
```

---

## 10. Digital signal mode

When digital modes are active (e.g., during a digital voice session detected via the
built-in AFSK detector), the app sends:

```python
send_command(sock, 43, bytes([0x01]))   # SET_IS_DIGITAL_SIGNAL = 1
```

On return to analog:
```python
send_command(sock, 43, bytes([0x00]))   # SET_IS_DIGITAL_SIGNAL = 0
```

This affects the radio's audio processing path (muting the discriminator output
during digital bursts to prevent noise).
