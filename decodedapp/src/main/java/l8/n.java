package l8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class n extends a implements p {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // l8.p
    public final q8.v V0(int i10, int i11, int i12) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        parcelQ.writeInt(i11);
        parcelQ.writeInt(i12);
        Parcel parcelJ = j(1, parcelQ);
        q8.v vVar = (q8.v) r.a(parcelJ, q8.v.CREATOR);
        parcelJ.recycle();
        return vVar;
    }
}
