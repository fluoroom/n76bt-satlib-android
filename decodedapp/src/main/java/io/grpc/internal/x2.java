package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x2 f17255c = new x2(new qb.y1[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.y1[] f17256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f17257b = new AtomicBoolean(false);

    x2(qb.y1[] y1VarArr) {
        this.f17256a = y1VarArr;
    }

    public static x2 h(qb.k[] kVarArr, qb.a aVar, qb.z0 z0Var) {
        x2 x2Var = new x2(kVarArr);
        for (qb.k kVar : kVarArr) {
            kVar.o(aVar, z0Var);
        }
        return x2Var;
    }

    public void a(qb.z0 z0Var) {
        for (qb.y1 y1Var : this.f17256a) {
            ((qb.k) y1Var).l(z0Var);
        }
    }

    public void b(qb.z0 z0Var) {
        for (qb.y1 y1Var : this.f17256a) {
            ((qb.k) y1Var).m(z0Var);
        }
    }

    public void c() {
        for (qb.y1 y1Var : this.f17256a) {
            ((qb.k) y1Var).n();
        }
    }

    public void d(int i10) {
        for (qb.y1 y1Var : this.f17256a) {
            y1Var.a(i10);
        }
    }

    public void e(int i10, long j10, long j11) {
        for (qb.y1 y1Var : this.f17256a) {
            y1Var.b(i10, j10, j11);
        }
    }

    public void f(long j10) {
        for (qb.y1 y1Var : this.f17256a) {
            y1Var.c(j10);
        }
    }

    public void g(long j10) {
        for (qb.y1 y1Var : this.f17256a) {
            y1Var.d(j10);
        }
    }

    public void i(int i10) {
        for (qb.y1 y1Var : this.f17256a) {
            y1Var.e(i10);
        }
    }

    public void j(int i10, long j10, long j11) {
        for (qb.y1 y1Var : this.f17256a) {
            y1Var.f(i10, j10, j11);
        }
    }

    public void k(long j10) {
        for (qb.y1 y1Var : this.f17256a) {
            y1Var.g(j10);
        }
    }

    public void l(long j10) {
        for (qb.y1 y1Var : this.f17256a) {
            y1Var.h(j10);
        }
    }

    public void m(qb.u1 u1Var) {
        if (this.f17257b.compareAndSet(false, true)) {
            for (qb.y1 y1Var : this.f17256a) {
                y1Var.i(u1Var);
            }
        }
    }
}
