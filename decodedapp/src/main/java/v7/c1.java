package v7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f30355b;

    public c1(c cVar, int i10) {
        this.f30355b = cVar;
        this.f30354a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f30355b;
        if (iBinder == null) {
            c.b0(cVar, 16);
            return;
        }
        synchronized (cVar.f30346w) {
            try {
                c cVar2 = this.f30355b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cVar2.f30347x = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new u0(iBinder) : (m) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f30355b.c0(0, null, this.f30354a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f30355b.f30346w) {
            this.f30355b.f30347x = null;
        }
        c cVar = this.f30355b;
        int i10 = this.f30354a;
        Handler handler = cVar.f30344u;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
