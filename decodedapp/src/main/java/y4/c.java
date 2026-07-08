package y4;

import rd.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f32399b = new c("MODE_OFF", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f32400c = new c("MODE_UP", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f32401d = new c("MODE_DOWN", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f32402e = new c("MODE_EXACT", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f32403f = new c("MODE_CREATE_TEAM", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f32404g = new c("MODE_JOIN_TEAM", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f32405h = new c("MODE_NOAA_SCAN", 6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f32406r = new c("MODE_TONE_SCAN", 7);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f32407s = new c("ONE_CLICK", 8);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f32408t = new c("KISS", 9);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f32409u = new c("SATELLITE", 10);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ c[] f32410v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ kd.a f32411w;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(int i10) {
            return (i10 < 0 || i10 >= c.d().size()) ? c.f32399b : (c) c.d().get(i10);
        }

        private a() {
        }
    }

    static {
        c[] cVarArrA = a();
        f32410v = cVarArrA;
        f32411w = kd.b.a(cVarArrA);
        f32398a = new a(null);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f32399b, f32400c, f32401d, f32402e, f32403f, f32404g, f32405h, f32406r, f32407s, f32408t, f32409u};
    }

    public static kd.a d() {
        return f32411w;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32410v.clone();
    }
}
