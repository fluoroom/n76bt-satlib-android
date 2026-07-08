package gf;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import of.a;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends i.d implements of.q {
    private static final o M;
    public static of.r N = new a();
    private int A;
    private int B;
    private List C;
    private List D;
    private List E;
    private List F;
    private List G;
    private List H;
    private List I;
    private List J;
    private byte K;
    private int L;

    /* JADX INFO: renamed from: c */
    private final of.d f14167c;

    /* JADX INFO: renamed from: d */
    private int f14168d;

    /* JADX INFO: renamed from: e */
    private int f14169e;

    /* JADX INFO: renamed from: f */
    private int f14170f;

    /* JADX INFO: renamed from: g */
    private int f14171g;

    /* JADX INFO: renamed from: h */
    private r f14172h;

    /* JADX INFO: renamed from: r */
    private int f14173r;

    /* JADX INFO: renamed from: s */
    private List f14174s;

    /* JADX INFO: renamed from: t */
    private r f14175t;

    /* JADX INFO: renamed from: u */
    private int f14176u;

    /* JADX INFO: renamed from: v */
    private List f14177v;

    /* JADX INFO: renamed from: w */
    private List f14178w;

    /* JADX INFO: renamed from: x */
    private int f14179x;

    /* JADX INFO: renamed from: y */
    private List f14180y;

    /* JADX INFO: renamed from: z */
    private v f14181z;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public o b(of.e eVar, of.g gVar) {
            return new o(eVar, gVar);
        }
    }

    static {
        o oVar = new o(true);
        M = oVar;
        oVar.r1();
    }

    /* synthetic */ o(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    public static o F0() {
        return M;
    }

    private void r1() {
        this.f14169e = 518;
        this.f14170f = 2054;
        this.f14171g = 0;
        this.f14172h = r.e0();
        this.f14173r = 0;
        List list = Collections.EMPTY_LIST;
        this.f14174s = list;
        this.f14175t = r.e0();
        this.f14176u = 0;
        this.f14177v = list;
        this.f14178w = list;
        this.f14180y = list;
        this.f14181z = v.W();
        this.A = 0;
        this.B = 0;
        this.C = list;
        this.D = list;
        this.E = list;
        this.F = list;
        this.G = list;
        this.H = list;
        this.I = list;
        this.J = list;
    }

    public static b s1() {
        return b.r();
    }

    public static b t1(o oVar) {
        return s1().f(oVar);
    }

    public int A0() {
        return this.f14180y.size();
    }

    public r B0(int i10) {
        return (r) this.f14177v.get(i10);
    }

    public int C0() {
        return this.f14177v.size();
    }

    public List D0() {
        return this.f14178w;
    }

    public List E0() {
        return this.f14177v;
    }

    @Override // of.q
    /* JADX INFO: renamed from: G0 */
    public o getDefaultInstanceForType() {
        return M;
    }

    public gf.b H0(int i10) {
        return (gf.b) this.J.get(i10);
    }

    public int I0() {
        return this.J.size();
    }

    public List J0() {
        return this.J;
    }

    public gf.b K0(int i10) {
        return (gf.b) this.H.get(i10);
    }

    public int L0() {
        return this.H.size();
    }

    public List M0() {
        return this.H;
    }

    public int N0() {
        return this.f14169e;
    }

    public gf.b O0(int i10) {
        return (gf.b) this.F.get(i10);
    }

    public int P0() {
        return this.F.size();
    }

    public List Q0() {
        return this.F;
    }

    public int R0() {
        return this.A;
    }

    public int S0() {
        return this.f14171g;
    }

    public int T0() {
        return this.f14170f;
    }

    public r U0() {
        return this.f14175t;
    }

    public int V0() {
        return this.f14176u;
    }

    public r W0() {
        return this.f14172h;
    }

    public int X0() {
        return this.f14173r;
    }

    public gf.b Y0(int i10) {
        return (gf.b) this.G.get(i10);
    }

    public int Z0() {
        return this.G.size();
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14168d & 2) == 2) {
            fVar.Z(1, this.f14170f);
        }
        if ((this.f14168d & 4) == 4) {
            fVar.Z(2, this.f14171g);
        }
        if ((this.f14168d & 8) == 8) {
            fVar.c0(3, this.f14172h);
        }
        for (int i10 = 0; i10 < this.f14174s.size(); i10++) {
            fVar.c0(4, (of.p) this.f14174s.get(i10));
        }
        if ((this.f14168d & 32) == 32) {
            fVar.c0(5, this.f14175t);
        }
        if ((this.f14168d & 128) == 128) {
            fVar.c0(6, this.f14181z);
        }
        if ((this.f14168d & 256) == 256) {
            fVar.Z(7, this.A);
        }
        if ((this.f14168d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
            fVar.Z(8, this.B);
        }
        if ((this.f14168d & 16) == 16) {
            fVar.Z(9, this.f14173r);
        }
        if ((this.f14168d & 64) == 64) {
            fVar.Z(10, this.f14176u);
        }
        if ((this.f14168d & 1) == 1) {
            fVar.Z(11, this.f14169e);
        }
        for (int i11 = 0; i11 < this.f14177v.size(); i11++) {
            fVar.c0(12, (of.p) this.f14177v.get(i11));
        }
        if (D0().size() > 0) {
            fVar.n0(106);
            fVar.n0(this.f14179x);
        }
        for (int i12 = 0; i12 < this.f14178w.size(); i12++) {
            fVar.a0(((Integer) this.f14178w.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.E.size(); i13++) {
            fVar.c0(14, (of.p) this.E.get(i13));
        }
        for (int i14 = 0; i14 < this.F.size(); i14++) {
            fVar.c0(15, (of.p) this.F.get(i14));
        }
        for (int i15 = 0; i15 < this.G.size(); i15++) {
            fVar.c0(16, (of.p) this.G.get(i15));
        }
        for (int i16 = 0; i16 < this.f14180y.size(); i16++) {
            fVar.c0(17, (of.p) this.f14180y.get(i16));
        }
        for (int i17 = 0; i17 < this.C.size(); i17++) {
            fVar.Z(31, ((Integer) this.C.get(i17)).intValue());
        }
        for (int i18 = 0; i18 < this.D.size(); i18++) {
            fVar.c0(32, (of.p) this.D.get(i18));
        }
        for (int i19 = 0; i19 < this.H.size(); i19++) {
            fVar.c0(33, (of.p) this.H.get(i19));
        }
        for (int i20 = 0; i20 < this.I.size(); i20++) {
            fVar.c0(34, (of.p) this.I.get(i20));
        }
        for (int i21 = 0; i21 < this.J.size(); i21++) {
            fVar.c0(35, (of.p) this.J.get(i21));
        }
        aVarT.a(19000, fVar);
        fVar.h0(this.f14167c);
    }

    public List a1() {
        return this.G;
    }

    public int b1() {
        return this.B;
    }

    public v c1() {
        return this.f14181z;
    }

    public t d1(int i10) {
        return (t) this.f14174s.get(i10);
    }

    public int e1() {
        return this.f14174s.size();
    }

    public List f1() {
        return this.f14174s;
    }

    public List g1() {
        return this.C;
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.L;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14168d & 2) == 2 ? of.f.o(1, this.f14170f) : 0;
        if ((this.f14168d & 4) == 4) {
            iO += of.f.o(2, this.f14171g);
        }
        if ((this.f14168d & 8) == 8) {
            iO += of.f.r(3, this.f14172h);
        }
        for (int i11 = 0; i11 < this.f14174s.size(); i11++) {
            iO += of.f.r(4, (of.p) this.f14174s.get(i11));
        }
        if ((this.f14168d & 32) == 32) {
            iO += of.f.r(5, this.f14175t);
        }
        if ((this.f14168d & 128) == 128) {
            iO += of.f.r(6, this.f14181z);
        }
        if ((this.f14168d & 256) == 256) {
            iO += of.f.o(7, this.A);
        }
        if ((this.f14168d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
            iO += of.f.o(8, this.B);
        }
        if ((this.f14168d & 16) == 16) {
            iO += of.f.o(9, this.f14173r);
        }
        if ((this.f14168d & 64) == 64) {
            iO += of.f.o(10, this.f14176u);
        }
        if ((this.f14168d & 1) == 1) {
            iO += of.f.o(11, this.f14169e);
        }
        for (int i12 = 0; i12 < this.f14177v.size(); i12++) {
            iO += of.f.r(12, (of.p) this.f14177v.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f14178w.size(); i13++) {
            iP += of.f.p(((Integer) this.f14178w.get(i13)).intValue());
        }
        int iR = iO + iP;
        if (!D0().isEmpty()) {
            iR = iR + 1 + of.f.p(iP);
        }
        this.f14179x = iP;
        for (int i14 = 0; i14 < this.E.size(); i14++) {
            iR += of.f.r(14, (of.p) this.E.get(i14));
        }
        for (int i15 = 0; i15 < this.F.size(); i15++) {
            iR += of.f.r(15, (of.p) this.F.get(i15));
        }
        for (int i16 = 0; i16 < this.G.size(); i16++) {
            iR += of.f.r(16, (of.p) this.G.get(i16));
        }
        for (int i17 = 0; i17 < this.f14180y.size(); i17++) {
            iR += of.f.r(17, (of.p) this.f14180y.get(i17));
        }
        int iP2 = 0;
        for (int i18 = 0; i18 < this.C.size(); i18++) {
            iP2 += of.f.p(((Integer) this.C.get(i18)).intValue());
        }
        int size = iR + iP2 + (g1().size() * 2);
        for (int i19 = 0; i19 < this.D.size(); i19++) {
            size += of.f.r(32, (of.p) this.D.get(i19));
        }
        for (int i20 = 0; i20 < this.H.size(); i20++) {
            size += of.f.r(33, (of.p) this.H.get(i20));
        }
        for (int i21 = 0; i21 < this.I.size(); i21++) {
            size += of.f.r(34, (of.p) this.I.get(i21));
        }
        for (int i22 = 0; i22 < this.J.size(); i22++) {
            size += of.f.r(35, (of.p) this.J.get(i22));
        }
        int iO2 = size + o() + this.f14167c.size();
        this.L = iO2;
        return iO2;
    }

    public boolean h1() {
        return (this.f14168d & 1) == 1;
    }

    public boolean i1() {
        return (this.f14168d & 256) == 256;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.K;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!j1()) {
            this.K = (byte) 0;
            return false;
        }
        if (n1() && !W0().isInitialized()) {
            this.K = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < e1(); i10++) {
            if (!d1(i10).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        if (l1() && !U0().isInitialized()) {
            this.K = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < C0(); i11++) {
            if (!B0(i11).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < A0(); i12++) {
            if (!z0(i12).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        if (q1() && !c1().isInitialized()) {
            this.K = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < y0(); i13++) {
            if (!x0(i13).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < s0(); i14++) {
            if (!r0(i14).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < P0(); i15++) {
            if (!O0(i15).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < Z0(); i16++) {
            if (!Y0(i16).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < L0(); i17++) {
            if (!K0(i17).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < v0(); i18++) {
            if (!u0(i18).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < I0(); i19++) {
            if (!H0(i19).isInitialized()) {
                this.K = (byte) 0;
                return false;
            }
        }
        if (n()) {
            this.K = (byte) 1;
            return true;
        }
        this.K = (byte) 0;
        return false;
    }

    public boolean j1() {
        return (this.f14168d & 4) == 4;
    }

    public boolean k1() {
        return (this.f14168d & 2) == 2;
    }

    public boolean l1() {
        return (this.f14168d & 32) == 32;
    }

    public boolean m1() {
        return (this.f14168d & 64) == 64;
    }

    public boolean n1() {
        return (this.f14168d & 8) == 8;
    }

    public boolean o1() {
        return (this.f14168d & 16) == 16;
    }

    public boolean p1() {
        return (this.f14168d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512;
    }

    public boolean q1() {
        return (this.f14168d & 128) == 128;
    }

    public gf.b r0(int i10) {
        return (gf.b) this.E.get(i10);
    }

    public int s0() {
        return this.E.size();
    }

    public List t0() {
        return this.E;
    }

    public gf.b u0(int i10) {
        return (gf.b) this.I.get(i10);
    }

    @Override // of.p
    /* JADX INFO: renamed from: u1 */
    public b newBuilderForType() {
        return s1();
    }

    public int v0() {
        return this.I.size();
    }

    @Override // of.p
    /* JADX INFO: renamed from: v1 */
    public b toBuilder() {
        return t1(this);
    }

    public List w0() {
        return this.I;
    }

    public d x0(int i10) {
        return (d) this.D.get(i10);
    }

    public int y0() {
        return this.D.size();
    }

    public v z0(int i10) {
        return (v) this.f14180y.get(i10);
    }

    /* synthetic */ o(i.c cVar, gf.a aVar) {
        this(cVar);
    }

    private o(i.c cVar) {
        super(cVar);
        this.f14179x = -1;
        this.K = (byte) -1;
        this.L = -1;
        this.f14167c = cVar.d();
    }

    private o(boolean z10) {
        this.f14179x = -1;
        this.K = (byte) -1;
        this.L = -1;
        this.f14167c = of.d.f23423a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x03fd  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v19, types: [gf.r$c] */
    /* JADX WARN: Type inference failed for: r8v26, types: [gf.v$b] */
    /* JADX WARN: Type inference failed for: r8v9, types: [gf.r$c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o(of.e r23, of.g r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.o.<init>(of.e, of.g):void");
    }

    public static final class b extends i.c implements of.q {
        private int A;
        private List B;
        private List C;
        private List D;
        private List E;
        private List F;
        private List G;
        private List H;
        private List I;

        /* JADX INFO: renamed from: d */
        private int f14182d;

        /* JADX INFO: renamed from: g */
        private int f14185g;

        /* JADX INFO: renamed from: r */
        private int f14187r;

        /* JADX INFO: renamed from: s */
        private List f14188s;

        /* JADX INFO: renamed from: t */
        private r f14189t;

        /* JADX INFO: renamed from: u */
        private int f14190u;

        /* JADX INFO: renamed from: v */
        private List f14191v;

        /* JADX INFO: renamed from: w */
        private List f14192w;

        /* JADX INFO: renamed from: x */
        private List f14193x;

        /* JADX INFO: renamed from: y */
        private v f14194y;

        /* JADX INFO: renamed from: z */
        private int f14195z;

        /* JADX INFO: renamed from: e */
        private int f14183e = 518;

        /* JADX INFO: renamed from: f */
        private int f14184f = 2054;

        /* JADX INFO: renamed from: h */
        private r f14186h = r.e0();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f14188s = list;
            this.f14189t = r.e0();
            this.f14191v = list;
            this.f14192w = list;
            this.f14193x = list;
            this.f14194y = v.W();
            this.B = list;
            this.C = list;
            this.D = list;
            this.E = list;
            this.F = list;
            this.G = list;
            this.H = list;
            this.I = list;
            F();
        }

        private void A() {
            if ((this.f14182d & 524288) != 524288) {
                this.G = new ArrayList(this.G);
                this.f14182d |= 524288;
            }
        }

        private void B() {
            if ((this.f14182d & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 131072) {
                this.E = new ArrayList(this.E);
                this.f14182d |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
            }
        }

        private void C() {
            if ((this.f14182d & 262144) != 262144) {
                this.F = new ArrayList(this.F);
                this.f14182d |= 262144;
            }
        }

        private void D() {
            if ((this.f14182d & 32) != 32) {
                this.f14188s = new ArrayList(this.f14188s);
                this.f14182d |= 32;
            }
        }

        private void E() {
            if ((this.f14182d & 16384) != 16384) {
                this.B = new ArrayList(this.B);
                this.f14182d |= 16384;
            }
        }

        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14182d & WXMediaMessage.THUMB_LENGTH_LIMIT) != 65536) {
                this.D = new ArrayList(this.D);
                this.f14182d |= WXMediaMessage.THUMB_LENGTH_LIMIT;
            }
        }

        private void u() {
            if ((this.f14182d & 1048576) != 1048576) {
                this.H = new ArrayList(this.H);
                this.f14182d |= 1048576;
            }
        }

        private void v() {
            if ((this.f14182d & 32768) != 32768) {
                this.C = new ArrayList(this.C);
                this.f14182d |= 32768;
            }
        }

        private void w() {
            if ((this.f14182d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 1024) {
                this.f14193x = new ArrayList(this.f14193x);
                this.f14182d |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
            }
        }

        private void x() {
            if ((this.f14182d & WXMediaMessage.TITLE_LENGTH_LIMIT) != 512) {
                this.f14192w = new ArrayList(this.f14192w);
                this.f14182d |= WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
        }

        private void y() {
            if ((this.f14182d & 256) != 256) {
                this.f14191v = new ArrayList(this.f14191v);
                this.f14182d |= 256;
            }
        }

        private void z() {
            if ((this.f14182d & 2097152) != 2097152) {
                this.I = new ArrayList(this.I);
                this.f14182d |= 2097152;
            }
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: G */
        public b f(o oVar) {
            if (oVar == o.F0()) {
                return this;
            }
            if (oVar.h1()) {
                L(oVar.N0());
            }
            if (oVar.k1()) {
                O(oVar.T0());
            }
            if (oVar.j1()) {
                N(oVar.S0());
            }
            if (oVar.n1()) {
                J(oVar.W0());
            }
            if (oVar.o1()) {
                Q(oVar.X0());
            }
            if (!oVar.f14174s.isEmpty()) {
                if (this.f14188s.isEmpty()) {
                    this.f14188s = oVar.f14174s;
                    this.f14182d &= -33;
                } else {
                    D();
                    this.f14188s.addAll(oVar.f14174s);
                }
            }
            if (oVar.l1()) {
                I(oVar.U0());
            }
            if (oVar.m1()) {
                P(oVar.V0());
            }
            if (!oVar.f14177v.isEmpty()) {
                if (this.f14191v.isEmpty()) {
                    this.f14191v = oVar.f14177v;
                    this.f14182d &= -257;
                } else {
                    y();
                    this.f14191v.addAll(oVar.f14177v);
                }
            }
            if (!oVar.f14178w.isEmpty()) {
                if (this.f14192w.isEmpty()) {
                    this.f14192w = oVar.f14178w;
                    this.f14182d &= -513;
                } else {
                    x();
                    this.f14192w.addAll(oVar.f14178w);
                }
            }
            if (!oVar.f14180y.isEmpty()) {
                if (this.f14193x.isEmpty()) {
                    this.f14193x = oVar.f14180y;
                    this.f14182d &= -1025;
                } else {
                    w();
                    this.f14193x.addAll(oVar.f14180y);
                }
            }
            if (oVar.q1()) {
                K(oVar.c1());
            }
            if (oVar.i1()) {
                M(oVar.R0());
            }
            if (oVar.p1()) {
                R(oVar.b1());
            }
            if (!oVar.C.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = oVar.C;
                    this.f14182d &= -16385;
                } else {
                    E();
                    this.B.addAll(oVar.C);
                }
            }
            if (!oVar.D.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = oVar.D;
                    this.f14182d &= -32769;
                } else {
                    v();
                    this.C.addAll(oVar.D);
                }
            }
            if (!oVar.E.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = oVar.E;
                    this.f14182d &= -65537;
                } else {
                    t();
                    this.D.addAll(oVar.E);
                }
            }
            if (!oVar.F.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = oVar.F;
                    this.f14182d &= -131073;
                } else {
                    B();
                    this.E.addAll(oVar.F);
                }
            }
            if (!oVar.G.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = oVar.G;
                    this.f14182d &= -262145;
                } else {
                    C();
                    this.F.addAll(oVar.G);
                }
            }
            if (!oVar.H.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = oVar.H;
                    this.f14182d &= -524289;
                } else {
                    A();
                    this.G.addAll(oVar.H);
                }
            }
            if (!oVar.I.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = oVar.I;
                    this.f14182d &= -1048577;
                } else {
                    u();
                    this.H.addAll(oVar.I);
                }
            }
            if (!oVar.J.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = oVar.J;
                    this.f14182d &= -2097153;
                } else {
                    z();
                    this.I.addAll(oVar.J);
                }
            }
            k(oVar);
            g(d().c(oVar.f14167c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.o.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.o.N     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.o r3 = (gf.o) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.o r4 = (gf.o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.o.b.S(of.e, of.g):gf.o$b");
        }

        public b I(r rVar) {
            if ((this.f14182d & 64) != 64 || this.f14189t == r.e0()) {
                this.f14189t = rVar;
            } else {
                this.f14189t = r.F0(this.f14189t).f(rVar).o();
            }
            this.f14182d |= 64;
            return this;
        }

        public b J(r rVar) {
            if ((this.f14182d & 8) != 8 || this.f14186h == r.e0()) {
                this.f14186h = rVar;
            } else {
                this.f14186h = r.F0(this.f14186h).f(rVar).o();
            }
            this.f14182d |= 8;
            return this;
        }

        public b K(v vVar) {
            if ((this.f14182d & 2048) != 2048 || this.f14194y == v.W()) {
                this.f14194y = vVar;
            } else {
                this.f14194y = v.n0(this.f14194y).f(vVar).o();
            }
            this.f14182d |= 2048;
            return this;
        }

        public b L(int i10) {
            this.f14182d |= 1;
            this.f14183e = i10;
            return this;
        }

        public b M(int i10) {
            this.f14182d |= 4096;
            this.f14195z = i10;
            return this;
        }

        public b N(int i10) {
            this.f14182d |= 4;
            this.f14185g = i10;
            return this;
        }

        public b O(int i10) {
            this.f14182d |= 2;
            this.f14184f = i10;
            return this;
        }

        public b P(int i10) {
            this.f14182d |= 128;
            this.f14190u = i10;
            return this;
        }

        public b Q(int i10) {
            this.f14182d |= 16;
            this.f14187r = i10;
            return this;
        }

        public b R(int i10) {
            this.f14182d |= 8192;
            this.A = i10;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n */
        public o build() {
            o oVarO = o();
            if (oVarO.isInitialized()) {
                return oVarO;
            }
            throw a.AbstractC0317a.b(oVarO);
        }

        public o o() {
            o oVar = new o(this);
            int i10 = this.f14182d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            oVar.f14169e = this.f14183e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            oVar.f14170f = this.f14184f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            oVar.f14171g = this.f14185g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            oVar.f14172h = this.f14186h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            oVar.f14173r = this.f14187r;
            if ((this.f14182d & 32) == 32) {
                this.f14188s = DesugarCollections.unmodifiableList(this.f14188s);
                this.f14182d &= -33;
            }
            oVar.f14174s = this.f14188s;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            oVar.f14175t = this.f14189t;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            oVar.f14176u = this.f14190u;
            if ((this.f14182d & 256) == 256) {
                this.f14191v = DesugarCollections.unmodifiableList(this.f14191v);
                this.f14182d &= -257;
            }
            oVar.f14177v = this.f14191v;
            if ((this.f14182d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                this.f14192w = DesugarCollections.unmodifiableList(this.f14192w);
                this.f14182d &= -513;
            }
            oVar.f14178w = this.f14192w;
            if ((this.f14182d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024) {
                this.f14193x = DesugarCollections.unmodifiableList(this.f14193x);
                this.f14182d &= -1025;
            }
            oVar.f14180y = this.f14193x;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            oVar.f14181z = this.f14194y;
            if ((i10 & 4096) == 4096) {
                i11 |= 256;
            }
            oVar.A = this.f14195z;
            if ((i10 & 8192) == 8192) {
                i11 |= WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
            oVar.B = this.A;
            if ((this.f14182d & 16384) == 16384) {
                this.B = DesugarCollections.unmodifiableList(this.B);
                this.f14182d &= -16385;
            }
            oVar.C = this.B;
            if ((this.f14182d & 32768) == 32768) {
                this.C = DesugarCollections.unmodifiableList(this.C);
                this.f14182d &= -32769;
            }
            oVar.D = this.C;
            if ((this.f14182d & WXMediaMessage.THUMB_LENGTH_LIMIT) == 65536) {
                this.D = DesugarCollections.unmodifiableList(this.D);
                this.f14182d &= -65537;
            }
            oVar.E = this.D;
            if ((this.f14182d & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 131072) {
                this.E = DesugarCollections.unmodifiableList(this.E);
                this.f14182d &= -131073;
            }
            oVar.F = this.E;
            if ((this.f14182d & 262144) == 262144) {
                this.F = DesugarCollections.unmodifiableList(this.F);
                this.f14182d &= -262145;
            }
            oVar.G = this.F;
            if ((this.f14182d & 524288) == 524288) {
                this.G = DesugarCollections.unmodifiableList(this.G);
                this.f14182d &= -524289;
            }
            oVar.H = this.G;
            if ((this.f14182d & 1048576) == 1048576) {
                this.H = DesugarCollections.unmodifiableList(this.H);
                this.f14182d &= -1048577;
            }
            oVar.I = this.H;
            if ((this.f14182d & 2097152) == 2097152) {
                this.I = DesugarCollections.unmodifiableList(this.I);
                this.f14182d &= -2097153;
            }
            oVar.J = this.I;
            oVar.f14168d = i11;
            return oVar;
        }

        /* JADX INFO: renamed from: p */
        public b clone() {
            return r().f(o());
        }

        private void F() {
        }
    }
}
