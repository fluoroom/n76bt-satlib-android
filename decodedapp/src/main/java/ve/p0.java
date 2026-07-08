package ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f30659c = new p0("IGNORE", 0, "ignore");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p0 f30660d = new p0("WARN", 1, "warn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p0 f30661e = new p0("STRICT", 2, "strict");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ p0[] f30662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kd.a f30663g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30664a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        p0[] p0VarArrA = a();
        f30662f = p0VarArrA;
        f30663g = kd.b.a(p0VarArrA);
        f30658b = new a(null);
    }

    private p0(String str, int i10, String str2) {
        this.f30664a = str2;
    }

    private static final /* synthetic */ p0[] a() {
        return new p0[]{f30659c, f30660d, f30661e};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f30662f.clone();
    }

    public final String d() {
        return this.f30664a;
    }

    public final boolean e() {
        return this == f30659c;
    }

    public final boolean f() {
        return this == f30660d;
    }
}
