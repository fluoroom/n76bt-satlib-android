package v4;

import java.nio.charset.Charset;
import java.security.InvalidParameterException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    private static final int D;
    private static final int E;
    private static final int F;

    /* JADX INFO: renamed from: a */
    private int f30040a;

    /* JADX INFO: renamed from: b */
    private int f30041b;

    /* JADX INFO: renamed from: c */
    private boolean f30042c;

    /* JADX INFO: renamed from: d */
    private boolean f30043d;

    /* JADX INFO: renamed from: e */
    private boolean f30044e;

    /* JADX INFO: renamed from: f */
    private boolean f30045f;

    /* JADX INFO: renamed from: g */
    private boolean f30046g;

    /* JADX INFO: renamed from: h */
    private boolean f30047h;

    /* JADX INFO: renamed from: i */
    private boolean f30048i;

    /* JADX INFO: renamed from: j */
    private int f30049j;

    /* JADX INFO: renamed from: k */
    private boolean f30050k;

    /* JADX INFO: renamed from: l */
    private boolean f30051l;

    /* JADX INFO: renamed from: m */
    private int f30052m;

    /* JADX INFO: renamed from: n */
    private int f30053n;

    /* JADX INFO: renamed from: o */
    private int f30054o;

    /* JADX INFO: renamed from: q */
    private long f30056q;

    /* JADX INFO: renamed from: r */
    private boolean f30057r;

    /* JADX INFO: renamed from: s */
    private boolean f30058s;

    /* JADX INFO: renamed from: u */
    private int f30060u;

    /* JADX INFO: renamed from: v */
    private final byte[] f30061v;

    /* JADX INFO: renamed from: w */
    private final byte[] f30062w;

    /* JADX INFO: renamed from: x */
    private final byte[] f30063x;

    /* JADX INFO: renamed from: y */
    private String f30064y;

    /* JADX INFO: renamed from: z */
    public static final a f30039z = new a(null);
    private static final int A = 12;
    private static final int B = 18;
    private static int C = 6;

    /* JADX INFO: renamed from: p */
    private int f30055p = 30;

    /* JADX INFO: renamed from: t */
    private String f30059t = "/$";

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final int a() {
            return q.D;
        }

        public final int b() {
            return q.E;
        }

        public final int c() {
            return q.B;
        }

        public final int d() {
            return q.A;
        }

        private a() {
        }
    }

    static {
        int i10 = 12 + 8;
        D = i10 + 26;
        E = i10 + 30;
        F = i10 + 32;
    }

    public q() {
        int i10 = A;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = 0;
        }
        this.f30061v = bArr;
        int i12 = B;
        byte[] bArr2 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr2[i13] = 0;
        }
        this.f30062w = bArr2;
        int i14 = C;
        byte[] bArr3 = new byte[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            bArr3[i15] = 0;
        }
        this.f30063x = bArr3;
    }

    private final Charset m() {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        try {
            charsetDefaultCharset = Charset.forName("utf-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        rd.m.b(charsetDefaultCharset);
        return charsetDefaultCharset;
    }

    public final boolean A() {
        return this.f30057r;
    }

    public final boolean B() {
        return this.f30048i;
    }

    public final int C() {
        return this.f30049j;
    }

    public final int D() {
        return this.f30060u;
    }

    public final long E() {
        return this.f30056q;
    }

    public final void F(boolean z10) {
        this.f30058s = z10;
    }

    public final void G(String str) {
        rd.m.e(str, "value");
        if (str.length() != 2) {
            throw new InvalidParameterException("len mast 2");
        }
        if (o5.a.b().c(str) == null) {
            str = "/$";
        }
        this.f30059t = str;
    }

    public final void H(boolean z10) {
        this.f30046g = z10;
    }

    public final void I(String str) {
        rd.m.e(str, "value");
        String string = rg.q.W0(str).toString();
        int length = this.f30063x.length;
        if (length > string.length()) {
            length = string.length();
        }
        for (int i10 = 0; i10 < length; i10++) {
            this.f30063x[i10] = (byte) string.charAt(i10);
        }
        int length2 = this.f30063x.length;
        while (length < length2) {
            this.f30063x[length] = 0;
            length++;
        }
        this.f30064y = null;
    }

    public final void J(byte[] bArr) {
        rd.m.e(bArr, "value");
        int length = bArr.length;
        int i10 = D;
        if (length != i10) {
            int length2 = bArr.length;
            int i11 = E;
            if (length2 != i11 && bArr.length < i11) {
                throw new InvalidParameterException("长度应该是:" + i10 + ",输入:" + bArr.length);
            }
        }
        a6.v vVar = new a6.v(bArr);
        this.f30040a = vVar.i(4);
        this.f30041b = vVar.i(4);
        this.f30042c = vVar.c();
        this.f30043d = vVar.c();
        this.f30044e = vVar.c();
        this.f30046g = vVar.c();
        this.f30047h = vVar.c();
        this.f30057r = vVar.c();
        this.f30058s = vVar.c();
        this.f30045f = vVar.c();
        this.f30060u = vVar.i(4);
        this.f30048i = vVar.c();
        this.f30050k = vVar.c();
        this.f30051l = vVar.c();
        this.f30052m = vVar.i(1);
        this.f30055p = vVar.i(8);
        this.f30056q = vVar.k(32);
        int length3 = this.f30061v.length;
        for (int i12 = 0; i12 < length3; i12++) {
            this.f30061v[i12] = vVar.d();
        }
        int length4 = this.f30062w.length;
        for (int i13 = 0; i13 < length4; i13++) {
            this.f30062w[i13] = vVar.d();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) vVar.i(8));
        sb2.append((char) vVar.i(8));
        G(sb2.toString());
        int length5 = this.f30063x.length;
        for (int i14 = 0; i14 < length5; i14++) {
            this.f30063x[i14] = vVar.d();
        }
        this.f30064y = null;
        try {
            this.f30056q = (vVar.k(32) << 32) | (this.f30056q & 4294967295L);
            this.f30053n = vVar.i(4);
            this.f30049j = vVar.i(5);
            this.f30054o = vVar.i(7);
        } catch (InvalidParameterException unused) {
        }
    }

    public final void K(boolean z10) {
        this.f30050k = z10;
    }

    public final void L(int i10) {
        this.f30041b = i10;
    }

    public final void M(boolean z10) {
        this.f30043d = z10;
    }

    public final void N(boolean z10) {
        this.f30042c = z10;
    }

    public final void O(boolean z10) {
        this.f30044e = z10;
    }

    public final void P(int i10) {
        this.f30055p = i10 < 0 ? 0 : i10 > 2550000 ? 255 : i10 / 10000;
    }

    public final void Q(String str) {
        byte[] bytes;
        rd.m.e(str, "value");
        String string = rg.q.W0(str).toString();
        int length = string.length();
        byte[] bArr = this.f30062w;
        if (length > bArr.length) {
            string = string.substring(0, bArr.length);
            rd.m.d(string, "substring(...)");
        }
        do {
            bytes = string.getBytes(m());
            rd.m.d(bytes, "getBytes(...)");
            if (bytes.length <= this.f30062w.length) {
                break;
            }
            string = string.substring(0, string.length() - 1);
            rd.m.d(string, "substring(...)");
        } while (string.length() > 0);
        int length2 = this.f30062w.length;
        if (length2 > bytes.length) {
            length2 = bytes.length;
        }
        for (int i10 = 0; i10 < length2; i10++) {
            this.f30062w[i10] = bytes[i10];
        }
        int length3 = this.f30062w.length;
        while (length2 < length3) {
            this.f30062w[length2] = 0;
            length2++;
        }
    }

    public final void R(int i10) {
        this.f30053n = i10;
    }

    public final void S(String str) {
        byte[] bytes;
        rd.m.e(str, "value");
        String string = rg.q.W0(str).toString();
        int length = string.length();
        byte[] bArr = this.f30061v;
        if (length > bArr.length) {
            string = string.substring(0, bArr.length);
            rd.m.d(string, "substring(...)");
        }
        do {
            bytes = string.getBytes(m());
            rd.m.d(bytes, "getBytes(...)");
            if (bytes.length <= this.f30061v.length) {
                break;
            }
            string = string.substring(0, string.length() - 1);
            rd.m.d(string, "substring(...)");
        } while (string.length() > 0);
        int length2 = this.f30061v.length;
        if (length2 > bytes.length) {
            length2 = bytes.length;
        }
        for (int i10 = 0; i10 < length2; i10++) {
            this.f30061v[i10] = bytes[i10];
        }
        int length3 = this.f30061v.length;
        while (length2 < length3) {
            this.f30061v[length2] = 0;
            length2++;
        }
    }

    public final void T(boolean z10) {
        this.f30051l = z10;
    }

    public final void U(int i10) {
        this.f30040a = i10;
    }

    public final void V(boolean z10) {
        this.f30047h = z10;
    }

    public final void W(boolean z10) {
        this.f30057r = z10;
    }

    public final void X(boolean z10) {
        this.f30048i = z10;
    }

    public final void Y(int i10) {
        this.f30049j = i10;
    }

    public final void Z(int i10) {
        this.f30060u = i10;
    }

    public final void a0(long j10) {
        this.f30056q = j10;
    }

    public final q e(q qVar) {
        rd.m.e(qVar, "src");
        this.f30052m = qVar.f30052m;
        this.f30054o = qVar.f30054o;
        return this;
    }

    public final q f(q qVar) {
        rd.m.e(qVar, "src");
        this.f30050k = qVar.f30050k;
        this.f30053n = qVar.v();
        boolean z10 = qVar.f30051l;
        this.f30051l = z10;
        if (z10) {
            this.f30042c = true;
        }
        this.f30049j = qVar.f30049j;
        return this;
    }

    public final q g() {
        q qVar = new q();
        qVar.J(n());
        return qVar;
    }

    public final boolean h() {
        return this.f30058s;
    }

    public final String i() {
        return this.f30059t;
    }

    public final boolean j() {
        return this.f30046g;
    }

    public final String k() {
        String str = this.f30064y;
        if (str != null) {
            return str;
        }
        xd.c cVarI = xd.d.i(0, this.f30063x.length);
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVarI) {
            if (this.f30063x[((Number) obj).intValue()] == 0) {
                break;
            }
            arrayList.add(obj);
        }
        String string = rg.q.W0(new String(this.f30063x, 0, arrayList.size(), rg.d.f26007b)).toString();
        this.f30064y = string;
        return string;
    }

    public final String l() {
        if (a6.w.b(k())) {
            return "";
        }
        if (this.f30060u == 0) {
            return k();
        }
        return k() + '-' + this.f30060u;
    }

    public final byte[] n() {
        byte[] bArr = new byte[F];
        a6.v vVar = new a6.v(bArr);
        vVar.n(this.f30040a, 4).n(this.f30041b, 4).p(this.f30042c).p(this.f30043d).p(this.f30044e).p(this.f30046g).p(this.f30047h).p(this.f30057r).p(this.f30058s).p(this.f30045f).n(this.f30060u, 4).p(this.f30048i).p(this.f30050k).p(this.f30051l).n(this.f30052m, 1).n(this.f30055p, 8).o(this.f30056q, 32);
        for (byte b10 : this.f30061v) {
            vVar.n(b10, 8);
        }
        for (byte b11 : this.f30062w) {
            vVar.n(b11, 8);
        }
        vVar.n(this.f30059t.charAt(0), 8);
        vVar.n(this.f30059t.charAt(1), 8);
        for (byte b12 : this.f30063x) {
            vVar.n(b12, 8);
        }
        vVar.o(this.f30056q >> 32, 32).n(v(), 4).n(this.f30049j, 5).n(this.f30054o, 7);
        return bArr;
    }

    public final boolean o() {
        return this.f30050k;
    }

    public final int p() {
        return this.f30041b;
    }

    public final boolean q() {
        return this.f30043d;
    }

    public final boolean r() {
        return this.f30042c;
    }

    public final boolean s() {
        return this.f30044e;
    }

    public final int t() {
        return this.f30055p * 10000;
    }

    public final String u() {
        xd.c cVarI = xd.d.i(0, this.f30062w.length);
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVarI) {
            if (this.f30062w[((Number) obj).intValue()] == 0) {
                break;
            }
            arrayList.add(obj);
        }
        return rg.q.W0(new String(this.f30062w, 0, arrayList.size(), m())).toString();
    }

    public final int v() {
        int i10 = this.f30053n;
        if (i10 == 15) {
            return 7;
        }
        return i10;
    }

    public final String w() {
        xd.c cVarI = xd.d.i(0, this.f30061v.length);
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVarI) {
            if (this.f30061v[((Number) obj).intValue()] == 0) {
                break;
            }
            arrayList.add(obj);
        }
        return rg.q.W0(new String(this.f30061v, 0, arrayList.size(), m())).toString();
    }

    public final boolean x() {
        return this.f30051l;
    }

    public final int y() {
        return this.f30040a;
    }

    public final boolean z() {
        return this.f30047h;
    }
}
