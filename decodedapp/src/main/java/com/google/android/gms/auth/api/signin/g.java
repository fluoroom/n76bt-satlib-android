package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strE2 = "";
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 4) {
                strE = w7.b.e(parcel, iQ);
            } else if (iK == 7) {
                googleSignInAccount = (GoogleSignInAccount) w7.b.d(parcel, iQ, GoogleSignInAccount.CREATOR);
            } else if (iK != 8) {
                w7.b.y(parcel, iQ);
            } else {
                strE2 = w7.b.e(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new SignInAccount(strE, googleSignInAccount, strE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
