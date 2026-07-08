package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        double dN = 0.0d;
        double dN2 = 0.0d;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                dN = w7.b.n(parcel, iQ);
            } else if (iK != 3) {
                w7.b.y(parcel, iQ);
            } else {
                dN2 = w7.b.n(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new LatLng(dN, dN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLng[i10];
    }
}
