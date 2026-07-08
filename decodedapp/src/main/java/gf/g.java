package gf;

import gf.i;
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
public final class g extends of.i implements of.q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final g f14027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static of.r f14028t = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final of.d f14029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f14031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f14032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f14033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f14034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte f14035h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14036r;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public g b(of.e eVar, of.g gVar) {
            return new g(eVar, gVar);
        }
    }

    public enum c implements j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static j.b f14045e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14047a;

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
            this.f14047a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // of.j.a
        public final int getNumber() {
            return this.f14047a;
        }
    }

    public enum d implements j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static j.b f14051e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14053a;

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
            this.f14053a = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // of.j.a
        public final int getNumber() {
            return this.f14053a;
        }
    }

    static {
        g gVar = new g(true);
        f14027s = gVar;
        gVar.K();
    }

    private void K() {
        this.f14031d = c.RETURNS_CONSTANT;
        this.f14032e = Collections.EMPTY_LIST;
        this.f14033f = i.G();
        this.f14034g = d.AT_MOST_ONCE;
    }

    public static b L() {
        return b.m();
    }

    public static b N(g gVar) {
        return L().f(gVar);
    }

    public static g v() {
        return f14027s;
    }

    public c A() {
        return this.f14031d;
    }

    public d C() {
        return this.f14034g;
    }

    public boolean D() {
        return (this.f14030c & 2) == 2;
    }

    public boolean G() {
        return (this.f14030c & 1) == 1;
    }

    public boolean H() {
        return (this.f14030c & 4) == 4;
    }

    @Override // of.p
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return L();
    }

    @Override // of.p
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return N(this);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        if ((this.f14030c & 1) == 1) {
            fVar.R(1, this.f14031d.getNumber());
        }
        for (int i10 = 0; i10 < this.f14032e.size(); i10++) {
            fVar.c0(2, (of.p) this.f14032e.get(i10));
        }
        if ((this.f14030c & 2) == 2) {
            fVar.c0(3, this.f14033f);
        }
        if ((this.f14030c & 4) == 4) {
            fVar.R(4, this.f14034g.getNumber());
        }
        fVar.h0(this.f14029b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14036r;
        if (i10 != -1) {
            return i10;
        }
        int iH = (this.f14030c & 1) == 1 ? of.f.h(1, this.f14031d.getNumber()) : 0;
        for (int i11 = 0; i11 < this.f14032e.size(); i11++) {
            iH += of.f.r(2, (of.p) this.f14032e.get(i11));
        }
        if ((this.f14030c & 2) == 2) {
            iH += of.f.r(3, this.f14033f);
        }
        if ((this.f14030c & 4) == 4) {
            iH += of.f.h(4, this.f14034g.getNumber());
        }
        int size = iH + this.f14029b.size();
        this.f14036r = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14035h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < x(); i10++) {
            if (!w(i10).isInitialized()) {
                this.f14035h = (byte) 0;
                return false;
            }
        }
        if (!D() || t().isInitialized()) {
            this.f14035h = (byte) 1;
            return true;
        }
        this.f14035h = (byte) 0;
        return false;
    }

    public i t() {
        return this.f14033f;
    }

    public i w(int i10) {
        return (i) this.f14032e.get(i10);
    }

    public int x() {
        return this.f14032e.size();
    }

    public List z() {
        return this.f14032e;
    }

    private g(i.b bVar) {
        super(bVar);
        this.f14035h = (byte) -1;
        this.f14036r = -1;
        this.f14029b = bVar.d();
    }

    private g(boolean z10) {
        this.f14035h = (byte) -1;
        this.f14036r = -1;
        this.f14029b = of.d.f23423a;
    }

    private g(of.e eVar, of.g gVar) {
        this.f14035h = (byte) -1;
        this.f14036r = -1;
        K();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            int iM = eVar.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f14030c |= 1;
                                this.f14031d = cVarA;
                            }
                        } else if (iJ == 18) {
                            if ((c10 & 2) != 2) {
                                this.f14032e = new ArrayList();
                                c10 = 2;
                            }
                            this.f14032e.add(eVar.t(i.f14066w, gVar));
                        } else if (iJ == 26) {
                            i.b builder = (this.f14030c & 2) == 2 ? this.f14033f.toBuilder() : null;
                            i iVar = (i) eVar.t(i.f14066w, gVar);
                            this.f14033f = iVar;
                            if (builder != null) {
                                builder.f(iVar);
                                this.f14033f = builder.j();
                            }
                            this.f14030c |= 2;
                        } else if (iJ != 32) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            int iM2 = eVar.m();
                            d dVarA = d.a(iM2);
                            if (dVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM2);
                            } else {
                                this.f14030c |= 4;
                                this.f14034g = dVarA;
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
                if ((c10 & 2) == 2) {
                    this.f14032e = DesugarCollections.unmodifiableList(this.f14032e);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14029b = bVarO.l();
                    throw th3;
                }
                this.f14029b = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((c10 & 2) == 2) {
            this.f14032e = DesugarCollections.unmodifiableList(this.f14032e);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14029b = bVarO.l();
            throw th4;
        }
        this.f14029b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f14038c = c.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f14039d = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i f14040e = i.G();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f14041f = d.AT_MOST_ONCE;

        private b() {
            o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f14037b & 2) != 2) {
                this.f14039d = new ArrayList(this.f14039d);
                this.f14037b |= 2;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public g build() {
            g gVarJ = j();
            if (gVarJ.isInitialized()) {
                return gVarJ;
            }
            throw a.AbstractC0317a.b(gVarJ);
        }

        public g j() {
            g gVar = new g(this);
            int i10 = this.f14037b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            gVar.f14031d = this.f14038c;
            if ((this.f14037b & 2) == 2) {
                this.f14039d = DesugarCollections.unmodifiableList(this.f14039d);
                this.f14037b &= -3;
            }
            gVar.f14032e = this.f14039d;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            gVar.f14033f = this.f14040e;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            gVar.f14034g = this.f14041f;
            gVar.f14030c = i11;
            return gVar;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m().f(j());
        }

        public b p(i iVar) {
            if ((this.f14037b & 4) != 4 || this.f14040e == i.G()) {
                this.f14040e = iVar;
            } else {
                this.f14040e = i.c0(this.f14040e).f(iVar).j();
            }
            this.f14037b |= 4;
            return this;
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b f(g gVar) {
            if (gVar == g.v()) {
                return this;
            }
            if (gVar.G()) {
                u(gVar.A());
            }
            if (!gVar.f14032e.isEmpty()) {
                if (this.f14039d.isEmpty()) {
                    this.f14039d = gVar.f14032e;
                    this.f14037b &= -3;
                } else {
                    n();
                    this.f14039d.addAll(gVar.f14032e);
                }
            }
            if (gVar.D()) {
                p(gVar.t());
            }
            if (gVar.H()) {
                v(gVar.C());
            }
            g(d().c(gVar.f14029b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.g.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.g.f14028t     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.g r3 = (gf.g) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.g r4 = (gf.g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.g.b.S(of.e, of.g):gf.g$b");
        }

        public b u(c cVar) {
            cVar.getClass();
            this.f14037b |= 1;
            this.f14038c = cVar;
            return this;
        }

        public b v(d dVar) {
            dVar.getClass();
            this.f14037b |= 8;
            this.f14041f = dVar;
            return this;
        }

        private void o() {
        }
    }
}
