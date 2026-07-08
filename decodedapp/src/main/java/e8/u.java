package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        byte[] bArrB = null;
        byte[] bArrB2 = null;
        byte[] bArrB3 = null;
        String[] strArrF = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                bArrB = w7.b.b(parcel, iQ);
            } else if (iK == 3) {
                bArrB2 = w7.b.b(parcel, iQ);
            } else if (iK == 4) {
                bArrB3 = w7.b.b(parcel, iQ);
            } else if (iK != 5) {
                w7.b.y(parcel, iQ);
            } else {
                strArrF = w7.b.f(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new d(bArrB, bArrB2, bArrB3, strArrF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
