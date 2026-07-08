package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        ArrayList arrayList = new ArrayList();
        float fO = 0.0f;
        ArrayList arrayListI = null;
        ArrayList arrayListI2 = null;
        int iS = 0;
        int iS2 = 0;
        float fO2 = 0.0f;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        int iS3 = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 2:
                    arrayListI = w7.b.i(parcel, iQ, LatLng.CREATOR);
                    break;
                case 3:
                    w7.b.u(parcel, iQ, arrayList, o0.class.getClassLoader());
                    break;
                case 4:
                    fO = w7.b.o(parcel, iQ);
                    break;
                case 5:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 6:
                    iS2 = w7.b.s(parcel, iQ);
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
                    iS3 = w7.b.s(parcel, iQ);
                    break;
                case 12:
                    arrayListI2 = w7.b.i(parcel, iQ, k.CREATOR);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new m(arrayListI, arrayList, fO, iS, iS2, fO2, zL, zL2, zL3, iS3, arrayListI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
