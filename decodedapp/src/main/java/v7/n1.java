package v7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class n1 extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f30447g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f30448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Handler f30449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l1 f30450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final z7.a f30451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f30452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f30453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Executor f30454n;

    n1(Context context, Looper looper, Executor executor) {
        l1 l1Var = new l1(this, null);
        this.f30450j = l1Var;
        this.f30448h = context.getApplicationContext();
        this.f30449i = new i8.f(looper, l1Var);
        this.f30451k = z7.a.a();
        this.f30452l = 5000L;
        this.f30453m = 300000L;
        this.f30454n = executor;
    }

    @Override // v7.i
    protected final s7.a c(j1 j1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        s7.a aVarD;
        q.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f30447g) {
            try {
                k1 k1Var = (k1) this.f30447g.get(j1Var);
                if (executor == null) {
                    executor = this.f30454n;
                }
                if (k1Var == null) {
                    k1Var = new k1(this, j1Var);
                    k1Var.e(serviceConnection, serviceConnection, str);
                    aVarD = k1.d(k1Var, str, executor);
                    this.f30447g.put(j1Var, k1Var);
                } else {
                    this.f30449i.removeMessages(0, j1Var);
                    if (k1Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + j1Var.toString());
                    }
                    k1Var.e(serviceConnection, serviceConnection, str);
                    int iA = k1Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(k1Var.b(), k1Var.c());
                    } else if (iA == 2) {
                        aVarD = k1.d(k1Var, str, executor);
                    }
                    aVarD = null;
                }
                if (k1Var.j()) {
                    return s7.a.f26977e;
                }
                if (aVarD == null) {
                    aVarD = new s7.a(-1);
                }
                return aVarD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.i
    protected final void d(j1 j1Var, ServiceConnection serviceConnection, String str) {
        q.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f30447g) {
            try {
                k1 k1Var = (k1) this.f30447g.get(j1Var);
                if (k1Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + j1Var.toString());
                }
                if (!k1Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + j1Var.toString());
                }
                k1Var.f(serviceConnection, str);
                if (k1Var.i()) {
                    this.f30449i.sendMessageDelayed(this.f30449i.obtainMessage(0, j1Var), this.f30452l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
