package ve;

import ef.s;
import he.s1;
import java.util.List;
import qf.j;
import ve.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements qf.j {

    /* JADX INFO: renamed from: a */
    public static final a f30721a = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private final boolean b(he.z zVar) {
            if (zVar.i().size() != 1) {
                return false;
            }
            he.m mVarB = zVar.b();
            he.e eVar = mVarB instanceof he.e ? (he.e) mVarB : null;
            if (eVar == null) {
                return false;
            }
            List listI = zVar.i();
            rd.m.d(listI, "getValueParameters(...)");
            he.h hVarQ = ((s1) ed.q.w0(listI)).getType().N0().q();
            he.e eVar2 = hVarQ instanceof he.e ? (he.e) hVarQ : null;
            return eVar2 != null && ee.i.s0(eVar) && rd.m.a(uf.e.o(eVar), uf.e.o(eVar2));
        }

        private final ef.s c(he.z zVar, s1 s1Var) {
            if (ef.c0.e(zVar) || b(zVar)) {
                eg.r0 type = s1Var.getType();
                rd.m.d(type, "getType(...)");
                return ef.c0.g(jg.d.B(type));
            }
            eg.r0 type2 = s1Var.getType();
            rd.m.d(type2, "getType(...)");
            return ef.c0.g(type2);
        }

        public final boolean a(he.a aVar, he.a aVar2) {
            rd.m.e(aVar, "superDescriptor");
            rd.m.e(aVar2, "subDescriptor");
            if ((aVar2 instanceof xe.e) && (aVar instanceof he.z)) {
                xe.e eVar = (xe.e) aVar2;
                eVar.i().size();
                he.z zVar = (he.z) aVar;
                zVar.i().size();
                List listI = eVar.a().i();
                rd.m.d(listI, "getValueParameters(...)");
                List listI2 = zVar.a().i();
                rd.m.d(listI2, "getValueParameters(...)");
                for (dd.q qVar : ed.q.Q0(listI, listI2)) {
                    s1 s1Var = (s1) qVar.a();
                    s1 s1Var2 = (s1) qVar.b();
                    rd.m.b(s1Var);
                    boolean z10 = c((he.z) aVar2, s1Var) instanceof s.d;
                    rd.m.b(s1Var2);
                    if (z10 != (c(zVar, s1Var2) instanceof s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean c(he.a aVar, he.a aVar2, he.e eVar) {
        if ((aVar instanceof he.b) && (aVar2 instanceof he.z) && !ee.i.h0(aVar2)) {
            i iVar = i.f30587o;
            he.z zVar = (he.z) aVar2;
            mf.f name = zVar.getName();
            rd.m.d(name, "getName(...)");
            if (!iVar.n(name)) {
                u0.a aVar3 = u0.f30675a;
                mf.f name2 = zVar.getName();
                rd.m.d(name2, "getName(...)");
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            he.b bVarJ = t0.j((he.b) aVar);
            boolean z10 = aVar instanceof he.z;
            he.z zVar2 = z10 ? (he.z) aVar : null;
            if (!(zVar2 != null && zVar.w0() == zVar2.w0()) && (bVarJ == null || !zVar.w0())) {
                return true;
            }
            if ((eVar instanceof xe.c) && zVar.e0() == null && bVarJ != null && !t0.l(eVar, bVarJ)) {
                if ((bVarJ instanceof he.z) && z10 && i.l((he.z) bVarJ) != null) {
                    String strC = ef.c0.c(zVar, false, false, 2, null);
                    he.z zVarA = ((he.z) aVar).a();
                    rd.m.d(zVarA, "getOriginal(...)");
                    if (rd.m.a(strC, ef.c0.c(zVarA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // qf.j
    public j.a a() {
        return j.a.CONFLICTS_ONLY;
    }

    @Override // qf.j
    public j.b b(he.a aVar, he.a aVar2, he.e eVar) {
        rd.m.e(aVar, "superDescriptor");
        rd.m.e(aVar2, "subDescriptor");
        return c(aVar, aVar2, eVar) ? j.b.INCOMPATIBLE : f30721a.a(aVar, aVar2) ? j.b.INCOMPATIBLE : j.b.UNKNOWN;
    }
}
