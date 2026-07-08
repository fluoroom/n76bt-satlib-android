package n7;

import android.os.Parcel;
import android.os.Parcelable;
import n7.a;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        boolean zL = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            if (w7.b.k(iQ) != 1) {
                w7.b.y(parcel, iQ);
            } else {
                zL = w7.b.l(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new a.e(zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.e[i10];
    }
}
