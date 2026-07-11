# N76BT-satlib-android

Android bridge app that polls a [satlib](https://github.com/fluoroom/satlib) server and relays Doppler-corrected frequencies, CTCSS tones, and satellite position data to an N76 satellite radio over Bluetooth Classic. Also supports receiving RX audio from the radio, PTT control, and recording.

```
[Look4Sat / tracker] ──satlib HTTP──> [this app] ──Bluetooth GAIA──> [N76 radio]
                                            ↑  ←──── SBC audio ────── [N76 radio]
```

| This App | [Look4Sat-satlib](https://github.com/fluoroom/Look4Sat-satlib) | Radio Sat Mode |
|---|---|---|
| ![Screenshot](/images/screenshot.png) | [![Look4Sat](/images/look4sat.png)](https://github.com/fluoroom/Look4Sat-satlib) | ![Radio Img Example 1](/images/imgradio1.png) |

Everything working: Frequencies, subtones, compass and gyroscope correction, distances, AOS (if not in sight), RX audio receive, PTT, recording.

## Requirements

- Android 8.0+ (API 26)
- N76 / UV-PRO radio paired over Bluetooth
- A device running a satlib-compatible server (e.g. [Look4Sat-satlib](https://github.com/fluoroom/Look4Sat-satlib)) reachable on the local network

## Usage

1. Install the APK and open the app.
2. **Bluetooth Device** — select your paired N76 from the spinner.
3. **satlib Connection** — enter the IP and port of the satlib server (default port: `4534`).
4. **Poll Interval** — how often to query satlib and update the radio (250–3000 ms, default 500 ms). Satlib updates internally at 1 Hz, so intervals below 1000 ms give lower latency at no extra data cost.
5. Configure radio and audio options (see below), then tap **Start**.

The app runs as a foreground service. Tap **Stop** in the notification or in the app to disconnect.

## Options

### Radio

| Option | Default | Notes |
|---|---|---|
| Host / IP | `192.168.1.1` | satlib server address |
| Port | `4534` | satlib server port |
| Poll Interval | `500 ms` | 250–3000 ms in 250 ms steps |
| Send sat. info & freq to radio (HT satellite mode) | ✓ | Sends Doppler-corrected frequencies, subtones, name, azimuth, elevation, distance, and AOS. Uncheck to use audio-only mode (PTT / recording without satellite tracking) |
| Force RX CTCSS | ☐ + spinner | When checked, overrides the satlib RX tone with the selected value (none or any standard CTCSS frequency) |
| Force TX CTCSS | ☐ + spinner | When checked, overrides the satlib TX tone with the selected value |

### Audio

| Option | Default | Notes |
|---|---|---|
| Receive RX audio via RFCOMM (digimodes) | ☐ | Connects a second RFCOMM channel to the radio, receives HDLC-framed SBC audio, and decodes it in real time. Required for HT audio recording. Reconnects automatically while the bridge is running |
| (digimodes) Speaker Monitor | OFF | Toggle to route incoming RX audio to the phone speaker |
| PTT (hold) | — | Hold to transmit via GAIA PTT commands |
| Record HT audio | ☐ | Records decoded RX audio from the radio (requires *Receive RX audio* enabled) |
| Record phone mic | ☐ | Records the phone microphone |
| Record only during satellite track | ☐ | Automatically starts/stops recording when a satellite track begins/ends; one file per track |
| Audio output folder | (app media folder) | SAF folder picker for saving recordings; selection persists across restarts |

Recording filenames follow the pattern `YYYY-MM-DD-HH-mm-ss[-satname]-{ht\|mic}.{ogg\|wav}`. The satellite name is included when a track is active; omitted otherwise.

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
git tag v1.0.6
git push origin main --tags
```

The release APK is named `n76btlink-v1.0.6.apk`.

## Bluetooth connection

The app opens up to two RFCOMM connections simultaneously:

**GAIA command channel** — tried in order:
1. SPP UUID (`00001101-…`) — standard Serial Port Profile
2. GAIA UUID (`00001107-…`) — Qualcomm GAIA, used by some N76 firmware
3. Insecure RFCOMM on channel 1 (reflection fallback)

**Audio channel** (when *Receive RX audio* is enabled) — connects to the radio's dedicated audio UUID (`00004315-…`), receives HDLC-framed SBC audio, and decodes it using a native SBC decoder.

Both channels reconnect automatically on errors.

## License

MIT
