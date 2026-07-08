package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q7.b;
import q7.w;
import v7.q;
import w7.c;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends w7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f7185b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f7184a = q.f(str);
        this.f7185b = googleSignInOptions;
    }

    public final GoogleSignInOptions b() {
        return this.f7185b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f7184a.equals(signInConfiguration.f7184a)) {
            GoogleSignInOptions googleSignInOptions = this.f7185b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f7185b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f7184a).a(this.f7185b).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7184a;
        int iA = c.a(parcel);
        c.r(parcel, 2, str, false);
        c.p(parcel, 5, this.f7185b, i10, false);
        c.b(parcel, iA);
    }
}
