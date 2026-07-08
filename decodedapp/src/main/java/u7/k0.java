package u7;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s7.a f28455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l0 f28456b;

    k0(l0 l0Var, s7.a aVar) {
        this.f28456b = l0Var;
        this.f28455a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0 l0Var = this.f28456b;
        h0 h0Var = (h0) l0Var.f28463f.f28416s.get(l0Var.f28459b);
        if (h0Var == null) {
            return;
        }
        if (!this.f28455a.g()) {
            h0Var.H(this.f28455a, null);
            return;
        }
        this.f28456b.f28462e = true;
        if (this.f28456b.f28458a.o()) {
            this.f28456b.i();
            return;
        }
        try {
            l0 l0Var2 = this.f28456b;
            l0Var2.f28458a.l(null, l0Var2.f28458a.d());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f28456b.f28458a.f("Failed to get service from broker.");
            h0Var.H(new s7.a(10), null);
        }
    }
}
