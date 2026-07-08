package l8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a implements g {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // l8.g
    public final boolean D0(g gVar) {
        Parcel parcelQ = q();
        r.e(parcelQ, gVar);
        Parcel parcelJ = j(19, parcelQ);
        boolean zF = r.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // l8.g
    public final void U0(boolean z10) {
        Parcel parcelQ = q();
        int i10 = r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(15, parcelQ);
    }

    @Override // l8.g
    public final int c() {
        Parcel parcelJ = j(20, q());
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    @Override // l8.g
    public final void m() {
        x(1, q());
    }

    @Override // l8.g
    public final void p1(boolean z10) {
        Parcel parcelQ = q();
        int i10 = r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(21, parcelQ);
    }

    @Override // l8.g
    public final void s0(float f10) {
        Parcel parcelQ = q();
        parcelQ.writeFloat(f10);
        x(13, parcelQ);
    }
}
