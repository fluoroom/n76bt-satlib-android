package f6;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import e6.i;
import e6.j;
import e6.m;
import i6.g;
import java.math.BigDecimal;
import java.math.BigInteger;
import o6.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final byte[] f12821e = new byte[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final int[] f12822f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final BigInteger f12823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final BigInteger f12824h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final BigInteger f12825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final BigInteger f12826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final BigDecimal f12827t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final BigDecimal f12828u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final BigDecimal f12829v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final BigDecimal f12830w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected m f12831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected m f12832d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        f12823g = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        f12824h = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f12825r = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f12826s = bigIntegerValueOf4;
        f12827t = new BigDecimal(bigIntegerValueOf3);
        f12828u = new BigDecimal(bigIntegerValueOf4);
        f12829v = new BigDecimal(bigIntegerValueOf);
        f12830w = new BigDecimal(bigIntegerValueOf2);
    }

    protected d() {
    }

    protected static final String j1(int i10) {
        char c10 = (char) i10;
        if (Character.isISOControl(c10)) {
            return "(CTRL-CHAR, code " + i10 + ")";
        }
        if (i10 <= 255) {
            return "'" + c10 + "' (code " + i10 + ")";
        }
        return "'" + c10 + "' (code " + i10 + " / 0x" + Integer.toHexString(i10) + ")";
    }

    protected final void A1(String str, Throwable th2) throws i {
        throw h1(str, th2);
    }

    public int B1(int i10) {
        m mVar = this.f12831c;
        if (mVar == m.VALUE_NUMBER_INT || mVar == m.VALUE_NUMBER_FLOAT) {
            return t0();
        }
        if (mVar == null) {
            return i10;
        }
        int iE = mVar.e();
        if (iE == 6) {
            String strC0 = C0();
            if (l1(strC0)) {
                return 0;
            }
            return i6.i.c(strC0, i10);
        }
        switch (iE) {
            case 9:
                return 1;
            case 10:
            case 11:
                return 0;
            case 12:
                Object objH0 = h0();
                return objH0 instanceof Number ? ((Number) objH0).intValue() : i10;
            default:
                return i10;
        }
    }

    @Override // e6.j
    public abstract String C0();

    public long C1(long j10) {
        m mVar = this.f12831c;
        if (mVar == m.VALUE_NUMBER_INT || mVar == m.VALUE_NUMBER_FLOAT) {
            return u0();
        }
        if (mVar == null) {
            return j10;
        }
        int iE = mVar.e();
        if (iE == 6) {
            String strC0 = C0();
            if (l1(strC0)) {
                return 0L;
            }
            return i6.i.d(strC0, j10);
        }
        switch (iE) {
            case 9:
                return 1L;
            case 10:
            case 11:
                return 0L;
            case 12:
                Object objH0 = h0();
                return objH0 instanceof Number ? ((Number) objH0).longValue() : j10;
            default:
                return j10;
        }
    }

    public String D1(String str) {
        m mVar = this.f12831c;
        return mVar == m.VALUE_STRING ? C0() : mVar == m.FIELD_NAME ? S() : (mVar == null || mVar == m.VALUE_NULL || !mVar.g()) ? str : C0();
    }

    protected void E1(String str) {
        o1("Invalid numeric value: " + str);
    }

    protected void F1() {
        G1(C0());
    }

    protected void G1(String str) throws g6.a {
        H1(str, n());
    }

    protected void H1(String str, m mVar) throws g6.a {
        r1(String.format("Numeric value (%s) out of range of int (%d - %s)", m1(str), Integer.valueOf(RtlSpacingHelper.UNDEFINED), Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)), mVar, Integer.TYPE);
    }

    @Override // e6.j
    public int I0() {
        m mVar = this.f12831c;
        return (mVar == m.VALUE_NUMBER_INT || mVar == m.VALUE_NUMBER_FLOAT) ? t0() : B1(0);
    }

    protected void I1() {
        J1(C0());
    }

    @Override // e6.j
    public long J0() {
        m mVar = this.f12831c;
        return (mVar == m.VALUE_NUMBER_INT || mVar == m.VALUE_NUMBER_FLOAT) ? u0() : C1(0L);
    }

    protected void J1(String str) throws g6.a {
        K1(str, n());
    }

    @Override // e6.j
    public String K0() {
        return D1(null);
    }

    protected void K1(String str, m mVar) throws g6.a {
        r1(String.format("Numeric value (%s) out of range of long (%d - %s)", m1(str), Long.MIN_VALUE, Long.MAX_VALUE), mVar, Long.TYPE);
    }

    @Override // e6.j
    public boolean L0() {
        return this.f12831c != null;
    }

    @Override // e6.j
    public boolean N0(m mVar) {
        return this.f12831c == mVar;
    }

    @Override // e6.j
    public boolean O0(int i10) {
        m mVar = this.f12831c;
        return mVar == null ? i10 == 0 : mVar.e() == i10;
    }

    @Override // e6.j
    public boolean R0() {
        return this.f12831c == m.VALUE_NUMBER_INT;
    }

    @Override // e6.j
    public abstract String S();

    @Override // e6.j
    public boolean S0() {
        return this.f12831c == m.START_ARRAY;
    }

    @Override // e6.j
    public m T() {
        return this.f12831c;
    }

    @Override // e6.j
    public boolean T0() {
        return this.f12831c == m.START_OBJECT;
    }

    @Override // e6.j
    public abstract m X0();

    @Override // e6.j
    public j f1() throws i {
        m mVar = this.f12831c;
        if (mVar == m.START_OBJECT || mVar == m.START_ARRAY) {
            int i10 = 1;
            while (true) {
                m mVarX0 = X0();
                if (mVarX0 == null) {
                    k1();
                    return this;
                }
                if (mVarX0.i()) {
                    i10++;
                } else if (mVarX0.h()) {
                    i10--;
                    if (i10 == 0) {
                        break;
                    }
                } else if (mVarX0 == m.NOT_AVAILABLE) {
                    p1("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                }
            }
        }
        return this;
    }

    protected final i h1(String str, Throwable th2) {
        return new i(this, str, th2);
    }

    protected void i1(String str, o6.c cVar, e6.a aVar) {
        try {
            aVar.e(str, cVar);
        } catch (IllegalArgumentException e10) {
            o1(e10.getMessage());
        }
    }

    @Override // e6.j
    public void k() {
        m mVar = this.f12831c;
        if (mVar != null) {
            this.f12832d = mVar;
            this.f12831c = null;
        }
    }

    protected abstract void k1();

    protected boolean l1(String str) {
        return "null".equals(str);
    }

    protected String m1(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    @Override // e6.j
    public m n() {
        return this.f12831c;
    }

    protected String n1(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    protected final void o1(String str) {
        throw a(str);
    }

    protected final void p1(String str, Object obj) throws i {
        throw a(String.format(str, obj));
    }

    @Override // e6.j
    public int q() {
        m mVar = this.f12831c;
        if (mVar == null) {
            return 0;
        }
        return mVar.e();
    }

    protected final void q1(String str, Object obj, Object obj2) {
        throw a(String.format(str, obj, obj2));
    }

    protected void r1(String str, m mVar, Class cls) throws g6.a {
        throw new g6.a(this, str, mVar, cls);
    }

    protected void s1() {
        t1(" in " + this.f12831c, this.f12831c);
    }

    protected void t1(String str, m mVar) {
        throw new g(this, mVar, "Unexpected end-of-input" + str);
    }

    protected void u1(m mVar) {
        t1(mVar == m.VALUE_STRING ? " in a String value" : (mVar == m.VALUE_NUMBER_INT || mVar == m.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value", mVar);
    }

    protected void v1(int i10) {
        w1(i10, "Expected space separating root-level values");
    }

    protected void w1(int i10, String str) {
        if (i10 < 0) {
            s1();
        }
        String str2 = String.format("Unexpected character (%s)", j1(i10));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        o1(str2);
    }

    protected Object x1(int i10, String str) {
        String str2 = String.format("Unexpected character (%s) in numeric value", j1(i10));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        o1(str2);
        return null;
    }

    protected final void y1() {
        r.a();
    }

    protected void z1(int i10) {
        o1("Illegal character (" + j1((char) i10) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    protected d(int i10) {
        super(i10);
    }
}
