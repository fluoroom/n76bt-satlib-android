package j$.util.stream;

import j$.util.function.BiFunction$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f18116b;

    public /* synthetic */ p(BiConsumer biConsumer, int i10) {
        this.f18115a = i10;
        this.f18116b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f18115a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f18115a) {
            case 0:
                this.f18116b.accept(obj, obj2);
                break;
            case 1:
                this.f18116b.accept(obj, obj2);
                break;
            default:
                this.f18116b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
