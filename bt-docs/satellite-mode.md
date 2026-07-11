# Satellite Mode — Implementation Guide

The N76 supports a dedicated satellite mode that:
1. Sets the radio to a satellite's Doppler-corrected uplink/downlink frequencies
2. Displays satellite name, azimuth, elevation, and next-pass countdown on the radio
3. Automatically updates frequencies as the satellite moves

Commands used:
- `FREQ_MODE_SET_PAR`  (ordinal 35) — set frequencies with satellite VFO mode
- `SET_SATELLITE_INFO` (ordinal 77) — push name, azimuth, elevation, range, pass time
- `FREQ_MODE_GET_STATUS` (ordinal 36) — poll current frequency (can be used to verify)

---

## Overview sequence

```
1. Get TLE for the target satellite
2. Compute satellite position and velocity for current time
3. Compute Doppler-corrected RX and TX frequencies
4. Compute azimuth, elevation, slant range, orbital altitude
5. Compute next-pass start time (or current pass end time)
6. Send FREQ_MODE_SET_PAR with SATELLITE mode (mode=10)
7. Send SET_SATELLITE_INFO with position/name data
8. Repeat steps 2–7 every 500 ms while the satellite is visible
9. When pass ends: send FREQ_MODE_SET_PAR with MODE_OFF (mode=0)
```

---

## Step 1 — TLE acquisition

Download TLEs from Celestrak or Space-Track:
```
https://celestrak.org/SOCRATES/query.php?CATNR=<NORAD_ID>
```

Example TLE for SO-50 (NORAD 27607):
```
SO-50
1 27607U 02058C   24001.50000000  .00000000  00000-0  00000-0 0  9995
2 27607  64.5680 123.4560 0098765  12.3456 347.8901 14.74567890 12345
```

---

## Step 2 — Orbit propagation

Use an SGP4/SDP4 library:

**Python** — install `pyorbital` or `sgp4`:
```python
from sgp4.api import Satrec, jday
from datetime import datetime, timezone
import math

tle1 = "1 27607U ..."
tle2 = "2 27607 ..."
sat = Satrec.twoline2rv(tle1, tle2)

def get_sat_state(dt: datetime):
    """Returns (position_km_ECI, velocity_km_s_ECI) at datetime dt."""
    jd, fr = jday(dt.year, dt.month, dt.day,
                  dt.hour, dt.minute, dt.second + dt.microsecond/1e6)
    e, r, v = sat.sgp4(jd, fr)
    if e != 0:
        raise RuntimeError(f"SGP4 error {e}")
    return r, v   # km, km/s in ECI (TEME) frame
```

---

## Step 3 — Doppler correction

The formula used by the N76 app:

```
dH = range_rate_m_s / 299_792_458.0   (v/c ratio; negative when approaching)

rx_corrected = rx_nominal + int(rx_nominal * (-dH))
             = rx_nominal * (1 + v/c)    ← signal arrives blueshifted when approaching

tx_corrected = tx_nominal + int(tx_nominal * dH)
             = tx_nominal * (1 - v/c)    ← transmit lower so satellite hears correct freq
```

Where `range_rate_m_s` is the rate of change of slant range in m/s:
- **Negative** when satellite is approaching (range decreasing)
- **Positive** when satellite is receding

```python
import numpy as np

EARTH_RADIUS_KM = 6371.0
C_M_S = 299_792_458.0

def observer_ecef(lat_deg, lon_deg, alt_m=0):
    """Observer position in ECEF (km)."""
    lat = math.radians(lat_deg)
    lon = math.radians(lon_deg)
    r = EARTH_RADIUS_KM + alt_m / 1000.0
    return np.array([
        r * math.cos(lat) * math.cos(lon),
        r * math.cos(lat) * math.sin(lon),
        r * math.sin(lat)
    ])

def doppler_shift(sat_pos_km, sat_vel_km_s, obs_km):
    """Compute range rate in m/s (+ve = receding, -ve = approaching)."""
    rel_pos = sat_pos_km - obs_km          # vector from obs to sat (km)
    dist    = np.linalg.norm(rel_pos)
    if dist < 1e-9:
        return 0.0
    unit_r  = rel_pos / dist
    # sat_vel is in ECI; observer is approximately stationary over 500 ms
    range_rate_km_s = np.dot(sat_vel_km_s, unit_r)
    return range_rate_km_s * 1000.0        # m/s

def apply_doppler(rx_hz, tx_hz, range_rate_m_s):
    dH = range_rate_m_s / C_M_S
    rx_corr = rx_hz + int(rx_hz * (-dH))
    tx_corr = tx_hz + int(tx_hz *   dH)
    return rx_corr, tx_corr
```

