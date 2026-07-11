# N76 HT — Protocol Implementation Guide

This folder contains complete, language-agnostic specifications for every communication
protocol used between a host (phone / computer) and the Kenwood-style N76 handheld
transceiver. The specifications were reverse-engineered from the decompiled Android APK
`com.benshikj.ht`.

Use these documents to implement a controller in Python, Rust, C, Go, or any other
language.

---

## Documents

| File | What you need it for |
|---|---|
| [bluetooth-transport.md](bluetooth-transport.md) | Opening the Bluetooth connection (Classic RFCOMM or BLE GATT) |
| [gaia-protocol.md](gaia-protocol.md) | Framing every packet you send or receive |
| [bss-commands.md](bss-commands.md) | Complete table of command IDs and when to use them |
| [bss-settings.md](bss-settings.md) | Reading and writing the device settings blob |
| [frequency-mode.md](frequency-mode.md) | Setting exact TX/RX frequencies (VFO mode) |
| [satellite-mode.md](satellite-mode.md) | Satellite tracking, Doppler correction, pass prediction |
| [kiss-tnc.md](kiss-tnc.md) | Enabling TNC/KISS mode for APRS packet radio |
| [audio-system.md](audio-system.md) | PTT, audio capture/play, VOX, AFSK modem |

---

## Quick-start sequence

```
1. Open BT Classic RFCOMM socket  →  see bluetooth-transport.md
2. Wait for 0xFF sync byte        →  see gaia-protocol.md
3. Send REGISTER_NOTIFICATION     →  see bss-commands.md  (ordinal 6)
4. Send READ_BSS_SETTINGS         →  see bss-settings.md  (ordinal 33)
5. Parse settings response
6. For satellite: send FREQ_MODE_SET_PAR + SET_SATELLITE_INFO  →  satellite-mode.md
7. For APRS TNC: enable kiss_en in settings, send WRITE_BSS_SETTINGS  →  kiss-tnc.md
```

---

## Architecture

```
Host (you)                            N76 Radio
──────────────────────────────────────────────────
GAIA packet (framed)  ──────────►  BT Classic RFCOMM  (or BLE GATT)
                      ◄──────────  EVENT_NOTIFICATION / ACK
```

All payloads are **big-endian** unless noted.  All frequencies in **Hz**.
All times in **milliseconds** unless noted.
