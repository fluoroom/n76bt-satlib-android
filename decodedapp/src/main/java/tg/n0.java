package tg;

import dd.r;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 extends zg.h {

    /* JADX INFO: renamed from: c */
    public int f27852c;

    public n0(int i10) {
        this.f27852c = i10;
    }

    public abstract hd.e c();

    public Throwable f(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar.f27867a;
        }
        return null;
    }

    public final void h(Throwable th2) {
        c0.a(c().getContext(), new g0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            hd.e eVarC = c();
            rd.m.c(eVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            xg.f fVar = (xg.f) eVarC;
            hd.e eVar = fVar.f32109e;
            Object obj = fVar.f32111g;
            hd.i context = eVar.getContext();
            Object objI = xg.e0.i(context, obj);
            f1 f1Var = null;
            a2 a2VarM = objI != xg.e0.f32103a ? y.m(eVar, context, objI) : null;
            try {
                hd.i context2 = eVar.getContext();
                Object objI2 = i();
                Throwable thF = f(objI2);
                if (thF == null && o0.b(this.f27852c)) {
                    f1Var = (f1) context2.a(f1.f27816q);
                }
                if (f1Var != null && !f1Var.c()) {
                    CancellationException cancellationExceptionS = f1Var.s();
                    a(objI2, cancellationExceptionS);
                    r.a aVar = dd.r.f10916a;
                    eVar.d(dd.r.a(dd.s.a(cancellationExceptionS)));
                } else if (thF != null) {
                    r.a aVar2 = dd.r.f10916a;
                    eVar.d(dd.r.a(dd.s.a(thF)));
                } else {
                    r.a aVar3 = dd.r.f10916a;
                    eVar.d(dd.r.a(g(objI2)));
                }
                dd.d0 d0Var = dd.d0.f10897a;
                if (a2VarM == null || a2VarM.A0()) {
                    xg.e0.f(context, objI);
                }
            } catch (Throwable th2) {
                if (a2VarM == null || a2VarM.A0()) {
                    xg.e0.f(context, objI);
                }
                throw th2;
            }
        } catch (l0 e10) {
            c0.a(c().getContext(), e10.getCause());
        } catch (Throwable th3) {
            h(th3);
        }
    }

    public Object g(Object obj) {
        return obj;
    }

    public void a(Object obj, Throwable th2) {
    }
}
