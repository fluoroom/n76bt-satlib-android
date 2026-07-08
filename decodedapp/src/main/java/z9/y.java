package z9;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33071a;

    public y(String str) {
        this.f33071a = str;
    }

    private BigDecimal a() {
        return a0.b(this.f33071a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f33071a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f33071a.equals(((y) obj).f33071a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f33071a);
    }

    public int hashCode() {
        return this.f33071a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f33071a);
            } catch (NumberFormatException unused) {
                return a().intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f33071a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f33071a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f33071a;
    }
}
