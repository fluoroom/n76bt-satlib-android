package pe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {
    private static final /* synthetic */ d[] G;
    private static final /* synthetic */ kd.a H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f24113a = new d("FROM_IDE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f24114b = new d("FROM_BACKEND", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f24115c = new d("FROM_TEST", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f24116d = new d("FROM_BUILTINS", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f24117e = new d("WHEN_CHECK_DECLARATION_CONFLICTS", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f24118f = new d("WHEN_CHECK_OVERRIDES", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f24119g = new d("FOR_SCRIPT", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f24120h = new d("FROM_REFLECTION", 7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f24121r = new d("WHEN_RESOLVE_DECLARATION", 8);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f24122s = new d("WHEN_GET_DECLARATION_SCOPE", 9);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f24123t = new d("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f24124u = new d("FOR_ALREADY_TRACKED", 11);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f24125v = new d("WHEN_GET_ALL_DESCRIPTORS", 12);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f24126w = new d("WHEN_TYPING", 13);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f24127x = new d("WHEN_GET_SUPER_MEMBERS", 14);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f24128y = new d("FOR_NON_TRACKED_SCOPE", 15);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f24129z = new d("FROM_SYNTHETIC_SCOPE", 16);
    public static final d A = new d("FROM_DESERIALIZATION", 17);
    public static final d B = new d("FROM_JAVA_LOADER", 18);
    public static final d C = new d("WHEN_GET_LOCAL_VARIABLE", 19);
    public static final d D = new d("WHEN_FIND_BY_FQNAME", 20);
    public static final d E = new d("WHEN_GET_COMPANION_OBJECT", 21);
    public static final d F = new d("FOR_DEFAULT_IMPORTS", 22);

    static {
        d[] dVarArrA = a();
        G = dVarArrA;
        H = kd.b.a(dVarArrA);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f24113a, f24114b, f24115c, f24116d, f24117e, f24118f, f24119g, f24120h, f24121r, f24122s, f24123t, f24124u, f24125v, f24126w, f24127x, f24128y, f24129z, A, B, C, D, E, F};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) G.clone();
    }

    @Override // pe.b
    public a getLocation() {
        return null;
    }
}
