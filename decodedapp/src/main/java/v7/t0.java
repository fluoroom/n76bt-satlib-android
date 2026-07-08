package v7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends i8.d implements l {
    public t0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // i8.d
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) i8.e.a(parcel, Bundle.CREATOR);
            i8.e.b(parcel);
            C0(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) i8.e.a(parcel, Bundle.CREATOR);
            i8.e.b(parcel);
            h0(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            f1 f1Var = (f1) i8.e.a(parcel, f1.CREATOR);
            i8.e.b(parcel);
            O0(i14, strongBinder2, f1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
