package io.grpc.internal;

import qb.b;

/* JADX INFO: loaded from: classes3.dex */
final class t1 extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f17136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb.a1 f17137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qb.z0 f17138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qb.c f17139d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f17141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qb.k[] f17142g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r f17144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f17145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d0 f17146k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f17143h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qb.s f17140e = qb.s.e();

    public interface a {
        void onComplete();
    }

    t1(t tVar, qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, a aVar, qb.k[] kVarArr) {
        this.f17136a = tVar;
        this.f17137b = a1Var;
        this.f17138c = z0Var;
        this.f17139d = cVar;
        this.f17141f = aVar;
        this.f17142g = kVarArr;
    }

    private void c(r rVar) {
        boolean z10;
        r9.l.u(!this.f17145j, "already finalized");
        this.f17145j = true;
        synchronized (this.f17143h) {
            try {
                if (this.f17144i == null) {
                    this.f17144i = rVar;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f17141f.onComplete();
            return;
        }
        r9.l.u(this.f17146k != null, "delayedStream is null");
        Runnable runnableW = this.f17146k.w(rVar);
        if (runnableW != null) {
            runnableW.run();
        }
        this.f17141f.onComplete();
    }

    @Override // qb.b.a
    public void a(qb.z0 z0Var) {
        r9.l.u(!this.f17145j, "apply() or fail() already called");
        r9.l.o(z0Var, "headers");
        this.f17138c.l(z0Var);
        qb.s sVarB = this.f17140e.b();
        try {
            r rVarG = this.f17136a.g(this.f17137b, this.f17138c, this.f17139d, this.f17142g);
            this.f17140e.f(sVarB);
            c(rVarG);
        } catch (Throwable th2) {
            this.f17140e.f(sVarB);
            throw th2;
        }
    }

    public void b(qb.u1 u1Var) {
        r9.l.e(!u1Var.q(), "Cannot fail with OK status");
        r9.l.u(!this.f17145j, "apply() or fail() already called");
        c(new k0(w0.n(u1Var), this.f17142g));
    }

    r d() {
        synchronized (this.f17143h) {
            try {
                r rVar = this.f17144i;
                if (rVar != null) {
                    return rVar;
                }
                d0 d0Var = new d0();
                this.f17146k = d0Var;
                this.f17144i = d0Var;
                return d0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
