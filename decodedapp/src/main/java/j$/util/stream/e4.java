package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class e4 extends v3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f17967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f17968i;

    @Override // j$.util.stream.v3
    public final q4 D0() {
        return new z3(this.f17968i, this.f17967h);
    }

    public e4(z6 z6Var, DoubleBinaryOperator doubleBinaryOperator, double d10) {
        this.f17967h = doubleBinaryOperator;
        this.f17968i = d10;
    }
}
