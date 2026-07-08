package q7;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p f24390d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c f24391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f24392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f24393c;

    private p(Context context) {
        c cVarB = c.b(context);
        this.f24391a = cVarB;
        this.f24392b = cVarB.c();
        this.f24393c = cVarB.d();
    }

    public static synchronized p a(Context context) {
        return d(context.getApplicationContext());
    }

    private static synchronized p d(Context context) {
        p pVar = f24390d;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(context);
        f24390d = pVar2;
        return pVar2;
    }

    public final synchronized void b() {
        this.f24391a.a();
        this.f24392b = null;
        this.f24393c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f24391a.f(googleSignInAccount, googleSignInOptions);
        this.f24392b = googleSignInAccount;
        this.f24393c = googleSignInOptions;
    }
}
