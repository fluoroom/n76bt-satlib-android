package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends j0 implements j5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f17986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f17987d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(int i10) {
        n(Integer.valueOf(i10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18024a) {
            return new j$.util.c0(((Integer) this.f18025b).intValue());
        }
        return null;
    }

    static {
        z6 z6Var = z6.INT_VALUE;
        o oVar = new o(7);
        o oVar2 = new o(8);
        j$.util.c0 c0Var = j$.util.c0.f17710c;
        f17986c = new e0(true, z6Var, c0Var, oVar, oVar2);
        f17987d = new e0(false, z6Var, c0Var, new o(7), new o(8));
    }
}
