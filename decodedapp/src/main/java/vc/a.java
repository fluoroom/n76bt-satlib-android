package vc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements pc.a, pc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final pc.a f30521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ck.c f30522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected pc.d f30523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f30524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f30525e;

    public a(pc.a aVar) {
        this.f30521a = aVar;
    }

    @Override // hc.f, ck.b
    public final void a(ck.c cVar) {
        if (wc.d.i(this.f30522b, cVar)) {
            this.f30522b = cVar;
            if (cVar instanceof pc.d) {
                this.f30523c = (pc.d) cVar;
            }
            if (d()) {
                this.f30521a.a(this);
                c();
            }
        }
    }

    @Override // ck.c
    public void cancel() {
        this.f30522b.cancel();
    }

    @Override // pc.g
    public void clear() {
        this.f30523c.clear();
    }

    protected boolean d() {
        return true;
    }

    protected final void f(Throwable th2) {
        lc.b.b(th2);
        this.f30522b.cancel();
        onError(th2);
    }

    protected final int g(int i10) {
        pc.d dVar = this.f30523c;
        if (dVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iE = dVar.e(i10);
        if (iE != 0) {
            this.f30525e = iE;
        }
        return iE;
    }

    @Override // pc.g
    public boolean isEmpty() {
        return this.f30523c.isEmpty();
    }

    @Override // pc.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ck.b
    public void onComplete() {
        if (this.f30524d) {
            return;
        }
        this.f30524d = true;
        this.f30521a.onComplete();
    }

    @Override // ck.b
    public void onError(Throwable th2) {
        if (this.f30524d) {
            yc.a.n(th2);
        } else {
            this.f30524d = true;
            this.f30521a.onError(th2);
        }
    }

    @Override // ck.c
    public void request(long j10) {
        this.f30522b.request(j10);
    }

    protected void c() {
    }
}
