package q7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        Bundle bundleA = null;
        int iS = 0;
        int iS2 = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                iS2 = w7.b.s(parcel, iQ);
            } else if (iK != 3) {
                w7.b.y(parcel, iQ);
            } else {
                bundleA = w7.b.a(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new a(iS, iS2, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
