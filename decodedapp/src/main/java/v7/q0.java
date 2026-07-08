package v7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        IBinder iBinderR = null;
        s7.a aVar = null;
        int iS = 0;
        boolean zL = false;
        boolean zL2 = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                iBinderR = w7.b.r(parcel, iQ);
            } else if (iK == 3) {
                aVar = (s7.a) w7.b.d(parcel, iQ, s7.a.CREATOR);
            } else if (iK == 4) {
                zL = w7.b.l(parcel, iQ);
            } else if (iK != 5) {
                w7.b.y(parcel, iQ);
            } else {
                zL2 = w7.b.l(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new p0(iS, iBinderR, aVar, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p0[i10];
    }
}
