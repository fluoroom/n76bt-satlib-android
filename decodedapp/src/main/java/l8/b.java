package l8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements d {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // l8.d
    public final void G(boolean z10) {
        Parcel parcelQ = q();
        int i10 = r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(14, parcelQ);
    }

    @Override // l8.d
    public final String J0() {
        Parcel parcelJ = j(8, q());
        String string = parcelJ.readString();
        parcelJ.recycle();
        return string;
    }

    @Override // l8.d
    public final void N(LatLng latLng) {
        Parcel parcelQ = q();
        r.c(parcelQ, latLng);
        x(3, parcelQ);
    }

    @Override // l8.d
    public final void P0(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        x(7, parcelQ);
    }

    @Override // l8.d
    public final boolean U(d dVar) {
        Parcel parcelQ = q();
        r.e(parcelQ, dVar);
        Parcel parcelJ = j(16, parcelQ);
        boolean zF = r.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // l8.d
    public final String W0() {
        Parcel parcelJ = j(6, q());
        String string = parcelJ.readString();
        parcelJ.recycle();
        return string;
    }

    @Override // l8.d
    public final void X(c8.b bVar) {
        Parcel parcelQ = q();
        r.e(parcelQ, bVar);
        x(18, parcelQ);
    }

    @Override // l8.d
    public final float e() {
        Parcel parcelJ = j(28, q());
        float f10 = parcelJ.readFloat();
        parcelJ.recycle();
        return f10;
    }

    @Override // l8.d
    public final boolean f1() {
        Parcel parcelJ = j(13, q());
        boolean zF = r.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // l8.d
    public final void k(float f10) {
        Parcel parcelQ = q();
        parcelQ.writeFloat(f10);
        x(27, parcelQ);
    }

    @Override // l8.d
    public final boolean l1() {
        Parcel parcelJ = j(15, q());
        boolean zF = r.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // l8.d
    public final void m() {
        x(1, q());
    }

    @Override // l8.d
    public final void n0() {
        x(11, q());
    }

    @Override // l8.d
    public final LatLng u() {
        Parcel parcelJ = j(4, q());
        LatLng latLng = (LatLng) r.a(parcelJ, LatLng.CREATOR);
        parcelJ.recycle();
        return latLng;
    }

    @Override // l8.d
    public final int x0() {
        Parcel parcelJ = j(17, q());
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    @Override // l8.d
    public final void z(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        x(5, parcelQ);
    }
}
