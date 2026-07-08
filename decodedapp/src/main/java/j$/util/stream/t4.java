package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class t4 extends w4 implements j5 {
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

    @Override // j$.util.stream.r4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18236b);
    }

    @Override // j$.util.stream.q4
    public final void j(q4 q4Var) {
        this.f18236b += ((w4) q4Var).f18236b;
    }

    @Override // j$.util.stream.w4, j$.util.stream.l5
    public final void accept(int i10) {
        this.f18236b++;
    }
}
