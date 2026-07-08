package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends j0 implements i5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f17974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f17975d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(double d10) {
        n(Double.valueOf(d10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18024a) {
            return new j$.util.b0(((Double) this.f18025b).doubleValue());
        }
        return null;
    }

    static {
        z6 z6Var = z6.DOUBLE_VALUE;
        o oVar = new o(5);
        o oVar2 = new o(6);
        j$.util.b0 b0Var = j$.util.b0.f17704c;
        f17974c = new e0(true, z6Var, b0Var, oVar, oVar2);
        f17975d = new e0(false, z6Var, b0Var, new o(5), new o(6));
    }
}
