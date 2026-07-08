package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a6 extends w5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o6 f17903c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.o6, j$.util.stream.u6] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.u6] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.u6] */
    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void c(long j10) {
        ?? u6Var;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            u6Var = new u6();
        } else {
            u6Var = new o6((int) j10);
        }
        this.f17903c = u6Var;
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void end() {
        double[] dArr = (double[]) this.f17903c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        l5 l5Var = this.f17969a;
        l5Var.c(length);
        int i10 = 0;
        if (!this.f18237b) {
            int length2 = dArr.length;
            while (i10 < length2) {
                l5Var.accept(dArr[i10]);
                i10++;
            }
        } else {
            int length3 = dArr.length;
            while (i10 < length3) {
                double d10 = dArr[i10];
                if (l5Var.e()) {
                    break;
                }
                l5Var.accept(d10);
                i10++;
            }
        }
        l5Var.end();
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d10) {
        this.f17903c.accept(d10);
    }
}
