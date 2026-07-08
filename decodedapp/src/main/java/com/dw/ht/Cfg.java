package com.dw.ht;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.benshikj.ht.R;
import com.facebook.stetho.dumpapp.Framer;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.msgpack.core.MessagePack;
import v4.l1;
import w5.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class Cfg {
    private static Settings A = null;
    public static final byte[] B;
    public static final int C;
    public static int D = 0;
    public static int E = 0;
    public static int F = 0;
    public static boolean G = false;
    private static SharedPreferences H = null;
    private static int I = 0;
    private static String J = null;
    private static y5.f K = null;
    private static c.a L = null;
    public static long M = 0;
    private static boolean N = false;
    private static String O = null;
    private static boolean P = false;
    private static boolean Q = false;
    private static String R = null;
    private static char[] S = null;
    private static int T = 0;
    private static long U = 0;
    private static boolean V = false;
    private static boolean W = false;
    private static int X = 0;
    private static String Y = null;
    private static String Z = null;

    /* JADX INFO: renamed from: a */
    public static boolean f5476a = false;

    /* JADX INFO: renamed from: a0 */
    private static boolean f5477a0 = false;

    /* JADX INFO: renamed from: b */
    public static boolean f5478b = false;

    /* JADX INFO: renamed from: b0 */
    private static boolean f5479b0 = false;

    /* JADX INFO: renamed from: c */
    public static boolean f5480c = false;

    /* JADX INFO: renamed from: c0 */
    private static int f5481c0 = 0;

    /* JADX INFO: renamed from: d */
    public static final boolean f5482d = false;

    /* JADX INFO: renamed from: d0 */
    private static boolean f5483d0 = false;

    /* JADX INFO: renamed from: e */
    public static boolean f5484e = false;

    /* JADX INFO: renamed from: e0 */
    private static int f5485e0 = 0;

    /* JADX INFO: renamed from: f */
    public static boolean f5486f = false;

    /* JADX INFO: renamed from: f0 */
    private static final Object f5487f0;

    /* JADX INFO: renamed from: g */
    public static boolean f5488g = false;

    /* JADX INFO: renamed from: g0 */
    private static int f5489g0 = 0;

    /* JADX INFO: renamed from: h */
    public static boolean f5490h = true;

    /* JADX INFO: renamed from: h0 */
    private static int f5491h0 = 0;

    /* JADX INFO: renamed from: i */
    public static boolean f5492i = false;

    /* JADX INFO: renamed from: i0 */
    private static int f5493i0 = 0;

    /* JADX INFO: renamed from: j */
    public static int f5494j = 48000;

    /* JADX INFO: renamed from: j0 */
    private static int f5495j0 = 0;

    /* JADX INFO: renamed from: k */
    public static int f5496k = (48000 / CloseCodes.NORMAL_CLOSURE) * 20;

    /* JADX INFO: renamed from: k0 */
    private static int f5497k0 = 0;

    /* JADX INFO: renamed from: l */
    public static int f5498l = 48000;

    /* JADX INFO: renamed from: l0 */
    private static float f5499l0;

    /* JADX INFO: renamed from: m */
    public static int f5500m;

    /* JADX INFO: renamed from: m0 */
    private static boolean f5501m0;

    /* JADX INFO: renamed from: n */
    public static final File f5502n;

    /* JADX INFO: renamed from: n0 */
    private static final HashSet f5503n0;

    /* JADX INFO: renamed from: o */
    public static File f5504o;

    /* JADX INFO: renamed from: o0 */
    private static Long f5505o0;

    /* JADX INFO: renamed from: p */
    public static File f5506p;

    /* JADX INFO: renamed from: q */
    public static File f5507q;

    /* JADX INFO: renamed from: r */
    public static File f5508r;

    /* JADX INFO: renamed from: s */
    public static File f5509s;

    /* JADX INFO: renamed from: t */
    private static z4.j f5510t;

    /* JADX INFO: renamed from: u */
    public static boolean f5511u;

    /* JADX INFO: renamed from: v */
    private static boolean f5512v;

    /* JADX INFO: renamed from: w */
    public static int f5513w;

    /* JADX INFO: renamed from: x */
    public static int f5514x;

    /* JADX INFO: renamed from: y */
    public static float f5515y;

    /* JADX INFO: renamed from: z */
    public static float f5516z;

    @Keep
    public static class Settings {
        public static final int LOCATION_SOURCE_SELECT = 1;
        public static final int LOCATION_SOURCE_SYSTEM = 0;
        private double aprsCoordinateLatitude;
        private double aprsCoordinateLongitude;
        private transient Location aprsLocation;
        public boolean audioOutputAGC;
        public boolean audioOutputNS;
        private int audioStorageDays;
        public String bearer;
        public String dataPath;
        private Boolean imperialUnits;
        private String language;
        public long lastDeviceID;
        public long lastIIChanelID;
        public float[] orientationOffset;
        private boolean pttLock;
        public boolean recordingTrack;
        private boolean showSpaceStation;
        public boolean testUseLocalServer;
        private boolean simpleUI = false;
        private boolean simpleUIBind = false;
        public boolean runAtSystemStartup = false;
        public boolean jfTestMode = false;
        private boolean sendStartTone = true;
        private boolean sendStopTone = true;
        private boolean showAmateurRadioSatellite = false;
        public boolean morseCodeAddCT = true;
        public boolean morseCodeAddSK = true;
        private int regionChannelCount = 16;
        private int aprsLocationSource = 0;
        private boolean muteNoSave = false;
        private boolean freqScanAutoScan = true;
        private boolean showBCLOInChannelEditor = false;
        private int ignoreAppVersionCode = 0;
        private boolean showFloatIntercomStatus = false;
        private boolean showFloatPTT = false;
        private int satelliteMinElevationAngle = 5;

        public Settings() {
            this.showSpaceStation = true;
            this.audioStorageDays = -1;
            if (Cfg.f5482d) {
                this.showSpaceStation = true;
                this.audioStorageDays = 30;
            }
        }

        public Location getAprsLocation() {
            Location location = this.aprsLocation;
            if (location != null) {
                return location;
            }
            if (this.aprsCoordinateLongitude == 0.0d && this.aprsCoordinateLatitude == 0.0d) {
                return null;
            }
            Location location2 = new Location("");
            location2.setLatitude(this.aprsCoordinateLatitude);
            location2.setLongitude(this.aprsCoordinateLongitude);
            this.aprsLocation = location2;
            return location2;
        }

        public int getAprsLocationSource() {
            return this.aprsLocationSource;
        }

        public int getAudioStorageDays() {
            return this.audioStorageDays;
        }

        public int getIgnoreAppVersionCode() {
            return this.ignoreAppVersionCode;
        }

        public boolean getImperialUnits() {
            if (this.imperialUnits == null) {
                this.imperialUnits = Boolean.valueOf(Main.f5555g.getResources().getBoolean(R.bool.imperial_units));
            }
            return this.imperialUnits.booleanValue();
        }

        public String getLanguage() {
            return TextUtils.isEmpty(this.language) ? "default" : this.language;
        }

        public i0.f getLocaleList() {
            if (TextUtils.isEmpty(this.language) || "default".equals(this.language)) {
                return i0.f.e();
            }
            String[] strArrSplit = this.language.split("_");
            return i0.f.a(strArrSplit.length > 1 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(this.language));
        }

        public boolean getPttLock() {
            return this.pttLock;
        }

        public String getRPCServerUrl() {
            return this.testUseLocalServer ? "192.168.123.9:800" : "rpc.benshikj.com:800";
        }

        public int getRegionChannelCount() {
            return this.regionChannelCount;
        }

        public int getSatelliteMinElevationAngle() {
            return this.satelliteMinElevationAngle;
        }

        public boolean getSendStartTone() {
            return this.sendStartTone;
        }

        public boolean getSendStopTone() {
            return this.sendStopTone;
        }

        public boolean getShowBCLOInChannelEditor() {
            return this.showBCLOInChannelEditor;
        }

        public boolean getSimpleUI() {
            return this.simpleUI;
        }

        public boolean getSimpleUIBind() {
            return this.simpleUIBind;
        }

        public boolean isFreqScanAutoScan() {
            return this.freqScanAutoScan;
        }

        public boolean isMuteNoSave() {
            return this.muteNoSave;
        }

        public boolean isShowAmateurRadioSatellite() {
            return this.showAmateurRadioSatellite;
        }

        public boolean isShowFloatIntercomStatus() {
            return this.showFloatIntercomStatus;
        }

        public boolean isShowFloatPTT() {
            return this.showFloatPTT;
        }

        public boolean isShowSatellite() {
            return this.showAmateurRadioSatellite || this.showSpaceStation;
        }

        public boolean isShowSpaceStation() {
            return this.showSpaceStation;
        }

        public void setAprsLocation(Location location) {
            this.aprsLocation = location;
            if (location != null) {
                this.aprsCoordinateLongitude = location.getLongitude();
                this.aprsCoordinateLatitude = location.getLatitude();
            } else {
                this.aprsCoordinateLongitude = 0.0d;
                this.aprsCoordinateLatitude = 0.0d;
            }
            Cfg.n0();
            IGateService.INSTANCE.c(Main.f5555g);
        }

        public void setAprsLocationSource(int i10) {
            if (this.aprsLocationSource == i10) {
                return;
            }
            this.aprsLocationSource = i10;
            Cfg.n0();
            IGateService.INSTANCE.c(Main.f5555g);
        }

        public void setAudioStorageDays(int i10) {
            if (this.audioStorageDays == i10) {
                return;
            }
            this.audioStorageDays = i10;
            Cfg.n0();
            if (i10 > 0) {
                Main.f5555g.m();
            }
        }

        public void setFreqScanAutoScan(boolean z10) {
            if (z10 == this.freqScanAutoScan) {
                return;
            }
            this.freqScanAutoScan = z10;
            Cfg.n0();
        }

        public void setIgnoreAppVersionCode(int i10) {
            if (i10 == this.ignoreAppVersionCode) {
                return;
            }
            this.ignoreAppVersionCode = i10;
            Cfg.n0();
        }

        public void setImperialUnits(boolean z10) {
            Boolean bool = this.imperialUnits;
            if (bool == null || z10 != bool.booleanValue()) {
                this.imperialUnits = Boolean.valueOf(z10);
                Cfg.n0();
                mi.c.e().m(a.ImperialUnitsChanged);
            }
        }

        public void setLanguage(String str) {
            if (a6.q.f(str, this.language)) {
                return;
            }
            this.language = str;
            Cfg.n0();
            androidx.appcompat.app.h.K(getLocaleList());
        }

        public void setMuteNoSave(boolean z10) {
            if (this.muteNoSave == z10) {
                return;
            }
            this.muteNoSave = z10;
            Cfg.n0();
        }

        public void setPttLock(boolean z10) {
            if (z10 == this.pttLock) {
                return;
            }
            this.pttLock = z10;
            Cfg.n0();
            mi.c.e().m(a.PTTLockChanged);
        }

        public void setRegionChannelCount(int i10) {
            if (i10 == this.regionChannelCount) {
                return;
            }
            this.regionChannelCount = i10;
            Cfg.n0();
        }

        public void setSatelliteMinElevationAngle(int i10) {
            if (this.satelliteMinElevationAngle == i10) {
                return;
            }
            this.satelliteMinElevationAngle = i10;
            Cfg.n0();
            com.dw.ht.satellite.b.R(i10);
        }

        public void setSendStartTone(boolean z10) {
            if (this.sendStartTone == z10) {
                return;
            }
            this.sendStartTone = z10;
            Cfg.n0();
        }

        public void setSendStopTone(boolean z10) {
            if (this.sendStopTone == z10) {
                return;
            }
            this.sendStopTone = z10;
            Cfg.n0();
        }

        public void setShowAmateurRadioSatellite(boolean z10) {
            if (this.showAmateurRadioSatellite == z10) {
                return;
            }
            this.showAmateurRadioSatellite = z10;
            mi.c.e().m(a.ShowAmateurRadioSatelliteChanged);
            Cfg.n0();
        }

        public void setShowBCLOInChannelEditor(boolean z10) {
            if (z10 == this.showBCLOInChannelEditor) {
                return;
            }
            this.showBCLOInChannelEditor = z10;
            Cfg.n0();
        }

        public void setShowFloatIntercomStatus(boolean z10) {
            if (this.showFloatIntercomStatus == z10) {
                return;
            }
            this.showFloatIntercomStatus = z10;
            Cfg.n0();
            r4.g.I(Main.f5555g);
        }

        public void setShowFloatPTT(boolean z10) {
            if (this.showFloatPTT == z10) {
                return;
            }
            this.showFloatPTT = z10;
            Cfg.n0();
            r4.r.K(Main.f5555g);
        }

        public void setShowSpaceStation(boolean z10) {
            if (this.showSpaceStation == z10) {
                return;
            }
            this.showSpaceStation = z10;
            mi.c.e().m(a.ShowSpaceStationChanged);
            Cfg.n0();
        }

        public void setSimpleUI(boolean z10) {
            if (z10 == this.simpleUI) {
                return;
            }
            this.simpleUI = z10;
            Cfg.n0();
            mi.c.e().m(a.SimpleUIChanged);
        }

        public void setSimpleUIBind(boolean z10) {
            if (z10 == this.simpleUIBind) {
                return;
            }
            this.simpleUIBind = z10;
            Cfg.n0();
            mi.c.e().m(a.SimpleUIBindChanged);
        }
    }

    public enum a {
        SimpleUIChanged,
        SimpleUIBindChanged,
        PTTLockChanged,
        TrackRecordStatusChanged,
        ImperialUnitsChanged,
        ShowAmateurRadioSatelliteChanged,
        ShowSpaceStationChanged
    }

    static {
        File file = new File(Environment.getExternalStorageDirectory(), "/BS/HT/");
        f5502n = file;
        f5504o = new File(file, "/audio/");
        f5506p = new File(file, "/picture/");
        f5507q = new File(file, "/map/");
        f5510t = z4.j.f32938b;
        f5512v = true;
        f5513w = -1;
        f5514x = 1;
        f5515y = 0.3f;
        f5516z = 20.0f;
        A = new Settings();
        B = new byte[]{-5, -25, 60, -18, -13, MessagePack.Code.INT16, 74, -4, 5, 78, -95, MessagePack.Code.ARRAY32, 7, -17, -76, Framer.ENTER_FRAME_PREFIX, -1, 52, 4, 87};
        G = true;
        if (f5478b) {
            C = 0;
        } else {
            C = 5;
        }
        U = 300000L;
        f5487f0 = new Object();
        f5499l0 = 1.0f;
        f5501m0 = false;
        f5503n0 = new HashSet();
    }

    public static String A() {
        return O;
    }

    public static void A0(boolean z10) {
        if (P == z10) {
            return;
        }
        P = z10;
        H.edit().putBoolean("aprs.igate_rx", z10).apply();
    }

    public static String B() {
        String str = R;
        return str == null ? "" : str;
    }

    public static void B0(String str) {
        if (a6.q.d(R, str)) {
            return;
        }
        R = str;
        H.edit().putString("aprs.server", str).apply();
    }

    public static File C(String str) {
        if (str == null) {
            return null;
        }
        if (f5509s != null) {
            File file = new File(f5509s, str + ".jpg");
            if (file.isFile()) {
                return file;
            }
        }
        if (f5508r != null) {
            File file2 = new File(f5508r, str + ".jpg");
            if (file2.isFile()) {
                return file2;
            }
        }
        return null;
    }

    public static void C0(boolean z10) {
        if (N == z10) {
            return;
        }
        N = z10;
        H.edit().putBoolean("aprs.igate_upload", z10).apply();
    }

    public static int D() {
        return f5493i0;
    }

    public static void D0(boolean z10) {
        if (f5483d0 == z10) {
            return;
        }
        f5483d0 = z10;
        H.edit().putBoolean("view.just_show_starred", z10).apply();
    }

    public static z4.j E() {
        return f5510t;
    }

    public static void E0(boolean z10) {
        if (z10 == f5512v) {
            return;
        }
        f5512v = z10;
        H.edit().putBoolean("view.keep_screen_on", z10).apply();
    }

    public static int F() {
        return f5495j0;
    }

    public static void F0(z4.j jVar) {
        if (f5510t == jVar) {
            return;
        }
        f5510t = jVar;
        H.edit().putString("map.layer", jVar.toString()).apply();
        mi.c.e().m(jVar);
    }

    public static float G() {
        return f5499l0;
    }

    public static void G0(int i10) {
        if (i10 == f5495j0) {
            return;
        }
        f5495j0 = i10;
        H.edit().putInt("audio.mic_gain", i10).apply();
        V0();
    }

    public static c.a H() {
        return L;
    }

    public static void H0(int i10) {
        if (E == i10) {
            return;
        }
        E = i10;
        H.edit().putInt("morse_code.pitch", i10).apply();
    }

    public static File I(long j10) {
        if (f5506p == null) {
            return null;
        }
        if (f5482d) {
            return new File(f5506p, j10 + ".jpg");
        }
        return new File(f5506p, (j10 / 10000) + "/" + (j10 % 10000) + ".jpg");
    }

    public static void I0(int i10) {
        if (D == i10) {
            return;
        }
        D = i10;
        H.edit().putInt("morse_code.speed", i10).apply();
    }

    public static long J() {
        return U;
    }

    public static void J0(boolean z10) {
        if (f5479b0 == z10) {
            return;
        }
        f5479b0 = z10;
        H.edit().putBoolean("aprs.position_report_add_freq", z10).apply();
    }

    public static SharedPreferences K() {
        return H;
    }

    public static void K0(boolean z10) {
        if (f5477a0 == z10) {
            return;
        }
        f5477a0 = z10;
        H.edit().putBoolean("aprs.position_report_add_voltage", z10).apply();
    }

    public static y5.f L() {
        if (K == null) {
            Main main = Main.f5555g;
            K = new y5.f(H, new y5.a(B, main.getPackageName(), Settings.Secure.getString(main.getContentResolver(), "android_id")));
        }
        return K;
    }

    public static void L0(boolean z10) {
        if (V == z10) {
            return;
        }
        V = z10;
        H.edit().putBoolean("aprs.position_report", z10).apply();
        IGateService.INSTANCE.c(Main.f5555g);
    }

    public static int M() {
        l1 l1VarO = v4.u.w().o();
        return l1VarO instanceof v4.c0 ? ((v4.c0) l1VarO).Q.G() : O().getRegionChannelCount();
    }

    public static void M0(long j10) {
        if (j10 < 60000) {
            j10 = 60000;
        }
        if (U == j10) {
            return;
        }
        U = j10;
        H.edit().putLong("aprs.position_report_interval", j10).apply();
        IGateService.INSTANCE.c(Main.f5555g);
    }

    public static int N() {
        int i10 = f5481c0;
        if (i10 < 0 || i10 > 15) {
            return 0;
        }
        return i10;
    }

    public static void N0(int i10) {
        if (i10 < 0 || i10 > 15) {
            i10 = 0;
        }
        if (f5481c0 == i10) {
            return;
        }
        f5481c0 = i10;
        L.u(i10);
        H.edit().putInt("aprs.ssid", i10).apply();
    }

    public static Settings O() {
        return A;
    }

    public static void O0(Settings settings) {
        A = settings;
        n0();
    }

    public static boolean P() {
        return f5501m0;
    }

    public static void P0(int i10) {
        if (i10 == f5493i0) {
            return;
        }
        f5493i0 = i10;
        H.edit().putInt("map.icon_show_time", i10).apply();
    }

    public static int Q() {
        return f5491h0;
    }

    public static void Q0(boolean z10) {
        if (f5501m0 == z10) {
            return;
        }
        f5501m0 = z10;
        H.edit().putBoolean("show_modulation", z10).apply();
    }

    public static int R() {
        return f5489g0;
    }

    public static void R0(int i10) {
        if (i10 == f5491h0) {
            return;
        }
        f5491h0 = i10;
        H.edit().putInt("track.show_time", i10).apply();
    }

    public static boolean S(long j10) {
        File fileN = n(j10);
        return fileN != null && fileN.isFile();
    }

    public static void S0(int i10) {
        if (f5489g0 == i10) {
            return;
        }
        f5489g0 = i10;
        H.edit().putInt("audio_link.vox_start_delay", i10).apply();
    }

    public static boolean T(long j10) {
        File fileI = I(j10);
        return fileI != null && fileI.isFile();
    }

    public static void T0() {
        U0(A.dataPath);
    }

    public static void U(Context context) {
        Resources resources = context.getResources();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        H = defaultSharedPreferences;
        if (f5480c) {
            u0(2, false);
        } else {
            u0(defaultSharedPreferences.getInt("debug_level", 0), false);
        }
        com.google.gson.f fVar = new com.google.gson.f();
        String string = H.getString("settings", "{}");
        try {
            A = (Settings) fVar.j(string, Settings.class);
            s3.b.b("Cfg", string);
        } catch (Exception e10) {
            s3.b.e("Cfg", "解析设置错误", new RuntimeException("错误的设置：" + (string + fVar.s(new Settings())), e10));
        }
        if (A == null) {
            A = new Settings();
            s3.b.d("Cfg", "lost settings");
        }
        if (H.contains("save_audio")) {
            if (!H.getBoolean("save_audio", true)) {
                A.audioStorageDays = 0;
                n0();
            }
            H.edit().remove("save_audio").apply();
        }
        f5501m0 = H.getBoolean("show_modulation", f5501m0);
        I = H.getInt("dev.id", 0);
        J = H.getString("call_sign", null);
        HashSet hashSet = f5503n0;
        hashSet.clear();
        hashSet.addAll(H.getStringSet("call_sign.certified", new HashSet()));
        f5481c0 = H.getInt("aprs.ssid", 0);
        D = H.getInt("morse_code.speed", 20);
        E = H.getInt("morse_code.pitch", 550);
        F = H.getInt("dtmf.speed", 240);
        c.a aVar = new c.a(r(), c.a.EnumC0415a.Repeater, true);
        L = aVar;
        aVar.u(f5481c0);
        f5483d0 = H.getBoolean("view.just_show_starred", false);
        f5512v = H.getBoolean("view.keep_screen_on", f5512v);
        V = H.getBoolean("aprs.position_report", false);
        U = H.getLong("aprs.position_report_interval", 300000L);
        f5477a0 = H.getBoolean("aprs.position_report_add_voltage", false);
        f5479b0 = H.getBoolean("aprs.position_report_add_freq", false);
        Z = H.getString("aprs.position_report_message", "");
        Q = H.getBoolean("aprs.igate_en", true);
        W = H.getBoolean("aprs.igate_down", false);
        N = H.getBoolean("aprs.igate_upload", false);
        P = H.getBoolean("aprs.igate_rx", false);
        X = H.getInt("aprs.distance_filter", CloseCodes.NORMAL_CLOSURE);
        O = H.getString("aprs.igate_passcode", "");
        R = H.getString("aprs.server", "asia.aprs2.net");
        Y = H.getString("aprs.symbol", "/$");
        f5485e0 = H.getInt("aprs.message_id", 0);
        f5489g0 = H.getInt("audio_link.vox_start_delay", 0);
        f5491h0 = H.getInt("track.show_time", 0);
        f5510t = (z4.j) y5.d.e(H, "map.layer", z4.j.f32938b);
        f5495j0 = H.getInt("audio.mic_gain", f5495j0);
        f5497k0 = H.getInt("audio.mic_gain_base", f5497k0);
        V0();
        f5513w = H.getInt("keys.ptt", -1);
        i0(context);
        if (f5482d) {
            f5500m = 7;
            f5488g = true;
            A.showSpaceStation = false;
        }
        f5493i0 = H.getInt("map.icon_show_time", resources.getInteger(R.integer.default_icon_show_time));
        T0();
        g();
    }

    private static void U0(String str) {
        Main main = Main.f5555g;
        if (TextUtils.isEmpty(str)) {
            File file = f5502n;
            file.mkdirs();
            if (!h(file)) {
                file = new File(main.getFilesDir(), "/HT/");
                file.mkdirs();
            }
            Uri.fromFile(file);
            f5504o = new File(file, "/audio/");
            f5506p = new File(file, "/picture/");
            f5507q = new File(file, "/map/");
        }
    }

    public static boolean V() {
        return W(true);
    }

    private static void V0() {
        int i10 = f5495j0 + f5497k0;
        if (i10 != 0) {
            f5499l0 = (float) w3.f.c(i10);
        } else {
            f5499l0 = 1.0f;
        }
    }

    public static boolean W(boolean z10) {
        if (TextUtils.isEmpty(r())) {
            return false;
        }
        if (z10) {
            return true;
        }
        if (TextUtils.isEmpty(A())) {
            return false;
        }
        return a6.q.d(u5.a.p(r()), A());
    }

    public static boolean X(String str) {
        return (str == null || str.toUpperCase().trim().isEmpty()) ? false : true;
    }

    public static boolean Y() {
        return W;
    }

    public static boolean Z() {
        return Q;
    }

    public static boolean a0() {
        return P;
    }

    public static /* synthetic */ boolean b(ArrayList arrayList, File file, String str) {
        File file2 = new File(file, str);
        if (!file2.isDirectory()) {
            return false;
        }
        try {
            long j10 = Long.parseLong(str) * 10000;
            Iterator it = j0(file2, ".jpg").iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((Long) it.next()).longValue() + j10));
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean b0() {
        return N;
    }

    public static void c(String str, String str2) {
        Set<String> setO = o(0, str2);
        if (setO.add(str)) {
            H.edit().putStringSet(str2, setO).apply();
        }
    }

    public static boolean c0() {
        return f5483d0;
    }

    public static void d(String str) {
        if (f5476a) {
            s3.b.b("Cfg", "addBondedDev:" + str);
        }
        Set<String> setP = p(false);
        setP.add(str);
        M = l1.W(str);
        H.edit().putStringSet("dev.bound", setP).putLong("dev.last_use_id", M).apply();
    }

    public static boolean d0() {
        return f5512v;
    }

    public static void e(String str) {
        Set<String> setQ = q(false);
        setQ.add(str);
        H.edit().putStringSet("dev.bound.ptt", setQ).putString("random", String.valueOf(Math.random())).apply();
    }

    public static boolean e0() {
        return f5479b0;
    }

    public static void f(String str) {
        if (str == null) {
            return;
        }
        String strTrim = str.toUpperCase().trim();
        if (strTrim.isEmpty()) {
            return;
        }
        HashSet hashSet = f5503n0;
        if (hashSet.contains(strTrim)) {
            return;
        }
        hashSet.add(strTrim);
        H.edit().putStringSet("call_sign.certified", hashSet).apply();
    }

    public static boolean f0() {
        return f5477a0;
    }

    public static void g() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled() && m3.a.d()) {
            Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
            HashSet hashSet = new HashSet();
            Iterator<BluetoothDevice> it = bondedDevices.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getAddress());
            }
            SharedPreferences.Editor editorEdit = H.edit();
            for (String str : H.getAll().keySet()) {
                if (str.endsWith(".rs")) {
                    try {
                        if (!hashSet.contains(v4.m0.j(Long.parseLong(str.substring(0, str.length() - 3))))) {
                            editorEdit.remove(str);
                        }
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace();
                        editorEdit.remove(str);
                    }
                }
            }
            editorEdit.apply();
        }
    }

    public static boolean g0() {
        return V;
    }

    private static boolean h(File file) {
        File file2 = new File(file, ".testCanWrite");
        try {
            file.mkdirs();
            file2.createNewFile();
            return file2.canWrite();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean h0() {
        return (A.audioStorageDays == 0 || f5504o == null) ? false : true;
    }

    public static void i() {
        H.edit().putString("settings", new com.google.gson.f().s(A)).commit();
    }

    public static void i0(Context context) {
        f5511u = true;
    }

    public static String j() {
        String strValueOf;
        synchronized (f5487f0) {
            try {
                int i10 = f5485e0 + 1;
                f5485e0 = i10;
                if (i10 > 99999) {
                    f5485e0 = 0;
                }
                H.edit().putInt("aprs.message_id", f5485e0).apply();
                strValueOf = String.valueOf(f5485e0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strValueOf;
    }

    static ArrayList j0(File file, final String str) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.dw.ht.n
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.endsWith(str);
            }
        })) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(file2.getName().replace(str, ""))));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return arrayList;
    }

    public static String k() {
        return Z;
    }

    public static z4.v k0() {
        return new z4.v(f5516z, f5514x, f5515y);
    }

    public static String l() {
        String str = Y;
        return str == null ? "" : str;
    }

    public static void l0(String str, String str2) {
        Set<String> setO = o(0, str2);
        if (setO.remove(str)) {
            L().c().remove(l1.W(str) + ".rs").apply();
            H.edit().putStringSet(str2, setO).apply();
        }
    }

    public static char[] m() {
        if (S == null) {
            S = Y.toCharArray();
        }
        return S;
    }

    public static void m0(String str) {
        if (f5476a) {
            s3.b.b("Cfg", "removeBondedDev:" + str);
        }
        Set<String> setP = p(false);
        setP.remove(str);
        H.edit().putStringSet("dev.bound", setP).putString("random", String.valueOf(Math.random())).apply();
        j0.s(l1.W(str));
    }

    public static File n(long j10) {
        if (f5504o == null) {
            return null;
        }
        return new File(f5504o, (j10 / 10000) + "/" + (j10 % 10000) + ".opus");
    }

    public static void n0() {
        H.edit().putString("settings", new com.google.gson.f().s(A)).apply();
    }

    public static Set o(int i10, String str) {
        HashSet hashSet = new HashSet(H.getStringSet(str, new HashSet()));
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return new HashSet();
        }
        if (!m3.a.d()) {
            return new HashSet();
        }
        if (i10 != 0) {
            Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
            if (i10 == 1) {
                HashSet hashSet2 = new HashSet();
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    if (hashSet.contains(bluetoothDevice.getAddress())) {
                        hashSet2.add(bluetoothDevice.getAddress());
                    }
                }
                return hashSet2;
            }
            if (i10 == 2) {
                Iterator<BluetoothDevice> it = bondedDevices.iterator();
                while (it.hasNext()) {
                    hashSet.remove(it.next().getAddress());
                }
            }
        }
        return hashSet;
    }

    public static void o0(String str) {
        if (a6.q.d(str, Z)) {
            return;
        }
        Z = str;
        H.edit().putString("aprs.position_report_message", str).apply();
    }

    public static Set p(boolean z10) {
        return o(z10 ? 1 : 0, "dev.bound");
    }

    public static void p0(String str) {
        if (a6.q.d(str, Y)) {
            return;
        }
        Y = str;
        S = null;
        H.edit().putString("aprs.symbol", str).apply();
    }

    public static Set q(boolean z10) {
        Set<String> stringSet = H.getStringSet("dev.bound.ptt", null);
        if (stringSet == null) {
            return new HashSet();
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (z10 && defaultAdapter == null) {
            return new HashSet();
        }
        if (!m3.a.d()) {
            return new HashSet();
        }
        Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
        HashSet hashSet = new HashSet();
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            if (stringSet.contains(bluetoothDevice.getAddress())) {
                hashSet.add(bluetoothDevice.getAddress());
            }
        }
        return z10 ? hashSet : stringSet;
    }

    public static void q0(String str) {
        if (str != null) {
            str = str.toUpperCase();
        }
        if (a6.q.d(str, J)) {
            return;
        }
        J = str;
        L.r(str);
        H.edit().putString("call_sign", J).apply();
    }

    public static String r() {
        String str = J;
        return str == null ? "" : str;
    }

    public static void r0(long j10) {
        f5505o0 = Long.valueOf(j10);
        H.edit().putLong("dev.last_use_id", j10).apply();
    }

    public static String s() {
        if (f5481c0 <= 0) {
            return r();
        }
        return r() + "-" + f5481c0;
    }

    public static void s0(int i10) {
        if (F == i10) {
            return;
        }
        F = i10;
        H.edit().putInt("dtmf.speed", i10).apply();
    }

    public static long t() {
        if (f5505o0 == null) {
            f5505o0 = Long.valueOf(H.getLong("dev.last_use_id", 0L));
        }
        return f5505o0.longValue();
    }

    public static void t0(int i10) {
        u0(i10, true);
    }

    public static int u() {
        return T;
    }

    public static void u0(int i10, boolean z10) {
        if (T == i10) {
            return;
        }
        T = i10;
        if (i10 == 0) {
            f5476a = false;
            f5478b = false;
        } else if (i10 == 1 || i10 == 2) {
            f5476a = true;
            s3.b.l(CloseCodes.NORMAL_CLOSURE);
        }
        if (z10) {
            H.edit().putInt("debug_level", i10).commit();
        }
    }

    public static int v() {
        return I;
    }

    public static void v0(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            H.edit().remove(str + "-name").apply();
            return;
        }
        H.edit().putString(str + "-name", str2).apply();
    }

    public static String w(BluetoothDevice bluetoothDevice) {
        String strB = m3.a.b(bluetoothDevice);
        String string = H.getString(bluetoothDevice.getAddress() + "-name", strB);
        return string == null ? "" : string;
    }

    public static void w0(int i10) {
        if (i10 == X) {
            return;
        }
        X = i10;
        H.edit().putInt("aprs.distance_filter", i10).apply();
    }

    public static File x(long j10) {
        File fileI = I(j10);
        if (fileI == null || !fileI.isFile()) {
            return null;
        }
        return fileI;
    }

    public static void x0(boolean z10) {
        if (W == z10) {
            return;
        }
        W = z10;
        H.edit().putBoolean("aprs.igate_down", z10).apply();
    }

    public static ArrayList y() {
        final ArrayList arrayListA = a6.o.a();
        File file = f5506p;
        if (file != null) {
            if (f5482d) {
                return j0(file, ".jpg");
            }
            file.listFiles(new FilenameFilter() { // from class: com.dw.ht.m
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return Cfg.b(arrayListA, file2, str);
                }
            });
        }
        return arrayListA;
    }

    public static void y0(boolean z10) {
        if (Q == z10) {
            return;
        }
        Q = z10;
        H.edit().putBoolean("aprs.igate_en", z10).apply();
        IGateService.INSTANCE.c(Main.f5555g);
    }

    public static int z() {
        return X;
    }

    public static void z0(String str) {
        if (a6.q.d(str, O)) {
            return;
        }
        O = str;
        H.edit().putString("aprs.igate_passcode", str).apply();
    }
}
