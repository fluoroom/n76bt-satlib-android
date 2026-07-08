package n7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            if (w7.b.k(iQ) != 1) {
                w7.b.y(parcel, iQ);
            } else {
                pendingIntent = (PendingIntent) w7.b.d(parcel, iQ, PendingIntent.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new b(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
