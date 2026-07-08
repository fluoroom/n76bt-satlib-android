package k8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends a implements z0 {
    y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // k8.z0
    public final void Q0(z zVar, u7.f fVar) {
        Parcel parcelJ = j();
        k.b(parcelJ, zVar);
        k.c(parcelJ, fVar);
        q(89, parcelJ);
    }

    @Override // k8.z0
    public final void V(z zVar, LocationRequest locationRequest, u7.f fVar) {
        Parcel parcelJ = j();
        k.b(parcelJ, zVar);
        k.b(parcelJ, locationRequest);
        k.c(parcelJ, fVar);
        q(88, parcelJ);
    }

    @Override // k8.z0
    public final void m0(d0 d0Var) {
        Parcel parcelJ = j();
        k.b(parcelJ, d0Var);
        q(59, parcelJ);
    }
}
