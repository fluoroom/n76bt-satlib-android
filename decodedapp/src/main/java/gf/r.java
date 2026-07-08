package gf;

import com.facebook.stetho.server.http.HttpStatus;
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
public final class r extends i.d implements of.q {
    private static final r D;
    public static of.r E = new a();
    private int A;
    private byte B;
    private int C;

    /* JADX INFO: renamed from: c */
    private final of.d f14231c;

    /* JADX INFO: renamed from: d */
    private int f14232d;

    /* JADX INFO: renamed from: e */
    private List f14233e;

    /* JADX INFO: renamed from: f */
    private boolean f14234f;

    /* JADX INFO: renamed from: g */
    private int f14235g;

    /* JADX INFO: renamed from: h */
    private r f14236h;

    /* JADX INFO: renamed from: r */
    private int f14237r;

    /* JADX INFO: renamed from: s */
    private int f14238s;

    /* JADX INFO: renamed from: t */
    private int f14239t;

    /* JADX INFO: renamed from: u */
    private int f14240u;

    /* JADX INFO: renamed from: v */
    private int f14241v;

    /* JADX INFO: renamed from: w */
    private r f14242w;

    /* JADX INFO: renamed from: x */
    private int f14243x;

    /* JADX INFO: renamed from: y */
    private r f14244y;

