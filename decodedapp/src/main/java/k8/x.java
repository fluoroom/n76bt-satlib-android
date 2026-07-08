package k8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import j$.util.Objects;
import u7.j;

/* JADX INFO: loaded from: classes.dex */
public final class x extends v7.h {
    private final androidx.collection.i R;
    private final androidx.collection.i S;
    private final androidx.collection.i T;
    private final androidx.collection.i U;

    public x(Context context, Looper looper, v7.e eVar, u7.d dVar, u7.m mVar) {
        super(context, looper, 23, eVar, dVar, mVar);
        this.R = new androidx.collection.i();
        this.S = new androidx.collection.i();
        this.T = new androidx.collection.i();
        this.U = new androidx.collection.i();
    }

    private final boolean k0(s7.c cVar) {
        s7.c cVar2;
        s7.c[] cVarArrM = m();
        if (cVarArrM != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= cVarArrM.length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArrM[i10];
                if (cVar.b().equals(cVar2.b())) {
                    break;
                }
                i10++;
            }
            if (cVar2 != null && cVar2.c() >= cVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // v7.c
    protected final String D() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // v7.c
    protected final String E() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // v7.c
    public final void L(int i10) {
        super.L(i10);
        synchronized (this.R) {
            this.R.clear();
        }
        synchronized (this.S) {
            this.S.clear();
        }
        synchronized (this.T) {
            this.T.clear();
        }
    }

    @Override // v7.c
    public final boolean Q() {
        return true;
    }

    @Override // v7.c, t7.a.f
    public final int k() {
        return 11717000;
    }

    public final void l0(s sVar, LocationRequest locationRequest, t8.h hVar) {
        w wVar;
        u7.j jVarK = sVar.k();
        j.a aVarB = jVarK.b();
        Objects.requireNonNull(aVarB);
        boolean zK0 = k0(n8.l.f22636j);
        synchronized (this.S) {
            try {
                w wVar2 = (w) this.S.get(aVarB);
                if (wVar2 == null || zK0) {
                    w wVar3 = new w(sVar);
                    this.S.put(aVarB, wVar3);
                    wVar = wVar3;
                } else {
                    wVar2.x(jVarK);
                    wVar = wVar2;
                    wVar2 = null;
                }
                if (zK0) {
                    ((z0) C()).V(z.b(wVar2, wVar, aVarB.a()), locationRequest, new q(null, hVar));
                } else {
                    ((z0) C()).m0(new d0(1, b0.b(null, locationRequest), null, wVar, null, new p(hVar, wVar), aVarB.a()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m0(j.a aVar, boolean z10, t8.h hVar) {
        synchronized (this.S) {
            try {
                w wVar = (w) this.S.remove(aVar);
                if (wVar == null) {
                    hVar.c(Boolean.FALSE);
                    return;
                }
                wVar.v1();
                if (!z10) {
                    hVar.c(Boolean.TRUE);
                } else if (k0(n8.l.f22636j)) {
                    z0 z0Var = (z0) C();
                    int iIdentityHashCode = System.identityHashCode(wVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationCallback@");
                    sb2.append(iIdentityHashCode);
                    z0Var.Q0(z.b(null, wVar, sb2.toString()), new q(Boolean.TRUE, hVar));
                } else {
                    ((z0) C()).m0(new d0(2, null, null, wVar, null, new r(Boolean.TRUE, hVar), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof z0 ? (z0) iInterfaceQueryLocalInterface : new y0(iBinder);
    }

    @Override // v7.c
    public final s7.c[] u() {
        return n8.l.f22642p;
    }
}
