package w;

import w.f;

/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30928m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f30911e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f30911e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // w.f
    public void d(int i10) {
        if (this.f30916j) {
            return;
        }
        this.f30916j = true;
        this.f30913g = i10;
        for (d dVar : this.f30917k) {
            dVar.a(dVar);
        }
    }
}
