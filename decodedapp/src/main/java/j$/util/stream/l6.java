package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l6 extends z5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f18070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18071e;

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18070d = new Object[(int) j10];
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18070d, 0, this.f18071e, this.f18287b);
        long j10 = this.f18071e;
        l5 l5Var = this.f18003a;
        l5Var.c(j10);
        if (!this.f18288c) {
            while (i10 < this.f18071e) {
                l5Var.accept(this.f18070d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18071e && !l5Var.e()) {
                l5Var.accept(this.f18070d[i10]);
                i10++;
            }
        }
        l5Var.end();
        this.f18070d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f18070d;
        int i10 = this.f18071e;
        this.f18071e = i10 + 1;
        objArr[i10] = obj;
    }
}
