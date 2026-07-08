package be;

import be.l2;
import ce.i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q2 {
    /* JADX WARN: Removed duplicated region for block: B:201:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ce.h b(be.l2.a r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: be.q2.b(be.l2$a, boolean):ce.h");
    }

    private static final ce.i c(l2.a aVar, boolean z10, Field field) {
        return (g(aVar.b().Q()) || !Modifier.isStatic(field.getModifiers())) ? z10 ? aVar.O() ? new i.f.a(field, f(aVar)) : new i.f.c(field) : aVar.O() ? new i.g.a(field, e(aVar), f(aVar)) : new i.g.c(field, e(aVar)) : d(aVar) ? z10 ? aVar.O() ? new i.f.b(field) : new i.f.d(field) : aVar.O() ? new i.g.b(field, e(aVar)) : new i.g.d(field, e(aVar)) : z10 ? new i.f.e(field) : new i.g.e(field, e(aVar));
    }

    private static final boolean d(l2.a aVar) {
        return aVar.b().Q().getAnnotations().H(l3.j());
    }

    private static final boolean e(l2.a aVar) {
        return !eg.i2.l(aVar.b().Q().getType());
    }

    public static final Object f(l2.a aVar) {
        rd.m.e(aVar, "<this>");
        return aVar.b().V();
    }

    private static final boolean g(he.y0 y0Var) {
        he.m mVarB = y0Var.b();
        rd.m.d(mVarB, "getContainingDeclaration(...)");
        if (!qf.i.x(mVarB)) {
            return false;
        }
        he.m mVarB2 = mVarB.b();
        if (qf.i.C(mVarB2) || qf.i.t(mVarB2)) {
            return (y0Var instanceof cg.n0) && lf.h.f(((cg.n0) y0Var).H());
        }
        return true;
    }
}
