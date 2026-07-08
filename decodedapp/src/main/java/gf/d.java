package gf;

import java.io.IOException;
import of.a;
import of.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends of.i implements of.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f13991h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static of.r f13992r = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final of.d f13993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private of.d f13996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f13997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f13998g;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d b(of.e eVar, of.g gVar) {
            return new d(eVar, gVar);
        }
    }

    static {
        d dVar = new d(true);
        f13991h = dVar;
        dVar.w();
    }

    public static d r() {
        return f13991h;
    }

    private void w() {
        this.f13995d = 0;
        this.f13996e = of.d.f23423a;
    }

    public static b x() {
        return b.m();
    }

    public static b z(d dVar) {
        return x().f(dVar);
    }

    @Override // of.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return x();
    }

    @Override // of.p
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return z(this);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        if ((this.f13994c & 1) == 1) {
            fVar.Z(1, this.f13995d);
        }
        if ((this.f13994c & 2) == 2) {
            fVar.N(2, this.f13996e);
        }
        fVar.h0(this.f13993b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f13998g;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f13994c & 1) == 1 ? of.f.o(1, this.f13995d) : 0;
        if ((this.f13994c & 2) == 2) {
            iO += of.f.d(2, this.f13996e);
        }
        int size = iO + this.f13993b.size();
        this.f13998g = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f13997f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!v()) {
            this.f13997f = (byte) 0;
            return false;
        }
        if (t()) {
            this.f13997f = (byte) 1;
            return true;
        }
        this.f13997f = (byte) 0;
        return false;
    }

    public of.d q() {
        return this.f13996e;
    }

    public int s() {
        return this.f13995d;
    }

    public boolean t() {
        return (this.f13994c & 2) == 2;
    }

    public boolean v() {
        return (this.f13994c & 1) == 1;
    }

    private d(i.b bVar) {
        super(bVar);
        this.f13997f = (byte) -1;
        this.f13998g = -1;
        this.f13993b = bVar.d();
    }

    private d(boolean z10) {
        this.f13997f = (byte) -1;
        this.f13998g = -1;
        this.f13993b = of.d.f23423a;
    }

    private d(of.e eVar, of.g gVar) {
        this.f13997f = (byte) -1;
        this.f13998g = -1;
        w();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f13994c |= 1;
                            this.f13995d = eVar.r();
                        } else if (iJ != 18) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            this.f13994c |= 2;
                            this.f13996e = eVar.k();
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
                    this.f13993b = bVarO.l();
                    throw th3;
                }
                this.f13993b = bVarO.l();
                g();
                throw th2;
            }
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f13993b = bVarO.l();
            throw th4;
        }
        this.f13993b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private of.d f14001d = of.d.f23423a;

        private b() {
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b m() {
            return new b();
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public d build() {
            d dVarJ = j();
            if (dVarJ.isInitialized()) {
                return dVarJ;
            }
            throw a.AbstractC0317a.b(dVarJ);
        }

        public d j() {
            d dVar = new d(this);
            int i10 = this.f13999b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            dVar.f13995d = this.f14000c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            dVar.f13996e = this.f14001d;
            dVar.f13994c = i11;
            return dVar;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b f(d dVar) {
            if (dVar == d.r()) {
                return this;
            }
            if (dVar.v()) {
                t(dVar.s());
            }
            if (dVar.t()) {
                r(dVar.q());
            }
            g(d().c(dVar.f13993b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.d.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.d.f13992r     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.d r3 = (gf.d) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.d r4 = (gf.d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.d.b.S(of.e, of.g):gf.d$b");
        }

        public b r(of.d dVar) {
            dVar.getClass();
            this.f13999b |= 2;
            this.f14001d = dVar;
            return this;
        }

        public b t(int i10) {
            this.f13999b |= 1;
            this.f14000c = i10;
            return this;
        }

        private void n() {
        }
    }
}
