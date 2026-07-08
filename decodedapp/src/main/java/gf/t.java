package gf;

import com.facebook.stetho.websocket.CloseCodes;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import of.a;
import of.d;
import of.i;
import of.j;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends i.d implements of.q {

    /* JADX INFO: renamed from: w */
    private static final t f14306w;

    /* JADX INFO: renamed from: x */
    public static of.r f14307x = new a();

    /* JADX INFO: renamed from: c */
    private final of.d f14308c;

    /* JADX INFO: renamed from: d */
    private int f14309d;

    /* JADX INFO: renamed from: e */
    private int f14310e;

    /* JADX INFO: renamed from: f */
    private int f14311f;

    /* JADX INFO: renamed from: g */
    private boolean f14312g;

    /* JADX INFO: renamed from: h */
    private c f14313h;

    /* JADX INFO: renamed from: r */
    private List f14314r;

    /* JADX INFO: renamed from: s */
    private List f14315s;

    /* JADX INFO: renamed from: t */
    private int f14316t;

    /* JADX INFO: renamed from: u */
    private byte f14317u;

    /* JADX INFO: renamed from: v */
    private int f14318v;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public t b(of.e eVar, of.g gVar) {
            return new t(eVar, gVar);
        }
    }

    public enum c implements j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: e */
        private static j.b f14329e = new a();

        /* JADX INFO: renamed from: a */
        private final int f14331a;

        static class a implements j.b {
            a() {
            }

            @Override // of.j.b
            /* JADX INFO: renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        c(int i10, int i11) {
            this.f14331a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        @Override // of.j.a
        public final int getNumber() {
            return this.f14331a;
        }
    }

    static {
        t tVar = new t(true);
        f14306w = tVar;
        tVar.f0();
    }

    /* synthetic */ t(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static t N() {
        return f14306w;
    }

    private void f0() {
        this.f14310e = 0;
        this.f14311f = 0;
        this.f14312g = false;
        this.f14313h = c.INV;
        List list = Collections.EMPTY_LIST;
        this.f14314r = list;
        this.f14315s = list;
    }

    public static b g0() {
        return b.r();
    }

    public static b h0(t tVar) {
        return g0().f(tVar);
    }

    @Override // of.q
    /* JADX INFO: renamed from: O */
    public t getDefaultInstanceForType() {
        return f14306w;
    }

    public int Q() {
        return this.f14310e;
    }

    public int R() {
        return this.f14311f;
    }

    public boolean T() {
        return this.f14312g;
    }

    public r W(int i10) {
        return (r) this.f14314r.get(i10);
    }

    public int X() {
        return this.f14314r.size();
    }

    public List Y() {
        return this.f14315s;
    }

    public List Z() {
        return this.f14314r;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14309d & 1) == 1) {
            fVar.Z(1, this.f14310e);
        }
        if ((this.f14309d & 2) == 2) {
            fVar.Z(2, this.f14311f);
        }
        if ((this.f14309d & 4) == 4) {
            fVar.K(3, this.f14312g);
        }
        if ((this.f14309d & 8) == 8) {
            fVar.R(4, this.f14313h.getNumber());
        }
        for (int i10 = 0; i10 < this.f14314r.size(); i10++) {
            fVar.c0(5, (of.p) this.f14314r.get(i10));
        }
        if (Y().size() > 0) {
            fVar.n0(50);
            fVar.n0(this.f14316t);
        }
        for (int i11 = 0; i11 < this.f14315s.size(); i11++) {
            fVar.a0(((Integer) this.f14315s.get(i11)).intValue());
        }
        aVarT.a(CloseCodes.NORMAL_CLOSURE, fVar);
        fVar.h0(this.f14308c);
    }

    public c a0() {
        return this.f14313h;
    }

    public boolean b0() {
        return (this.f14309d & 1) == 1;
    }

    public boolean c0() {
        return (this.f14309d & 2) == 2;
    }

    public boolean d0() {
        return (this.f14309d & 4) == 4;
    }

    public boolean e0() {
        return (this.f14309d & 8) == 8;
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14318v;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14309d & 1) == 1 ? of.f.o(1, this.f14310e) : 0;
        if ((this.f14309d & 2) == 2) {
            iO += of.f.o(2, this.f14311f);
        }
        if ((this.f14309d & 4) == 4) {
            iO += of.f.a(3, this.f14312g);
        }
        if ((this.f14309d & 8) == 8) {
            iO += of.f.h(4, this.f14313h.getNumber());
        }
        for (int i11 = 0; i11 < this.f14314r.size(); i11++) {
            iO += of.f.r(5, (of.p) this.f14314r.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f14315s.size(); i12++) {
            iP += of.f.p(((Integer) this.f14315s.get(i12)).intValue());
        }
        int iP2 = iO + iP;
        if (!Y().isEmpty()) {
            iP2 = iP2 + 1 + of.f.p(iP);
        }
        this.f14316t = iP;
        int iO2 = iP2 + o() + this.f14308c.size();
        this.f14318v = iO2;
        return iO2;
    }

    @Override // of.p
    /* JADX INFO: renamed from: i0 */
    public b newBuilderForType() {
        return g0();
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14317u;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!b0()) {
            this.f14317u = (byte) 0;
            return false;
        }
        if (!c0()) {
            this.f14317u = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < X(); i10++) {
            if (!W(i10).isInitialized()) {
                this.f14317u = (byte) 0;
                return false;
            }
        }
        if (n()) {
            this.f14317u = (byte) 1;
            return true;
        }
        this.f14317u = (byte) 0;
        return false;
    }

    @Override // of.p
    /* JADX INFO: renamed from: j0 */
    public b toBuilder() {
        return h0(this);
    }

    /* synthetic */ t(i.c cVar, gf.a aVar) {
        this(cVar);
    }

    private t(i.c cVar) {
        super(cVar);
        this.f14316t = -1;
        this.f14317u = (byte) -1;
        this.f14318v = -1;
        this.f14308c = cVar.d();
    }

    private t(boolean z10) {
        this.f14316t = -1;
        this.f14317u = (byte) -1;
        this.f14318v = -1;
        this.f14308c = of.d.f23423a;
    }

    private t(of.e eVar, of.g gVar) {
        this.f14316t = -1;
        this.f14317u = (byte) -1;
        this.f14318v = -1;
        f0();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f14309d |= 1;
                            this.f14310e = eVar.r();
                        } else if (iJ == 16) {
                            this.f14309d |= 2;
                            this.f14311f = eVar.r();
                        } else if (iJ == 24) {
                            this.f14309d |= 4;
                            this.f14312g = eVar.j();
                        } else if (iJ == 32) {
                            int iM = eVar.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f14309d |= 8;
                                this.f14313h = cVarA;
                            }
                        } else if (iJ == 42) {
                            if ((i10 & 16) != 16) {
                                this.f14314r = new ArrayList();
                                i10 |= 16;
                            }
                            this.f14314r.add(eVar.t(r.E, gVar));
                        } else if (iJ == 48) {
                            if ((i10 & 32) != 32) {
                                this.f14315s = new ArrayList();
                                i10 |= 32;
                            }
                            this.f14315s.add(Integer.valueOf(eVar.r()));
                        } else if (iJ != 50) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            int i11 = eVar.i(eVar.z());
                            if ((i10 & 32) != 32 && eVar.e() > 0) {
                                this.f14315s = new ArrayList();
                                i10 |= 32;
                            }
                            while (eVar.e() > 0) {
                                this.f14315s.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                        }
                    }
                    z10 = true;
                } catch (of.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 16) == 16) {
                    this.f14314r = DesugarCollections.unmodifiableList(this.f14314r);
                }
                if ((i10 & 32) == 32) {
                    this.f14315s = DesugarCollections.unmodifiableList(this.f14315s);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14308c = bVarO.l();
                    throw th3;
                }
                this.f14308c = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((i10 & 16) == 16) {
            this.f14314r = DesugarCollections.unmodifiableList(this.f14314r);
        }
        if ((i10 & 32) == 32) {
            this.f14315s = DesugarCollections.unmodifiableList(this.f14315s);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14308c = bVarO.l();
            throw th4;
        }
        this.f14308c = bVarO.l();
        g();
    }

    public static final class b extends i.c implements of.q {

        /* JADX INFO: renamed from: d */
        private int f14319d;

        /* JADX INFO: renamed from: e */
        private int f14320e;

        /* JADX INFO: renamed from: f */
        private int f14321f;

        /* JADX INFO: renamed from: g */
        private boolean f14322g;

        /* JADX INFO: renamed from: h */
        private c f14323h = c.INV;

        /* JADX INFO: renamed from: r */
        private List f14324r;

        /* JADX INFO: renamed from: s */
        private List f14325s;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f14324r = list;
            this.f14325s = list;
            v();
        }

        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14319d & 32) != 32) {
                this.f14325s = new ArrayList(this.f14325s);
                this.f14319d |= 32;
            }
        }

        private void u() {
            if ((this.f14319d & 16) != 16) {
                this.f14324r = new ArrayList(this.f14324r);
                this.f14319d |= 16;
            }
        }

        public b A(boolean z10) {
            this.f14319d |= 4;
            this.f14322g = z10;
            return this;
        }

        public b B(c cVar) {
            cVar.getClass();
            this.f14319d |= 8;
            this.f14323h = cVar;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n */
        public t build() {
            t tVarO = o();
            if (tVarO.isInitialized()) {
                return tVarO;
            }
            throw a.AbstractC0317a.b(tVarO);
        }

        public t o() {
            t tVar = new t(this);
            int i10 = this.f14319d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            tVar.f14310e = this.f14320e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            tVar.f14311f = this.f14321f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            tVar.f14312g = this.f14322g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            tVar.f14313h = this.f14323h;
            if ((this.f14319d & 16) == 16) {
                this.f14324r = DesugarCollections.unmodifiableList(this.f14324r);
                this.f14319d &= -17;
            }
            tVar.f14314r = this.f14324r;
            if ((this.f14319d & 32) == 32) {
                this.f14325s = DesugarCollections.unmodifiableList(this.f14325s);
                this.f14319d &= -33;
            }
            tVar.f14315s = this.f14325s;
            tVar.f14309d = i11;
            return tVar;
        }

        /* JADX INFO: renamed from: p */
        public b clone() {
            return r().f(o());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: w */
        public b f(t tVar) {
            if (tVar == t.N()) {
                return this;
            }
            if (tVar.b0()) {
                y(tVar.Q());
            }
            if (tVar.c0()) {
                z(tVar.R());
            }
            if (tVar.d0()) {
                A(tVar.T());
            }
            if (tVar.e0()) {
                B(tVar.a0());
            }
            if (!tVar.f14314r.isEmpty()) {
                if (this.f14324r.isEmpty()) {
                    this.f14324r = tVar.f14314r;
                    this.f14319d &= -17;
                } else {
                    u();
                    this.f14324r.addAll(tVar.f14314r);
                }
            }
            if (!tVar.f14315s.isEmpty()) {
                if (this.f14325s.isEmpty()) {
                    this.f14325s = tVar.f14315s;
                    this.f14319d &= -33;
                } else {
                    t();
                    this.f14325s.addAll(tVar.f14315s);
                }
            }
            k(tVar);
            g(d().c(tVar.f14308c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.t.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.t.f14307x     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.t r3 = (gf.t) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
                if (r3 == 0) goto Le
                r2.f(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                of.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                gf.t r4 = (gf.t) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.f(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.t.b.S(of.e, of.g):gf.t$b");
        }

        public b y(int i10) {
            this.f14319d |= 1;
            this.f14320e = i10;
            return this;
        }

        public b z(int i10) {
            this.f14319d |= 2;
            this.f14321f = i10;
            return this;
        }

        private void v() {
        }
    }
}
