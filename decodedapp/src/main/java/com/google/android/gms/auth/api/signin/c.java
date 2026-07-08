package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = null;
        String strE2 = null;
        String strE3 = null;
        String strE4 = null;
        Uri uri = null;
        String strE5 = null;
        String strE6 = null;
        ArrayList arrayListI = null;
        String strE7 = null;
        String strE8 = null;
        long jV = 0;
        int iS = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 2:
                    strE = w7.b.e(parcel, iQ);
                    break;
                case 3:
                    strE2 = w7.b.e(parcel, iQ);
                    break;
                case 4:
                    strE3 = w7.b.e(parcel, iQ);
                    break;
                case 5:
                    strE4 = w7.b.e(parcel, iQ);
                    break;
                case 6:
                    uri = (Uri) w7.b.d(parcel, iQ, Uri.CREATOR);
                    break;
                case 7:
                    strE5 = w7.b.e(parcel, iQ);
                    break;
                case 8:
                    jV = w7.b.v(parcel, iQ);
                    break;
                case 9:
                    strE6 = w7.b.e(parcel, iQ);
                    break;
                case 10:
                    arrayListI = w7.b.i(parcel, iQ, Scope.CREATOR);
                    break;
                case 11:
                    strE7 = w7.b.e(parcel, iQ);
                    break;
                case 12:
                    strE8 = w7.b.e(parcel, iQ);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new GoogleSignInAccount(iS, strE, strE2, strE3, strE4, uri, strE5, jV, strE6, arrayListI, strE7, strE8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
