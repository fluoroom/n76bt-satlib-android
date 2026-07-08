package v7;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class u0 implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f30482c;

    u0(IBinder iBinder) {
        this.f30482c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30482c;
    }

    @Override // v7.m
    public final void r0(l lVar, g gVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
            if (gVar != null) {
                parcelObtain.writeInt(1);
                i1.a(gVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f30482c.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
