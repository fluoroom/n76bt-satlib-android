package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends j0 implements k5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f17996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f17997d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(long j10) {
        n(Long.valueOf(j10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18024a) {
            return new j$.util.d0(((Long) this.f18025b).longValue());
        }
        return null;
    }

    static {
        z6 z6Var = z6.LONG_VALUE;
        o oVar = new o(9);
        o oVar2 = new o(10);
        j$.util.d0 d0Var = j$.util.d0.f17791c;
        f17996c = new e0(true, z6Var, d0Var, oVar, oVar2);
        f17997d = new e0(false, z6Var, d0Var, new o(9), new o(10));
    }
}
