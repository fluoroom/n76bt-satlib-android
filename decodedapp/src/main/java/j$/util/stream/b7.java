package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class b7 extends e7 implements DoubleConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f17931c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public b7(int i10) {
        this.f17931c = new double[i10];
    }

    @Override // j$.util.stream.e7
    public final void a(Object obj, long j10) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            doubleConsumer.accept(this.f17931c[i10]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i10 = this.f17971b;
        this.f17971b = i10 + 1;
        this.f17931c[i10] = d10;
    }
}
