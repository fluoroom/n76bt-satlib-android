package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.b;

/* JADX INFO: loaded from: classes.dex */
public class s extends w7.a {
    public static final Parcelable.Creator<s> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b f24464a;

    s(IBinder iBinder) {
        this.f24464a = new b(b.a.q(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b bVar = this.f24464a;
        int iA = w7.c.a(parcel);
        w7.c.j(parcel, 2, bVar.a().asBinder(), false);
        w7.c.b(parcel, iA);
    }
}
