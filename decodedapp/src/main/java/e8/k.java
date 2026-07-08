package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = null;
        String strE2 = null;
        byte[] bArrB = null;
        d dVar = null;
        c cVar = null;
        e eVar = null;
        a aVar = null;
        String strE3 = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    strE = w7.b.e(parcel, iQ);
                    break;
                case 2:
                    strE2 = w7.b.e(parcel, iQ);
                    break;
                case 3:
                    bArrB = w7.b.b(parcel, iQ);
                    break;
                case 4:
                    dVar = (d) w7.b.d(parcel, iQ, d.CREATOR);
                    break;
                case 5:
                    cVar = (c) w7.b.d(parcel, iQ, c.CREATOR);
                    break;
                case 6:
                    eVar = (e) w7.b.d(parcel, iQ, e.CREATOR);
                    break;
                case 7:
                    aVar = (a) w7.b.d(parcel, iQ, a.CREATOR);
                    break;
                case 8:
                    strE3 = w7.b.e(parcel, iQ);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new h(strE, strE2, bArrB, dVar, cVar, eVar, aVar, strE3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
