package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import t7.a;
import t7.g;
import t7.k;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BasePendingResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a.c f7216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t7.a f7217o;

    protected a(t7.a aVar, g gVar) {
        super((g) q.j(gVar, "GoogleApiClient must not be null"));
        q.j(aVar, "Api must not be null");
        this.f7216n = aVar.b();
        this.f7217o = aVar;
    }

    private void n(RemoteException remoteException) {
        o(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void k(a.b bVar);

    public final void m(a.b bVar) throws DeadObjectException {
        try {
            k(bVar);
        } catch (DeadObjectException e10) {
            n(e10);
            throw e10;
        } catch (RemoteException e11) {
            n(e11);
        }
    }

    public final void o(Status status) {
        q.b(!status.g(), "Failed result must not be success");
        k kVarC = c(status);
        f(kVarC);
        l(kVarC);
    }

    protected void l(k kVar) {
    }
}
