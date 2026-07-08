package s8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends h8.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // h8.b
    protected final boolean v1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                h8.c.b(parcel);
                break;
            case 4:
                h8.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                h8.c.b(parcel);
                break;
            case 7:
                h8.c.b(parcel);
                break;
            case 8:
                l lVar = (l) h8.c.a(parcel, l.CREATOR);
                h8.c.b(parcel);
                G0(lVar);
                break;
            case 9:
                h8.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
