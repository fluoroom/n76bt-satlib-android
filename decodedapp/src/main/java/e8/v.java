package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        int iS = 0;
        String strE = null;
        int iS2 = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 3) {
                strE = w7.b.e(parcel, iQ);
            } else if (iK != 4) {
                w7.b.y(parcel, iQ);
            } else {
                iS2 = w7.b.s(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new e(iS, strE, iS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
