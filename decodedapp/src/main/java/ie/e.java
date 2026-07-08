package ie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f16035b = new e("ALL", 0, null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f16036c = new e("FIELD", 1, null, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f16037d = new e("FILE", 2, null, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f16038e = new e("PROPERTY", 3, null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f16039f = new e("PROPERTY_GETTER", 4, "get");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f16040g = new e("PROPERTY_SETTER", 5, "set");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f16041h = new e("RECEIVER", 6, null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f16042r = new e("CONSTRUCTOR_PARAMETER", 7, "param");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f16043s = new e("SETTER_PARAMETER", 8, "setparam");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f16044t = new e("PROPERTY_DELEGATE_FIELD", 9, "delegate");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ e[] f16045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ kd.a f16046v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16047a;

    static {
        e[] eVarArrA = a();
        f16045u = eVarArrA;
        f16046v = kd.b.a(eVarArrA);
    }

    private e(String str, int i10, String str2) {
        this.f16047a = str2 == null ? mg.a.f(name()) : str2;
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f16035b, f16036c, f16037d, f16038e, f16039f, f16040g, f16041h, f16042r, f16043s, f16044t};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f16045u.clone();
    }

    public final String d() {
        return this.f16047a;
    }

    /* synthetic */ e(String str, int i10, String str2, int i11, rd.h hVar) {
        this(str, i10, (i11 & 1) != 0 ? null : str2);
    }
}
