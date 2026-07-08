package n7;

import android.os.Parcel;
import android.os.Parcelable;
import n7.a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        a.e eVar = null;
        a.b bVar = null;
        String strE = null;
        a.d dVar = null;
        a.c cVar = null;
        boolean zL = false;
        int iS = 0;
        boolean zL2 = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    eVar = (a.e) w7.b.d(parcel, iQ, a.e.CREATOR);
                    break;
                case 2:
                    bVar = (a.b) w7.b.d(parcel, iQ, a.b.CREATOR);
                    break;
                case 3:
                    strE = w7.b.e(parcel, iQ);
                    break;
                case 4:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 5:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 6:
                    dVar = (a.d) w7.b.d(parcel, iQ, a.d.CREATOR);
                    break;
                case 7:
                    cVar = (a.c) w7.b.d(parcel, iQ, a.c.CREATOR);
                    break;
                case 8:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new a(eVar, bVar, strE, zL, iS, dVar, cVar, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
