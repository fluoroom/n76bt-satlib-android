package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* JADX INFO: renamed from: a.a$a$a, reason: collision with other inner class name */
        private static class C0001a implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static a f0d;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f1c;

            C0001a(IBinder iBinder) {
                this.f1c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1c;
            }

            @Override // a.a
            public boolean t0(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j10);
                    if (!this.f1c.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC0000a.q() != null) {
                        return AbstractBinderC0000a.q().t0(j10);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static a j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a q() {
            return C0001a.f0d;
        }
    }

    boolean t0(long j10);
}
