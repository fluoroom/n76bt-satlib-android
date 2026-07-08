package oj;

import zj.k1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends Enum {

    /* JADX INFO: renamed from: a */
    public static final m f23637a;

    /* JADX INFO: renamed from: b */
    public static final m f23638b;

    /* JADX INFO: renamed from: c */
    public static final m f23639c;

    /* JADX INFO: renamed from: d */
    public static final m f23640d;

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ m[] f23641e;

    enum a extends m {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // oj.m
        public void d(l lVar, n nVar, double[] dArr, double[] dArr2) {
            k1 k1VarT = lVar.T();
            xi.f fVarT = k1VarT.t();
            xi.f fVarS = k1VarT.s();
            dArr[0] = fVarT.j();
            dArr[1] = fVarT.k();
            dArr[2] = fVarT.l();
            dArr[3] = fVarS.j();
            dArr[4] = fVarS.k();
            dArr[5] = fVarS.l();
            if (dArr2 != null) {
                xi.f fVarO = k1VarT.o();
                dArr2[0] = fVarS.j();
                dArr2[1] = fVarS.k();
                dArr2[2] = fVarS.l();
                dArr2[3] = fVarO.j();
                dArr2[4] = fVarO.k();
                dArr2[5] = fVarO.l();
            }
        }

        @Override // oj.m
        /* JADX INFO: renamed from: e */
        public oj.a a(l lVar) {
            return lVar.W() == this ? (oj.a) lVar : new oj.a(lVar);
        }
    }

    enum b extends m {
        b(String str, int i10) {
            super(str, i10, null);
        }

        @Override // oj.m
        public void d(l lVar, n nVar, double[] dArr, double[] dArr2) {
            oj.c cVar = (oj.c) m.f23638b.a(lVar);
            dArr[0] = cVar.B();
            dArr[1] = cVar.o0();
            dArr[2] = cVar.q0();
            dArr[3] = cVar.N();
            dArr[4] = cVar.u0();
            dArr[5] = cVar.g0(nVar);
            if (dArr2 != null) {
                dArr2[0] = cVar.C();
                dArr2[1] = cVar.p0();
                dArr2[2] = cVar.r0();
                dArr2[3] = cVar.s0();
                dArr2[4] = cVar.v0();
                dArr2[5] = cVar.h0(nVar);
            }
        }

        @Override // oj.m
        /* JADX INFO: renamed from: e */
        public oj.c a(l lVar) {
            return lVar.W() == this ? (oj.c) lVar : new oj.c(lVar);
        }
    }

    enum c extends m {
        c(String str, int i10) {
            super(str, i10, null);
        }

        @Override // oj.m
        public void d(l lVar, n nVar, double[] dArr, double[] dArr2) {
            e eVar = (e) m.f23639c.a(lVar);
            dArr[0] = eVar.B();
            dArr[1] = eVar.E();
            dArr[2] = eVar.G();
            dArr[3] = eVar.J();
            dArr[4] = eVar.L();
            dArr[5] = eVar.g0(nVar);
            if (dArr2 != null) {
                dArr2[0] = eVar.C();
                dArr2[1] = eVar.F();
                dArr2[2] = eVar.H();
                dArr2[3] = eVar.K();
                dArr2[4] = eVar.M();
                dArr2[5] = eVar.h0(nVar);
            }
        }

        @Override // oj.m
        /* JADX INFO: renamed from: e */
        public e a(l lVar) {
            return lVar.W() == this ? (e) lVar : new e(lVar);
        }
    }

    enum d extends m {
        d(String str, int i10) {
            super(str, i10, null);
        }

        @Override // oj.m
        public void d(l lVar, n nVar, double[] dArr, double[] dArr2) {
            k kVar = (k) m.f23640d.a(lVar);
            dArr[0] = kVar.B();
            dArr[1] = kVar.p0();
            dArr[2] = kVar.N();
            dArr[3] = kVar.w0();
            dArr[4] = kVar.y0();
            dArr[5] = kVar.n0(nVar);
            if (dArr2 != null) {
                dArr2[0] = kVar.C();
                dArr2[1] = kVar.q0();
                dArr2[2] = kVar.t0();
                dArr2[3] = kVar.x0();
                dArr2[4] = kVar.z0();
                dArr2[5] = kVar.o0(nVar);
            }
        }

        @Override // oj.m
        /* JADX INFO: renamed from: e */
        public k a(l lVar) {
            return lVar.W() == this ? (k) lVar : new k(lVar);
        }
    }

    static {
        a aVar = new a("CARTESIAN", 0);
        f23637a = aVar;
        b bVar = new m("CIRCULAR", 1) { // from class: oj.m.b
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // oj.m
            public void d(l lVar, n nVar, double[] dArr, double[] dArr2) {
                oj.c cVar = (oj.c) m.f23638b.a(lVar);
                dArr[0] = cVar.B();
                dArr[1] = cVar.o0();
                dArr[2] = cVar.q0();
                dArr[3] = cVar.N();
                dArr[4] = cVar.u0();
                dArr[5] = cVar.g0(nVar);
                if (dArr2 != null) {
                    dArr2[0] = cVar.C();
                    dArr2[1] = cVar.p0();
                    dArr2[2] = cVar.r0();
                    dArr2[3] = cVar.s0();
                    dArr2[4] = cVar.v0();
                    dArr2[5] = cVar.h0(nVar);
                }
            }

            @Override // oj.m
            /* JADX INFO: renamed from: e */
            public oj.c a(l lVar) {
                return lVar.W() == this ? (oj.c) lVar : new oj.c(lVar);
            }
        };
        f23638b = bVar;
        c cVar = new m("EQUINOCTIAL", 2) { // from class: oj.m.c
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // oj.m
            public void d(l lVar, n nVar, double[] dArr, double[] dArr2) {
                e eVar = (e) m.f23639c.a(lVar);
                dArr[0] = eVar.B();
                dArr[1] = eVar.E();
                dArr[2] = eVar.G();
                dArr[3] = eVar.J();
                dArr[4] = eVar.L();
                dArr[5] = eVar.g0(nVar);
                if (dArr2 != null) {
                    dArr2[0] = eVar.C();
                    dArr2[1] = eVar.F();
                    dArr2[2] = eVar.H();
                    dArr2[3] = eVar.K();
                    dArr2[4] = eVar.M();
                    dArr2[5] = eVar.h0(nVar);
                }
            }

            @Override // oj.m
            /* JADX INFO: renamed from: e */
            public e a(l lVar) {
                return lVar.W() == this ? (e) lVar : new e(lVar);
            }
        };
        f23639c = cVar;
        d dVar = new m("KEPLERIAN", 3) { // from class: oj.m.d
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // oj.m
            public void d(l lVar, n nVar, double[] dArr, double[] dArr2) {
                k kVar = (k) m.f23640d.a(lVar);
                dArr[0] = kVar.B();
                dArr[1] = kVar.p0();
                dArr[2] = kVar.N();
                dArr[3] = kVar.w0();
                dArr[4] = kVar.y0();
                dArr[5] = kVar.n0(nVar);
                if (dArr2 != null) {
                    dArr2[0] = kVar.C();
                    dArr2[1] = kVar.q0();
                    dArr2[2] = kVar.t0();
                    dArr2[3] = kVar.x0();
                    dArr2[4] = kVar.z0();
                    dArr2[5] = kVar.o0(nVar);
                }
            }

            @Override // oj.m
            /* JADX INFO: renamed from: e */
            public k a(l lVar) {
                return lVar.W() == this ? (k) lVar : new k(lVar);
            }
        };
        f23640d = dVar;
        f23641e = new m[]{aVar, bVar, cVar, dVar};
    }

    private m(String str, int i10) {
        super(str, i10);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f23641e.clone();
    }

    public abstract l a(l lVar);

    public abstract void d(l lVar, n nVar, double[] dArr, double[] dArr2);

    /* synthetic */ m(String str, int i10, a aVar) {
        this(str, i10);
    }
}
