package n7;

import android.os.Parcel;
import android.os.Parcelable;
import n7.a;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        byte[] bArrB = null;
        String strE = null;
        boolean zL = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                zL = w7.b.l(parcel, iQ);
            } else if (iK == 2) {
                bArrB = w7.b.b(parcel, iQ);
            } else if (iK != 3) {
                w7.b.y(parcel, iQ);
            } else {
                strE = w7.b.e(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new a.d(zL, bArrB, strE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.d[i10];
    }
}
