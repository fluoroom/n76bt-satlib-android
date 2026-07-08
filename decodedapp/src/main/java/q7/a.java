package q7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends w7.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f24374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f24376c;

    a(int i10, int i11, Bundle bundle) {
        this.f24374a = i10;
        this.f24375b = i11;
        this.f24376c = bundle;
    }

    public int b() {
        return this.f24375b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, this.f24374a);
        w7.c.k(parcel, 2, b());
        w7.c.d(parcel, 3, this.f24376c, false);
        w7.c.b(parcel, iA);
    }
}
