package gf;

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
public final class p extends of.i implements of.q {

    /* JADX INFO: renamed from: f */
    private static final p f14196f;

    /* JADX INFO: renamed from: g */
    public static of.r f14197g = new a();

    /* JADX INFO: renamed from: b */
    private final of.d f14198b;

    /* JADX INFO: renamed from: c */
    private List f14199c;

    /* JADX INFO: renamed from: d */
    private byte f14200d;

    /* JADX INFO: renamed from: e */
    private int f14201e;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public p b(of.e eVar, of.g gVar) {
            return new p(eVar, gVar);
        }
    }

    public static final class c extends of.i implements of.q {

        /* JADX INFO: renamed from: r */
        private static final c f14204r;

        /* JADX INFO: renamed from: s */
        public static of.r f14205s = new a();

        /* JADX INFO: renamed from: b */
        private final of.d f14206b;

        /* JADX INFO: renamed from: c */
        private int f14207c;

        /* JADX INFO: renamed from: d */
        private int f14208d;

        /* JADX INFO: renamed from: e */
        private int f14209e;

        /* JADX INFO: renamed from: f */
        private EnumC0202c f14210f;

        /* JADX INFO: renamed from: g */
        private byte f14211g;

        /* JADX INFO: renamed from: h */
        private int f14212h;

        static class a extends of.b {
            a() {
            }

            @Override // of.r
            /* JADX INFO: renamed from: j */
            public c b(of.e eVar, of.g gVar) {
                return new c(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: gf.p$c$c */
        public enum EnumC0202c implements j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: e */
            private static j.b f14220e = new a();

            /* JADX INFO: renamed from: a */
            private final int f14222a;

            /* JADX INFO: renamed from: gf.p$c$c$a */
            static class a implements j.b {
                a() {
                }

                @Override // of.j.b
                /* JADX INFO: renamed from: b */
                public EnumC0202c a(int i10) {
                    return EnumC0202c.a(i10);
                }
            }

            EnumC0202c(int i10, int i11) {
                this.f14222a = i11;
            }

            public static EnumC0202c a(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // of.j.a
            public final int getNumber() {
                return this.f14222a;
            }
        }

        static {
            c cVar = new c(true);
            f14204r = cVar;
            cVar.A();
        }

        /* synthetic */ c(of.e eVar, of.g gVar, gf.a aVar) {
            this(eVar, gVar);
        }

        private void A() {
            this.f14208d = -1;
            this.f14209e = 0;
            this.f14210f = EnumC0202c.PACKAGE;
        }

        public static b C() {
            return b.m();
        }

        public static b D(c cVar) {
            return C().f(cVar);
        }

        public static c r() {
            return f14204r;
        }

        @Override // of.p
        /* JADX INFO: renamed from: G */
        public b newBuilderForType() {
            return C();
        }

        @Override // of.p
        /* JADX INFO: renamed from: H */
        public b toBuilder() {
            return D(this);
        }

        @Override // of.p
        public void a(of.f fVar) throws IOException {
            getSerializedSize();
            if ((this.f14207c & 1) == 1) {
                fVar.Z(1, this.f14208d);
            }
            if ((this.f14207c & 2) == 2) {
                fVar.Z(2, this.f14209e);
            }
            if ((this.f14207c & 4) == 4) {
                fVar.R(3, this.f14210f.getNumber());
            }
            fVar.h0(this.f14206b);
        }

        @Override // of.p
        public int getSerializedSize() {
            int i10 = this.f14212h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f14207c & 1) == 1 ? of.f.o(1, this.f14208d) : 0;
            if ((this.f14207c & 2) == 2) {
                iO += of.f.o(2, this.f14209e);
            }
            if ((this.f14207c & 4) == 4) {
                iO += of.f.h(3, this.f14210f.getNumber());
            }
            int size = iO + this.f14206b.size();
            this.f14212h = size;
            return size;
        }

        @Override // of.q
        public final boolean isInitialized() {
            byte b10 = this.f14211g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (z()) {
                this.f14211g = (byte) 1;
                return true;
            }
            this.f14211g = (byte) 0;
            return false;
        }

        public EnumC0202c s() {
            return this.f14210f;
        }

        public int t() {
            return this.f14208d;
        }

        public int v() {
            return this.f14209e;
        }

        public boolean w() {
            return (this.f14207c & 4) == 4;
        }

        public boolean x() {
            return (this.f14207c & 1) == 1;
        }

        public boolean z() {
            return (this.f14207c & 2) == 2;
        }

        /* synthetic */ c(i.b bVar, gf.a aVar) {
            this(bVar);
        }

        private c(i.b bVar) {
            super(bVar);
            this.f14211g = (byte) -1;
            this.f14212h = -1;
            this.f14206b = bVar.d();
        }

        private c(boolean z10) {
            this.f14211g = (byte) -1;
            this.f14212h = -1;
            this.f14206b = of.d.f23423a;
        }

        private c(of.e eVar, of.g gVar) {
            this.f14211g = (byte) -1;
            this.f14212h = -1;
            A();
            d.b bVarO = of.d.o();
            of.f fVarI = of.f.I(bVarO, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f14207c |= 1;
                                    this.f14208d = eVar.r();
                                } else if (iJ == 16) {
                                    this.f14207c |= 2;
                                    this.f14209e = eVar.r();
                                } else if (iJ != 24) {
                                    if (!j(eVar, fVarI, gVar, iJ)) {
                                    }
                                } else {
                                    int iM = eVar.m();
                                    EnumC0202c enumC0202cA = EnumC0202c.a(iM);
                                    if (enumC0202cA == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f14207c |= 4;
                                        this.f14210f = enumC0202cA;
                                    }
                                }
                            }
                            z10 = true;
                        } catch (of.k e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new of.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f14206b = bVarO.l();
                        throw th3;
                    }
                    this.f14206b = bVarO.l();
                    g();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f14206b = bVarO.l();
                throw th4;
            }
            this.f14206b = bVarO.l();
            g();
        }

        public static final class b extends i.b implements of.q {

            /* JADX INFO: renamed from: b */
            private int f14213b;

            /* JADX INFO: renamed from: d */
            private int f14215d;

            /* JADX INFO: renamed from: c */
            private int f14214c = -1;

            /* JADX INFO: renamed from: e */
            private EnumC0202c f14216e = EnumC0202c.PACKAGE;

            private b() {
                n();
            }

            public static b m() {
                return new b();
            }

            @Override // of.p.a
            /* JADX INFO: renamed from: i */
            public c build() {
                c cVarJ = j();
                if (cVarJ.isInitialized()) {
                    return cVarJ;
                }
                throw a.AbstractC0317a.b(cVarJ);
            }

            public c j() {
                c cVar = new c(this);
                int i10 = this.f14213b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f14208d = this.f14214c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f14209e = this.f14215d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.f14210f = this.f14216e;
                cVar.f14207c = i11;
                return cVar;
            }

            /* JADX INFO: renamed from: k */
            public b clone() {
                return m().f(j());
            }

            @Override // of.i.b
            /* JADX INFO: renamed from: o */
            public b f(c cVar) {
                if (cVar == c.r()) {
                    return this;
                }
                if (cVar.x()) {
                    t(cVar.t());
                }
                if (cVar.z()) {
                    u(cVar.v());
                }
                if (cVar.w()) {
                    r(cVar.s());
                }
                g(d().c(cVar.f14206b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // of.p.a
            /* JADX INFO: renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public gf.p.c.b S(of.e r3, of.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    of.r r1 = gf.p.c.f14205s     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    gf.p$c r3 = (gf.p.c) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                    gf.p$c r4 = (gf.p.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: gf.p.c.b.S(of.e, of.g):gf.p$c$b");
            }

            public b r(EnumC0202c enumC0202c) {
                enumC0202c.getClass();
                this.f14213b |= 4;
                this.f14216e = enumC0202c;
                return this;
            }

            public b t(int i10) {
                this.f14213b |= 1;
                this.f14214c = i10;
                return this;
            }

            public b u(int i10) {
                this.f14213b |= 2;
                this.f14215d = i10;
                return this;
            }

            private void n() {
            }
        }
    }

    static {
        p pVar = new p(true);
        f14196f = pVar;
        pVar.s();
    }

    /* synthetic */ p(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static p p() {
        return f14196f;
    }

    private void s() {
        this.f14199c = Collections.EMPTY_LIST;
    }

    public static b t() {
        return b.m();
    }

    public static b v(p pVar) {
        return t().f(pVar);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f14199c.size(); i10++) {
            fVar.c0(1, (of.p) this.f14199c.get(i10));
        }
        fVar.h0(this.f14198b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14201e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f14199c.size(); i11++) {
            iR += of.f.r(1, (of.p) this.f14199c.get(i11));
        }
        int size = iR + this.f14198b.size();
        this.f14201e = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14200d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < r(); i10++) {
            if (!q(i10).isInitialized()) {
                this.f14200d = (byte) 0;
                return false;
            }
        }
        this.f14200d = (byte) 1;
        return true;
    }

    public c q(int i10) {
        return (c) this.f14199c.get(i10);
    }

    public int r() {
        return this.f14199c.size();
    }

    @Override // of.p
    /* JADX INFO: renamed from: w */
    public b newBuilderForType() {
        return t();
    }

    @Override // of.p
    /* JADX INFO: renamed from: x */
    public b toBuilder() {
        return v(this);
    }

    /* synthetic */ p(i.b bVar, gf.a aVar) {
        this(bVar);
    }

    private p(i.b bVar) {
        super(bVar);
        this.f14200d = (byte) -1;
        this.f14201e = -1;
        this.f14198b = bVar.d();
    }

    private p(boolean z10) {
        this.f14200d = (byte) -1;
        this.f14201e = -1;
        this.f14198b = of.d.f23423a;
    }

    private p(of.e eVar, of.g gVar) {
        this.f14200d = (byte) -1;
        this.f14201e = -1;
        s();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ != 10) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if (!z11) {
                                this.f14199c = new ArrayList();
                                z11 = true;
                            }
                            this.f14199c.add(eVar.t(c.f14205s, gVar));
                        }
                    }
                    z10 = true;
                } catch (of.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.f14199c = DesugarCollections.unmodifiableList(this.f14199c);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14198b = bVarO.l();
                    throw th3;
                }
                this.f14198b = bVarO.l();
                g();
                throw th2;
            }
        }
        if (z11) {
            this.f14199c = DesugarCollections.unmodifiableList(this.f14199c);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14198b = bVarO.l();
            throw th4;
        }
        this.f14198b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b */
        private int f14202b;

        /* JADX INFO: renamed from: c */
        private List f14203c = Collections.EMPTY_LIST;

        private b() {
            o();
        }

        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f14202b & 1) != 1) {
                this.f14203c = new ArrayList(this.f14203c);
                this.f14202b |= 1;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i */
        public p build() {
            p pVarJ = j();
            if (pVarJ.isInitialized()) {
                return pVarJ;
            }
            throw a.AbstractC0317a.b(pVarJ);
        }

        public p j() {
            p pVar = new p(this);
            if ((this.f14202b & 1) == 1) {
                this.f14203c = DesugarCollections.unmodifiableList(this.f14203c);
                this.f14202b &= -2;
            }
            pVar.f14199c = this.f14203c;
            return pVar;
        }

        /* JADX INFO: renamed from: k */
        public b clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: p */
        public b f(p pVar) {
            if (pVar == p.p()) {
                return this;
            }
            if (!pVar.f14199c.isEmpty()) {
                if (this.f14203c.isEmpty()) {
                    this.f14203c = pVar.f14199c;
                    this.f14202b &= -2;
                } else {
                    n();
                    this.f14203c.addAll(pVar.f14199c);
                }
            }
            g(d().c(pVar.f14198b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.p.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.p.f14197g     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.p r3 = (gf.p) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.p r4 = (gf.p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.p.b.S(of.e, of.g):gf.p$b");
        }

        private void o() {
        }
    }
}
