package p8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends l8.q implements o {
    public n() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        b e0Var;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            e0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            e0Var = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new e0(strongBinder);
        }
        l8.r.b(parcel);
        j0(e0Var);
        parcel2.writeNoException();
        return true;
    }
}
