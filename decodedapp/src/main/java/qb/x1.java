package qb;

/* JADX INFO: loaded from: classes3.dex */
public class x1 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f24820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f24821b;

    public x1(u1 u1Var) {
        this(u1Var, null);
    }

    public final u1 a() {
        return this.f24820a;
    }

    public final z0 b() {
        return this.f24821b;
    }

    public x1(u1 u1Var, z0 z0Var) {
        super(u1.i(u1Var), u1Var.n());
        this.f24820a = u1Var;
        this.f24821b = z0Var;
    }
}
