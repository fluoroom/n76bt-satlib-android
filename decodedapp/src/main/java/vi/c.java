package vi;

import aj.j;
import j$.util.function.Function$CC;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.function.Function;
import pi.e;
import ui.g;

/* JADX INFO: loaded from: classes3.dex */
public class c extends Number implements e, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f30862c = new c(2, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f30863d = new c(1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f30864e = new c(0, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f30865f = new c(4, 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f30866g = new c(1, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f30867h = new c(1, 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f30868r = new c(1, 4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f30869s = new c(1, 3);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f30870t = new c(3, 5);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f30871u = new c(3, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f30872v = new c(2, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f30873w = new c(2, 4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f30874x = new c(2, 3);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f30875y = new c(-1, 1);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Function f30876z = new Function() { // from class: vi.b
        public /* synthetic */ Function andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return c.W(null);
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30878b;

    public c(int i10) {
        this(i10, 1);
    }

    public static /* synthetic */ c W(a aVar) {
        throw null;
    }

    private c Y(c cVar, boolean z10) {
        j.c(cVar, ui.d.FRACTION, new Object[0]);
        if (this.f30878b == 0) {
            return z10 ? cVar : cVar.g0();
        }
        if (cVar.f30878b == 0) {
            return this;
        }
        int iB = aj.a.b(this.f30877a, cVar.f30877a);
        if (iB == 1) {
            int iD = aj.a.d(this.f30878b, cVar.f30877a);
            int iD2 = aj.a.d(cVar.f30878b, this.f30877a);
            return new c(z10 ? aj.a.a(iD, iD2) : aj.a.f(iD, iD2), aj.a.d(this.f30877a, cVar.f30877a));
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(this.f30878b).multiply(BigInteger.valueOf(cVar.f30877a / iB));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(cVar.f30878b).multiply(BigInteger.valueOf(this.f30877a / iB));
        BigInteger bigIntegerAdd = z10 ? bigIntegerMultiply.add(bigIntegerMultiply2) : bigIntegerMultiply.subtract(bigIntegerMultiply2);
        int iIntValue = bigIntegerAdd.mod(BigInteger.valueOf(iB)).intValue();
        int iB2 = iIntValue == 0 ? iB : aj.a.b(iIntValue, iB);
        BigInteger bigIntegerDivide = bigIntegerAdd.divide(BigInteger.valueOf(iB2));
        if (bigIntegerDivide.bitLength() <= 31) {
            return new c(bigIntegerDivide.intValue(), aj.a.d(this.f30877a / iB, cVar.f30877a / iB2));
        }
        throw new g(ui.d.NUMERATOR_OVERFLOW_AFTER_MULTIPLY, bigIntegerDivide);
    }

    public static c d0(int i10, int i11) {
        if (i11 == 0) {
            throw new g(ui.d.ZERO_DENOMINATOR_IN_FRACTION, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (i10 == 0) {
            return f30864e;
        }
        if (i11 == Integer.MIN_VALUE && (i10 & 1) == 0) {
            i10 /= 2;
            i11 /= 2;
        }
        if (i11 < 0) {
            if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE) {
                throw new g(ui.d.OVERFLOW_IN_FRACTION, Integer.valueOf(i10), Integer.valueOf(i11));
            }
            i10 = -i10;
            i11 = -i11;
        }
        int iB = aj.a.b(i10, i11);
        return new c(i10 / iB, i11 / iB);
    }

    public c X(c cVar) {
        return Y(cVar, true);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        return Long.compare(((long) this.f30878b) * ((long) cVar.f30877a), ((long) this.f30877a) * ((long) cVar.f30878b));
    }

    public int a0() {
        return this.f30877a;
    }

    @Override // pi.e
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public d q() {
        return d.c();
    }

    public int c0() {
        return this.f30878b;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return ((double) this.f30878b) / ((double) this.f30877a);
    }

    public boolean e0() {
        return this.f30877a == 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f30878b == cVar.f30878b && this.f30877a == cVar.f30877a) {
                return true;
            }
        }
        return false;
    }

    public c f0(c cVar) {
        j.c(cVar, ui.d.FRACTION, new Object[0]);
        int i10 = this.f30878b;
        if (i10 == 0 || cVar.f30878b == 0) {
            return f30864e;
        }
        int iB = aj.a.b(i10, cVar.f30877a);
        int iB2 = aj.a.b(cVar.f30878b, this.f30877a);
        return d0(aj.a.d(this.f30878b / iB, cVar.f30878b / iB2), aj.a.d(this.f30877a / iB2, cVar.f30877a / iB));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public c g0() {
        int i10 = this.f30878b;
        if (i10 != Integer.MIN_VALUE) {
            return new c(-i10, this.f30877a);
        }
        throw new g(ui.d.OVERFLOW_IN_FRACTION, Integer.valueOf(this.f30878b), Integer.valueOf(this.f30877a));
    }

    public c h0(c cVar) {
        return Y(cVar, false);
    }

    public int hashCode() {
        return ((this.f30878b + 629) * 37) + this.f30877a;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // pi.e
    public /* synthetic */ boolean isZero() {
        return pi.d.a(this);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) doubleValue();
    }

    public String toString() {
        if (this.f30877a == 1) {
            return Integer.toString(this.f30878b);
        }
        if (this.f30878b == 0) {
            return "0";
        }
        return this.f30878b + " / " + this.f30877a;
    }

    public c(int i10, int i11) {
        if (i11 == 0) {
            throw new g(ui.d.ZERO_DENOMINATOR_IN_FRACTION, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (i11 < 0) {
            if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE) {
                throw new g(ui.d.OVERFLOW_IN_FRACTION, Integer.valueOf(i10), Integer.valueOf(i11));
            }
            i10 = -i10;
            i11 = -i11;
        }
        int iB = aj.a.b(i10, i11);
        if (iB > 1) {
            i10 /= iB;
            i11 /= iB;
        }
        if (i11 < 0) {
            i10 = -i10;
            i11 = -i11;
        }
        this.f30878b = i10;
        this.f30877a = i11;
    }
}
