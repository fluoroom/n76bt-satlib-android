package y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f32355b = new i("UNKNOWN", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f32356c = new i("START", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f32357d = new i("STOP", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f32358e = new i("BUF_AVAILABLE", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ i[] f32359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kd.a f32360g;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final i a(int i10) {
            return (i10 < 0 || i10 >= i.d().size()) ? i.f32355b : (i) i.d().get(i10);
        }

        private a() {
        }
    }

    static {
        i[] iVarArrA = a();
        f32359f = iVarArrA;
        f32360g = kd.b.a(iVarArrA);
        f32354a = new a(null);
    }

    private i(String str, int i10) {
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f32355b, f32356c, f32357d, f32358e};
    }

    public static kd.a d() {
        return f32360g;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f32359f.clone();
    }
}
