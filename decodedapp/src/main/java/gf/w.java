package gf;

import java.io.IOException;
import of.a;
import of.d;
import of.i;
import of.j;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends of.i implements of.q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final w f14366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static of.r f14367v = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final of.d f14368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f14372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14374h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private d f14375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f14376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14377t;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public w b(of.e eVar, of.g gVar) {
            return new w(eVar, gVar);
        }
    }

    public enum c implements j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static j.b f14388e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14390a;

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
            this.f14390a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // of.j.a
        public final int getNumber() {
            return this.f14390a;
        }
    }

    public enum d implements j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static j.b f14394e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14396a;

        static class a implements j.b {
            a() {
            }

            @Override // of.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        d(int i10, int i11) {
            this.f14396a = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // of.j.a
        public final int getNumber() {
            return this.f14396a;
        }
    }

    static {
        w wVar = new w(true);
        f14366u = wVar;
        wVar.Q();
    }

    private void Q() {
        this.f14370d = 0;
        this.f14371e = 0;
        this.f14372f = c.ERROR;
        this.f14373g = 0;
        this.f14374h = 0;
        this.f14375r = d.LANGUAGE_VERSION;
    }

    public static b R() {
        return b.m();
    }

    public static b T(w wVar) {
        return R().f(wVar);
    }

    public static w v() {
        return f14366u;
    }

    public int A() {
        return this.f14370d;
    }

    public int C() {
        return this.f14371e;
    }

    public d D() {
        return this.f14375r;
    }

    public boolean G() {
        return (this.f14369c & 8) == 8;
    }

    public boolean H() {
        return (this.f14369c & 4) == 4;
    }

    public boolean K() {
        return (this.f14369c & 16) == 16;
    }

    public boolean L() {
        return (this.f14369c & 1) == 1;
    }

    public boolean N() {
        return (this.f14369c & 2) == 2;
    }

    public boolean O() {
        return (this.f14369c & 32) == 32;
    }

    @Override // of.p
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return R();
    }

    @Override // of.p
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return T(this);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        if ((this.f14369c & 1) == 1) {
            fVar.Z(1, this.f14370d);
        }
        if ((this.f14369c & 2) == 2) {
            fVar.Z(2, this.f14371e);
        }
        if ((this.f14369c & 4) == 4) {
            fVar.R(3, this.f14372f.getNumber());
        }
        if ((this.f14369c & 8) == 8) {
            fVar.Z(4, this.f14373g);
        }
        if ((this.f14369c & 16) == 16) {
            fVar.Z(5, this.f14374h);
        }
        if ((this.f14369c & 32) == 32) {
            fVar.R(6, this.f14375r.getNumber());
        }
        fVar.h0(this.f14368b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14377t;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14369c & 1) == 1 ? of.f.o(1, this.f14370d) : 0;
        if ((this.f14369c & 2) == 2) {
            iO += of.f.o(2, this.f14371e);
        }
        if ((this.f14369c & 4) == 4) {
            iO += of.f.h(3, this.f14372f.getNumber());
        }
        if ((this.f14369c & 8) == 8) {
            iO += of.f.o(4, this.f14373g);
        }
        if ((this.f14369c & 16) == 16) {
            iO += of.f.o(5, this.f14374h);
        }
        if ((this.f14369c & 32) == 32) {
            iO += of.f.h(6, this.f14375r.getNumber());
        }
        int size = iO + this.f14368b.size();
        this.f14377t = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14376s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f14376s = (byte) 1;
        return true;
    }

    public int w() {
        return this.f14373g;
    }

    public c x() {
        return this.f14372f;
    }

    public int z() {
        return this.f14374h;
    }

    private w(i.b bVar) {
        super(bVar);
        this.f14376s = (byte) -1;
        this.f14377t = -1;
        this.f14368b = bVar.d();
    }

    private w(boolean z10) {
        this.f14376s = (byte) -1;
        this.f14377t = -1;
        this.f14368b = of.d.f23423a;
    }

    private w(of.e eVar, of.g gVar) {
        this.f14376s = (byte) -1;
        this.f14377t = -1;
        Q();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f14369c |= 1;
                            this.f14370d = eVar.r();
                        } else if (iJ == 16) {
                            this.f14369c |= 2;
                            this.f14371e = eVar.r();
                        } else if (iJ == 24) {
                            int iM = eVar.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f14369c |= 4;
                                this.f14372f = cVarA;
                            }
                        } else if (iJ == 32) {
                            this.f14369c |= 8;
                            this.f14373g = eVar.r();
                        } else if (iJ == 40) {
                            this.f14369c |= 16;
                            this.f14374h = eVar.r();
                        } else if (iJ != 48) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            int iM2 = eVar.m();
                            d dVarA = d.a(iM2);
                            if (dVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM2);
                            } else {
                                this.f14369c |= 32;
                                this.f14375r = dVarA;
                            }
                        }
                    }
                    z10 = true;
                } catch (of.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14368b = bVarO.l();
                    throw th3;
                }
                this.f14368b = bVarO.l();
                g();
                throw th2;
            }
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14368b = bVarO.l();
            throw th4;
        }
        this.f14368b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14380d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f14382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14383g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f14381e = c.ERROR;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f14384h = d.LANGUAGE_VERSION;

        private b() {
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b m() {
            return new b();
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public w build() {
            w wVarJ = j();
            if (wVarJ.isInitialized()) {
                return wVarJ;
            }
            throw a.AbstractC0317a.b(wVarJ);
        }

        public w j() {
            w wVar = new w(this);
            int i10 = this.f14378b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            wVar.f14370d = this.f14379c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            wVar.f14371e = this.f14380d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            wVar.f14372f = this.f14381e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            wVar.f14373g = this.f14382f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            wVar.f14374h = this.f14383g;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            wVar.f14375r = this.f14384h;
            wVar.f14369c = i11;
            return wVar;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b f(w wVar) {
            if (wVar == w.v()) {
                return this;
            }
            if (wVar.L()) {
                v(wVar.A());
            }
            if (wVar.N()) {
                w(wVar.C());
            }
            if (wVar.H()) {
                t(wVar.x());
            }
            if (wVar.G()) {
                r(wVar.w());
            }
            if (wVar.K()) {
                u(wVar.z());
            }
            if (wVar.O()) {
                x(wVar.D());
            }
            g(d().c(wVar.f14368b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.w.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.w.f14367v     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.w r3 = (gf.w) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.w r4 = (gf.w) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.w.b.S(of.e, of.g):gf.w$b");
        }

        public b r(int i10) {
            this.f14378b |= 8;
            this.f14382f = i10;
            return this;
        }

        public b t(c cVar) {
            cVar.getClass();
            this.f14378b |= 4;
            this.f14381e = cVar;
            return this;
        }

        public b u(int i10) {
            this.f14378b |= 16;
            this.f14383g = i10;
            return this;
        }

        public b v(int i10) {
            this.f14378b |= 1;
            this.f14379c = i10;
            return this;
        }

        public b w(int i10) {
            this.f14378b |= 2;
            this.f14380d = i10;
            return this;
        }

        public b x(d dVar) {
            dVar.getClass();
            this.f14378b |= 32;
            this.f14384h = dVar;
            return this;
        }

        private void n() {
        }
    }
}
