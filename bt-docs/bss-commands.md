# Command Reference

All commands use `vendor_id = 2`. The `command_id` field is the enum ordinal listed below.

Send a command:
```python
send_command(sock, ordinal, payload_bytes)
```

---

## Full command table

| Ordinal | Name | Direction | Payload |
|---|---|---|---|
| 0  | `UNKNOWN`                       | —    | — |
| 1  | `GET_DEV_ID`                    | H→D  | none; ACK payload = device identifier bytes |
| 2  | `SET_REG_TIMES`                 | H→D  | 1 byte: registration attempt count |
| 3  | `GET_REG_TIMES`                 | H→D  | none |
| 4  | `GET_DEV_INFO`                  | H→D  | none; ACK returns firmware version, model string |
| 5  | `READ_STATUS`                   | H→D  | none; ACK returns current HT status blob |
| 6  | `REGISTER_NOTIFICATION`         | H→D  | 1 byte: notification type ordinal (see Notifications table) |
| 7  | `CANCEL_NOTIFICATION`           | H→D  | 1 byte: notification type ordinal |
| 8  | `GET_NOTIFICATION`              | H→D  | 1 byte: notification type ordinal |
| 9  | `EVENT_NOTIFICATION`            | D→H  | byte[0]=type; rest=type-specific data |
| 10 | `READ_SETTINGS`                 | H→D  | none; returns legacy settings |
| 11 | `WRITE_SETTINGS`                | H→D  | legacy settings blob |
| 12 | `STORE_SETTINGS`                | H→D  | none; commits settings to flash |
| 13 | `READ_RF_CH`                    | H→D  | 1-2 bytes: channel index |
| 14 | `WRITE_RF_CH`                   | H→D  | channel index + channel data blob |
| 15 | `GET_IN_SCAN`                   | H→D  | none |
| 16 | `SET_IN_SCAN`                   | H→D  | 1 byte: 0=stop, 1=start scan |
| 17 | `SET_REMOTE_DEVICE_ADDR`        | H→D  | 6 bytes: BT MAC address |
| 18 | `GET_TRUSTED_DEVICE`            | H→D  | none |
| 19 | `DEL_TRUSTED_DEVICE`            | H→D  | device identifier |
| 20 | `GET_HT_STATUS`                 | H→D  | none; returns full status blob |
| 21 | `SET_HT_ON_OFF`                 | H→D  | 1 byte: 0=off, 1=on |
| 22 | `GET_VOLUME`                    | H→D  | none |
| 23 | `SET_VOLUME`                    | H→D  | 1 byte: volume level 0–15 |
| 24 | `RADIO_GET_STATUS`              | H→D  | none; FM radio status |
| 25 | `RADIO_SET_MODE`                | H→D  | 1 byte: FM radio mode |
| 26 | `RADIO_SEEK_UP`                 | H→D  | none |
| 27 | `RADIO_SEEK_DOWN`               | H→D  | none |
| 28 | `RADIO_SET_FREQ`                | H→D  | frequency bytes |
| 29 | `READ_ADVANCED_SETTINGS`        | H→D  | none |
| 30 | `WRITE_ADVANCED_SETTINGS`       | H→D  | advanced settings blob v1 |
| 31 | `HT_SEND_DATA`                  | H→D  | raw data to transmit over-the-air |
| 32 | `SET_POSITION`                  | H→D  | GPS position blob — see GPS encoding below |
| 33 | `READ_BSS_SETTINGS`             | H→D  | none; ACK returns full BSS settings blob |
| 34 | `WRITE_BSS_SETTINGS`            | H→D  | BSS settings blob — see [bss-settings.md](bss-settings.md) |
| 35 | `FREQ_MODE_SET_PAR`             | H→D  | VFO parameters — see [frequency-mode.md](frequency-mode.md) |
| 36 | `FREQ_MODE_GET_STATUS`          | H→D  | none; ACK returns current VFO status |
| 37 | `READ_RDA1846S_AGC`             | H→D  | none |
| 38 | `WRITE_RDA1846S_AGC`            | H→D  | AGC register data |
| 39 | `READ_FREQ_RANGE`               | H→D  | none; returns supported frequency range |
| 40 | `WRITE_DE_EMPH_COEFFS`          | H→D  | de-emphasis filter coefficients |
| 41 | `STOP_RINGING`                  | H→D  | none; stops alarm |
| 42 | `SET_TX_TIME_LIMIT`             | H→D  | 1 byte: TX timeout in seconds (0=unlimited) |
| 43 | `SET_IS_DIGITAL_SIGNAL`         | H→D  | 1 byte: 0=analog, 1=digital signal active |
| 44 | `SET_HL`                        | H→D  | 1 byte: 0=low power, 1=high power |
| 45 | `SET_DID`                       | H→D  | device identification bytes |
| 46 | `SET_IBA`                       | H→D  | IBA value |
| 47 | `GET_IBA`                       | H→D  | none |
| 48 | `SET_TRUSTED_DEVICE_NAME`       | H→D  | device address + name string |
| 49 | `SET_VOC`                       | H→D  | VOC threshold |
| 50 | `GET_VOC`                       | H→D  | none |
| 51 | `SET_PHONE_STATUS`              | H→D  | 1 byte: phone call state for audio routing |
| 52 | `READ_RF_STATUS`                | H→D  | none |
| 53 | `PLAY_TONE`                     | H→D  | tone ID bytes |
| 54 | `GET_DID`                       | H→D  | none |
| 55 | `GET_PF`                        | H→D  | none; returns programmable-function config |
| 56 | `SET_PF`                        | H→D  | PF key config — see PF key format below |
| 57 | `RX_DATA`                       | D→H  | received-over-the-air data packet |
| 58 | `WRITE_REGION_CH`               | H→D  | regional channel list |
| 59 | `WRITE_REGION_NAME`             | H→D  | null-terminated region name string |
| 60 | `SET_REGION`                    | H→D  | 1 byte: region preset index |
| 61 | `SET_PP_ID`                     | H→D  | PTT peripheral ID |
| 62 | `GET_PP_ID`                     | H→D  | none |
| 63 | `READ_ADVANCED_SETTINGS2`       | H→D  | none |
| 64 | `WRITE_ADVANCED_SETTINGS2`      | H→D  | advanced settings blob v2 |
| 65 | `UNLOCK`                        | H→D  | authentication token |
| 66 | `DO_PROG_FUNC`                  | H→D  | 2 bytes: action ID (big-endian) — see Action table |
| 67 | `SET_MSG`                       | H→D  | message / status string |
| 68 | `GET_MSG`                       | H→D  | none |
| 69 | `BLE_CONN_PARAM`                | H→D  | BLE connection interval parameters |
| 70 | `SET_TIME`                      | H→D  | UTC time bytes |
| 71 | `SET_APRS_PATH`                 | H→D  | APRS digipeater path string |
| 72 | `GET_APRS_PATH`                 | H→D  | none |
| 73 | `READ_REGION_NAME`              | H→D  | none |
| 74 | `SET_DEV_ID`                    | H→D  | device ID bytes |
| 75 | `GET_PF_ACTIONS`                | H→D  | none |
| 76 | `GET_POSITION`                  | H→D  | none; ACK returns last stored GPS fix |
| 77 | `SET_SATELLITE_INFO`            | H→D  | 30-byte satellite telemetry — see [satellite-mode.md](satellite-mode.md) |

