package v7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import v7.k;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends w7.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f30458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final IBinder f30459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.a f30460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f30461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f30462e;

    p0(int i10, IBinder iBinder, s7.a aVar, boolean z10, boolean z11) {
        this.f30458a = i10;
        this.f30459b = iBinder;
        this.f30460c = aVar;
        this.f30461d = z10;
        this.f30462e = z11;
    }

    public final s7.a b() {
        return this.f30460c;
    }

    public final k c() {
        IBinder iBinder = this.f30459b;
        if (iBinder == null) {
            return null;
        }
        return k.a.q(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f30460c.equals(p0Var.f30460c) && o.a(c(), p0Var.c());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, this.f30458a);
        w7.c.j(parcel, 2, this.f30459b, false);
        w7.c.p(parcel, 3, this.f30460c, i10, false);
        w7.c.c(parcel, 4, this.f30461d);
        w7.c.c(parcel, 5, this.f30462e);
        w7.c.b(parcel, iA);
    }
}
