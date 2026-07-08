package q8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        double dN = 0.0d;
        t tVar = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                tVar = (t) w7.b.d(parcel, iQ, t.CREATOR);
            } else if (iK != 3) {
                w7.b.y(parcel, iQ);
            } else {
                dN = w7.b.n(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new u(tVar, dN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
