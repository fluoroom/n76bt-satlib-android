package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f18040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiConsumer f18041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BinaryOperator f18042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function f18043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f18044e;

    public k(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f18040a = supplier;
        this.f18041b = biConsumer;
        this.f18042c = binaryOperator;
        this.f18043d = function;
        this.f18044e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f18041b;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f18040a;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f18042c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f18043d;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f18044e;
    }
}
