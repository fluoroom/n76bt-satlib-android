package u7;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.collection.b f28536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f28537g;

    z(i iVar, e eVar, s7.d dVar) {
        super(iVar, dVar);
        this.f28536f = new androidx.collection.b();
        this.f28537g = eVar;
        this.f28429a.u0("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, e eVar, b bVar) {
        i iVarC = h.c(activity);
        z zVar = (z) iVarC.V("ConnectionlessLifecycleHelper", z.class);
        if (zVar == null) {
            zVar = new z(iVarC, eVar, s7.d.l());
        }
        v7.q.j(bVar, "ApiKey cannot be null");
        zVar.f28536f.add(bVar);
        eVar.b(zVar);
    }

    private final void v() {
        if (this.f28536f.isEmpty()) {
            return;
        }
        this.f28537g.b(this);
    }

    @Override // u7.h
    public final void h() {
        super.h();
        v();
    }

    @Override // u7.p1, u7.h
    public final void j() {
        super.j();
        v();
    }

    @Override // u7.p1, u7.h
    public final void k() {
        super.k();
        this.f28537g.c(this);
    }

    @Override // u7.p1
    protected final void m(s7.a aVar, int i10) {
        this.f28537g.F(aVar, i10);
    }

    @Override // u7.p1
    protected final void n() {
        this.f28537g.G();
    }

    final androidx.collection.b t() {
        return this.f28536f;
    }
}
