package tg;

import dd.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {
    public static final void a(n0 n0Var, int i10) throws l0 {
        hd.e eVarC = n0Var.c();
        boolean z10 = i10 == 4;
        if (z10 || !(eVarC instanceof xg.f) || b(i10) != b(n0Var.f27852c)) {
            d(n0Var, eVarC, z10);
            return;
        }
        xg.f fVar = (xg.f) eVarC;
        a0 a0Var = fVar.f32108d;
        hd.i context = fVar.getContext();
        if (xg.g.d(a0Var, context)) {
            xg.g.c(a0Var, context, n0Var);
        } else {
            e(n0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(n0 n0Var, hd.e eVar, boolean z10) {
        Object objG;
        Object objI = n0Var.i();
        Throwable thF = n0Var.f(objI);
        if (thF != null) {
            r.a aVar = dd.r.f10916a;
            objG = dd.s.a(thF);
        } else {
            r.a aVar2 = dd.r.f10916a;
            objG = n0Var.g(objI);
        }
        Object objA = dd.r.a(objG);
        if (!z10) {
            eVar.d(objA);
            return;
        }
        rd.m.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        xg.f fVar = (xg.f) eVar;
        hd.e eVar2 = fVar.f32109e;
        Object obj = fVar.f32111g;
        hd.i context = eVar2.getContext();
        Object objI2 = xg.e0.i(context, obj);
        a2 a2VarM = objI2 != xg.e0.f32103a ? y.m(eVar2, context, objI2) : null;
        try {
            fVar.f32109e.d(objA);
            dd.d0 d0Var = dd.d0.f10897a;
            if (a2VarM == null || a2VarM.A0()) {
                xg.e0.f(context, objI2);
            }
        } catch (Throwable th2) {
            if (a2VarM == null || a2VarM.A0()) {
                xg.e0.f(context, objI2);
            }
            throw th2;
        }
    }

    private static final void e(n0 n0Var) {
        s0 s0VarA = y1.f27879a.a();
        if (s0VarA.B0()) {
            s0VarA.x0(n0Var);
            return;
        }
        s0VarA.z0(true);
        try {
            d(n0Var, n0Var.c(), true);
            do {
            } while (s0VarA.D0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
