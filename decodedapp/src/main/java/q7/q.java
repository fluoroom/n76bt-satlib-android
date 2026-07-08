package q7;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends g8.l implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // g8.l
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            F();
        } else {
            if (i10 != 2) {
                return false;
            }
            O();
        }
        return true;
    }
}
