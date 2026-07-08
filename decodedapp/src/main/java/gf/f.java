package gf;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import of.a;
import of.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends of.i implements of.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f14019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static of.r f14020g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final of.d f14021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f14022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f14023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14024e;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public f b(of.e eVar, of.g gVar) {
            return new f(eVar, gVar);
        }
    }

    static {
        f fVar = new f(true);
        f14019f = fVar;
        fVar.t();
    }

    public static f p() {
        return f14019f;
    }

    private void t() {
        this.f14022c = Collections.EMPTY_LIST;
    }

    public static b v() {
        return b.m();
    }

    public static b w(f fVar) {
        return v().f(fVar);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f14022c.size(); i10++) {
            fVar.c0(1, (of.p) this.f14022c.get(i10));
        }
        fVar.h0(this.f14021b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14024e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f14022c.size(); i11++) {
            iR += of.f.r(1, (of.p) this.f14022c.get(i11));
        }
        int size = iR + this.f14021b.size();
        this.f14024e = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14023d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < r(); i10++) {
            if (!q(i10).isInitialized()) {
                this.f14023d = (byte) 0;
                return false;
            }
        }
        this.f14023d = (byte) 1;
        return true;
    }

    public g q(int i10) {
        return (g) this.f14022c.get(i10);
    }

    public int r() {
        return this.f14022c.size();
    }

    public List s() {
        return this.f14022c;
    }

    @Override // of.p
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return v();
    }

    @Override // of.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return w(this);
    }

    private f(i.b bVar) {
        super(bVar);
        this.f14023d = (byte) -1;
        this.f14024e = -1;
        this.f14021b = bVar.d();
    }

    private f(boolean z10) {
        this.f14023d = (byte) -1;
        this.f14024e = -1;
        this.f14021b = of.d.f23423a;
    }

    private f(of.e eVar, of.g gVar) {
        this.f14023d = (byte) -1;
        this.f14024e = -1;
        t();
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
                                this.f14022c = new ArrayList();
                                z11 = true;
                            }
                            this.f14022c.add(eVar.t(g.f14028t, gVar));
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
                    this.f14022c = DesugarCollections.unmodifiableList(this.f14022c);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14021b = bVarO.l();
                    throw th3;
                }
                this.f14021b = bVarO.l();
                g();
                throw th2;
            }
        }
        if (z11) {
            this.f14022c = DesugarCollections.unmodifiableList(this.f14022c);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14021b = bVarO.l();
            throw th4;
        }
        this.f14021b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f14026c = Collections.EMPTY_LIST;

        private b() {
            o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f14025b & 1) != 1) {
                this.f14026c = new ArrayList(this.f14026c);
                this.f14025b |= 1;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public f build() {
            f fVarJ = j();
            if (fVarJ.isInitialized()) {
                return fVarJ;
            }
            throw a.AbstractC0317a.b(fVarJ);
        }

        public f j() {
            f fVar = new f(this);
            if ((this.f14025b & 1) == 1) {
                this.f14026c = DesugarCollections.unmodifiableList(this.f14026c);
                this.f14025b &= -2;
            }
            fVar.f14022c = this.f14026c;
            return fVar;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b f(f fVar) {
            if (fVar == f.p()) {
                return this;
            }
            if (!fVar.f14022c.isEmpty()) {
                if (this.f14026c.isEmpty()) {
                    this.f14026c = fVar.f14022c;
                    this.f14025b &= -2;
                } else {
                    n();
                    this.f14026c.addAll(fVar.f14022c);
                }
            }
            g(d().c(fVar.f14021b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.f.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.f.f14020g     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.f r3 = (gf.f) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.f r4 = (gf.f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.f.b.S(of.e, of.g):gf.f$b");
        }

        private void o() {
        }
    }
}
