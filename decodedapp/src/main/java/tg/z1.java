package tg;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1 f27882c = new z1();

    private z1() {
    }

    @Override // tg.a0
    public void G(hd.i iVar, Runnable runnable) {
        android.support.v4.media.session.b.a(iVar.a(c2.f27803b));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // tg.a0
    public boolean p0(hd.i iVar) {
        return false;
    }

    @Override // tg.a0
    public a0 t0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // tg.a0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
