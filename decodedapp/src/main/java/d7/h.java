package d7;

import e6.j;
import java.math.BigDecimal;
import java.math.BigInteger;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class h extends q {

    /* JADX INFO: renamed from: a */
    protected final double f10822a;

    public h(double d10) {
        this.f10822a = d10;
    }

    public static h e0(double d10) {
        return new h(d10);
    }

    @Override // p6.n
    public Number S() {
        return Double.valueOf(this.f10822a);
    }

    @Override // d7.q
    public boolean a0() {
        double d10 = this.f10822a;
        return d10 >= -2.147483648E9d && d10 <= 2.147483647E9d;
    }

    @Override // d7.b, e6.w
    public j.b b() {
        return j.b.DOUBLE;
    }

    @Override // d7.q
    public int b0() {
        return (int) this.f10822a;
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_NUMBER_FLOAT;
    }

    @Override // d7.q
    public boolean c0() {
        return Double.isNaN(this.f10822a) || Double.isInfinite(this.f10822a);
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        gVar.F0(this.f10822a);
    }

    @Override // d7.q
    public long d0() {
        return (long) this.f10822a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            if (Double.compare(this.f10822a, ((h) obj).f10822a) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f10822a);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    @Override // p6.n
    public String i() {
        return i6.j.l(this.f10822a);
    }

    @Override // p6.n
    public BigInteger l() {
        return q().toBigInteger();
    }

    @Override // d7.q, p6.n
    public boolean p() {
        double d10 = this.f10822a;
        return d10 >= -9.223372036854776E18d && d10 <= 9.223372036854776E18d;
    }

    @Override // p6.n
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f10822a);
    }

    @Override // p6.n
    public double s() {
        return this.f10822a;
    }
}
