package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends l8.q implements q {
    public p() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        l8.d dVarQ = l8.c.q(parcel.readStrongBinder());
        l8.r.b(parcel);
        boolean zA = a(dVarQ);
        parcel2.writeNoException();
        parcel2.writeInt(zA ? 1 : 0);
        return true;
    }
}
