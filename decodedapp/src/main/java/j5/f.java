package j5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f18431b = new f("TianGong", 0, 48274);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f18432c = new f("ISS", 1, 25544);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ f[] f18433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f18434e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18435a;

    static {
        f[] fVarArrA = a();
        f18433d = fVarArrA;
        f18434e = kd.b.a(fVarArrA);
    }

    private f(String str, int i10, int i11) {
        this.f18435a = i11;
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f18431b, f18432c};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f18433d.clone();
    }

    public final int d() {
        return this.f18435a;
    }
}
