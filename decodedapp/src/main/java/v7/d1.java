package v7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends r0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f30360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f30361h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f30361h = cVar;
        this.f30360g = iBinder;
    }

    @Override // v7.r0
    protected final void f(s7.a aVar) {
        if (this.f30361h.E != null) {
            this.f30361h.E.j(aVar);
        }
        this.f30361h.K(aVar);
    }

    @Override // v7.r0
    protected final boolean g() {
        try {
            IBinder iBinder = this.f30360g;
            q.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f30361h.D().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f30361h.D() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceR = this.f30361h.r(this.f30360g);
            if (iInterfaceR == null || !(c.e0(this.f30361h, 2, 4, iInterfaceR) || c.e0(this.f30361h, 3, 4, iInterfaceR))) {
                return false;
            }
            this.f30361h.I = null;
            c cVar = this.f30361h;
            Bundle bundleW = cVar.w();
            if (cVar.D == null) {
                return true;
            }
            this.f30361h.D.x(bundleW);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
