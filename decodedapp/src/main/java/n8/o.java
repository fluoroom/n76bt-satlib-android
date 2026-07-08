package n8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends k8.b implements p {
    public o() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static p q(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new n(iBinder);
    }

    @Override // k8.b
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) k8.k.a(parcel, LocationResult.CREATOR);
            k8.k.d(parcel);
            K(locationResult);
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) k8.k.a(parcel, LocationAvailability.CREATOR);
            k8.k.d(parcel);
            i0(locationAvailability);
        } else {
            if (i10 != 3) {
                return false;
            }
            e();
        }
        return true;
    }
}
