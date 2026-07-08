package ia;

import ka.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f15956a;

    protected void a() {
        h hVar = this.f15956a;
        if (!(hVar instanceof n)) {
            throw new UnsupportedOperationException("Stored renderer is not a KmlRenderer");
        }
        ((n) hVar).p0();
    }

    public void b() {
        h hVar = this.f15956a;
        if (hVar instanceof n) {
            ((n) hVar).z0();
        }
    }

    protected void c(h hVar) {
        this.f15956a = hVar;
    }
}
