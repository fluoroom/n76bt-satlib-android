package k8;

import u7.j;

/* JADX INFO: loaded from: classes.dex */
final class f implements u7.p, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f19489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u7.j f19490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19491c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f19492d;

    f(g gVar, u7.j jVar, e eVar) {
        this.f19492d = gVar;
        this.f19490b = jVar;
        this.f19489a = eVar;
    }

    @Override // u7.p
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        j.a aVarB;
        boolean z10;
        x xVar = (x) obj;
        t8.h hVar = (t8.h) obj2;
        synchronized (this) {
            aVarB = this.f19490b.b();
            z10 = this.f19491c;
            this.f19490b.a();
        }
        if (aVarB == null) {
            hVar.c(Boolean.FALSE);
        } else {
            this.f19489a.a(xVar, aVarB, z10, hVar);
        }
    }

    @Override // k8.s
    public final void i() {
        j.a aVarB;
        synchronized (this) {
            this.f19491c = false;
            aVarB = this.f19490b.b();
        }
        if (aVarB != null) {
            this.f19492d.k(aVarB, 2441);
        }
    }

    @Override // k8.s
    public final synchronized void j(u7.j jVar) {
        u7.j jVar2 = this.f19490b;
        if (jVar2 != jVar) {
            jVar2.a();
            this.f19490b = jVar;
        }
    }

    @Override // k8.s
    public final synchronized u7.j k() {
        return this.f19490b;
    }
}
