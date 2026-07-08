package o8;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p8.e f23285a;

    h(p8.e eVar) {
        this.f23285a = eVar;
    }

    public LatLng a(Point point) {
        v7.q.i(point);
        try {
            return this.f23285a.T(c8.d.v1(point));
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public q8.z b() {
        try {
            return this.f23285a.l();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }
}
