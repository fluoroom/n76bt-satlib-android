# KISS / TNC Mode — Implementation Guide

The N76 can operate as a software TNC (Terminal Node Controller) using the standard
KISS protocol. In KISS mode:
- Received AX.25 frames arrive from the radio over the Bluetooth serial link as KISS frames
- KISS frames sent to the radio are modulated and transmitted over the air

This enables APRS, packet radio, and any other AX.25-based application.

---

## Enabling KISS mode

There are two ways to activate KISS mode:

### Method A — via BSS settings (persistent)

1. Read current settings with `READ_BSS_SETTINGS` (ordinal 33)
2. Set `kiss_en = 1` in the settings blob
3. Optionally set `kiss_tx_delay` and `kiss_tx_tail`
4. Write back with `WRITE_BSS_SETTINGS` (ordinal 34)
5. Commit to flash with `STORE_SETTINGS` (ordinal 12)

```python
settings["kiss_en"]       = 1
settings["kiss_tx_delay"] = 50   # 500 ms (× 10 ms per unit)
settings["kiss_tx_tail"]  = 5    # 50 ms
blob = build_bss_settings(settings)
send_command(sock, 34, blob)
send_command(sock, 12)            # commit to flash
```

### Method B — via DO_PROG_FUNC (toggle, non-persistent)

```python
# Toggle KISS mode on/off — action ordinal 25:
send_command(sock, 66, bytes([0x00, 0x19]))   # DO_PROG_FUNC, action=25
```

Use this for quick enable/disable without saving to flash.

---

## KISS protocol specification

The N76 implements the standard **KISS** (Keep It Simple, Stupid) protocol as defined
in ARRL's specification. The link is the same Bluetooth RFCOMM serial stream used for
GAIA commands, but when KISS mode is active the data stream switches to raw KISS frames.

### Frame format

```
0xC0  [TYPE]  [DATA ...]  0xC0
```

| Byte | Name | Value |
|---|---|---|
| `0xC0` | FEND | Frame end/begin delimiter |
| TYPE   | Frame type | See type table |
| DATA   | Payload | AX.25 frame or parameter byte |
| `0xC0` | FEND | End delimiter |

### Type byte

Bits [7:4] = port number (usually 0 for single-port devices like the N76).  
Bits [3:0] = command type.

| Type (low nibble) | Name | Direction | Data |
|---|---|---|---|
| `0x0` | DATA_FRAME    | Both       | AX.25 frame bytes (without flags/FCS) |
| `0x1` | TX_DELAY      | Host→TNC   | 1 byte: TX delay × 10 ms |
| `0x2` | PERSISTENCE   | Host→TNC   | 1 byte: persistence × 256 |
| `0x3` | SLOT_TIME     | Host→TNC   | 1 byte: slot time × 10 ms |
| `0x4` | TX_TAIL       | Host→TNC   | 1 byte: TX tail × 10 ms |
| `0x5` | FULL_DUPLEX   | Host→TNC   | 1 byte: 0=half duplex, 1=full duplex |
| `0x6` | SET_HW        | Host→TNC   | device-specific |
| `0xF` | RETURN        | Host→TNC   | none — exit KISS mode |

### Byte escaping (within DATA only, not in FEND or TYPE bytes)

| Original byte | Escaped sequence |
|---|---|
| `0xC0` (FEND) | `0xDB 0xDC` |
| `0xDB` (FESC) | `0xDB 0xDD` |

All other bytes pass through unmodified.

---

## Sending a packet (host → radio → air)

```python
FEND = 0xC0
FESC = 0xDB
TFEND = 0xDC
TFESC = 0xDD

def kiss_escape(data: bytes) -> bytes:
    out = bytearray()
    for b in data:
        if b == FEND:
            out += bytes([FESC, TFEND])
        elif b == FESC:
            out += bytes([FESC, TFESC])
        else:
            out.append(b)
    return bytes(out)

def kiss_wrap(ax25_frame: bytes, port: int = 0) -> bytes:
    """Wrap an AX.25 frame in a KISS DATA_FRAME packet."""
    type_byte = (port << 4) | 0x00   # DATA_FRAME = 0
    return bytes([FEND, type_byte]) + kiss_escape(ax25_frame) + bytes([FEND])

# Send to radio (transmit over-the-air):
sock.sendall(kiss_wrap(my_ax25_frame))
```

---

## Receiving a packet (air → radio → host)

```python
def kiss_unescape(data: bytes) -> bytes:
    out = bytearray()
    i = 0
    while i < len(data):
        if data[i] == FESC:
            i += 1
            if i < len(data):
                if data[i] == TFEND:
                    out.append(FEND)
                elif data[i] == TFESC:
                    out.append(FESC)
                else:
                    out.append(data[i])   # malformed but tolerate
        else:
            out.append(data[i])
        i += 1
    return bytes(out)

class KISSReader:
    def __init__(self):
        self._buf = bytearray()
        self._in_frame = False
        self._frame = bytearray()

    def feed(self, data: bytes):
        """Feed raw bytes from the socket; returns list of (port, type, payload) tuples."""
        packets = []
        for b in data:
            if b == FEND:
                if self._in_frame and len(self._frame) >= 1:
                    type_byte = self._frame[0]
                    port    = (type_byte >> 4) & 0x0F
                    cmd     = type_byte & 0x0F
                    payload = kiss_unescape(bytes(self._frame[1:]))
                    packets.append((port, cmd, payload))
                self._in_frame = True
                self._frame = bytearray()
            else:
                if self._in_frame:
                    self._frame.append(b)
        return packets

# Usage:
reader = KISSReader()
while True:
    raw = sock.recv(1024)
    for port, cmd, payload in reader.feed(raw):
        if cmd == 0x00:   # DATA_FRAME
            print(f"Received AX.25 frame ({len(payload)} bytes):", payload.hex())
```

