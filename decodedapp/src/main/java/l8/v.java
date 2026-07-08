package l8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class v extends a implements x {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // l8.x
    public final boolean M0(x xVar) {
        Parcel parcelQ = q();
        r.e(parcelQ, xVar);
        Parcel parcelJ = j(19, parcelQ);
        boolean zF = r.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // l8.x
    public final void b0() {
        x(1, q());
    }

    @Override // l8.x
    public final int c() {
        Parcel parcelJ = j(20, q());
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    @Override // l8.x
    public final void n1(boolean z10) {
        Parcel parcelQ = q();
        int i10 = r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(15, parcelQ);
    }
}
