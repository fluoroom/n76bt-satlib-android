package q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        String strE = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                strE = w7.b.e(parcel, iQ);
            } else if (iK != 5) {
                w7.b.y(parcel, iQ);
            } else {
                googleSignInOptions = (GoogleSignInOptions) w7.b.d(parcel, iQ, GoogleSignInOptions.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new SignInConfiguration(strE, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
