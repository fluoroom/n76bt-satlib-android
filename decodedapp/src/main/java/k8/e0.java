package k8;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        b0 b0Var = null;
        IBinder iBinderR = null;
        IBinder iBinderR2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderR3 = null;
        String strE = null;
        int iS = 1;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 2:
                    b0Var = (b0) w7.b.d(parcel, iQ, b0.CREATOR);
                    break;
                case 3:
                    iBinderR = w7.b.r(parcel, iQ);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) w7.b.d(parcel, iQ, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderR2 = w7.b.r(parcel, iQ);
                    break;
                case 6:
                    iBinderR3 = w7.b.r(parcel, iQ);
                    break;
                case 7:
                default:
                    w7.b.y(parcel, iQ);
                    break;
                case 8:
                    strE = w7.b.e(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new d0(iS, b0Var, iBinderR, iBinderR2, pendingIntent, iBinderR3, strE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0[i10];
    }
}
