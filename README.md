# N76 BT Link

Android bridge app that polls a [satlib](https://github.com/fluoroom/satlib) server and relays Doppler-corrected frequencies, CTCSS tones, and satellite position data to an N76 satellite radio over Bluetooth Classic.

```
[Look4Sat / tracker] ──satlib HTTP──> [this app] ──Bluetooth GAIA──> [N76 radio]
```

## Requirements

- Android 8.0+ (API 26)
- N76 radio paired over Bluetooth
- A device running a satlib-compatible server (e.g. a PC running Look4Sat with the satlib plugin) reachable on the local network

## Usage

1. Install the APK and open the app.
2. **Bluetooth Device** — select your paired N76 from the spinner.
3. **satlib Connection** — enter the IP and port of the satlib server (default port: `4534`).
4. **Poll Interval** — how often to query satlib and update the radio (250–3000 ms, default 1000 ms). Satlib updates internally at 1 Hz, so intervals below 1000 ms give lower latency at no extra data cost.
5. Configure radio options (see below), then tap **Start**.

The app runs as a foreground service. Tap **Stop** in the notification or in the app to disconnect.

## Options

| Option | Default | Notes |
|---|---|---|
| Host / IP | `192.168.1.1` | satlib server address |
| Port | `4534` | satlib server port |
| Poll Interval | `1000 ms` | 250–3000 ms in 250 ms steps |
| Satellite firmware (fw ≥ 137) | ✓ | Enables SATELLITE mode packet (16-byte). Uncheck for older firmware (EXACT mode, 14-byte) |
| Send satellite info (fw ≥ 141) | ✓ | Sends name, azimuth, elevation, distance, AOS to the radio display |
| Force RX CTCSS = none | ☐ | Ignores the `ctcsRxToneHz` field from satlib; sends tone = 0 |
| Force TX CTCSS = none | ☐ | Ignores the `ctcssTxToneHz` field from satlib; sends tone = 0 |

## Building from source

```bash
git clone git@github.com:fluoroom/n76bt-satlib-android.git
cd n76bt-satlib-android
./gradlew assembleDebug
# APK: app/build/outputs/apk/debug/app-debug.apk
```

Java 17 is required by the Android Gradle Plugin (the app itself targets JVM 1.8).

### Signed release build

```bash
export KEYSTORE_PATH=/path/to/n76btlink.keystore
export STORE_PASSWORD=...
export KEY_ALIAS=n76btlink
export KEY_PASSWORD=...
./gradlew assembleRelease
```

## Releases

Pushing a version tag triggers an automated GitHub Actions build that produces a signed APK and publishes it as a GitHub Release:

```bash
git tag v1.0.0
git push origin main --tags
```

The release APK is named `n76btlink-v1.0.0.apk`.

## Bluetooth connection

The app tries three connection methods in order:
1. SPP UUID (`00001101-…`) — standard Serial Port Profile
2. GAIA UUID (`00001107-…`) — Qualcomm GAIA, used by some N76 firmware
3. Insecure RFCOMM on channel 1 (reflection fallback)

It reconnects automatically on write errors.

## License

MIT
