package k8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        Status status = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            if (w7.b.k(iQ) != 1) {
                w7.b.y(parcel, iQ);
            } else {
                status = (Status) w7.b.d(parcel, iQ, Status.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new t0(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t0[i10];
    }
}
