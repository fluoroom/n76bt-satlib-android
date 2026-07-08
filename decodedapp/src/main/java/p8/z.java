package p8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class z extends l8.a implements f {
    z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // p8.f
    public final void B0(boolean z10) {
        Parcel parcelQ = q();
        int i10 = l8.r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(7, parcelQ);
    }

    @Override // p8.f
    public final void J(boolean z10) {
        Parcel parcelQ = q();
        int i10 = l8.r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(3, parcelQ);
    }

    @Override // p8.f
    public final void o0(boolean z10) {
        Parcel parcelQ = q();
        int i10 = l8.r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(6, parcelQ);
    }

    @Override // p8.f
    public final void y0(boolean z10) {
        Parcel parcelQ = q();
        int i10 = l8.r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(1, parcelQ);
    }
}
