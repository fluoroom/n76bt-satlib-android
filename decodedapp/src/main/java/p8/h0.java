package p8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends l8.q implements c {
    public h0() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        m lVar;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                lVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                lVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new l(strongBinder);
            }
            l8.r.b(parcel);
            g0(lVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }
}
