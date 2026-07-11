# BSS Settings Blob

Commands `READ_BSS_SETTINGS` (33) and `WRITE_BSS_SETTINGS` (34) exchange a compact
binary blob. This document specifies every bit.

---

## Blob overview

The blob is a continuous bitfield. Bits are packed LSB-first within each byte.

| Firmware version | Blob size | Notes |
|---|---|---|
| < 50   | 14 bytes | Short legacy subset |
| 50–135 | 18 bytes | v1 subset |
| ≥ 136  | 22+ bytes | Full blob; GPS tail if `use_custom_location=1` |

To be safe, always write **at least 22 bytes**. Pad any unused bytes with `0x00`.

---

## Bit layout

Bits are consumed/produced in the order shown. Bit 0 of the blob is the LSB of `blob[0]`.

```
Bit range  Width  Field name              Values / notes
─────────  ─────  ──────────────────────  ──────────────────────────────────────────
   0–3       4    channelA_lo             Channel A index, bits [3:0]
   4–7       4    channelB_lo             Channel B index, bits [3:0]
   8         1    scan                    0=off, 1=scan active
   9         1    aghfp_call_mode         0=normal, 1=call
  10–11      2    doubleChannel           0=off, 1=watching A, 2=watching B
  12–15      4    squelchLevel            0–15
  16         1    tailElim                0=off, 1=tail elimination on
  17         1    audio_relay_en          0=off, 1=relay audio to paired phone
  18         1    auto_power_on           0=off, 1=power on with BT connection
  19         1    keep_aghfp_link         0=off, 1=hold HFP link when radio idles
  20–22      3    tx_time_limit           See TX time limit table
  23–26      4    tx_hold_time            TX hold-on frames (0–15)
  27–31      5    mic_gain                Microphone gain (0–31)
  32–33      2    local_speaker           Speaker routing (0=off, 1=radio, 2=phone, 3=both)
  34–36      3    bt_mic_gain             Bluetooth mic gain (0–7)
  37         1    adaptive_response       0=off, 1=adaptive noise response
  38         1    dis_tone                0=tones ON, 1=tones DISABLED
  39         1    power_saving_mode       0=off, 1=active
  40–42      3    auto_power_off          0=never, 1=5min, 2=10min, 3=30min, 4=60min
  43–47      5    auto_share_loc_ch_lo    Lower 5 bits of channel for auto APRS (combined later)
  48–49      2    hm_speaker              HM-compatible speaker routing
  50–53      4    positioning_system      GNSS system bitmask
  54–59      6    time_offset             UTC offset in half-hours (signed, −24 to +26)
  60         1    use_freq_range_2        0=standard, 1=extended frequency range
  61         1    ptt_lock                0=PTT active, 1=PTT locked
  62         1    leading_sync_bit_en     0=off, 1=leading sync bit before TX
  63         1    pairing_at_power_on     0=off, 1=enter BT pairing on power-on
  64–68      5    screen_timeout          Display timeout index (0=never, 1=15s, 2=30s, …)
  69         1    kiss_upload_tx_msg      0=off, 1=upload transmitted messages over KISS
  70         1    kiss_en                 0=off, 1=KISS/TNC mode enabled  ← KEY FLAG
  71         1    imperial_unit           0=metric, 1=imperial
  72–73      2    wx_mode                 0=off, 1=monitor, 2=alert
  74–77      4    noaa_ch                 NOAA weather channel 0–9
  78–79      2    vfo1_tx_powerX          VFO1 TX power extra bits
  80–81      2    vfo2_tx_powerX          VFO2 TX power extra bits
  82         1    dis_digital_mute        0=normal, 1=disable digital squelch mute
  83         1    signaling_ecc_en        0=off, 1=ECC for digital signalling
  84         1    ch_data_lock            0=unlocked, 1=channel data locked
  85–87      3    auto_share_loc_ch_hi    Upper 3 bits of auto-share channel (combined with _lo)
  88–95      8    kiss_tx_delay           KISS TX delay × 10 ms (0–255; range 0–2550 ms)
  96–103     8    kiss_tx_tail            KISS TX tail × 10 ms (0–255)
  104        1    vox_en                  0=off, 1=VOX enabled
  105–107    3    vox_level               VOX sensitivity 0–7 (7=most sensitive)
  108        1    dis_bt_mic              0=BT mic active, 1=BT mic disabled
  109–111    3    vox_delay               VOX hang time index
  112        1    ns_en                   0=off, 1=noise suppression
  113–116    4    alarm_volume            Alarm volume 0–15
  117        1    use_custom_location     0=GPS, 1=use manually set location
  118        1    gpwpl_upload_en         0=off, 1=upload GPWPL waypoints over KISS
  119        1    vfo1_mod_freqX          VFO1 modulation frequency extra bit
  120–123    4    channelA_hi             Channel A index, bits [7:4]  (combined with _lo)
  124–127    4    channelB_hi             Channel B index, bits [7:4]
  [128–175  48    GPS position tail]      Only present if use_custom_location=1
```

