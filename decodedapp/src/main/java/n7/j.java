package n7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n7.a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = null;
        String strE2 = null;
        String strE3 = null;
        ArrayList arrayListG = null;
        ArrayList arrayListI = null;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 2:
                    strE = w7.b.e(parcel, iQ);
                    break;
                case 3:
                    strE2 = w7.b.e(parcel, iQ);
                    break;
                case 4:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                case 5:
                    strE3 = w7.b.e(parcel, iQ);
                    break;
                case 6:
                    arrayListG = w7.b.g(parcel, iQ);
                    break;
                case 7:
                    zL3 = w7.b.l(parcel, iQ);
                    break;
                case 8:
                    arrayListI = w7.b.i(parcel, iQ, c.CREATOR);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new a.b(zL, strE, strE2, zL2, strE3, arrayListG, zL3, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.b[i10];
    }
}
