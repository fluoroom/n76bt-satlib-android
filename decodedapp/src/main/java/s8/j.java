package s8;

import android.os.Parcel;
import android.os.Parcelable;
import v7.n0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends w7.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f27022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n0 f27023b;

    j(int i10, n0 n0Var) {
        this.f27022a = i10;
        this.f27023b = n0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, this.f27022a);
        w7.c.p(parcel, 2, this.f27023b, i10, false);
        w7.c.b(parcel, iA);
    }
}
