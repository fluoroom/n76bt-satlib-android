package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f24950a = new e0("LANGUAGE_VERSION", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f24951b = new e0("COMPILER_VERSION", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f24952c = new e0("API_VERSION", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f24953d = new e0("UNKNOWN", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e0[] f24954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24955f;

    static {
        e0[] e0VarArrA = a();
        f24954e = e0VarArrA;
        f24955f = kd.b.a(e0VarArrA);
    }

    private e0(String str, int i10) {
    }

    private static final /* synthetic */ e0[] a() {
        return new e0[]{f24950a, f24951b, f24952c, f24953d};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f24954e.clone();
    }
}
