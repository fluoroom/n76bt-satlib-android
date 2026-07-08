package gf;

import com.facebook.stetho.server.http.HttpStatus;
import gf.u;
import gf.x;
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
public final class m extends i.d implements of.q {

    /* JADX INFO: renamed from: u */
    private static final m f14135u;

    /* JADX INFO: renamed from: v */
    public static of.r f14136v = new a();

    /* JADX INFO: renamed from: c */
    private final of.d f14137c;

    /* JADX INFO: renamed from: d */
    private int f14138d;

    /* JADX INFO: renamed from: e */
    private List f14139e;

    /* JADX INFO: renamed from: f */
    private List f14140f;

    /* JADX INFO: renamed from: g */
    private List f14141g;

    /* JADX INFO: renamed from: h */
    private u f14142h;

    /* JADX INFO: renamed from: r */
    private x f14143r;

    /* JADX INFO: renamed from: s */
    private byte f14144s;

    /* JADX INFO: renamed from: t */
    private int f14145t;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public m b(of.e eVar, of.g gVar) {
            return new m(eVar, gVar);
        }
    }

    static {
        m mVar = new m(true);
        f14135u = mVar;
        mVar.g0();
    }

    /* synthetic */ m(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static m N() {
        return f14135u;
    }

    private void g0() {
        List list = Collections.EMPTY_LIST;
        this.f14139e = list;
        this.f14140f = list;
        this.f14141g = list;
        this.f14142h = u.r();
        this.f14143r = x.p();
    }

    public static b h0() {
        return b.r();
    }

    public static b i0(m mVar) {
        return h0().f(mVar);
    }

    public static m k0(InputStream inputStream, of.g gVar) {
        return (m) f14136v.c(inputStream, gVar);
    }

    @Override // of.q
    /* JADX INFO: renamed from: O */
    public m getDefaultInstanceForType() {
        return f14135u;
    }

    public j Q(int i10) {
        return (j) this.f14139e.get(i10);
    }

    public int R() {
        return this.f14139e.size();
    }

    public List T() {
        return this.f14139e;
    }

    public o W(int i10) {
        return (o) this.f14140f.get(i10);
    }

    public int X() {
        return this.f14140f.size();
    }

    public List Y() {
        return this.f14140f;
    }

    public s Z(int i10) {
        return (s) this.f14141g.get(i10);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        for (int i10 = 0; i10 < this.f14139e.size(); i10++) {
            fVar.c0(3, (of.p) this.f14139e.get(i10));
        }
        for (int i11 = 0; i11 < this.f14140f.size(); i11++) {
            fVar.c0(4, (of.p) this.f14140f.get(i11));
        }
        for (int i12 = 0; i12 < this.f14141g.size(); i12++) {
            fVar.c0(5, (of.p) this.f14141g.get(i12));
        }
        if ((this.f14138d & 1) == 1) {
            fVar.c0(30, this.f14142h);
        }
        if ((this.f14138d & 2) == 2) {
            fVar.c0(32, this.f14143r);
        }
        aVarT.a(HttpStatus.HTTP_OK, fVar);
        fVar.h0(this.f14137c);
    }

    public int a0() {
        return this.f14141g.size();
    }

    public List b0() {
        return this.f14141g;
    }

    public u c0() {
        return this.f14142h;
    }

    public x d0() {
        return this.f14143r;
    }

    public boolean e0() {
        return (this.f14138d & 1) == 1;
    }

    public boolean f0() {
        return (this.f14138d & 2) == 2;
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14145t;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f14139e.size(); i11++) {
            iR += of.f.r(3, (of.p) this.f14139e.get(i11));
        }
        for (int i12 = 0; i12 < this.f14140f.size(); i12++) {
            iR += of.f.r(4, (of.p) this.f14140f.get(i12));
        }
        for (int i13 = 0; i13 < this.f14141g.size(); i13++) {
            iR += of.f.r(5, (of.p) this.f14141g.get(i13));
        }
        if ((this.f14138d & 1) == 1) {
            iR += of.f.r(30, this.f14142h);
        }
        if ((this.f14138d & 2) == 2) {
            iR += of.f.r(32, this.f14143r);
        }
        int iO = iR + o() + this.f14137c.size();
        this.f14145t = iO;
        return iO;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14144s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < R(); i10++) {
            if (!Q(i10).isInitialized()) {
                this.f14144s = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < X(); i11++) {
            if (!W(i11).isInitialized()) {
                this.f14144s = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < a0(); i12++) {
            if (!Z(i12).isInitialized()) {
                this.f14144s = (byte) 0;
                return false;
            }
        }
        if (e0() && !c0().isInitialized()) {
            this.f14144s = (byte) 0;
            return false;
        }
        if (n()) {
            this.f14144s = (byte) 1;
            return true;
        }
        this.f14144s = (byte) 0;
        return false;
    }

    @Override // of.p
    /* JADX INFO: renamed from: j0 */
    public b newBuilderForType() {
        return h0();
    }

    @Override // of.p
    /* JADX INFO: renamed from: l0 */
    public b toBuilder() {
        return i0(this);
    }

    /* synthetic */ m(i.c cVar, gf.a aVar) {
        this(cVar);
    }

    private m(i.c cVar) {
        super(cVar);
        this.f14144s = (byte) -1;
        this.f14145t = -1;
        this.f14137c = cVar.d();
    }

    private m(boolean z10) {
        this.f14144s = (byte) -1;
        this.f14145t = -1;
        this.f14137c = of.d.f23423a;
    }

    private m(of.e eVar, of.g gVar) {
        this.f14144s = (byte) -1;
        this.f14145t = -1;
        g0();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 26) {
                            if ((i10 & 1) != 1) {
                                this.f14139e = new ArrayList();
                                i10 |= 1;
                            }
                            this.f14139e.add(eVar.t(j.J, gVar));
                        } else if (iJ == 34) {
                            if ((i10 & 2) != 2) {
                                this.f14140f = new ArrayList();
                                i10 |= 2;
                            }
                            this.f14140f.add(eVar.t(o.N, gVar));
                        } else if (iJ != 42) {
                            if (iJ == 242) {
                                u.b bVarG = (this.f14138d & 1) == 1 ? this.f14142h.toBuilder() : null;
                                u uVar = (u) eVar.t(u.f14333r, gVar);
                                this.f14142h = uVar;
                                if (bVarG != null) {
                                    bVarG.f(uVar);
                                    this.f14142h = bVarG.j();
                                }
                                this.f14138d |= 1;
                            } else if (iJ != 258) {
                                if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                x.b builder = (this.f14138d & 2) == 2 ? this.f14143r.toBuilder() : null;
                                x xVar = (x) eVar.t(x.f14398g, gVar);
                                this.f14143r = xVar;
                                if (builder != null) {
                                    builder.f(xVar);
                                    this.f14143r = builder.j();
                                }
                                this.f14138d |= 2;
                            }
                        } else {
                            if ((i10 & 4) != 4) {
                                this.f14141g = new ArrayList();
                                i10 |= 4;
                            }
                            this.f14141g.add(eVar.t(s.A, gVar));
                        }
                    }
                    z10 = true;
                } catch (of.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 1) == 1) {
                    this.f14139e = DesugarCollections.unmodifiableList(this.f14139e);
                }
                if ((i10 & 2) == 2) {
                    this.f14140f = DesugarCollections.unmodifiableList(this.f14140f);
                }
                if ((i10 & 4) == 4) {
                    this.f14141g = DesugarCollections.unmodifiableList(this.f14141g);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14137c = bVarO.l();
                    throw th3;
                }
                this.f14137c = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((i10 & 1) == 1) {
            this.f14139e = DesugarCollections.unmodifiableList(this.f14139e);
        }
        if ((i10 & 2) == 2) {
            this.f14140f = DesugarCollections.unmodifiableList(this.f14140f);
        }
        if ((i10 & 4) == 4) {
            this.f14141g = DesugarCollections.unmodifiableList(this.f14141g);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14137c = bVarO.l();
            throw th4;
        }
        this.f14137c = bVarO.l();
        g();
    }

    public static final class b extends i.c implements of.q {

        /* JADX INFO: renamed from: d */
        private int f14146d;

        /* JADX INFO: renamed from: e */
        private List f14147e;

        /* JADX INFO: renamed from: f */
        private List f14148f;

        /* JADX INFO: renamed from: g */
        private List f14149g;

        /* JADX INFO: renamed from: h */
        private u f14150h;

        /* JADX INFO: renamed from: r */
        private x f14151r;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f14147e = list;
            this.f14148f = list;
            this.f14149g = list;
            this.f14150h = u.r();
            this.f14151r = x.p();
            w();
        }

        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14146d & 1) != 1) {
                this.f14147e = new ArrayList(this.f14147e);
                this.f14146d |= 1;
            }
        }

        private void u() {
            if ((this.f14146d & 2) != 2) {
                this.f14148f = new ArrayList(this.f14148f);
                this.f14146d |= 2;
            }
        }

        private void v() {
            if ((this.f14146d & 4) != 4) {
                this.f14149g = new ArrayList(this.f14149g);
                this.f14146d |= 4;
            }
        }

        public b A(x xVar) {
            if ((this.f14146d & 16) != 16 || this.f14151r == x.p()) {
                this.f14151r = xVar;
            } else {
                this.f14151r = x.v(this.f14151r).f(xVar).j();
            }
            this.f14146d |= 16;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n */
        public m build() {
            m mVarO = o();
            if (mVarO.isInitialized()) {
                return mVarO;
            }
            throw a.AbstractC0317a.b(mVarO);
        }

        public m o() {
            m mVar = new m(this);
            int i10 = this.f14146d;
            if ((i10 & 1) == 1) {
                this.f14147e = DesugarCollections.unmodifiableList(this.f14147e);
                this.f14146d &= -2;
            }
            mVar.f14139e = this.f14147e;
            if ((this.f14146d & 2) == 2) {
                this.f14148f = DesugarCollections.unmodifiableList(this.f14148f);
                this.f14146d &= -3;
            }
            mVar.f14140f = this.f14148f;
            if ((this.f14146d & 4) == 4) {
                this.f14149g = DesugarCollections.unmodifiableList(this.f14149g);
                this.f14146d &= -5;
            }
            mVar.f14141g = this.f14149g;
            int i11 = (i10 & 8) != 8 ? 0 : 1;
            mVar.f14142h = this.f14150h;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            mVar.f14143r = this.f14151r;
            mVar.f14138d = i11;
            return mVar;
        }

        /* JADX INFO: renamed from: p */
        public b clone() {
            return r().f(o());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: x */
        public b f(m mVar) {
            if (mVar == m.N()) {
                return this;
            }
            if (!mVar.f14139e.isEmpty()) {
                if (this.f14147e.isEmpty()) {
                    this.f14147e = mVar.f14139e;
                    this.f14146d &= -2;
                } else {
                    t();
                    this.f14147e.addAll(mVar.f14139e);
                }
            }
            if (!mVar.f14140f.isEmpty()) {
                if (this.f14148f.isEmpty()) {
                    this.f14148f = mVar.f14140f;
                    this.f14146d &= -3;
                } else {
                    u();
                    this.f14148f.addAll(mVar.f14140f);
                }
            }
            if (!mVar.f14141g.isEmpty()) {
                if (this.f14149g.isEmpty()) {
                    this.f14149g = mVar.f14141g;
                    this.f14146d &= -5;
                } else {
                    v();
                    this.f14149g.addAll(mVar.f14141g);
                }
            }
            if (mVar.e0()) {
                z(mVar.c0());
            }
            if (mVar.f0()) {
                A(mVar.d0());
            }
            k(mVar);
            g(d().c(mVar.f14137c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.m.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.m.f14136v     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.m r3 = (gf.m) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.m r4 = (gf.m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.m.b.S(of.e, of.g):gf.m$b");
        }

        public b z(u uVar) {
            if ((this.f14146d & 8) != 8 || this.f14150h == u.r()) {
                this.f14150h = uVar;
            } else {
                this.f14150h = u.C(this.f14150h).f(uVar).j();
            }
            this.f14146d |= 8;
            return this;
        }

        private void w() {
        }
    }
}
