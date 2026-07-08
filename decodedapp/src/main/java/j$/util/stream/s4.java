package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class s4 extends w4 implements i5 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void n(Double d10) {
        v3.D(this, d10);
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
    public final void accept(double d10) {
        this.f18236b++;
    }
}