Full example:
```python
from datetime import datetime, timezone

obs = observer_ecef(37.7749, -122.4194, 50)   # San Francisco, 50 m altitude

dt  = datetime.now(timezone.utc)
pos, vel = get_sat_state(dt)                   # ECI (TEME frame, km, km/s)

rr = doppler_shift(np.array(pos), np.array(vel), obs)

RX_NOMINAL = 436_795_000   # Hz — satellite downlink
TX_NOMINAL = 145_850_000   # Hz — satellite uplink

rx_corr, tx_corr = apply_doppler(RX_NOMINAL, TX_NOMINAL, rr)
```

---

## Step 4 — Azimuth, elevation, slant range

```python
def azel_range(sat_pos_km, obs_km, lat_deg, lon_deg):
    """
    Returns (azimuth_deg, elevation_deg, range_km, orbital_altitude_km).
    sat_pos_km: ECI position (TEME frame). obs_km: ECEF position.
    Note: for a proper implementation, convert TEME→ECEF first.
    This simplified version ignores Earth rotation for short time spans.
    """
    rel = sat_pos_km - obs_km             # very rough (TEME ≈ ECEF for short dt)
    range_km = np.linalg.norm(rel)

    lat = math.radians(lat_deg)
    lon = math.radians(lon_deg)

    # Local SEZ (south-east-zenith) frame
    sin_lat, cos_lat = math.sin(lat), math.cos(lat)
    sin_lon, cos_lon = math.sin(lon), math.cos(lon)

    S =  sin_lat*cos_lon*rel[0] + sin_lat*sin_lon*rel[1] - cos_lat*rel[2]
    E = -sin_lon          *rel[0] + cos_lon          *rel[1]
    Z =  cos_lat*cos_lon*rel[0] + cos_lat*sin_lon*rel[1] + sin_lat*rel[2]

    elevation_rad = math.asin(Z / range_km)
    azimuth_rad   = math.atan2(E, -S)

    elevation_deg = math.degrees(elevation_rad)
    azimuth_deg   = (math.degrees(azimuth_rad) + 360) % 360

    orbital_alt_km = np.linalg.norm(sat_pos_km) - EARTH_RADIUS_KM

    return azimuth_deg, elevation_deg, range_km, orbital_alt_km
```

---

## Step 5 — Next pass time

Use a propagator to scan forward in time (up to 24 h ahead) in 60-second steps,
checking when elevation first rises above minimum threshold (default 5°):

```python
import time as time_module

def next_pass(sat, obs_km, lat_deg, lon_deg,
              min_elevation_deg=5.0, max_look_ahead_s=86400):
    """Returns (aos_unix_ms, los_unix_ms) or (None, None) if no pass found."""
    now = time_module.time()
    step = 60.0   # seconds
    visible = False
    aos = None

    for t in range(0, int(max_look_ahead_s), int(step)):
        dt = datetime.fromtimestamp(now + t, tz=timezone.utc)
        pos, vel = get_sat_state(dt)
        _, el, _, _ = azel_range(np.array(pos), obs_km, lat_deg, lon_deg)

        if not visible and el >= min_elevation_deg:
            visible = True
            aos = now + t
        elif visible and el < min_elevation_deg:
            los = now + t
            return int(aos * 1000), int(los * 1000)   # milliseconds

    return None, None
```

---

## Step 6 — Build `FREQ_MODE_SET_PAR` for satellite mode

Use mode ordinal **10** (`SATELLITE`) and apply Doppler-corrected frequencies:

```python
from frequency_mode import build_freq_mode_set   # see frequency-mode.md

payload = build_freq_mode_set(
    rx_hz = rx_corr,
    tx_hz = tx_corr,
    mode  = 10,      # SATELLITE
    rx_ctcss = 0,
    tx_ctcss = 0,
    tx_power_high = True,
)
send_command(sock, 35, payload)
```

---

## Step 7 — Build `SET_SATELLITE_INFO` payload (ordinal 77)

The payload is exactly **30 bytes**:

```
Byte range  Bits  Field            Encoding
──────────  ────  ───────────────  ─────────────────────────────────────────────────
   0–19     160   name             Satellite name, GB2312 encoded, zero-padded to 20 bytes
  20–21.1     9   azimuth          Integer degrees 0–360 (clamp at 360)
  21.1–21.9   7   reserved         Write 0
  22          8   elevation        Integer degrees 0–90
  23          8   reserved         Write 0
  24–25      16   distance_km      Slant range in km (0–65535; 0 if > 65535)
  26–27      16   orbital_alt_km   Orbital altitude in km (0–65535; 0 if > 65535)
  28–29      16   next_pass_s      Seconds until next AOS (or until current LOS)
                                   65535 = unknown / no pass in next 24 h
```

The name and the bitfield are in the same 30-byte buffer. The name occupies the first
20 bytes (bits 0–159). The telemetry fields start at bit 160.

