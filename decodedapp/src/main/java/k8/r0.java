package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = null;
        String strE2 = null;
        String strE3 = null;
        ArrayList arrayListI = null;
        y yVar = null;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 3) {
                strE = w7.b.e(parcel, iQ);
            } else if (iK == 4) {
                strE2 = w7.b.e(parcel, iQ);
            } else if (iK == 6) {
                strE3 = w7.b.e(parcel, iQ);
            } else if (iK == 7) {
                yVar = (y) w7.b.d(parcel, iQ, y.CREATOR);
            } else if (iK != 8) {
                w7.b.y(parcel, iQ);
            } else {
                arrayListI = w7.b.i(parcel, iQ, s7.c.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new y(iS, strE, strE2, strE3, arrayListI, yVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new y[i10];
    }
}
