package k8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 extends b implements x0 {
    public w0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // k8.b
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            t0 t0Var = (t0) k.a(parcel, t0.CREATOR);
            k.d(parcel);
            Z0(t0Var);
        } else {
            if (i10 != 2) {
                return false;
            }
            t();
        }
        return true;
    }
}