```python
import struct

def build_satellite_info(name: str,
                         azimuth_deg: float,
                         elevation_deg: float,
                         range_km: float,
                         orbital_alt_km: float,
                         next_pass_ms: int | None) -> bytes:
    buf = bytearray(30)

    # Name: encode as GB2312 (or UTF-8 fallback), truncate to fit 20 bytes
    try:
        name_bytes = name.encode("gb2312")
    except Exception:
        name_bytes = name.encode("utf-8", errors="replace")
    name_bytes = name_bytes[:20]
    buf[0:len(name_bytes)] = name_bytes

    # Telemetry fields packed into bytes 20–29
    az  = max(0, min(511, int(azimuth_deg)))         # 9 bits
    el  = max(0, min(255, int(elevation_deg)))        # 8 bits
    dist= max(0, min(65535, int(range_km)))           # 16 bits
    alt = max(0, min(65535, int(orbital_alt_km)))     # 16 bits

    if next_pass_ms is None:
        pass_s = 65535
    else:
        now_ms = int(__import__("time").time() * 1000)
        remaining_ms = next_pass_ms - now_ms
        if remaining_ms <= 0:
            pass_s = 0
        else:
            pass_s = min(65534, remaining_ms // 1000)

    # Pack bits 160–239 (bytes 20–29) with the bitfield
    # Bit 160 = LSB of azimuth; bit 0 within byte 20
    # We need to write:
    #   9 bits: azimuth (bits 160–168, i.e. byte 20 bits 0–7 + byte 21 bit 0)
    #   7 bits: reserved (bits 169–175, i.e. byte 21 bits 1–7)
    #   8 bits: elevation (bits 176–183, i.e. byte 22)
    #   8 bits: reserved (bits 184–191, i.e. byte 23)
    #  16 bits: distance_km (bits 192–207, i.e. bytes 24–25)
    #  16 bits: orbital_alt_km (bits 208–223, i.e. bytes 26–27)
    #  16 bits: next_pass_s (bits 224–239, i.e. bytes 28–29)

    buf[20] = az & 0xFF
    buf[21] = (az >> 8) & 0x01         # bit 0 = top bit of azimuth; bits 1–7 = 0
    buf[22] = el & 0xFF
    buf[23] = 0
    struct.pack_into(">H", buf, 24, dist)
    struct.pack_into(">H", buf, 26, alt)
    struct.pack_into(">H", buf, 28, pass_s)

    return bytes(buf)
```

Send:
```python
info = build_satellite_info(
    name           = "SO-50",
    azimuth_deg    = azimuth_deg,
    elevation_deg  = elevation_deg,
    range_km       = range_km,
    orbital_alt_km = orbital_alt_km,
    next_pass_ms   = los_ms,          # end of current pass in Unix ms
)
send_command(sock, 77, info)
```

---

## Step 8 — Update loop (500 ms interval)

```python
import time, threading

def satellite_loop(sock, tle1, tle2, rx_nominal, tx_nominal,
                   obs_lat, obs_lon, obs_alt_m=0, min_el=5.0):

    sat  = Satrec.twoline2rv(tle1, tle2)
    obs  = observer_ecef(obs_lat, obs_lon, obs_alt_m)
    name = tle1.strip() if not tle1.startswith("1 ") else "SAT"

    while True:
        dt  = datetime.now(timezone.utc)
        pos, vel = get_sat_state(dt)
        pos_arr  = np.array(pos)
        vel_arr  = np.array(vel)

        az, el, rng_km, orb_km = azel_range(pos_arr, obs, obs_lat, obs_lon)
        rr = doppler_shift(pos_arr, vel_arr, obs)
        rx_c, tx_c = apply_doppler(rx_nominal, tx_nominal, rr)

        _, los_ms = next_pass(sat, obs, obs_lat, obs_lon, min_el)

        # Send frequency update
        freq_payload = build_freq_mode_set(rx_c, tx_c, mode=10 if el >= min_el else 0)
        send_command(sock, 35, freq_payload)

        # Send satellite info display update
        info_payload = build_satellite_info(name, az, el, rng_km, orb_km, los_ms)
        send_command(sock, 77, info_payload)

        time.sleep(0.5)

# Launch in background thread:
t = threading.Thread(target=satellite_loop,
                     args=(sock, tle1, tle2, 436_795_000, 145_850_000,
                           37.7749, -122.4194, 50),
                     daemon=True)
t.start()
```

---

## Minimum elevation threshold

The default minimum elevation for pass calculations is **5.0 degrees**.
This mirrors the app's default (`f6697g = 5.0` in `com.dw.ht.satellite.b`).
It can be changed in the radio's settings menu under satellite preferences.

---

## Enabling satellite mode (firmware capability check)

Satellite mode is only accepted on firmware **≥ v137**.
Retrieve firmware version with `GET_DEV_INFO` (ordinal 4) first.

Firmware ≥ v141 adds an extended `SET_SATELLITE_INFO` payload with additional fields.
The 30-byte format above works on both.
