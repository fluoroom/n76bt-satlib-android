package k8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f19479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19480d;

    protected a(IBinder iBinder, String str) {
        this.f19479c = iBinder;
        this.f19480d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19479c;
    }

    protected final Parcel j() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f19480d);
        return parcelObtain;
    }

    protected final void q(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f19479c.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
