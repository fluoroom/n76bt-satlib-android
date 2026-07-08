package g8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f13669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13670d;

    protected a(IBinder iBinder, String str) {
        this.f13669c = iBinder;
        this.f13670d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13669c;
    }

    protected final Parcel j() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f13670d);
        return parcelObtain;
    }

    protected final void q(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f13669c.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
