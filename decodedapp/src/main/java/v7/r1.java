package v7;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends i8.a implements k {
    r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // v7.k
    public final Account h() {
        Parcel parcelJ = j(2, q());
        Account account = (Account) i8.e.a(parcelJ, Account.CREATOR);
        parcelJ.recycle();
        return account;
    }
}
