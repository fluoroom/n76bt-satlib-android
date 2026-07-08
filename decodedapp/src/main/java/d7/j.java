package d7;

import e6.j;
import java.math.BigDecimal;
import java.math.BigInteger;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class j extends q {

    /* JADX INFO: renamed from: b */
    private static final j[] f10824b = new j[12];

    /* JADX INFO: renamed from: a */
    protected final int f10825a;

    static {
        for (int i10 = 0; i10 < 12; i10++) {
            f10824b[i10] = new j(i10 - 1);
        }
    }

    public j(int i10) {
        this.f10825a = i10;
    }

    public static j e0(int i10) {
        return (i10 > 10 || i10 < -1) ? new j(i10) : f10824b[i10 - (-1)];
    }

    @Override // p6.n
    public Number S() {
        return Integer.valueOf(this.f10825a);
    }

    @Override // d7.q
    public boolean a0() {
        return true;
    }

    @Override // d7.b, e6.w
    public j.b b() {
        return j.b.INT;
    }

    @Override // d7.q
    public int b0() {
        return this.f10825a;
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_NUMBER_INT;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        gVar.H0(this.f10825a);
    }

    @Override // d7.q
    public long d0() {
        return this.f10825a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof j) && ((j) obj).f10825a == this.f10825a;
    }

    public int hashCode() {
        return this.f10825a;
    }

    @Override // p6.n
    public String i() {
        return i6.j.p(this.f10825a);
    }

    @Override // p6.n
    public BigInteger l() {
        return BigInteger.valueOf(this.f10825a);
    }

    @Override // d7.q, p6.n
    public boolean p() {
        return true;
    }

    @Override // p6.n
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f10825a);
    }

    @Override // p6.n
    public double s() {
        return this.f10825a;
    }
}
