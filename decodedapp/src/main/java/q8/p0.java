package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        ArrayList arrayListI = null;
        e eVar = null;
        e eVar2 = null;
        ArrayList arrayListI2 = null;
        ArrayList arrayListI3 = null;
        float fO = 0.0f;
        int iS = 0;
        float fO2 = 0.0f;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        int iS2 = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 2:
                    arrayListI = w7.b.i(parcel, iQ, LatLng.CREATOR);
                    break;
                case 3:
                    fO = w7.b.o(parcel, iQ);
                    break;
                case 4:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 5:
                    fO2 = w7.b.o(parcel, iQ);
                    break;
                case 6:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 7:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                case 8:
                    zL3 = w7.b.l(parcel, iQ);
                    break;
                case 9:
                    eVar = (e) w7.b.d(parcel, iQ, e.CREATOR);
                    break;
                case 10:
                    eVar2 = (e) w7.b.d(parcel, iQ, e.CREATOR);
                    break;
                case 11:
                    iS2 = w7.b.s(parcel, iQ);
                    break;
                case 12:
                    arrayListI2 = w7.b.i(parcel, iQ, k.CREATOR);
                    break;
                case 13:
                    arrayListI3 = w7.b.i(parcel, iQ, u.CREATOR);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new o(arrayListI, fO, iS, fO2, zL, zL2, zL3, eVar, eVar2, iS2, arrayListI2, arrayListI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o[i10];
    }
}
