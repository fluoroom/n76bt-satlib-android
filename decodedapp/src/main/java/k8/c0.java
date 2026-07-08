package k8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        long jV = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListI = null;
        String strE = null;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                locationRequest = (LocationRequest) w7.b.d(parcel, iQ, LocationRequest.CREATOR);
            } else if (iK == 5) {
                arrayListI = w7.b.i(parcel, iQ, v7.d.CREATOR);
            } else if (iK == 8) {
                zL = w7.b.l(parcel, iQ);
            } else if (iK != 9) {
                switch (iK) {
                    case 11:
                        zL3 = w7.b.l(parcel, iQ);
                        break;
                    case 12:
                        zL4 = w7.b.l(parcel, iQ);
                        break;
                    case 13:
                        strE = w7.b.e(parcel, iQ);
                        break;
                    case 14:
                        jV = w7.b.v(parcel, iQ);
                        break;
                    default:
                        w7.b.y(parcel, iQ);
                        break;
                }
            } else {
                zL2 = w7.b.l(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new b0(locationRequest, arrayListI, zL, zL2, zL3, zL4, strE, jV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b0[i10];
    }
}
