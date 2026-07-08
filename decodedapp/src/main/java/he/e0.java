package he;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f15259b = new e0("FINAL", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f15260c = new e0("SEALED", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f15261d = new e0("OPEN", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f15262e = new e0("ABSTRACT", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ e0[] f15263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kd.a f15264g;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final e0 a(boolean z10, boolean z11, boolean z12) {
            return z10 ? e0.f15260c : z11 ? e0.f15262e : z12 ? e0.f15261d : e0.f15259b;
        }

        private a() {
        }
    }

    static {
        e0[] e0VarArrA = a();
        f15263f = e0VarArrA;
        f15264g = kd.b.a(e0VarArrA);
        f15258a = new a(null);
    }

    private e0(String str, int i10) {
    }

    private static final /* synthetic */ e0[] a() {
        return new e0[]{f15259b, f15260c, f15261d, f15262e};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f15263f.clone();
    }
}