### Auto-share location channel

Combine `auto_share_loc_ch_lo` (bits 43–47) and `auto_share_loc_ch_hi` (bits 85–87):
```
channel = auto_share_loc_ch_lo | (auto_share_loc_ch_hi << 5)
```
8-bit channel number (0–255).

### Channel A / B

Combine `channelA_lo` (bits 0–3) and `channelA_hi` (bits 120–123):
```
channelA = channelA_lo | (channelA_hi << 4)
```

### TX time limit values

| Encoded | Limit |
|---|---|
| 0 | 0 (unlimited) |
| 1 | 0 (unlimited) |
| 2 | 0 (unlimited) |
| 3 | ~1 minute |
| 4 | ~3 minutes |

(Values 0, 1, 2 all map to "off" based on the firmware mapping: `< 3 → 0, == 3 → 1, > 3 → 2`)

### GPS position tail (48 bits, when use_custom_location=1)

Follows immediately after bit 127:
```
Bits   Width  Field
─────  ─────  ───────────────────────────────────────
 0–23   24    latitude  (degrees × 60 × 500, signed)
24–47   24    longitude (degrees × 60 × 500, signed)
```

---

## Reading the blob — Python implementation

```python
def read_bits(blob: bytes, bit_offset: int, width: int, signed=False) -> int:
    """Extract `width` bits starting at `bit_offset` (LSB-first within each byte)."""
    val = 0
    for i in range(width):
        byte_idx = (bit_offset + i) // 8
        bit_idx  = (bit_offset + i) % 8
        if (blob[byte_idx] >> bit_idx) & 1:
            val |= (1 << i)
    if signed and (val >> (width - 1)):
        val -= (1 << width)
    return val

def parse_bss_settings(blob: bytes) -> dict:
    r = read_bits
    s = {
        "channelA_lo":          r(blob,   0, 4),
        "channelB_lo":          r(blob,   4, 4),
        "scan":                 r(blob,   8, 1),
        "aghfp_call_mode":      r(blob,   9, 1),
        "doubleChannel":        r(blob,  10, 2),
        "squelchLevel":         r(blob,  12, 4),
        "tailElim":             r(blob,  16, 1),
        "audio_relay_en":       r(blob,  17, 1),
        "auto_power_on":        r(blob,  18, 1),
        "keep_aghfp_link":      r(blob,  19, 1),
        "tx_time_limit":        r(blob,  20, 3),
        "tx_hold_time":         r(blob,  23, 4),
        "mic_gain":             r(blob,  27, 5),
        "local_speaker":        r(blob,  32, 2),
        "bt_mic_gain":          r(blob,  34, 3),
        "adaptive_response":    r(blob,  37, 1),
        "dis_tone":             r(blob,  38, 1),
        "power_saving_mode":    r(blob,  39, 1),
        "auto_power_off":       r(blob,  40, 3),
        "auto_share_loc_ch_lo": r(blob,  43, 5),
        "hm_speaker":           r(blob,  48, 2),
        "positioning_system":   r(blob,  50, 4),
        "time_offset":          r(blob,  54, 6, signed=True),
        "use_freq_range_2":     r(blob,  60, 1),
        "ptt_lock":             r(blob,  61, 1),
        "leading_sync_bit_en":  r(blob,  62, 1),
        "pairing_at_power_on":  r(blob,  63, 1),
        "screen_timeout":       r(blob,  64, 5),
        "kiss_upload_tx_msg":   r(blob,  69, 1),
        "kiss_en":              r(blob,  70, 1),
        "imperial_unit":        r(blob,  71, 1),
        "wx_mode":              r(blob,  72, 2),
        "noaa_ch":              r(blob,  74, 4),
        "vfo1_tx_powerX":       r(blob,  78, 2),
        "vfo2_tx_powerX":       r(blob,  80, 2),
        "dis_digital_mute":     r(blob,  82, 1),
        "signaling_ecc_en":     r(blob,  83, 1),
        "ch_data_lock":         r(blob,  84, 1),
        "auto_share_loc_ch_hi": r(blob,  85, 3),
        "kiss_tx_delay":        r(blob,  88, 8),
        "kiss_tx_tail":         r(blob,  96, 8),
        "vox_en":               r(blob, 104, 1),
        "vox_level":            r(blob, 105, 3),
        "dis_bt_mic":           r(blob, 108, 1),
        "vox_delay":            r(blob, 109, 3),
        "ns_en":                r(blob, 112, 1),
        "alarm_volume":         r(blob, 113, 4),
        "use_custom_location":  r(blob, 117, 1),
        "gpwpl_upload_en":      r(blob, 118, 1),
        "vfo1_mod_freqX":       r(blob, 119, 1),
        "channelA_hi":          r(blob, 120, 4),
        "channelB_hi":          r(blob, 124, 4),
    }
    s["channelA"] = s["channelA_lo"] | (s["channelA_hi"] << 4)
    s["channelB"] = s["channelB_lo"] | (s["channelB_hi"] << 4)
    s["auto_share_loc_ch"] = s["auto_share_loc_ch_lo"] | (s["auto_share_loc_ch_hi"] << 5)
    if s["use_custom_location"] and len(blob) >= 22:
        lat_raw = r(blob, 128, 24, signed=True)
        lon_raw = r(blob, 152, 24, signed=True)
        s["custom_lat"] = lat_raw / (60 * 500)
        s["custom_lon"] = lon_raw / (60 * 500)
    return s
```

