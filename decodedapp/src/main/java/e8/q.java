package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        byte[] bArrB = null;
        byte[] bArrB2 = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                bArrB = w7.b.b(parcel, iQ);
            } else if (iK != 2) {
                w7.b.y(parcel, iQ);
            } else {
                bArrB2 = w7.b.b(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new p(bArrB, bArrB2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
