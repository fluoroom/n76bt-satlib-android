package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import w7.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = b.z(parcel);
        CameraPosition cameraPosition = null;
        Float fP = null;
        Float fP2 = null;
        LatLngBounds latLngBounds = null;
        Integer numT = null;
        String strE = null;
        byte bM = -1;
        byte bM2 = -1;
        int iS = 0;
        byte bM3 = -1;
        byte bM4 = -1;
        byte bM5 = -1;
        byte bM6 = -1;
        byte bM7 = -1;
        byte bM8 = -1;
        byte bM9 = -1;
        byte bM10 = -1;
        byte bM11 = -1;
        byte bM12 = -1;
        int iS2 = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = b.q(parcel);
            switch (b.k(iQ)) {
                case 2:
                    bM = b.m(parcel, iQ);
                    break;
                case 3:
                    bM2 = b.m(parcel, iQ);
                    break;
                case 4:
                    iS = b.s(parcel, iQ);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) b.d(parcel, iQ, CameraPosition.CREATOR);
                    break;
                case 6:
                    bM3 = b.m(parcel, iQ);
                    break;
                case 7:
                    bM4 = b.m(parcel, iQ);
                    break;
                case 8:
                    bM5 = b.m(parcel, iQ);
                    break;
                case 9:
                    bM6 = b.m(parcel, iQ);
                    break;
                case 10:
                    bM7 = b.m(parcel, iQ);
                    break;
                case 11:
                    bM8 = b.m(parcel, iQ);
                    break;
                case 12:
                    bM9 = b.m(parcel, iQ);
                    break;
                case 13:
                case 22:
                default:
                    b.y(parcel, iQ);
                    break;
                case 14:
                    bM10 = b.m(parcel, iQ);
                    break;
                case 15:
                    bM11 = b.m(parcel, iQ);
                    break;
                case 16:
                    fP = b.p(parcel, iQ);
                    break;
                case 17:
                    fP2 = b.p(parcel, iQ);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) b.d(parcel, iQ, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bM12 = b.m(parcel, iQ);
                    break;
                case 20:
                    numT = b.t(parcel, iQ);
                    break;
                case 21:
                    strE = b.e(parcel, iQ);
                    break;
                case 23:
                    iS2 = b.s(parcel, iQ);
                    break;
            }
        }
        b.j(parcel, iZ);
        return new GoogleMapOptions(bM, bM2, iS, cameraPosition, bM3, bM4, bM5, bM6, bM7, bM8, bM9, bM10, bM11, fP, fP2, latLngBounds, bM12, numT, strE, iS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
