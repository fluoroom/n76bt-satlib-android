package s8;

import android.os.Parcel;
import android.os.Parcelable;
import v7.p0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        s7.a aVar = null;
        p0 p0Var = null;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                aVar = (s7.a) w7.b.d(parcel, iQ, s7.a.CREATOR);
            } else if (iK != 3) {
                w7.b.y(parcel, iQ);
            } else {
                p0Var = (p0) w7.b.d(parcel, iQ, p0.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new l(iS, aVar, p0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
