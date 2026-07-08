package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f24156a = new e0("PRETTY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f24157b = new e0("DEBUG", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f24158c = new e0("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e0[] f24159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24160e;

    static {
        e0[] e0VarArrA = a();
        f24159d = e0VarArrA;
        f24160e = kd.b.a(e0VarArrA);
    }

    private e0(String str, int i10) {
    }

    private static final /* synthetic */ e0[] a() {
        return new e0[]{f24156a, f24157b, f24158c};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f24159d.clone();
    }
}
