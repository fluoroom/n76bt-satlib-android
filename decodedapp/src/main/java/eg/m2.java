package eg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m2 f12140e = new m2("INVARIANT", 0, "", true, true, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m2 f12141f = new m2("IN_VARIANCE", 1, "in", true, false, -1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m2 f12142g = new m2("OUT_VARIANCE", 2, "out", false, true, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ m2[] f12143h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ kd.a f12144r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12148d;

    static {
        m2[] m2VarArrA = a();
        f12143h = m2VarArrA;
        f12144r = kd.b.a(m2VarArrA);
    }

    private m2(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.f12145a = str2;
        this.f12146b = z10;
        this.f12147c = z11;
        this.f12148d = i11;
    }

    private static final /* synthetic */ m2[] a() {
        return new m2[]{f12140e, f12141f, f12142g};
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) f12143h.clone();
    }

    public final boolean d() {
        return this.f12147c;
    }

    public final String e() {
        return this.f12145a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f12145a;
    }
}
