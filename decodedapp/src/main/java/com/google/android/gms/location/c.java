package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        List listI = LocationResult.f7293b;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            if (w7.b.k(iQ) != 1) {
                w7.b.y(parcel, iQ);
            } else {
                listI = w7.b.i(parcel, iQ, Location.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new LocationResult(listI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