---

## Notification types (used with ordinals 6, 7, 9)

| Ordinal | Name | Triggered by |
|---|---|---|
| 0  | `UNKNOWN`                    | — |
| 1  | `HT_STATUS_CHANGED`          | Channel, squelch, or PTT state change |
| 2  | `DATA_RXD`                   | Data packet received over-the-air |
| 3  | `NEW_INQUIRY_DATA`           | BT device scan result |
| 4  | `RESTORE_FACTORY_SETTINGS`   | Factory reset completed |
| 5  | `HT_CH_CHANGED`              | Active memory channel changed |
| 6  | `HT_SETTINGS_CHANGED`        | Settings modified on the radio itself |
| 7  | `RINGING_STOPPED`            | Alarm / ringing ended |
| 8  | `RADIO_STATUS_CHANGED`       | FM radio band state changed |
| 9  | `USER_ACTION`                | Button press or PF key action |
| 10 | `SYSTEM_EVENT`               | Low battery, imminent power-off, etc. |
| 11 | `BSS_SETTINGS_CHANGED`       | BSS settings changed on the radio |
| 12 | `DATA_TXD`                   | Data packet transmitted over-the-air |
| 13 | `POSITION_CHANGED`           | GPS fix updated |
| 14 | `FREQ_SCAN_STATUS_CHANGED`   | VFO scan / Doppler status changed |

### Registering multiple notifications (firmware ≥ v143)

Firmware ≥ v143 supports batch registration in a single command:
```python
# Register for types 1, 5, 13 at once:
send_command(sock, 6, bytes([1, 5, 13]))   # REGISTER_NOTIFICATION
```

For older firmware, register each type separately:
```python
for t in [1, 5, 13]:
    send_command(sock, 6, bytes([t]))
```

---

## DO_PROG_FUNC — programmable function actions (ordinal 66)

Payload = 2 bytes big-endian action ID.

