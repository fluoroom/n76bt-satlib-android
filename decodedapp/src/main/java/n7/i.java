package n7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        boolean zL = false;
        String strE = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                strE = w7.b.e(parcel, iQ);
            } else if (iK != 2) {
                w7.b.y(parcel, iQ);
            } else {
                zL = w7.b.l(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new c(strE, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
