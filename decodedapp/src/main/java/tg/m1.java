package tg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final xg.x f27845a = new xg.x("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xg.x f27846b = new xg.x("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final xg.x f27847c = new xg.x("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final xg.x f27848d = new xg.x("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final xg.x f27849e = new xg.x("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final r0 f27850f = new r0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final r0 f27851g = new r0(true);

    public static final Object g(Object obj) {
        return obj instanceof b1 ? new c1((b1) obj) : obj;
    }

    public static final Object h(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.f27802a) == null) ? obj : b1Var;
    }
}
