package s8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h8.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void v1(j jVar, f fVar) {
        Parcel parcelJ = j();
        h8.c.c(parcelJ, jVar);
        h8.c.d(parcelJ, fVar);
        q(12, parcelJ);
    }
}
