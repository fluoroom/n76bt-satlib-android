package p8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends l8.a implements d0 {
    c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // p8.d0
    public final void Q(c8.b bVar, int i10) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        parcelQ.writeInt(19020000);
        x(6, parcelQ);
    }

    @Override // p8.d0
    public final void a1(c8.b bVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        x(11, parcelQ);
    }

    @Override // p8.d0
    public final d e1(c8.b bVar) {
        d i0Var;
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        Parcel parcelJ = j(2, parcelQ);
        IBinder strongBinder = parcelJ.readStrongBinder();
        if (strongBinder == null) {
            i0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            i0Var = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new i0(strongBinder);
        }
        parcelJ.recycle();
        return i0Var;
    }

    @Override // p8.d0
    public final void g1(c8.b bVar, int i10) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        parcelQ.writeInt(i10);
        x(10, parcelQ);
    }

    @Override // p8.d0
    public final int p() {
        Parcel parcelJ = j(9, q());
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    @Override // p8.d0
    public final a t() {
        a tVar;
        Parcel parcelJ = j(4, q());
        IBinder strongBinder = parcelJ.readStrongBinder();
        if (strongBinder == null) {
            tVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            tVar = iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new t(strongBinder);
        }
        parcelJ.recycle();
        return tVar;
    }

    @Override // p8.d0
    public final l8.u u() {
        Parcel parcelJ = j(5, q());
        l8.u uVarQ = l8.t.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return uVarQ;
    }
}
