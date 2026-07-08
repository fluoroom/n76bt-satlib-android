package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        int iS = 0;
        short sW = 0;
        short sW2 = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                sW = w7.b.w(parcel, iQ);
            } else if (iK != 3) {
                w7.b.y(parcel, iQ);
            } else {
                sW2 = w7.b.w(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new j(iS, sW, sW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
