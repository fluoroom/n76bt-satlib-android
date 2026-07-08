package gf;

import com.facebook.stetho.server.http.HttpStatus;
import gf.m;
import gf.p;
import gf.q;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import of.a;
import of.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends i.d implements of.q {

    /* JADX INFO: renamed from: t */
    private static final n f14152t;

    /* JADX INFO: renamed from: u */
    public static of.r f14153u = new a();

    /* JADX INFO: renamed from: c */
    private final of.d f14154c;

    /* JADX INFO: renamed from: d */
    private int f14155d;

    /* JADX INFO: renamed from: e */
    private q f14156e;

    /* JADX INFO: renamed from: f */
    private p f14157f;

    /* JADX INFO: renamed from: g */
    private m f14158g;

    /* JADX INFO: renamed from: h */
    private List f14159h;

    /* JADX INFO: renamed from: r */
    private byte f14160r;

    /* JADX INFO: renamed from: s */
    private int f14161s;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public n b(of.e eVar, of.g gVar) {
            return new n(eVar, gVar);
        }
    }

    static {
        n nVar = new n(true);
        f14152t = nVar;
        nVar.Z();
    }

    /* synthetic */ n(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static n N() {
        return f14152t;
    }

    private void Z() {
        this.f14156e = q.p();
        this.f14157f = p.p();
        this.f14158g = m.N();
        this.f14159h = Collections.EMPTY_LIST;
    }

    public static b a0() {
        return b.r();
    }

    public static b b0(n nVar) {
        return a0().f(nVar);
    }

    public static n d0(InputStream inputStream, of.g gVar) {
        return (n) f14153u.c(inputStream, gVar);
    }

    public c H(int i10) {
        return (c) this.f14159h.get(i10);
    }

    public int K() {
        return this.f14159h.size();
    }

    public List L() {
        return this.f14159h;
    }

    @Override // of.q
    /* JADX INFO: renamed from: O */
    public n getDefaultInstanceForType() {
        return f14152t;
    }

    public m Q() {
        return this.f14158g;
    }

    public p R() {
        return this.f14157f;
    }

    public q T() {
        return this.f14156e;
    }

    public boolean W() {
        return (this.f14155d & 4) == 4;
    }

    public boolean X() {
        return (this.f14155d & 2) == 2;
    }

    public boolean Y() {
        return (this.f14155d & 1) == 1;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14155d & 1) == 1) {
            fVar.c0(1, this.f14156e);
        }
        if ((this.f14155d & 2) == 2) {
            fVar.c0(2, this.f14157f);
        }
        if ((this.f14155d & 4) == 4) {
            fVar.c0(3, this.f14158g);
        }
        for (int i10 = 0; i10 < this.f14159h.size(); i10++) {
            fVar.c0(4, (of.p) this.f14159h.get(i10));
        }
        aVarT.a(HttpStatus.HTTP_OK, fVar);
        fVar.h0(this.f14154c);
    }

    @Override // of.p
    /* JADX INFO: renamed from: c0 */
    public b newBuilderForType() {
        return a0();
    }

    @Override // of.p
    /* JADX INFO: renamed from: e0 */
    public b toBuilder() {
        return b0(this);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14161s;
        if (i10 != -1) {
            return i10;
        }
        int iR = (this.f14155d & 1) == 1 ? of.f.r(1, this.f14156e) : 0;
        if ((this.f14155d & 2) == 2) {
            iR += of.f.r(2, this.f14157f);
        }
        if ((this.f14155d & 4) == 4) {
            iR += of.f.r(3, this.f14158g);
        }
        for (int i11 = 0; i11 < this.f14159h.size(); i11++) {
            iR += of.f.r(4, (of.p) this.f14159h.get(i11));
        }
        int iO = iR + o() + this.f14154c.size();
        this.f14161s = iO;
        return iO;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14160r;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (X() && !R().isInitialized()) {
            this.f14160r = (byte) 0;
            return false;
        }
        if (W() && !Q().isInitialized()) {
            this.f14160r = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < K(); i10++) {
            if (!H(i10).isInitialized()) {
                this.f14160r = (byte) 0;
                return false;
            }
        }
        if (n()) {
            this.f14160r = (byte) 1;
            return true;
        }
        this.f14160r = (byte) 0;
        return false;
    }

    /* synthetic */ n(i.c cVar, gf.a aVar) {
        this(cVar);
    }

    private n(i.c cVar) {
        super(cVar);
        this.f14160r = (byte) -1;
        this.f14161s = -1;
        this.f14154c = cVar.d();
    }

    private n(boolean z10) {
        this.f14160r = (byte) -1;
        this.f14161s = -1;
        this.f14154c = of.d.f23423a;
    }

    private n(of.e eVar, of.g gVar) {
        this.f14160r = (byte) -1;
        this.f14161s = -1;
        Z();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            q.b builder = (this.f14155d & 1) == 1 ? this.f14156e.toBuilder() : null;
                            q qVar = (q) eVar.t(q.f14224g, gVar);
                            this.f14156e = qVar;
                            if (builder != null) {
                                builder.f(qVar);
                                this.f14156e = builder.j();
                            }
                            this.f14155d |= 1;
                        } else if (iJ == 18) {
                            p.b builder2 = (this.f14155d & 2) == 2 ? this.f14157f.toBuilder() : null;
                            p pVar = (p) eVar.t(p.f14197g, gVar);
                            this.f14157f = pVar;
                            if (builder2 != null) {
                                builder2.f(pVar);
                                this.f14157f = builder2.j();
                            }
                            this.f14155d |= 2;
                        } else if (iJ == 26) {
                            m.b builder3 = (this.f14155d & 4) == 4 ? this.f14158g.toBuilder() : null;
                            m mVar = (m) eVar.t(m.f14136v, gVar);
                            this.f14158g = mVar;
                            if (builder3 != null) {
                                builder3.f(mVar);
                                this.f14158g = builder3.o();
                            }
                            this.f14155d |= 4;
                        } else if (iJ != 34) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if ((i10 & 8) != 8) {
                                this.f14159h = new ArrayList();
                                i10 = 8;
                            }
                            this.f14159h.add(eVar.t(c.W, gVar));
                        }
                    }
                    z10 = true;
                } catch (of.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 8) == 8) {
                    this.f14159h = DesugarCollections.unmodifiableList(this.f14159h);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14154c = bVarO.l();
                    throw th3;
                }
                this.f14154c = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((i10 & 8) == 8) {
            this.f14159h = DesugarCollections.unmodifiableList(this.f14159h);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14154c = bVarO.l();
            throw th4;
        }
        this.f14154c = bVarO.l();
        g();
    }

    public static final class b extends i.c implements of.q {

        /* JADX INFO: renamed from: d */
        private int f14162d;

        /* JADX INFO: renamed from: e */
        private q f14163e = q.p();

        /* JADX INFO: renamed from: f */
        private p f14164f = p.p();

        /* JADX INFO: renamed from: g */
        private m f14165g = m.N();

        /* JADX INFO: renamed from: h */
        private List f14166h = Collections.EMPTY_LIST;

        private b() {
            u();
        }

        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14162d & 8) != 8) {
                this.f14166h = new ArrayList(this.f14166h);
                this.f14162d |= 8;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n */
        public n build() {
            n nVarO = o();
            if (nVarO.isInitialized()) {
                return nVarO;
            }
            throw a.AbstractC0317a.b(nVarO);
        }

        public n o() {
            n nVar = new n(this);
            int i10 = this.f14162d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            nVar.f14156e = this.f14163e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            nVar.f14157f = this.f14164f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            nVar.f14158g = this.f14165g;
            if ((this.f14162d & 8) == 8) {
                this.f14166h = DesugarCollections.unmodifiableList(this.f14166h);
                this.f14162d &= -9;
            }
            nVar.f14159h = this.f14166h;
            nVar.f14155d = i11;
            return nVar;
        }

        /* JADX INFO: renamed from: p */
        public b clone() {
            return r().f(o());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: v */
        public b f(n nVar) {
            if (nVar == n.N()) {
                return this;
            }
            if (nVar.Y()) {
                z(nVar.T());
            }
            if (nVar.X()) {
                y(nVar.R());
            }
            if (nVar.W()) {
                x(nVar.Q());
            }
            if (!nVar.f14159h.isEmpty()) {
                if (this.f14166h.isEmpty()) {
                    this.f14166h = nVar.f14159h;
                    this.f14162d &= -9;
                } else {
                    t();
                    this.f14166h.addAll(nVar.f14159h);
                }
            }
            k(nVar);
            g(d().c(nVar.f14154c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: w */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.n.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.n.f14153u     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.n r3 = (gf.n) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.n r4 = (gf.n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.n.b.S(of.e, of.g):gf.n$b");
        }

        public b x(m mVar) {
            if ((this.f14162d & 4) != 4 || this.f14165g == m.N()) {
                this.f14165g = mVar;
            } else {
                this.f14165g = m.i0(this.f14165g).f(mVar).o();
            }
            this.f14162d |= 4;
            return this;
        }

        public b y(p pVar) {
            if ((this.f14162d & 2) != 2 || this.f14164f == p.p()) {
                this.f14164f = pVar;
            } else {
                this.f14164f = p.v(this.f14164f).f(pVar).j();
            }
            this.f14162d |= 2;
            return this;
        }

        public b z(q qVar) {
            if ((this.f14162d & 1) != 1 || this.f14163e == q.p()) {
                this.f14163e = qVar;
            } else {
                this.f14163e = q.v(this.f14163e).f(qVar).j();
            }
            this.f14162d |= 1;
            return this;
        }

        private void u() {
        }
    }
}
