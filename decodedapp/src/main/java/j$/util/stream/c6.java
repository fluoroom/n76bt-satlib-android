package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c6 extends y5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s6 f17942c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.s6, j$.util.stream.u6] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.u6] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.u6] */
    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void c(long j10) {
        ?? u6Var;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            u6Var = new u6();
        } else {
            u6Var = new s6((int) j10);
        }
        this.f17942c = u6Var;
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void end() {
        long[] jArr = (long[]) this.f17942c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        l5 l5Var = this.f17991a;
        l5Var.c(length);
        int i10 = 0;
        if (!this.f18256b) {
            int length2 = jArr.length;
            while (i10 < length2) {
                l5Var.accept(jArr[i10]);
                i10++;
            }
        } else {
            int length3 = jArr.length;
            while (i10 < length3) {
                long j10 = jArr[i10];
                if (l5Var.e()) {
                    break;
                }
                l5Var.accept(j10);
                i10++;
            }
        }
        l5Var.end();
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j10) {
        this.f17942c.accept(j10);
    }
}
