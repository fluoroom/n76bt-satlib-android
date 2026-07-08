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
public final class u extends of.i implements of.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u f14332h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static of.r f14333r = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final of.d f14334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f14336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f14338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14339g;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public u b(of.e eVar, of.g gVar) {
            return new u(eVar, gVar);
        }
    }

    static {
        u uVar = new u(true);
        f14332h = uVar;
        uVar.z();
    }

    public static b A() {
        return b.m();
    }

    public static b C(u uVar) {
        return A().f(uVar);
    }

    public static u r() {
        return f14332h;
    }

    private void z() {
        this.f14336d = Collections.EMPTY_LIST;
        this.f14337e = -1;
    }

    @Override // of.p
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return A();
    }

    @Override // of.p
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return C(this);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f14336d.size(); i10++) {
            fVar.c0(1, (of.p) this.f14336d.get(i10));
        }
        if ((this.f14335c & 1) == 1) {
            fVar.Z(2, this.f14337e);
        }
        fVar.h0(this.f14334b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14339g;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < this.f14336d.size(); i11++) {
            iO += of.f.r(1, (of.p) this.f14336d.get(i11));
        }
        if ((this.f14335c & 1) == 1) {
            iO += of.f.o(2, this.f14337e);
        }
        int size = iO + this.f14334b.size();
        this.f14339g = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14338f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < v(); i10++) {
            if (!t(i10).isInitialized()) {
                this.f14338f = (byte) 0;
                return false;
            }
        }
        this.f14338f = (byte) 1;
        return true;
    }

    public int s() {
        return this.f14337e;
    }

    public r t(int i10) {
        return (r) this.f14336d.get(i10);
    }

    public int v() {
        return this.f14336d.size();
    }

    public List w() {
        return this.f14336d;
    }

    public boolean x() {
        return (this.f14335c & 1) == 1;
    }

    private u(i.b bVar) {
        super(bVar);
        this.f14338f = (byte) -1;
        this.f14339g = -1;
        this.f14334b = bVar.d();
    }

    private u(boolean z10) {
        this.f14338f = (byte) -1;
        this.f14339g = -1;
        this.f14334b = of.d.f23423a;
    }

    private u(of.e eVar, of.g gVar) {
        this.f14338f = (byte) -1;
        this.f14339g = -1;
        z();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            if (!z11) {
                                this.f14336d = new ArrayList();
                                z11 = true;
                            }
                            this.f14336d.add(eVar.t(r.E, gVar));
                        } else if (iJ != 16) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            this.f14335c |= 1;
                            this.f14337e = eVar.r();
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
                    this.f14336d = DesugarCollections.unmodifiableList(this.f14336d);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14334b = bVarO.l();
                    throw th3;
                }
                this.f14334b = bVarO.l();
                g();
                throw th2;
            }
        }
        if (z11) {
            this.f14336d = DesugarCollections.unmodifiableList(this.f14336d);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14334b = bVarO.l();
            throw th4;
        }
        this.f14334b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f14341c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14342d = -1;

        private b() {
            o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f14340b & 1) != 1) {
                this.f14341c = new ArrayList(this.f14341c);
                this.f14340b |= 1;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public u build() {
            u uVarJ = j();
            if (uVarJ.isInitialized()) {
                return uVarJ;
            }
            throw a.AbstractC0317a.b(uVarJ);
        }

        public u j() {
            u uVar = new u(this);
            int i10 = this.f14340b;
            if ((i10 & 1) == 1) {
                this.f14341c = DesugarCollections.unmodifiableList(this.f14341c);
                this.f14340b &= -2;
            }
            uVar.f14336d = this.f14341c;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            uVar.f14337e = this.f14342d;
            uVar.f14335c = i11;
            return uVar;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b f(u uVar) {
            if (uVar == u.r()) {
                return this;
            }
            if (!uVar.f14336d.isEmpty()) {
                if (this.f14341c.isEmpty()) {
                    this.f14341c = uVar.f14336d;
                    this.f14340b &= -2;
                } else {
                    n();
                    this.f14341c.addAll(uVar.f14336d);
                }
            }
            if (uVar.x()) {
                t(uVar.s());
            }
            g(d().c(uVar.f14334b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.u.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.u.f14333r     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.u r3 = (gf.u) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.u r4 = (gf.u) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.u.b.S(of.e, of.g):gf.u$b");
        }

        public b t(int i10) {
            this.f14340b |= 2;
            this.f14342d = i10;
            return this;
        }

        private void o() {
        }
    }
}
