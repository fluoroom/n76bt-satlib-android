package e6;

import java.io.Closeable;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final o6.i f11531b = o6.i.a(q.values());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f11532a;

    public enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true),
        USE_FAST_DOUBLE_PARSER(false),
        USE_FAST_BIG_NUMBER_PARSER(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f11548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11549b = 1 << ordinal();

        a(boolean z10) {
            this.f11548a = z10;
        }

        public static int a() {
            int iF = 0;
            for (a aVar : values()) {
                if (aVar.d()) {
                    iF |= aVar.f();
                }
            }
            return iF;
        }

        public boolean d() {
            return this.f11548a;
        }

        public boolean e(int i10) {
            return (i10 & this.f11549b) != 0;
        }

        public int f() {
            return this.f11549b;
        }
    }

    public enum b {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    protected j() {
        this.f11532a = e.f11484u;
    }

    public abstract o6.i A0();

    public short B0() throws g6.a {
        int iT0 = t0();
        if (iT0 < -32768 || iT0 > 32767) {
            throw new g6.a(this, String.format("Numeric value (%s) out of range of Java short", C0()), m.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) iT0;
    }

    public abstract String C0();

    public abstract char[] D0();

    public abstract int E0();

    public abstract int F0();

    public abstract n G();

    public abstract h G0();

    public abstract h H();

    public Object H0() {
        return null;
    }

    public abstract int I0();

    public abstract long J0();

    public abstract String K0();

    public abstract boolean L0();

    public abstract boolean M0();

    public abstract boolean N0(m mVar);

    public abstract boolean O0(int i10);

    public boolean P0(a aVar) {
        return aVar.e(this.f11532a);
    }

    public boolean Q0(s sVar) {
        return sVar.g().e(this.f11532a);
    }

    public abstract boolean R0();

    public abstract String S();

    public abstract boolean S0();

    public abstract m T();

    public abstract boolean T0();

    public abstract boolean U0();

    public String V0() {
        if (X0() == m.FIELD_NAME) {
            return S();
        }
        return null;
    }

    public abstract BigDecimal W();

    public String W0() {
        if (X0() == m.VALUE_STRING) {
            return C0();
        }
        return null;
    }

    public abstract double X();

    public abstract m X0();

    public j Z0(int i10, int i11) {
        return d1((i10 & i11) | (this.f11532a & (~i11)));
    }

    protected i a(String str) {
        return new i(this, str).f(null);
    }

    public abstract int a1(e6.a aVar, OutputStream outputStream);

    public boolean b1() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public void c1(Object obj) {
        l lVarZ0 = z0();
        if (lVarZ0 != null) {
            lVarZ0.k(obj);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public j d1(int i10) {
        this.f11532a = i10;
        return this;
    }

    public boolean e() {
        return false;
    }

    public void e1(c cVar) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + cVar.a() + "'");
    }

    public abstract j f1();

    public r g1() {
        return r.a();
    }

    public Object h0() {
        return null;
    }

    public abstract void k();

    public String l() {
        return S();
    }

    public abstract m n();

    public abstract float p0();

    public abstract int q();

    public abstract BigInteger r();

    public byte[] s() {
        return v(e6.b.a());
    }

    public abstract int t0();

    public abstract long u0();

    public abstract byte[] v(e6.a aVar);

    public abstract b v0();

    public boolean w() throws i {
        m mVarN = n();
        if (mVarN == m.VALUE_TRUE) {
            return true;
        }
        if (mVarN == m.VALUE_FALSE) {
            return false;
        }
        throw new i(this, String.format("Current token (%s) not of boolean type", mVarN)).f(null);
    }

    public abstract Number w0();

    public byte x() throws g6.a {
        int iT0 = t0();
        if (iT0 < -128 || iT0 > 255) {
            throw new g6.a(this, String.format("Numeric value (%s) out of range of Java byte", C0()), m.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) iT0;
    }

    public Object x0() {
        return w0();
    }

    public Object y0() {
        return null;
    }

    public abstract l z0();

    protected j(int i10) {
        this.f11532a = i10;
    }

    public j Y0(int i10, int i11) {
        return this;
    }
}
