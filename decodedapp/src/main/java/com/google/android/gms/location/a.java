package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stetho.websocket.CloseCodes;
import n8.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        h[] hVarArr = null;
        long jV = 0;
        int iS = CloseCodes.NORMAL_CLOSURE;
        int iS2 = 1;
        int iS3 = 1;
        boolean zL = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    iS2 = w7.b.s(parcel, iQ);
                    break;
                case 2:
                    iS3 = w7.b.s(parcel, iQ);
                    break;
                case 3:
                    jV = w7.b.v(parcel, iQ);
                    break;
                case 4:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 5:
                    hVarArr = (h[]) w7.b.h(parcel, iQ, h.CREATOR);
                    break;
                case 6:
                    zL = w7.b.l(parcel, iQ);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new LocationAvailability(iS, iS2, iS3, jV, hVarArr, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
