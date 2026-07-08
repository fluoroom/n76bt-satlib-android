package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f15945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15946d;

    protected a(IBinder iBinder, String str) {
        this.f15945c = iBinder;
        this.f15946d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15945c;
    }

    protected final Parcel j(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f15945c.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel q() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15946d);
        return parcelObtain;
    }
}
