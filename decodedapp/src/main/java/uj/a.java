package uj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f29254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vj.b f29255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29256c;

    protected a(f fVar, vj.b bVar) {
        o(fVar.c());
        this.f29254a = fVar;
        this.f29255b = bVar;
        this.f29256c = true;
    }

    public static boolean m(pj.d dVar, yj.b bVar) {
        return bVar.X(dVar.getDate()) >= 0.0d;
    }

    private void o(double d10) {
        if (d10 <= 0.0d) {
            throw new hj.a(hj.f.NOT_STRICTLY_POSITIVE, Double.valueOf(d10));
        }
    }

    @Override // uj.h
    public /* synthetic */ void a(pj.d dVar) {
        g.a(this, dVar);
    }

    @Override // uj.h
    public void b(pj.d dVar, yj.b bVar) {
        g.e(this, dVar, bVar);
        this.f29256c = m(dVar, bVar);
    }

    @Override // uj.h
    public /* synthetic */ int c() {
        return g.c(this);
    }

    @Override // uj.h
    public vj.b getHandler() {
        return this.f29255b;
    }

    @Override // uj.h
    public f h() {
        return this.f29254a;
    }

    @Override // uj.h
    public /* synthetic */ wj.c j() {
        return g.b(this);
    }

    @Override // uj.h
    public /* synthetic */ void k(pj.d dVar, yj.b bVar) {
        g.f(this, dVar, bVar);
    }

    @Override // uj.h
    public /* synthetic */ double l() {
        return g.d(this);
    }

    protected abstract a p(f fVar, vj.b bVar);

    public a t(f fVar) {
        return p(new f(fVar.a(), fVar.c(), fVar.b()), getHandler());
    }

    public a u(vj.b bVar) {
        return p(h(), bVar);
    }

    public a v(wj.c cVar) {
        return t(new f(cVar, l(), c()));
    }

    public a w(double d10) {
        return t(new f(j(), d10, c()));
    }
}
