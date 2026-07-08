package v7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iS = 0;
        int iS2 = 0;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 1) {
                iS = w7.b.s(parcel, iQ);
            } else if (iK == 2) {
                account = (Account) w7.b.d(parcel, iQ, Account.CREATOR);
            } else if (iK == 3) {
                iS2 = w7.b.s(parcel, iQ);
            } else if (iK != 4) {
                w7.b.y(parcel, iQ);
            } else {
                googleSignInAccount = (GoogleSignInAccount) w7.b.d(parcel, iQ, GoogleSignInAccount.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new n0(iS, account, iS2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n0[i10];
    }
}
