package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17533g;

    public h(j$.time.temporal.q qVar, int i10, int i11, boolean z10, int i12) {
        super(qVar, i10, i11, v.NOT_NEGATIVE, i12);
        this.f17533g = z10;
    }

    @Override // j$.time.format.j
    public final j a() {
        if (this.f17540e == -1) {
            return this;
        }
        return new h(this.f17536a, this.f17537b, this.f17538c, this.f17533g, -1);
    }

    @Override // j$.time.format.j
    public final j b(int i10) {
        return new h(this.f17536a, this.f17537b, this.f17538c, this.f17533g, this.f17540e + i10);
    }

    @Override // j$.time.format.j, j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb2) {
        j$.time.temporal.q qVar2 = this.f17536a;
        Long lA = qVar.a(qVar2);
        if (lA == null) {
            return false;
        }
        t tVar = qVar.f17563b.f17524c;
        long jLongValue = lA.longValue();
        j$.time.temporal.u uVarK = qVar2.k();
        uVarK.b(jLongValue, qVar2);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(uVarK.f17637a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(uVarK.f17640d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z10 = this.f17533g;
        int i10 = this.f17537b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f17538c), roundingMode).toPlainString().substring(2);
            tVar.getClass();
            if (z10) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i10 > 0) {
            if (z10) {
                tVar.getClass();
                sb2.append('.');
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tVar.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.f17536a + "," + this.f17537b + "," + this.f17538c + (this.f17533g ? ",DecimalPoint" : "") + ")";
    }
}
