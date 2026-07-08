package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q8.k0;
import v7.o;
import v7.q;
import w7.c;

/* JADX INFO: loaded from: classes.dex */
public final class LatLngBounds extends w7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f7322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f7323b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f7324a = Double.POSITIVE_INFINITY;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f7325b = Double.NEGATIVE_INFINITY;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f7326c = Double.NaN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private double f7327d = Double.NaN;

        public LatLngBounds a() {
            q.l(!Double.isNaN(this.f7326c), "no included points");
            return new LatLngBounds(new LatLng(this.f7324a, this.f7326c), new LatLng(this.f7325b, this.f7327d));
        }

        public a b(LatLng latLng) {
            q.j(latLng, "point must not be null");
            this.f7324a = Math.min(this.f7324a, latLng.f7320a);
            this.f7325b = Math.max(this.f7325b, latLng.f7320a);
            double d10 = latLng.f7321b;
            if (Double.isNaN(this.f7326c)) {
                this.f7326c = d10;
                this.f7327d = d10;
                return this;
            }
            double d11 = this.f7326c;
            double d12 = this.f7327d;
            if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                    this.f7326c = d10;
                    return this;
                }
                this.f7327d = d10;
            }
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        q.j(latLng, "southwest must not be null.");
        q.j(latLng2, "northeast must not be null.");
        double d10 = latLng2.f7320a;
        double d11 = latLng.f7320a;
        q.c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f7320a));
        this.f7322a = latLng;
        this.f7323b = latLng2;
    }

    public static a b() {
        return new a();
    }

    private final boolean g(double d10) {
        LatLng latLng = this.f7323b;
        double d11 = this.f7322a.f7321b;
        double d12 = latLng.f7321b;
        return d11 <= d12 ? d11 <= d10 && d10 <= d12 : d11 <= d10 || d10 <= d12;
    }

    public boolean c(LatLng latLng) {
        LatLng latLng2 = (LatLng) q.j(latLng, "point must not be null.");
        double d10 = latLng2.f7320a;
        return this.f7322a.f7320a <= d10 && d10 <= this.f7323b.f7320a && g(latLng2.f7321b);
    }

    public LatLng e() {
        LatLng latLng = this.f7323b;
        LatLng latLng2 = this.f7322a;
        double d10 = latLng2.f7320a + latLng.f7320a;
        double d11 = latLng.f7321b;
        double d12 = latLng2.f7321b;
        if (d12 > d11) {
            d11 += 360.0d;
        }
        return new LatLng(d10 / 2.0d, (d11 + d12) / 2.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f7322a.equals(latLngBounds.f7322a) && this.f7323b.equals(latLngBounds.f7323b);
    }

    public LatLngBounds f(LatLng latLng) {
        LatLng latLng2 = (LatLng) q.j(latLng, "point must not be null.");
        double dMin = Math.min(this.f7322a.f7320a, latLng2.f7320a);
        double dMax = Math.max(this.f7323b.f7320a, latLng2.f7320a);
        double d10 = this.f7323b.f7321b;
        double d11 = this.f7322a.f7321b;
        double d12 = latLng2.f7321b;
        if (!g(d12)) {
            if (((d11 - d12) + 360.0d) % 360.0d < ((d12 - d10) + 360.0d) % 360.0d) {
                d11 = d12;
            } else {
                d10 = d12;
            }
        }
        return new LatLngBounds(new LatLng(dMin, d11), new LatLng(dMax, d10));
    }

    public int hashCode() {
        return o.b(this.f7322a, this.f7323b);
    }

    public String toString() {
        return o.c(this).a("southwest", this.f7322a).a("northeast", this.f7323b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f7322a;
        int iA = c.a(parcel);
        c.p(parcel, 2, latLng, i10, false);
        c.p(parcel, 3, this.f7323b, i10, false);
        c.b(parcel, iA);
    }
}
