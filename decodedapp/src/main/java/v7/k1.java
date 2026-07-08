package v7;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class k1 implements ServiceConnection, o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30426a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30427b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f30429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j1 f30430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f30431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ n1 f30432g;

    public k1(n1 n1Var, j1 j1Var) {
        this.f30432g = n1Var;
        this.f30430e = j1Var;
    }

    static /* bridge */ /* synthetic */ s7.a d(k1 k1Var, String str, Executor executor) {
        try {
            Intent intentB = k1Var.f30430e.b(k1Var.f30432g.f30448h);
            k1Var.f30427b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.l.a();
            try {
                n1 n1Var = k1Var.f30432g;
                boolean zC = n1Var.f30451k.c(n1Var.f30448h, str, intentB, k1Var, 4225, executor);
                k1Var.f30428c = zC;
                if (zC) {
                    k1Var.f30432g.f30449i.sendMessageDelayed(k1Var.f30432g.f30449i.obtainMessage(1, k1Var.f30430e), k1Var.f30432g.f30453m);
                    s7.a aVar = s7.a.f26977e;
                    StrictMode.setVmPolicy(vmPolicyA);
                    return aVar;
                }
                k1Var.f30427b = 2;
                try {
                    n1 n1Var2 = k1Var.f30432g;
                    n1Var2.f30451k.b(n1Var2.f30448h, k1Var);
                } catch (IllegalArgumentException unused) {
                }
                s7.a aVar2 = new s7.a(16);
                StrictMode.setVmPolicy(vmPolicyA);
                return aVar2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicyA);
                throw th2;
            }
        } catch (x0 e10) {
            return e10.f30490a;
        }
    }

    public final int a() {
        return this.f30427b;
    }

    public final ComponentName b() {
        return this.f30431f;
    }

    public final IBinder c() {
        return this.f30429d;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f30426a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f30426a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f30432g.f30449i.removeMessages(1, this.f30430e);
        n1 n1Var = this.f30432g;
        n1Var.f30451k.b(n1Var.f30448h, this);
        this.f30428c = false;
        this.f30427b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f30426a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f30426a.isEmpty();
    }

    public final boolean j() {
        return this.f30428c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f30432g.f30447g) {
            try {
                this.f30432g.f30449i.removeMessages(1, this.f30430e);
                this.f30429d = iBinder;
                this.f30431f = componentName;
                Iterator it = this.f30426a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f30427b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f30432g.f30447g) {
            try {
                this.f30432g.f30449i.removeMessages(1, this.f30430e);
                this.f30429d = null;
                this.f30431f = componentName;
                Iterator it = this.f30426a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f30427b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
