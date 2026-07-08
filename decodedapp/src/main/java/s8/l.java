package s8;

import android.os.Parcel;
import android.os.Parcelable;
import v7.p0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w7.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f27024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.a f27025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f27026c;

    l(int i10, s7.a aVar, p0 p0Var) {
        this.f27024a = i10;
        this.f27025b = aVar;
        this.f27026c = p0Var;
    }

    public final s7.a b() {
        return this.f27025b;
    }

    public final p0 c() {
        return this.f27026c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, this.f27024a);
        w7.c.p(parcel, 2, this.f27025b, i10, false);
        w7.c.p(parcel, 3, this.f27026c, i10, false);
        w7.c.b(parcel, iA);
    }
}
