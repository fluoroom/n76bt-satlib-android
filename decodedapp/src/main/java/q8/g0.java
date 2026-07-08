package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        IBinder iBinderR = null;
        boolean zL = false;
        float fO = 0.0f;
        boolean zL2 = true;
        float fO2 = 0.0f;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                iBinderR = w7.b.r(parcel, iQ);
            } else if (iK == 3) {
                zL = w7.b.l(parcel, iQ);
            } else if (iK == 4) {
                fO = w7.b.o(parcel, iQ);
            } else if (iK == 5) {
                zL2 = w7.b.l(parcel, iQ);
            } else if (iK != 6) {
                w7.b.y(parcel, iQ);
            } else {
                fO2 = w7.b.o(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new x(iBinderR, zL, fO, zL2, fO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
