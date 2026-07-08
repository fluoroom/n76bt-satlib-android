package o8;

import android.location.Location;
import android.os.RemoteException;
import o8.d;

/* JADX INFO: loaded from: classes.dex */
final class t implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p8.m f23326a;

    t(x xVar, p8.m mVar) {
        this.f23326a = mVar;
    }

    @Override // o8.d.a
    public final void onLocationChanged(Location location) {
        try {
            this.f23326a.E(location);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }
}
