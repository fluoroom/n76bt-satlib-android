package uf;

import ed.q;
import ee.i;
import eg.r0;
import fg.g;
import he.a0;
import he.h0;
import he.i0;
import he.n0;
import he.q1;
import he.s1;
import he.x0;
import he.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import mf.f;
import og.b;
import qg.h;
import qg.k;
import rd.b0;
import rd.l;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a */
    private static final f f29144a;

    static final /* synthetic */ class a extends l implements qd.l {

        /* JADX INFO: renamed from: s */
        public static final a f29145s = new a();

        a() {
            super(1, s1.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p */
        public final Boolean l(s1 s1Var) {
            m.e(s1Var, "p0");
            return Boolean.valueOf(s1Var.u0());
        }
    }

    public static final class b extends b.AbstractC0321b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ b0 f29146a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ qd.l f29147b;

        b(b0 b0Var, qd.l lVar) {
            this.f29146a = b0Var;
            this.f29147b = lVar;
        }

        @Override // og.b.AbstractC0321b, og.b.d
        /* JADX INFO: renamed from: d */
        public void b(he.b bVar) {
            m.e(bVar, "current");
            if (this.f29146a.f25935a == null && ((Boolean) this.f29147b.l(bVar)).booleanValue()) {
                this.f29146a.f25935a = bVar;
            }
        }

        @Override // og.b.d
        /* JADX INFO: renamed from: e */
        public boolean c(he.b bVar) {
            m.e(bVar, "current");
            return this.f29146a.f25935a == null;
        }

        @Override // og.b.d
        /* JADX INFO: renamed from: f */
        public he.b a() {
            return (he.b) this.f29146a.f25935a;
        }
    }

    static {
        f fVarH = f.h("value");
        m.d(fVarH, "identifier(...)");
        f29144a = fVarH;
    }

    public static final h A(boolean z10, he.b bVar) {
        m.b(bVar);
        return z(bVar, z10);
    }

    public static final he.e B(h0 h0Var, mf.c cVar, pe.b bVar) {
        m.e(h0Var, "<this>");
        m.e(cVar, "topLevelClassFqName");
        m.e(bVar, "location");
        cVar.c();
        he.h hVarG = h0Var.y(cVar.d()).p().g(cVar.f(), bVar);
        if (hVarG instanceof he.e) {
            return (he.e) hVarG;
        }
        return null;
    }

    public static final he.m a(he.m mVar) {
        m.e(mVar, "it");
        return mVar.b();
    }

    public static final boolean f(s1 s1Var) {
        m.e(s1Var, "<this>");
        Boolean boolE = og.b.e(q.e(s1Var), uf.a.f29140a, a.f29145s);
        m.d(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    public static final Iterable g(s1 s1Var) {
        Collection collectionE = s1Var.e();
        ArrayList arrayList = new ArrayList(q.v(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(((s1) it.next()).a());
        }
        return arrayList;
    }

    public static final he.b h(he.b bVar, boolean z10, qd.l lVar) {
        m.e(bVar, "<this>");
        m.e(lVar, "predicate");
        return (he.b) og.b.b(q.e(bVar), new c(z10), new b(new b0(), lVar));
    }

    public static /* synthetic */ he.b i(he.b bVar, boolean z10, qd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(bVar, z10, lVar);
    }

    public static final Iterable j(boolean z10, he.b bVar) {
        Collection collectionE;
        if (z10) {
            bVar = bVar != null ? bVar.a() : null;
        }
        return (bVar == null || (collectionE = bVar.e()) == null) ? q.k() : collectionE;
    }

    public static final mf.c k(he.m mVar) {
        m.e(mVar, "<this>");
        mf.d dVarP = p(mVar);
        if (!dVarP.f()) {
            dVarP = null;
        }
        if (dVarP != null) {
            return dVarP.m();
        }
        return null;
    }

    public static final he.e l(ie.c cVar) {
        m.e(cVar, "<this>");
        he.h hVarQ = cVar.getType().N0().q();
        if (hVarQ instanceof he.e) {
            return (he.e) hVarQ;
        }
        return null;
    }

    public static final i m(he.m mVar) {
        m.e(mVar, "<this>");
        return s(mVar).o();
    }

    public static final mf.b n(he.h hVar) {
        he.m mVarB;
        mf.b bVarN;
        if (hVar != null && (mVarB = hVar.b()) != null) {
            if (mVarB instanceof n0) {
                mf.c cVarD = ((n0) mVarB).d();
                f name = hVar.getName();
                m.d(name, "getName(...)");
                return new mf.b(cVarD, name);
            }
            if ((mVarB instanceof he.i) && (bVarN = n((he.h) mVarB)) != null) {
                f name2 = hVar.getName();
                m.d(name2, "getName(...)");
                return bVarN.d(name2);
            }
        }
        return null;
    }

    public static final mf.c o(he.m mVar) {
        m.e(mVar, "<this>");
        mf.c cVarN = qf.i.n(mVar);
        m.d(cVarN, "getFqNameSafe(...)");
        return cVarN;
    }

    public static final mf.d p(he.m mVar) {
        m.e(mVar, "<this>");
        mf.d dVarM = qf.i.m(mVar);
        m.d(dVarM, "getFqName(...)");
        return dVarM;
    }

    public static final a0 q(he.e eVar) {
        q1 q1VarZ0 = eVar != null ? eVar.z0() : null;
        if (q1VarZ0 instanceof a0) {
            return (a0) q1VarZ0;
        }
        return null;
    }

    public static final g r(h0 h0Var) {
        m.e(h0Var, "<this>");
        android.support.v4.media.session.b.a(h0Var.A0(fg.h.a()));
        return g.a.f13059a;
    }

    public static final h0 s(he.m mVar) {
        m.e(mVar, "<this>");
        h0 h0VarG = qf.i.g(mVar);
        m.d(h0VarG, "getContainingModule(...)");
        return h0VarG;
    }

    public static final i0 t(he.e eVar) {
        q1 q1VarZ0 = eVar != null ? eVar.z0() : null;
        if (q1VarZ0 instanceof i0) {
            return (i0) q1VarZ0;
        }
        return null;
    }

    public static final h u(he.m mVar) {
        m.e(mVar, "<this>");
        return k.w(v(mVar), 1);
    }

    public static final h v(he.m mVar) {
        m.e(mVar, "<this>");
        return k.n(mVar, uf.b.f29141a);
    }

    public static final he.b w(he.b bVar) {
        m.e(bVar, "<this>");
        if (!(bVar instanceof x0)) {
            return bVar;
        }
        y0 y0VarC0 = ((x0) bVar).C0();
        m.d(y0VarC0, "getCorrespondingProperty(...)");
        return y0VarC0;
    }

    public static final he.e x(he.e eVar) {
        m.e(eVar, "<this>");
        for (r0 r0Var : eVar.s().N0().e()) {
            if (!i.c0(r0Var)) {
                he.h hVarQ = r0Var.N0().q();
                if (qf.i.w(hVarQ)) {
                    m.c(hVarQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (he.e) hVarQ;
                }
            }
        }
        return null;
    }

    public static final boolean y(h0 h0Var) {
        m.e(h0Var, "<this>");
        android.support.v4.media.session.b.a(h0Var.A0(fg.h.a()));
        return false;
    }

    public static final h z(he.b bVar, boolean z10) {
        m.e(bVar, "<this>");
        if (z10) {
            bVar = bVar.a();
        }
        h hVarS = k.s(bVar);
        Collection collectionE = bVar.e();
        m.d(collectionE, "getOverriddenDescriptors(...)");
        return k.L(hVarS, k.C(q.S(collectionE), new d(z10)));
    }
}
