package u6;

import e6.j;
import java.math.BigDecimal;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class g extends c0 implements s6.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Boolean f28218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f28219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final boolean f28220g;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d7.f[] f28221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f28222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28223c;

        public d7.f a() {
            int i10 = this.f28222b;
            if (i10 == 0) {
                return null;
            }
            d7.f[] fVarArr = this.f28221a;
            int i11 = i10 - 1;
            this.f28222b = i11;
            return fVarArr[i11];
        }

        public void b(d7.f fVar) {
            int i10 = this.f28222b;
            int i11 = this.f28223c;
            if (i10 < i11) {
                d7.f[] fVarArr = this.f28221a;
                this.f28222b = i10 + 1;
                fVarArr[i10] = fVar;
                return;
            }
            if (this.f28221a == null) {
                this.f28223c = 10;
                this.f28221a = new d7.f[10];
            } else {
                int iMin = i11 + Math.min(4000, Math.max(20, i11 >> 1));
                this.f28223c = iMin;
                this.f28221a = (d7.f[]) Arrays.copyOf(this.f28221a, iMin);
            }
            d7.f[] fVarArr2 = this.f28221a;
            int i12 = this.f28222b;
            this.f28222b = i12 + 1;
            fVarArr2[i12] = fVar;
        }
    }

    public g(Class cls, Boolean bool) {
        super(cls);
        this.f28218e = bool;
        this.f28219f = true;
        this.f28220g = true;
    }

    private static boolean p1(Boolean bool, Boolean bool2) {
        if (bool != null) {
            return bool.booleanValue();
        }
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return true;
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        p6.g gVarK = hVar.k();
        Boolean boolA0 = gVarK.a0(d7.a.class);
        Boolean boolA02 = gVarK.a0(d7.r.class);
        Boolean boolA03 = gVarK.a0(p6.n.class);
        boolean zP1 = p1(boolA0, boolA03);
        boolean zP12 = p1(boolA02, boolA03);
        return (zP1 == this.f28219f && zP12 == this.f28220g) ? this : e1(zP1, zP12);
    }

    protected abstract p6.l e1(boolean z10, boolean z11);

    protected final p6.n f1(e6.j jVar, p6.h hVar) {
        d7.l lVarH0 = hVar.h0();
        int iQ = jVar.q();
        if (iQ == 2) {
            return lVarH0.k();
        }
        switch (iQ) {
            case 6:
                return lVarH0.o(jVar.C0());
            case 7:
                return n1(jVar, hVar, lVarH0);
            case 8:
                return l1(jVar, hVar, lVarH0);
            case 9:
                return lVarH0.c(true);
            case 10:
                return lVarH0.c(false);
            case 11:
                return lVarH0.d();
            case 12:
                return k1(jVar, hVar);
            default:
                return (p6.n) hVar.s0(p(), jVar);
        }
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.c(jVar, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final d7.f g1(e6.j r14, p6.h r15, d7.l r16, u6.g.a r17, d7.f r18) throws v6.f {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g.g1(e6.j, p6.h, d7.l, u6.g$a, d7.f):d7.f");
    }

    protected final d7.r h1(e6.j jVar, p6.h hVar, d7.l lVar, a aVar) throws v6.f {
        d7.r rVarK = lVar.k();
        String strL = jVar.l();
        while (strL != null) {
            e6.m mVarX0 = jVar.X0();
            if (mVarX0 == null) {
                mVarX0 = e6.m.NOT_AVAILABLE;
            }
            int iE = mVarX0.e();
            p6.n nVarF1 = iE != 1 ? iE != 3 ? f1(jVar, hVar) : g1(jVar, hVar, lVar, aVar, lVar.a()) : g1(jVar, hVar, lVar, aVar, lVar.k());
            p6.n nVarD0 = rVarK.d0(strL, nVarF1);
            if (nVarD0 != null) {
                o1(jVar, hVar, lVar, strL, rVarK, nVarD0, nVarF1);
            }
            strL = jVar.V0();
        }
        return rVarK;
    }

    protected final p6.n i1(e6.j jVar, p6.h hVar) {
        int iQ = jVar.q();
        return iQ != 2 ? iQ != 8 ? iQ != 12 ? (p6.n) hVar.s0(p(), jVar) : k1(jVar, hVar) : l1(jVar, hVar, hVar.h0()) : hVar.h0().k();
    }

    protected final p6.n j1(p6.h hVar, d7.l lVar, BigDecimal bigDecimal) {
        r6.l lVarD0 = hVar.d0();
        r6.p pVar = r6.p.STRIP_TRAILING_BIGDECIMAL_ZEROES;
        if (lVarD0.c(pVar) ? lVarD0.b(pVar) : lVar.p()) {
            try {
                bigDecimal = f.a(bigDecimal);
            } catch (ArithmeticException unused) {
            }
        }
        return lVar.i(bigDecimal);
    }

    protected final p6.n k1(e6.j jVar, p6.h hVar) {
        d7.l lVarH0 = hVar.h0();
        Object objH0 = jVar.h0();
        return objH0 == null ? lVarH0.d() : objH0.getClass() == byte[].class ? lVarH0.b((byte[]) objH0) : objH0 instanceof i7.x ? lVarH0.n((i7.x) objH0) : objH0 instanceof p6.n ? (p6.n) objH0 : lVarH0.l(objH0);
    }

    protected final p6.n l1(e6.j jVar, p6.h hVar, d7.l lVar) {
        j.b bVarV0 = jVar.v0();
        return bVarV0 == j.b.BIG_DECIMAL ? j1(hVar, lVar, jVar.W()) : hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) ? jVar.U0() ? lVar.e(jVar.X()) : j1(hVar, lVar, jVar.W()) : bVarV0 == j.b.FLOAT ? lVar.f(jVar.p0()) : lVar.e(jVar.X());
    }

    protected final p6.n m1(e6.j jVar, int i10, d7.l lVar) {
        if (i10 != 0) {
            return p6.i.USE_BIG_INTEGER_FOR_INTS.e(i10) ? lVar.j(jVar.r()) : lVar.h(jVar.u0());
        }
        j.b bVarV0 = jVar.v0();
        return bVarV0 == j.b.INT ? lVar.g(jVar.t0()) : bVarV0 == j.b.LONG ? lVar.h(jVar.u0()) : lVar.j(jVar.r());
    }

    protected final p6.n n1(e6.j jVar, p6.h hVar, d7.l lVar) {
        int iF0 = hVar.f0();
        j.b bVarV0 = (c0.f28198c & iF0) != 0 ? p6.i.USE_BIG_INTEGER_FOR_INTS.e(iF0) ? j.b.BIG_INTEGER : p6.i.USE_LONG_FOR_INTS.e(iF0) ? j.b.LONG : jVar.v0() : jVar.v0();
        return bVarV0 == j.b.INT ? lVar.g(jVar.t0()) : bVarV0 == j.b.LONG ? lVar.h(jVar.u0()) : lVar.j(jVar.r());
    }

    protected void o1(e6.j jVar, p6.h hVar, d7.l lVar, String str, d7.r rVar, p6.n nVar, p6.n nVar2) throws v6.f {
        if (hVar.D0(p6.i.FAIL_ON_READING_DUP_TREE_KEY)) {
            hVar.Q0(p6.n.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (hVar.C0(e6.q.DUPLICATE_PROPERTIES)) {
            if (nVar.D()) {
                ((d7.a) nVar).c0(nVar2);
                rVar.d0(str, nVar);
            } else {
                d7.a aVarA = lVar.a();
                aVarA.c0(nVar);
                aVarA.c0(nVar2);
                rVar.d0(str, aVarA);
            }
        }
    }

    @Override // p6.l
    public boolean q() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final p6.n q1(e6.j r8, p6.h r9, d7.r r10, u6.g.a r11) throws v6.f {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g.q1(e6.j, p6.h, d7.r, u6.g$a):p6.n");
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Untyped;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return this.f28218e;
    }

    protected g(g gVar, boolean z10, boolean z11) {
        super(gVar);
        this.f28218e = gVar.f28218e;
        this.f28219f = z10;
        this.f28220g = z11;
    }
}
