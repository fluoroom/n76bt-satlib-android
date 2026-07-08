package h8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f15171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15172d;

    protected a(IBinder iBinder, String str) {
        this.f15171c = iBinder;
        this.f15172d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15171c;
    }

    protected final Parcel j() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15172d);
        return parcelObtain;
    }

    protected final void q(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f15171c.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void x(int i10, Parcel parcel) {
        try {
            this.f15171c.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
