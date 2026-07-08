package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends l8.q implements q0 {
    public p0() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        l8.x xVarQ = l8.w.q(parcel.readStrongBinder());
        l8.r.b(parcel);
        d0(xVarQ);
        parcel2.writeNoException();
        return true;
    }
}
