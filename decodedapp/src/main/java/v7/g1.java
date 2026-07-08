package v7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        Bundle bundleA = null;
        s7.c[] cVarArr = null;
        f fVar = null;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                bundleA = w7.b.a(parcel, iQ);
            } else if (iK == 2) {
                cVarArr = (s7.c[]) w7.b.h(parcel, iQ, s7.c.CREATOR);
            } else if (iK == 3) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK != 4) {
                w7.b.y(parcel, iQ);
            } else {
                fVar = (f) w7.b.d(parcel, iQ, f.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new f1(bundleA, cVarArr, iS, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f1[i10];
    }
}
