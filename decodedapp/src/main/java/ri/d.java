package ri;

import aj.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static pi.b a(e eVar) {
        double value = eVar.getValue();
        return eVar.G(aj.d.g(value), 1.0d / aj.d.U((value * value) + 1.0d));
    }

    public static pi.b c(e eVar) {
        double value = eVar.getValue();
        return eVar.G(aj.d.h(value), 1.0d / ((value * value) + 1.0d));
    }

    public static pi.b e(e eVar) {
        double dK = aj.d.k(eVar.getValue());
        return eVar.G(dK, 1.0d / ((3.0d * dK) * dK));
    }

    public static pi.b g(e eVar) {
        double value = 1.0d / eVar.getValue();
        return eVar.G(value, (-value) * value);
    }

    public static pi.b i(e eVar, int i10) {
        if (i10 == 2) {
            return eVar.h();
        }
        if (i10 == 3) {
            return eVar.f();
        }
        double d10 = i10;
        double dI = aj.d.I(eVar.getValue(), 1.0d / d10);
        return eVar.G(dI, 1.0d / (d10 * aj.d.J(dI, i10 - 1)));
    }

    public static pi.b k(e eVar) {
        m mVarR = aj.d.R(eVar.getValue());
        return eVar.G(mVarR.b(), mVarR.a());
    }

    public static aj.f m(e eVar) {
        m mVarR = aj.d.R(eVar.getValue());
        return new aj.f(eVar.G(mVarR.b(), mVarR.a()), eVar.G(mVarR.a(), -mVarR.b()));
    }

    public static pi.b n(e eVar) {
        return eVar.G(aj.d.T(eVar.getValue()), aj.d.p(eVar.getValue()));
    }

    public static pi.b p(e eVar) {
        double dU = aj.d.U(eVar.getValue());
        return eVar.G(dU, 1.0d / (2.0d * dU));
    }

    public static pi.b r(e eVar) {
        double value = eVar.getValue();
        return eVar.G(value * value, value * 2.0d);
    }

    public static pi.b t(e eVar) {
        double dX = aj.d.X(eVar.getValue());
        return eVar.G(dX, 1.0d - (dX * dX));
    }
}
