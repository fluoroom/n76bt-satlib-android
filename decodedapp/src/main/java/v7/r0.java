package v7;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
abstract class r0 extends a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f30473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f30474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected r0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f30474f = cVar;
        this.f30472d = i10;
        this.f30473e = bundle;
    }

    @Override // v7.a1
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f30472d != 0) {
            this.f30474f.g0(1, null);
            Bundle bundle = this.f30473e;
            f(new s7.a(this.f30472d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f30474f.g0(1, null);
            f(new s7.a(8, null));
        }
    }

    protected abstract void f(s7.a aVar);

    protected abstract boolean g();

    @Override // v7.a1
    protected final void b() {
    }
}
