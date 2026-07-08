package s8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        ArrayList arrayListG = null;
        String strE = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                arrayListG = w7.b.g(parcel, iQ);
            } else if (iK != 2) {
                w7.b.y(parcel, iQ);
            } else {
                strE = w7.b.e(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new h(arrayListG, strE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
