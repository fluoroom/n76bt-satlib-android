package ua;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f29005a = new b("DEFAULT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f29006b = new b("LEFT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f29007c = new b("RIGHT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f29008d = new b("TOP", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f29009e = new b("BOTTOM", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f29010f = new b("AUTO_HORIZONTAL", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f29011g = new b("AUTO_VERTICAL", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f29012h = new b("AUTO_SIDE", 7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f29013r = new b("RESULT_LEFT", 8);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f29014s = new b("RESULT_RIGHT", 9);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f29015t = new b("RESULT_TOP", 10);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f29016u = new b("RESULT_BOTTOM", 11);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f29017v = new b("RESULT_HORIZONTAL", 12);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f29018w = new b("RESULT_VERTICAL", 13);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f29019x = new b("RESULT_SIDE", 14);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ b[] f29020y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ kd.a f29021z;

    static {
        b[] bVarArrA = a();
        f29020y = bVarArrA;
        f29021z = kd.b.a(bVarArrA);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f29005a, f29006b, f29007c, f29008d, f29009e, f29010f, f29011g, f29012h, f29013r, f29014s, f29015t, f29016u, f29017v, f29018w, f29019x};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f29020y.clone();
    }
}
