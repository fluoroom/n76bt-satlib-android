package v7;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class l1 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n1 f30433a;

    /* synthetic */ l1(n1 n1Var, m1 m1Var) {
        this.f30433a = n1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f30433a.f30447g) {
                try {
                    j1 j1Var = (j1) message.obj;
                    k1 k1Var = (k1) this.f30433a.f30447g.get(j1Var);
                    if (k1Var != null && k1Var.i()) {
                        if (k1Var.j()) {
                            k1Var.g("GmsClientSupervisor");
                        }
                        this.f30433a.f30447g.remove(j1Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f30433a.f30447g) {
            try {
                j1 j1Var2 = (j1) message.obj;
                k1 k1Var2 = (k1) this.f30433a.f30447g.get(j1Var2);
                if (k1Var2 != null && k1Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(j1Var2), new Exception());
                    ComponentName componentNameB = k1Var2.b();
                    if (componentNameB == null) {
                        componentNameB = j1Var2.a();
                    }
                    if (componentNameB == null) {
                        String strC = j1Var2.c();
                        q.i(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    k1Var2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