---

## Writing the blob — Python implementation

```python
def write_bits(blob: bytearray, bit_offset: int, width: int, value: int):
    """Write `width` bits of `value` into `blob` starting at `bit_offset` (LSB-first)."""
    mask = (1 << width) - 1
    value &= mask
    for i in range(width):
        byte_idx = (bit_offset + i) // 8
        bit_idx  = (bit_offset + i) % 8
        if (value >> i) & 1:
            blob[byte_idx] |=  (1 << bit_idx)
        else:
            blob[byte_idx] &= ~(1 << bit_idx)

def build_bss_settings(s: dict, firmware_ver: int = 136) -> bytes:
    size = 22 if firmware_ver >= 136 else (18 if firmware_ver >= 50 else 14)
    if s.get("use_custom_location"):
        size = max(size, 28)   # 22 bytes + 6 bytes GPS
    blob = bytearray(size)

    ch_a = s.get("channelA", 0)
    ch_b = s.get("channelB", 0)
    ch_lo = s.get("auto_share_loc_ch", 0)

    w = write_bits
    w(blob,   0, 4, ch_a & 0x0F)
    w(blob,   4, 4, ch_b & 0x0F)
    w(blob,   8, 1, s.get("scan", 0))
    w(blob,   9, 1, s.get("aghfp_call_mode", 0))
    w(blob,  10, 2, s.get("doubleChannel", 0))
    w(blob,  12, 4, s.get("squelchLevel", 0))
    w(blob,  16, 1, s.get("tailElim", 0))
    w(blob,  17, 1, s.get("audio_relay_en", 0))
    w(blob,  18, 1, s.get("auto_power_on", 0))
    w(blob,  19, 1, s.get("keep_aghfp_link", 0))
    w(blob,  20, 3, s.get("tx_time_limit", 0))
    w(blob,  23, 4, s.get("tx_hold_time", 0))
    w(blob,  27, 5, s.get("mic_gain", 0))
    w(blob,  32, 2, s.get("local_speaker", 0))
    w(blob,  34, 3, s.get("bt_mic_gain", 0))
    w(blob,  37, 1, s.get("adaptive_response", 0))
    w(blob,  38, 1, s.get("dis_tone", 0))
    w(blob,  39, 1, s.get("power_saving_mode", 0))
    w(blob,  40, 3, s.get("auto_power_off", 0))
    w(blob,  43, 5, ch_lo & 0x1F)
    w(blob,  48, 2, s.get("hm_speaker", 0))
    w(blob,  50, 4, s.get("positioning_system", 0))
    w(blob,  54, 6, s.get("time_offset", 0) & 0x3F)
    w(blob,  60, 1, s.get("use_freq_range_2", 0))
    w(blob,  61, 1, s.get("ptt_lock", 0))
    w(blob,  62, 1, s.get("leading_sync_bit_en", 0))
    w(blob,  63, 1, s.get("pairing_at_power_on", 0))
    w(blob,  64, 5, s.get("screen_timeout", 0))
    w(blob,  69, 1, s.get("kiss_upload_tx_msg", 0))
    w(blob,  70, 1, s.get("kiss_en", 0))
    w(blob,  71, 1, s.get("imperial_unit", 0))
    w(blob,  72, 2, s.get("wx_mode", 0))
    w(blob,  74, 4, s.get("noaa_ch", 0))
    w(blob,  78, 2, s.get("vfo1_tx_powerX", 0))
    w(blob,  80, 2, s.get("vfo2_tx_powerX", 0))
    w(blob,  82, 1, s.get("dis_digital_mute", 0))
    w(blob,  83, 1, s.get("signaling_ecc_en", 0))
    w(blob,  84, 1, s.get("ch_data_lock", 0))
    w(blob,  85, 3, (ch_lo >> 5) & 0x07)
    w(blob,  88, 8, s.get("kiss_tx_delay", 0))
    w(blob,  96, 8, s.get("kiss_tx_tail", 0))
    w(blob, 104, 1, s.get("vox_en", 0))
    w(blob, 105, 3, s.get("vox_level", 0))
    w(blob, 108, 1, s.get("dis_bt_mic", 0))
    w(blob, 109, 3, s.get("vox_delay", 0))
    w(blob, 112, 1, s.get("ns_en", 0))
    w(blob, 113, 4, s.get("alarm_volume", 0))
    w(blob, 117, 1, s.get("use_custom_location", 0))
    w(blob, 118, 1, s.get("gpwpl_upload_en", 0))
    w(blob, 119, 1, s.get("vfo1_mod_freqX", 0))
    w(blob, 120, 4, (ch_a >> 4) & 0x0F)
    w(blob, 124, 4, (ch_b >> 4) & 0x0F)

    if s.get("use_custom_location") and "custom_lat" in s:
        lat_i = int(s["custom_lat"] * 60 * 500) & 0xFFFFFF
        lon_i = int(s["custom_lon"] * 60 * 500) & 0xFFFFFF
        w(blob, 128, 24, lat_i)
        w(blob, 152, 24, lon_i)

    return bytes(blob)
```

---

## Typical workflow

```python
# 1. Read current settings
send_command(sock, 33)              # READ_BSS_SETTINGS
response = wait_for_ack(sock, 33)   # blocks until ACK received
settings = parse_bss_settings(response["payload"])

# 2. Modify
settings["kiss_en"] = 1
settings["kiss_tx_delay"] = 50      # 500 ms
settings["kiss_tx_tail"] = 5        # 50 ms
settings["vox_en"] = 0

# 3. Write back
blob = build_bss_settings(settings, firmware_ver=136)
send_command(sock, 34, blob)        # WRITE_BSS_SETTINGS
send_command(sock, 12)              # STORE_SETTINGS (commit to flash)
```
