package fe;

import d.h0;
import ed.g0;
import ed.q;
import eg.c1;
import eg.f2;
import eg.m2;
import eg.r0;
import he.b;
import he.b1;
import he.e0;
import he.g1;
import he.l1;
import he.s1;
import he.t;
import he.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ke.o0;
import ke.s;
import ke.u0;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends o0 {
    public static final a N = new a(null);

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private final s1 b(e eVar, int i10, l1 l1Var) {
            String lowerCase;
            String strD = l1Var.getName().d();
            m.d(strD, "asString(...)");
            if (m.a(strD, "T")) {
                lowerCase = "instance";
            } else if (m.a(strD, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strD.toLowerCase(Locale.ROOT);
                m.d(lowerCase, "toLowerCase(...)");
            }
            ie.h hVarB = ie.h.f16054l.b();
            mf.f fVarH = mf.f.h(lowerCase);
            m.d(fVarH, "identifier(...)");
            c1 c1VarS = l1Var.s();
            m.d(c1VarS, "getDefaultType(...)");
            g1 g1Var = g1.f15281a;
            m.d(g1Var, "NO_SOURCE");
            return new u0(eVar, null, i10, hVarB, fVarH, c1VarS, false, false, false, null, g1Var);
        }

        public final e a(b bVar, boolean z10) {
            m.e(bVar, "functionClass");
            List listV = bVar.v();
            e eVar = new e(bVar, null, b.a.DECLARATION, z10, null);
            b1 b1VarJ0 = bVar.J0();
            List listK = q.k();
            List listK2 = q.k();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listV) {
                if (((l1) obj).n() != m2.f12141f) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<g0> iterableO0 = q.O0(arrayList);
            ArrayList arrayList2 = new ArrayList(q.v(iterableO0, 10));
            for (g0 g0Var : iterableO0) {
                arrayList2.add(e.N.b(eVar, g0Var.c(), (l1) g0Var.d()));
            }
            eVar.R0(null, b1VarJ0, listK, listK2, arrayList2, ((l1) q.k0(listV)).s(), e0.f15262e, t.f15309e);
            eVar.Z0(true);
            return eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(he.m mVar, e eVar, b.a aVar, boolean z10, h hVar) {
        this(mVar, eVar, aVar, z10);
    }

    private final z p1(List list) {
        mf.f fVar;
        int size = i().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List listI = i();
            m.d(listI, "getValueParameters(...)");
            List<dd.q> listQ0 = q.Q0(list, listI);
            if (h0.a(listQ0) && listQ0.isEmpty()) {
                return this;
            }
            for (dd.q qVar : listQ0) {
                if (!m.a((mf.f) qVar.a(), ((s1) qVar.b()).getName())) {
                }
            }
            return this;
        }
        List<s1> listI2 = i();
        m.d(listI2, "getValueParameters(...)");
        ArrayList arrayList = new ArrayList(q.v(listI2, 10));
        for (s1 s1Var : listI2) {
            mf.f name = s1Var.getName();
            m.d(name, "getName(...)");
            int index = s1Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = (mf.f) list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(s1Var.x(this, name, index));
        }
        s.c cVarS0 = S0(f2.f12087b);
        if (list.isEmpty()) {
            z10 = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((mf.f) it.next()) == null) {
                    break;
                }
            }
            z10 = false;
        }
        s.c cVarB = cVarS0.G(z10).c(arrayList).b(a());
        m.d(cVarB, "setOriginal(...)");
        z zVarM0 = super.M0(cVarB);
        m.b(zVarM0);
        return zVarM0;
    }

    @Override // ke.s, he.d0
    public boolean A() {
        return false;
    }

    @Override // ke.o0, ke.s
    /* JADX INFO: renamed from: L0 */
    protected s o1(he.m mVar, z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        m.e(mVar, "newOwner");
        m.e(aVar, "kind");
        m.e(hVar, "annotations");
        m.e(g1Var, "source");
        return new e(mVar, (e) zVar, aVar, t());
    }

    @Override // ke.s
    protected z M0(s.c cVar) {
        m.e(cVar, "configuration");
        e eVar = (e) super.M0(cVar);
        if (eVar == null) {
            return null;
        }
        List listI = eVar.i();
        m.d(listI, "getValueParameters(...)");
        if (h0.a(listI) && listI.isEmpty()) {
            return eVar;
        }
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            r0 type = ((s1) it.next()).getType();
            m.d(type, "getType(...)");
            if (ee.h.d(type) != null) {
                List listI2 = eVar.i();
                m.d(listI2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(q.v(listI2, 10));
                Iterator it2 = listI2.iterator();
                while (it2.hasNext()) {
                    r0 type2 = ((s1) it2.next()).getType();
                    m.d(type2, "getType(...)");
                    arrayList.add(ee.h.d(type2));
                }
                return eVar.p1(arrayList);
            }
        }
        return eVar;
    }

    @Override // ke.s, he.z
    public boolean R() {
        return false;
    }

    @Override // ke.s, he.z
    public boolean isInline() {
        return false;
    }

    private e(he.m mVar, e eVar, b.a aVar, boolean z10) {
        super(mVar, eVar, ie.h.f16054l.b(), lg.t.f20630i, aVar, g1.f15281a);
        f1(true);
        h1(z10);
        Y0(false);
    }
}
