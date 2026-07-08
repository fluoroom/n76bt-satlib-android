package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends l8.q implements k0 {
    public j0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        h();
        parcel2.writeNoException();
        return true;
    }
}
