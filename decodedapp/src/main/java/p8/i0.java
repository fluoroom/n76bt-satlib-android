package p8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c8.b;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends l8.a implements d {
    i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // p8.d
    public final void I0(o oVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, oVar);
        x(12, parcelQ);
    }

    @Override // p8.d
    public final void P(c8.b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        l8.r.c(parcelQ, googleMapOptions);
        l8.r.c(parcelQ, bundle);
        x(2, parcelQ);
    }

    @Override // p8.d
    public final void b() {
        x(15, q());
    }

    @Override // p8.d
    public final void d() {
        x(5, q());
    }

    @Override // p8.d
    public final void f() {
        x(8, q());
    }

    @Override // p8.d
    public final void g() {
        x(16, q());
    }

    @Override // p8.d
    public final void n() {
        x(6, q());
    }

    @Override // p8.d
    public final void o(Bundle bundle) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, bundle);
        Parcel parcelJ = j(10, parcelQ);
        if (parcelJ.readInt() != 0) {
            bundle.readFromParcel(parcelJ);
        }
        parcelJ.recycle();
    }

    @Override // p8.d
    public final void onLowMemory() {
        x(9, q());
    }

    @Override // p8.d
    public final void v() {
        x(7, q());
    }

    @Override // p8.d
    public final c8.b v0(c8.b bVar, c8.b bVar2, Bundle bundle) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        l8.r.e(parcelQ, bVar2);
        l8.r.c(parcelQ, bundle);
        Parcel parcelJ = j(4, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    @Override // p8.d
    public final void w(Bundle bundle) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, bundle);
        x(3, parcelQ);
    }
}
