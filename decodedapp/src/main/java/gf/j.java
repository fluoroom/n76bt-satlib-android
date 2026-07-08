package gf;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import of.a;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends i.d implements of.q {
    private static final j I;
    public static of.r J = new a();
    private u A;
    private List B;
    private f C;
    private List D;
    private List E;
    private List F;
    private byte G;
    private int H;

    /* JADX INFO: renamed from: c */
    private final of.d f14092c;

    /* JADX INFO: renamed from: d */
    private int f14093d;

    /* JADX INFO: renamed from: e */
    private int f14094e;

    /* JADX INFO: renamed from: f */
    private int f14095f;

    /* JADX INFO: renamed from: g */
    private int f14096g;

    /* JADX INFO: renamed from: h */
    private r f14097h;

    /* JADX INFO: renamed from: r */
    private int f14098r;

    /* JADX INFO: renamed from: s */
    private List f14099s;

    /* JADX INFO: renamed from: t */
    private r f14100t;

    /* JADX INFO: renamed from: u */
    private int f14101u;

    /* JADX INFO: renamed from: v */
    private List f14102v;

    /* JADX INFO: renamed from: w */
    private List f14103w;

    /* JADX INFO: renamed from: x */
    private int f14104x;

    /* JADX INFO: renamed from: y */
    private List f14105y;

    /* JADX INFO: renamed from: z */
    private List f14106z;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public j b(of.e eVar, of.g gVar) {
            return new j(eVar, gVar);
        }
    }

    static {
        j jVar = new j(true);
        I = jVar;
        jVar.Z0();
    }

    /* synthetic */ j(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    private void Z0() {
        this.f14094e = 6;
        this.f14095f = 6;
        this.f14096g = 0;
        this.f14097h = r.e0();
        this.f14098r = 0;
        List list = Collections.EMPTY_LIST;
        this.f14099s = list;
        this.f14100t = r.e0();
        this.f14101u = 0;
        this.f14102v = list;
        this.f14103w = list;
        this.f14105y = list;
        this.f14106z = list;
        this.A = u.r();
        this.B = list;
        this.C = f.p();
        this.D = list;
        this.E = list;
        this.F = list;
    }

    public static b a1() {
        return b.r();
    }

    public static b b1(j jVar) {
        return a1().f(jVar);
    }

    public static j d1(InputStream inputStream, of.g gVar) {
        return (j) J.c(inputStream, gVar);
    }

    public static j w0() {
        return I;
    }

    public List A0() {
        return this.F;
    }

    public int B0() {
        return this.f14094e;
    }

    public int C0() {
        return this.f14096g;
    }

    public int D0() {
        return this.f14095f;
    }

    public r E0() {
        return this.f14100t;
    }

    public int F0() {
        return this.f14101u;
    }

    public r G0() {
        return this.f14097h;
    }

    public int H0() {
        return this.f14098r;
    }

    public t I0(int i10) {
        return (t) this.f14099s.get(i10);
    }

    public int J0() {
        return this.f14099s.size();
    }

    public List K0() {
        return this.f14099s;
    }

    public u L0() {
        return this.A;
    }

    public v M0(int i10) {
        return (v) this.f14106z.get(i10);
    }

    public int N0() {
        return this.f14106z.size();
    }

    public List O0() {
        return this.f14106z;
    }

    public List P0() {
        return this.B;
    }

    public boolean Q0() {
        return (this.f14093d & 256) == 256;
    }

    public boolean R0() {
        return (this.f14093d & 1) == 1;
    }

    public boolean S0() {
        return (this.f14093d & 4) == 4;
    }

    public boolean T0() {
        return (this.f14093d & 2) == 2;
    }

    public boolean U0() {
        return (this.f14093d & 32) == 32;
    }

    public boolean V0() {
        return (this.f14093d & 64) == 64;
    }

    public boolean W0() {
        return (this.f14093d & 8) == 8;
    }

    public boolean X0() {
        return (this.f14093d & 16) == 16;
    }

    public boolean Y0() {
        return (this.f14093d & 128) == 128;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14093d & 2) == 2) {
            fVar.Z(1, this.f14095f);
        }
        if ((this.f14093d & 4) == 4) {
            fVar.Z(2, this.f14096g);
        }
        if ((this.f14093d & 8) == 8) {
            fVar.c0(3, this.f14097h);
        }
        for (int i10 = 0; i10 < this.f14099s.size(); i10++) {
            fVar.c0(4, (of.p) this.f14099s.get(i10));
        }
        if ((this.f14093d & 32) == 32) {
            fVar.c0(5, this.f14100t);
        }
        for (int i11 = 0; i11 < this.f14106z.size(); i11++) {
            fVar.c0(6, (of.p) this.f14106z.get(i11));
        }
        if ((this.f14093d & 16) == 16) {
            fVar.Z(7, this.f14098r);
        }
        if ((this.f14093d & 64) == 64) {
            fVar.Z(8, this.f14101u);
        }
        if ((this.f14093d & 1) == 1) {
            fVar.Z(9, this.f14094e);
        }
        for (int i12 = 0; i12 < this.f14102v.size(); i12++) {
            fVar.c0(10, (of.p) this.f14102v.get(i12));
        }
        if (t0().size() > 0) {
            fVar.n0(90);
            fVar.n0(this.f14104x);
        }
        for (int i13 = 0; i13 < this.f14103w.size(); i13++) {
            fVar.a0(((Integer) this.f14103w.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.E.size(); i14++) {
            fVar.c0(12, (of.p) this.E.get(i14));
        }
        for (int i15 = 0; i15 < this.f14105y.size(); i15++) {
            fVar.c0(13, (of.p) this.f14105y.get(i15));
        }
        if ((this.f14093d & 128) == 128) {
            fVar.c0(30, this.A);
        }
        for (int i16 = 0; i16 < this.B.size(); i16++) {
            fVar.Z(31, ((Integer) this.B.get(i16)).intValue());
        }
        if ((this.f14093d & 256) == 256) {
            fVar.c0(32, this.C);
        }
        for (int i17 = 0; i17 < this.D.size(); i17++) {
            fVar.c0(33, (of.p) this.D.get(i17));
        }
        for (int i18 = 0; i18 < this.F.size(); i18++) {
            fVar.c0(34, (of.p) this.F.get(i18));
        }
        aVarT.a(19000, fVar);
        fVar.h0(this.f14092c);
    }

    @Override // of.p
    /* JADX INFO: renamed from: c1 */
    public b newBuilderForType() {
        return a1();
    }

    @Override // of.p
    /* JADX INFO: renamed from: e1 */
    public b toBuilder() {
        return b1(this);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.H;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14093d & 2) == 2 ? of.f.o(1, this.f14095f) : 0;
        if ((this.f14093d & 4) == 4) {
            iO += of.f.o(2, this.f14096g);
        }
        if ((this.f14093d & 8) == 8) {
            iO += of.f.r(3, this.f14097h);
        }
        for (int i11 = 0; i11 < this.f14099s.size(); i11++) {
            iO += of.f.r(4, (of.p) this.f14099s.get(i11));
        }
        if ((this.f14093d & 32) == 32) {
            iO += of.f.r(5, this.f14100t);
        }
        for (int i12 = 0; i12 < this.f14106z.size(); i12++) {
            iO += of.f.r(6, (of.p) this.f14106z.get(i12));
        }
        if ((this.f14093d & 16) == 16) {
            iO += of.f.o(7, this.f14098r);
        }
        if ((this.f14093d & 64) == 64) {
            iO += of.f.o(8, this.f14101u);
        }
        if ((this.f14093d & 1) == 1) {
            iO += of.f.o(9, this.f14094e);
        }
        for (int i13 = 0; i13 < this.f14102v.size(); i13++) {
            iO += of.f.r(10, (of.p) this.f14102v.get(i13));
        }
        int iP = 0;
        for (int i14 = 0; i14 < this.f14103w.size(); i14++) {
            iP += of.f.p(((Integer) this.f14103w.get(i14)).intValue());
        }
        int iR = iO + iP;
        if (!t0().isEmpty()) {
            iR = iR + 1 + of.f.p(iP);
        }
        this.f14104x = iP;
        for (int i15 = 0; i15 < this.E.size(); i15++) {
            iR += of.f.r(12, (of.p) this.E.get(i15));
        }
        for (int i16 = 0; i16 < this.f14105y.size(); i16++) {
            iR += of.f.r(13, (of.p) this.f14105y.get(i16));
        }
        if ((this.f14093d & 128) == 128) {
            iR += of.f.r(30, this.A);
        }
        int iP2 = 0;
        for (int i17 = 0; i17 < this.B.size(); i17++) {
            iP2 += of.f.p(((Integer) this.B.get(i17)).intValue());
        }
        int size = iR + iP2 + (P0().size() * 2);
        if ((this.f14093d & 256) == 256) {
            size += of.f.r(32, this.C);
        }
        for (int i18 = 0; i18 < this.D.size(); i18++) {
            size += of.f.r(33, (of.p) this.D.get(i18));
        }
        for (int i19 = 0; i19 < this.F.size(); i19++) {
            size += of.f.r(34, (of.p) this.F.get(i19));
        }
        int iO2 = size + o() + this.f14092c.size();
        this.H = iO2;
        return iO2;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.G;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!S0()) {
            this.G = (byte) 0;
            return false;
        }
        if (W0() && !G0().isInitialized()) {
            this.G = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < J0(); i10++) {
            if (!I0(i10).isInitialized()) {
                this.G = (byte) 0;
                return false;
            }
        }
        if (U0() && !E0().isInitialized()) {
            this.G = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < s0(); i11++) {
            if (!r0(i11).isInitialized()) {
                this.G = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < q0(); i12++) {
            if (!p0(i12).isInitialized()) {
                this.G = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < N0(); i13++) {
            if (!M0(i13).isInitialized()) {
                this.G = (byte) 0;
                return false;
            }
        }
        if (Y0() && !L0().isInitialized()) {
            this.G = (byte) 0;
            return false;
        }
        if (Q0() && !v0().isInitialized()) {
            this.G = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < o0(); i14++) {
            if (!n0(i14).isInitialized()) {
                this.G = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < l0(); i15++) {
            if (!k0(i15).isInitialized()) {
                this.G = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < z0(); i16++) {
            if (!y0(i16).isInitialized()) {
                this.G = (byte) 0;
                return false;
            }
        }
        if (n()) {
            this.G = (byte) 1;
            return true;
        }
        this.G = (byte) 0;
        return false;
    }

    public gf.b k0(int i10) {
        return (gf.b) this.E.get(i10);
    }

    public int l0() {
        return this.E.size();
    }

    public List m0() {
        return this.E;
    }

    public d n0(int i10) {
        return (d) this.D.get(i10);
    }

    public int o0() {
        return this.D.size();
    }

    public v p0(int i10) {
        return (v) this.f14105y.get(i10);
    }

    public int q0() {
        return this.f14105y.size();
    }

    public r r0(int i10) {
        return (r) this.f14102v.get(i10);
    }

    public int s0() {
        return this.f14102v.size();
    }

    public List t0() {
        return this.f14103w;
    }

    public List u0() {
        return this.f14102v;
    }

    public f v0() {
        return this.C;
    }

    @Override // of.q
    /* JADX INFO: renamed from: x0 */
    public j getDefaultInstanceForType() {
        return I;
    }

    public gf.b y0(int i10) {
        return (gf.b) this.F.get(i10);
    }

    public int z0() {
        return this.F.size();
    }

    /* synthetic */ j(i.c cVar, gf.a aVar) {
        this(cVar);
    }

    private j(i.c cVar) {
        super(cVar);
        this.f14104x = -1;
        this.G = (byte) -1;
        this.H = -1;
        this.f14092c = cVar.d();
    }

    private j(boolean z10) {
        this.f14104x = -1;
        this.G = (byte) -1;
        this.H = -1;
        this.f14092c = of.d.f23423a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0393  */
    /* JADX WARN: Type inference failed for: r11v19, types: [gf.r$c] */
    /* JADX WARN: Type inference failed for: r11v52, types: [gf.u$b] */
    /* JADX WARN: Type inference failed for: r11v9, types: [gf.r$c] */
    /* JADX WARN: Type inference failed for: r12v33, types: [gf.f$b] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private j(of.e r22, of.g r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.j.<init>(of.e, of.g):void");
    }

    public static final class b extends i.c implements of.q {
        private List A;
        private f B;
        private List C;
        private List D;
        private List E;

        /* JADX INFO: renamed from: d */
        private int f14107d;

        /* JADX INFO: renamed from: g */
        private int f14110g;

        /* JADX INFO: renamed from: r */
        private int f14112r;

        /* JADX INFO: renamed from: s */
        private List f14113s;

        /* JADX INFO: renamed from: t */
        private r f14114t;

        /* JADX INFO: renamed from: u */
        private int f14115u;

        /* JADX INFO: renamed from: v */
        private List f14116v;

        /* JADX INFO: renamed from: w */
        private List f14117w;

        /* JADX INFO: renamed from: x */
        private List f14118x;

        /* JADX INFO: renamed from: y */
        private List f14119y;

        /* JADX INFO: renamed from: z */
        private u f14120z;

        /* JADX INFO: renamed from: e */
        private int f14108e = 6;

        /* JADX INFO: renamed from: f */
        private int f14109f = 6;

        /* JADX INFO: renamed from: h */
        private r f14111h = r.e0();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f14113s = list;
            this.f14114t = r.e0();
            this.f14116v = list;
            this.f14117w = list;
            this.f14118x = list;
            this.f14119y = list;
            this.f14120z = u.r();
            this.A = list;
            this.B = f.p();
            this.C = list;
            this.D = list;
            this.E = list;
            C();
        }

        private void A() {
            if ((this.f14107d & 2048) != 2048) {
                this.f14119y = new ArrayList(this.f14119y);
                this.f14107d |= 2048;
            }
        }

        private void B() {
            if ((this.f14107d & 8192) != 8192) {
                this.A = new ArrayList(this.A);
                this.f14107d |= 8192;
            }
        }

        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14107d & WXMediaMessage.THUMB_LENGTH_LIMIT) != 65536) {
                this.D = new ArrayList(this.D);
                this.f14107d |= WXMediaMessage.THUMB_LENGTH_LIMIT;
            }
        }

        private void u() {
            if ((this.f14107d & 32768) != 32768) {
                this.C = new ArrayList(this.C);
                this.f14107d |= 32768;
            }
        }

        private void v() {
            if ((this.f14107d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 1024) {
                this.f14118x = new ArrayList(this.f14118x);
                this.f14107d |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
            }
        }

        private void w() {
            if ((this.f14107d & WXMediaMessage.TITLE_LENGTH_LIMIT) != 512) {
                this.f14117w = new ArrayList(this.f14117w);
                this.f14107d |= WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
        }

        private void x() {
            if ((this.f14107d & 256) != 256) {
                this.f14116v = new ArrayList(this.f14116v);
                this.f14107d |= 256;
            }
        }

        private void y() {
            if ((this.f14107d & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 131072) {
                this.E = new ArrayList(this.E);
                this.f14107d |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
            }
        }

        private void z() {
            if ((this.f14107d & 32) != 32) {
                this.f14113s = new ArrayList(this.f14113s);
                this.f14107d |= 32;
            }
        }

        public b D(f fVar) {
            if ((this.f14107d & 16384) != 16384 || this.B == f.p()) {
                this.B = fVar;
            } else {
                this.B = f.w(this.B).f(fVar).j();
            }
            this.f14107d |= 16384;
            return this;
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: E */
        public b f(j jVar) {
            if (jVar == j.w0()) {
                return this;
            }
            if (jVar.R0()) {
                J(jVar.B0());
            }
            if (jVar.T0()) {
                L(jVar.D0());
            }
            if (jVar.S0()) {
                K(jVar.C0());
            }
            if (jVar.W0()) {
                H(jVar.G0());
            }
            if (jVar.X0()) {
                N(jVar.H0());
            }
            if (!jVar.f14099s.isEmpty()) {
                if (this.f14113s.isEmpty()) {
                    this.f14113s = jVar.f14099s;
                    this.f14107d &= -33;
                } else {
                    z();
                    this.f14113s.addAll(jVar.f14099s);
                }
            }
            if (jVar.U0()) {
                G(jVar.E0());
            }
            if (jVar.V0()) {
                M(jVar.F0());
            }
            if (!jVar.f14102v.isEmpty()) {
                if (this.f14116v.isEmpty()) {
                    this.f14116v = jVar.f14102v;
                    this.f14107d &= -257;
                } else {
                    x();
                    this.f14116v.addAll(jVar.f14102v);
                }
            }
            if (!jVar.f14103w.isEmpty()) {
                if (this.f14117w.isEmpty()) {
                    this.f14117w = jVar.f14103w;
                    this.f14107d &= -513;
                } else {
                    w();
                    this.f14117w.addAll(jVar.f14103w);
                }
            }
            if (!jVar.f14105y.isEmpty()) {
                if (this.f14118x.isEmpty()) {
                    this.f14118x = jVar.f14105y;
                    this.f14107d &= -1025;
                } else {
                    v();
                    this.f14118x.addAll(jVar.f14105y);
                }
            }
            if (!jVar.f14106z.isEmpty()) {
                if (this.f14119y.isEmpty()) {
                    this.f14119y = jVar.f14106z;
                    this.f14107d &= -2049;
                } else {
                    A();
                    this.f14119y.addAll(jVar.f14106z);
                }
            }
            if (jVar.Y0()) {
                I(jVar.L0());
            }
            if (!jVar.B.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = jVar.B;
                    this.f14107d &= -8193;
                } else {
                    B();
                    this.A.addAll(jVar.B);
                }
            }
            if (jVar.Q0()) {
                D(jVar.v0());
            }
            if (!jVar.D.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = jVar.D;
                    this.f14107d &= -32769;
                } else {
                    u();
                    this.C.addAll(jVar.D);
                }
            }
            if (!jVar.E.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = jVar.E;
                    this.f14107d &= -65537;
                } else {
                    t();
                    this.D.addAll(jVar.E);
                }
            }
            if (!jVar.F.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = jVar.F;
                    this.f14107d &= -131073;
                } else {
                    y();
                    this.E.addAll(jVar.F);
                }
            }
            k(jVar);
            g(d().c(jVar.f14092c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.j.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.j.J     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.j r3 = (gf.j) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.j r4 = (gf.j) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.j.b.S(of.e, of.g):gf.j$b");
        }

        public b G(r rVar) {
            if ((this.f14107d & 64) != 64 || this.f14114t == r.e0()) {
                this.f14114t = rVar;
            } else {
                this.f14114t = r.F0(this.f14114t).f(rVar).o();
            }
            this.f14107d |= 64;
            return this;
        }

        public b H(r rVar) {
            if ((this.f14107d & 8) != 8 || this.f14111h == r.e0()) {
                this.f14111h = rVar;
            } else {
                this.f14111h = r.F0(this.f14111h).f(rVar).o();
            }
            this.f14107d |= 8;
            return this;
        }

        public b I(u uVar) {
            if ((this.f14107d & 4096) != 4096 || this.f14120z == u.r()) {
                this.f14120z = uVar;
            } else {
                this.f14120z = u.C(this.f14120z).f(uVar).j();
            }
            this.f14107d |= 4096;
            return this;
        }

        public b J(int i10) {
            this.f14107d |= 1;
            this.f14108e = i10;
            return this;
        }

        public b K(int i10) {
            this.f14107d |= 4;
            this.f14110g = i10;
            return this;
        }

        public b L(int i10) {
            this.f14107d |= 2;
            this.f14109f = i10;
            return this;
        }

        public b M(int i10) {
            this.f14107d |= 128;
            this.f14115u = i10;
            return this;
        }

        public b N(int i10) {
            this.f14107d |= 16;
            this.f14112r = i10;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n */
        public j build() {
            j jVarO = o();
            if (jVarO.isInitialized()) {
                return jVarO;
            }
            throw a.AbstractC0317a.b(jVarO);
        }

        public j o() {
            j jVar = new j(this);
            int i10 = this.f14107d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            jVar.f14094e = this.f14108e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            jVar.f14095f = this.f14109f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            jVar.f14096g = this.f14110g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            jVar.f14097h = this.f14111h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            jVar.f14098r = this.f14112r;
            if ((this.f14107d & 32) == 32) {
                this.f14113s = DesugarCollections.unmodifiableList(this.f14113s);
                this.f14107d &= -33;
            }
            jVar.f14099s = this.f14113s;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            jVar.f14100t = this.f14114t;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            jVar.f14101u = this.f14115u;
            if ((this.f14107d & 256) == 256) {
                this.f14116v = DesugarCollections.unmodifiableList(this.f14116v);
                this.f14107d &= -257;
            }
            jVar.f14102v = this.f14116v;
            if ((this.f14107d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                this.f14117w = DesugarCollections.unmodifiableList(this.f14117w);
                this.f14107d &= -513;
            }
            jVar.f14103w = this.f14117w;
            if ((this.f14107d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024) {
                this.f14118x = DesugarCollections.unmodifiableList(this.f14118x);
                this.f14107d &= -1025;
            }
            jVar.f14105y = this.f14118x;
            if ((this.f14107d & 2048) == 2048) {
                this.f14119y = DesugarCollections.unmodifiableList(this.f14119y);
                this.f14107d &= -2049;
            }
            jVar.f14106z = this.f14119y;
            if ((i10 & 4096) == 4096) {
                i11 |= 128;
            }
            jVar.A = this.f14120z;
            if ((this.f14107d & 8192) == 8192) {
                this.A = DesugarCollections.unmodifiableList(this.A);
                this.f14107d &= -8193;
            }
            jVar.B = this.A;
            if ((i10 & 16384) == 16384) {
                i11 |= 256;
            }
            jVar.C = this.B;
            if ((this.f14107d & 32768) == 32768) {
                this.C = DesugarCollections.unmodifiableList(this.C);
                this.f14107d &= -32769;
            }
            jVar.D = this.C;
            if ((this.f14107d & WXMediaMessage.THUMB_LENGTH_LIMIT) == 65536) {
                this.D = DesugarCollections.unmodifiableList(this.D);
                this.f14107d &= -65537;
            }
            jVar.E = this.D;
            if ((this.f14107d & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 131072) {
                this.E = DesugarCollections.unmodifiableList(this.E);
                this.f14107d &= -131073;
            }
            jVar.F = this.E;
            jVar.f14093d = i11;
            return jVar;
        }

        /* JADX INFO: renamed from: p */
        public b clone() {
            return r().f(o());
        }

        private void C() {
        }
    }
}
