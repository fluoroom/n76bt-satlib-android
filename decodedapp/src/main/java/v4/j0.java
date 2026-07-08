package v4;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends w4.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29909g;

    @Override // w4.a
    protected int b() {
        return 2;
    }

    @Override // w4.a
    protected int c() {
        return 2;
    }

    @Override // w4.a
    protected void d(a6.v vVar) {
        this.f29906d = vVar.c();
        this.f29907e = vVar.c();
        this.f29908f = vVar.c();
        this.f29909g = vVar.c();
    }

    @Override // w4.a
    protected void g(a6.v vVar) {
        vVar.p(this.f29906d).p(this.f29907e).p(this.f29908f).p(this.f29909g);
    }
}
