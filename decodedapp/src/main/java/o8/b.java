package o8;

import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    private static p8.a f23274a;

    public static a a(CameraPosition cameraPosition) {
        v7.q.j(cameraPosition, "cameraPosition must not be null");
        try {
            return new a(f().T0(cameraPosition));
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public static a b(LatLng latLng) {
        v7.q.j(latLng, "latLng must not be null");
        try {
            return new a(f().Z(latLng));
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public static a c(LatLngBounds latLngBounds, int i10) {
        v7.q.j(latLngBounds, "bounds must not be null");
        try {
            return new a(f().B(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public static a d(LatLng latLng, float f10) {
        v7.q.j(latLng, "latLng must not be null");
        try {
            return new a(f().j1(latLng, f10));
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public static void e(p8.a aVar) {
        f23274a = (p8.a) v7.q.i(aVar);
    }

    private static p8.a f() {
        return (p8.a) v7.q.j(f23274a, "CameraUpdateFactory is not initialized");
    }
}
