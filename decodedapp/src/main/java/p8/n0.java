package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends l8.q implements o0 {
    public n0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        l8.r.b(parcel);
        a0(i12);
        parcel2.writeNoException();
        return true;
    }
}
