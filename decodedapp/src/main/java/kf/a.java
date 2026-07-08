package kf;

import gf.m;
import gf.o;
import gf.t;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import of.a;
import of.d;
import of.f;
import of.g;
import of.i;
import of.j;
import of.k;
import of.p;
import of.q;
import of.r;
import of.y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.f f19833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.f f19834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i.f f19835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i.f f19836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i.f f19837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i.f f19838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.f f19839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i.f f19840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i.f f19841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i.f f19842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i.f f19843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i.f f19844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i.f f19845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i.f f19846n;

    public static final class e extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final e f19886h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static r f19887r = new C0265a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final of.d f19888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f19889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f19890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f19891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f19892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19893g;

        /* JADX INFO: renamed from: kf.a$e$a, reason: collision with other inner class name */
        static class C0265a extends of.b {
            C0265a() {
            }

            @Override // of.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e b(of.e eVar, g gVar) {
                return new e(eVar, gVar);
            }
        }

        static {
            e eVar = new e(true);
            f19886h = eVar;
            eVar.v();
        }

        public static e A(InputStream inputStream, g gVar) {
            return (e) f19887r.a(inputStream, gVar);
        }

        public static e r() {
            return f19886h;
        }

        private void v() {
            List list = Collections.EMPTY_LIST;
            this.f19889c = list;
            this.f19890d = list;
        }

        public static b w() {
            return b.m();
        }

        public static b x(e eVar) {
            return w().f(eVar);
        }

        @Override // of.p
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return x(this);
        }

        @Override // of.p
        public void a(f fVar) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f19889c.size(); i10++) {
                fVar.c0(1, (p) this.f19889c.get(i10));
            }
            if (s().size() > 0) {
                fVar.n0(42);
                fVar.n0(this.f19891e);
            }
            for (int i11 = 0; i11 < this.f19890d.size(); i11++) {
                fVar.a0(((Integer) this.f19890d.get(i11)).intValue());
            }
            fVar.h0(this.f19888b);
        }

        @Override // of.p
        public int getSerializedSize() {
            int i10 = this.f19893g;
            if (i10 != -1) {
                return i10;
            }
            int iR = 0;
            for (int i11 = 0; i11 < this.f19889c.size(); i11++) {
                iR += f.r(1, (p) this.f19889c.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f19890d.size(); i12++) {
                iP += f.p(((Integer) this.f19890d.get(i12)).intValue());
            }
            int iP2 = iR + iP;
            if (!s().isEmpty()) {
                iP2 = iP2 + 1 + f.p(iP);
            }
            this.f19891e = iP;
            int size = iP2 + this.f19888b.size();
            this.f19893g = size;
            return size;
        }

        @Override // of.q
        public final boolean isInitialized() {
            byte b10 = this.f19892f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19892f = (byte) 1;
            return true;
        }

        public List s() {
            return this.f19890d;
        }

        public List t() {
            return this.f19889c;
        }

        @Override // of.p
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return w();
        }

        public static final class c extends i implements q {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private static final c f19897w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static r f19898x = new C0266a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final of.d f19899b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f19900c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f19901d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f19902e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Object f19903f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private EnumC0267c f19904g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List f19905h;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private int f19906r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private List f19907s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f19908t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private byte f19909u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private int f19910v;

            /* JADX INFO: renamed from: kf.a$e$c$a, reason: collision with other inner class name */
            static class C0266a extends of.b {
                C0266a() {
                }

                @Override // of.r
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c b(of.e eVar, g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* JADX INFO: renamed from: kf.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC0267c implements j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static j.b f19921e = new C0268a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f19923a;

                /* JADX INFO: renamed from: kf.a$e$c$c$a, reason: collision with other inner class name */
                static class C0268a implements j.b {
                    C0268a() {
                    }

                    @Override // of.j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0267c a(int i10) {
                        return EnumC0267c.a(i10);
                    }
                }

                EnumC0267c(int i10, int i11) {
                    this.f19923a = i11;
                }

                public static EnumC0267c a(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // of.j.a
                public final int getNumber() {
                    return this.f19923a;
                }
            }

            static {
                c cVar = new c(true);
                f19897w = cVar;
                cVar.X();
            }

            private void X() {
                this.f19901d = 1;
                this.f19902e = 0;
                this.f19903f = "";
                this.f19904g = EnumC0267c.NONE;
                List list = Collections.EMPTY_LIST;
                this.f19905h = list;
                this.f19907s = list;
            }

            public static b Y() {
                return b.m();
            }

            public static b Z(c cVar) {
                return Y().f(cVar);
            }

            public static c z() {
                return f19897w;
            }

            public EnumC0267c A() {
                return this.f19904g;
            }

            public int C() {
                return this.f19902e;
            }

            public int D() {
                return this.f19901d;
            }

            public int G() {
                return this.f19907s.size();
            }

            public List H() {
                return this.f19907s;
            }

            public String K() {
                Object obj = this.f19903f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                of.d dVar = (of.d) obj;
                String strY = dVar.y();
                if (dVar.m()) {
                    this.f19903f = strY;
                }
                return strY;
            }

            public of.d L() {
                Object obj = this.f19903f;
                if (!(obj instanceof String)) {
                    return (of.d) obj;
                }
                of.d dVarG = of.d.g((String) obj);
                this.f19903f = dVarG;
                return dVarG;
            }

            public int N() {
                return this.f19905h.size();
            }

            public List O() {
                return this.f19905h;
            }

            public boolean Q() {
                return (this.f19900c & 8) == 8;
            }

            public boolean R() {
                return (this.f19900c & 2) == 2;
            }

            public boolean T() {
                return (this.f19900c & 1) == 1;
            }

            public boolean W() {
                return (this.f19900c & 4) == 4;
            }

            @Override // of.p
            public void a(f fVar) throws IOException {
                getSerializedSize();
                if ((this.f19900c & 1) == 1) {
                    fVar.Z(1, this.f19901d);
                }
                if ((this.f19900c & 2) == 2) {
                    fVar.Z(2, this.f19902e);
                }
                if ((this.f19900c & 8) == 8) {
                    fVar.R(3, this.f19904g.getNumber());
                }
                if (O().size() > 0) {
                    fVar.n0(34);
                    fVar.n0(this.f19906r);
                }
                for (int i10 = 0; i10 < this.f19905h.size(); i10++) {
                    fVar.a0(((Integer) this.f19905h.get(i10)).intValue());
                }
                if (H().size() > 0) {
                    fVar.n0(42);
                    fVar.n0(this.f19908t);
                }
                for (int i11 = 0; i11 < this.f19907s.size(); i11++) {
                    fVar.a0(((Integer) this.f19907s.get(i11)).intValue());
                }
                if ((this.f19900c & 4) == 4) {
                    fVar.N(6, L());
                }
                fVar.h0(this.f19899b);
            }

            @Override // of.p
            /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return Y();
            }

            @Override // of.p
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return Z(this);
            }

            @Override // of.p
            public int getSerializedSize() {
                int i10 = this.f19910v;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f19900c & 1) == 1 ? f.o(1, this.f19901d) : 0;
                if ((this.f19900c & 2) == 2) {
                    iO += f.o(2, this.f19902e);
                }
                if ((this.f19900c & 8) == 8) {
                    iO += f.h(3, this.f19904g.getNumber());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f19905h.size(); i11++) {
                    iP += f.p(((Integer) this.f19905h.get(i11)).intValue());
                }
                int iP2 = iO + iP;
                if (!O().isEmpty()) {
                    iP2 = iP2 + 1 + f.p(iP);
                }
                this.f19906r = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f19907s.size(); i12++) {
                    iP3 += f.p(((Integer) this.f19907s.get(i12)).intValue());
                }
                int iD = iP2 + iP3;
                if (!H().isEmpty()) {
                    iD = iD + 1 + f.p(iP3);
                }
                this.f19908t = iP3;
                if ((this.f19900c & 4) == 4) {
                    iD += f.d(6, L());
                }
                int size = iD + this.f19899b.size();
                this.f19910v = size;
                return size;
            }

            @Override // of.q
            public final boolean isInitialized() {
                byte b10 = this.f19909u;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19909u = (byte) 1;
                return true;
            }

            private c(i.b bVar) {
                super(bVar);
                this.f19906r = -1;
                this.f19908t = -1;
                this.f19909u = (byte) -1;
                this.f19910v = -1;
                this.f19899b = bVar.d();
            }

            private c(boolean z10) {
                this.f19906r = -1;
                this.f19908t = -1;
                this.f19909u = (byte) -1;
                this.f19910v = -1;
                this.f19899b = of.d.f23423a;
            }

            private c(of.e eVar, g gVar) {
                this.f19906r = -1;
                this.f19908t = -1;
                this.f19909u = (byte) -1;
                this.f19910v = -1;
                X();
                d.b bVarO = of.d.o();
                f fVarI = f.I(bVarO, 1);
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f19900c |= 1;
                                    this.f19901d = eVar.r();
                                } else if (iJ == 16) {
                                    this.f19900c |= 2;
                                    this.f19902e = eVar.r();
                                } else if (iJ == 24) {
                                    int iM = eVar.m();
                                    EnumC0267c enumC0267cA = EnumC0267c.a(iM);
                                    if (enumC0267cA == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f19900c |= 8;
                                        this.f19904g = enumC0267cA;
                                    }
                                } else if (iJ == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f19905h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f19905h.add(Integer.valueOf(eVar.r()));
                                } else if (iJ == 34) {
                                    int i11 = eVar.i(eVar.z());
                                    if ((i10 & 16) != 16 && eVar.e() > 0) {
                                        this.f19905h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f19905h.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i11);
                                } else if (iJ == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f19907s = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f19907s.add(Integer.valueOf(eVar.r()));
                                } else if (iJ == 42) {
                                    int i12 = eVar.i(eVar.z());
                                    if ((i10 & 32) != 32 && eVar.e() > 0) {
                                        this.f19907s = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f19907s.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i12);
                                } else if (iJ != 50) {
                                    if (!j(eVar, fVarI, gVar, iJ)) {
                                    }
                                } else {
                                    of.d dVarK = eVar.k();
                                    this.f19900c |= 4;
                                    this.f19903f = dVarK;
                                }
                            }
                            z10 = true;
                        } catch (k e10) {
                            throw e10.i(this);
                        } catch (IOException e11) {
                            throw new k(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th2) {
                        if ((i10 & 16) == 16) {
                            this.f19905h = DesugarCollections.unmodifiableList(this.f19905h);
                        }
                        if ((i10 & 32) == 32) {
                            this.f19907s = DesugarCollections.unmodifiableList(this.f19907s);
                        }
                        try {
                            fVarI.H();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f19899b = bVarO.l();
                            throw th3;
                        }
                        this.f19899b = bVarO.l();
                        g();
                        throw th2;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f19905h = DesugarCollections.unmodifiableList(this.f19905h);
                }
                if ((i10 & 32) == 32) {
                    this.f19907s = DesugarCollections.unmodifiableList(this.f19907s);
                }
                try {
                    fVarI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f19899b = bVarO.l();
                    throw th4;
                }
                this.f19899b = bVarO.l();
                g();
            }

            public static final class b extends i.b implements q {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f19911b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f19913d;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private List f19916g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private List f19917h;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f19912c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Object f19914e = "";

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private EnumC0267c f19915f = EnumC0267c.NONE;

                private b() {
                    List list = Collections.EMPTY_LIST;
                    this.f19916g = list;
                    this.f19917h = list;
                    p();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b m() {
                    return new b();
                }

                private void n() {
                    if ((this.f19911b & 32) != 32) {
                        this.f19917h = new ArrayList(this.f19917h);
                        this.f19911b |= 32;
                    }
                }

                private void o() {
                    if ((this.f19911b & 16) != 16) {
                        this.f19916g = new ArrayList(this.f19916g);
                        this.f19911b |= 16;
                    }
                }

                @Override // of.p.a
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarJ = j();
                    if (cVarJ.isInitialized()) {
                        return cVarJ;
                    }
                    throw a.AbstractC0317a.b(cVarJ);
                }

                public c j() {
                    c cVar = new c(this);
                    int i10 = this.f19911b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f19901d = this.f19912c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f19902e = this.f19913d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f19903f = this.f19914e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f19904g = this.f19915f;
                    if ((this.f19911b & 16) == 16) {
                        this.f19916g = DesugarCollections.unmodifiableList(this.f19916g);
                        this.f19911b &= -17;
                    }
                    cVar.f19905h = this.f19916g;
                    if ((this.f19911b & 32) == 32) {
                        this.f19917h = DesugarCollections.unmodifiableList(this.f19917h);
                        this.f19911b &= -33;
                    }
                    cVar.f19907s = this.f19917h;
                    cVar.f19900c = i11;
                    return cVar;
                }

                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b clone() {
                    return m().f(j());
                }

                @Override // of.i.b
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b f(c cVar) {
                    if (cVar == c.z()) {
                        return this;
                    }
                    if (cVar.T()) {
                        w(cVar.D());
                    }
                    if (cVar.R()) {
                        v(cVar.C());
                    }
                    if (cVar.W()) {
                        this.f19911b |= 4;
                        this.f19914e = cVar.f19903f;
                    }
                    if (cVar.Q()) {
                        u(cVar.A());
                    }
                    if (!cVar.f19905h.isEmpty()) {
                        if (this.f19916g.isEmpty()) {
                            this.f19916g = cVar.f19905h;
                            this.f19911b &= -17;
                        } else {
                            o();
                            this.f19916g.addAll(cVar.f19905h);
                        }
                    }
                    if (!cVar.f19907s.isEmpty()) {
                        if (this.f19917h.isEmpty()) {
                            this.f19917h = cVar.f19907s;
                            this.f19911b &= -33;
                        } else {
                            n();
                            this.f19917h.addAll(cVar.f19907s);
                        }
                    }
                    g(d().c(cVar.f19899b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // of.p.a
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public kf.a.e.c.b S(of.e r3, of.g r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        of.r r1 = kf.a.e.c.f19898x     // Catch: java.lang.Throwable -> Lf of.k -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                        kf.a$e$c r3 = (kf.a.e.c) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                        kf.a$e$c r4 = (kf.a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kf.a.e.c.b.S(of.e, of.g):kf.a$e$c$b");
                }

                public b u(EnumC0267c enumC0267c) {
                    enumC0267c.getClass();
                    this.f19911b |= 8;
                    this.f19915f = enumC0267c;
                    return this;
                }

                public b v(int i10) {
                    this.f19911b |= 2;
                    this.f19913d = i10;
                    return this;
                }

                public b w(int i10) {
                    this.f19911b |= 1;
                    this.f19912c = i10;
                    return this;
                }

                private void p() {
                }
            }
        }

        private e(i.b bVar) {
            super(bVar);
            this.f19891e = -1;
            this.f19892f = (byte) -1;
            this.f19893g = -1;
            this.f19888b = bVar.d();
        }

        private e(boolean z10) {
            this.f19891e = -1;
            this.f19892f = (byte) -1;
            this.f19893g = -1;
            this.f19888b = of.d.f23423a;
        }

        private e(of.e eVar, g gVar) {
            this.f19891e = -1;
            this.f19892f = (byte) -1;
            this.f19893g = -1;
            v();
            d.b bVarO = of.d.o();
            f fVarI = f.I(bVarO, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f19889c = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f19889c.add(eVar.t(c.f19898x, gVar));
                            } else if (iJ == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f19890d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f19890d.add(Integer.valueOf(eVar.r()));
                            } else if (iJ != 42) {
                                if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 2) != 2 && eVar.e() > 0) {
                                    this.f19890d = new ArrayList();
                                    i10 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f19890d.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) == 1) {
                        this.f19889c = DesugarCollections.unmodifiableList(this.f19889c);
                    }
                    if ((i10 & 2) == 2) {
                        this.f19890d = DesugarCollections.unmodifiableList(this.f19890d);
                    }
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19888b = bVarO.l();
                        throw th3;
                    }
                    this.f19888b = bVarO.l();
                    g();
                    throw th2;
                }
            }
            if ((i10 & 1) == 1) {
                this.f19889c = DesugarCollections.unmodifiableList(this.f19889c);
            }
            if ((i10 & 2) == 2) {
                this.f19890d = DesugarCollections.unmodifiableList(this.f19890d);
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f19888b = bVarO.l();
                throw th4;
            }
            this.f19888b = bVarO.l();
            g();
        }

        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f19894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List f19895c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List f19896d;

            private b() {
                List list = Collections.EMPTY_LIST;
                this.f19895c = list;
                this.f19896d = list;
                p();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b m() {
                return new b();
            }

            private void n() {
                if ((this.f19894b & 2) != 2) {
                    this.f19896d = new ArrayList(this.f19896d);
                    this.f19894b |= 2;
                }
            }

            private void o() {
                if ((this.f19894b & 1) != 1) {
                    this.f19895c = new ArrayList(this.f19895c);
                    this.f19894b |= 1;
                }
            }

            @Override // of.p.a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public e build() {
                e eVarJ = j();
                if (eVarJ.isInitialized()) {
                    return eVarJ;
                }
                throw a.AbstractC0317a.b(eVarJ);
            }

            public e j() {
                e eVar = new e(this);
                if ((this.f19894b & 1) == 1) {
                    this.f19895c = DesugarCollections.unmodifiableList(this.f19895c);
                    this.f19894b &= -2;
                }
                eVar.f19889c = this.f19895c;
                if ((this.f19894b & 2) == 2) {
                    this.f19896d = DesugarCollections.unmodifiableList(this.f19896d);
                    this.f19894b &= -3;
                }
                eVar.f19890d = this.f19896d;
                return eVar;
            }

            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return m().f(j());
            }

            @Override // of.i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b f(e eVar) {
                if (eVar == e.r()) {
                    return this;
                }
                if (!eVar.f19889c.isEmpty()) {
                    if (this.f19895c.isEmpty()) {
                        this.f19895c = eVar.f19889c;
                        this.f19894b &= -2;
                    } else {
                        o();
                        this.f19895c.addAll(eVar.f19889c);
                    }
                }
                if (!eVar.f19890d.isEmpty()) {
                    if (this.f19896d.isEmpty()) {
                        this.f19896d = eVar.f19890d;
                        this.f19894b &= -3;
                    } else {
                        n();
                        this.f19896d.addAll(eVar.f19890d);
                    }
                }
                g(d().c(eVar.f19888b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // of.p.a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kf.a.e.b S(of.e r3, of.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    of.r r1 = kf.a.e.f19887r     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    kf.a$e r3 = (kf.a.e) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                    kf.a$e r4 = (kf.a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kf.a.e.b.S(of.e, of.g):kf.a$e$b");
            }

            private void p() {
            }
        }
    }

    static {
        gf.e eVarX = gf.e.X();
        c cVarQ = c.q();
        c cVarQ2 = c.q();
        y.b bVar = y.b.f23539v;
        f19833a = i.i(eVarX, cVarQ, cVarQ2, null, 100, bVar, c.class);
        f19834b = i.i(gf.j.w0(), c.q(), c.q(), null, 100, bVar, c.class);
        gf.j jVarW0 = gf.j.w0();
        y.b bVar2 = y.b.f23533g;
        f19835c = i.i(jVarW0, 0, null, null, 101, bVar2, Integer.class);
        f19836d = i.i(o.F0(), d.t(), d.t(), null, 100, bVar, d.class);
        f19837e = i.i(o.F0(), 0, null, null, 101, bVar2, Integer.class);
        f19838f = i.h(gf.r.e0(), gf.b.v(), null, 100, bVar, false, gf.b.class);
        f19839g = i.i(gf.r.e0(), Boolean.FALSE, null, null, 101, y.b.f23536s, Boolean.class);
        f19840h = i.h(t.N(), gf.b.v(), null, 100, bVar, false, gf.b.class);
        f19841i = i.i(gf.c.O0(), 0, null, null, 101, bVar2, Integer.class);
        f19842j = i.h(gf.c.O0(), o.F0(), null, 102, bVar, false, o.class);
        f19843k = i.i(gf.c.O0(), 0, null, null, 103, bVar2, Integer.class);
        f19844l = i.i(gf.c.O0(), 0, null, null, 104, bVar2, Integer.class);
        f19845m = i.i(m.N(), 0, null, null, 101, bVar2, Integer.class);
        f19846n = i.h(m.N(), o.F0(), null, 102, bVar, false, o.class);
    }

    public static void a(g gVar) {
        gVar.a(f19833a);
        gVar.a(f19834b);
        gVar.a(f19835c);
        gVar.a(f19836d);
        gVar.a(f19837e);
        gVar.a(f19838f);
        gVar.a(f19839g);
        gVar.a(f19840h);
        gVar.a(f19841i);
        gVar.a(f19842j);
        gVar.a(f19843k);
        gVar.a(f19844l);
        gVar.a(f19845m);
        gVar.a(f19846n);
    }

    public static final class b extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b f19847h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static r f19848r = new C0261a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final of.d f19849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f19852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f19853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19854g;

        /* JADX INFO: renamed from: kf.a$b$a, reason: collision with other inner class name */
        static class C0261a extends of.b {
            C0261a() {
            }

            @Override // of.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b b(of.e eVar, g gVar) {
                return new b(eVar, gVar);
            }
        }

        static {
            b bVar = new b(true);
            f19847h = bVar;
            bVar.w();
        }

        public static b q() {
            return f19847h;
        }

        private void w() {
            this.f19851d = 0;
            this.f19852e = 0;
        }

        public static C0262b x() {
            return C0262b.m();
        }

        public static C0262b z(b bVar) {
            return x().f(bVar);
        }

        @Override // of.p
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C0262b newBuilderForType() {
            return x();
        }

        @Override // of.p
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0262b toBuilder() {
            return z(this);
        }

        @Override // of.p
        public void a(f fVar) throws IOException {
            getSerializedSize();
            if ((this.f19850c & 1) == 1) {
                fVar.Z(1, this.f19851d);
            }
            if ((this.f19850c & 2) == 2) {
                fVar.Z(2, this.f19852e);
            }
            fVar.h0(this.f19849b);
        }

        @Override // of.p
        public int getSerializedSize() {
            int i10 = this.f19854g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f19850c & 1) == 1 ? f.o(1, this.f19851d) : 0;
            if ((this.f19850c & 2) == 2) {
                iO += f.o(2, this.f19852e);
            }
            int size = iO + this.f19849b.size();
            this.f19854g = size;
            return size;
        }

        @Override // of.q
        public final boolean isInitialized() {
            byte b10 = this.f19853f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19853f = (byte) 1;
            return true;
        }

        public int r() {
            return this.f19852e;
        }

        public int s() {
            return this.f19851d;
        }

        public boolean t() {
            return (this.f19850c & 2) == 2;
        }

        public boolean v() {
            return (this.f19850c & 1) == 1;
        }

        private b(i.b bVar) {
            super(bVar);
            this.f19853f = (byte) -1;
            this.f19854g = -1;
            this.f19849b = bVar.d();
        }

        private b(boolean z10) {
            this.f19853f = (byte) -1;
            this.f19854g = -1;
            this.f19849b = of.d.f23423a;
        }

        private b(of.e eVar, g gVar) {
            this.f19853f = (byte) -1;
            this.f19854g = -1;
            w();
            d.b bVarO = of.d.o();
            f fVarI = f.I(bVarO, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f19850c |= 1;
                                this.f19851d = eVar.r();
                            } else if (iJ != 16) {
                                if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                this.f19850c |= 2;
                                this.f19852e = eVar.r();
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19849b = bVarO.l();
                        throw th3;
                    }
                    this.f19849b = bVarO.l();
                    g();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f19849b = bVarO.l();
                throw th4;
            }
            this.f19849b = bVarO.l();
            g();
        }

        /* JADX INFO: renamed from: kf.a$b$b, reason: collision with other inner class name */
        public static final class C0262b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f19855b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f19856c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f19857d;

            private C0262b() {
                n();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0262b m() {
                return new C0262b();
            }

            @Override // of.p.a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarJ = j();
                if (bVarJ.isInitialized()) {
                    return bVarJ;
                }
                throw a.AbstractC0317a.b(bVarJ);
            }

            public b j() {
                b bVar = new b(this);
                int i10 = this.f19855b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f19851d = this.f19856c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f19852e = this.f19857d;
                bVar.f19850c = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public C0262b clone() {
                return m().f(j());
            }

            @Override // of.i.b
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0262b f(b bVar) {
                if (bVar == b.q()) {
                    return this;
                }
                if (bVar.v()) {
                    t(bVar.s());
                }
                if (bVar.t()) {
                    r(bVar.r());
                }
                g(d().c(bVar.f19849b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // of.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kf.a.b.C0262b S(of.e r3, of.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    of.r r1 = kf.a.b.f19848r     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    kf.a$b r3 = (kf.a.b) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                    kf.a$b r4 = (kf.a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kf.a.b.C0262b.S(of.e, of.g):kf.a$b$b");
            }

            public C0262b r(int i10) {
                this.f19855b |= 2;
                this.f19857d = i10;
                return this;
            }

            public C0262b t(int i10) {
                this.f19855b |= 1;
                this.f19856c = i10;
                return this;
            }

            private void n() {
            }
        }
    }

    public static final class c extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final c f19858h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static r f19859r = new C0263a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final of.d f19860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f19863e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f19864f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19865g;

        /* JADX INFO: renamed from: kf.a$c$a, reason: collision with other inner class name */
        static class C0263a extends of.b {
            C0263a() {
            }

            @Override // of.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c b(of.e eVar, g gVar) {
                return new c(eVar, gVar);
            }
        }

        static {
            c cVar = new c(true);
            f19858h = cVar;
            cVar.w();
        }

        public static c q() {
            return f19858h;
        }

        private void w() {
            this.f19862d = 0;
            this.f19863e = 0;
        }

        public static b x() {
            return b.m();
        }

        public static b z(c cVar) {
            return x().f(cVar);
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
        public void a(f fVar) throws IOException {
            getSerializedSize();
            if ((this.f19861c & 1) == 1) {
                fVar.Z(1, this.f19862d);
            }
            if ((this.f19861c & 2) == 2) {
                fVar.Z(2, this.f19863e);
            }
            fVar.h0(this.f19860b);
        }

        @Override // of.p
        public int getSerializedSize() {
            int i10 = this.f19865g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f19861c & 1) == 1 ? f.o(1, this.f19862d) : 0;
            if ((this.f19861c & 2) == 2) {
                iO += f.o(2, this.f19863e);
            }
            int size = iO + this.f19860b.size();
            this.f19865g = size;
            return size;
        }

        @Override // of.q
        public final boolean isInitialized() {
            byte b10 = this.f19864f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19864f = (byte) 1;
            return true;
        }

        public int r() {
            return this.f19863e;
        }

        public int s() {
            return this.f19862d;
        }

        public boolean t() {
            return (this.f19861c & 2) == 2;
        }

        public boolean v() {
            return (this.f19861c & 1) == 1;
        }

        private c(i.b bVar) {
            super(bVar);
            this.f19864f = (byte) -1;
            this.f19865g = -1;
            this.f19860b = bVar.d();
        }

        private c(boolean z10) {
            this.f19864f = (byte) -1;
            this.f19865g = -1;
            this.f19860b = of.d.f23423a;
        }

        private c(of.e eVar, g gVar) {
            this.f19864f = (byte) -1;
            this.f19865g = -1;
            w();
            d.b bVarO = of.d.o();
            f fVarI = f.I(bVarO, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f19861c |= 1;
                                this.f19862d = eVar.r();
                            } else if (iJ != 16) {
                                if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                this.f19861c |= 2;
                                this.f19863e = eVar.r();
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19860b = bVarO.l();
                        throw th3;
                    }
                    this.f19860b = bVarO.l();
                    g();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f19860b = bVarO.l();
                throw th4;
            }
            this.f19860b = bVarO.l();
            g();
        }

        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f19866b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f19867c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f19868d;

            private b() {
                n();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b m() {
                return new b();
            }

            @Override // of.p.a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarJ = j();
                if (cVarJ.isInitialized()) {
                    return cVarJ;
                }
                throw a.AbstractC0317a.b(cVarJ);
            }

            public c j() {
                c cVar = new c(this);
                int i10 = this.f19866b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f19862d = this.f19867c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f19863e = this.f19868d;
                cVar.f19861c = i11;
                return cVar;
            }

            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return m().f(j());
            }

            @Override // of.i.b
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b f(c cVar) {
                if (cVar == c.q()) {
                    return this;
                }
                if (cVar.v()) {
                    t(cVar.s());
                }
                if (cVar.t()) {
                    r(cVar.r());
                }
                g(d().c(cVar.f19860b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // of.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kf.a.c.b S(of.e r3, of.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    of.r r1 = kf.a.c.f19859r     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    kf.a$c r3 = (kf.a.c) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                    kf.a$c r4 = (kf.a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kf.a.c.b.S(of.e, of.g):kf.a$c$b");
            }

            public b r(int i10) {
                this.f19866b |= 2;
                this.f19868d = i10;
                return this;
            }

            public b t(int i10) {
                this.f19866b |= 1;
                this.f19867c = i10;
                return this;
            }

            private void n() {
            }
        }
    }

    public static final class d extends i implements q {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final d f19869t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static r f19870u = new C0264a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final of.d f19871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f19873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f19874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f19875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f19876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c f19877h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private byte f19878r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f19879s;

        /* JADX INFO: renamed from: kf.a$d$a, reason: collision with other inner class name */
        static class C0264a extends of.b {
            C0264a() {
            }

            @Override // of.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public d b(of.e eVar, g gVar) {
                return new d(eVar, gVar);
            }
        }

        static {
            d dVar = new d(true);
            f19869t = dVar;
            dVar.L();
        }

        private void L() {
            this.f19873d = b.q();
            this.f19874e = c.q();
            this.f19875f = c.q();
            this.f19876g = c.q();
            this.f19877h = c.q();
        }

        public static b N() {
            return b.m();
        }

        public static b O(d dVar) {
            return N().f(dVar);
        }

        public static d t() {
            return f19869t;
        }

        public c A() {
            return this.f19874e;
        }

        public boolean C() {
            return (this.f19872c & 16) == 16;
        }

        public boolean D() {
            return (this.f19872c & 1) == 1;
        }

        public boolean G() {
            return (this.f19872c & 4) == 4;
        }

        public boolean H() {
            return (this.f19872c & 8) == 8;
        }

        public boolean K() {
            return (this.f19872c & 2) == 2;
        }

        @Override // of.p
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return N();
        }

        @Override // of.p
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return O(this);
        }

        @Override // of.p
        public void a(f fVar) throws IOException {
            getSerializedSize();
            if ((this.f19872c & 1) == 1) {
                fVar.c0(1, this.f19873d);
            }
            if ((this.f19872c & 2) == 2) {
                fVar.c0(2, this.f19874e);
            }
            if ((this.f19872c & 4) == 4) {
                fVar.c0(3, this.f19875f);
            }
            if ((this.f19872c & 8) == 8) {
                fVar.c0(4, this.f19876g);
            }
            if ((this.f19872c & 16) == 16) {
                fVar.c0(5, this.f19877h);
            }
            fVar.h0(this.f19871b);
        }

        @Override // of.p
        public int getSerializedSize() {
            int i10 = this.f19879s;
            if (i10 != -1) {
                return i10;
            }
            int iR = (this.f19872c & 1) == 1 ? f.r(1, this.f19873d) : 0;
            if ((this.f19872c & 2) == 2) {
                iR += f.r(2, this.f19874e);
            }
            if ((this.f19872c & 4) == 4) {
                iR += f.r(3, this.f19875f);
            }
            if ((this.f19872c & 8) == 8) {
                iR += f.r(4, this.f19876g);
            }
            if ((this.f19872c & 16) == 16) {
                iR += f.r(5, this.f19877h);
            }
            int size = iR + this.f19871b.size();
            this.f19879s = size;
            return size;
        }

        @Override // of.q
        public final boolean isInitialized() {
            byte b10 = this.f19878r;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19878r = (byte) 1;
            return true;
        }

        public c v() {
            return this.f19877h;
        }

        public b w() {
            return this.f19873d;
        }

        public c x() {
            return this.f19875f;
        }

        public c z() {
            return this.f19876g;
        }

        private d(i.b bVar) {
            super(bVar);
            this.f19878r = (byte) -1;
            this.f19879s = -1;
            this.f19871b = bVar.d();
        }

        private d(boolean z10) {
            this.f19878r = (byte) -1;
            this.f19879s = -1;
            this.f19871b = of.d.f23423a;
        }

        private d(of.e eVar, g gVar) {
            this.f19878r = (byte) -1;
            this.f19879s = -1;
            L();
            d.b bVarO = of.d.o();
            f fVarI = f.I(bVarO, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                b.C0262b builder = (this.f19872c & 1) == 1 ? this.f19873d.toBuilder() : null;
                                b bVar = (b) eVar.t(b.f19848r, gVar);
                                this.f19873d = bVar;
                                if (builder != null) {
                                    builder.f(bVar);
                                    this.f19873d = builder.j();
                                }
                                this.f19872c |= 1;
                            } else if (iJ == 18) {
                                c.b builder2 = (this.f19872c & 2) == 2 ? this.f19874e.toBuilder() : null;
                                c cVar = (c) eVar.t(c.f19859r, gVar);
                                this.f19874e = cVar;
                                if (builder2 != null) {
                                    builder2.f(cVar);
                                    this.f19874e = builder2.j();
                                }
                                this.f19872c |= 2;
                            } else if (iJ == 26) {
                                c.b builder3 = (this.f19872c & 4) == 4 ? this.f19875f.toBuilder() : null;
                                c cVar2 = (c) eVar.t(c.f19859r, gVar);
                                this.f19875f = cVar2;
                                if (builder3 != null) {
                                    builder3.f(cVar2);
                                    this.f19875f = builder3.j();
                                }
                                this.f19872c |= 4;
                            } else if (iJ == 34) {
                                c.b builder4 = (this.f19872c & 8) == 8 ? this.f19876g.toBuilder() : null;
                                c cVar3 = (c) eVar.t(c.f19859r, gVar);
                                this.f19876g = cVar3;
                                if (builder4 != null) {
                                    builder4.f(cVar3);
                                    this.f19876g = builder4.j();
                                }
                                this.f19872c |= 8;
                            } else if (iJ != 42) {
                                if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                c.b builder5 = (this.f19872c & 16) == 16 ? this.f19877h.toBuilder() : null;
                                c cVar4 = (c) eVar.t(c.f19859r, gVar);
                                this.f19877h = cVar4;
                                if (builder5 != null) {
                                    builder5.f(cVar4);
                                    this.f19877h = builder5.j();
                                }
                                this.f19872c |= 16;
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19871b = bVarO.l();
                        throw th3;
                    }
                    this.f19871b = bVarO.l();
                    g();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f19871b = bVarO.l();
                throw th4;
            }
            this.f19871b = bVarO.l();
            g();
        }

        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f19880b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private b f19881c = b.q();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private c f19882d = c.q();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private c f19883e = c.q();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private c f19884f = c.q();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private c f19885g = c.q();

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
                int i10 = this.f19880b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f19873d = this.f19881c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f19874e = this.f19882d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f19875f = this.f19883e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f19876g = this.f19884f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f19877h = this.f19885g;
                dVar.f19872c = i11;
                return dVar;
            }

            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return m().f(j());
            }

            public b o(c cVar) {
                if ((this.f19880b & 16) != 16 || this.f19885g == c.q()) {
                    this.f19885g = cVar;
                } else {
                    this.f19885g = c.z(this.f19885g).f(cVar).j();
                }
                this.f19880b |= 16;
                return this;
            }

            public b p(b bVar) {
                if ((this.f19880b & 1) != 1 || this.f19881c == b.q()) {
                    this.f19881c = bVar;
                } else {
                    this.f19881c = b.z(this.f19881c).f(bVar).j();
                }
                this.f19880b |= 1;
                return this;
            }

            @Override // of.i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b f(d dVar) {
                if (dVar == d.t()) {
                    return this;
                }
                if (dVar.D()) {
                    p(dVar.w());
                }
                if (dVar.K()) {
                    w(dVar.A());
                }
                if (dVar.G()) {
                    u(dVar.x());
                }
                if (dVar.H()) {
                    v(dVar.z());
                }
                if (dVar.C()) {
                    o(dVar.v());
                }
                g(d().c(dVar.f19871b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // of.p.a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kf.a.d.b S(of.e r3, of.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    of.r r1 = kf.a.d.f19870u     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    kf.a$d r3 = (kf.a.d) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                    kf.a$d r4 = (kf.a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kf.a.d.b.S(of.e, of.g):kf.a$d$b");
            }

            public b u(c cVar) {
                if ((this.f19880b & 4) != 4 || this.f19883e == c.q()) {
                    this.f19883e = cVar;
                } else {
                    this.f19883e = c.z(this.f19883e).f(cVar).j();
                }
                this.f19880b |= 4;
                return this;
            }

            public b v(c cVar) {
                if ((this.f19880b & 8) != 8 || this.f19884f == c.q()) {
                    this.f19884f = cVar;
                } else {
                    this.f19884f = c.z(this.f19884f).f(cVar).j();
                }
                this.f19880b |= 8;
                return this;
            }

            public b w(c cVar) {
                if ((this.f19880b & 2) != 2 || this.f19882d == c.q()) {
                    this.f19882d = cVar;
                } else {
                    this.f19882d = c.z(this.f19882d).f(cVar).j();
                }
                this.f19880b |= 2;
                return this;
            }

            private void n() {
            }
        }
    }
}
