package jf;

import ed.q;
import gf.o;
import gf.r;
import gf.s;
import gf.t;
import gf.v;
import java.util.ArrayList;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final r a(r rVar, h hVar) {
        m.e(rVar, "<this>");
        m.e(hVar, "typeTable");
        if (rVar.q0()) {
            return rVar.Y();
        }
        if (rVar.r0()) {
            return hVar.a(rVar.Z());
        }
        return null;
    }

    public static final List b(gf.c cVar, h hVar) {
        m.e(cVar, "<this>");
        m.e(hVar, "typeTable");
        List listN0 = cVar.N0();
        if (listN0.isEmpty()) {
            listN0 = null;
        }
        if (listN0 == null) {
            List<Integer> listM0 = cVar.M0();
            m.d(listM0, "getContextReceiverTypeIdList(...)");
            listN0 = new ArrayList(q.v(listM0, 10));
            for (Integer num : listM0) {
                m.b(num);
                listN0.add(hVar.a(num.intValue()));
            }
        }
        return listN0;
    }

    public static final List c(gf.j jVar, h hVar) {
        m.e(jVar, "<this>");
        m.e(hVar, "typeTable");
        List listU0 = jVar.u0();
        if (listU0.isEmpty()) {
            listU0 = null;
        }
        if (listU0 == null) {
            List<Integer> listT0 = jVar.t0();
            m.d(listT0, "getContextReceiverTypeIdList(...)");
            listU0 = new ArrayList(q.v(listT0, 10));
            for (Integer num : listT0) {
                m.b(num);
                listU0.add(hVar.a(num.intValue()));
            }
        }
        return listU0;
    }

    public static final List d(o oVar, h hVar) {
        m.e(oVar, "<this>");
        m.e(hVar, "typeTable");
        List listE0 = oVar.E0();
        if (listE0.isEmpty()) {
            listE0 = null;
        }
        if (listE0 == null) {
            List<Integer> listD0 = oVar.D0();
            m.d(listD0, "getContextReceiverTypeIdList(...)");
            listE0 = new ArrayList(q.v(listD0, 10));
            for (Integer num : listD0) {
                m.b(num);
                listE0.add(hVar.a(num.intValue()));
            }
        }
        return listE0;
    }

    public static final r e(s sVar, h hVar) {
        m.e(sVar, "<this>");
        m.e(hVar, "typeTable");
        if (sVar.o0()) {
            r rVarE0 = sVar.e0();
            m.d(rVarE0, "getExpandedType(...)");
            return rVarE0;
        }
        if (sVar.p0()) {
            return hVar.a(sVar.f0());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final r f(r rVar, h hVar) {
        m.e(rVar, "<this>");
        m.e(hVar, "typeTable");
        if (rVar.v0()) {
            return rVar.i0();
        }
        if (rVar.w0()) {
            return hVar.a(rVar.j0());
        }
        return null;
    }

    public static final boolean g(gf.j jVar) {
        m.e(jVar, "<this>");
        return jVar.U0() || jVar.V0();
    }

    public static final boolean h(o oVar) {
        m.e(oVar, "<this>");
        return oVar.l1() || oVar.m1();
    }

    public static final r i(gf.c cVar, h hVar) {
        m.e(cVar, "<this>");
        m.e(hVar, "typeTable");
        if (cVar.E1()) {
            return cVar.Z0();
        }
        if (cVar.F1()) {
            return hVar.a(cVar.a1());
        }
        return null;
    }

    public static final r j(gf.i iVar, h hVar) {
        m.e(iVar, "<this>");
        m.e(hVar, "typeTable");
        if (iVar.X()) {
            return iVar.K();
        }
        if (iVar.Y()) {
            return hVar.a(iVar.L());
        }
        return null;
    }

    public static final r k(r rVar, h hVar) {
        m.e(rVar, "<this>");
        m.e(hVar, "typeTable");
        if (rVar.y0()) {
            return rVar.l0();
        }
        if (rVar.z0()) {
            return hVar.a(rVar.m0());
        }
        return null;
    }

    public static final r l(gf.j jVar, h hVar) {
        m.e(jVar, "<this>");
        m.e(hVar, "typeTable");
        if (jVar.U0()) {
            return jVar.E0();
        }
        if (jVar.V0()) {
            return hVar.a(jVar.F0());
        }
        return null;
    }

    public static final r m(o oVar, h hVar) {
        m.e(oVar, "<this>");
        m.e(hVar, "typeTable");
        if (oVar.l1()) {
            return oVar.U0();
        }
        if (oVar.m1()) {
            return hVar.a(oVar.V0());
        }
        return null;
    }

    public static final r n(gf.j jVar, h hVar) {
        m.e(jVar, "<this>");
        m.e(hVar, "typeTable");
        if (jVar.W0()) {
            r rVarG0 = jVar.G0();
            m.d(rVarG0, "getReturnType(...)");
            return rVarG0;
        }
        if (jVar.X0()) {
            return hVar.a(jVar.H0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final r o(o oVar, h hVar) {
        m.e(oVar, "<this>");
        m.e(hVar, "typeTable");
        if (oVar.n1()) {
            r rVarW0 = oVar.W0();
            m.d(rVarW0, "getReturnType(...)");
            return rVarW0;
        }
        if (oVar.o1()) {
            return hVar.a(oVar.X0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List p(gf.c cVar, h hVar) {
        m.e(cVar, "<this>");
        m.e(hVar, "typeTable");
        List listQ1 = cVar.q1();
        if (listQ1.isEmpty()) {
            listQ1 = null;
        }
        if (listQ1 == null) {
            List<Integer> listP1 = cVar.p1();
            m.d(listP1, "getSupertypeIdList(...)");
            listQ1 = new ArrayList(q.v(listP1, 10));
            for (Integer num : listP1) {
                m.b(num);
                listQ1.add(hVar.a(num.intValue()));
            }
        }
        return listQ1;
    }

    public static final r q(r.b bVar, h hVar) {
        m.e(bVar, "<this>");
        m.e(hVar, "typeTable");
        if (bVar.x()) {
            return bVar.t();
        }
        if (bVar.z()) {
            return hVar.a(bVar.v());
        }
        return null;
    }

    public static final r r(v vVar, h hVar) {
        m.e(vVar, "<this>");
        m.e(hVar, "typeTable");
        if (vVar.h0()) {
            r rVarA0 = vVar.a0();
            m.d(rVarA0, "getType(...)");
            return rVarA0;
        }
        if (vVar.i0()) {
            return hVar.a(vVar.b0());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final r s(s sVar, h hVar) {
        m.e(sVar, "<this>");
        m.e(hVar, "typeTable");
        if (sVar.s0()) {
            r rVarL0 = sVar.l0();
            m.d(rVarL0, "getUnderlyingType(...)");
            return rVarL0;
        }
        if (sVar.t0()) {
            return hVar.a(sVar.m0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List t(t tVar, h hVar) {
        m.e(tVar, "<this>");
        m.e(hVar, "typeTable");
        List listZ = tVar.Z();
        if (listZ.isEmpty()) {
            listZ = null;
        }
        if (listZ == null) {
            List<Integer> listY = tVar.Y();
            m.d(listY, "getUpperBoundIdList(...)");
            listZ = new ArrayList(q.v(listY, 10));
            for (Integer num : listY) {
                m.b(num);
                listZ.add(hVar.a(num.intValue()));
            }
        }
        return listZ;
    }

    public static final r u(v vVar, h hVar) {
        m.e(vVar, "<this>");
        m.e(hVar, "typeTable");
        if (vVar.j0()) {
            return vVar.c0();
        }
        if (vVar.k0()) {
            return hVar.a(vVar.d0());
        }
        return null;
    }
}
