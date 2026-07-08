package gf;

import com.facebook.stetho.server.http.HttpStatus;
import gf.b;
import gf.r;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import of.a;
import of.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends i.d implements of.q {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final v f14343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static of.r f14344y = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final of.d f14345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r f14349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14350h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private r f14351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f14352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f14353t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.C0197b.c f14354u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f14355v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f14356w;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public v b(of.e eVar, of.g gVar) {
            return new v(eVar, gVar);
        }
    }

    static {
        v vVar = new v(true);
        f14343x = vVar;
        vVar.l0();
    }

    public static v W() {
        return f14343x;
    }

    private void l0() {
        this.f14347e = 0;
        this.f14348f = 0;
        this.f14349g = r.e0();
        this.f14350h = 0;
        this.f14351r = r.e0();
        this.f14352s = 0;
        this.f14353t = Collections.EMPTY_LIST;
        this.f14354u = b.C0197b.c.O();
    }

    public static b m0() {
        return b.r();
    }

    public static b n0(v vVar) {
        return m0().f(vVar);
    }

    public gf.b O(int i10) {
        return (gf.b) this.f14353t.get(i10);
    }

    public int Q() {
        return this.f14353t.size();
    }

    public List R() {
        return this.f14353t;
    }

    public b.C0197b.c T() {
        return this.f14354u;
    }

    @Override // of.q
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public v getDefaultInstanceForType() {
        return f14343x;
    }

    public int Y() {
        return this.f14347e;
    }

    public int Z() {
        return this.f14348f;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14346d & 1) == 1) {
            fVar.Z(1, this.f14347e);
        }
        if ((this.f14346d & 2) == 2) {
            fVar.Z(2, this.f14348f);
        }
        if ((this.f14346d & 4) == 4) {
            fVar.c0(3, this.f14349g);
        }
        if ((this.f14346d & 16) == 16) {
            fVar.c0(4, this.f14351r);
        }
        if ((this.f14346d & 8) == 8) {
            fVar.Z(5, this.f14350h);
        }
        if ((this.f14346d & 32) == 32) {
            fVar.Z(6, this.f14352s);
        }
        for (int i10 = 0; i10 < this.f14353t.size(); i10++) {
            fVar.c0(7, (of.p) this.f14353t.get(i10));
        }
        if ((this.f14346d & 64) == 64) {
            fVar.c0(8, this.f14354u);
        }
        aVarT.a(HttpStatus.HTTP_OK, fVar);
        fVar.h0(this.f14345c);
    }

    public r a0() {
        return this.f14349g;
    }

    public int b0() {
        return this.f14350h;
    }

    public r c0() {
        return this.f14351r;
    }

    public int d0() {
        return this.f14352s;
    }

    public boolean e0() {
        return (this.f14346d & 64) == 64;
    }

    public boolean f0() {
        return (this.f14346d & 1) == 1;
    }

    public boolean g0() {
        return (this.f14346d & 2) == 2;
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14356w;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14346d & 1) == 1 ? of.f.o(1, this.f14347e) : 0;
        if ((this.f14346d & 2) == 2) {
            iO += of.f.o(2, this.f14348f);
        }
        if ((this.f14346d & 4) == 4) {
            iO += of.f.r(3, this.f14349g);
        }
        if ((this.f14346d & 16) == 16) {
            iO += of.f.r(4, this.f14351r);
        }
        if ((this.f14346d & 8) == 8) {
            iO += of.f.o(5, this.f14350h);
        }
        if ((this.f14346d & 32) == 32) {
            iO += of.f.o(6, this.f14352s);
        }
        for (int i11 = 0; i11 < this.f14353t.size(); i11++) {
            iO += of.f.r(7, (of.p) this.f14353t.get(i11));
        }
        if ((this.f14346d & 64) == 64) {
            iO += of.f.r(8, this.f14354u);
        }
        int iO2 = iO + o() + this.f14345c.size();
        this.f14356w = iO2;
        return iO2;
    }

    public boolean h0() {
        return (this.f14346d & 4) == 4;
    }

    public boolean i0() {
        return (this.f14346d & 8) == 8;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14355v;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!g0()) {
            this.f14355v = (byte) 0;
            return false;
        }
        if (h0() && !a0().isInitialized()) {
            this.f14355v = (byte) 0;
            return false;
        }
        if (j0() && !c0().isInitialized()) {
            this.f14355v = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < Q(); i10++) {
            if (!O(i10).isInitialized()) {
                this.f14355v = (byte) 0;
                return false;
            }
        }
        if (e0() && !T().isInitialized()) {
            this.f14355v = (byte) 0;
            return false;
        }
        if (n()) {
            this.f14355v = (byte) 1;
            return true;
        }
        this.f14355v = (byte) 0;
        return false;
    }

    public boolean j0() {
        return (this.f14346d & 16) == 16;
    }

    public boolean k0() {
        return (this.f14346d & 32) == 32;
    }

    @Override // of.p
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return m0();
    }

    @Override // of.p
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return n0(this);
    }

    private v(i.c cVar) {
        super(cVar);
        this.f14355v = (byte) -1;
        this.f14356w = -1;
        this.f14345c = cVar.d();
    }

    private v(boolean z10) {
        this.f14355v = (byte) -1;
        this.f14356w = -1;
        this.f14345c = of.d.f23423a;
    }

    private v(of.e eVar, of.g gVar) {
        this.f14355v = (byte) -1;
        this.f14356w = -1;
        l0();
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
                            this.f14346d |= 1;
                            this.f14347e = eVar.r();
                        } else if (iJ != 16) {
                            if (iJ == 26) {
                                r.c builder = (this.f14346d & 4) == 4 ? this.f14349g.toBuilder() : null;
                                r rVar = (r) eVar.t(r.E, gVar);
                                this.f14349g = rVar;
                                if (builder != null) {
                                    builder.f(rVar);
                                    this.f14349g = builder.o();
                                }
                                this.f14346d |= 4;
                            } else if (iJ == 34) {
                                r.c builder2 = (this.f14346d & 16) == 16 ? this.f14351r.toBuilder() : null;
                                r rVar2 = (r) eVar.t(r.E, gVar);
                                this.f14351r = rVar2;
                                if (builder2 != null) {
                                    builder2.f(rVar2);
                                    this.f14351r = builder2.o();
                                }
                                this.f14346d |= 16;
                            } else if (iJ == 40) {
                                this.f14346d |= 8;
                                this.f14350h = eVar.r();
                            } else if (iJ == 48) {
                                this.f14346d |= 32;
                                this.f14352s = eVar.r();
                            } else if (iJ == 58) {
                                if ((i10 & 64) != 64) {
                                    this.f14353t = new ArrayList();
                                    i10 = 64;
                                }
                                this.f14353t.add(eVar.t(gf.b.f13887r, gVar));
                            } else if (iJ != 66) {
                                if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                b.C0197b.c.C0199b builder3 = (this.f14346d & 64) == 64 ? this.f14354u.toBuilder() : null;
                                b.C0197b.c cVar = (b.C0197b.c) eVar.t(b.C0197b.c.A, gVar);
                                this.f14354u = cVar;
                                if (builder3 != null) {
                                    builder3.f(cVar);
                                    this.f14354u = builder3.j();
                                }
                                this.f14346d |= 64;
                            }
                        } else {
                            this.f14346d |= 2;
                            this.f14348f = eVar.r();
                        }
                    }
                    z10 = true;
                } catch (of.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 64) == 64) {
                    this.f14353t = DesugarCollections.unmodifiableList(this.f14353t);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14345c = bVarO.l();
                    throw th3;
                }
                this.f14345c = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((i10 & 64) == 64) {
            this.f14353t = DesugarCollections.unmodifiableList(this.f14353t);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14345c = bVarO.l();
            throw th4;
        }
        this.f14345c = bVarO.l();
        g();
    }

    public static final class b extends i.c implements of.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f14359f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f14361h;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f14363s;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private r f14360g = r.e0();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private r f14362r = r.e0();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f14364t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private b.C0197b.c f14365u = b.C0197b.c.O();

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14357d & 64) != 64) {
                this.f14364t = new ArrayList(this.f14364t);
                this.f14357d |= 64;
            }
        }

        public b A(int i10) {
            this.f14357d |= 1;
            this.f14358e = i10;
            return this;
        }

        public b B(int i10) {
            this.f14357d |= 2;
            this.f14359f = i10;
            return this;
        }

        public b C(int i10) {
            this.f14357d |= 8;
            this.f14361h = i10;
            return this;
        }

        public b D(int i10) {
            this.f14357d |= 32;
            this.f14363s = i10;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public v build() {
            v vVarO = o();
            if (vVarO.isInitialized()) {
                return vVarO;
            }
            throw a.AbstractC0317a.b(vVarO);
        }

        public v o() {
            v vVar = new v(this);
            int i10 = this.f14357d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            vVar.f14347e = this.f14358e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            vVar.f14348f = this.f14359f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            vVar.f14349g = this.f14360g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            vVar.f14350h = this.f14361h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            vVar.f14351r = this.f14362r;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            vVar.f14352s = this.f14363s;
            if ((this.f14357d & 64) == 64) {
                this.f14364t = DesugarCollections.unmodifiableList(this.f14364t);
                this.f14357d &= -65;
            }
            vVar.f14353t = this.f14364t;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            vVar.f14354u = this.f14365u;
            vVar.f14346d = i11;
            return vVar;
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(o());
        }

        public b v(b.C0197b.c cVar) {
            if ((this.f14357d & 128) != 128 || this.f14365u == b.C0197b.c.O()) {
                this.f14365u = cVar;
            } else {
                this.f14365u = b.C0197b.c.m0(this.f14365u).f(cVar).j();
            }
            this.f14357d |= 128;
            return this;
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b f(v vVar) {
            if (vVar == v.W()) {
                return this;
            }
            if (vVar.f0()) {
                A(vVar.Y());
            }
            if (vVar.g0()) {
                B(vVar.Z());
            }
            if (vVar.h0()) {
                y(vVar.a0());
            }
            if (vVar.i0()) {
                C(vVar.b0());
            }
            if (vVar.j0()) {
                z(vVar.c0());
            }
            if (vVar.k0()) {
                D(vVar.d0());
            }
            if (!vVar.f14353t.isEmpty()) {
                if (this.f14364t.isEmpty()) {
                    this.f14364t = vVar.f14353t;
                    this.f14357d &= -65;
                } else {
                    t();
                    this.f14364t.addAll(vVar.f14353t);
                }
            }
            if (vVar.e0()) {
                v(vVar.T());
            }
            k(vVar);
            g(d().c(vVar.f14345c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.v.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.v.f14344y     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.v r3 = (gf.v) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.v r4 = (gf.v) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.v.b.S(of.e, of.g):gf.v$b");
        }

        public b y(r rVar) {
            if ((this.f14357d & 4) != 4 || this.f14360g == r.e0()) {
                this.f14360g = rVar;
            } else {
                this.f14360g = r.F0(this.f14360g).f(rVar).o();
            }
            this.f14357d |= 4;
            return this;
        }

        public b z(r rVar) {
            if ((this.f14357d & 16) != 16 || this.f14362r == r.e0()) {
                this.f14362r = rVar;
            } else {
                this.f14362r = r.F0(this.f14362r).f(rVar).o();
            }
            this.f14357d |= 16;
            return this;
        }

        private void u() {
        }
    }
}
