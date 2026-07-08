package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        LatLng latLng = null;
        String strE = null;
        String strE2 = null;
        IBinder iBinderR = null;
        IBinder iBinderR2 = null;
        String strE3 = null;
        float fO = 0.0f;
        float fO2 = 0.0f;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        float fO3 = 0.0f;
        float fO4 = 0.5f;
        float fO5 = 0.0f;
        float fO6 = 1.0f;
        float fO7 = 0.0f;
        int iS = 0;
        int iS2 = 0;
        float fO8 = 0.0f;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 2:
                    latLng = (LatLng) w7.b.d(parcel, iQ, LatLng.CREATOR);
                    break;
                case 3:
                    strE = w7.b.e(parcel, iQ);
                    break;
                case 4:
                    strE2 = w7.b.e(parcel, iQ);
                    break;
                case 5:
                    iBinderR = w7.b.r(parcel, iQ);
                    break;
                case 6:
                    fO = w7.b.o(parcel, iQ);
                    break;
                case 7:
                    fO2 = w7.b.o(parcel, iQ);
                    break;
                case 8:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 9:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                case 10:
                    zL3 = w7.b.l(parcel, iQ);
                    break;
                case 11:
                    fO3 = w7.b.o(parcel, iQ);
                    break;
                case 12:
                    fO4 = w7.b.o(parcel, iQ);
                    break;
                case 13:
                    fO5 = w7.b.o(parcel, iQ);
                    break;
                case 14:
                    fO6 = w7.b.o(parcel, iQ);
                    break;
                case 15:
                    fO7 = w7.b.o(parcel, iQ);
                    break;
                case 16:
                default:
                    w7.b.y(parcel, iQ);
                    break;
                case 17:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 18:
                    iBinderR2 = w7.b.r(parcel, iQ);
                    break;
                case 19:
                    iS2 = w7.b.s(parcel, iQ);
                    break;
                case 20:
                    strE3 = w7.b.e(parcel, iQ);
                    break;
                case 21:
                    fO8 = w7.b.o(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new j(latLng, strE, strE2, iBinderR, fO, fO2, zL, zL2, zL3, fO3, fO4, fO5, fO6, fO7, iS, iBinderR2, iS2, strE3, fO8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
