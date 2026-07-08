package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends l8.q implements g0 {
    public f0() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            l8.d dVarQ = l8.c.q(parcel.readStrongBinder());
            l8.r.b(parcel);
            c8.b bVarR = r(dVarQ);
            parcel2.writeNoException();
            l8.r.e(parcel2, bVarR);
        } else {
            if (i10 != 2) {
                return false;
            }
            l8.d dVarQ2 = l8.c.q(parcel.readStrongBinder());
            l8.r.b(parcel);
            c8.b bVarA = a(dVarQ2);
            parcel2.writeNoException();
            l8.r.e(parcel2, bVarA);
        }
        return true;
    }
}
