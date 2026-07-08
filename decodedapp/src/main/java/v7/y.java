package v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        ArrayList arrayListI = null;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK != 2) {
                w7.b.y(parcel, iQ);
            } else {
                arrayListI = w7.b.i(parcel, iQ, n.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new t(iS, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
