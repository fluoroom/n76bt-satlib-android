package gf;

import gf.r;
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
public final class i extends of.i implements of.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final i f14065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static of.r f14066w = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final of.d f14067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f14071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r f14072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14073h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f14074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f14075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte f14076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f14077u;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public i b(of.e eVar, of.g gVar) {
            return new i(eVar, gVar);
        }
    }

    public enum c implements j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static j.b f14089e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14091a;

        static class a implements j.b {
            a() {
            }

            @Override // of.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        c(int i10, int i11) {
            this.f14091a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // of.j.a
        public final int getNumber() {
            return this.f14091a;
        }
    }

    static {
        i iVar = new i(true);
        f14065v = iVar;
        iVar.a0();
    }

    public static i G() {
        return f14065v;
    }

    private void a0() {
        this.f14069d = 0;
        this.f14070e = 0;
        this.f14071f = c.TRUE;
        this.f14072g = r.e0();
        this.f14073h = 0;
        List list = Collections.EMPTY_LIST;
        this.f14074r = list;
        this.f14075s = list;
    }

    public static b b0() {
        return b.m();
    }

    public static b c0(i iVar) {
        return b0().f(iVar);
    }

    public int A() {
        return this.f14074r.size();
    }

    public List C() {
        return this.f14074r;
    }

    public c D() {
        return this.f14071f;
    }

    public int H() {
        return this.f14069d;
    }

    public r K() {
        return this.f14072g;
    }

    public int L() {
        return this.f14073h;
    }

    public i N(int i10) {
        return (i) this.f14075s.get(i10);
    }

    public int O() {
        return this.f14075s.size();
    }

    public List Q() {
        return this.f14075s;
    }

    public int R() {
        return this.f14070e;
    }

    public boolean T() {
        return (this.f14068c & 4) == 4;
    }

    public boolean W() {
        return (this.f14068c & 1) == 1;
    }

    public boolean X() {
        return (this.f14068c & 8) == 8;
    }

    public boolean Y() {
        return (this.f14068c & 16) == 16;
    }

    public boolean Z() {
        return (this.f14068c & 2) == 2;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        if ((this.f14068c & 1) == 1) {
            fVar.Z(1, this.f14069d);
        }
        if ((this.f14068c & 2) == 2) {
            fVar.Z(2, this.f14070e);
        }
        if ((this.f14068c & 4) == 4) {
            fVar.R(3, this.f14071f.getNumber());
        }
        if ((this.f14068c & 8) == 8) {
            fVar.c0(4, this.f14072g);
        }
        if ((this.f14068c & 16) == 16) {
            fVar.Z(5, this.f14073h);
        }
        for (int i10 = 0; i10 < this.f14074r.size(); i10++) {
            fVar.c0(6, (of.p) this.f14074r.get(i10));
        }
        for (int i11 = 0; i11 < this.f14075s.size(); i11++) {
            fVar.c0(7, (of.p) this.f14075s.get(i11));
        }
        fVar.h0(this.f14067b);
    }

    @Override // of.p
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return b0();
    }

    @Override // of.p
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return c0(this);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14077u;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14068c & 1) == 1 ? of.f.o(1, this.f14069d) : 0;
        if ((this.f14068c & 2) == 2) {
            iO += of.f.o(2, this.f14070e);
        }
        if ((this.f14068c & 4) == 4) {
            iO += of.f.h(3, this.f14071f.getNumber());
        }
        if ((this.f14068c & 8) == 8) {
            iO += of.f.r(4, this.f14072g);
        }
        if ((this.f14068c & 16) == 16) {
            iO += of.f.o(5, this.f14073h);
        }
        for (int i11 = 0; i11 < this.f14074r.size(); i11++) {
            iO += of.f.r(6, (of.p) this.f14074r.get(i11));
        }
        for (int i12 = 0; i12 < this.f14075s.size(); i12++) {
            iO += of.f.r(7, (of.p) this.f14075s.get(i12));
        }
        int size = iO + this.f14067b.size();
        this.f14077u = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14076t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (X() && !K().isInitialized()) {
            this.f14076t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < A(); i10++) {
            if (!z(i10).isInitialized()) {
                this.f14076t = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < O(); i11++) {
            if (!N(i11).isInitialized()) {
                this.f14076t = (byte) 0;
                return false;
            }
        }
        this.f14076t = (byte) 1;
        return true;
    }

    public i z(int i10) {
        return (i) this.f14074r.get(i10);
    }

    private i(i.b bVar) {
        super(bVar);
        this.f14076t = (byte) -1;
        this.f14077u = -1;
        this.f14067b = bVar.d();
    }

    private i(boolean z10) {
        this.f14076t = (byte) -1;
        this.f14077u = -1;
        this.f14067b = of.d.f23423a;
    }

    private i(of.e eVar, of.g gVar) {
        this.f14076t = (byte) -1;
        this.f14077u = -1;
        a0();
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
                            this.f14068c |= 1;
                            this.f14069d = eVar.r();
                        } else if (iJ == 16) {
                            this.f14068c |= 2;
                            this.f14070e = eVar.r();
                        } else if (iJ == 24) {
                            int iM = eVar.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f14068c |= 4;
                                this.f14071f = cVarA;
                            }
                        } else if (iJ == 34) {
                            r.c builder = (this.f14068c & 8) == 8 ? this.f14072g.toBuilder() : null;
                            r rVar = (r) eVar.t(r.E, gVar);
                            this.f14072g = rVar;
                            if (builder != null) {
                                builder.f(rVar);
                                this.f14072g = builder.o();
                            }
                            this.f14068c |= 8;
                        } else if (iJ == 40) {
                            this.f14068c |= 16;
                            this.f14073h = eVar.r();
                        } else if (iJ == 50) {
                            if ((i10 & 32) != 32) {
                                this.f14074r = new ArrayList();
                                i10 |= 32;
                            }
                            this.f14074r.add(eVar.t(f14066w, gVar));
                        } else if (iJ != 58) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if ((i10 & 64) != 64) {
                                this.f14075s = new ArrayList();
                                i10 |= 64;
                            }
                            this.f14075s.add(eVar.t(f14066w, gVar));
                        }
                    }
                    z10 = true;
                } catch (of.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 32) == 32) {
                    this.f14074r = DesugarCollections.unmodifiableList(this.f14074r);
                }
                if ((i10 & 64) == 64) {
                    this.f14075s = DesugarCollections.unmodifiableList(this.f14075s);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14067b = bVarO.l();
                    throw th3;
                }
                this.f14067b = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((i10 & 32) == 32) {
            this.f14074r = DesugarCollections.unmodifiableList(this.f14074r);
        }
        if ((i10 & 64) == 64) {
            this.f14075s = DesugarCollections.unmodifiableList(this.f14075s);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14067b = bVarO.l();
            throw th4;
        }
        this.f14067b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f14081e = c.TRUE;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private r f14082f = r.e0();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List f14084h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List f14085r;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f14084h = list;
            this.f14085r = list;
            p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f14078b & 32) != 32) {
                this.f14084h = new ArrayList(this.f14084h);
                this.f14078b |= 32;
            }
        }

        private void o() {
            if ((this.f14078b & 64) != 64) {
                this.f14085r = new ArrayList(this.f14085r);
                this.f14078b |= 64;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public i build() {
            i iVarJ = j();
            if (iVarJ.isInitialized()) {
                return iVarJ;
            }
            throw a.AbstractC0317a.b(iVarJ);
        }

        public i j() {
            i iVar = new i(this);
            int i10 = this.f14078b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            iVar.f14069d = this.f14079c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            iVar.f14070e = this.f14080d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            iVar.f14071f = this.f14081e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            iVar.f14072g = this.f14082f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            iVar.f14073h = this.f14083g;
            if ((this.f14078b & 32) == 32) {
                this.f14084h = DesugarCollections.unmodifiableList(this.f14084h);
                this.f14078b &= -33;
            }
            iVar.f14074r = this.f14084h;
            if ((this.f14078b & 64) == 64) {
                this.f14085r = DesugarCollections.unmodifiableList(this.f14085r);
                this.f14078b &= -65;
            }
            iVar.f14075s = this.f14085r;
            iVar.f14068c = i11;
            return iVar;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b f(i iVar) {
            if (iVar == i.G()) {
                return this;
            }
            if (iVar.W()) {
                w(iVar.H());
            }
            if (iVar.Z()) {
                y(iVar.R());
            }
            if (iVar.T()) {
                v(iVar.D());
            }
            if (iVar.X()) {
                u(iVar.K());
            }
            if (iVar.Y()) {
                x(iVar.L());
            }
            if (!iVar.f14074r.isEmpty()) {
                if (this.f14084h.isEmpty()) {
                    this.f14084h = iVar.f14074r;
                    this.f14078b &= -33;
                } else {
                    n();
                    this.f14084h.addAll(iVar.f14074r);
                }
            }
            if (!iVar.f14075s.isEmpty()) {
                if (this.f14085r.isEmpty()) {
                    this.f14085r = iVar.f14075s;
                    this.f14078b &= -65;
                } else {
                    o();
                    this.f14085r.addAll(iVar.f14075s);
                }
            }
            g(d().c(iVar.f14067b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.i.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.i.f14066w     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.i r3 = (gf.i) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.i r4 = (gf.i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.i.b.S(of.e, of.g):gf.i$b");
        }

        public b u(r rVar) {
            if ((this.f14078b & 8) != 8 || this.f14082f == r.e0()) {
                this.f14082f = rVar;
            } else {
                this.f14082f = r.F0(this.f14082f).f(rVar).o();
            }
            this.f14078b |= 8;
            return this;
        }

        public b v(c cVar) {
            cVar.getClass();
            this.f14078b |= 4;
            this.f14081e = cVar;
            return this;
        }

        public b w(int i10) {
            this.f14078b |= 1;
            this.f14079c = i10;
            return this;
        }

        public b x(int i10) {
            this.f14078b |= 16;
            this.f14083g = i10;
            return this;
        }

        public b y(int i10) {
            this.f14078b |= 2;
            this.f14080d = i10;
            return this;
        }

        private void p() {
        }
    }
}
