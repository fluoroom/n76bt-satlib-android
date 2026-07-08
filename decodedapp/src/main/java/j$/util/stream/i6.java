package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i6 extends w5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f18018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18019d;

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18018c = new double[(int) j10];
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18018c, 0, this.f18019d);
        long j10 = this.f18019d;
        l5 l5Var = this.f17969a;
        l5Var.c(j10);
        if (!this.f18237b) {
            while (i10 < this.f18019d) {
                l5Var.accept(this.f18018c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18019d && !l5Var.e()) {
                l5Var.accept(this.f18018c[i10]);
                i10++;
            }
        }
        l5Var.end();
        this.f18018c = null;
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d10) {
        double[] dArr = this.f18018c;
        int i10 = this.f18019d;
        this.f18019d = i10 + 1;
        dArr[i10] = d10;
    }
}
