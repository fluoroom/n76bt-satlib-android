package zg;

import tg.a0;

/* JADX INFO: loaded from: classes3.dex */
final class k extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f33318c = new k();

    private k() {
    }

    @Override // tg.a0
    public void G(hd.i iVar, Runnable runnable) {
        c.f33302r.w0(runnable, true, false);
    }

    @Override // tg.a0
    public a0 t0(int i10, String str) {
        xg.i.a(i10);
        return i10 >= j.f33315d ? xg.i.b(this, str) : super.t0(i10, str);
    }

    @Override // tg.a0
    public String toString() {
        return "Dispatchers.IO";
    }
}
