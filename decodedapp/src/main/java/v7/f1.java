package v7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends w7.a {
    public static final Parcelable.Creator<f1> CREATOR = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f30385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    s7.c[] f30386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f30387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    f f30388d;

    f1(Bundle bundle, s7.c[] cVarArr, int i10, f fVar) {
        this.f30385a = bundle;
        this.f30386b = cVarArr;
        this.f30387c = i10;
        this.f30388d = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.d(parcel, 1, this.f30385a, false);
        w7.c.u(parcel, 2, this.f30386b, i10, false);
        w7.c.k(parcel, 3, this.f30387c);
        w7.c.p(parcel, 4, this.f30388d, i10, false);
        w7.c.b(parcel, iA);
    }
}
