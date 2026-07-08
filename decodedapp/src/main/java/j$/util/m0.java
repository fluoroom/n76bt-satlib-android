package j$.util;

import j$.util.stream.l5;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m0 implements LongConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f17852b;

    public /* synthetic */ m0(Consumer consumer, int i10) {
        this.f17851a = i10;
        this.f17852b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        switch (this.f17851a) {
            case 0:
                this.f17852b.accept(Long.valueOf(j10));
                break;
            default:
                ((l5) this.f17852b).accept(j10);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f17851a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }
}
