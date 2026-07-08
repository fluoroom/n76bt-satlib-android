package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class d4 extends r4 implements q4, i5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f17952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f17953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f17954d;

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

    @Override // j$.util.stream.q4
    public final void j(q4 q4Var) {
        this.f18149a = this.f17954d.apply(this.f18149a, ((d4) q4Var).f18149a);
    }

    @Override // j$.util.stream.l5
    public final void c(long j10) {
        this.f18149a = this.f17952b.get();
    }

    @Override // j$.util.stream.l5
    public final void accept(double d10) {
        this.f17953c.accept(this.f18149a, d10);
    }

    public d4(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, p pVar) {
        this.f17952b = supplier;
        this.f17953c = objDoubleConsumer;
        this.f17954d = pVar;
    }
}
