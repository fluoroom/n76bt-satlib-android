package yg;

import dd.f;
import dd.r;
import hd.e;
import hd.i;
import jd.h;
import qd.p;
import rd.h0;
import tg.l0;
import tg.m1;
import tg.s;
import xg.e0;
import xg.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    private static final Void a(v vVar, l0 l0Var) throws Throwable {
        vVar.V(new s(l0Var.getCause(), false, 2, null));
        throw l0Var.getCause();
    }

    private static final boolean b(v vVar, Throwable th2) {
        return true;
    }

    public static final void c(p pVar, Object obj, e eVar) {
        e eVarA = h.a(eVar);
        try {
            i context = eVarA.getContext();
            Object objI = e0.i(context, null);
            try {
                h.b(eVarA);
                Object objD = !(pVar instanceof jd.a) ? id.b.d(pVar, obj, eVarA) : ((p) h0.c(pVar, 2)).s(obj, eVarA);
                e0.f(context, objI);
                if (objD != id.b.e()) {
                    eVarA.d(r.a(objD));
                }
            } catch (Throwable th2) {
                e0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof l0) {
                th = ((l0) th).getCause();
            }
            r.a aVar = r.f10916a;
            eVarA.d(r.a(dd.s.a(th)));
        }
    }

    public static final Object d(v vVar, Object obj, p pVar) {
        return e(vVar, true, obj, pVar);
    }

    private static final Object e(v vVar, boolean z10, Object obj, p pVar) throws Throwable {
        Object sVar;
        try {
            sVar = !(pVar instanceof jd.a) ? id.b.d(pVar, obj, vVar) : ((p) h0.c(pVar, 2)).s(obj, vVar);
        } catch (l0 e10) {
            a(vVar, e10);
            throw new f();
        } catch (Throwable th2) {
            sVar = new s(th2, false, 2, null);
        }
        if (sVar == id.b.e()) {
            return id.b.e();
        }
        Object objY = vVar.Y(sVar);
        if (objY == m1.f27846b) {
            return id.b.e();
        }
        vVar.z0();
        if (!(objY instanceof s)) {
            return m1.h(objY);
        }
        if (z10 || b(vVar, ((s) objY).f27867a)) {
            throw ((s) objY).f27867a;
        }
        if (sVar instanceof s) {
            throw ((s) sVar).f27867a;
        }
        return sVar;
    }
}
