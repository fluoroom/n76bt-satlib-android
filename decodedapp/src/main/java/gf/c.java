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
import of.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i.d implements of.q {
    private static final c V;
    public static of.r W = new a();
    private List A;
    private List B;
    private List C;
    private List D;
    private List E;
    private int F;
    private int G;
    private r H;
    private int I;
    private List J;
    private int K;
    private List L;
    private List M;
    private int N;
    private List O;
    private u P;
    private List Q;
    private x R;
    private List S;
    private byte T;
    private int U;

    /* JADX INFO: renamed from: c */
    private final of.d f13952c;

    /* JADX INFO: renamed from: d */
    private int f13953d;

    /* JADX INFO: renamed from: e */
    private int f13954e;

    /* JADX INFO: renamed from: f */
    private int f13955f;

    /* JADX INFO: renamed from: g */
    private int f13956g;

    /* JADX INFO: renamed from: h */
    private List f13957h;

    /* JADX INFO: renamed from: r */
    private List f13958r;

    /* JADX INFO: renamed from: s */
    private List f13959s;

    /* JADX INFO: renamed from: t */
    private int f13960t;

    /* JADX INFO: renamed from: u */
    private List f13961u;

    /* JADX INFO: renamed from: v */
    private int f13962v;

    /* JADX INFO: renamed from: w */
    private List f13963w;

    /* JADX INFO: renamed from: x */
    private List f13964x;

    /* JADX INFO: renamed from: y */
    private int f13965y;

    /* JADX INFO: renamed from: z */
    private List f13966z;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j */
        public c b(of.e eVar, of.g gVar) {
            return new c(eVar, gVar);
        }
    }

    /* JADX INFO: renamed from: gf.c$c */
    public enum EnumC0201c implements j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* JADX INFO: renamed from: r */
        private static j.b f13988r = new a();

        /* JADX INFO: renamed from: a */
        private final int f13990a;

        /* JADX INFO: renamed from: gf.c$c$a */
        static class a implements j.b {
            a() {
            }

            @Override // of.j.b
            /* JADX INFO: renamed from: b */
            public EnumC0201c a(int i10) {
                return EnumC0201c.a(i10);
            }
        }

        EnumC0201c(int i10, int i11) {
            this.f13990a = i11;
        }

        public static EnumC0201c a(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // of.j.a
        public final int getNumber() {
            return this.f13990a;
        }
    }

    static {
        c cVar = new c(true);
        V = cVar;
        cVar.I1();
    }

    /* synthetic */ c(of.e eVar, of.g gVar, gf.a aVar) {
        this(eVar, gVar);
    }

    private void I1() {
        this.f13954e = 6;
        this.f13955f = 0;
        this.f13956g = 0;
        List list = Collections.EMPTY_LIST;
        this.f13957h = list;
        this.f13958r = list;
        this.f13959s = list;
        this.f13961u = list;
        this.f13963w = list;
        this.f13964x = list;
        this.f13966z = list;
        this.A = list;
        this.B = list;
        this.C = list;
        this.D = list;
        this.E = list;
        this.G = 0;
        this.H = r.e0();
        this.I = 0;
        this.J = list;
        this.L = list;
        this.M = list;
        this.O = list;
        this.P = u.r();
        this.Q = list;
        this.R = x.p();
        this.S = list;
    }

    public static b J1() {
        return b.r();
    }

    public static b K1(c cVar) {
        return J1().f(cVar);
    }

    public static c M1(InputStream inputStream, of.g gVar) {
        return (c) W.c(inputStream, gVar);
    }

    public static c O0() {
        return V;
    }

    public boolean A1() {
        return (this.f13953d & 4) == 4;
    }

    public gf.b B0(int i10) {
        return (gf.b) this.O.get(i10);
    }

    public boolean B1() {
        return (this.f13953d & 1) == 1;
    }

    public int C0() {
        return this.O.size();
    }

    public boolean C1() {
        return (this.f13953d & 2) == 2;
    }

    public List D0() {
        return this.O;
    }

    public boolean D1() {
        return (this.f13953d & 8) == 8;
    }

    public int E0() {
        return this.f13956g;
    }

    public boolean E1() {
        return (this.f13953d & 16) == 16;
    }

    public d F0(int i10) {
        return (d) this.S.get(i10);
    }

    public boolean F1() {
        return (this.f13953d & 32) == 32;
    }

    public int G0() {
        return this.S.size();
    }

    public boolean G1() {
        return (this.f13953d & 64) == 64;
    }

    public e H0(int i10) {
        return (e) this.f13966z.get(i10);
    }

    public boolean H1() {
        return (this.f13953d & 128) == 128;
    }

    public int I0() {
        return this.f13966z.size();
    }

    public List J0() {
        return this.f13966z;
    }

    public r K0(int i10) {
        return (r) this.f13963w.get(i10);
    }

    public int L0() {
        return this.f13963w.size();
    }

    @Override // of.p
    /* JADX INFO: renamed from: L1 */
    public b newBuilderForType() {
        return J1();
    }

    public List M0() {
        return this.f13964x;
    }

    public List N0() {
        return this.f13963w;
    }

    @Override // of.p
    /* JADX INFO: renamed from: N1 */
    public b toBuilder() {
        return K1(this);
    }

    @Override // of.q
    /* JADX INFO: renamed from: P0 */
    public c getDefaultInstanceForType() {
        return V;
    }

    public h Q0(int i10) {
        return (h) this.D.get(i10);
    }

    public int R0() {
        return this.D.size();
    }

    public List S0() {
        return this.D;
    }

    public int T0() {
        return this.f13954e;
    }

    public int U0() {
        return this.f13955f;
    }

    public j V0(int i10) {
        return (j) this.A.get(i10);
    }

    public int W0() {
        return this.A.size();
    }

    public List X0() {
        return this.A;
    }

    public int Y0() {
        return this.G;
    }

    public r Z0() {
        return this.H;
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f13953d & 1) == 1) {
            fVar.Z(1, this.f13954e);
        }
        if (p1().size() > 0) {
            fVar.n0(18);
            fVar.n0(this.f13960t);
        }
        for (int i10 = 0; i10 < this.f13959s.size(); i10++) {
            fVar.a0(((Integer) this.f13959s.get(i10)).intValue());
        }
        if ((this.f13953d & 2) == 2) {
            fVar.Z(3, this.f13955f);
        }
        if ((this.f13953d & 4) == 4) {
            fVar.Z(4, this.f13956g);
        }
        for (int i11 = 0; i11 < this.f13957h.size(); i11++) {
            fVar.c0(5, (of.p) this.f13957h.get(i11));
        }
        for (int i12 = 0; i12 < this.f13958r.size(); i12++) {
            fVar.c0(6, (of.p) this.f13958r.get(i12));
        }
        if (i1().size() > 0) {
            fVar.n0(58);
            fVar.n0(this.f13962v);
        }
        for (int i13 = 0; i13 < this.f13961u.size(); i13++) {
            fVar.a0(((Integer) this.f13961u.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f13966z.size(); i14++) {
            fVar.c0(8, (of.p) this.f13966z.get(i14));
        }
        for (int i15 = 0; i15 < this.A.size(); i15++) {
            fVar.c0(9, (of.p) this.A.get(i15));
        }
        for (int i16 = 0; i16 < this.B.size(); i16++) {
            fVar.c0(10, (of.p) this.B.get(i16));
        }
        for (int i17 = 0; i17 < this.C.size(); i17++) {
            fVar.c0(11, (of.p) this.C.get(i17));
        }
        for (int i18 = 0; i18 < this.D.size(); i18++) {
            fVar.c0(13, (of.p) this.D.get(i18));
        }
        if (m1().size() > 0) {
            fVar.n0(130);
            fVar.n0(this.F);
        }
        for (int i19 = 0; i19 < this.E.size(); i19++) {
            fVar.a0(((Integer) this.E.get(i19)).intValue());
        }
        if ((this.f13953d & 8) == 8) {
            fVar.Z(17, this.G);
        }
        if ((this.f13953d & 16) == 16) {
            fVar.c0(18, this.H);
        }
        if ((this.f13953d & 32) == 32) {
            fVar.Z(19, this.I);
        }
        for (int i20 = 0; i20 < this.f13963w.size(); i20++) {
            fVar.c0(20, (of.p) this.f13963w.get(i20));
        }
        if (M0().size() > 0) {
            fVar.n0(170);
            fVar.n0(this.f13965y);
        }
        for (int i21 = 0; i21 < this.f13964x.size(); i21++) {
            fVar.a0(((Integer) this.f13964x.get(i21)).intValue());
        }
        if (c1().size() > 0) {
            fVar.n0(178);
            fVar.n0(this.K);
        }
        for (int i22 = 0; i22 < this.J.size(); i22++) {
            fVar.a0(((Integer) this.J.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.L.size(); i23++) {
            fVar.c0(23, (of.p) this.L.get(i23));
        }
        if (g1().size() > 0) {
            fVar.n0(194);
            fVar.n0(this.N);
        }
        for (int i24 = 0; i24 < this.M.size(); i24++) {
            fVar.a0(((Integer) this.M.get(i24)).intValue());
        }
        for (int i25 = 0; i25 < this.O.size(); i25++) {
            fVar.c0(25, (of.p) this.O.get(i25));
        }
        if ((this.f13953d & 64) == 64) {
            fVar.c0(30, this.P);
        }
        for (int i26 = 0; i26 < this.Q.size(); i26++) {
            fVar.Z(31, ((Integer) this.Q.get(i26)).intValue());
        }
        if ((this.f13953d & 128) == 128) {
            fVar.c0(32, this.R);
        }
        for (int i27 = 0; i27 < this.S.size(); i27++) {
            fVar.c0(33, (of.p) this.S.get(i27));
        }
        aVarT.a(19000, fVar);
        fVar.h0(this.f13952c);
    }

    public int a1() {
        return this.I;
    }

    public int b1() {
        return this.J.size();
    }

    public List c1() {
        return this.J;
    }

    public r d1(int i10) {
        return (r) this.L.get(i10);
    }

    public int e1() {
        return this.L.size();
    }

    public int f1() {
        return this.M.size();
    }

    public List g1() {
        return this.M;
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.U;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f13953d & 1) == 1 ? of.f.o(1, this.f13954e) : 0;
        int iP = 0;
        for (int i11 = 0; i11 < this.f13959s.size(); i11++) {
            iP += of.f.p(((Integer) this.f13959s.get(i11)).intValue());
        }
        int iR = iO + iP;
        if (!p1().isEmpty()) {
            iR = iR + 1 + of.f.p(iP);
        }
        this.f13960t = iP;
        if ((this.f13953d & 2) == 2) {
            iR += of.f.o(3, this.f13955f);
        }
        if ((this.f13953d & 4) == 4) {
            iR += of.f.o(4, this.f13956g);
        }
        for (int i12 = 0; i12 < this.f13957h.size(); i12++) {
            iR += of.f.r(5, (of.p) this.f13957h.get(i12));
        }
        for (int i13 = 0; i13 < this.f13958r.size(); i13++) {
            iR += of.f.r(6, (of.p) this.f13958r.get(i13));
        }
        int iP2 = 0;
        for (int i14 = 0; i14 < this.f13961u.size(); i14++) {
            iP2 += of.f.p(((Integer) this.f13961u.get(i14)).intValue());
        }
        int iR2 = iR + iP2;
        if (!i1().isEmpty()) {
            iR2 = iR2 + 1 + of.f.p(iP2);
        }
        this.f13962v = iP2;
        for (int i15 = 0; i15 < this.f13966z.size(); i15++) {
            iR2 += of.f.r(8, (of.p) this.f13966z.get(i15));
        }
        for (int i16 = 0; i16 < this.A.size(); i16++) {
            iR2 += of.f.r(9, (of.p) this.A.get(i16));
        }
        for (int i17 = 0; i17 < this.B.size(); i17++) {
            iR2 += of.f.r(10, (of.p) this.B.get(i17));
        }
        for (int i18 = 0; i18 < this.C.size(); i18++) {
            iR2 += of.f.r(11, (of.p) this.C.get(i18));
        }
        for (int i19 = 0; i19 < this.D.size(); i19++) {
            iR2 += of.f.r(13, (of.p) this.D.get(i19));
        }
        int iP3 = 0;
        for (int i20 = 0; i20 < this.E.size(); i20++) {
            iP3 += of.f.p(((Integer) this.E.get(i20)).intValue());
        }
        int iR3 = iR2 + iP3;
        if (!m1().isEmpty()) {
            iR3 = iR3 + 2 + of.f.p(iP3);
        }
        this.F = iP3;
        if ((this.f13953d & 8) == 8) {
            iR3 += of.f.o(17, this.G);
        }
        if ((this.f13953d & 16) == 16) {
            iR3 += of.f.r(18, this.H);
        }
        if ((this.f13953d & 32) == 32) {
            iR3 += of.f.o(19, this.I);
        }
        for (int i21 = 0; i21 < this.f13963w.size(); i21++) {
            iR3 += of.f.r(20, (of.p) this.f13963w.get(i21));
        }
        int iP4 = 0;
        for (int i22 = 0; i22 < this.f13964x.size(); i22++) {
            iP4 += of.f.p(((Integer) this.f13964x.get(i22)).intValue());
        }
        int iP5 = iR3 + iP4;
        if (!M0().isEmpty()) {
            iP5 = iP5 + 2 + of.f.p(iP4);
        }
        this.f13965y = iP4;
        int iP6 = 0;
        for (int i23 = 0; i23 < this.J.size(); i23++) {
            iP6 += of.f.p(((Integer) this.J.get(i23)).intValue());
        }
        int iR4 = iP5 + iP6;
        if (!c1().isEmpty()) {
            iR4 = iR4 + 2 + of.f.p(iP6);
        }
        this.K = iP6;
        for (int i24 = 0; i24 < this.L.size(); i24++) {
            iR4 += of.f.r(23, (of.p) this.L.get(i24));
        }
        int iP7 = 0;
        for (int i25 = 0; i25 < this.M.size(); i25++) {
            iP7 += of.f.p(((Integer) this.M.get(i25)).intValue());
        }
        int iR5 = iR4 + iP7;
        if (!g1().isEmpty()) {
            iR5 = iR5 + 2 + of.f.p(iP7);
        }
        this.N = iP7;
        for (int i26 = 0; i26 < this.O.size(); i26++) {
            iR5 += of.f.r(25, (of.p) this.O.get(i26));
        }
        if ((this.f13953d & 64) == 64) {
            iR5 += of.f.r(30, this.P);
        }
        int iP8 = 0;
        for (int i27 = 0; i27 < this.Q.size(); i27++) {
            iP8 += of.f.p(((Integer) this.Q.get(i27)).intValue());
        }
        int size = iR5 + iP8 + (y1().size() * 2);
        if ((this.f13953d & 128) == 128) {
            size += of.f.r(32, this.R);
        }
        for (int i28 = 0; i28 < this.S.size(); i28++) {
            size += of.f.r(33, (of.p) this.S.get(i28));
        }
        int iO2 = size + o() + this.f13952c.size();
        this.U = iO2;
        return iO2;
    }

    public List h1() {
        return this.L;
    }

    public List i1() {
        return this.f13961u;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.T;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!C1()) {
            this.T = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < v1(); i10++) {
            if (!u1(i10).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < o1(); i11++) {
            if (!n1(i11).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < L0(); i12++) {
            if (!K0(i12).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < I0(); i13++) {
            if (!H0(i13).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < W0(); i14++) {
            if (!V0(i14).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < k1(); i15++) {
            if (!j1(i15).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < s1(); i16++) {
            if (!r1(i16).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < R0(); i17++) {
            if (!Q0(i17).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        if (E1() && !Z0().isInitialized()) {
            this.T = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < e1(); i18++) {
            if (!d1(i18).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < C0(); i19++) {
            if (!B0(i19).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        if (G1() && !x1().isInitialized()) {
            this.T = (byte) 0;
            return false;
        }
        for (int i20 = 0; i20 < G0(); i20++) {
            if (!F0(i20).isInitialized()) {
                this.T = (byte) 0;
                return false;
            }
        }
        if (n()) {
            this.T = (byte) 1;
            return true;
        }
        this.T = (byte) 0;
        return false;
    }

    public o j1(int i10) {
        return (o) this.B.get(i10);
    }

    public int k1() {
        return this.B.size();
    }

    public List l1() {
        return this.B;
    }

    public List m1() {
        return this.E;
    }

    public r n1(int i10) {
        return (r) this.f13958r.get(i10);
    }

    public int o1() {
        return this.f13958r.size();
    }

    public List p1() {
        return this.f13959s;
    }

    public List q1() {
        return this.f13958r;
    }

    public s r1(int i10) {
        return (s) this.C.get(i10);
    }

    public int s1() {
        return this.C.size();
    }

    public List t1() {
        return this.C;
    }

    public t u1(int i10) {
        return (t) this.f13957h.get(i10);
    }

    public int v1() {
        return this.f13957h.size();
    }

    public List w1() {
        return this.f13957h;
    }

    public u x1() {
        return this.P;
    }

    public List y1() {
        return this.Q;
    }

    public x z1() {
        return this.R;
    }

    /* synthetic */ c(i.c cVar, gf.a aVar) {
        this(cVar);
    }

    private c(i.c cVar) {
        super(cVar);
        this.f13960t = -1;
        this.f13962v = -1;
        this.f13965y = -1;
        this.F = -1;
        this.K = -1;
        this.N = -1;
        this.T = (byte) -1;
        this.U = -1;
        this.f13952c = cVar.d();
    }

    private c(boolean z10) {
        this.f13960t = -1;
        this.f13962v = -1;
        this.f13965y = -1;
        this.F = -1;
        this.K = -1;
        this.N = -1;
        this.T = (byte) -1;
        this.U = -1;
        this.f13952c = of.d.f23423a;
    }

    public static final class b extends i.c implements of.q {
        private List A;
        private List B;
        private int C;
        private r D;
        private int E;
        private List F;
        private List G;
        private List H;
        private List I;
        private u J;
        private List K;
        private x L;
        private List M;

        /* JADX INFO: renamed from: d */
        private int f13967d;

        /* JADX INFO: renamed from: e */
        private int f13968e = 6;

        /* JADX INFO: renamed from: f */
        private int f13969f;

        /* JADX INFO: renamed from: g */
        private int f13970g;

        /* JADX INFO: renamed from: h */
        private List f13971h;

        /* JADX INFO: renamed from: r */
        private List f13972r;

        /* JADX INFO: renamed from: s */
        private List f13973s;

        /* JADX INFO: renamed from: t */
        private List f13974t;

        /* JADX INFO: renamed from: u */
        private List f13975u;

        /* JADX INFO: renamed from: v */
        private List f13976v;

        /* JADX INFO: renamed from: w */
        private List f13977w;

        /* JADX INFO: renamed from: x */
        private List f13978x;

        /* JADX INFO: renamed from: y */
        private List f13979y;

        /* JADX INFO: renamed from: z */
        private List f13980z;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f13971h = list;
            this.f13972r = list;
            this.f13973s = list;
            this.f13974t = list;
            this.f13975u = list;
            this.f13976v = list;
            this.f13977w = list;
            this.f13978x = list;
            this.f13979y = list;
            this.f13980z = list;
            this.A = list;
            this.B = list;
            this.D = r.e0();
            this.F = list;
            this.G = list;
            this.H = list;
            this.I = list;
            this.J = u.r();
            this.K = list;
            this.L = x.p();
            this.M = list;
            L();
        }

        private void A() {
            if ((this.f13967d & 262144) != 262144) {
                this.F = new ArrayList(this.F);
                this.f13967d |= 262144;
            }
        }

        private void B() {
            if ((this.f13967d & 1048576) != 1048576) {
                this.H = new ArrayList(this.H);
                this.f13967d |= 1048576;
            }
        }

        private void C() {
            if ((this.f13967d & 524288) != 524288) {
                this.G = new ArrayList(this.G);
                this.f13967d |= 524288;
            }
        }

        private void D() {
            if ((this.f13967d & 64) != 64) {
                this.f13974t = new ArrayList(this.f13974t);
                this.f13967d |= 64;
            }
        }

        private void E() {
            if ((this.f13967d & 2048) != 2048) {
                this.f13979y = new ArrayList(this.f13979y);
                this.f13967d |= 2048;
            }
        }

        private void F() {
            if ((this.f13967d & 16384) != 16384) {
                this.B = new ArrayList(this.B);
                this.f13967d |= 16384;
            }
        }

        private void G() {
            if ((this.f13967d & 32) != 32) {
                this.f13973s = new ArrayList(this.f13973s);
                this.f13967d |= 32;
            }
        }

        private void H() {
            if ((this.f13967d & 16) != 16) {
                this.f13972r = new ArrayList(this.f13972r);
                this.f13967d |= 16;
            }
        }

        private void I() {
            if ((this.f13967d & 4096) != 4096) {
                this.f13980z = new ArrayList(this.f13980z);
                this.f13967d |= 4096;
            }
        }

        private void J() {
            if ((this.f13967d & 8) != 8) {
                this.f13971h = new ArrayList(this.f13971h);
                this.f13967d |= 8;
            }
        }

        private void K() {
            if ((this.f13967d & 8388608) != 8388608) {
                this.K = new ArrayList(this.K);
                this.f13967d |= 8388608;
            }
        }

        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f13967d & 2097152) != 2097152) {
                this.I = new ArrayList(this.I);
                this.f13967d |= 2097152;
            }
        }

        private void u() {
            if ((this.f13967d & 33554432) != 33554432) {
                this.M = new ArrayList(this.M);
                this.f13967d |= 33554432;
            }
        }

        private void v() {
            if ((this.f13967d & WXMediaMessage.TITLE_LENGTH_LIMIT) != 512) {
                this.f13977w = new ArrayList(this.f13977w);
                this.f13967d |= WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
        }

        private void w() {
            if ((this.f13967d & 256) != 256) {
                this.f13976v = new ArrayList(this.f13976v);
                this.f13967d |= 256;
            }
        }

        private void x() {
            if ((this.f13967d & 128) != 128) {
                this.f13975u = new ArrayList(this.f13975u);
                this.f13967d |= 128;
            }
        }

        private void y() {
            if ((this.f13967d & 8192) != 8192) {
                this.A = new ArrayList(this.A);
                this.f13967d |= 8192;
            }
        }

        private void z() {
            if ((this.f13967d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 1024) {
                this.f13978x = new ArrayList(this.f13978x);
                this.f13967d |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
            }
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: M */
        public b f(c cVar) {
            if (cVar == c.O0()) {
                return this;
            }
            if (cVar.B1()) {
                T(cVar.T0());
            }
            if (cVar.C1()) {
                U(cVar.U0());
            }
            if (cVar.A1()) {
                R(cVar.E0());
            }
            if (!cVar.f13957h.isEmpty()) {
                if (this.f13971h.isEmpty()) {
                    this.f13971h = cVar.f13957h;
                    this.f13967d &= -9;
                } else {
                    J();
                    this.f13971h.addAll(cVar.f13957h);
                }
            }
            if (!cVar.f13958r.isEmpty()) {
                if (this.f13972r.isEmpty()) {
                    this.f13972r = cVar.f13958r;
                    this.f13967d &= -17;
                } else {
                    H();
                    this.f13972r.addAll(cVar.f13958r);
                }
            }
            if (!cVar.f13959s.isEmpty()) {
                if (this.f13973s.isEmpty()) {
                    this.f13973s = cVar.f13959s;
                    this.f13967d &= -33;
                } else {
                    G();
                    this.f13973s.addAll(cVar.f13959s);
                }
            }
            if (!cVar.f13961u.isEmpty()) {
                if (this.f13974t.isEmpty()) {
                    this.f13974t = cVar.f13961u;
                    this.f13967d &= -65;
                } else {
                    D();
                    this.f13974t.addAll(cVar.f13961u);
                }
            }
            if (!cVar.f13963w.isEmpty()) {
                if (this.f13975u.isEmpty()) {
                    this.f13975u = cVar.f13963w;
                    this.f13967d &= -129;
                } else {
                    x();
                    this.f13975u.addAll(cVar.f13963w);
                }
            }
            if (!cVar.f13964x.isEmpty()) {
                if (this.f13976v.isEmpty()) {
                    this.f13976v = cVar.f13964x;
                    this.f13967d &= -257;
                } else {
                    w();
                    this.f13976v.addAll(cVar.f13964x);
                }
            }
            if (!cVar.f13966z.isEmpty()) {
                if (this.f13977w.isEmpty()) {
                    this.f13977w = cVar.f13966z;
                    this.f13967d &= -513;
                } else {
                    v();
                    this.f13977w.addAll(cVar.f13966z);
                }
            }
            if (!cVar.A.isEmpty()) {
                if (this.f13978x.isEmpty()) {
                    this.f13978x = cVar.A;
                    this.f13967d &= -1025;
                } else {
                    z();
                    this.f13978x.addAll(cVar.A);
                }
            }
            if (!cVar.B.isEmpty()) {
                if (this.f13979y.isEmpty()) {
                    this.f13979y = cVar.B;
                    this.f13967d &= -2049;
                } else {
                    E();
                    this.f13979y.addAll(cVar.B);
                }
            }
            if (!cVar.C.isEmpty()) {
                if (this.f13980z.isEmpty()) {
                    this.f13980z = cVar.C;
                    this.f13967d &= -4097;
                } else {
                    I();
                    this.f13980z.addAll(cVar.C);
                }
            }
            if (!cVar.D.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = cVar.D;
                    this.f13967d &= -8193;
                } else {
                    y();
                    this.A.addAll(cVar.D);
                }
            }
            if (!cVar.E.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = cVar.E;
                    this.f13967d &= -16385;
                } else {
                    F();
                    this.B.addAll(cVar.E);
                }
            }
            if (cVar.D1()) {
                V(cVar.Y0());
            }
            if (cVar.E1()) {
                O(cVar.Z0());
            }
            if (cVar.F1()) {
                W(cVar.a1());
            }
            if (!cVar.J.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = cVar.J;
                    this.f13967d &= -262145;
                } else {
                    A();
                    this.F.addAll(cVar.J);
                }
            }
            if (!cVar.L.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = cVar.L;
                    this.f13967d &= -524289;
                } else {
                    C();
                    this.G.addAll(cVar.L);
                }
            }
            if (!cVar.M.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = cVar.M;
                    this.f13967d &= -1048577;
                } else {
                    B();
                    this.H.addAll(cVar.M);
                }
            }
            if (!cVar.O.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = cVar.O;
                    this.f13967d &= -2097153;
                } else {
                    t();
                    this.I.addAll(cVar.O);
                }
            }
            if (cVar.G1()) {
                P(cVar.x1());
            }
            if (!cVar.Q.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = cVar.Q;
                    this.f13967d &= -8388609;
                } else {
                    K();
                    this.K.addAll(cVar.Q);
                }
            }
            if (cVar.H1()) {
                Q(cVar.z1());
            }
            if (!cVar.S.isEmpty()) {
                if (this.M.isEmpty()) {
                    this.M = cVar.S;
                    this.f13967d &= -33554433;
                } else {
                    u();
                    this.M.addAll(cVar.S);
                }
            }
            k(cVar);
            g(d().c(cVar.f13952c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.c.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.c.W     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.c r3 = (gf.c) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
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
                gf.c r4 = (gf.c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: gf.c.b.S(of.e, of.g):gf.c$b");
        }

        public b O(r rVar) {
            if ((this.f13967d & WXMediaMessage.THUMB_LENGTH_LIMIT) != 65536 || this.D == r.e0()) {
                this.D = rVar;
            } else {
                this.D = r.F0(this.D).f(rVar).o();
            }
            this.f13967d |= WXMediaMessage.THUMB_LENGTH_LIMIT;
            return this;
        }

        public b P(u uVar) {
            if ((this.f13967d & 4194304) != 4194304 || this.J == u.r()) {
                this.J = uVar;
            } else {
                this.J = u.C(this.J).f(uVar).j();
            }
            this.f13967d |= 4194304;
            return this;
        }

        public b Q(x xVar) {
            if ((this.f13967d & 16777216) != 16777216 || this.L == x.p()) {
                this.L = xVar;
            } else {
                this.L = x.v(this.L).f(xVar).j();
            }
            this.f13967d |= 16777216;
            return this;
        }

        public b R(int i10) {
            this.f13967d |= 4;
            this.f13970g = i10;
            return this;
        }

        public b T(int i10) {
            this.f13967d |= 1;
            this.f13968e = i10;
            return this;
        }

        public b U(int i10) {
            this.f13967d |= 2;
            this.f13969f = i10;
            return this;
        }

        public b V(int i10) {
            this.f13967d |= 32768;
            this.C = i10;
            return this;
        }

        public b W(int i10) {
            this.f13967d |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
            this.E = i10;
            return this;
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n */
        public c build() {
            c cVarO = o();
            if (cVarO.isInitialized()) {
                return cVarO;
            }
            throw a.AbstractC0317a.b(cVarO);
        }

        public c o() {
            c cVar = new c(this);
            int i10 = this.f13967d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            cVar.f13954e = this.f13968e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            cVar.f13955f = this.f13969f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            cVar.f13956g = this.f13970g;
            if ((this.f13967d & 8) == 8) {
                this.f13971h = DesugarCollections.unmodifiableList(this.f13971h);
                this.f13967d &= -9;
            }
            cVar.f13957h = this.f13971h;
            if ((this.f13967d & 16) == 16) {
                this.f13972r = DesugarCollections.unmodifiableList(this.f13972r);
                this.f13967d &= -17;
            }
            cVar.f13958r = this.f13972r;
            if ((this.f13967d & 32) == 32) {
                this.f13973s = DesugarCollections.unmodifiableList(this.f13973s);
                this.f13967d &= -33;
            }
            cVar.f13959s = this.f13973s;
            if ((this.f13967d & 64) == 64) {
                this.f13974t = DesugarCollections.unmodifiableList(this.f13974t);
                this.f13967d &= -65;
            }
            cVar.f13961u = this.f13974t;
            if ((this.f13967d & 128) == 128) {
                this.f13975u = DesugarCollections.unmodifiableList(this.f13975u);
                this.f13967d &= -129;
            }
            cVar.f13963w = this.f13975u;
            if ((this.f13967d & 256) == 256) {
                this.f13976v = DesugarCollections.unmodifiableList(this.f13976v);
                this.f13967d &= -257;
            }
            cVar.f13964x = this.f13976v;
            if ((this.f13967d & WXMediaMessage.TITLE_LENGTH_LIMIT) == 512) {
                this.f13977w = DesugarCollections.unmodifiableList(this.f13977w);
                this.f13967d &= -513;
            }
            cVar.f13966z = this.f13977w;
            if ((this.f13967d & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 1024) {
                this.f13978x = DesugarCollections.unmodifiableList(this.f13978x);
                this.f13967d &= -1025;
            }
            cVar.A = this.f13978x;
            if ((this.f13967d & 2048) == 2048) {
                this.f13979y = DesugarCollections.unmodifiableList(this.f13979y);
                this.f13967d &= -2049;
            }
            cVar.B = this.f13979y;
            if ((this.f13967d & 4096) == 4096) {
                this.f13980z = DesugarCollections.unmodifiableList(this.f13980z);
                this.f13967d &= -4097;
            }
            cVar.C = this.f13980z;
            if ((this.f13967d & 8192) == 8192) {
                this.A = DesugarCollections.unmodifiableList(this.A);
                this.f13967d &= -8193;
            }
            cVar.D = this.A;
            if ((this.f13967d & 16384) == 16384) {
                this.B = DesugarCollections.unmodifiableList(this.B);
                this.f13967d &= -16385;
            }
            cVar.E = this.B;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            cVar.G = this.C;
            if ((i10 & WXMediaMessage.THUMB_LENGTH_LIMIT) == 65536) {
                i11 |= 16;
            }
            cVar.H = this.D;
            if ((i10 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 131072) {
                i11 |= 32;
            }
            cVar.I = this.E;
            if ((this.f13967d & 262144) == 262144) {
                this.F = DesugarCollections.unmodifiableList(this.F);
                this.f13967d &= -262145;
            }
            cVar.J = this.F;
            if ((this.f13967d & 524288) == 524288) {
                this.G = DesugarCollections.unmodifiableList(this.G);
                this.f13967d &= -524289;
            }
            cVar.L = this.G;
            if ((this.f13967d & 1048576) == 1048576) {
                this.H = DesugarCollections.unmodifiableList(this.H);
                this.f13967d &= -1048577;
            }
            cVar.M = this.H;
            if ((this.f13967d & 2097152) == 2097152) {
                this.I = DesugarCollections.unmodifiableList(this.I);
                this.f13967d &= -2097153;
            }
            cVar.O = this.I;
            if ((4194304 & i10) == 4194304) {
                i11 |= 64;
            }
            cVar.P = this.J;
            if ((this.f13967d & 8388608) == 8388608) {
                this.K = DesugarCollections.unmodifiableList(this.K);
                this.f13967d &= -8388609;
            }
            cVar.Q = this.K;
            if ((i10 & 16777216) == 16777216) {
                i11 |= 128;
            }
            cVar.R = this.L;
            if ((this.f13967d & 33554432) == 33554432) {
                this.M = DesugarCollections.unmodifiableList(this.M);
                this.f13967d &= -33554433;
            }
            cVar.S = this.M;
            cVar.f13953d = i11;
            return cVar;
        }

        /* JADX INFO: renamed from: p */
        public b clone() {
            return r().f(o());
        }

        private void L() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c(of.e r23, of.g r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.c.<init>(of.e, of.g):void");
    }
}
