package l8;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import c8.b;

/* JADX INFO: loaded from: classes.dex */
public final class s extends a implements u {
    s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // l8.u
    public final c8.b L(float f10) {
        Parcel parcelQ = q();
        parcelQ.writeFloat(f10);
        Parcel parcelJ = j(5, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    @Override // l8.u
    public final c8.b R(Bitmap bitmap) {
        Parcel parcelQ = q();
        r.c(parcelQ, bitmap);
        Parcel parcelJ = j(6, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }
}
