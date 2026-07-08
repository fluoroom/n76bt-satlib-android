package j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f18304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f18305b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.count++;
        this.f18305b += d10;
        b(d10);
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final void a(x xVar) {
        this.count += xVar.count;
        this.f18305b += xVar.f18305b;
        b(xVar.sum);
        b(xVar.f18304a);
        this.min = Math.min(this.min, xVar.min);
        this.max = Math.max(this.max, xVar.max);
    }

    public final void b(double d10) {
        double d11 = d10 - this.f18304a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f18304a = (d13 - d12) - d11;
        this.sum = d13;
    }

    public final String toString() {
        double d10;
        String simpleName = x.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d11 = this.sum + this.f18304a;
        if (Double.isNaN(d11) && Double.isInfinite(this.f18305b)) {
            d11 = this.f18305b;
        }
        Double dValueOf = Double.valueOf(d11);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d12 = this.sum + this.f18304a;
            if (Double.isNaN(d12) && Double.isInfinite(this.f18305b)) {
                d12 = this.f18305b;
            }
            d10 = d12 / this.count;
        } else {
            d10 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d10), Double.valueOf(this.max));
    }
}
