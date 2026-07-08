package j$.util;

import j$.util.stream.l5;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e0 implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f17798b;

    public /* synthetic */ e0(Consumer consumer, int i10) {
        this.f17797a = i10;
        this.f17798b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f17797a) {
            case 0:
                this.f17798b.accept(Double.valueOf(d10));
                break;
            default:
                ((l5) this.f17798b).accept(d10);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f17797a) {
        }
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }
}
