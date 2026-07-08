package q4;

import dd.b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f24334b = new r("BDADDR", 0, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f24335c = new r("CVC_KEY", 1, 8840);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f24336d = new r("ANA_FTRIM_OFFSET", 2, 9619);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f24337e = new r("DID", 3, 10181);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f24338f = new r("QID", 4, 10185);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f24339g = new r("UID", 5, 10190);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f24340h = new r("REG_TIME", 6, 10191);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ r[] f24341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24342s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f24343a;

    static {
        r[] rVarArrA = a();
        f24341r = rVarArrA;
        f24342s = kd.b.a(rVarArrA);
    }

    private r(String str, int i10, short s10) {
        this.f24343a = s10;
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f24334b, f24335c, f24336d, f24337e, f24338f, f24339g, f24340h};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f24341r.clone();
    }

    public final short d() {
        return this.f24343a;
    }

    private r(String str, int i10, int i11) {
        this(str, i10, b0.d((short) i11));
    }
}
