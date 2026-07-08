package zg;

import tg.h0;

/* JADX INFO: loaded from: classes3.dex */
final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f33311c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f33311c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33311c.run();
    }

    public String toString() {
        return "Task[" + h0.a(this.f33311c) + '@' + h0.b(this.f33311c) + ", " + this.f33309a + ", " + j.c(this.f33310b) + ']';
    }
}
