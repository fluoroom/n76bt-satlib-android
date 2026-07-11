# GAIA Protocol — Packet Framing

Every command and response between the host and the N76 is wrapped in a GAIA frame.
The framing differs slightly between Classic RFCOMM and BLE GATT.

---

## 1. Classic RFCOMM — full GAIA frame

```
Byte  Size  Value / Field
────  ────  ─────────────────────────────────────────────────────────
  0    1    0xFF                     — sync / start-of-frame marker
  1    1    0x01                     — protocol version (always 1)
  2    1    flags                    — bit 0: checksum appended (1=yes)
  3    1    payload_length           — number of payload bytes (0–254)
  4    2    vendor_id                — big-endian uint16
  6    2    command_id               — big-endian uint16
  8    N    payload                  — N = payload_length bytes
8+N  0|1   checksum                 — XOR of all bytes [0 .. 8+N-1]; only if flags bit0=1
```

Total frame size: `8 + payload_length + (flags & 1)` bytes.  
Maximum payload: **254 bytes** (enforced by the radio firmware).  
Maximum frame: **270 bytes** (including checksum).  

### Checksum

```
checksum = 0
for i in range(len(frame) - 1):
    checksum ^= frame[i]
frame[-1] = checksum
```

The N76 sends checksummed frames; the app sends without checksum (`flags = 0x00`).
You should **accept** checksummed frames (verify or ignore) and **send** without checksum.

### Vendor IDs

| Vendor ID | Direction | Meaning |
|---|---|---|
| `0x0002` | Host → Radio | Standard command |
| `0x0003` | Radio → Host | Response / ACK |

ACK frames have bit 15 of `command_id` set: `ack_cmd_id = cmd_id | 0x8000`.

### Sync / framing state machine

Read bytes one at a time:

```python
STATE_IDLE   = 0   # waiting for 0xFF
STATE_HEADER = 1   # collecting bytes 1-7
STATE_BODY   = 2   # collecting payload
STATE_DONE   = 3   # full packet ready

buf = bytearray()
state = STATE_IDLE

def feed(byte):
    global state, buf
    if state == STATE_IDLE:
        if byte == 0xFF:
            buf = bytearray([0xFF])
            state = STATE_HEADER
    elif state == STATE_HEADER:
        buf.append(byte)
        if len(buf) == 8:               # header complete
            payload_len = buf[3]
            state = STATE_BODY if payload_len > 0 else STATE_DONE
    elif state == STATE_BODY:
        buf.append(byte)
        flags = buf[2]
        payload_len = buf[3]
        expected = 8 + payload_len + (flags & 1)
        if len(buf) == expected:
            state = STATE_DONE
    if state == STATE_DONE:
        packet = parse(bytes(buf))
        buf = bytearray()
        state = STATE_IDLE
        return packet
    return None
```

---

## 2. BLE GATT — short frame

Over BLE, the 0xFF sync and length fields are removed.
Each GATT write is one complete packet.

```
Byte  Size  Value / Field
────  ────  ────────────────────────────
  0    2    vendor_id    — big-endian
  2    2    command_id   — big-endian
  4    N    payload
```

Build a BLE frame:
```python
def build_ble(vendor_id, command_id, payload=b""):
    return (
        vendor_id.to_bytes(2, "big") +
        command_id.to_bytes(2, "big") +
        payload
    )
```

---

## 3. Building a Classic RFCOMM frame

```python
def build_frame(vendor_id, command_id, payload=b"", with_checksum=False):
    flags = 0x01 if with_checksum else 0x00
    plen  = len(payload)
    if plen > 254:
        raise ValueError("payload too long")
    frame = bytearray([
        0xFF,            # sync
        0x01,            # version
        flags,
        plen,
        (vendor_id >> 8) & 0xFF,
        vendor_id & 0xFF,
        (command_id >> 8) & 0xFF,
        command_id & 0xFF,
    ])
    frame.extend(payload)
    if with_checksum:
        cs = 0
        for b in frame:
            cs ^= b
        frame.append(cs)
    return bytes(frame)
```

---

## 4. Sending a command

The vendor ID for all host-to-radio commands is **always 2**.
The command ID is the **ordinal** of the `v4.v` enum — see [bss-commands.md](bss-commands.md).

```python
CMD_VENDOR_ID = 2

def send_command(sock, command_ordinal, payload=b""):
    frame = build_frame(CMD_VENDOR_ID, command_ordinal, payload)
    sock.sendall(frame)
```

---

## 5. Parsing a received packet

```python
def parse(data: bytes) -> dict:
    flags      = data[2]
    plen       = data[3]
    vendor_id  = (data[4] << 8) | data[5]
    command_id = (data[6] << 8) | data[7]
    payload    = data[8 : 8 + plen]
    is_ack     = bool(command_id & 0x8000)
    base_cmd   = command_id & 0x7FFF
    return {
        "vendor_id":  vendor_id,
        "command_id": command_id,
        "is_ack":     is_ack,
        "base_cmd":   base_cmd,
        "payload":    payload,
    }
```

### ACK status byte (first payload byte of ACK frames)

When `is_ack` is True:

| Value | Meaning |
|---|---|
| 0 | SUCCESS |
| 1 | NOT_SUPPORTED |
| 2 | NOT_AUTHENTICATED |
| 3 | INSUFFICIENT_RESOURCES |
| 4 | AUTHENTICATING |
| 5 | INVALID_PARAMETER |
| 6 | INCORRECT_STATE |
| 7 | IN_PROGRESS |

---

## 6. Notification packets (EVENT_NOTIFICATION)

The radio sends unsolicited notifications using command ordinal **9** (`EVENT_NOTIFICATION`),
vendor_id = **0x000A** (10).

```
Payload byte[0] = notification type (v4.x enum ordinal — see bss-commands.md)
Payload byte[1..] = notification-specific data
```

To receive notifications you must first register:
```python
# Register for HT_STATUS_CHANGED (ordinal 1):
send_command(sock, 6, bytes([1]))   # REGISTER_NOTIFICATION, type=1
```

---

## 7. Complete send+receive example (Python)

```python
import socket, threading, struct

VENDOR_HOST = 2

def build_frame(cmd, payload=b""):
    frame = struct.pack(">BBBBHH", 0xFF, 0x01, 0x00, len(payload),
                        VENDOR_HOST, cmd) + payload
    return frame

class N76:
    def __init__(self, mac):
        self.sock = socket.socket(socket.AF_BLUETOOTH,
                                  socket.SOCK_STREAM,
                                  socket.BTPROTO_RFCOMM)
        self.sock.connect((mac, 1))
        threading.Thread(target=self._reader, daemon=True).start()

    def send(self, cmd, payload=b""):
        self.sock.sendall(build_frame(cmd, payload))

    def _reader(self):
        buf = b""
        while True:
            buf += self.sock.recv(270)
            while len(buf) >= 8:
                if buf[0] != 0xFF:
                    buf = buf[buf.index(0xFF):]   # resync
                    continue
                plen = buf[3]
                flags = buf[2]
                total = 8 + plen + (flags & 1)
                if len(buf) < total:
                    break
                pkt = buf[:total]
                buf = buf[total:]
                self.on_packet(pkt)

    def on_packet(self, raw):
        cmd  = ((raw[6] << 8) | raw[7]) & 0x7FFF
        ack  = bool(raw[6] & 0x80)
        data = raw[8 : 8 + raw[3]]
        print(f"{'ACK' if ack else 'EVT'} cmd={cmd} data={data.hex()}")
```
