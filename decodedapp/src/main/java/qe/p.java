package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f25044a = new p("RETURNS_CONSTANT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f25045b = new p("CALLS", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f25046c = new p("RETURNS_NOT_NULL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ p[] f25047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f25048e;

    static {
        p[] pVarArrA = a();
        f25047d = pVarArrA;
        f25048e = kd.b.a(pVarArrA);
    }

    private p(String str, int i10) {
    }

    private static final /* synthetic */ p[] a() {
        return new p[]{f25044a, f25045b, f25046c};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f25047d.clone();
    }
}
