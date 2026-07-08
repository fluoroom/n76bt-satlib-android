package pf;

import he.l1;
import he.n0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24139a = new a();

        private a() {
        }

        @Override // pf.b
        public String a(he.h hVar, n nVar) {
            rd.m.e(hVar, "classifier");
            rd.m.e(nVar, "renderer");
            if (hVar instanceof l1) {
                mf.f name = ((l1) hVar).getName();
                rd.m.d(name, "getName(...)");
                return nVar.R(name, false);
            }
            mf.d dVarM = qf.i.m(hVar);
            rd.m.d(dVarM, "getFqName(...)");
            return nVar.Q(dVarM);
        }
    }

    /* JADX INFO: renamed from: pf.b$b, reason: collision with other inner class name */
    public static final class C0331b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0331b f24140a = new C0331b();

        private C0331b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [he.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [he.j0, he.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [he.m] */
        @Override // pf.b
        public String a(he.h hVar, n nVar) {
            rd.m.e(hVar, "classifier");
            rd.m.e(nVar, "renderer");
            if (hVar instanceof l1) {
                mf.f name = ((l1) hVar).getName();
                rd.m.d(name, "getName(...)");
                return nVar.R(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(hVar.getName());
                hVar = hVar.b();
            } while (hVar instanceof he.e);
            return g0.c(ed.q.L(arrayList));
        }
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f24141a = new c();

        private c() {
        }

        private final String b(he.h hVar) {
            mf.f name = hVar.getName();
            rd.m.d(name, "getName(...)");
            String strB = g0.b(name);
            if (hVar instanceof l1) {
                return strB;
            }
            he.m mVarB = hVar.b();
            rd.m.d(mVarB, "getContainingDeclaration(...)");
            String strC = c(mVarB);
            if (strC == null || rd.m.a(strC, "")) {
                return strB;
            }
            return strC + '.' + strB;
        }

        private final String c(he.m mVar) {
            if (mVar instanceof he.e) {
                return b((he.h) mVar);
            }
            if (mVar instanceof n0) {
                return g0.a(((n0) mVar).d().i());
            }
            return null;
        }

        @Override // pf.b
        public String a(he.h hVar, n nVar) {
            rd.m.e(hVar, "classifier");
            rd.m.e(nVar, "renderer");
            return b(hVar);
        }
    }

    String a(he.h hVar, n nVar);
}
