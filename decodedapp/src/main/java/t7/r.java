package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        int iS = 0;
        int iS2 = 0;
        int iS3 = 0;
        boolean zL = true;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                iS2 = w7.b.s(parcel, iQ);
            } else if (iK == 3) {
                iS3 = w7.b.s(parcel, iQ);
            } else if (iK != 4) {
                w7.b.y(parcel, iQ);
            } else {
                zL = w7.b.l(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new e(iS, iS2, iS3, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
