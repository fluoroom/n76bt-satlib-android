package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends w7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f7179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f7180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f7181c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f7180b = googleSignInAccount;
        this.f7179a = q.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f7181c = q.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount b() {
        return this.f7180b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7179a;
        int iA = w7.c.a(parcel);
        w7.c.r(parcel, 4, str, false);
        w7.c.p(parcel, 7, this.f7180b, i10, false);
        w7.c.r(parcel, 8, this.f7181c, false);
        w7.c.b(parcel, iA);
    }
}
