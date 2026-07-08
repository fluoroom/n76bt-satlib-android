package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.appcompat.widget.ActivityChooserView;
import k8.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        WorkSource workSource = new WorkSource();
        y yVar = null;
        long jV = -1;
        long jV2 = Long.MAX_VALUE;
        long jV3 = Long.MAX_VALUE;
        long jV4 = 0;
        long jV5 = 600000;
        long jV6 = 3600000;
        int iS = 102;
        int iS2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        float fO = 0.0f;
        boolean zL = false;
        int iS3 = 0;
        int iS4 = 0;
        boolean zL2 = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 2:
                    jV6 = w7.b.v(parcel, iQ);
                    break;
                case 3:
                    jV5 = w7.b.v(parcel, iQ);
                    break;
                case 4:
                case 14:
                default:
                    w7.b.y(parcel, iQ);
                    break;
                case 5:
                    jV2 = w7.b.v(parcel, iQ);
                    break;
                case 6:
                    iS2 = w7.b.s(parcel, iQ);
                    break;
                case 7:
                    fO = w7.b.o(parcel, iQ);
                    break;
                case 8:
                    jV4 = w7.b.v(parcel, iQ);
                    break;
                case 9:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 10:
                    jV3 = w7.b.v(parcel, iQ);
                    break;
                case 11:
                    jV = w7.b.v(parcel, iQ);
                    break;
                case 12:
                    iS3 = w7.b.s(parcel, iQ);
                    break;
                case 13:
                    iS4 = w7.b.s(parcel, iQ);
                    break;
                case 15:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                case 16:
                    workSource = (WorkSource) w7.b.d(parcel, iQ, WorkSource.CREATOR);
                    break;
                case 17:
                    yVar = (y) w7.b.d(parcel, iQ, y.CREATOR);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new LocationRequest(iS, jV6, jV5, jV4, jV2, jV3, iS2, fO, zL, jV, iS3, iS4, zL2, workSource, yVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
