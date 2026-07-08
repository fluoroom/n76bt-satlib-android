package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class o3 extends r3 implements j5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f18108h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void d(Integer num) {
        v3.F(this, num);
    }

    public o3(Spliterator spliterator, v3 v3Var, int[] iArr) {
        super(spliterator, v3Var, iArr.length);
        this.f18108h = iArr;
    }

    public o3(o3 o3Var, Spliterator spliterator, long j10, long j11) {
        super(o3Var, spliterator, j10, j11, o3Var.f18108h.length);
        this.f18108h = o3Var.f18108h;
    }

    @Override // j$.util.stream.r3
    public final r3 a(Spliterator spliterator, long j10, long j11) {
        return new o3(this, spliterator, j10, j11);
    }

    @Override // j$.util.stream.r3, j$.util.stream.l5
    public final void accept(int i10) {
        int i11 = this.f18147f;
        if (i11 >= this.f18148g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18147f));
        }
        int[] iArr = this.f18108h;
        this.f18147f = i11 + 1;
        iArr[i11] = i10;
    }
}