---

## KISS parameter commands

Configure the TNC parameters from the host:

```python
def kiss_set_tx_delay(delay_10ms: int, port: int = 0) -> bytes:
    """delay_10ms: 0–255 (multiply by 10 to get milliseconds)."""
    return bytes([FEND, (port << 4) | 0x01, delay_10ms & 0xFF, FEND])

def kiss_set_persistence(p256: int, port: int = 0) -> bytes:
    """p256: 0–255. Probability of TX = (p256+1)/256. Typical: 63."""
    return bytes([FEND, (port << 4) | 0x02, p256 & 0xFF, FEND])

def kiss_set_slot_time(slot_10ms: int, port: int = 0) -> bytes:
    """slot_10ms: 0–255. Typical: 10 (100 ms)."""
    return bytes([FEND, (port << 4) | 0x03, slot_10ms & 0xFF, FEND])

def kiss_set_tx_tail(tail_10ms: int, port: int = 0) -> bytes:
    return bytes([FEND, (port << 4) | 0x04, tail_10ms & 0xFF, FEND])

def kiss_exit() -> bytes:
    """Return TNC to normal (non-KISS) mode."""
    return bytes([FEND, 0xFF, FEND])

# Example: configure 500 ms TX delay, 50 ms tail
sock.sendall(kiss_set_tx_delay(50))
sock.sendall(kiss_set_tx_tail(5))
```

---

## APRS beacon example

A minimal APRS position beacon is an AX.25 UI frame:

```python
def encode_callsign(call: str, ssid: int = 0, is_last: bool = False) -> bytes:
    """Encode a callsign into AX.25 6-byte+1-byte format."""
    call = call.upper().ljust(6)[:6]
    addr = bytes([ord(c) << 1 for c in call])
    ssid_byte = ((ssid & 0x0F) << 1) | 0x60 | (0x01 if is_last else 0x00)
    return addr + bytes([ssid_byte])

def build_aprs_frame(src_call: str, src_ssid: int,
                     dest: str = "APRS  ",
                     path: list[tuple[str,int]] = None,
                     info: bytes = b"") -> bytes:
    """Build a minimal AX.25 UI frame for APRS."""
    dest_addr = encode_callsign(dest, 0, is_last=False)
    src_addr  = encode_callsign(src_call, src_ssid,
                                is_last=(path is None or len(path) == 0))
    digi_addrs = b""
    if path:
        for i, (call, ssid) in enumerate(path):
            last = (i == len(path) - 1)
            digi_addrs += encode_callsign(call, ssid, is_last=last)

    header = dest_addr + src_addr + digi_addrs
    # UI frame: control=0x03, PID=0xF0
    return header + bytes([0x03, 0xF0]) + info

# Build a simple position beacon
# APRS info field: !DDMM.hhN/DDDMM.hhW> comment
def aprs_position(lat_deg: float, lon_deg: float,
                  symbol_table: str = "/",
                  symbol_code: str = ">",
                  comment: str = "") -> bytes:
    lat_abs = abs(lat_deg)
    lon_abs = abs(lon_deg)
    lat_d = int(lat_abs)
    lat_m = (lat_abs - lat_d) * 60
    lon_d = int(lon_abs)
    lon_m = (lon_abs - lon_d) * 60
    lat_s = f"{lat_d:02d}{lat_m:05.2f}{'N' if lat_deg >= 0 else 'S'}"
    lon_s = f"{lon_d:03d}{lon_m:05.2f}{'E' if lon_deg >= 0 else 'W'}"
    info = f"!{lat_s}{symbol_table}{lon_s}{symbol_code}{comment}"
    return info.encode("ascii")

frame = build_aprs_frame(
    src_call = "N0CALL",
    src_ssid = 9,
    path     = [("WIDE1", 1), ("WIDE2", 1)],
    info     = aprs_position(37.7749, -122.4194, comment="N76 APRS test"),
)
sock.sendall(kiss_wrap(frame))
```

---

## Timing recommendations

| Parameter | Recommended value | Notes |
|---|---|---|
| TX delay   | 500 ms (50 units) | Time for radio to key up before data |
| Persistence| 63 (×256 ≈ 25%)   | CSMA probability |
| Slot time  | 100 ms (10 units) | CSMA slot interval |
| TX tail    | 50 ms (5 units)   | Tail after last bit |

These match the values from the N76 BSS settings defaults.

---

## Notes on GAIA ↔ KISS coexistence

When `kiss_en = 1`, the radio's serial link carries **both** GAIA frames and KISS frames.
GAIA frames start with `0xFF`; KISS frames start with `0xC0`. Parse the first byte to
determine which type of frame you are reading.

```python
def detect_frame_type(first_byte: int):
    if first_byte == 0xFF:
        return "GAIA"
    elif first_byte == 0xC0:
        return "KISS"
    else:
        return "UNKNOWN"
```

Feed the bytes into the appropriate parser depending on the type detected.
