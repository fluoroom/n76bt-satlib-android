package com.google.android.gms.auth.api.signin;

import android.content.Context;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) q.i(googleSignInOptions));
    }
}
