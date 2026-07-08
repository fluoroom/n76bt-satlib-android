package tg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27866b = AtomicIntegerFieldUpdater.newUpdater(s.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f27867a;

    public s(Throwable th2, boolean z10) {
        this.f27867a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f27866b.get(this) == 1;
    }

    public final boolean c() {
        return f27866b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return h0.a(this) + '[' + this.f27867a + ']';
    }

    public /* synthetic */ s(Throwable th2, boolean z10, int i10, rd.h hVar) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
