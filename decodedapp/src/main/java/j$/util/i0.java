package j$.util;

import j$.util.stream.l5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i0 implements IntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f17830b;

    public /* synthetic */ i0(Consumer consumer, int i10) {
        this.f17829a = i10;
        this.f17830b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        switch (this.f17829a) {
            case 0:
                this.f17830b.accept(Integer.valueOf(i10));
                break;
            default:
                ((l5) this.f17830b).accept(i10);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f17829a) {
        }
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }
}