| Action ID | String ID | Function |
|---|---|---|
| 0  | `disable`           | No operation |
| 1  | `alarm`             | Sound alarm |
| 2  | `alarm_and_mute`    | Sound alarm + mute microphone |
| 3  | `toggle_offline`    | Toggle offline / flight mode |
| 4  | `toggle_radio_tx`   | Toggle radio transmit enable |
| 5  | `toggle_tx_power`   | Toggle TX power high/low |
| 6  | `toggle_fm`         | Toggle FM broadcast radio |
| 7  | `prev_channel`      | Previous memory channel |
| 8  | `next_channel`      | Next memory channel |
| 9  | `t_call`            | Send DTMF T-call tone |
| 10 | `prev_region`       | Previous region preset |
| 11 | `next_region`       | Next region preset |
| 12 | `toggle_ch_scan`    | Toggle channel scan |
| 13 | `main_ptt`          | Assert main PTT |
| 14 | `sub_ptt`           | Assert sub PTT |
| 15 | `toggle_monitor`    | Toggle monitor (force open squelch) |
| 16 | `bt_pairing`        | Enter BT pairing mode |
| 17 | `toggle_double_ch`  | Toggle dual-channel watch (A+B) |
| 18 | `toggle_ab_ch`      | Toggle active A/B channel |
| 19 | `sendLocation`      | Transmit APRS position beacon |
| 20 | `one_click_link`    | Connect one-click network link |
| 21 | `vol_down`          | Volume − 1 |
| 22 | `vol_up`            | Volume + 1 |
| 23 | `toggle_mute`       | Toggle mute |
| 24 | `toggle_vox`        | Toggle VOX |
| 25 | `toggle_kiss`       | **Toggle KISS/TNC mode** |
| 26 | `release_ptt`       | Release PTT |
| 27 | `toggle_vfo`        | Toggle VFO / memory mode |
| 28 | `toggle_rev`        | Swap TX and RX frequencies |
| 29 | `squelch_up`        | Squelch level + 1 |
| 30 | `squelch_down`      | Squelch level − 1 |
| 31 | `show_squelch`      | Show squelch value on display |

```python
# Toggle KISS mode:
send_command(sock, 66, (25).to_bytes(2, "big"))   # DO_PROG_FUNC, action=25

# Assert PTT:
send_command(sock, 66, (13).to_bytes(2, "big"))   # DO_PROG_FUNC, action=13
```

---

## SET_POSITION — GPS position payload (ordinal 32)

Two payload formats exist:

### Short format — 6 bytes (firmware < v133)

```
Bits  Field
────  ─────────────────────────────────────────────────────────
 24   latitude  — signed int: degrees × 60 × 500  (arcminutes × 500)
 24   longitude — signed int: degrees × 60 × 500
```

Encoding:
```python
def encode_pos_short(lat_deg, lon_deg):
    lat = int(lat_deg * 60 * 500)
    lon = int(lon_deg * 60 * 500)
    # Pack as 24-bit big-endian signed integers
    return (
        lat.to_bytes(3, "big", signed=True) +
        lon.to_bytes(3, "big", signed=True)
    )
```

### Long format — 16 bytes (firmware ≥ v133) — add 2 for accuracy field

```
Bits  Field         Encoding
────  ────────────  ──────────────────────────────────────
 24   latitude      degrees × 60 × 500 (signed)
 24   longitude     degrees × 60 × 500 (signed)
 16   altitude      metres (signed; −32768 = no altitude)
 16   speed         km/h (−1 = no speed)
 16   bearing       degrees 0–359 (−1 = no bearing)
 32   timestamp     Unix epoch seconds (unsigned)
 16   accuracy      metres (0 = no accuracy)  [only if firmware ≥ 133]
```

```python
import struct, time

def encode_pos_long(lat, lon, alt=None, speed_ms=None, bearing=None,
                    accuracy=None, firmware_ver=133):
    with_acc = firmware_ver >= 133
    buf = bytearray(16 + (2 if with_acc else 0))
    lat_i = int(lat * 60 * 500)
    lon_i = int(lon * 60 * 500)
    buf[0:3] = lat_i.to_bytes(3, "big", signed=True)
    buf[3:6] = lon_i.to_bytes(3, "big", signed=True)
    struct.pack_into(">h", buf, 6, int(alt)   if alt   is not None else -32768)
    struct.pack_into(">h", buf, 8, int(speed_ms * 3.6) if speed_ms is not None else -1)
    struct.pack_into(">h", buf,10, int(bearing) if bearing is not None else -1)
    struct.pack_into(">I", buf,12, int(time.time()))
    if with_acc:
        acc = max(1, min(65535, int(accuracy))) if accuracy else 0
        struct.pack_into(">H", buf,16, acc)
    return bytes(buf)
```

Send:
```python
send_command(sock, 32, encode_pos_long(37.7749, -122.4194, alt=10))
```

---

## PF key format (SET_PF, ordinal 56)

Each programmable-function key is encoded as 2 bytes:

```
Byte 0:
  bits [7:4] = key index (0–15; which physical key)
  bits [3:0] = button type (press duration)

Byte 1:
  action index (see DO_PROG_FUNC action table above)
```

Button type values:
| Value | Name | Trigger |
|---|---|---|
| 0  | INVALID              | — |
| 1  | SHORT                | Short press |
| 2  | LONG                 | Long press |
| 3  | VERY_LONG            | Very long press |
| 4  | DOUBLE               | Double-click |
| 5  | REPEAT               | Hold-repeat |
| 6  | LOW_TO_HIGH          | Press-down edge |
| 7  | HIGH_TO_LOW          | Release edge |
| 8  | SHORT_SINGLE         | Short press (single only) |
| 9  | LONG_RELEASE         | Release after long press |
| 10 | VERY_LONG_RELEASE    | Release after very long press |
| 11 | VERY_VERY_LONG       | Extra-long press |
| 12 | VERY_VERY_LONG_RELEASE | Release after extra-long |
| 13 | TRIPLE               | Triple-click |
