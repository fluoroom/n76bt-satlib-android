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
public final class x extends of.i implements of.q {

    /* JADX INFO: renamed from: f */
    private static final x f14397f;

    /* JADX INFO: renamed from: g */
    public static of.r f14398g = new a();

    /* JADX INFO: renamed from: b */
    private final of.d f14399b;

    /* JADX INFO: renamed from: c */
    private List f14400c;

    /* JADX INFO: renamed from: d */
    private byte f14401d;

    /* JADX INFO: renamed from: e */
    private int f14402e;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public x b(of.e eVar, of.g gVar) {
            return new x(eVar, gVar);
        }
    }

    static {
        x xVar = new x(true);
        f14397f = xVar;
        xVar.s();
    }

    /* synthetic */ x(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static x p() {
        return f14397f;
    }

    private void s() {
        this.f14400c = Collections.EMPTY_LIST;
    }

    public static b t() {
        return b.m();
    }

    public static b v(x xVar) {
        return t().f(xVar);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f14400c.size(); i10++) {
            fVar.c0(1, (of.p) this.f14400c.get(i10));
        }
        fVar.h0(this.f14399b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14402e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f14400c.size(); i11++) {
            iR += of.f.r(1, (of.p) this.f14400c.get(i11));
        }
        int size = iR + this.f14399b.size();
        this.f14402e = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14401d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f14401d = (byte) 1;
        return true;
    }

    public int q() {
        return this.f14400c.size();
    }

    public List r() {
        return this.f14400c;
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

    /* synthetic */ x(i.b bVar, gf.a aVar) {
        this(bVar);
    }

    private x(i.b bVar) {
        super(bVar);
        this.f14401d = (byte) -1;
        this.f14402e = -1;
        this.f14399b = bVar.d();
    }

    private x(boolean z10) {
        this.f14401d = (byte) -1;
        this.f14402e = -1;
        this.f14399b = of.d.f23423a;
    }

    private x(of.e eVar, of.g gVar) {
        this.f14401d = (byte) -1;
        this.f14402e = -1;
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
                                this.f14400c = new ArrayList();
                                z11 = true;
                            }
                            this.f14400c.add(eVar.t(w.f14367v, gVar));
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
                    this.f14400c = DesugarCollections.unmodifiableList(this.f14400c);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14399b = bVarO.l();
                    throw th3;
                }
                this.f14399b = bVarO.l();
                g();
                throw th2;
            }
        }
        if (z11) {
            this.f14400c = DesugarCollections.unmodifiableList(this.f14400c);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14399b = bVarO.l();
            throw th4;
        }
        this.f14399b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b */
        private int f14403b;

        /* JADX INFO: renamed from: c */
        private List f14404c = Collections.EMPTY_LIST;

        private b() {
            o();
        }

        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f14403b & 1) != 1) {
                this.f14404c = new ArrayList(this.f14404c);
                this.f14403b |= 1;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i */
        public x build() {
            x xVarJ = j();
            if (xVarJ.isInitialized()) {
                return xVarJ;
            }
            throw a.AbstractC0317a.b(xVarJ);
        }

        public x j() {
            x xVar = new x(this);
            if ((this.f14403b & 1) == 1) {
                this.f14404c = DesugarCollections.unmodifiableList(this.f14404c);
                this.f14403b &= -2;
            }
            xVar.f14400c = this.f14404c;
            return xVar;
        }

        /* JADX INFO: renamed from: k */
        public b clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: p */
        public b f(x xVar) {
            if (xVar == x.p()) {
                return this;
            }
            if (!xVar.f14400c.isEmpty()) {
                if (this.f14404c.isEmpty()) {
                    this.f14404c = xVar.f14400c;
                    this.f14403b &= -2;
                } else {
                    n();
                    this.f14404c.addAll(xVar.f14400c);
                }
            }
            g(d().c(xVar.f14399b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.x.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.x.f14398g     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.x r3 = (gf.x) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.x r4 = (gf.x) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.x.b.S(of.e, of.g):gf.x$b");
        }

        private void o() {
        }
    }
}
