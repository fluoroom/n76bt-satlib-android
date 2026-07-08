package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        byte[] bArrB = null;
        byte[] bArrB2 = null;
        byte[] bArrB3 = null;
        byte[] bArrB4 = null;
        byte[] bArrB5 = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                bArrB = w7.b.b(parcel, iQ);
            } else if (iK == 3) {
                bArrB2 = w7.b.b(parcel, iQ);
            } else if (iK == 4) {
                bArrB3 = w7.b.b(parcel, iQ);
            } else if (iK == 5) {
                bArrB4 = w7.b.b(parcel, iQ);
            } else if (iK != 6) {
                w7.b.y(parcel, iQ);
            } else {
                bArrB5 = w7.b.b(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new c(bArrB, bArrB2, bArrB3, bArrB4, bArrB5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
