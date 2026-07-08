package rc;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends hc.c implements pc.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f25900b;

    public f(Object obj) {
        this.f25900b = obj;
    }

    @Override // pc.e, java.util.concurrent.Callable
    public Object call() {
        return this.f25900b;
    }

    @Override // hc.c
    protected void m(ck.b bVar) {
        bVar.a(new wc.c(bVar, this.f25900b));
    }
}
