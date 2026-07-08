package zg;

import tg.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f33306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f33307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f33308h = v0();

    public f(int i10, int i11, long j10, String str) {
        this.f33304d = i10;
        this.f33305e = i11;
        this.f33306f = j10;
        this.f33307g = str;
    }

    private final a v0() {
        return new a(this.f33304d, this.f33305e, this.f33306f, this.f33307g);
    }

    @Override // tg.a0
    public void G(hd.i iVar, Runnable runnable) {
        a.r(this.f33308h, runnable, false, false, 6, null);
    }

    public final void w0(Runnable runnable, boolean z10, boolean z11) {
        this.f33308h.q(runnable, z10, z11);
    }
}
