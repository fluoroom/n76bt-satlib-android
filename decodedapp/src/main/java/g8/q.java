package g8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends l implements r {
    public q() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // g8.l
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) n.a(parcel, Status.CREATOR);
        n7.b bVar = (n7.b) n.a(parcel, n7.b.CREATOR);
        n.d(parcel);
        A(status, bVar);
        return true;
    }
}
