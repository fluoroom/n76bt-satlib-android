package v7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends w7.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f30443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f30444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f30446d;

    n0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f30443a = i10;
        this.f30444b = account;
        this.f30445c = i11;
        this.f30446d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f30443a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.p(parcel, 2, this.f30444b, i10, false);
        w7.c.k(parcel, 3, this.f30445c);
        w7.c.p(parcel, 4, this.f30446d, i10, false);
        w7.c.b(parcel, iA);
    }

    public n0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
