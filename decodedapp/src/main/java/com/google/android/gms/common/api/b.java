package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = null;
        PendingIntent pendingIntent = null;
        s7.a aVar = null;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                strE = w7.b.e(parcel, iQ);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) w7.b.d(parcel, iQ, PendingIntent.CREATOR);
            } else if (iK != 4) {
                w7.b.y(parcel, iQ);
            } else {
                aVar = (s7.a) w7.b.d(parcel, iQ, s7.a.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new Status(iS, strE, pendingIntent, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
