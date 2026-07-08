package g8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class s extends a implements IInterface {
    s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void x(r rVar, n7.a aVar, t7.c cVar) {
        Parcel parcelJ = j();
        n.c(parcelJ, rVar);
        n.b(parcelJ, aVar);
        n.b(parcelJ, cVar);
        q(1, parcelJ);
    }
}
