package q7;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class v extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f24394c;

    public v(Context context) {
        this.f24394c = context;
    }

    private final void q() {
        if (com.google.android.gms.common.util.h.a(this.f24394c, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }

    @Override // q7.r
    public final void F() {
        q();
        Context context = this.f24394c;
        c cVarB = c.b(context);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f7153u;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        com.google.android.gms.auth.api.signin.b bVarA = com.google.android.gms.auth.api.signin.a.a(context, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.w();
        } else {
            bVarA.x();
        }
    }

    @Override // q7.r
    public final void O() {
        q();
        p.a(this.f24394c).b();
    }
}
