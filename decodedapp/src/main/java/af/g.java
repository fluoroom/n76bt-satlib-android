package af;

import dd.o;
import eg.a2;
import eg.c2;
import eg.f0;
import eg.g0;
import eg.i2;
import eg.m2;
import eg.r0;
import eg.z1;
import he.l1;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends f0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f449a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f436c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f435b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f434a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f449a = iArr;
        }
    }

    @Override // eg.f0
    public a2 a(l1 l1Var, g0 g0Var, z1 z1Var, r0 r0Var) {
        m.e(l1Var, "parameter");
        m.e(g0Var, "typeAttr");
        m.e(z1Var, "typeParameterUpperBoundEraser");
        m.e(r0Var, "erasedUpperBound");
        if (!(g0Var instanceof af.a)) {
            return super.a(l1Var, g0Var, z1Var, r0Var);
        }
        af.a aVarL = (af.a) g0Var;
        if (!aVarL.i()) {
            aVarL = aVarL.l(c.f434a);
        }
        int i10 = a.f449a[aVarL.g().ordinal()];
        if (i10 == 1) {
            return new c2(m2.f12140e, r0Var);
        }
        if (i10 != 2 && i10 != 3) {
            throw new o();
        }
        if (!l1Var.n().d()) {
            return new c2(m2.f12140e, uf.e.m(l1Var).I());
        }
        List parameters = r0Var.N0().getParameters();
        m.d(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new c2(m2.f12142g, r0Var);
        }
        a2 a2VarT = i2.t(l1Var, aVarL);
        m.b(a2VarT);
        return a2VarT;
    }
}
