package q8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        s sVar = null;
        float fO = 0.0f;
        int iS = 0;
        int iS2 = 0;
        boolean zL = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                fO = w7.b.o(parcel, iQ);
            } else if (iK == 3) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 4) {
                iS2 = w7.b.s(parcel, iQ);
            } else if (iK == 5) {
                zL = w7.b.l(parcel, iQ);
            } else if (iK != 6) {
                w7.b.y(parcel, iQ);
            } else {
                sVar = (s) w7.b.d(parcel, iQ, s.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new t(fO, iS, iS2, zL, sVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
