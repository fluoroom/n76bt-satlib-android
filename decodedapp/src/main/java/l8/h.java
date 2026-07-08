package l8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a implements j {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // l8.j
    public final void C() {
        x(1, q());
    }

    @Override // l8.j
    public final int H() {
        Parcel parcelJ = j(16, q());
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    @Override // l8.j
    public final void N0(boolean z10) {
        Parcel parcelQ = q();
        int i10 = r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(17, parcelQ);
    }

    @Override // l8.j
    public final void k(float f10) {
        Parcel parcelQ = q();
        parcelQ.writeFloat(f10);
        x(9, parcelQ);
    }

    @Override // l8.j
    public final boolean k1(j jVar) {
        Parcel parcelQ = q();
        r.e(parcelQ, jVar);
        Parcel parcelJ = j(15, parcelQ);
        boolean zF = r.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // l8.j
    public final void w0(boolean z10) {
        Parcel parcelQ = q();
        int i10 = r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(11, parcelQ);
    }
}
