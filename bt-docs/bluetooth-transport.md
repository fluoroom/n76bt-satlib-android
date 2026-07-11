# Bluetooth Transport — Implementation Guide

How to open and maintain a connection to the N76.

---

## 1. Transport options

The N76 exposes three Bluetooth interfaces. Choose one:

| Transport | When to use |
|---|---|
| **Classic RFCOMM / SPP** | Simplest; works from any OS with RFCOMM support |
| **Classic RFCOMM / GAIA** | Same as SPP but uses a GAIA-specific service UUID |
| **BLE GATT** | When the device is only advertising BLE |
| **BLE FFE0** | Only for external PTT button accessories; carries no radio commands |

---

## 2. Bluetooth Classic RFCOMM

### Step 1 — Pair the device

Pair the N76 with your host system using the standard Bluetooth pairing procedure.
Default PIN is typically `0000` or `1234`.

### Step 2 — Open an RFCOMM socket

Connect using **one** of these service UUIDs:

```
SPP  profile:  00001101-0000-1000-8000-00805F9B34FB
GAIA profile:  00001107-D102-11E1-9B23-00025B00A5A5
```

Both UUIDs result in a raw bidirectional byte stream.
The GAIA UUID is the preferred one — the radio listens on both.

**Python example:**
```python
import bluetooth

addr = "AA:BB:CC:DD:EE:FF"            # N76 MAC address
SPP_UUID  = "00001101-0000-1000-8000-00805F9B34FB"
GAIA_UUID = "00001107-D102-11E1-9B23-00025B00A5A5"

service = bluetooth.find_service(uuid=GAIA_UUID, address=addr)
port = service[0]["port"] if service else 1    # fallback: RFCOMM channel 1

sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
sock.connect((addr, port))
sock.settimeout(5.0)
```

**Linux rfcomm / PyBluez alternative (channel 1 hardcoded):**
```bash
rfcomm connect /dev/rfcomm0 AA:BB:CC:DD:EE:FF 1
```

### Step 3 — Stream handling

The socket is a **raw byte stream**; you must implement GAIA framing yourself.
See [gaia-protocol.md](gaia-protocol.md) for the framing specification.

Recommended approach: run a background reader thread that continuously calls
`recv(270)` and feeds bytes into a state-machine parser.

### Step 4 — Keep-alive

The N76 does not send periodic keep-alives. The host should poll with
`READ_STATUS` (ordinal 5) or `FREQ_MODE_GET_STATUS` (ordinal 36) every 5–10 s
to detect silent disconnections.

---

## 3. BLE GATT transport

Use this when the Classic BT link is unavailable or when implementing an iOS client
(iOS restricts RFCOMM access).

### Service / characteristic layout

```
Service:          00001100-d102-11e1-9b23-00025b00a5a5

  TX characteristic   00001101-d102-11e1-9b23-00025b00a5a5
      Properties: WRITE | WRITE_WITHOUT_RESPONSE
      Purpose:    Host → Radio commands

  RX characteristic   00001102-d102-11e1-9b23-00025b00a5a5
      Properties: NOTIFY | INDICATE
      Purpose:    Radio → Host events / responses

  CCCD descriptor     00002902-0000-1000-8000-00805f9b34fb
      Write 0x0100 (little-endian) to enable NOTIFY
      Write 0x0200 (little-endian) to enable INDICATE
      (choose based on characteristic properties bit 4)
```

### Connection sequence

```
1. Scan for device by name prefix or known MAC
2. Connect GATT (use TRANSPORT_LE if on Android)
3. Discover services
4. Locate service 00001100-d102-…
5. Get TX characteristic (00001101-…) and RX characteristic (00001102-…)
6. Enable notifications on RX: write ENABLE_NOTIFICATION_VALUE to CCCD
7. Wait 200 ms (radio needs time after CCCD write before accepting commands)
8. Begin sending commands on TX characteristic
```

**BLE packet format** is a stripped 4-byte header — see [gaia-protocol.md § BLE format](gaia-protocol.md).

### Write queue

BLE characteristics are not pipelined. You must wait for `onCharacteristicWrite`
callback (status = 0 = SUCCESS) before sending the next packet.
Implement a FIFO queue with a 10 ms timeout between retries.

---

## 4. BLE PTT button accessory (FFE0)

This is a **separate** BLE connection used only for physical PTT pedals / desk mics.
It carries no GAIA commands.

```
Service:          0000ffe0-0000-1000-8000-00805f9b34fb

  PTT characteristic  0000ffe1-0000-1000-8000-00805f9b34fb
      Properties: NOTIFY | READ
      Purpose:    Reports PTT state (pressed / released)

  CCCD descriptor     00002902-0000-1000-8000-00805f9b34fb
      Write ENABLE_NOTIFICATION_VALUE (0x01, 0x00)
```

### PTT value decoding

Read or receive notification on `FFE1`:
```
byte[0] = 0x00  →  PTT released
byte[0] != 0x00 →  PTT pressed
```

Poll with `readCharacteristic` every 500 ms if notifications are not received
(some accessories do not push changes).

### Auto-reconnect policy

The accessory disconnects if idle too long. Reconnect automatically:
- Set `autoConnect = true` in `connectGatt`
- If no BLE event received within 4 s after writing CCCD: close GATT and reconnect
- If no BLE event within 8 s after `discoverServices`: close GATT and reconnect
- If connection drops without explicit close: attempt reconnect after 30 s

---

## 5. Connection state machine

Implement these states:

```
IDLE  ──connect()──►  CONNECTING  ──success──►  CONNECTED
                                  ──failure──►  IDLE

CONNECTED  ──send data──►  SENDING  ──ack──►  CONNECTED
           ──disconnect()──►  IDLE
           ──link drop──►  INTERRUPTED  ──reconnect──►  CONNECTING

SENDING  ──timeout──►  CONNECTED   (cancel TX; log TxTimeout)
```

Error reasons your implementation should track:

| Reason | Cause |
|---|---|
| `TxTimeout`         | No TX-complete ACK within ~10 s |
| `NotInChannel`      | Radio not on a programmable channel |
| `LinkInterrupted`   | Bluetooth dropped mid-transmission |
| `ChannelIsOccupied` | Carrier detected before TX |
| `Unauthenticated`   | Radio rejected connection (wrong device) |
