package v7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = null;
        String strE2 = null;
        long jV = 0;
        long jV2 = 0;
        int iS = 0;
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        int iS5 = -1;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 2:
                    iS2 = w7.b.s(parcel, iQ);
                    break;
                case 3:
                    iS3 = w7.b.s(parcel, iQ);
                    break;
                case 4:
                    jV = w7.b.v(parcel, iQ);
                    break;
                case 5:
                    jV2 = w7.b.v(parcel, iQ);
                    break;
                case 6:
                    strE = w7.b.e(parcel, iQ);
                    break;
                case 7:
                    strE2 = w7.b.e(parcel, iQ);
                    break;
                case 8:
                    iS4 = w7.b.s(parcel, iQ);
                    break;
                case 9:
                    iS5 = w7.b.s(parcel, iQ);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new n(iS, iS2, iS3, jV, jV2, strE, strE2, iS4, iS5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
