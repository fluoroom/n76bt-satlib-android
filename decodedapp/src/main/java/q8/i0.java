package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        IBinder iBinderR = null;
        Float fP = null;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 3) {
                iBinderR = w7.b.r(parcel, iQ);
            } else if (iK != 4) {
                w7.b.y(parcel, iQ);
            } else {
                fP = w7.b.p(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new e(iS, iBinderR, fP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
