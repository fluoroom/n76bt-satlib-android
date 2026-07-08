package d7;

import e6.j;
import java.math.BigDecimal;
import java.math.BigInteger;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class i extends q {

    /* JADX INFO: renamed from: a */
    protected final float f10823a;

    public i(float f10) {
        this.f10823a = f10;
    }

    public static i e0(float f10) {
        return new i(f10);
    }

    @Override // p6.n
    public Number S() {
        return Float.valueOf(this.f10823a);
    }

    @Override // d7.q
    public boolean a0() {
        float f10 = this.f10823a;
        return f10 >= -2.14748365E9f && f10 <= 2.14748365E9f;
    }

    @Override // d7.b, e6.w
    public j.b b() {
        return j.b.FLOAT;
    }

    @Override // d7.q
    public int b0() {
        return (int) this.f10823a;
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_NUMBER_FLOAT;
    }

    @Override // d7.q
    public boolean c0() {
        return Float.isNaN(this.f10823a) || Float.isInfinite(this.f10823a);
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        gVar.G0(this.f10823a);
    }

    @Override // d7.q
    public long d0() {
        return (long) this.f10823a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            if (Float.compare(this.f10823a, ((i) obj).f10823a) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f10823a);
    }

    @Override // p6.n
    public String i() {
        return i6.j.n(this.f10823a);
    }

    @Override // p6.n
    public BigInteger l() {
        return q().toBigInteger();
    }

    @Override // d7.q, p6.n
    public boolean p() {
        float f10 = this.f10823a;
        return f10 >= -9.223372E18f && f10 <= 9.223372E18f;
    }

    @Override // p6.n
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f10823a);
    }

    @Override // p6.n
    public double s() {
        return this.f10823a;
    }
}
