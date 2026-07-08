package eg;

import eg.p1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r1 {
    public static final q1 a(q1 q1Var, ie.h hVar) {
        q1 q1VarM;
        rd.m.e(q1Var, "<this>");
        rd.m.e(hVar, "newAnnotations");
        if (t.a(q1Var) == hVar) {
            return q1Var;
        }
        s sVarB = t.b(q1Var);
        if (sVarB != null && (q1VarM = q1Var.m(sVarB)) != null) {
            q1Var = q1VarM;
        }
        return (hVar.iterator().hasNext() || !hVar.isEmpty()) ? q1Var.l(new s(hVar)) : q1Var;
    }

    public static final q1 b(ie.h hVar) {
        rd.m.e(hVar, "<this>");
        return p1.a.a(x.f12218a, hVar, null, null, 6, null);
    }
}