    /* JADX INFO: renamed from: z */
    private int f14245z;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public r b(of.e eVar, of.g gVar) {
            return new r(eVar, gVar);
        }
    }

    public static final class b extends of.i implements of.q {

        /* JADX INFO: renamed from: r */
        private static final b f14246r;

        /* JADX INFO: renamed from: s */
        public static of.r f14247s = new a();

        /* JADX INFO: renamed from: b */
        private final of.d f14248b;

        /* JADX INFO: renamed from: c */
        private int f14249c;

        /* JADX INFO: renamed from: d */
        private c f14250d;

        /* JADX INFO: renamed from: e */
        private r f14251e;

        /* JADX INFO: renamed from: f */
        private int f14252f;

        /* JADX INFO: renamed from: g */
        private byte f14253g;

        /* JADX INFO: renamed from: h */
        private int f14254h;

        static class a extends of.b {
            a() {
            }

            @Override // of.r
            /* JADX INFO: renamed from: j */
            public b b(of.e eVar, of.g gVar) {
                return new b(eVar, gVar);
            }
        }

        public enum c implements j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: f */
            private static j.b f14263f = new a();

            /* JADX INFO: renamed from: a */
            private final int f14265a;

            static class a implements j.b {
                a() {
                }

                @Override // of.j.b
                /* JADX INFO: renamed from: b */
                public c a(int i10) {
                    return c.a(i10);
                }
            }

            c(int i10, int i11) {
                this.f14265a = i11;
            }

            public static c a(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // of.j.a
            public final int getNumber() {
                return this.f14265a;
            }
        }

        static {
            b bVar = new b(true);
            f14246r = bVar;
            bVar.A();
        }

        /* synthetic */ b(of.e eVar, of.g gVar, gf.a aVar) {
            this(eVar, gVar);
        }

        private void A() {
            this.f14250d = c.INV;
            this.f14251e = r.e0();
            this.f14252f = 0;
        }

        public static C0203b C() {
            return C0203b.m();
        }

        public static C0203b D(b bVar) {
            return C().f(bVar);
        }

        public static b r() {
            return f14246r;
        }

        @Override // of.p
        /* JADX INFO: renamed from: G */
        public C0203b newBuilderForType() {
            return C();
        }

        @Override // of.p
        /* JADX INFO: renamed from: H */
        public C0203b toBuilder() {
            return D(this);
        }

        @Override // of.p
        public void a(of.f fVar) throws IOException {
            getSerializedSize();
            if ((this.f14249c & 1) == 1) {
                fVar.R(1, this.f14250d.getNumber());
            }
            if ((this.f14249c & 2) == 2) {
                fVar.c0(2, this.f14251e);
            }
            if ((this.f14249c & 4) == 4) {
                fVar.Z(3, this.f14252f);
            }
            fVar.h0(this.f14248b);
        }

        @Override // of.p
        public int getSerializedSize() {
            int i10 = this.f14254h;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f14249c & 1) == 1 ? of.f.h(1, this.f14250d.getNumber()) : 0;
            if ((this.f14249c & 2) == 2) {
                iH += of.f.r(2, this.f14251e);
            }
            if ((this.f14249c & 4) == 4) {
                iH += of.f.o(3, this.f14252f);
            }
            int size = iH + this.f14248b.size();
            this.f14254h = size;
            return size;
        }

        @Override // of.q
        public final boolean isInitialized() {
            byte b10 = this.f14253g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!x() || t().isInitialized()) {
                this.f14253g = (byte) 1;
                return true;
            }
            this.f14253g = (byte) 0;
            return false;
        }

        public c s() {
            return this.f14250d;
        }

        public r t() {
            return this.f14251e;
        }

        public int v() {
            return this.f14252f;
        }

        public boolean w() {
            return (this.f14249c & 1) == 1;
        }

        public boolean x() {
            return (this.f14249c & 2) == 2;
        }

        public boolean z() {
            return (this.f14249c & 4) == 4;
        }

        /* synthetic */ b(i.b bVar, gf.a aVar) {
            this(bVar);
        }

        private b(i.b bVar) {
            super(bVar);
            this.f14253g = (byte) -1;
            this.f14254h = -1;
            this.f14248b = bVar.d();
        }

        private b(boolean z10) {
            this.f14253g = (byte) -1;
            this.f14254h = -1;
            this.f14248b = of.d.f23423a;
        }

        private b(of.e eVar, of.g gVar) {
            this.f14253g = (byte) -1;
            this.f14254h = -1;
            A();
            d.b bVarO = of.d.o();
            of.f fVarI = of.f.I(bVarO, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    int iM = eVar.m();
                                    c cVarA = c.a(iM);
                                    if (cVarA == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f14249c |= 1;
                                        this.f14250d = cVarA;
                                    }
                                } else if (iJ == 18) {
                                    c builder = (this.f14249c & 2) == 2 ? this.f14251e.toBuilder() : null;
                                    r rVar = (r) eVar.t(r.E, gVar);
                                    this.f14251e = rVar;
                                    if (builder != null) {
                                        builder.f(rVar);
                                        this.f14251e = builder.o();
                                    }
                                    this.f14249c |= 2;
                                } else if (iJ != 24) {
                                    if (!j(eVar, fVarI, gVar, iJ)) {
                                    }
                                } else {
                                    this.f14249c |= 4;
                                    this.f14252f = eVar.r();
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
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f14248b = bVarO.l();
                        throw th3;
                    }
                    this.f14248b = bVarO.l();
                    g();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f14248b = bVarO.l();
                throw th4;
            }
            this.f14248b = bVarO.l();
            g();
        }

        /* JADX INFO: renamed from: gf.r$b$b */
        public static final class C0203b extends i.b implements of.q {

            /* JADX INFO: renamed from: b */
            private int f14255b;

            /* JADX INFO: renamed from: c */
            private c f14256c = c.INV;

            /* JADX INFO: renamed from: d */
            private r f14257d = r.e0();

            /* JADX INFO: renamed from: e */
            private int f14258e;

            private C0203b() {
                n();
            }

            public static C0203b m() {
                return new C0203b();
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
                int i10 = this.f14255b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f14250d = this.f14256c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f14251e = this.f14257d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f14252f = this.f14258e;
                bVar.f14249c = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: k */
            public C0203b clone() {
                return m().f(j());
            }

            @Override // of.i.b
            /* JADX INFO: renamed from: o */
            public C0203b f(b bVar) {
                if (bVar == b.r()) {
                    return this;
                }
                if (bVar.w()) {
                    t(bVar.s());
                }
                if (bVar.x()) {
                    r(bVar.t());
                }
                if (bVar.z()) {
                    u(bVar.v());
                }
                g(d().c(bVar.f14248b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // of.p.a
            /* JADX INFO: renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public gf.r.b.C0203b S(of.e r3, of.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    of.r r1 = gf.r.b.f14247s     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                    gf.r$b r3 = (gf.r.b) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                    gf.r$b r4 = (gf.r.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: gf.r.b.C0203b.S(of.e, of.g):gf.r$b$b");
            }

            public C0203b r(r rVar) {
                if ((this.f14255b & 2) != 2 || this.f14257d == r.e0()) {
                    this.f14257d = rVar;
                } else {
                    this.f14257d = r.F0(this.f14257d).f(rVar).o();
                }
                this.f14255b |= 2;
                return this;
            }

            public C0203b t(c cVar) {
                cVar.getClass();
                this.f14255b |= 1;
                this.f14256c = cVar;
                return this;
            }

            public C0203b u(int i10) {
                this.f14255b |= 4;
                this.f14258e = i10;
                return this;
            }

            private void n() {
            }
        }
    }

    static {
        r rVar = new r(true);
        D = rVar;
        rVar.D0();
    }

    /* synthetic */ r(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    private void D0() {
        this.f14233e = Collections.EMPTY_LIST;
        this.f14234f = false;
        this.f14235g = 0;
        this.f14236h = e0();
        this.f14237r = 0;
        this.f14238s = 0;
        this.f14239t = 0;
        this.f14240u = 0;
        this.f14241v = 0;
        this.f14242w = e0();
        this.f14243x = 0;
        this.f14244y = e0();
        this.f14245z = 0;
        this.A = 0;
    }

    public static c E0() {
        return c.r();
    }

    public static c F0(r rVar) {
        return E0().f(rVar);
    }

    public static r e0() {
        return D;
    }

    public boolean A0() {
        return (this.f14232d & 128) == 128;
    }

    public boolean B0() {
        return (this.f14232d & 32) == 32;
    }

    public boolean C0() {
        return (this.f14232d & 64) == 64;
    }

    @Override // of.p
    /* JADX INFO: renamed from: G0 */
    public c newBuilderForType() {
        return E0();
    }

    @Override // of.p
    /* JADX INFO: renamed from: H0 */
    public c toBuilder() {
        return F0(this);
    }

    public r Y() {
        return this.f14244y;
    }

    public int Z() {
        return this.f14245z;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14232d & 4096) == 4096) {
            fVar.Z(1, this.A);
        }
        for (int i10 = 0; i10 < this.f14233e.size(); i10++) {
            fVar.c0(2, (of.p) this.f14233e.get(i10));
        }
        if ((this.f14232d & 1) == 1) {
            fVar.K(3, this.f14234f);
        }
        if ((this.f14232d & 2) == 2) {
            fVar.Z(4, this.f14235g);
        }
        if ((this.f14232d & 4) == 4) {
            fVar.c0(5, this.f14236h);
        }
        if ((this.f14232d & 16) == 16) {
            fVar.Z(6, this.f14238s);
        }
        if ((this.f14232d & 32) == 32) {
            fVar.Z(7, this.f14239t);
        }
        if ((this.f14232d & 8) == 8) {
            fVar.Z(8, this.f14237r);
        }
        if ((this.f14232d & 64) == 64) {
            fVar.Z(9, this.f14240u);
        }
        if ((this.f14232d & 256) == 256) {
            fVar.c0(10, this.f14242w);
        }
        if ((this.f14232d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
            fVar.Z(11, this.f14243x);
        }
        if ((this.f14232d & 128) == 128) {
            fVar.Z(12, this.f14241v);
        }
        if ((this.f14232d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024) {
            fVar.c0(13, this.f14244y);
        }
        if ((this.f14232d & 2048) == 2048) {
            fVar.Z(14, this.f14245z);
        }
        aVarT.a(HttpStatus.HTTP_OK, fVar);
        fVar.h0(this.f14231c);
    }

    public b a0(int i10) {
        return (b) this.f14233e.get(i10);
    }

    public int b0() {
        return this.f14233e.size();
    }

    public List c0() {
        return this.f14233e;
    }

    public int d0() {
        return this.f14238s;
    }

    @Override // of.q
    /* JADX INFO: renamed from: f0 */
    public r getDefaultInstanceForType() {
        return D;
    }

    public int g0() {
        return this.A;
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.C;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14232d & 4096) == 4096 ? of.f.o(1, this.A) : 0;
        for (int i11 = 0; i11 < this.f14233e.size(); i11++) {
            iO += of.f.r(2, (of.p) this.f14233e.get(i11));
        }
        if ((this.f14232d & 1) == 1) {
            iO += of.f.a(3, this.f14234f);
        }
        if ((this.f14232d & 2) == 2) {
            iO += of.f.o(4, this.f14235g);
        }
        if ((this.f14232d & 4) == 4) {
            iO += of.f.r(5, this.f14236h);
        }
        if ((this.f14232d & 16) == 16) {
            iO += of.f.o(6, this.f14238s);
        }
        if ((this.f14232d & 32) == 32) {
            iO += of.f.o(7, this.f14239t);
        }
        if ((this.f14232d & 8) == 8) {
            iO += of.f.o(8, this.f14237r);
        }
        if ((this.f14232d & 64) == 64) {
            iO += of.f.o(9, this.f14240u);
        }
        if ((this.f14232d & 256) == 256) {
            iO += of.f.r(10, this.f14242w);
        }
        if ((this.f14232d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
            iO += of.f.o(11, this.f14243x);
        }
        if ((this.f14232d & 128) == 128) {
            iO += of.f.o(12, this.f14241v);
        }
        if ((this.f14232d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024) {
            iO += of.f.r(13, this.f14244y);
        }
        if ((this.f14232d & 2048) == 2048) {
            iO += of.f.o(14, this.f14245z);
        }
        int iO2 = iO + o() + this.f14231c.size();
        this.C = iO2;
        return iO2;
    }

    public int h0() {
        return this.f14235g;
    }

    public r i0() {
        return this.f14236h;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.B;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < b0(); i10++) {
            if (!a0(i10).isInitialized()) {
                this.B = (byte) 0;
                return false;
            }
        }
        if (v0() && !i0().isInitialized()) {
            this.B = (byte) 0;
            return false;
        }
        if (y0() && !l0().isInitialized()) {
            this.B = (byte) 0;
            return false;
        }
        if (q0() && !Y().isInitialized()) {
            this.B = (byte) 0;
            return false;
        }
        if (n()) {
            this.B = (byte) 1;
            return true;
        }
        this.B = (byte) 0;
        return false;
    }

    public int j0() {
        return this.f14237r;
    }

    public boolean k0() {
        return this.f14234f;
    }

    public r l0() {
        return this.f14242w;
    }

    public int m0() {
        return this.f14243x;
    }

    public int n0() {
        return this.f14241v;
    }

    public int o0() {
        return this.f14239t;
    }

    public int p0() {
        return this.f14240u;
    }

    public boolean q0() {
        return (this.f14232d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024;
    }

    public boolean r0() {
        return (this.f14232d & 2048) == 2048;
    }

    public boolean s0() {
        return (this.f14232d & 16) == 16;
    }

    public boolean t0() {
        return (this.f14232d & 4096) == 4096;
    }

    public boolean u0() {
        return (this.f14232d & 2) == 2;
    }

    public boolean v0() {
        return (this.f14232d & 4) == 4;
    }

    public boolean w0() {
        return (this.f14232d & 8) == 8;
    }

    public boolean x0() {
        return (this.f14232d & 1) == 1;
    }

    public boolean y0() {
        return (this.f14232d & 256) == 256;
    }

    public boolean z0() {
        return (this.f14232d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512;
    }

    /* synthetic */ r(i.c cVar, gf.a aVar) {
        this(cVar);
    }

    private r(i.c cVar) {
        super(cVar);
        this.B = (byte) -1;
        this.C = -1;
        this.f14231c = cVar.d();
    }

    private r(boolean z10) {
        this.B = (byte) -1;
        this.C = -1;
        this.f14231c = of.d.f23423a;
    }

    private r(of.e eVar, of.g gVar) {
        c builder;
        this.B = (byte) -1;
        this.C = -1;
        D0();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    switch (iJ) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f14232d |= 4096;
                            this.A = eVar.r();
                            break;
                        case 18:
                            if (!z11) {
                                this.f14233e = new ArrayList();
                                z11 = true;
                            }
                            this.f14233e.add(eVar.t(b.f14247s, gVar));
                            break;
                        case 24:
                            this.f14232d |= 1;
                            this.f14234f = eVar.j();
                            break;
                        case 32:
                            this.f14232d |= 2;
                            this.f14235g = eVar.r();
                            break;
                        case 42:
                            builder = (this.f14232d & 4) == 4 ? this.f14236h.toBuilder() : null;
                            r rVar = (r) eVar.t(E, gVar);
                            this.f14236h = rVar;
                            if (builder != null) {
                                builder.f(rVar);
                                this.f14236h = builder.o();
                            }
                            this.f14232d |= 4;
                            break;
                        case 48:
                            this.f14232d |= 16;
                            this.f14238s = eVar.r();
                            break;
                        case 56:
                            this.f14232d |= 32;
                            this.f14239t = eVar.r();
                            break;
                        case 64:
                            this.f14232d |= 8;
                            this.f14237r = eVar.r();
                            break;
                        case 72:
                            this.f14232d |= 64;
                            this.f14240u = eVar.r();
                            break;
                        case 82:
                            builder = (this.f14232d & 256) == 256 ? this.f14242w.toBuilder() : null;
                            r rVar2 = (r) eVar.t(E, gVar);
                            this.f14242w = rVar2;
                            if (builder != null) {
                                builder.f(rVar2);
                                this.f14242w = builder.o();
                            }
                            this.f14232d |= 256;
                            break;
                        case 88:
                            this.f14232d |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                            this.f14243x = eVar.r();
                            break;
                        case 96:
                            this.f14232d |= 128;
                            this.f14241v = eVar.r();
                            break;
                        case 106:
                            builder = (this.f14232d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024 ? this.f14244y.toBuilder() : null;
                            r rVar3 = (r) eVar.t(E, gVar);
                            this.f14244y = rVar3;
                            if (builder != null) {
                                builder.f(rVar3);
                                this.f14244y = builder.o();
                            }
                            this.f14232d |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                            break;
                        case 112:
                            this.f14232d |= 2048;
                            this.f14245z = eVar.r();
                            break;
                        default:
                            if (!j(eVar, fVarI, gVar, iJ)) {
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
                if (z11) {
                    this.f14233e = DesugarCollections.unmodifiableList(this.f14233e);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14231c = bVarO.l();
                    throw th3;
                }
                this.f14231c = bVarO.l();
                g();
                throw th2;
            }
        }
        if (z11) {
            this.f14233e = DesugarCollections.unmodifiableList(this.f14233e);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14231c = bVarO.l();
            throw th4;
        }
        this.f14231c = bVarO.l();
        g();
    }

    public static final class c extends i.c implements of.q {
        private int A;

        /* JADX INFO: renamed from: d */
        private int f14266d;

        /* JADX INFO: renamed from: f */
        private boolean f14268f;

        /* JADX INFO: renamed from: g */
        private int f14269g;

        /* JADX INFO: renamed from: r */
        private int f14271r;

        /* JADX INFO: renamed from: s */
        private int f14272s;

        /* JADX INFO: renamed from: t */
        private int f14273t;

        /* JADX INFO: renamed from: u */
        private int f14274u;

        /* JADX INFO: renamed from: v */
        private int f14275v;

        /* JADX INFO: renamed from: x */
        private int f14277x;

        /* JADX INFO: renamed from: z */
        private int f14279z;

        /* JADX INFO: renamed from: e */
        private List f14267e = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h */
        private r f14270h = r.e0();

        /* JADX INFO: renamed from: w */
        private r f14276w = r.e0();

        /* JADX INFO: renamed from: y */
        private r f14278y = r.e0();

        private c() {
            u();
        }

        public static c r() {
            return new c();
        }

        private void t() {
            if ((this.f14266d & 1) != 1) {
                this.f14267e = new ArrayList(this.f14267e);
                this.f14266d |= 1;
            }
        }

        public c A(int i10) {
            this.f14266d |= 4096;
            this.f14279z = i10;
            return this;
        }

        public c B(int i10) {
            this.f14266d |= 32;
            this.f14272s = i10;
            return this;
        }

        public c C(int i10) {
            this.f14266d |= 8192;
            this.A = i10;
            return this;
        }

        public c D(int i10) {
            this.f14266d |= 4;
            this.f14269g = i10;
            return this;
        }

        public c E(int i10) {
            this.f14266d |= 16;
            this.f14271r = i10;
            return this;
        }

        public c F(boolean z10) {
            this.f14266d |= 2;
            this.f14268f = z10;
            return this;
        }

        public c G(int i10) {
            this.f14266d |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
            this.f14277x = i10;
            return this;
        }

        public c H(int i10) {
            this.f14266d |= 256;
            this.f14275v = i10;
            return this;
        }

        public c I(int i10) {
            this.f14266d |= 64;
            this.f14273t = i10;
            return this;
        }

        public c J(int i10) {
            this.f14266d |= 128;
            this.f14274u = i10;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n */
        public r build() {
            r rVarO = o();
            if (rVarO.isInitialized()) {
                return rVarO;
            }
            throw a.AbstractC0317a.b(rVarO);
        }

        public r o() {
            r rVar = new r(this);
            int i10 = this.f14266d;
            if ((i10 & 1) == 1) {
                this.f14267e = DesugarCollections.unmodifiableList(this.f14267e);
                this.f14266d &= -2;
            }
            rVar.f14233e = this.f14267e;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            rVar.f14234f = this.f14268f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            rVar.f14235g = this.f14269g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            rVar.f14236h = this.f14270h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            rVar.f14237r = this.f14271r;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            rVar.f14238s = this.f14272s;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            rVar.f14239t = this.f14273t;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            rVar.f14240u = this.f14274u;
            if ((i10 & 256) == 256) {
                i11 |= 128;
            }
            rVar.f14241v = this.f14275v;
            if ((i10 & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                i11 |= 256;
            }
            rVar.f14242w = this.f14276w;
            if ((i10 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024) {
                i11 |= WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
            rVar.f14243x = this.f14277x;
            if ((i10 & 2048) == 2048) {
                i11 |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
            }
            rVar.f14244y = this.f14278y;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            rVar.f14245z = this.f14279z;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            rVar.A = this.A;
            rVar.f14232d = i11;
            return rVar;
        }

        /* JADX INFO: renamed from: p */
        public c clone() {
            return r().f(o());
        }

        public c v(r rVar) {
            if ((this.f14266d & 2048) != 2048 || this.f14278y == r.e0()) {
                this.f14278y = rVar;
            } else {
                this.f14278y = r.F0(this.f14278y).f(rVar).o();
            }
            this.f14266d |= 2048;
            return this;
        }

        public c w(r rVar) {
            if ((this.f14266d & 8) != 8 || this.f14270h == r.e0()) {
                this.f14270h = rVar;
            } else {
                this.f14270h = r.F0(this.f14270h).f(rVar).o();
            }
            this.f14266d |= 8;
            return this;
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: x */
        public c f(r rVar) {
            if (rVar == r.e0()) {
                return this;
            }
            if (!rVar.f14233e.isEmpty()) {
                if (this.f14267e.isEmpty()) {
                    this.f14267e = rVar.f14233e;
                    this.f14266d &= -2;
                } else {
                    t();
                    this.f14267e.addAll(rVar.f14233e);
                }
            }
            if (rVar.x0()) {
                F(rVar.k0());
            }
            if (rVar.u0()) {
                D(rVar.h0());
            }
            if (rVar.v0()) {
                w(rVar.i0());
            }
            if (rVar.w0()) {
                E(rVar.j0());
            }
            if (rVar.s0()) {
                B(rVar.d0());
            }
            if (rVar.B0()) {
                I(rVar.o0());
            }
            if (rVar.C0()) {
                J(rVar.p0());
            }
            if (rVar.A0()) {
                H(rVar.n0());
            }
            if (rVar.y0()) {
                z(rVar.l0());
            }
            if (rVar.z0()) {
                G(rVar.m0());
            }
            if (rVar.q0()) {
                v(rVar.Y());
            }
            if (rVar.r0()) {
                A(rVar.Z());
            }
            if (rVar.t0()) {
                C(rVar.g0());
            }
            k(rVar);
            g(d().c(rVar.f14231c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.r.c S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.r.E     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.r r3 = (gf.r) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.r r4 = (gf.r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.r.c.S(of.e, of.g):gf.r$c");
        }

        public c z(r rVar) {
            if ((this.f14266d & WXMediaMessage.TITLE_LENGTH_LIMIT) != 512 || this.f14276w == r.e0()) {
                this.f14276w = rVar;
            } else {
                this.f14276w = r.F0(this.f14276w).f(rVar).o();
            }
            this.f14266d |= WXMediaMessage.TITLE_LENGTH_LIMIT;
            return this;
        }

        private void u() {
        }
    }
}
