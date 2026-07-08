package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class l2 extends m2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18067k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(v3 v3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i10) {
        super(v3Var, spliterator, longFunction, binaryOperator);
        this.f18067k = i10;
    }

    @Override // j$.util.stream.m2, j$.util.stream.d
    public final d c(Spliterator spliterator) {
        switch (this.f18067k) {
        }
        return new m2(this, spliterator);
    }

    @Override // j$.util.stream.m2, j$.util.stream.d
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f18067k) {
        }
        return a();
    }
}
