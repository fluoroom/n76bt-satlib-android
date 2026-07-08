package f6;

import e6.j;
import e6.m;
import e6.r;
import e6.s;
import i6.e;
import i6.f;
import java.math.BigDecimal;
import java.math.BigInteger;
import o6.i;
import o6.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected static final i f12816b0 = j.f11531b;
    protected int A;
    protected int B;
    protected long C;
    protected int D;
    protected int E;
    protected long F;
    protected int G;
    protected int H;
    protected l6.c I;
    protected m J;
    protected final p K;
    protected char[] L;
    protected boolean M;
    protected o6.c N;
    protected byte[] O;
    protected int P;
    protected int Q;
    protected long R;
    protected float S;
    protected double T;
    protected BigInteger U;
    protected BigDecimal V;
    protected String W;
    protected boolean X;
    protected int Y;
    protected int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected int f12817a0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final f f12818x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final r f12819y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f12820z;

    protected c(f fVar, int i10) {
        super(i10);
        this.D = 1;
        this.G = 1;
        this.P = 0;
        this.f12818x = fVar;
        r rVarP = fVar.p();
        this.f12819y = rVarP == null ? r.a() : rVarP;
        this.K = fVar.i();
        this.I = l6.c.q(j.a.STRICT_DUPLICATE_DETECTION.e(i10) ? l6.a.f(this) : null);
    }

    private void b2(int i10) {
        if (i10 == 16) {
            this.V = null;
            this.W = this.K.k();
            this.P = 16;
        } else if (i10 == 32) {
            this.S = 0.0f;
            this.W = this.K.k();
            this.P = 32;
        } else {
            this.T = 0.0d;
            this.W = this.K.k();
            this.P = 8;
        }
    }

    private void c2(int i10) throws g6.a {
        String strK = this.K.k();
        if (i10 == 1 || i10 == 2) {
            f2(i10, strK);
        }
        if (i10 == 8 || i10 == 32) {
            this.W = strK;
            this.P = 8;
        } else {
            this.U = null;
            this.W = strK;
            this.P = 4;
        }
    }

    protected void L1(int i10, int i11) {
        int iF = j.a.STRICT_DUPLICATE_DETECTION.f();
        if ((i11 & iF) == 0 || (i10 & iF) == 0) {
            return;
        }
        if (this.I.s() == null) {
            this.I = this.I.x(l6.a.f(this));
        } else {
            this.I = this.I.x(null);
        }
    }

    @Override // e6.j
    public boolean M0() {
        m mVar = this.f12831c;
        if (mVar == m.VALUE_STRING) {
            return true;
        }
        if (mVar == m.FIELD_NAME) {
            return this.M;
        }
        return false;
    }

    protected abstract void M1();

    protected e N1() {
        return j.a.INCLUDE_SOURCE_IN_LOCATION.e(this.f11532a) ? this.f12818x.j() : e.r();
    }

    protected BigInteger O1(BigDecimal bigDecimal) throws g6.b {
        this.f12819y.b(bigDecimal.scale());
        return bigDecimal.toBigInteger();
    }

    protected final int P1(e6.a aVar, char c10, int i10) {
        if (c10 != '\\') {
            throw s2(aVar, c10, i10);
        }
        char cQ1 = Q1();
        if (cQ1 <= ' ' && i10 == 0) {
            return -1;
        }
        int iG = aVar.g(cQ1);
        if (iG >= 0 || (iG == -2 && i10 >= 2)) {
            return iG;
        }
        throw s2(aVar, cQ1, i10);
    }

    protected abstract char Q1();

    protected final int R1() {
        k1();
        return -1;
    }

    @Override // f6.d, e6.j
    public String S() {
        l6.c cVarF;
        m mVar = this.f12831c;
        return ((mVar == m.START_OBJECT || mVar == m.START_ARRAY) && (cVarF = this.I.f()) != null) ? cVarF.b() : this.I.b();
    }

    protected BigDecimal S1() throws e6.i {
        BigDecimal bigDecimal = this.V;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this.W;
        if (str == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        try {
            this.V = i6.i.e(str, Q0(s.USE_FAST_BIG_NUMBER_PARSER));
        } catch (NumberFormatException e10) {
            A1("Malformed numeric value (" + n1(this.W) + ")", e10);
        }
        this.W = null;
        return this.V;
    }

    protected BigInteger T1() throws e6.i {
        BigInteger bigInteger = this.U;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this.W;
        if (str == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        try {
            this.U = i6.i.g(str, Q0(s.USE_FAST_BIG_NUMBER_PARSER));
        } catch (NumberFormatException e10) {
            A1("Malformed numeric value (" + n1(this.W) + ")", e10);
        }
        this.W = null;
        return this.U;
    }

    @Override // e6.j
    public boolean U0() {
        if (this.f12831c != m.VALUE_NUMBER_FLOAT || (this.P & 8) == 0) {
            return false;
        }
        return !b.a(V1());
    }

    public o6.c U1() {
        o6.c cVar = this.N;
        if (cVar == null) {
            this.N = new o6.c();
        } else {
            cVar.reset();
        }
        return this.N;
    }

    protected double V1() throws e6.i {
        String str = this.W;
        if (str != null) {
            try {
                this.T = i6.i.i(str, Q0(s.USE_FAST_DOUBLE_PARSER));
            } catch (NumberFormatException e10) {
                A1("Malformed numeric value (" + n1(this.W) + ")", e10);
            }
            this.W = null;
        }
        return this.T;
    }

    @Override // e6.j
    public BigDecimal W() throws e6.i, g6.a {
        int i10 = this.P;
        if ((i10 & 16) == 0) {
            if (i10 == 0) {
                a2(16);
            }
            if ((this.P & 16) == 0) {
                j2();
            }
        }
        return S1();
    }

    protected float W1() throws e6.i {
        String str = this.W;
        if (str != null) {
            try {
                this.S = i6.i.j(str, Q0(s.USE_FAST_DOUBLE_PARSER));
            } catch (NumberFormatException e10) {
                A1("Malformed numeric value (" + n1(this.W) + ")", e10);
            }
            this.W = null;
        }
        return this.S;
    }

    @Override // e6.j
    public double X() throws e6.i, g6.a {
        int i10 = this.P;
        if ((i10 & 8) == 0) {
            if (i10 == 0) {
                a2(8);
            }
            if ((this.P & 8) == 0) {
                l2();
            }
        }
        return V1();
    }

    protected void X1(e6.a aVar) {
        o1(aVar.r());
    }

    protected char Y1(char c10) {
        if (P0(j.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || (c10 == '\'' && P0(j.a.ALLOW_SINGLE_QUOTES))) {
            return c10;
        }
        o1("Unrecognized character escape " + d.j1(c10));
        return c10;
    }

    @Override // e6.j
    public j Z0(int i10, int i11) {
        int i12 = this.f11532a;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.f11532a = i13;
            L1(i13, i14);
        }
        return this;
    }

    protected int Z1() throws e6.i, g6.a {
        if (this.f12820z) {
            o1("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.f12831c != m.VALUE_NUMBER_INT || this.Y > 9) {
            a2(1);
            if ((this.P & 1) == 0) {
                n2();
            }
            return this.Q;
        }
        int i10 = this.K.i(this.X);
        this.Q = i10;
        this.P = 1;
        return i10;
    }

    protected void a2(int i10) throws e6.i, g6.a {
        if (this.f12820z) {
            o1("Internal error: _parseNumericValue called when parser instance closed");
        }
        m mVar = this.f12831c;
        if (mVar != m.VALUE_NUMBER_INT) {
            if (mVar == m.VALUE_NUMBER_FLOAT) {
                b2(i10);
                return;
            } else {
                p1("Current token (%s) not numeric, can not use numeric value accessors", mVar);
                return;
            }
        }
        int i11 = this.Y;
        if (i11 <= 9) {
            this.Q = this.K.i(this.X);
            this.P = 1;
            return;
        }
        if (i11 > 18) {
            if (i11 == 19) {
                char[] cArrR = this.K.r();
                int iS = this.K.s();
                boolean z10 = this.X;
                if (z10) {
                    iS++;
                }
                if (i6.i.b(cArrR, iS, i11, z10)) {
                    this.R = i6.i.o(cArrR, iS, this.X);
                    this.P = 2;
                    return;
                }
            }
            c2(i10);
            return;
        }
        long j10 = this.K.j(this.X);
        if (i11 == 10) {
            if (this.X) {
                if (j10 >= -2147483648L) {
                    this.Q = (int) j10;
                    this.P = 1;
                    return;
                }
            } else if (j10 <= 2147483647L) {
                this.Q = (int) j10;
                this.P = 1;
                return;
            }
        }
        this.R = j10;
        this.P = 2;
    }

    @Override // e6.j
    public void c1(Object obj) {
        this.I.k(obj);
    }

    @Override // e6.j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12820z) {
            return;
        }
        this.A = Math.max(this.A, this.B);
        this.f12820z = true;
        try {
            M1();
        } finally {
            d2();
        }
    }

    @Override // e6.j
    public j d1(int i10) {
        int i11 = this.f11532a ^ i10;
        if (i11 != 0) {
            this.f11532a = i10;
            L1(i10, i11);
        }
        return this;
    }

    protected void d2() {
        this.K.t();
        char[] cArr = this.L;
        if (cArr != null) {
            this.L = null;
            this.f12818x.n(cArr);
        }
    }

    protected void e2(int i10, char c10) {
        l6.c cVarZ0 = z0();
        o1(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i10), Character.valueOf(c10), cVarZ0.l(), cVarZ0.w(N1())));
    }

    protected void f2(int i10, String str) throws g6.a {
        if (i10 == 1) {
            G1(str);
        } else {
            J1(str);
        }
    }

    @Override // e6.j
    public r g1() {
        return this.f12819y;
    }

    protected void g2(int i10, String str) {
        if (!P0(j.a.ALLOW_UNQUOTED_CONTROL_CHARS) || i10 > 32) {
            o1("Illegal unquoted character (" + d.j1((char) i10) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    protected String h2() {
        return i2();
    }

    protected String i2() {
        return P0(j.a.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    protected void j2() {
        int i10 = this.P;
        if ((i10 & 8) != 0) {
            String strC0 = this.W;
            if (strC0 == null) {
                strC0 = C0();
            }
            this.V = i6.i.e(strC0, Q0(s.USE_FAST_BIG_NUMBER_PARSER));
        } else if ((i10 & 4) != 0) {
            this.V = new BigDecimal(T1());
        } else if ((i10 & 2) != 0) {
            this.V = BigDecimal.valueOf(this.R);
        } else if ((i10 & 1) != 0) {
            this.V = BigDecimal.valueOf(this.Q);
        } else {
            y1();
        }
        this.P |= 16;
    }

    @Override // f6.d
    protected void k1() {
        if (this.I.j()) {
            return;
        }
        t1(String.format(": expected close marker for %s (start marker at %s)", this.I.h() ? "Array" : "Object", this.I.w(N1())), null);
    }

    protected void k2() {
        int i10 = this.P;
        if ((i10 & 16) != 0) {
            this.U = O1(S1());
        } else if ((i10 & 2) != 0) {
            this.U = BigInteger.valueOf(this.R);
        } else if ((i10 & 1) != 0) {
            this.U = BigInteger.valueOf(this.Q);
        } else if ((i10 & 8) == 0) {
            y1();
        } else if (this.W != null) {
            this.U = O1(S1());
        } else {
            this.U = O1(BigDecimal.valueOf(V1()));
        }
        this.P |= 4;
    }

    protected void l2() {
        int i10 = this.P;
        if ((i10 & 16) != 0) {
            if (this.W != null) {
                this.T = V1();
            } else {
                this.T = S1().doubleValue();
            }
        } else if ((i10 & 4) != 0) {
            if (this.W != null) {
                this.T = V1();
            } else {
                this.T = T1().doubleValue();
            }
        } else if ((i10 & 2) != 0) {
            this.T = this.R;
        } else if ((i10 & 1) != 0) {
            this.T = this.Q;
        } else if ((i10 & 32) == 0) {
            y1();
        } else if (this.W != null) {
            this.T = V1();
        } else {
            this.T = W1();
        }
        this.P |= 8;
    }

    protected void m2() {
        int i10 = this.P;
        if ((i10 & 16) != 0) {
            if (this.W != null) {
                this.S = W1();
            } else {
                this.S = S1().floatValue();
            }
        } else if ((i10 & 4) != 0) {
            if (this.W != null) {
                this.S = W1();
            } else {
                this.S = T1().floatValue();
            }
        } else if ((i10 & 2) != 0) {
            this.S = this.R;
        } else if ((i10 & 1) != 0) {
            this.S = this.Q;
        } else if ((i10 & 8) == 0) {
            y1();
        } else if (this.W != null) {
            this.S = W1();
        } else {
            this.S = (float) V1();
        }
        this.P |= 32;
    }

    protected void n2() throws e6.i, g6.a {
        int i10 = this.P;
        if ((i10 & 2) != 0) {
            long j10 = this.R;
            int i11 = (int) j10;
            if (i11 != j10) {
                H1(C0(), n());
            }
            this.Q = i11;
        } else if ((i10 & 4) != 0) {
            BigInteger bigIntegerT1 = T1();
            if (d.f12823g.compareTo(bigIntegerT1) > 0 || d.f12824h.compareTo(bigIntegerT1) < 0) {
                F1();
            }
            this.Q = bigIntegerT1.intValue();
        } else if ((i10 & 8) != 0) {
            double dV1 = V1();
            if (dV1 < -2.147483648E9d || dV1 > 2.147483647E9d) {
                F1();
            }
            this.Q = (int) dV1;
        } else if ((i10 & 16) != 0) {
            BigDecimal bigDecimalS1 = S1();
            if (d.f12829v.compareTo(bigDecimalS1) > 0 || d.f12830w.compareTo(bigDecimalS1) < 0) {
                F1();
            }
            this.Q = bigDecimalS1.intValue();
        } else {
            y1();
        }
        this.P |= 1;
    }

    protected void o2() throws e6.i {
        int i10 = this.P;
        if ((i10 & 1) != 0) {
            this.R = this.Q;
        } else if ((i10 & 4) != 0) {
            BigInteger bigIntegerT1 = T1();
            if (d.f12825r.compareTo(bigIntegerT1) > 0 || d.f12826s.compareTo(bigIntegerT1) < 0) {
                I1();
            }
            this.R = bigIntegerT1.longValue();
        } else if ((i10 & 8) != 0) {
            double dV1 = V1();
            if (dV1 < -9.223372036854776E18d || dV1 > 9.223372036854776E18d) {
                I1();
            }
            this.R = (long) dV1;
        } else if ((i10 & 16) != 0) {
            BigDecimal bigDecimalS1 = S1();
            if (d.f12827t.compareTo(bigDecimalS1) > 0 || d.f12828u.compareTo(bigDecimalS1) < 0) {
                I1();
            }
            this.R = bigDecimalS1.longValue();
        } else {
            y1();
        }
        this.P |= 2;
    }

    @Override // e6.j
    public float p0() throws e6.i, g6.a {
        int i10 = this.P;
        if ((i10 & 32) == 0) {
            if (i10 == 0) {
                a2(32);
            }
            if ((this.P & 32) == 0) {
                m2();
            }
        }
        return W1();
    }

    protected void p2(int i10, int i11) {
        l6.c cVarO = this.I.o(i10, i11);
        this.I = cVarO;
        this.f12819y.e(cVarO.e());
    }

    protected void q2(int i10, int i11) {
        l6.c cVarP = this.I.p(i10, i11);
        this.I = cVarP;
        this.f12819y.e(cVarP.e());
    }

    @Override // e6.j
    public BigInteger r() throws e6.i, g6.a {
        int i10 = this.P;
        if ((i10 & 4) == 0) {
            if (i10 == 0) {
                a2(4);
            }
            if ((this.P & 4) == 0) {
                k2();
            }
        }
        return T1();
    }

    @Override // e6.j
    /* JADX INFO: renamed from: r2, reason: merged with bridge method [inline-methods] */
    public l6.c z0() {
        return this.I;
    }

    protected IllegalArgumentException s2(e6.a aVar, int i10, int i11) {
        return t2(aVar, i10, i11, null);
    }

    @Override // e6.j
    public int t0() throws e6.i, g6.a {
        int i10 = this.P;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return Z1();
            }
            if ((i10 & 1) == 0) {
                n2();
            }
        }
        return this.Q;
    }

    protected IllegalArgumentException t2(e6.a aVar, int i10, int i11, String str) {
        String str2;
        if (i10 <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i10), Integer.valueOf(i11 + 1));
        } else if (aVar.x(i10)) {
            str2 = "Unexpected padding character ('" + aVar.q() + "') as character #" + (i11 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i10) || Character.isISOControl(i10)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i10) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i10) + "' (code 0x" + Integer.toHexString(i10) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    @Override // e6.j
    public long u0() throws e6.i, g6.a {
        int i10 = this.P;
        if ((i10 & 2) == 0) {
            if (i10 == 0) {
                a2(2);
            }
            if ((this.P & 2) == 0) {
                o2();
            }
        }
        return this.R;
    }

    protected final m u2(String str, double d10) {
        this.K.w(str);
        this.T = d10;
        this.P = 8;
        return m.VALUE_NUMBER_FLOAT;
    }

    @Override // e6.j
    public j.b v0() throws e6.i, g6.a {
        if (this.P == 0) {
            a2(0);
        }
        if (this.f12831c == m.VALUE_NUMBER_INT) {
            int i10 = this.P;
            return (i10 & 1) != 0 ? j.b.INT : (i10 & 2) != 0 ? j.b.LONG : j.b.BIG_INTEGER;
        }
        int i11 = this.P;
        return (i11 & 16) != 0 ? j.b.BIG_DECIMAL : (i11 & 32) != 0 ? j.b.FLOAT : j.b.DOUBLE;
    }

    protected final m v2(boolean z10, int i10, int i11, int i12) throws g6.b {
        this.f12819y.c(i10 + i11 + i12);
        this.X = z10;
        this.Y = i10;
        this.Z = i11;
        this.f12817a0 = i12;
        this.P = 0;
        return m.VALUE_NUMBER_FLOAT;
    }

    @Override // e6.j
    public Number w0() throws e6.i, g6.a {
        if (this.P == 0) {
            a2(0);
        }
        if (this.f12831c == m.VALUE_NUMBER_INT) {
            int i10 = this.P;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this.Q);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this.R);
            }
            if ((i10 & 4) != 0) {
                return T1();
            }
            y1();
        }
        int i11 = this.P;
        if ((i11 & 16) != 0) {
            return S1();
        }
        if ((i11 & 32) != 0) {
            return Float.valueOf(W1());
        }
        if ((i11 & 8) == 0) {
            y1();
        }
        return Double.valueOf(V1());
    }

    protected final m w2(boolean z10, int i10) throws g6.b {
        this.f12819y.d(i10);
        this.X = z10;
        this.Y = i10;
        this.Z = 0;
        this.f12817a0 = 0;
        this.P = 0;
        return m.VALUE_NUMBER_INT;
    }

    @Override // e6.j
    public Object x0() throws e6.i, g6.a {
        if (this.f12831c == m.VALUE_NUMBER_INT) {
            if (this.P == 0) {
                a2(0);
            }
            int i10 = this.P;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this.Q);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this.R);
            }
            if ((i10 & 4) != 0) {
                BigInteger bigInteger = this.U;
                if (bigInteger != null) {
                    return bigInteger;
                }
                String str = this.W;
                return str != null ? str : T1();
            }
            y1();
        }
        if (this.f12831c != m.VALUE_NUMBER_FLOAT) {
            return w0();
        }
        int i11 = this.P;
        return (i11 & 16) != 0 ? S1() : (i11 & 8) != 0 ? Double.valueOf(V1()) : (i11 & 32) != 0 ? Float.valueOf(W1()) : this.K.k();
    }
}
