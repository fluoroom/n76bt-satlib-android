# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build commands

```bash
./gradlew assembleDebug          # debug APK → app/build/outputs/apk/debug/
./gradlew assembleRelease        # signed release APK (requires env vars below)
./gradlew lint                   # static analysis
./gradlew clean                  # wipe build outputs
```

Release signing reads four environment variables that match `app/build.gradle`'s `signingConfigs.release`:

```
KEYSTORE_PATH   absolute path to the .jks file
STORE_PASSWORD  keystore password
KEY_ALIAS       key alias inside the keystore
KEY_PASSWORD    key password
```

There are no unit or instrumentation tests.

## Architecture

Five Kotlin files, no third-party runtime dependencies beyond AndroidX.

```
MainActivity        UI only — configures and starts/stops BridgeService via Intent
BridgeService       Foreground service; owns the poll loop and coordinates the other two
SatlibClient        HTTP GET http://host:port/ → parses JSON → SatlibData
N76Bluetooth        Bluetooth Classic RFCOMM; tries SPP UUID → GAIA UUID → reflection ch1
N76Protocol         Builds raw GAIA byte packets; no I/O
```

**Data flow:** `BridgeService` schedules `SatlibClient.poll()` with `ScheduledExecutorService.scheduleWithFixedDelay`, then calls `N76Protocol` to build packets and `N76Bluetooth.send()` to transmit them. Each poll triggers one BT send cycle; the interval is user-configurable (250–3000 ms in 250 ms steps).

## Protocol details worth knowing

**satlib JSON quirk:** the RX tone field is `ctcsRxToneHz` (one 's'), while TX is `ctcssTxToneHz` (two 's'). `SatlibClient` maps both to double-s Kotlin fields.

**N76 subtone encoding:** CTCSS Hz × 100 (67.0 Hz → 6700). DCS codes are passed as raw integers. Satlib only emits CTCSS Hz, so the multiply-by-100 path is always used.

**Two firmware variants** (selected by the "Satellite firmware" checkbox):
- `satFirmware = true` (fw ≥ 137): 16-byte payload, mode = SATELLITE (10), enableFreqMode = false
- `satFirmware = false` (fw < 137): 14-byte payload, mode = EXACT (3), enableFreqMode = true

**AOS time:** satlib returns Unix milliseconds; `N76Protocol.buildSatelliteInfo` expects seconds-from-now (0–65534; 65535 = unknown). `BridgeService` does the conversion: `((aosTime - now) / 1000).coerceIn(0, 65534)`.

## Releases

Pushing a `v*` tag triggers `.github/workflows/release.yml`, which builds a signed APK and publishes it as a GitHub Release. Four repository secrets must exist: `KEYSTORE_BASE64`, `STORE_PASSWORD`, `KEY_ALIAS`, `KEY_PASSWORD`.
