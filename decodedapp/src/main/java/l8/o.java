package l8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends q implements p {
    public o() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static p q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new n(iBinder);
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        r.b(parcel);
        q8.v vVarV0 = V0(i12, i13, i14);
        parcel2.writeNoException();
        r.d(parcel2, vVarV0);
        return true;
    }
}
