package k8;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        IBinder iBinderR = null;
        IBinder iBinderR2 = null;
        PendingIntent pendingIntent = null;
        String strE = null;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                iBinderR = w7.b.r(parcel, iQ);
            } else if (iK == 3) {
                iBinderR2 = w7.b.r(parcel, iQ);
            } else if (iK == 4) {
                pendingIntent = (PendingIntent) w7.b.d(parcel, iQ, PendingIntent.CREATOR);
            } else if (iK != 6) {
                w7.b.y(parcel, iQ);
            } else {
                strE = w7.b.e(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new z(iS, iBinderR, iBinderR2, pendingIntent, strE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
