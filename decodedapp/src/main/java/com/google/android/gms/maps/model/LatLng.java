package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q8.l0;
import w7.a;
import w7.c;

/* JADX INFO: loaded from: classes.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f7320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f7321b;

    public LatLng(double d10, double d11) {
        if (d11 < -180.0d || d11 >= 180.0d) {
            this.f7321b = ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f7321b = d11;
        }
        this.f7320a = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f7320a) == Double.doubleToLongBits(latLng.f7320a) && Double.doubleToLongBits(this.f7321b) == Double.doubleToLongBits(latLng.f7321b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f7320a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f7321b);
        return ((((int) j10) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f7320a + "," + this.f7321b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f7320a;
        int iA = c.a(parcel);
        c.g(parcel, 2, d10);
        c.g(parcel, 3, this.f7321b);
        c.b(parcel, iA);
    }
}
