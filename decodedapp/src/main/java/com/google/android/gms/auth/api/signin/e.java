package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        ArrayList arrayListI = null;
        Account account = null;
        String strE = null;
        String strE2 = null;
        ArrayList arrayListI2 = null;
        String strE3 = null;
        int iS = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 2:
                    arrayListI = w7.b.i(parcel, iQ, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) w7.b.d(parcel, iQ, Account.CREATOR);
                    break;
                case 4:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 5:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                case 6:
                    zL3 = w7.b.l(parcel, iQ);
                    break;
                case 7:
                    strE = w7.b.e(parcel, iQ);
                    break;
                case 8:
                    strE2 = w7.b.e(parcel, iQ);
                    break;
                case 9:
                    arrayListI2 = w7.b.i(parcel, iQ, q7.a.CREATOR);
                    break;
                case 10:
                    strE3 = w7.b.e(parcel, iQ);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new GoogleSignInOptions(iS, arrayListI, account, zL, zL2, zL3, strE, strE2, arrayListI2, strE3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
