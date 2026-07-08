package fg;

import ee.o;
import eg.a2;
import eg.b1;
import eg.c1;
import eg.f1;
import eg.f2;
import eg.g2;
import eg.i0;
import eg.i2;
import eg.l2;
import eg.m2;
import eg.q0;
import eg.r0;
import eg.t1;
import eg.u0;
import eg.u1;
import eg.v0;
import eg.v1;
import eg.z0;
import he.f0;
import he.k1;
import he.l1;
import java.util.Collection;
import java.util.List;
import rd.c0;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends g2, ig.t {

    public static final class a {

        /* JADX INFO: renamed from: fg.b$a$a, reason: collision with other inner class name */
        public static final class C0187a extends t1.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f13055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f2 f13056b;

            C0187a(b bVar, f2 f2Var) {
                this.f13055a = bVar;
                this.f13056b = f2Var;
            }

            @Override // eg.t1.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ig.k a(t1 t1Var, ig.i iVar) {
                rd.m.e(t1Var, "state");
                rd.m.e(iVar, "type");
                b bVar = this.f13055a;
                f2 f2Var = this.f13056b;
                ig.i iVarC = bVar.C(iVar);
                rd.m.c(iVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                r0 r0VarN = f2Var.n((r0) iVarC, m2.f12140e);
                rd.m.d(r0VarN, "safeSubstitute(...)");
                ig.k kVarE = bVar.e((ig.i) r0VarN);
                rd.m.b(kVarE);
                return kVarE;
            }
        }

        public static boolean A(b bVar, ig.i iVar, mf.c cVar) {
            rd.m.e(iVar, "$receiver");
            rd.m.e(cVar, "fqName");
            if (iVar instanceof r0) {
                return ((r0) iVar).getAnnotations().H(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static boolean B(b bVar, ig.q qVar, ig.p pVar) {
            rd.m.e(qVar, "$receiver");
            if (!(qVar instanceof l1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + c0.b(qVar.getClass())).toString());
            }
            l1 l1Var = (l1) qVar;
            if (pVar == null ? true : pVar instanceof u1) {
                return jg.d.r(l1Var, (u1) pVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + l1Var + ", " + c0.b(l1Var.getClass())).toString());
        }

        public static boolean C(b bVar, ig.j jVar, ig.j jVar2) {
            rd.m.e(jVar, "a");
            rd.m.e(jVar2, "b");
            if (!(jVar instanceof c1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
            }
            if (jVar2 instanceof c1) {
                return ((c1) jVar).L0() == ((c1) jVar2).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar2 + ", " + c0.b(jVar2.getClass())).toString());
        }

        public static ig.i D(b bVar, Collection collection) {
            rd.m.e(collection, "types");
            return d.a(collection);
        }

        public static boolean E(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                return ee.i.x0((u1) pVar, o.a.f11863b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static boolean F(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                return ((u1) pVar).q() instanceof he.e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static boolean G(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                he.h hVarQ = ((u1) pVar).q();
                he.e eVar = hVarQ instanceof he.e ? (he.e) hVarQ : null;
                return (eVar == null || !f0.a(eVar) || eVar.j() == he.f.f15274e || eVar.j() == he.f.f15275f) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static boolean H(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                return ((u1) pVar).r();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static boolean I(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                return v0.a((r0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static boolean J(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                he.h hVarQ = ((u1) pVar).q();
                he.e eVar = hVarQ instanceof he.e ? (he.e) hVarQ : null;
                return (eVar != null ? eVar.z0() : null) instanceof he.a0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static boolean K(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                return pVar instanceof sf.q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static boolean L(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                return pVar instanceof q0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static boolean M(b bVar) {
            return false;
        }

        public static boolean N(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            return (iVar instanceof c1) && ((c1) iVar).O0();
        }

        public static boolean O(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            return iVar instanceof z0;
        }

        public static boolean P(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                return ee.i.x0((u1) pVar, o.a.f11865c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static boolean Q(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                return i2.l((r0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static boolean R(b bVar, ig.d dVar) {
            rd.m.e(dVar, "$receiver");
            return dVar instanceof rf.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(b bVar, ig.k kVar) {
            rd.m.e(kVar, "$receiver");
            if (kVar instanceof r0) {
                return ee.i.t0((r0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + c0.b(kVar.getClass())).toString());
        }

        public static boolean T(b bVar, ig.d dVar) {
            rd.m.e(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + c0.b(dVar.getClass())).toString());
        }

        public static boolean U(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                return iVar instanceof b1;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(b bVar, ig.j jVar) {
            rd.m.e(jVar, "$receiver");
            if (jVar instanceof c1) {
                if (v0.a((r0) jVar)) {
                    return false;
                }
                c1 c1Var = (c1) jVar;
                if (c1Var.N0().q() instanceof k1) {
                    return false;
                }
                return c1Var.N0().q() != null || (jVar instanceof rf.a) || (jVar instanceof i) || (jVar instanceof eg.y) || (c1Var.N0() instanceof sf.q) || W(bVar, (ig.k) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        private static boolean W(b bVar, ig.k kVar) {
            return (kVar instanceof f1) && bVar.a(((f1) kVar).G0());
        }

        public static boolean X(b bVar, ig.m mVar) {
            rd.m.e(mVar, "$receiver");
            if (mVar instanceof a2) {
                return ((a2) mVar).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + c0.b(mVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(b bVar, ig.j jVar) {
            rd.m.e(jVar, "$receiver");
            if (jVar instanceof c1) {
                return jg.d.u((r0) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(b bVar, ig.j jVar) {
            rd.m.e(jVar, "$receiver");
            if (jVar instanceof c1) {
                return jg.d.v((r0) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        public static boolean a(b bVar, ig.p pVar, ig.p pVar2) {
            rd.m.e(pVar, "c1");
            rd.m.e(pVar2, "c2");
            if (!(pVar instanceof u1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
            }
            if (pVar2 instanceof u1) {
                return rd.m.a(pVar, pVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar2 + ", " + c0.b(pVar2.getClass())).toString());
        }

        public static boolean a0(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (!(iVar instanceof l2)) {
                return false;
            }
            ((l2) iVar).N0();
            return false;
        }

        public static int b(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                return ((r0) iVar).L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static boolean b0(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                he.h hVarQ = ((u1) pVar).q();
                return hVarQ != null && ee.i.C0(hVarQ);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ig.l c(b bVar, ig.j jVar) {
            rd.m.e(jVar, "$receiver");
            if (jVar instanceof c1) {
                return (ig.l) jVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        public static ig.k c0(b bVar, ig.g gVar) {
            rd.m.e(gVar, "$receiver");
            if (gVar instanceof i0) {
                return ((i0) gVar).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + c0.b(gVar.getClass())).toString());
        }

        public static ig.d d(b bVar, ig.k kVar) {
            rd.m.e(kVar, "$receiver");
            if (kVar instanceof c1) {
                if (kVar instanceof f1) {
                    return bVar.d(((f1) kVar).G0());
                }
                if (kVar instanceof i) {
                    return (i) kVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + c0.b(kVar.getClass())).toString());
        }

        public static ig.i d0(b bVar, ig.d dVar) {
            rd.m.e(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + c0.b(dVar.getClass())).toString());
        }

        public static ig.e e(b bVar, ig.j jVar) {
            rd.m.e(jVar, "$receiver");
            if (jVar instanceof c1) {
                if (jVar instanceof eg.y) {
                    return (eg.y) jVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        public static ig.i e0(b bVar, ig.i iVar, boolean z10) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof l2) {
                return c.b((l2) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static ig.f f(b bVar, ig.g gVar) {
            rd.m.e(gVar, "$receiver");
            if (gVar instanceof i0) {
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + c0.b(gVar.getClass())).toString());
        }

        public static t1 f0(b bVar, boolean z10, boolean z11, boolean z12) {
            return fg.a.b(z10, z11, bVar, null, null, 24, null);
        }

        public static ig.g g(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                l2 l2VarQ0 = ((r0) iVar).Q0();
                if (l2VarQ0 instanceof i0) {
                    return (i0) l2VarQ0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static ig.k g0(b bVar, ig.e eVar) {
            rd.m.e(eVar, "$receiver");
            if (eVar instanceof eg.y) {
                return ((eg.y) eVar).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + c0.b(eVar.getClass())).toString());
        }

        public static ig.k h(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                l2 l2VarQ0 = ((r0) iVar).Q0();
                if (l2VarQ0 instanceof c1) {
                    return (c1) l2VarQ0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static int h0(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                return ((u1) pVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ig.m i(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                return jg.d.d((r0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static Collection i0(b bVar, ig.j jVar) {
            rd.m.e(jVar, "$receiver");
            ig.p pVarF = bVar.f(jVar);
            if (pVarF instanceof sf.q) {
                return ((sf.q) pVarF).f();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        public static c1 j(b bVar, ig.j jVar, ig.b bVar2) {
            rd.m.e(jVar, "type");
            rd.m.e(bVar2, "status");
            if (jVar instanceof c1) {
                return o.b((c1) jVar, bVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        public static ig.m j0(b bVar, ig.c cVar) {
            rd.m.e(cVar, "$receiver");
            if (cVar instanceof n) {
                return ((n) cVar).s();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + c0.b(cVar.getClass())).toString());
        }

        public static ig.b k(b bVar, ig.d dVar) {
            rd.m.e(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + c0.b(dVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static t1.c k0(b bVar, ig.j jVar) {
            rd.m.e(jVar, "type");
            if (jVar instanceof c1) {
                return new C0187a(bVar, v1.f12211c.a((r0) jVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        public static ig.i l(b bVar, ig.j jVar, ig.j jVar2) {
            rd.m.e(jVar, "lowerBound");
            rd.m.e(jVar2, "upperBound");
            if (!(jVar instanceof c1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + c0.b(bVar.getClass())).toString());
            }
            if (jVar2 instanceof c1) {
                return u0.e((c1) jVar, (c1) jVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + c0.b(bVar.getClass())).toString());
        }

        public static Collection l0(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                Collection collectionE = ((u1) pVar).e();
                rd.m.d(collectionE, "getSupertypes(...)");
                return collectionE;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ig.m m(b bVar, ig.i iVar, int i10) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                return (ig.m) ((r0) iVar).L0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static ig.c m0(b bVar, ig.d dVar) {
            rd.m.e(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + c0.b(dVar.getClass())).toString());
        }

        public static List n(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                return ((r0) iVar).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static ig.p n0(b bVar, ig.j jVar) {
            rd.m.e(jVar, "$receiver");
            if (jVar instanceof c1) {
                return ((c1) jVar).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        public static mf.d o(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                he.h hVarQ = ((u1) pVar).q();
                rd.m.c(hVarQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return uf.e.p((he.e) hVarQ);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ig.k o0(b bVar, ig.g gVar) {
            rd.m.e(gVar, "$receiver");
            if (gVar instanceof i0) {
                return ((i0) gVar).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + c0.b(gVar.getClass())).toString());
        }

        public static ig.q p(b bVar, ig.p pVar, int i10) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                Object obj = ((u1) pVar).getParameters().get(i10);
                rd.m.d(obj, "get(...)");
                return (ig.q) obj;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ig.i p0(b bVar, ig.i iVar, boolean z10) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof ig.j) {
                return bVar.b((ig.j) iVar, z10);
            }
            if (!(iVar instanceof ig.g)) {
                throw new IllegalStateException("sealed");
            }
            ig.g gVar = (ig.g) iVar;
            return bVar.v0(bVar.b((ig.j) bVar.c(gVar), z10), bVar.b((ig.j) bVar.g(gVar), z10));
        }

        public static List q(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                List parameters = ((u1) pVar).getParameters();
                rd.m.d(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ig.k q0(b bVar, ig.j jVar, boolean z10) {
            rd.m.e(jVar, "$receiver");
            if (jVar instanceof c1) {
                return ((c1) jVar).R0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + c0.b(jVar.getClass())).toString());
        }

        public static ee.l r(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                he.h hVarQ = ((u1) pVar).q();
                rd.m.c(hVarQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return ee.i.Q((he.e) hVarQ);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ee.l s(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                he.h hVarQ = ((u1) pVar).q();
                rd.m.c(hVarQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return ee.i.T((he.e) hVarQ);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ig.i t(b bVar, ig.q qVar) {
            rd.m.e(qVar, "$receiver");
            if (qVar instanceof l1) {
                return jg.d.o((l1) qVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + c0.b(qVar.getClass())).toString());
        }

        public static ig.i u(b bVar, ig.m mVar) {
            rd.m.e(mVar, "$receiver");
            if (bVar.h(mVar)) {
                return null;
            }
            if (mVar instanceof a2) {
                return ((a2) mVar).getType().Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + c0.b(mVar.getClass())).toString());
        }

        public static ig.q v(b bVar, ig.p pVar) {
            rd.m.e(pVar, "$receiver");
            if (pVar instanceof u1) {
                he.h hVarQ = ((u1) pVar).q();
                if (hVarQ instanceof l1) {
                    return (l1) hVarQ;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + c0.b(pVar.getClass())).toString());
        }

        public static ig.i w(b bVar, ig.i iVar) {
            rd.m.e(iVar, "$receiver");
            if (iVar instanceof r0) {
                return qf.k.k((r0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + c0.b(iVar.getClass())).toString());
        }

        public static List x(b bVar, ig.q qVar) {
            rd.m.e(qVar, "$receiver");
            if (qVar instanceof l1) {
                List upperBounds = ((l1) qVar).getUpperBounds();
                rd.m.d(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + c0.b(qVar.getClass())).toString());
        }

        public static ig.v y(b bVar, ig.m mVar) {
            rd.m.e(mVar, "$receiver");
            if (mVar instanceof a2) {
                m2 m2VarA = ((a2) mVar).a();
                rd.m.d(m2VarA, "getProjectionKind(...)");
                return ig.s.a(m2VarA);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + c0.b(mVar.getClass())).toString());
        }

        public static ig.v z(b bVar, ig.q qVar) {
            rd.m.e(qVar, "$receiver");
            if (qVar instanceof l1) {
                m2 m2VarN = ((l1) qVar).n();
                rd.m.d(m2VarN, "getVariance(...)");
                return ig.s.a(m2VarN);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + c0.b(qVar.getClass())).toString());
        }
    }

    @Override // ig.r
    boolean a(ig.j jVar);

    @Override // ig.r
    ig.k b(ig.j jVar, boolean z10);

    @Override // ig.r
    ig.k c(ig.g gVar);

    @Override // ig.r
    ig.d d(ig.k kVar);

    @Override // ig.r
    ig.k e(ig.i iVar);

    @Override // ig.r
    ig.p f(ig.j jVar);

    @Override // ig.r
    ig.k g(ig.g gVar);

    @Override // ig.r
    boolean h(ig.m mVar);

    ig.i v0(ig.j jVar, ig.j jVar2);
}
