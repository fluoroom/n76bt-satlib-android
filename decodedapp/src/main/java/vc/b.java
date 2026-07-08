package vc;

import hc.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements f, pc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ck.b f30526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ck.c f30527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected pc.d f30528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f30529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f30530e;

    public b(ck.b bVar) {
        this.f30526a = bVar;
    }

    @Override // hc.f, ck.b
    public final void a(ck.c cVar) {
        if (wc.d.i(this.f30527b, cVar)) {
            this.f30527b = cVar;
            if (cVar instanceof pc.d) {
                this.f30528c = (pc.d) cVar;
            }
            if (d()) {
                this.f30526a.a(this);
                c();
            }
        }
    }

    @Override // ck.c
    public void cancel() {
        this.f30527b.cancel();
    }

    @Override // pc.g
    public void clear() {
        this.f30528c.clear();
    }

    protected boolean d() {
        return true;
    }

    protected final void f(Throwable th2) {
        lc.b.b(th2);
        this.f30527b.cancel();
        onError(th2);
    }

    protected final int g(int i10) {
        pc.d dVar = this.f30528c;
        if (dVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iE = dVar.e(i10);
        if (iE != 0) {
            this.f30530e = iE;
        }
        return iE;
    }

    @Override // pc.g
    public boolean isEmpty() {
        return this.f30528c.isEmpty();
    }

    @Override // pc.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ck.b
    public void onComplete() {
        if (this.f30529d) {
            return;
        }
        this.f30529d = true;
        this.f30526a.onComplete();
    }

    @Override // ck.b
    public void onError(Throwable th2) {
        if (this.f30529d) {
            yc.a.n(th2);
        } else {
            this.f30529d = true;
            this.f30526a.onError(th2);
        }
    }

    @Override // ck.c
    public void request(long j10) {
        this.f30527b.request(j10);
    }

    protected void c() {
    }
}
