package gj;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f14528a;

    public a0(double... dArr) {
        this.f14528a = (double[]) dArr.clone();
    }

    public double a(double d10) {
        double d11 = 0.0d;
        for (int length = this.f14528a.length - 1; length > 0; length--) {
            d11 = (d11 * d10) + (((double) length) * this.f14528a[length]);
        }
        return d11 / 3.15576E9d;
    }

    public double b(double d10) {
        double d11 = 0.0d;
        for (int length = this.f14528a.length - 1; length >= 0; length--) {
            d11 = (d11 * d10) + this.f14528a[length];
        }
        return d11;
    }
}
