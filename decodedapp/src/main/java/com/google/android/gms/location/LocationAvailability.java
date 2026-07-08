package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import n8.h;
import v7.o;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends w7.a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f7263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h[] f7264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LocationAvailability f7258f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LocationAvailability f7259g = new LocationAvailability(CloseCodes.NORMAL_CLOSURE, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    LocationAvailability(int i10, int i11, int i12, long j10, h[] hVarArr, boolean z10) {
        this.f7263d = i10 < 1000 ? 0 : CloseCodes.NORMAL_CLOSURE;
        this.f7260a = i11;
        this.f7261b = i12;
        this.f7262c = j10;
        this.f7264e = hVarArr;
    }

    public boolean b() {
        return this.f7263d < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f7260a == locationAvailability.f7260a && this.f7261b == locationAvailability.f7261b && this.f7262c == locationAvailability.f7262c && this.f7263d == locationAvailability.f7263d && Arrays.equals(this.f7264e, locationAvailability.f7264e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f7263d));
    }

    public String toString() {
        boolean zB = b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zB).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(zB);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f7260a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.k(parcel, 2, this.f7261b);
        w7.c.o(parcel, 3, this.f7262c);
        w7.c.k(parcel, 4, this.f7263d);
        w7.c.u(parcel, 5, this.f7264e, i10, false);
        w7.c.c(parcel, 6, b());
        w7.c.b(parcel, iA);
    }
}
