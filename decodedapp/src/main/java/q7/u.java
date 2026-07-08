package q7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class u extends g8.a implements IInterface {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void v1(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelJ = j();
        g8.n.c(parcelJ, tVar);
        g8.n.b(parcelJ, googleSignInOptions);
        q(103, parcelJ);
    }

    public final void x(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelJ = j();
        g8.n.c(parcelJ, tVar);
        g8.n.b(parcelJ, googleSignInOptions);
        q(102, parcelJ);
    }
}
