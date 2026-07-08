package qc;

import hc.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements i, pc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final i f24863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected kc.b f24864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected pc.b f24865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f24866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f24867e;

    public a(i iVar) {
        this.f24863a = iVar;
    }

    @Override // hc.i
    public final void a(kc.b bVar) {
        if (nc.b.i(this.f24864b, bVar)) {
            this.f24864b = bVar;
            if (bVar instanceof pc.b) {
                this.f24865c = (pc.b) bVar;
            }
            if (c()) {
                this.f24863a.a(this);
                b();
            }
        }
    }

    protected boolean c() {
        return true;
    }

    @Override // pc.g
    public void clear() {
        this.f24865c.clear();
    }

    @Override // kc.b
    public boolean d() {
        return this.f24864b.d();
    }

    @Override // kc.b
    public void dispose() {
        this.f24864b.dispose();
    }

    protected final void f(Throwable th2) {
        lc.b.b(th2);
        this.f24864b.dispose();
        onError(th2);
    }

    protected final int g(int i10) {
        pc.b bVar = this.f24865c;
        if (bVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iE = bVar.e(i10);
        if (iE != 0) {
            this.f24867e = iE;
        }
        return iE;
    }

    @Override // pc.g
    public boolean isEmpty() {
        return this.f24865c.isEmpty();
    }

    @Override // pc.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // hc.i
    public void onComplete() {
        if (this.f24866d) {
            return;
        }
        this.f24866d = true;
        this.f24863a.onComplete();
    }

    @Override // hc.i
    public void onError(Throwable th2) {
        if (this.f24866d) {
            yc.a.n(th2);
        } else {
            this.f24866d = true;
            this.f24863a.onError(th2);
        }
    }

    protected void b() {
    }
}
