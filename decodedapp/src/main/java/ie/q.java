package ie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f16070a = new q("RUNTIME", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f16071b = new q("BINARY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f16072c = new q("SOURCE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ q[] f16073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f16074e;

    static {
        q[] qVarArrA = a();
        f16073d = qVarArrA;
        f16074e = kd.b.a(qVarArrA);
    }

    private q(String str, int i10) {
    }

    private static final /* synthetic */ q[] a() {
        return new q[]{f16070a, f16071b, f16072c};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f16073d.clone();
    }
}
