package u7;

import android.util.Log;
import java.util.Set;
import t7.a;
import v7.c;

/* JADX INFO: loaded from: classes.dex */
final class l0 implements c.InterfaceC0406c, c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.f f28458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f28459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v7.k f28460c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f28461d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28462e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f28463f;

    public l0(e eVar, a.f fVar, b bVar) {
        this.f28463f = eVar;
        this.f28458a = fVar;
        this.f28459b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        v7.k kVar;
        if (!this.f28462e || (kVar = this.f28460c) == null) {
            return;
        }
        this.f28458a.l(kVar, this.f28461d);
    }

    @Override // v7.c.InterfaceC0406c
    public final void a(s7.a aVar) {
        this.f28463f.f28420w.post(new k0(this, aVar));
    }

    @Override // u7.c1
    public final void b(v7.k kVar, Set set) {
        if (kVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new s7.a(4));
        } else {
            this.f28460c = kVar;
            this.f28461d = set;
            i();
        }
    }

    @Override // u7.c1
    public final void c(s7.a aVar) {
        h0 h0Var = (h0) this.f28463f.f28416s.get(this.f28459b);
        if (h0Var != null) {
            h0Var.I(aVar);
        }
    }

    @Override // u7.c1
    public final void d(int i10) {
        h0 h0Var = (h0) this.f28463f.f28416s.get(this.f28459b);
        if (h0Var != null) {
            if (h0Var.f28438k) {
                h0Var.I(new s7.a(17));
            } else {
                h0Var.q(i10);
            }
        }
    }
}
