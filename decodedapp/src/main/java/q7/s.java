package q7;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends g8.l implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // g8.l
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) g8.n.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) g8.n.a(parcel, Status.CREATOR);
                g8.n.d(parcel);
                S(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) g8.n.a(parcel, Status.CREATOR);
                g8.n.d(parcel);
                K0(status2);
                break;
            case 103:
                Status status3 = (Status) g8.n.a(parcel, Status.CREATOR);
                g8.n.d(parcel);
                Y0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
