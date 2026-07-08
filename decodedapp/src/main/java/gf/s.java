package gf;

import com.facebook.stetho.server.http.HttpStatus;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import gf.r;
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
public final class s extends i.d implements of.q {
    public static of.r A = new a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final s f14280z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final of.d f14281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f14285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f14286h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private r f14288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f14290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f14291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f14292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private byte f14293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f14294y;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public s b(of.e eVar, of.g gVar) {
            return new s(eVar, gVar);
        }
    }

    static {
        s sVar = new s(true);
        f14280z = sVar;
        sVar.u0();
    }

    public static s c0() {
        return f14280z;
    }

    private void u0() {
        this.f14283e = 6;
        this.f14284f = 0;
        List list = Collections.EMPTY_LIST;
        this.f14285g = list;
        this.f14286h = r.e0();
        this.f14287r = 0;
        this.f14288s = r.e0();
        this.f14289t = 0;
        this.f14290u = list;
        this.f14291v = list;
        this.f14292w = list;
    }

    public static b v0() {
        return b.r();
    }

    public static b w0(s sVar) {
        return v0().f(sVar);
    }

    public static s y0(InputStream inputStream, of.g gVar) {
        return (s) A.a(inputStream, gVar);
    }

    public gf.b X(int i10) {
        return (gf.b) this.f14290u.get(i10);
    }

    public int Y() {
        return this.f14290u.size();
    }

    public List Z() {
        return this.f14290u;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14282d & 1) == 1) {
            fVar.Z(1, this.f14283e);
        }
        if ((this.f14282d & 2) == 2) {
            fVar.Z(2, this.f14284f);
        }
        for (int i10 = 0; i10 < this.f14285g.size(); i10++) {
            fVar.c0(3, (of.p) this.f14285g.get(i10));
        }
        if ((this.f14282d & 4) == 4) {
            fVar.c0(4, this.f14286h);
        }
        if ((this.f14282d & 8) == 8) {
            fVar.Z(5, this.f14287r);
        }
        if ((this.f14282d & 16) == 16) {
            fVar.c0(6, this.f14288s);
        }
        if ((this.f14282d & 32) == 32) {
            fVar.Z(7, this.f14289t);
        }
        for (int i11 = 0; i11 < this.f14290u.size(); i11++) {
            fVar.c0(8, (of.p) this.f14290u.get(i11));
        }
        for (int i12 = 0; i12 < this.f14291v.size(); i12++) {
            fVar.Z(31, ((Integer) this.f14291v.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f14292w.size(); i13++) {
            fVar.c0(32, (of.p) this.f14292w.get(i13));
        }
        aVarT.a(HttpStatus.HTTP_OK, fVar);
        fVar.h0(this.f14281c);
    }

    public d a0(int i10) {
        return (d) this.f14292w.get(i10);
    }

    public int b0() {
        return this.f14292w.size();
    }

    @Override // of.q
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public s getDefaultInstanceForType() {
        return f14280z;
    }

    public r e0() {
        return this.f14288s;
    }

    public int f0() {
        return this.f14289t;
    }

    public int g0() {
        return this.f14283e;
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14294y;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14282d & 1) == 1 ? of.f.o(1, this.f14283e) : 0;
        if ((this.f14282d & 2) == 2) {
            iO += of.f.o(2, this.f14284f);
        }
        for (int i11 = 0; i11 < this.f14285g.size(); i11++) {
            iO += of.f.r(3, (of.p) this.f14285g.get(i11));
        }
        if ((this.f14282d & 4) == 4) {
            iO += of.f.r(4, this.f14286h);
        }
        if ((this.f14282d & 8) == 8) {
            iO += of.f.o(5, this.f14287r);
        }
        if ((this.f14282d & 16) == 16) {
            iO += of.f.r(6, this.f14288s);
        }
        if ((this.f14282d & 32) == 32) {
            iO += of.f.o(7, this.f14289t);
        }
        for (int i12 = 0; i12 < this.f14290u.size(); i12++) {
            iO += of.f.r(8, (of.p) this.f14290u.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f14291v.size(); i13++) {
            iP += of.f.p(((Integer) this.f14291v.get(i13)).intValue());
        }
        int size = iO + iP + (n0().size() * 2);
        for (int i14 = 0; i14 < this.f14292w.size(); i14++) {
            size += of.f.r(32, (of.p) this.f14292w.get(i14));
        }
        int iO2 = size + o() + this.f14281c.size();
        this.f14294y = iO2;
        return iO2;
    }

    public int h0() {
        return this.f14284f;
    }

    public t i0(int i10) {
        return (t) this.f14285g.get(i10);
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14293x;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!r0()) {
            this.f14293x = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < j0(); i10++) {
            if (!i0(i10).isInitialized()) {
                this.f14293x = (byte) 0;
                return false;
            }
        }
        if (s0() && !l0().isInitialized()) {
            this.f14293x = (byte) 0;
            return false;
        }
        if (o0() && !e0().isInitialized()) {
            this.f14293x = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < Y(); i11++) {
            if (!X(i11).isInitialized()) {
                this.f14293x = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < b0(); i12++) {
            if (!a0(i12).isInitialized()) {
                this.f14293x = (byte) 0;
                return false;
            }
        }
        if (n()) {
            this.f14293x = (byte) 1;
            return true;
        }
        this.f14293x = (byte) 0;
        return false;
    }

    public int j0() {
        return this.f14285g.size();
    }

    public List k0() {
        return this.f14285g;
    }

    public r l0() {
        return this.f14286h;
    }

    public int m0() {
        return this.f14287r;
    }

    public List n0() {
        return this.f14291v;
    }

    public boolean o0() {
        return (this.f14282d & 16) == 16;
    }

    public boolean p0() {
        return (this.f14282d & 32) == 32;
    }

    public boolean q0() {
        return (this.f14282d & 1) == 1;
    }

    public boolean r0() {
        return (this.f14282d & 2) == 2;
    }

    public boolean s0() {
        return (this.f14282d & 4) == 4;
    }

    public boolean t0() {
        return (this.f14282d & 8) == 8;
    }

    @Override // of.p
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return v0();
    }

    @Override // of.p
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return w0(this);
    }

    private s(i.c cVar) {
        super(cVar);
        this.f14293x = (byte) -1;
        this.f14294y = -1;
        this.f14281c = cVar.d();
    }

    private s(boolean z10) {
        this.f14293x = (byte) -1;
        this.f14294y = -1;
        this.f14281c = of.d.f23423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private s(of.e eVar, of.g gVar) {
        r.c builder;
        this.f14293x = (byte) -1;
        this.f14294y = -1;
        u0();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? J = 128;
            if (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f14282d |= 1;
                                this.f14283e = eVar.r();
                                break;
                            case 16:
                                this.f14282d |= 2;
                                this.f14284f = eVar.r();
                                break;
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f14285g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f14285g.add(eVar.t(t.f14307x, gVar));
                                break;
                            case 34:
                                builder = (this.f14282d & 4) == 4 ? this.f14286h.toBuilder() : null;
                                r rVar = (r) eVar.t(r.E, gVar);
                                this.f14286h = rVar;
                                if (builder != null) {
                                    builder.f(rVar);
                                    this.f14286h = builder.o();
                                }
                                this.f14282d |= 4;
                                break;
                            case 40:
                                this.f14282d |= 8;
                                this.f14287r = eVar.r();
                                break;
                            case 50:
                                builder = (this.f14282d & 16) == 16 ? this.f14288s.toBuilder() : null;
                                r rVar2 = (r) eVar.t(r.E, gVar);
                                this.f14288s = rVar2;
                                if (builder != null) {
                                    builder.f(rVar2);
                                    this.f14288s = builder.o();
                                }
                                this.f14282d |= 16;
                                break;
                            case 56:
                                this.f14282d |= 32;
                                this.f14289t = eVar.r();
                                break;
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f14290u = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f14290u.add(eVar.t(gf.b.f13887r, gVar));
                                break;
                            case 248:
                                if ((i10 & 256) != 256) {
                                    this.f14291v = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f14291v.add(Integer.valueOf(eVar.r()));
                                break;
                            case 250:
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 256) != 256 && eVar.e() > 0) {
                                    this.f14291v = new ArrayList();
                                    i10 |= 256;
                                }
                                while (eVar.e() > 0) {
                                    this.f14291v.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                                break;
                            case 258:
                                if ((i10 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 512) {
                                    this.f14292w = new ArrayList();
                                    i10 |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                                }
                                this.f14292w.add(eVar.t(d.f13992r, gVar));
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
                    if ((i10 & 4) == 4) {
                        this.f14285g = DesugarCollections.unmodifiableList(this.f14285g);
                    }
                    if ((i10 & 128) == J) {
                        this.f14290u = DesugarCollections.unmodifiableList(this.f14290u);
                    }
                    if ((i10 & 256) == 256) {
                        this.f14291v = DesugarCollections.unmodifiableList(this.f14291v);
                    }
                    if ((i10 & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                        this.f14292w = DesugarCollections.unmodifiableList(this.f14292w);
                    }
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f14281c = bVarO.l();
                        throw th3;
                    }
                    this.f14281c = bVarO.l();
                    g();
                    throw th2;
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f14285g = DesugarCollections.unmodifiableList(this.f14285g);
                }
                if ((i10 & 128) == 128) {
                    this.f14290u = DesugarCollections.unmodifiableList(this.f14290u);
                }
                if ((i10 & 256) == 256) {
                    this.f14291v = DesugarCollections.unmodifiableList(this.f14291v);
                }
                if ((i10 & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                    this.f14292w = DesugarCollections.unmodifiableList(this.f14292w);
                }
                try {
                    fVarI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f14281c = bVarO.l();
                    throw th4;
                }
                this.f14281c = bVarO.l();
                g();
                return;
            }
        }
    }

    public static final class b extends i.c implements of.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14296e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f14297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f14298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r f14299h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f14300r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private r f14301s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14302t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private List f14303u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private List f14304v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private List f14305w;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f14298g = list;
            this.f14299h = r.e0();
            this.f14301s = r.e0();
            this.f14303u = list;
            this.f14304v = list;
            this.f14305w = list;
            x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14295d & 128) != 128) {
                this.f14303u = new ArrayList(this.f14303u);
                this.f14295d |= 128;
            }
        }

        private void u() {
            if ((this.f14295d & WXMediaMessage.TITLE_LENGTH_LIMIT) != 512) {
                this.f14305w = new ArrayList(this.f14305w);
                this.f14295d |= WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
        }

        private void v() {
            if ((this.f14295d & 4) != 4) {
                this.f14298g = new ArrayList(this.f14298g);
                this.f14295d |= 4;
            }
        }

        private void w() {
            if ((this.f14295d & 256) != 256) {
                this.f14304v = new ArrayList(this.f14304v);
                this.f14295d |= 256;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.s.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.s.A     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.s r3 = (gf.s) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.s r4 = (gf.s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.s.b.S(of.e, of.g):gf.s$b");
        }

        public b B(r rVar) {
            if ((this.f14295d & 8) != 8 || this.f14299h == r.e0()) {
                this.f14299h = rVar;
            } else {
                this.f14299h = r.F0(this.f14299h).f(rVar).o();
            }
            this.f14295d |= 8;
            return this;
        }

        public b C(int i10) {
            this.f14295d |= 64;
            this.f14302t = i10;
            return this;
        }

        public b D(int i10) {
            this.f14295d |= 1;
            this.f14296e = i10;
            return this;
        }

        public b E(int i10) {
            this.f14295d |= 2;
            this.f14297f = i10;
            return this;
        }

        public b F(int i10) {
            this.f14295d |= 16;
            this.f14300r = i10;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public s build() {
            s sVarO = o();
            if (sVarO.isInitialized()) {
                return sVarO;
            }
            throw a.AbstractC0317a.b(sVarO);
        }

        public s o() {
            s sVar = new s(this);
            int i10 = this.f14295d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            sVar.f14283e = this.f14296e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            sVar.f14284f = this.f14297f;
            if ((this.f14295d & 4) == 4) {
                this.f14298g = DesugarCollections.unmodifiableList(this.f14298g);
                this.f14295d &= -5;
            }
            sVar.f14285g = this.f14298g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            sVar.f14286h = this.f14299h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            sVar.f14287r = this.f14300r;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            sVar.f14288s = this.f14301s;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            sVar.f14289t = this.f14302t;
            if ((this.f14295d & 128) == 128) {
                this.f14303u = DesugarCollections.unmodifiableList(this.f14303u);
                this.f14295d &= -129;
            }
            sVar.f14290u = this.f14303u;
            if ((this.f14295d & 256) == 256) {
                this.f14304v = DesugarCollections.unmodifiableList(this.f14304v);
                this.f14295d &= -257;
            }
            sVar.f14291v = this.f14304v;
            if ((this.f14295d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                this.f14305w = DesugarCollections.unmodifiableList(this.f14305w);
                this.f14295d &= -513;
            }
            sVar.f14292w = this.f14305w;
            sVar.f14282d = i11;
            return sVar;
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(o());
        }

        public b y(r rVar) {
            if ((this.f14295d & 32) != 32 || this.f14301s == r.e0()) {
                this.f14301s = rVar;
            } else {
                this.f14301s = r.F0(this.f14301s).f(rVar).o();
            }
            this.f14295d |= 32;
            return this;
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b f(s sVar) {
            if (sVar == s.c0()) {
                return this;
            }
            if (sVar.q0()) {
                D(sVar.g0());
            }
            if (sVar.r0()) {
                E(sVar.h0());
            }
            if (!sVar.f14285g.isEmpty()) {
                if (this.f14298g.isEmpty()) {
                    this.f14298g = sVar.f14285g;
                    this.f14295d &= -5;
                } else {
                    v();
                    this.f14298g.addAll(sVar.f14285g);
                }
            }
            if (sVar.s0()) {
                B(sVar.l0());
            }
            if (sVar.t0()) {
                F(sVar.m0());
            }
            if (sVar.o0()) {
                y(sVar.e0());
            }
            if (sVar.p0()) {
                C(sVar.f0());
            }
            if (!sVar.f14290u.isEmpty()) {
                if (this.f14303u.isEmpty()) {
                    this.f14303u = sVar.f14290u;
                    this.f14295d &= -129;
                } else {
                    t();
                    this.f14303u.addAll(sVar.f14290u);
                }
            }
            if (!sVar.f14291v.isEmpty()) {
                if (this.f14304v.isEmpty()) {
                    this.f14304v = sVar.f14291v;
                    this.f14295d &= -257;
                } else {
                    w();
                    this.f14304v.addAll(sVar.f14291v);
                }
            }
            if (!sVar.f14292w.isEmpty()) {
                if (this.f14305w.isEmpty()) {
                    this.f14305w = sVar.f14292w;
                    this.f14295d &= -513;
                } else {
                    u();
                    this.f14305w.addAll(sVar.f14292w);
                }
            }
            k(sVar);
            g(d().c(sVar.f14281c));
            return this;
        }

        private void x() {
        }
    }
}
