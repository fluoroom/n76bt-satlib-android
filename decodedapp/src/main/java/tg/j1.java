package tg;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j1 {

    /* synthetic */ class a extends rd.l implements qd.l {
        a(Object obj) {
            super(1, obj, k1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // qd.l
        public /* bridge */ /* synthetic */ Object l(Object obj) {
            p((Throwable) obj);
            return dd.d0.f10897a;
        }

        public final void p(Throwable th2) {
            ((k1) this.f25940b).w(th2);
        }
    }

    public static final q a(f1 f1Var) {
        return new h1(f1Var);
    }

    public static /* synthetic */ q b(f1 f1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f1Var = null;
        }
        return i1.a(f1Var);
    }

    public static final void c(hd.i iVar, CancellationException cancellationException) {
        f1 f1Var = (f1) iVar.a(f1.f27816q);
        if (f1Var != null) {
            f1Var.h0(cancellationException);
        }
    }

    public static /* synthetic */ void d(hd.i iVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        i1.c(iVar, cancellationException);
    }

    public static final void e(hd.i iVar) {
        f1 f1Var = (f1) iVar.a(f1.f27816q);
        if (f1Var != null) {
            i1.f(f1Var);
        }
    }

    public static final void f(f1 f1Var) {
        if (!f1Var.c()) {
            throw f1Var.s();
        }
    }

    public static final q0 g(f1 f1Var, boolean z10, k1 k1Var) {
        return f1Var instanceof l1 ? ((l1) f1Var).Q(z10, k1Var) : f1Var.x(k1Var.v(), z10, new a(k1Var));
    }

    public static /* synthetic */ q0 h(f1 f1Var, boolean z10, k1 k1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return i1.g(f1Var, z10, k1Var);
    }
}
