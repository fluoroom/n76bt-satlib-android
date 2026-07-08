package gf;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
public final class b extends of.i implements of.q {

    /* JADX INFO: renamed from: h */
    private static final b f13886h;

    /* JADX INFO: renamed from: r */
    public static of.r f13887r = new a();

    /* JADX INFO: renamed from: b */
    private final of.d f13888b;

    /* JADX INFO: renamed from: c */
    private int f13889c;

    /* JADX INFO: renamed from: d */
    private int f13890d;

    /* JADX INFO: renamed from: e */
    private List f13891e;

    /* JADX INFO: renamed from: f */
    private byte f13892f;

    /* JADX INFO: renamed from: g */
    private int f13893g;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public b b(of.e eVar, of.g gVar) {
            return new b(eVar, gVar);
        }
    }

    /* JADX INFO: renamed from: gf.b$b */
    public static final class C0197b extends of.i implements of.q {

        /* JADX INFO: renamed from: h */
        private static final C0197b f13894h;

        /* JADX INFO: renamed from: r */
        public static of.r f13895r = new a();

        /* JADX INFO: renamed from: b */
        private final of.d f13896b;

        /* JADX INFO: renamed from: c */
        private int f13897c;

        /* JADX INFO: renamed from: d */
        private int f13898d;

        /* JADX INFO: renamed from: e */
        private c f13899e;

        /* JADX INFO: renamed from: f */
        private byte f13900f;

        /* JADX INFO: renamed from: g */
        private int f13901g;

        /* JADX INFO: renamed from: gf.b$b$a */
        static class a extends of.b {
            a() {
            }

            @Override // of.r
            /* JADX INFO: renamed from: j */
            public C0197b b(of.e eVar, of.g gVar) {
                return new C0197b(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: gf.b$b$c */
        public static final class c extends of.i implements of.q {
            public static of.r A = new a();

            /* JADX INFO: renamed from: z */
            private static final c f13905z;

            /* JADX INFO: renamed from: b */
            private final of.d f13906b;

            /* JADX INFO: renamed from: c */
            private int f13907c;

            /* JADX INFO: renamed from: d */
            private EnumC0200c f13908d;

            /* JADX INFO: renamed from: e */
            private long f13909e;

            /* JADX INFO: renamed from: f */
            private float f13910f;

            /* JADX INFO: renamed from: g */
            private double f13911g;

            /* JADX INFO: renamed from: h */
            private int f13912h;

            /* JADX INFO: renamed from: r */
            private int f13913r;

            /* JADX INFO: renamed from: s */
            private int f13914s;

            /* JADX INFO: renamed from: t */
            private b f13915t;

            /* JADX INFO: renamed from: u */
            private List f13916u;

            /* JADX INFO: renamed from: v */
            private int f13917v;

            /* JADX INFO: renamed from: w */
            private int f13918w;

            /* JADX INFO: renamed from: x */
            private byte f13919x;

            /* JADX INFO: renamed from: y */
            private int f13920y;

            /* JADX INFO: renamed from: gf.b$b$c$a */
            static class a extends of.b {
                a() {
                }

                @Override // of.r
                /* JADX INFO: renamed from: j */
                public c b(of.e eVar, of.g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* JADX INFO: renamed from: gf.b$b$c$c */
            public enum EnumC0200c implements j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: x */
                private static j.b f13946x = new a();

                /* JADX INFO: renamed from: a */
                private final int f13948a;

                /* JADX INFO: renamed from: gf.b$b$c$c$a */
                static class a implements j.b {
                    a() {
                    }

                    @Override // of.j.b
                    /* JADX INFO: renamed from: b */
                    public EnumC0200c a(int i10) {
                        return EnumC0200c.a(i10);
                    }
                }

                EnumC0200c(int i10, int i11) {
                    this.f13948a = i11;
                }

                public static EnumC0200c a(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // of.j.a
                public final int getNumber() {
                    return this.f13948a;
                }
            }

            static {
                c cVar = new c(true);
                f13905z = cVar;
                cVar.k0();
            }

            /* synthetic */ c(of.e eVar, of.g gVar, gf.a aVar) {
                this(eVar, gVar);
            }

            public static c O() {
                return f13905z;
            }

            private void k0() {
                this.f13908d = EnumC0200c.BYTE;
                this.f13909e = 0L;
                this.f13910f = 0.0f;
                this.f13911g = 0.0d;
                this.f13912h = 0;
                this.f13913r = 0;
                this.f13914s = 0;
                this.f13915t = b.v();
                this.f13916u = Collections.EMPTY_LIST;
                this.f13917v = 0;
                this.f13918w = 0;
            }

            public static C0199b l0() {
                return C0199b.m();
            }

            public static C0199b m0(c cVar) {
                return l0().f(cVar);
            }

            public b D() {
                return this.f13915t;
            }

            public int G() {
                return this.f13917v;
            }

            public c H(int i10) {
                return (c) this.f13916u.get(i10);
            }

            public int K() {
                return this.f13916u.size();
            }

            public List L() {
                return this.f13916u;
            }

            public int N() {
                return this.f13913r;
            }

            public double Q() {
                return this.f13911g;
            }

            public int R() {
                return this.f13914s;
            }

            public int T() {
                return this.f13918w;
            }

            public float W() {
                return this.f13910f;
            }

            public long X() {
                return this.f13909e;
            }

            public int Y() {
                return this.f13912h;
            }

            public EnumC0200c Z() {
                return this.f13908d;
            }

            @Override // of.p
            public void a(of.f fVar) throws IOException {
                getSerializedSize();
                if ((this.f13907c & 1) == 1) {
                    fVar.R(1, this.f13908d.getNumber());
                }
                if ((this.f13907c & 2) == 2) {
                    fVar.s0(2, this.f13909e);
                }
                if ((this.f13907c & 4) == 4) {
                    fVar.V(3, this.f13910f);
                }
                if ((this.f13907c & 8) == 8) {
                    fVar.P(4, this.f13911g);
                }
                if ((this.f13907c & 16) == 16) {
                    fVar.Z(5, this.f13912h);
                }
                if ((this.f13907c & 32) == 32) {
                    fVar.Z(6, this.f13913r);
                }
                if ((this.f13907c & 64) == 64) {
                    fVar.Z(7, this.f13914s);
                }
                if ((this.f13907c & 128) == 128) {
                    fVar.c0(8, this.f13915t);
                }
                for (int i10 = 0; i10 < this.f13916u.size(); i10++) {
                    fVar.c0(9, (of.p) this.f13916u.get(i10));
                }
                if ((this.f13907c & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                    fVar.Z(10, this.f13918w);
                }
                if ((this.f13907c & 256) == 256) {
                    fVar.Z(11, this.f13917v);
                }
                fVar.h0(this.f13906b);
            }

            public boolean a0() {
                return (this.f13907c & 128) == 128;
            }

            public boolean b0() {
                return (this.f13907c & 256) == 256;
            }

            public boolean c0() {
                return (this.f13907c & 32) == 32;
            }

            public boolean d0() {
                return (this.f13907c & 8) == 8;
            }

            public boolean e0() {
                return (this.f13907c & 64) == 64;
            }

            public boolean f0() {
                return (this.f13907c & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512;
            }

            public boolean g0() {
                return (this.f13907c & 4) == 4;
            }

            @Override // of.p
            public int getSerializedSize() {
                int i10 = this.f13920y;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f13907c & 1) == 1 ? of.f.h(1, this.f13908d.getNumber()) : 0;
                if ((this.f13907c & 2) == 2) {
                    iH += of.f.z(2, this.f13909e);
                }
                if ((this.f13907c & 4) == 4) {
                    iH += of.f.l(3, this.f13910f);
                }
                if ((this.f13907c & 8) == 8) {
                    iH += of.f.f(4, this.f13911g);
                }
                if ((this.f13907c & 16) == 16) {
                    iH += of.f.o(5, this.f13912h);
                }
                if ((this.f13907c & 32) == 32) {
                    iH += of.f.o(6, this.f13913r);
                }
                if ((this.f13907c & 64) == 64) {
                    iH += of.f.o(7, this.f13914s);
                }
                if ((this.f13907c & 128) == 128) {
                    iH += of.f.r(8, this.f13915t);
                }
                for (int i11 = 0; i11 < this.f13916u.size(); i11++) {
                    iH += of.f.r(9, (of.p) this.f13916u.get(i11));
                }
                if ((this.f13907c & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                    iH += of.f.o(10, this.f13918w);
                }
                if ((this.f13907c & 256) == 256) {
                    iH += of.f.o(11, this.f13917v);
                }
                int size = iH + this.f13906b.size();
                this.f13920y = size;
                return size;
            }

            public boolean h0() {
                return (this.f13907c & 2) == 2;
            }

            public boolean i0() {
                return (this.f13907c & 16) == 16;
            }

            @Override // of.q
            public final boolean isInitialized() {
                byte b10 = this.f13919x;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (a0() && !D().isInitialized()) {
                    this.f13919x = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < K(); i10++) {
                    if (!H(i10).isInitialized()) {
                        this.f13919x = (byte) 0;
                        return false;
                    }
                }
                this.f13919x = (byte) 1;
                return true;
            }

            public boolean j0() {
                return (this.f13907c & 1) == 1;
            }

            @Override // of.p
            /* JADX INFO: renamed from: n0 */
            public C0199b newBuilderForType() {
                return l0();
            }

            @Override // of.p
            /* JADX INFO: renamed from: o0 */
            public C0199b toBuilder() {
                return m0(this);
            }

            /* synthetic */ c(i.b bVar, gf.a aVar) {
                this(bVar);
            }

            private c(i.b bVar) {
                super(bVar);
                this.f13919x = (byte) -1;
                this.f13920y = -1;
                this.f13906b = bVar.d();
            }

            private c(boolean z10) {
                this.f13919x = (byte) -1;
                this.f13920y = -1;
                this.f13906b = of.d.f23423a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(of.e eVar, of.g gVar) {
                this.f13919x = (byte) -1;
                this.f13920y = -1;
                k0();
                d.b bVarO = of.d.o();
                of.f fVarI = of.f.I(bVarO, 1);
                boolean z10 = false;
                char c10 = 0;
                while (true) {
                    ?? J = 256;
                    if (!z10) {
                        try {
                            try {
                                int iJ = eVar.J();
                                switch (iJ) {
                                    case 0:
                                        z10 = true;
                                        break;
                                    case 8:
                                        int iM = eVar.m();
                                        EnumC0200c enumC0200cA = EnumC0200c.a(iM);
                                        if (enumC0200cA == null) {
                                            fVarI.n0(iJ);
                                            fVarI.n0(iM);
                                        } else {
                                            this.f13907c |= 1;
                                            this.f13908d = enumC0200cA;
                                        }
                                        break;
                                    case 16:
                                        this.f13907c |= 2;
                                        this.f13909e = eVar.G();
                                        break;
                                    case 29:
                                        this.f13907c |= 4;
                                        this.f13910f = eVar.p();
                                        break;
                                    case 33:
                                        this.f13907c |= 8;
                                        this.f13911g = eVar.l();
                                        break;
                                    case 40:
                                        this.f13907c |= 16;
                                        this.f13912h = eVar.r();
                                        break;
                                    case 48:
                                        this.f13907c |= 32;
                                        this.f13913r = eVar.r();
                                        break;
                                    case 56:
                                        this.f13907c |= 64;
                                        this.f13914s = eVar.r();
                                        break;
                                    case 66:
                                        c builder = (this.f13907c & 128) == 128 ? this.f13915t.toBuilder() : null;
                                        b bVar = (b) eVar.t(b.f13887r, gVar);
                                        this.f13915t = bVar;
                                        if (builder != null) {
                                            builder.f(bVar);
                                            this.f13915t = builder.j();
                                        }
                                        this.f13907c |= 128;
                                        break;
                                    case 74:
                                        if ((c10 & 256) != 256) {
                                            this.f13916u = new ArrayList();
                                            c10 = 256;
                                        }
                                        this.f13916u.add(eVar.t(A, gVar));
                                        break;
                                    case 80:
                                        this.f13907c |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                                        this.f13918w = eVar.r();
                                        break;
                                    case 88:
                                        this.f13907c |= 256;
                                        this.f13917v = eVar.r();
                                        break;
                                    default:
                                        J = j(eVar, fVarI, gVar, iJ);
                                        if (J == 0) {
                                            z10 = true;
                                        }
                                        break;
                                }
                            } catch (of.k e10) {
                                throw e10.i(this);
                            } catch (IOException e11) {
                                throw new of.k(e11.getMessage()).i(this);
                            }
                        } catch (Throwable th2) {
                            if ((c10 & 256) == J) {
                                this.f13916u = DesugarCollections.unmodifiableList(this.f13916u);
                            }
                            try {
                                fVarI.H();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f13906b = bVarO.l();
                                throw th3;
                            }
                            this.f13906b = bVarO.l();
                            g();
                            throw th2;
                        }
                    } else {
                        if ((c10 & 256) == 256) {
                            this.f13916u = DesugarCollections.unmodifiableList(this.f13916u);
                        }
                        try {
                            fVarI.H();
                        } catch (IOException unused2) {
                        } catch (Throwable th4) {
                            this.f13906b = bVarO.l();
                            throw th4;
                        }
                        this.f13906b = bVarO.l();
                        g();
                        return;
                    }
                }
            }

            /* JADX INFO: renamed from: gf.b$b$c$b */
            public static final class C0199b extends i.b implements of.q {

                /* JADX INFO: renamed from: b */
                private int f13921b;

                /* JADX INFO: renamed from: d */
                private long f13923d;

                /* JADX INFO: renamed from: e */
                private float f13924e;

                /* JADX INFO: renamed from: f */
                private double f13925f;

                /* JADX INFO: renamed from: g */
                private int f13926g;

                /* JADX INFO: renamed from: h */
                private int f13927h;

                /* JADX INFO: renamed from: r */
                private int f13928r;

                /* JADX INFO: renamed from: u */
                private int f13931u;

                /* JADX INFO: renamed from: v */
                private int f13932v;

                /* JADX INFO: renamed from: c */
                private EnumC0200c f13922c = EnumC0200c.BYTE;

                /* JADX INFO: renamed from: s */
                private b f13929s = b.v();

                /* JADX INFO: renamed from: t */
                private List f13930t = Collections.EMPTY_LIST;

                private C0199b() {
                    o();
                }

                public static C0199b m() {
                    return new C0199b();
                }

                private void n() {
                    if ((this.f13921b & 256) != 256) {
                        this.f13930t = new ArrayList(this.f13930t);
                        this.f13921b |= 256;
                    }
                }

                public C0199b A(long j10) {
                    this.f13921b |= 2;
                    this.f13923d = j10;
                    return this;
                }

                public C0199b B(int i10) {
                    this.f13921b |= 16;
                    this.f13926g = i10;
                    return this;
                }

                public C0199b C(EnumC0200c enumC0200c) {
                    enumC0200c.getClass();
                    this.f13921b |= 1;
                    this.f13922c = enumC0200c;
                    return this;
                }

                @Override // of.p.a
                /* JADX INFO: renamed from: i */
                public c build() {
                    c cVarJ = j();
                    if (cVarJ.isInitialized()) {
                        return cVarJ;
                    }
                    throw a.AbstractC0317a.b(cVarJ);
                }

                public c j() {
                    c cVar = new c(this);
                    int i10 = this.f13921b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f13908d = this.f13922c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f13909e = this.f13923d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f13910f = this.f13924e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f13911g = this.f13925f;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.f13912h = this.f13926g;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.f13913r = this.f13927h;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.f13914s = this.f13928r;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    cVar.f13915t = this.f13929s;
                    if ((this.f13921b & 256) == 256) {
                        this.f13930t = DesugarCollections.unmodifiableList(this.f13930t);
                        this.f13921b &= -257;
                    }
                    cVar.f13916u = this.f13930t;
                    if ((i10 & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                        i11 |= 256;
                    }
                    cVar.f13917v = this.f13931u;
                    if ((i10 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024) {
                        i11 |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                    }
                    cVar.f13918w = this.f13932v;
                    cVar.f13907c = i11;
                    return cVar;
                }

                /* JADX INFO: renamed from: k */
                public C0199b clone() {
                    return m().f(j());
                }

                public C0199b p(b bVar) {
                    if ((this.f13921b & 128) != 128 || this.f13929s == b.v()) {
                        this.f13929s = bVar;
                    } else {
                        this.f13929s = b.C(this.f13929s).f(bVar).j();
                    }
                    this.f13921b |= 128;
                    return this;
                }

                @Override // of.i.b
                /* JADX INFO: renamed from: r */
                public C0199b f(c cVar) {
                    if (cVar == c.O()) {
                        return this;
                    }
                    if (cVar.j0()) {
                        C(cVar.Z());
                    }
                    if (cVar.h0()) {
                        A(cVar.X());
                    }
                    if (cVar.g0()) {
                        z(cVar.W());
                    }
                    if (cVar.d0()) {
                        w(cVar.Q());
                    }
                    if (cVar.i0()) {
                        B(cVar.Y());
                    }
                    if (cVar.c0()) {
                        v(cVar.N());
                    }
                    if (cVar.e0()) {
                        x(cVar.R());
                    }
                    if (cVar.a0()) {
                        p(cVar.D());
                    }
                    if (!cVar.f13916u.isEmpty()) {
                        if (this.f13930t.isEmpty()) {
                            this.f13930t = cVar.f13916u;
                            this.f13921b &= -257;
                        } else {
                            n();
                            this.f13930t.addAll(cVar.f13916u);
                        }
                    }
                    if (cVar.b0()) {
                        u(cVar.G());
                    }
                    if (cVar.f0()) {
                        y(cVar.T());
                    }
                    g(d().c(cVar.f13906b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
                @Override // of.p.a
                /* JADX INFO: renamed from: t */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public gf.b.C0197b.c.C0199b S(of.e r3, of.g r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        of.r r1 = gf.b.C0197b.c.A     // Catch: java.lang.Throwable -> Lf of.k -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                        gf.b$b$c r3 = (gf.b.C0197b.c) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                        gf.b$b$c r4 = (gf.b.C0197b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: gf.b.C0197b.c.C0199b.S(of.e, of.g):gf.b$b$c$b");
                }

                public C0199b u(int i10) {
                    this.f13921b |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                    this.f13931u = i10;
                    return this;
                }

                public C0199b v(int i10) {
                    this.f13921b |= 32;
                    this.f13927h = i10;
                    return this;
                }

                public C0199b w(double d10) {
                    this.f13921b |= 8;
                    this.f13925f = d10;
                    return this;
                }

                public C0199b x(int i10) {
                    this.f13921b |= 64;
                    this.f13928r = i10;
                    return this;
                }

                public C0199b y(int i10) {
                    this.f13921b |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                    this.f13932v = i10;
                    return this;
                }

                public C0199b z(float f10) {
                    this.f13921b |= 4;
                    this.f13924e = f10;
                    return this;
                }

                private void o() {
                }
            }
        }

        static {
            C0197b c0197b = new C0197b(true);
            f13894h = c0197b;
            c0197b.w();
        }

        /* synthetic */ C0197b(of.e eVar, of.g gVar, gf.a aVar) {
            this(eVar, gVar);
        }

        public static C0197b q() {
            return f13894h;
        }

        private void w() {
            this.f13898d = 0;
            this.f13899e = c.O();
        }

        public static C0198b x() {
            return C0198b.m();
        }

        public static C0198b z(C0197b c0197b) {
            return x().f(c0197b);
        }

        @Override // of.p
        /* JADX INFO: renamed from: A */
        public C0198b newBuilderForType() {
            return x();
        }

        @Override // of.p
        /* JADX INFO: renamed from: C */
        public C0198b toBuilder() {
            return z(this);
        }

        @Override // of.p
        public void a(of.f fVar) throws IOException {
            getSerializedSize();
            if ((this.f13897c & 1) == 1) {
                fVar.Z(1, this.f13898d);
            }
            if ((this.f13897c & 2) == 2) {
                fVar.c0(2, this.f13899e);
            }
            fVar.h0(this.f13896b);
        }

        @Override // of.p
        public int getSerializedSize() {
            int i10 = this.f13901g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f13897c & 1) == 1 ? of.f.o(1, this.f13898d) : 0;
            if ((this.f13897c & 2) == 2) {
                iO += of.f.r(2, this.f13899e);
            }
            int size = iO + this.f13896b.size();
            this.f13901g = size;
            return size;
        }

        @Override // of.q
        public final boolean isInitialized() {
            byte b10 = this.f13900f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!t()) {
                this.f13900f = (byte) 0;
                return false;
            }
            if (!v()) {
                this.f13900f = (byte) 0;
                return false;
            }
            if (s().isInitialized()) {
                this.f13900f = (byte) 1;
                return true;
            }
            this.f13900f = (byte) 0;
            return false;
        }

        public int r() {
            return this.f13898d;
        }

        public c s() {
            return this.f13899e;
        }

        public boolean t() {
            return (this.f13897c & 1) == 1;
        }

        public boolean v() {
            return (this.f13897c & 2) == 2;
        }

        /* synthetic */ C0197b(i.b bVar, gf.a aVar) {
            this(bVar);
        }

        private C0197b(i.b bVar) {
            super(bVar);
            this.f13900f = (byte) -1;
            this.f13901g = -1;
            this.f13896b = bVar.d();
        }

        private C0197b(boolean z10) {
            this.f13900f = (byte) -1;
            this.f13901g = -1;
            this.f13896b = of.d.f23423a;
        }

        private C0197b(of.e eVar, of.g gVar) {
            this.f13900f = (byte) -1;
            this.f13901g = -1;
            w();
            d.b bVarO = of.d.o();
            of.f fVarI = of.f.I(bVarO, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f13897c |= 1;
                                this.f13898d = eVar.r();
                            } else if (iJ != 18) {
                                if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                c.C0199b builder = (this.f13897c & 2) == 2 ? this.f13899e.toBuilder() : null;
                                c cVar = (c) eVar.t(c.A, gVar);
                                this.f13899e = cVar;
                                if (builder != null) {
                                    builder.f(cVar);
                                    this.f13899e = builder.j();
                                }
                                this.f13897c |= 2;
                            }
                        }
                        z10 = true;
                    } catch (of.k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new of.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f13896b = bVarO.l();
                        throw th3;
                    }
                    this.f13896b = bVarO.l();
                    g();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f13896b = bVarO.l();
                throw th4;
            }
            this.f13896b = bVarO.l();
            g();
        }

        /* JADX INFO: renamed from: gf.b$b$b */
        public static final class C0198b extends i.b implements of.q {

            /* JADX INFO: renamed from: b */
            private int f13902b;

            /* JADX INFO: renamed from: c */
            private int f13903c;

            /* JADX INFO: renamed from: d */
            private c f13904d = c.O();

            private C0198b() {
                n();
            }

            public static C0198b m() {
                return new C0198b();
            }

            @Override // of.p.a
            /* JADX INFO: renamed from: i */
            public C0197b build() {
                C0197b c0197bJ = j();
                if (c0197bJ.isInitialized()) {
                    return c0197bJ;
                }
                throw a.AbstractC0317a.b(c0197bJ);
            }

            public C0197b j() {
                C0197b c0197b = new C0197b(this);
                int i10 = this.f13902b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                c0197b.f13898d = this.f13903c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c0197b.f13899e = this.f13904d;
                c0197b.f13897c = i11;
                return c0197b;
            }

            /* JADX INFO: renamed from: k */
            public C0198b clone() {
                return m().f(j());
            }

            @Override // of.i.b
            /* JADX INFO: renamed from: o */
            public C0198b f(C0197b c0197b) {
                if (c0197b == C0197b.q()) {
                    return this;
                }
                if (c0197b.t()) {
                    t(c0197b.r());
                }
                if (c0197b.v()) {
                    r(c0197b.s());
                }
                g(d().c(c0197b.f13896b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // of.p.a
            /* JADX INFO: renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public gf.b.C0197b.C0198b S(of.e r3, of.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    of.r r1 = gf.b.C0197b.f13895r     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    gf.b$b r3 = (gf.b.C0197b) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                    gf.b$b r4 = (gf.b.C0197b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: gf.b.C0197b.C0198b.S(of.e, of.g):gf.b$b$b");
            }

            public C0198b r(c cVar) {
                if ((this.f13902b & 2) != 2 || this.f13904d == c.O()) {
                    this.f13904d = cVar;
                } else {
                    this.f13904d = c.m0(this.f13904d).f(cVar).j();
                }
                this.f13902b |= 2;
                return this;
            }

            public C0198b t(int i10) {
                this.f13902b |= 1;
                this.f13903c = i10;
                return this;
            }

            private void n() {
            }
        }
    }

    static {
        b bVar = new b(true);
        f13886h = bVar;
        bVar.z();
    }

    /* synthetic */ b(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static c A() {
        return c.m();
    }

    public static c C(b bVar) {
        return A().f(bVar);
    }

    public static b v() {
        return f13886h;
    }

    private void z() {
        this.f13890d = 0;
        this.f13891e = Collections.EMPTY_LIST;
    }

    @Override // of.p
    /* JADX INFO: renamed from: D */
    public c newBuilderForType() {
        return A();
    }

    @Override // of.p
    /* JADX INFO: renamed from: G */
    public c toBuilder() {
        return C(this);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        if ((this.f13889c & 1) == 1) {
            fVar.Z(1, this.f13890d);
        }
        for (int i10 = 0; i10 < this.f13891e.size(); i10++) {
            fVar.c0(2, (of.p) this.f13891e.get(i10));
        }
        fVar.h0(this.f13888b);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f13893g;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f13889c & 1) == 1 ? of.f.o(1, this.f13890d) : 0;
        for (int i11 = 0; i11 < this.f13891e.size(); i11++) {
            iO += of.f.r(2, (of.p) this.f13891e.get(i11));
        }
        int size = iO + this.f13888b.size();
        this.f13893g = size;
        return size;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f13892f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!x()) {
            this.f13892f = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < s(); i10++) {
            if (!r(i10).isInitialized()) {
                this.f13892f = (byte) 0;
                return false;
            }
        }
        this.f13892f = (byte) 1;
        return true;
    }

    public C0197b r(int i10) {
        return (C0197b) this.f13891e.get(i10);
    }

    public int s() {
        return this.f13891e.size();
    }

    public List t() {
        return this.f13891e;
    }

    public int w() {
        return this.f13890d;
    }

    public boolean x() {
        return (this.f13889c & 1) == 1;
    }

    /* synthetic */ b(i.b bVar, gf.a aVar) {
        this(bVar);
    }

    private b(i.b bVar) {
        super(bVar);
        this.f13892f = (byte) -1;
        this.f13893g = -1;
        this.f13888b = bVar.d();
    }

    private b(boolean z10) {
        this.f13892f = (byte) -1;
        this.f13893g = -1;
        this.f13888b = of.d.f23423a;
    }

    private b(of.e eVar, of.g gVar) {
        this.f13892f = (byte) -1;
        this.f13893g = -1;
        z();
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
                            this.f13889c |= 1;
                            this.f13890d = eVar.r();
                        } else if (iJ != 18) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if ((c10 & 2) != 2) {
                                this.f13891e = new ArrayList();
                                c10 = 2;
                            }
                            this.f13891e.add(eVar.t(C0197b.f13895r, gVar));
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
                    this.f13891e = DesugarCollections.unmodifiableList(this.f13891e);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f13888b = bVarO.l();
                    throw th3;
                }
                this.f13888b = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((c10 & 2) == 2) {
            this.f13891e = DesugarCollections.unmodifiableList(this.f13891e);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f13888b = bVarO.l();
            throw th4;
        }
        this.f13888b = bVarO.l();
        g();
    }

    public static final class c extends i.b implements of.q {

        /* JADX INFO: renamed from: b */
        private int f13949b;

        /* JADX INFO: renamed from: c */
        private int f13950c;

        /* JADX INFO: renamed from: d */
        private List f13951d = Collections.EMPTY_LIST;

        private c() {
            o();
        }

        public static c m() {
            return new c();
        }

        private void n() {
            if ((this.f13949b & 2) != 2) {
                this.f13951d = new ArrayList(this.f13951d);
                this.f13949b |= 2;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: i */
        public b build() {
            b bVarJ = j();
            if (bVarJ.isInitialized()) {
                return bVarJ;
            }
            throw a.AbstractC0317a.b(bVarJ);
        }

        public b j() {
            b bVar = new b(this);
            int i10 = (this.f13949b & 1) != 1 ? 0 : 1;
            bVar.f13890d = this.f13950c;
            if ((this.f13949b & 2) == 2) {
                this.f13951d = DesugarCollections.unmodifiableList(this.f13951d);
                this.f13949b &= -3;
            }
            bVar.f13891e = this.f13951d;
            bVar.f13889c = i10;
            return bVar;
        }

        /* JADX INFO: renamed from: k */
        public c clone() {
            return m().f(j());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: p */
        public c f(b bVar) {
            if (bVar == b.v()) {
                return this;
            }
            if (bVar.x()) {
                t(bVar.w());
            }
            if (!bVar.f13891e.isEmpty()) {
                if (this.f13951d.isEmpty()) {
                    this.f13951d = bVar.f13891e;
                    this.f13949b &= -3;
                } else {
                    n();
                    this.f13951d.addAll(bVar.f13891e);
                }
            }
            g(d().c(bVar.f13888b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.b.c S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.b.f13887r     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.b r3 = (gf.b) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.b r4 = (gf.b) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.b.c.S(of.e, of.g):gf.b$c");
        }

        public c t(int i10) {
            this.f13949b |= 1;
            this.f13950c = i10;
            return this;
        }

        private void o() {
        }
    }
}
