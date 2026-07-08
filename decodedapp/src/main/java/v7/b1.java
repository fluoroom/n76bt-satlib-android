package v7;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f30331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30332d;

    public b1(c cVar, int i10) {
        this.f30331c = cVar;
        this.f30332d = i10;
    }

    @Override // v7.l
    public final void C0(int i10, IBinder iBinder, Bundle bundle) {
        q.j(this.f30331c, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f30331c.M(i10, iBinder, bundle, this.f30332d);
        this.f30331c = null;
    }

    @Override // v7.l
    public final void O0(int i10, IBinder iBinder, f1 f1Var) {
        c cVar = this.f30331c;
        q.j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        q.i(f1Var);
        c.a0(cVar, f1Var);
        C0(i10, iBinder, f1Var.f30385a);
    }

    @Override // v7.l
    public final void h0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
