package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class h4 extends v3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f17999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f18000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Supplier f18001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Collector f18002k;

    @Override // j$.util.stream.v3
    public final q4 D0() {
        return new i4(this.f18001j, this.f18000i, this.f17999h);
    }

    @Override // j$.util.stream.v3, j$.util.stream.g8
    public final int v() {
        if (this.f18002k.characteristics().contains(h.UNORDERED)) {
            return y6.f18269r;
        }
        return 0;
    }

    public h4(z6 z6Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.f17999h = binaryOperator;
        this.f18000i = biConsumer;
        this.f18001j = supplier;
        this.f18002k = collector;
    }
}
