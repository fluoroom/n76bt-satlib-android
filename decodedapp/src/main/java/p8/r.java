package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends l8.q implements s {
    public r() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            l8.d dVarQ = l8.c.q(parcel.readStrongBinder());
            l8.r.b(parcel);
            F0(dVarQ);
        } else if (i10 == 2) {
            l8.d dVarQ2 = l8.c.q(parcel.readStrongBinder());
            l8.r.b(parcel);
            a(dVarQ2);
        } else {
            if (i10 != 3) {
                return false;
            }
            l8.d dVarQ3 = l8.c.q(parcel.readStrongBinder());
            l8.r.b(parcel);
            r(dVarQ3);
        }
        parcel2.writeNoException();
        return true;
    }
}
