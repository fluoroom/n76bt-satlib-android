package cg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f4841a = new r("STABLE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f4842b = new r("UNSTABLE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ r[] f4843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ kd.a f4844d;

    static {
        r[] rVarArrA = a();
        f4843c = rVarArrA;
        f4844d = kd.b.a(rVarArrA);
    }

    private r(String str, int i10) {
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f4841a, f4842b};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f4843c.clone();
    }
}
