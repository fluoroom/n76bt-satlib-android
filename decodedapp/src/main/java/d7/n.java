package d7;

import e6.j;
import java.math.BigDecimal;
import java.math.BigInteger;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class n extends q {

    /* JADX INFO: renamed from: a */
    protected final long f10847a;

    public n(long j10) {
        this.f10847a = j10;
    }

    public static n e0(long j10) {
        return new n(j10);
    }

    @Override // p6.n
    public Number S() {
        return Long.valueOf(this.f10847a);
    }

    @Override // d7.q
    public boolean a0() {
        long j10 = this.f10847a;
        return j10 >= -2147483648L && j10 <= 2147483647L;
    }

    @Override // d7.b, e6.w
    public j.b b() {
        return j.b.LONG;
    }

    @Override // d7.q
    public int b0() {
        return (int) this.f10847a;
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_NUMBER_INT;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        gVar.I0(this.f10847a);
    }

    @Override // d7.q
    public long d0() {
        return this.f10847a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof n) && ((n) obj).f10847a == this.f10847a;
    }

    public int hashCode() {
        long j10 = this.f10847a;
        return ((int) j10) ^ ((int) (j10 >> 32));
    }

    @Override // p6.n
    public String i() {
        return i6.j.q(this.f10847a);
    }

    @Override // p6.n
    public BigInteger l() {
        return BigInteger.valueOf(this.f10847a);
    }

    @Override // d7.q, p6.n
    public boolean p() {
        return true;
    }

    @Override // p6.n
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f10847a);
    }

    @Override // p6.n
    public double s() {
        return this.f10847a;
    }
}
