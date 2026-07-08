package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends l8.q implements i {
    public h() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        l8.d dVarQ = l8.c.q(parcel.readStrongBinder());
        l8.r.b(parcel);
        a(dVarQ);
        parcel2.writeNoException();
        return true;
    }
}
