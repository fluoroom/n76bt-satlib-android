package n7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = null;
        String strE2 = null;
        String strE3 = null;
        String strE4 = null;
        Uri uri = null;
        String strE5 = null;
        String strE6 = null;
        String strE7 = null;
        e8.h hVar = null;
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
                    strE3 = w7.b.e(parcel, iQ);
                    break;
                case 4:
                    strE4 = w7.b.e(parcel, iQ);
                    break;
                case 5:
                    uri = (Uri) w7.b.d(parcel, iQ, Uri.CREATOR);
                    break;
                case 6:
                    strE5 = w7.b.e(parcel, iQ);
                    break;
                case 7:
                    strE6 = w7.b.e(parcel, iQ);
                    break;
                case 8:
                    strE7 = w7.b.e(parcel, iQ);
                    break;
                case 9:
                    hVar = (e8.h) w7.b.d(parcel, iQ, e8.h.CREATOR);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new f(strE, strE2, strE3, strE4, uri, strE5, strE6, strE7, hVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
