package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        IBinder iBinderR = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            if (w7.b.k(iQ) != 2) {
                w7.b.y(parcel, iQ);
            } else {
                iBinderR = w7.b.r(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new s(iBinderR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
