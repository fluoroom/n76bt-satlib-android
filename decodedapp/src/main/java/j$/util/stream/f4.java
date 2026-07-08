package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f4 extends r4 implements q4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiFunction f17979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f17980d;

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d10) {
        v3.C();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.q4
    public final void j(q4 q4Var) {
        this.f18149a = this.f17980d.apply(this.f18149a, ((f4) q4Var).f18149a);
    }

    @Override // j$.util.stream.l5
    public final void c(long j10) {
        this.f18149a = this.f17978b;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f18149a = this.f17979c.apply(this.f18149a, obj);
    }

    public f4(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f17978b = obj;
        this.f17979c = biFunction;
        this.f17980d = binaryOperator;
    }
}
