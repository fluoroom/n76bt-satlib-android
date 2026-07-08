package ve;

import eg.z1;
import he.b1;
import he.f1;
import he.s1;
import java.util.List;
import qf.j;
import qf.o;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements qf.j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30665a;

        static {
            int[] iArr = new int[o.i.a.values().length];
            try {
                iArr[o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30665a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eg.r0 d(s1 s1Var) {
        return s1Var.getType();
    }

    @Override // qf.j
    public j.a a() {
        return j.a.SUCCESS_ONLY;
    }

    @Override // qf.j
    public j.b b(he.a aVar, he.a aVar2, he.e eVar) {
        rd.m.e(aVar, "superDescriptor");
        rd.m.e(aVar2, "subDescriptor");
        if (aVar2 instanceof xe.e) {
            xe.e eVar2 = (xe.e) aVar2;
            List typeParameters = eVar2.getTypeParameters();
            rd.m.d(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                o.i iVarW = qf.o.w(aVar, aVar2);
                z1 z1Var = null;
                byte b10 = 0;
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return j.b.UNKNOWN;
                }
                List listI = eVar2.i();
                rd.m.d(listI, "getValueParameters(...)");
                qg.h hVarH = qg.k.H(ed.q.S(listI), p.f30657a);
                eg.r0 r0VarG = eVar2.g();
                rd.m.b(r0VarG);
                qg.h hVarK = qg.k.K(hVarH, r0VarG);
                b1 b1VarL0 = eVar2.l0();
                for (eg.r0 r0Var : qg.k.J(hVarK, ed.q.o(b1VarL0 != null ? b1VarL0.getType() : null))) {
                    if (!r0Var.L0().isEmpty() && !(r0Var.Q0() instanceof af.k)) {
                        return j.b.UNKNOWN;
                    }
                }
                he.a aVarBuild = (he.a) aVar.c(new af.i(z1Var, 1, b10 == true ? 1 : 0).c());
                if (aVarBuild == null) {
                    return j.b.UNKNOWN;
                }
                if (aVarBuild instanceof f1) {
                    f1 f1Var = (f1) aVarBuild;
                    List typeParameters2 = f1Var.getTypeParameters();
                    rd.m.d(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        aVarBuild = f1Var.u().o(ed.q.k()).build();
                        rd.m.b(aVarBuild);
                    }
                }
                o.i.a aVarC = qf.o.f25143f.F(aVarBuild, aVar2, false).c();
                rd.m.d(aVarC, "getResult(...)");
                return a.f30665a[aVarC.ordinal()] == 1 ? j.b.OVERRIDABLE : j.b.UNKNOWN;
            }
        }
        return j.b.UNKNOWN;
    }
}
