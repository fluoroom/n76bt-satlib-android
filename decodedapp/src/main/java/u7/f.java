package u7;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface f extends IInterface {

    public static abstract class a extends h8.b implements f {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // h8.b
        protected final boolean v1(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) h8.c.a(parcel, Status.CREATOR);
            h8.c.b(parcel);
            c0(status);
            return true;
        }
    }

    void c0(Status status);
}
