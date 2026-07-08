package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        i iVar = null;
        p pVar = null;
        b bVar = null;
        r rVar = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iVar = (i) w7.b.d(parcel, iQ, i.CREATOR);
            } else if (iK == 2) {
                pVar = (p) w7.b.d(parcel, iQ, p.CREATOR);
            } else if (iK == 3) {
                bVar = (b) w7.b.d(parcel, iQ, b.CREATOR);
            } else if (iK != 4) {
                w7.b.y(parcel, iQ);
            } else {
                rVar = (r) w7.b.d(parcel, iQ, r.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new a(iVar, pVar, bVar, rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
