package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import q7.o;
import t7.f;
import v7.p;

/* JADX INFO: loaded from: classes.dex */
public class b extends t7.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final f f7182k = new f(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static int f7183l = 1;

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, m7.a.f21787b, googleSignInOptions, new f.a.C0386a().b(new u7.a()).a());
    }

    private final synchronized int y() {
        int i10;
        try {
            i10 = f7183l;
            if (i10 == 1) {
                Context contextO = o();
                s7.d dVarL = s7.d.l();
                int iG = dVarL.g(contextO, 12451000);
                if (iG == 0) {
                    i10 = 4;
                    f7183l = 4;
                } else if (dVarL.a(contextO, iG, null) != null || DynamiteModule.a(contextO, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f7183l = 2;
                } else {
                    i10 = 3;
                    f7183l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    public t8.g w() {
        return p.b(o.b(f(), o(), y() == 3));
    }

    public t8.g x() {
        return p.b(o.a(f(), o(), y() == 3));
    }
}
