package v7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        s sVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zL = false;
        boolean zL2 = false;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    sVar = (s) w7.b.d(parcel, iQ, s.CREATOR);
                    break;
                case 2:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 3:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                case 4:
                    iArrC = w7.b.c(parcel, iQ);
                    break;
                case 5:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 6:
                    iArrC2 = w7.b.c(parcel, iQ);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new f(sVar, zL, zL2, iArrC, iS, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
