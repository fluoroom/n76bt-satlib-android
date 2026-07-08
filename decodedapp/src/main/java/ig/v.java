package ig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f16119b = new v("IN", 0, "in");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f16120c = new v("OUT", 1, "out");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f16121d = new v("INV", 2, "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ v[] f16122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kd.a f16123f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16124a;

    static {
        v[] vVarArrA = a();
        f16122e = vVarArrA;
        f16123f = kd.b.a(vVarArrA);
    }

    private v(String str, int i10, String str2) {
        this.f16124a = str2;
    }

    private static final /* synthetic */ v[] a() {
        return new v[]{f16119b, f16120c, f16121d};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f16122e.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f16124a;
    }
}
