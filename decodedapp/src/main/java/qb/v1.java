package qb;

/* JADX INFO: loaded from: classes3.dex */
public class v1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f24810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f24811b;

    public v1(u1 u1Var) {
        this(u1Var, null);
    }

    public final u1 a() {
        return this.f24810a;
    }

    public final z0 b() {
        return this.f24811b;
    }

    public v1(u1 u1Var, z0 z0Var) {
        super(u1.i(u1Var), u1Var.n());
        this.f24810a = u1Var;
        this.f24811b = z0Var;
    }
}
