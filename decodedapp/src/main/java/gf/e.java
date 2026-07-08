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
public final class e extends i.d implements of.q {

    /* JADX INFO: renamed from: u */
    private static final e f14002u;

    /* JADX INFO: renamed from: v */
    public static of.r f14003v = new a();

    /* JADX INFO: renamed from: c */
    private final of.d f14004c;

    /* JADX INFO: renamed from: d */
    private int f14005d;

    /* JADX INFO: renamed from: e */
    private int f14006e;

    /* JADX INFO: renamed from: f */
    private List f14007f;

    /* JADX INFO: renamed from: g */
    private List f14008g;

    /* JADX INFO: renamed from: h */
    private List f14009h;

    /* JADX INFO: renamed from: r */
    private List f14010r;

    /* JADX INFO: renamed from: s */
    private byte f14011s;

    /* JADX INFO: renamed from: t */
    private int f14012t;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public e b(of.e eVar, of.g gVar) {
            return new e(eVar, gVar);
        }
    }

    static {
        e eVar = new e(true);
        f14002u = eVar;
        eVar.f0();
    }

    /* synthetic */ e(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static e X() {
        return f14002u;
    }

    private void f0() {
        this.f14006e = 6;
        List list = Collections.EMPTY_LIST;
        this.f14007f = list;
        this.f14008g = list;
        this.f14009h = list;
        this.f14010r = list;
    }

    public static b g0() {
        return b.r();
    }

    public static b h0(e eVar) {
        return g0().f(eVar);
    }

    public gf.b O(int i10) {
        return (gf.b) this.f14010r.get(i10);
    }

    public int Q() {
        return this.f14010r.size();
    }

    public List R() {
        return this.f14010r;
    }

    public d T(int i10) {
        return (d) this.f14009h.get(i10);
    }

    public int W() {
        return this.f14009h.size();
    }

    @Override // of.q
    /* JADX INFO: renamed from: Y */
    public e getDefaultInstanceForType() {
        return f14002u;
    }

    public int Z() {
        return this.f14006e;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14005d & 1) == 1) {
            fVar.Z(1, this.f14006e);
        }
        for (int i10 = 0; i10 < this.f14007f.size(); i10++) {
            fVar.c0(2, (of.p) this.f14007f.get(i10));
        }
        for (int i11 = 0; i11 < this.f14010r.size(); i11++) {
            fVar.c0(3, (of.p) this.f14010r.get(i11));
        }
        for (int i12 = 0; i12 < this.f14008g.size(); i12++) {
            fVar.Z(31, ((Integer) this.f14008g.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f14009h.size(); i13++) {
            fVar.c0(32, (of.p) this.f14009h.get(i13));
        }
        aVarT.a(19000, fVar);
        fVar.h0(this.f14004c);
    }

    public v a0(int i10) {
        return (v) this.f14007f.get(i10);
    }

    public int b0() {
        return this.f14007f.size();
    }

    public List c0() {
        return this.f14007f;
    }

    public List d0() {
        return this.f14008g;
    }

    public boolean e0() {
        return (this.f14005d & 1) == 1;
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14012t;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14005d & 1) == 1 ? of.f.o(1, this.f14006e) : 0;
        for (int i11 = 0; i11 < this.f14007f.size(); i11++) {
            iO += of.f.r(2, (of.p) this.f14007f.get(i11));
        }
        for (int i12 = 0; i12 < this.f14010r.size(); i12++) {
            iO += of.f.r(3, (of.p) this.f14010r.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f14008g.size(); i13++) {
            iP += of.f.p(((Integer) this.f14008g.get(i13)).intValue());
        }
        int size = iO + iP + (d0().size() * 2);
        for (int i14 = 0; i14 < this.f14009h.size(); i14++) {
            size += of.f.r(32, (of.p) this.f14009h.get(i14));
        }
        int iO2 = size + o() + this.f14004c.size();
        this.f14012t = iO2;
        return iO2;
    }

    @Override // of.p
    /* JADX INFO: renamed from: i0 */
    public b newBuilderForType() {
        return g0();
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14011s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < b0(); i10++) {
            if (!a0(i10).isInitialized()) {
                this.f14011s = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < W(); i11++) {
            if (!T(i11).isInitialized()) {
                this.f14011s = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < Q(); i12++) {
            if (!O(i12).isInitialized()) {
                this.f14011s = (byte) 0;
                return false;
            }
        }
        if (n()) {
            this.f14011s = (byte) 1;
            return true;
        }
        this.f14011s = (byte) 0;
        return false;
    }

    @Override // of.p
    /* JADX INFO: renamed from: j0 */
    public b toBuilder() {
        return h0(this);
    }

    /* synthetic */ e(i.c cVar, gf.a aVar) {
        this(cVar);
    }

    private e(i.c cVar) {
        super(cVar);
        this.f14011s = (byte) -1;
        this.f14012t = -1;
        this.f14004c = cVar.d();
    }

    private e(boolean z10) {
        this.f14011s = (byte) -1;
        this.f14012t = -1;
        this.f14004c = of.d.f23423a;
    }

    private e(of.e eVar, of.g gVar) {
        this.f14011s = (byte) -1;
        this.f14012t = -1;
        f0();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f14005d |= 1;
                                this.f14006e = eVar.r();
                            } else if (iJ == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f14007f = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f14007f.add(eVar.t(v.f14344y, gVar));
                            } else if (iJ == 26) {
                                if ((i10 & 16) != 16) {
                                    this.f14010r = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f14010r.add(eVar.t(gf.b.f13887r, gVar));
                            } else if (iJ == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f14008g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f14008g.add(Integer.valueOf(eVar.r()));
                            } else if (iJ == 250) {
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 4) != 4 && eVar.e() > 0) {
                                    this.f14008g = new ArrayList();
                                    i10 |= 4;
                                }
                                while (eVar.e() > 0) {
                                    this.f14008g.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                            } else if (iJ != 258) {
                                if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                if ((i10 & 8) != 8) {
                                    this.f14009h = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f14009h.add(eVar.t(d.f13992r, gVar));
                            }
                        }
                        z10 = true;
                    } catch (of.k e10) {
                        throw e10.i(this);
                    }
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 2) == 2) {
                    this.f14007f = DesugarCollections.unmodifiableList(this.f14007f);
                }
                if ((i10 & 16) == 16) {
                    this.f14010r = DesugarCollections.unmodifiableList(this.f14010r);
                }
                if ((i10 & 4) == 4) {
                    this.f14008g = DesugarCollections.unmodifiableList(this.f14008g);
                }
                if ((i10 & 8) == 8) {
                    this.f14009h = DesugarCollections.unmodifiableList(this.f14009h);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14004c = bVarO.l();
                    throw th3;
                }
                this.f14004c = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((i10 & 2) == 2) {
            this.f14007f = DesugarCollections.unmodifiableList(this.f14007f);
        }
        if ((i10 & 16) == 16) {
            this.f14010r = DesugarCollections.unmodifiableList(this.f14010r);
        }
        if ((i10 & 4) == 4) {
            this.f14008g = DesugarCollections.unmodifiableList(this.f14008g);
        }
        if ((i10 & 8) == 8) {
            this.f14009h = DesugarCollections.unmodifiableList(this.f14009h);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14004c = bVarO.l();
            throw th4;
        }
        this.f14004c = bVarO.l();
        g();
    }

    public static final class b extends i.c implements of.q {

        /* JADX INFO: renamed from: d */
        private int f14013d;

        /* JADX INFO: renamed from: e */
        private int f14014e = 6;

        /* JADX INFO: renamed from: f */
        private List f14015f;

        /* JADX INFO: renamed from: g */
        private List f14016g;

        /* JADX INFO: renamed from: h */
        private List f14017h;

        /* JADX INFO: renamed from: r */
        private List f14018r;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f14015f = list;
            this.f14016g = list;
            this.f14017h = list;
            this.f14018r = list;
            x();
        }

        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14013d & 16) != 16) {
                this.f14018r = new ArrayList(this.f14018r);
                this.f14013d |= 16;
            }
        }

        private void u() {
            if ((this.f14013d & 8) != 8) {
                this.f14017h = new ArrayList(this.f14017h);
                this.f14013d |= 8;
            }
        }

        private void v() {
            if ((this.f14013d & 2) != 2) {
                this.f14015f = new ArrayList(this.f14015f);
                this.f14013d |= 2;
            }
        }

        private void w() {
            if ((this.f14013d & 4) != 4) {
                this.f14016g = new ArrayList(this.f14016g);
                this.f14013d |= 4;
            }
        }

        public b A(int i10) {
            this.f14013d |= 1;
            this.f14014e = i10;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n */
        public e build() {
            e eVarO = o();
            if (eVarO.isInitialized()) {
                return eVarO;
            }
            throw a.AbstractC0317a.b(eVarO);
        }

        public e o() {
            e eVar = new e(this);
            int i10 = (this.f14013d & 1) != 1 ? 0 : 1;
            eVar.f14006e = this.f14014e;
            if ((this.f14013d & 2) == 2) {
                this.f14015f = DesugarCollections.unmodifiableList(this.f14015f);
                this.f14013d &= -3;
            }
            eVar.f14007f = this.f14015f;
            if ((this.f14013d & 4) == 4) {
                this.f14016g = DesugarCollections.unmodifiableList(this.f14016g);
                this.f14013d &= -5;
            }
            eVar.f14008g = this.f14016g;
            if ((this.f14013d & 8) == 8) {
                this.f14017h = DesugarCollections.unmodifiableList(this.f14017h);
                this.f14013d &= -9;
            }
            eVar.f14009h = this.f14017h;
            if ((this.f14013d & 16) == 16) {
                this.f14018r = DesugarCollections.unmodifiableList(this.f14018r);
                this.f14013d &= -17;
            }
            eVar.f14010r = this.f14018r;
            eVar.f14005d = i10;
            return eVar;
        }

        /* JADX INFO: renamed from: p */
        public b clone() {
            return r().f(o());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: y */
        public b f(e eVar) {
            if (eVar == e.X()) {
                return this;
            }
            if (eVar.e0()) {
                A(eVar.Z());
            }
            if (!eVar.f14007f.isEmpty()) {
                if (this.f14015f.isEmpty()) {
                    this.f14015f = eVar.f14007f;
                    this.f14013d &= -3;
                } else {
                    v();
                    this.f14015f.addAll(eVar.f14007f);
                }
            }
            if (!eVar.f14008g.isEmpty()) {
                if (this.f14016g.isEmpty()) {
                    this.f14016g = eVar.f14008g;
                    this.f14013d &= -5;
                } else {
                    w();
                    this.f14016g.addAll(eVar.f14008g);
                }
            }
            if (!eVar.f14009h.isEmpty()) {
                if (this.f14017h.isEmpty()) {
                    this.f14017h = eVar.f14009h;
                    this.f14013d &= -9;
                } else {
                    u();
                    this.f14017h.addAll(eVar.f14009h);
                }
            }
            if (!eVar.f14010r.isEmpty()) {
                if (this.f14018r.isEmpty()) {
                    this.f14018r = eVar.f14010r;
                    this.f14013d &= -17;
                } else {
                    t();
                    this.f14018r.addAll(eVar.f14010r);
                }
            }
            k(eVar);
            g(d().c(eVar.f14004c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.e.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.e.f14003v     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.e r3 = (gf.e) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.e r4 = (gf.e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.e.b.S(of.e, of.g):gf.e$b");
        }

        private void x() {
        }
    }
}
