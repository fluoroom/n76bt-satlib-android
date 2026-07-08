package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends l8.q implements x {
    public w() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        l8.j jVarQ = l8.i.q(parcel.readStrongBinder());
        l8.r.b(parcel);
        k0(jVarQ);
        parcel2.writeNoException();
        return true;
    }
}
