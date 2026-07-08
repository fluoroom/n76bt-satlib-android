package v7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        int iS = 0;
        boolean zL = false;
        boolean zL2 = false;
        int iS2 = 0;
        int iS3 = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                zL = w7.b.l(parcel, iQ);
            } else if (iK == 3) {
                zL2 = w7.b.l(parcel, iQ);
            } else if (iK == 4) {
                iS2 = w7.b.s(parcel, iQ);
            } else if (iK != 5) {
                w7.b.y(parcel, iQ);
            } else {
                iS3 = w7.b.s(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new s(iS, zL, zL2, iS2, iS3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
