package v7;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 extends i8.d implements s0 {
    public s1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // i8.d
    protected final boolean j(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            c8.b bVarP = p();
            parcel2.writeNoException();
            i8.e.c(parcel2, bVarP);
        } else {
            if (i10 != 2) {
                return false;
            }
            int i12 = i();
            parcel2.writeNoException();
            parcel2.writeInt(i12);
        }
        return true;
    }
}
