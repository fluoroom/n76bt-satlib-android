package df;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f11029a = new o1("FLEXIBLE_LOWER", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f11030b = new o1("FLEXIBLE_UPPER", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f11031c = new o1("INFLEXIBLE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o1[] f11032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f11033e;

    static {
        o1[] o1VarArrA = a();
        f11032d = o1VarArrA;
        f11033e = kd.b.a(o1VarArrA);
    }

    private o1(String str, int i10) {
    }

    private static final /* synthetic */ o1[] a() {
        return new o1[]{f11029a, f11030b, f11031c};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f11032d.clone();
    }
}
