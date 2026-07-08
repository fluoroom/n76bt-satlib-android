package p8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends l8.q implements v {
    public u() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    @Override // l8.q
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        l8.g gVarQ = l8.f.q(parcel.readStrongBinder());
        l8.r.b(parcel);
        W(gVarQ);
        parcel2.writeNoException();
        return true;
    }
}
