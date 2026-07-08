package l8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a implements m {
    k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // l8.m
    public final void c() {
        x(1, q());
    }

    @Override // l8.m
    public final int e() {
        Parcel parcelJ = j(9, q());
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    @Override // l8.m
    public final boolean l0(m mVar) {
        Parcel parcelQ = q();
        r.e(parcelQ, mVar);
        Parcel parcelJ = j(8, parcelQ);
        boolean zF = r.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }
}
