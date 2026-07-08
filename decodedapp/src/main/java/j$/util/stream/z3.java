package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class z3 implements q4, i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f18284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f18285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f18286c;

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i10) {
        v3.J();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(long j10) {
        v3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void n(Double d10) {
        v3.D(this, d10);
    }

    public z3(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        this.f18285b = d10;
        this.f18286c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.q4
    public final void j(q4 q4Var) {
        accept(((z3) q4Var).f18284a);
    }

    @Override // j$.util.stream.l5
    public final void c(long j10) {
        this.f18284a = this.f18285b;
    }

    @Override // j$.util.stream.l5
    public final void accept(double d10) {
        this.f18284a = this.f18286c.applyAsDouble(this.f18284a, d10);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f18284a);
    }
}
