# Frequency / VFO Mode

The N76 has a VFO mode that overrides the active memory channel and sets exact
TX/RX frequencies. This is used for satellite Doppler correction and for any
situation where you need to tune to a specific frequency not in memory.

Commands:
- `FREQ_MODE_SET_PAR`    (ordinal 35) — write VFO parameters
- `FREQ_MODE_GET_STATUS` (ordinal 36) — read current VFO state

---

## VFO modes

| Mode ordinal | Name | Meaning |
|---|---|---|
| 0 | `MODE_OFF`         | VFO inactive; radio uses memory channels |
| 1 | `MODE_UP`          | Frequency scan, stepping up |
| 2 | `MODE_DOWN`        | Frequency scan, stepping down |
| 3 | `MODE_EXACT`       | Set exact frequency; radio holds this frequency |
| 4 | `MODE_CREATE_TEAM` | Create a talkgroup on a generated frequency |
| 5 | `MODE_JOIN_TEAM`   | Join a talkgroup |
| 6 | `MODE_NOAA_SCAN`   | Cycle through NOAA weather channels |
| 7 | `MODE_TONE_SCAN`   | CTCSS/DCS tone scan |
| 8 | `ONE_CLICK`        | One-click network link mode |
| 9 | `KISS`             | TNC/KISS passthrough mode |
| 10| `SATELLITE`        | **Satellite Doppler mode** |

---

## `FREQ_MODE_SET_PAR` payload

Total: **14 bytes** for firmware < 137, **16 bytes** for firmware ≥ 137.

The payload is a bitfield packed LSB-first.

```
Bit range  Width  Field               Encoding
─────────  ─────  ──────────────────  ─────────────────────────────────────────────
    0–1      2    rx_modulation       0=FM (NFM), 1=AM
    2–31    30    rx_freq             RX frequency in Hz (unsigned 30-bit)
   32–33     2    tx_modulation       0=FM (NFM), 1=AM
   34–63    30    tx_freq             TX frequency in Hz (unsigned 30-bit)
   64–79    16    rx_ctcss_dcs        RX sub-tone code (0=none; see CTCSS/DCS table)
   80–95    16    tx_ctcss_dcs        TX sub-tone code (0=none)
   96         1    tx_power_high      0=low power, 1=high power
   97–99     3    step                Tuning step index (see step table)
  100–103    4    mode                VFO mode ordinal (see table above)
  104–109    6    reserved            Write 0
  110–111    2    tx_power_extra      TX power extra level bits (firmware ≥ 137)
```

### Modulation types

| Value | Name | Use |
|---|---|---|
| 0 | FM | Narrowband FM — standard for VHF/UHF amateur radio |
| 1 | AM | Amplitude modulation — used for aircraft (108–137 MHz) |

### Tuning step (3 bits)

| Value | Step |
|---|---|
| 0 | 2.5 kHz |
| 1 | 5.0 kHz |
| 2 | 6.25 kHz |
| 3 | 10.0 kHz |
| 4 | 12.5 kHz |
| 5 | 20.0 kHz |
| 6 | 25.0 kHz |
| 7 | 50.0 kHz |

### CTCSS/DCS codes

CTCSS tone index 1–50 maps to standard tones (67.0 Hz to 254.1 Hz).
DCS codes start at index 51. Index 0 means no sub-tone.

---

## Building `FREQ_MODE_SET_PAR` — Python

```python
def build_freq_mode_set(rx_hz: int, tx_hz: int,
                        rx_ctcss: int = 0, tx_ctcss: int = 0,
                        rx_mod: int = 0, tx_mod: int = 0,
                        tx_power_high: bool = True,
                        step: int = 4,
                        mode: int = 3,
                        firmware_ver: int = 136) -> bytes:
    """
    rx_hz, tx_hz: frequencies in Hz (e.g. 145900000)
    rx_ctcss, tx_ctcss: sub-tone index (0=none)
    rx_mod, tx_mod: 0=FM, 1=AM
    step: 0–7 (see step table)
    mode: VFO mode ordinal (3=MODE_EXACT, 10=SATELLITE)
    """
    size = 16 if firmware_ver >= 137 else 14
    blob = bytearray(size)

    def wb(bit_offset, width, value):
        mask = (1 << width) - 1
        v = int(value) & mask
        for i in range(width):
            bi = (bit_offset + i) // 8
            shift = (bit_offset + i) % 8
            if (v >> i) & 1:
                blob[bi] |=  (1 << shift)
            else:
                blob[bi] &= ~(1 << shift)

    wb(  0,  2, rx_mod)
    wb(  2, 30, rx_hz)
    wb( 32,  2, tx_mod)
    wb( 34, 30, tx_hz)
    wb( 64, 16, rx_ctcss)
    wb( 80, 16, tx_ctcss)
    wb( 96,  1, 1 if tx_power_high else 0)
    wb( 97,  3, step)
    wb(100,  4, mode)
    # bits 104–109 = 0 (reserved)
    # bits 110–111 = 0 (tx_power_extra, optional)
    return bytes(blob)

# Example: tune to SO-50 satellite downlink / uplink
rx = 436_795_000   # 436.795 MHz
tx = 145_850_000   # 145.850 MHz

payload = build_freq_mode_set(rx, tx, mode=3)   # MODE_EXACT
send_command(sock, 35, payload)
```

---

## Parsing `FREQ_MODE_GET_STATUS` response

The ACK payload uses the same bitfield layout as the write command.

```python
def parse_freq_mode_status(payload: bytes) -> dict:
    def rb(bit_offset, width, signed=False):
        val = 0
        for i in range(width):
            bi = (bit_offset + i) // 8
            shift = (bit_offset + i) % 8
            if bi < len(payload) and (payload[bi] >> shift) & 1:
                val |= (1 << i)
        if signed and (val >> (width - 1)):
            val -= (1 << width)
        return val

    return {
        "rx_modulation": rb(0, 2),
        "rx_freq":       rb(2, 30),
        "tx_modulation": rb(32, 2),
        "tx_freq":       rb(34, 30),
        "rx_ctcss_dcs":  rb(64, 16),
        "tx_ctcss_dcs":  rb(80, 16),
        "tx_power_high": bool(rb(96, 1)),
        "step":          rb(97, 3),
        "mode":          rb(100, 4),
    }
```

---

## Status polling

After sending `FREQ_MODE_SET_PAR`, poll with `FREQ_MODE_GET_STATUS` to confirm the
radio accepted the new frequency:

| Situation | Poll interval |
|---|---|
| Satellite mode, scanning (mode 1 or 2) | 100 ms |
| Satellite mode, exact (mode 10)        | 500 ms |
| VFO idle (mode 0)                      | 5000 ms |

On firmware ≥ v143 you can instead register for `FREQ_SCAN_STATUS_CHANGED` (type 14)
and skip polling entirely.

---

## Turn off VFO mode

```python
# Return to memory-channel mode:
off_payload = build_freq_mode_set(0, 0, mode=0)   # MODE_OFF
send_command(sock, 35, off_payload)
```
