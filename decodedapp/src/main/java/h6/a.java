package h6;

import e6.h;
import e6.i;
import e6.j;
import e6.l;
import e6.m;
import h6.b;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import o6.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected b f15131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f15132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected b.a f15133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected m f15134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected m f15135h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected c f15136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected c f15137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected b f15138t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f15139u;

    public a(e6.j jVar, b bVar, b.a aVar, boolean z10) {
        super(jVar);
        this.f15131d = bVar;
        this.f15138t = bVar;
        this.f15136r = c.q(bVar);
        this.f15133f = aVar;
        this.f15132e = z10;
    }

    private m i1(c cVar) throws i {
        this.f15137s = cVar;
        m mVarW = cVar.w();
        if (mVarW != null) {
            return mVarW;
        }
        while (cVar != this.f15136r) {
            cVar = this.f15137s.r(cVar);
            this.f15137s = cVar;
            if (cVar == null) {
                throw a("Unexpected problem: chain of filtered context broken");
            }
            m mVarW2 = cVar.w();
            if (mVarW2 != null) {
                return mVarW2;
            }
        }
        throw a("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean l1() {
        int i10 = this.f15139u;
        if (i10 != 0 && !this.f15132e) {
            return false;
        }
        this.f15139u = i10 + 1;
        return true;
    }

    @Override // o6.j, e6.j
    public short B0() {
        return this.f23244c.B0();
    }

    @Override // o6.j, e6.j
    public String C0() {
        return this.f15134g == m.FIELD_NAME ? l() : this.f23244c.C0();
    }

    @Override // o6.j, e6.j
    public char[] D0() {
        return this.f15134g == m.FIELD_NAME ? l().toCharArray() : this.f23244c.D0();
    }

    @Override // o6.j, e6.j
    public int E0() {
        return this.f15134g == m.FIELD_NAME ? l().length() : this.f23244c.E0();
    }

    @Override // o6.j, e6.j
    public int F0() {
        if (this.f15134g == m.FIELD_NAME) {
            return 0;
        }
        return this.f23244c.F0();
    }

    @Override // o6.j, e6.j
    public h G0() {
        return this.f23244c.G0();
    }

    @Override // o6.j, e6.j
    public h H() {
        return this.f23244c.H();
    }

    @Override // o6.j, e6.j
    public int I0() {
        return this.f23244c.I0();
    }

    @Override // o6.j, e6.j
    public long J0() {
        return this.f23244c.J0();
    }

    @Override // o6.j, e6.j
    public String K0() {
        return this.f15134g == m.FIELD_NAME ? l() : this.f23244c.K0();
    }

    @Override // o6.j, e6.j
    public boolean L0() {
        return this.f15134g != null;
    }

    @Override // o6.j, e6.j
    public boolean M0() {
        if (this.f15134g == m.FIELD_NAME) {
            return false;
        }
        return this.f23244c.M0();
    }

    @Override // o6.j, e6.j
    public final boolean N0(m mVar) {
        return this.f15134g == mVar;
    }

    @Override // o6.j, e6.j
    public boolean O0(int i10) {
        m mVar = this.f15134g;
        return mVar == null ? i10 == 0 : mVar.e() == i10;
    }

    @Override // o6.j, e6.j
    public String S() {
        l lVarH1 = h1();
        m mVar = this.f15134g;
        if (mVar != m.START_OBJECT && mVar != m.START_ARRAY) {
            return lVarH1.b();
        }
        l lVarF = lVarH1.f();
        if (lVarF == null) {
            return null;
        }
        return lVarF.b();
    }

    @Override // o6.j, e6.j
    public boolean S0() {
        return this.f15134g == m.START_ARRAY;
    }

    @Override // o6.j, e6.j
    public m T() {
        return this.f15134g;
    }

    @Override // o6.j, e6.j
    public boolean T0() {
        return this.f15134g == m.START_OBJECT;
    }

    @Override // o6.j, e6.j
    public BigDecimal W() {
        return this.f23244c.W();
    }

    @Override // o6.j, e6.j
    public double X() {
        return this.f23244c.X();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x019d  */
    @Override // e6.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e6.m X0() throws e6.i {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.a.X0():e6.m");
    }

    @Override // o6.j, e6.j
    public int a1(e6.a aVar, OutputStream outputStream) {
        return this.f23244c.a1(aVar, outputStream);
    }

    @Override // e6.j
    public e6.j f1() throws i {
        m mVar = this.f15134g;
        if (mVar == m.START_OBJECT || mVar == m.START_ARRAY) {
            int i10 = 1;
            while (true) {
                m mVarX0 = X0();
                if (mVarX0 == null) {
                    break;
                }
                if (!mVarX0.i()) {
                    if (mVarX0.h() && i10 - 1 == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        return this;
    }

    @Override // o6.j, e6.j
    public Object h0() {
        return this.f23244c.h0();
    }

    protected l h1() {
        c cVar = this.f15137s;
        return cVar != null ? cVar : this.f15136r;
    }

    protected final m j1() {
        b bVarN;
        m mVarK1;
        m mVarK12;
        m mVarK13;
        while (true) {
            m mVarX0 = this.f23244c.X0();
            if (mVarX0 == null) {
                this.f15134g = mVarX0;
                return mVarX0;
            }
            int iE = mVarX0.e();
            if (iE == 1) {
                b bVar = this.f15138t;
                b bVar2 = b.f15140a;
                if (bVar == bVar2) {
                    this.f15136r = this.f15136r.p(bVar, true);
                    this.f15134g = mVarX0;
                    return mVarX0;
                }
                if (bVar == null) {
                    this.f23244c.f1();
                } else {
                    b bVarN2 = this.f15136r.n(bVar);
                    if (bVarN2 == null) {
                        this.f23244c.f1();
                    } else {
                        if (bVarN2 != bVar2) {
                            bVarN2 = bVarN2.e();
                        }
                        this.f15138t = bVarN2;
                        if (bVarN2 == bVar2) {
                            this.f15136r = this.f15136r.p(bVarN2, true);
                            this.f15134g = mVarX0;
                            return mVarX0;
                        }
                        if (bVarN2 != null && this.f15133f == b.a.INCLUDE_NON_NULL) {
                            this.f15136r = this.f15136r.p(bVarN2, true);
                            this.f15134g = mVarX0;
                            return mVarX0;
                        }
                        c cVarP = this.f15136r.p(bVarN2, false);
                        this.f15136r = cVarP;
                        if (this.f15133f == b.a.INCLUDE_ALL_AND_PATH && (mVarK13 = k1(cVarP)) != null) {
                            this.f15134g = mVarK13;
                            return mVarK13;
                        }
                    }
                }
            } else if (iE == 2) {
                boolean zV = this.f15136r.v();
                b bVarS = this.f15136r.s();
                if (bVarS != null && bVarS != b.f15140a) {
                    boolean zG = bVarS.g(this.f15136r.u());
                    bVarS.c();
                    if (zG) {
                        return i1(this.f15136r);
                    }
                }
                c cVarF = this.f15136r.f();
                this.f15136r = cVarF;
                this.f15138t = cVarF.s();
                if (zV) {
                    this.f15134g = mVarX0;
                    return mVarX0;
                }
            } else if (iE == 3) {
                b bVar3 = this.f15138t;
                b bVar4 = b.f15140a;
                if (bVar3 == bVar4) {
                    this.f15136r = this.f15136r.o(bVar3, true);
                    this.f15134g = mVarX0;
                    return mVarX0;
                }
                if (bVar3 == null) {
                    this.f23244c.f1();
                } else {
                    b bVarN3 = this.f15136r.n(bVar3);
                    if (bVarN3 == null) {
                        this.f23244c.f1();
                    } else {
                        if (bVarN3 != bVar4) {
                            bVarN3 = bVarN3.d();
                        }
                        this.f15138t = bVarN3;
                        if (bVarN3 == bVar4) {
                            this.f15136r = this.f15136r.o(bVarN3, true);
                            this.f15134g = mVarX0;
                            return mVarX0;
                        }
                        if (bVarN3 != null && this.f15133f == b.a.INCLUDE_NON_NULL) {
                            this.f15136r = this.f15136r.o(bVarN3, true);
                            this.f15134g = mVarX0;
                            return mVarX0;
                        }
                        c cVarO = this.f15136r.o(bVarN3, false);
                        this.f15136r = cVarO;
                        if (this.f15133f == b.a.INCLUDE_ALL_AND_PATH && (mVarK12 = k1(cVarO)) != null) {
                            this.f15134g = mVarK12;
                            return mVarK12;
                        }
                    }
                }
            } else if (iE == 4) {
                boolean zV2 = this.f15136r.v();
                b bVarS2 = this.f15136r.s();
                if (bVarS2 != null && bVarS2 != b.f15140a) {
                    boolean zG2 = bVarS2.g(this.f15136r.g());
                    bVarS2.b();
                    if (zG2) {
                        return i1(this.f15136r);
                    }
                }
                c cVarF2 = this.f15136r.f();
                this.f15136r = cVarF2;
                this.f15138t = cVarF2.s();
                if (zV2) {
                    this.f15134g = mVarX0;
                    return mVarX0;
                }
            } else if (iE != 5) {
                b bVar5 = this.f15138t;
                b bVar6 = b.f15140a;
                if (bVar5 == bVar6) {
                    this.f15134g = mVarX0;
                    return mVarX0;
                }
                if (bVar5 != null && ((bVarN = this.f15136r.n(bVar5)) == bVar6 || (bVarN != null && bVarN.k(this.f23244c)))) {
                    if (l1()) {
                        this.f15134g = mVarX0;
                        return mVarX0;
                    }
                }
            } else {
                String strS = this.f23244c.S();
                b bVarY = this.f15136r.y(strS);
                b bVar7 = b.f15140a;
                if (bVarY == bVar7) {
                    this.f15138t = bVarY;
                    this.f15134g = mVarX0;
                    return mVarX0;
                }
                if (bVarY == null) {
                    this.f23244c.X0();
                    this.f23244c.f1();
                } else {
                    b bVarI = bVarY.i(strS);
                    if (bVarI == null) {
                        this.f23244c.X0();
                        this.f23244c.f1();
                    } else {
                        this.f15138t = bVarI;
                        if (bVarI == bVar7) {
                            if (!l1()) {
                                this.f23244c.X0();
                                this.f23244c.f1();
                            } else if (this.f15133f == b.a.INCLUDE_ALL_AND_PATH) {
                                this.f15134g = mVarX0;
                                return mVarX0;
                            }
                        } else if (this.f15133f != b.a.ONLY_INCLUDE_ALL && (mVarK1 = k1(this.f15136r)) != null) {
                            this.f15134g = mVarK1;
                            return mVarK1;
                        }
                    }
                }
            }
        }
    }

    @Override // o6.j, e6.j
    public void k() {
        m mVar = this.f15134g;
        if (mVar != null) {
            this.f15135h = mVar;
            this.f15134g = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0171, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final e6.m k1(h6.c r7) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.a.k1(h6.c):e6.m");
    }

    @Override // o6.j, e6.j
    public String l() {
        l lVarH1 = h1();
        m mVar = this.f15134g;
        if (mVar != m.START_OBJECT && mVar != m.START_ARRAY) {
            return lVarH1.b();
        }
        l lVarF = lVarH1.f();
        if (lVarF == null) {
            return null;
        }
        return lVarF.b();
    }

    @Override // o6.j, e6.j
    public m n() {
        return this.f15134g;
    }

    @Override // o6.j, e6.j
    public float p0() {
        return this.f23244c.p0();
    }

    @Override // o6.j, e6.j
    public final int q() {
        m mVar = this.f15134g;
        if (mVar == null) {
            return 0;
        }
        return mVar.e();
    }

    @Override // o6.j, e6.j
    public BigInteger r() {
        return this.f23244c.r();
    }

    @Override // o6.j, e6.j
    public int t0() {
        return this.f23244c.t0();
    }

    @Override // o6.j, e6.j
    public long u0() {
        return this.f23244c.u0();
    }

    @Override // o6.j, e6.j
    public byte[] v(e6.a aVar) {
        return this.f23244c.v(aVar);
    }

    @Override // o6.j, e6.j
    public j.b v0() {
        return this.f23244c.v0();
    }

    @Override // o6.j, e6.j
    public boolean w() {
        return this.f23244c.w();
    }

    @Override // o6.j, e6.j
    public Number w0() {
        return this.f23244c.w0();
    }

    @Override // o6.j, e6.j
    public byte x() {
        return this.f23244c.x();
    }

    @Override // o6.j, e6.j
    public l z0() {
        return h1();
    }
}
