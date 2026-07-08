package d7;

import e6.j;
import java.math.BigDecimal;
import java.math.BigInteger;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class g extends q {

    /* JADX INFO: renamed from: b */
    public static final g f10816b = new g(BigDecimal.ZERO);

    /* JADX INFO: renamed from: c */
    private static final BigDecimal f10817c = BigDecimal.valueOf(-2147483648L);

    /* JADX INFO: renamed from: d */
    private static final BigDecimal f10818d = BigDecimal.valueOf(2147483647L);

    /* JADX INFO: renamed from: e */
    private static final BigDecimal f10819e = BigDecimal.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: f */
    private static final BigDecimal f10820f = BigDecimal.valueOf(Long.MAX_VALUE);

    /* JADX INFO: renamed from: a */
    protected final BigDecimal f10821a;

    public g(BigDecimal bigDecimal) {
        this.f10821a = bigDecimal;
    }

    public static g e0(BigDecimal bigDecimal) {
        return new g(bigDecimal);
    }

    @Override // p6.n
    public Number S() {
        return this.f10821a;
    }

    @Override // d7.q
    public boolean a0() {
        return this.f10821a.compareTo(f10817c) >= 0 && this.f10821a.compareTo(f10818d) <= 0;
    }

    @Override // d7.b, e6.w
    public j.b b() {
        return j.b.BIG_DECIMAL;
    }

    @Override // d7.q
    public int b0() {
        return this.f10821a.intValue();
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_NUMBER_FLOAT;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        gVar.K0(this.f10821a);
    }

    @Override // d7.q
    public long d0() {
        return this.f10821a.longValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            BigDecimal bigDecimal = ((g) obj).f10821a;
            if (bigDecimal == null) {
                return this.f10821a == null;
            }
            BigDecimal bigDecimal2 = this.f10821a;
            if (bigDecimal2 != null && bigDecimal.compareTo(bigDecimal2) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f10821a == null) {
            return 0;
        }
        return Double.valueOf(s()).hashCode();
    }

    @Override // p6.n
    public String i() {
        return this.f10821a.toString();
    }

    @Override // p6.n
    public BigInteger l() {
        return Z(this.f10821a);
    }

    @Override // d7.q, p6.n
    public boolean p() {
        return this.f10821a.compareTo(f10819e) >= 0 && this.f10821a.compareTo(f10820f) <= 0;
    }

    @Override // p6.n
    public BigDecimal q() {
        return this.f10821a;
    }

    @Override // p6.n
    public double s() {
        return this.f10821a.doubleValue();
    }
}
