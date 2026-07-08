package gf;

import java.io.IOException;
import of.a;
import of.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends of.i implements of.q {

    /* JADX INFO: renamed from: f */
    private static final q f14223f;

    /* JADX INFO: renamed from: g */
    public static of.r f14224g = new a();

    /* JADX INFO: renamed from: b */
    private final of.d f14225b;

    /* JADX INFO: renamed from: c */
    private of.n f14226c;

    /* JADX INFO: renamed from: d */
    private byte f14227d;

    /* JADX INFO: renamed from: e */
    private int f14228e;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public q b(of.e eVar, of.g gVar) {
            return new q(eVar, gVar);
        }
    }

    static {
        q qVar = new q(true);
        f14223f = qVar;
        qVar.s();
    }

    /* synthetic */ q(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static q p() {
        return f14223f;
    }

    private void s() {
        this.f14226c = of.m.f23482b;
    }

    public static b t() {
        return b.m();
    }

    public static b v(q qVar) {
        return t().f(qVar);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f14226c.size(); i10++) {
            fVar.N(1, this.f14226c.X(i10));
        }
        fVar.h0(this.f14225b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14228e;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f14226c.size(); i11++) {
            iE += of.f.e(this.f14226c.X(i11));
        }
        int size = iE + r().size() + this.f14225b.size();
        this.f14228e = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14227d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f14227d = (byte) 1;
        return true;
    }

    public String q(int i10) {
        return (String) this.f14226c.get(i10);
    }

    public of.s r() {
        return this.f14226c;
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

    /* synthetic */ q(i.b bVar, gf.a aVar) {
        this(bVar);
    }

    private q(i.b bVar) {
        super(bVar);
        this.f14227d = (byte) -1;
        this.f14228e = -1;
        this.f14225b = bVar.d();
    }

    private q(boolean z10) {
        this.f14227d = (byte) -1;
        this.f14228e = -1;
        this.f14225b = of.d.f23423a;
    }

    private q(of.e eVar, of.g gVar) {
        this.f14227d = (byte) -1;
        this.f14228e = -1;
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
                            of.d dVarK = eVar.k();
                            if (!z11) {
                                this.f14226c = new of.m();
                                z11 = true;
                            }
                            this.f14226c.T(dVarK);
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
                    this.f14226c = this.f14226c.n();
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14225b = bVarO.l();
                    throw th3;
                }
                this.f14225b = bVarO.l();
                g();
                throw th2;
            }
        }
        if (z11) {
            this.f14226c = this.f14226c.n();
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14225b = bVarO.l();
            throw th4;
        }
        this.f14225b = bVarO.l();
        g();
    }

    public static final class b extends i.b implements of.q {

        /* JADX INFO: renamed from: b */
        private int f14229b;

        /* JADX INFO: renamed from: c */
        private of.n f14230c = of.m.f23482b;

        private b() {
            o();
        }

        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f14229b & 1) != 1) {
                this.f14230c = new of.m(this.f14230c);
                this.f14229b |= 1;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i */
        public q build() {
            q qVarJ = j();
            if (qVarJ.isInitialized()) {
                return qVarJ;
            }
            throw a.AbstractC0317a.b(qVarJ);
        }

        public q j() {
            q qVar = new q(this);
            if ((this.f14229b & 1) == 1) {
                this.f14230c = this.f14230c.n();
                this.f14229b &= -2;
            }
            qVar.f14226c = this.f14230c;
            return qVar;
        }

        /* JADX INFO: renamed from: k */
        public b clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: p */
        public b f(q qVar) {
            if (qVar == q.p()) {
                return this;
            }
            if (!qVar.f14226c.isEmpty()) {
                if (this.f14230c.isEmpty()) {
                    this.f14230c = qVar.f14226c;
                    this.f14229b &= -2;
                } else {
                    n();
                    this.f14230c.addAll(qVar.f14226c);
                }
            }
            g(d().c(qVar.f14225b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.q.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.q.f14224g     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.q r3 = (gf.q) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.q r4 = (gf.q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.q.b.S(of.e, of.g):gf.q$b");
        }

        private void o() {
        }
    }
}
