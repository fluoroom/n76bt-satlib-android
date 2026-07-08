package sc;

import hc.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends hc.g implements pc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27279a;

    public b(Object obj) {
        this.f27279a = obj;
    }

    @Override // pc.e, java.util.concurrent.Callable
    public Object call() {
        return this.f27279a;
    }

    @Override // hc.g
    protected void k(i iVar) {
        e eVar = new e(iVar, this.f27279a);
        iVar.a(eVar);
        eVar.run();
    }
}
