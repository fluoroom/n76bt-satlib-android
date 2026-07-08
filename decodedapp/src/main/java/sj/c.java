package sj;

import aj.d;
import aj.j;
import oj.k;
import rj.e;
import yj.b0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static e a(k kVar, e eVar, double d10, b0 b0Var) {
        double dP = kVar.P();
        double dP0 = kVar.p0();
        double dN = kVar.N();
        double dY0 = kVar.y0();
        double dW0 = kVar.w0();
        double dU0 = kVar.u0();
        yj.b date = kVar.getDate();
        return new e(eVar.J(), eVar.o(), eVar.y(), eVar.w(), eVar.x(), eVar.u(), eVar.t(), date, dP, eVar.D(), eVar.E(), dP0, dN, dW0, dY0, dU0, (int) (((double) eVar.I()) + d.u((j.f(dU0, 3.141592653589793d) + (date.X(eVar.getDate()) * dP)) / 6.283185307179586d)), d10, b0Var);
    }
}
