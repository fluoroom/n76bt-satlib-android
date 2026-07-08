package d7;

import e6.j;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class c extends q {

    /* JADX INFO: renamed from: b */
    private static final BigInteger f10805b = BigInteger.valueOf(-2147483648L);

    /* JADX INFO: renamed from: c */
    private static final BigInteger f10806c = BigInteger.valueOf(2147483647L);

    /* JADX INFO: renamed from: d */
    private static final BigInteger f10807d = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: e */
    private static final BigInteger f10808e = BigInteger.valueOf(Long.MAX_VALUE);

    /* JADX INFO: renamed from: a */
    protected final BigInteger f10809a;

    public c(BigInteger bigInteger) {
        this.f10809a = bigInteger;
    }

    public static c e0(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // p6.n
    public Number S() {
        return this.f10809a;
    }

    @Override // d7.q
    public boolean a0() {
        return this.f10809a.compareTo(f10805b) >= 0 && this.f10809a.compareTo(f10806c) <= 0;
    }

    @Override // d7.b, e6.w
    public j.b b() {
        return j.b.BIG_INTEGER;
    }

    @Override // d7.q
    public int b0() {
        return this.f10809a.intValue();
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_NUMBER_INT;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        gVar.L0(this.f10809a);
    }

    @Override // d7.q
    public long d0() {
        return this.f10809a.longValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            return Objects.equals(((c) obj).f10809a, this.f10809a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f10809a);
    }

    @Override // p6.n
    public String i() {
        return this.f10809a.toString();
    }

    @Override // p6.n
    public BigInteger l() {
        return this.f10809a;
    }

    @Override // d7.q, p6.n
    public boolean p() {
        return this.f10809a.compareTo(f10807d) >= 0 && this.f10809a.compareTo(f10808e) <= 0;
    }

    @Override // p6.n
    public BigDecimal q() {
        return new BigDecimal(this.f10809a);
    }

    @Override // p6.n
    public double s() {
        return this.f10809a.doubleValue();
    }
}
