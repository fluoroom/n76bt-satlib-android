package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f25039a = new o("AT_MOST_ONCE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f25040b = new o("EXACTLY_ONCE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f25041c = new o("AT_LEAST_ONCE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o[] f25042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f25043e;

    static {
        o[] oVarArrA = a();
        f25042d = oVarArrA;
        f25043e = kd.b.a(oVarArrA);
    }

    private o(String str, int i10) {
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f25039a, f25040b, f25041c};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f25042d.clone();
    }
}
