package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q8.a0;
import v7.o;
import v7.q;
import w7.c;

/* JADX INFO: loaded from: classes.dex */
public final class CameraPosition extends w7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f7312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7315d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLng f7316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f7317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f7318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f7319d;

        public a a(float f10) {
            this.f7319d = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f7316a, this.f7317b, this.f7318c, this.f7319d);
        }

        public a c(LatLng latLng) {
            this.f7316a = (LatLng) q.j(latLng, "location must not be null.");
            return this;
        }

        public a d(float f10) {
            this.f7318c = f10;
            return this;
        }

        public a e(float f10) {
            this.f7317b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        q.j(latLng, "camera target must not be null.");
        q.c(f11 >= 0.0f && f11 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f7312a = latLng;
        this.f7313b = f10;
        this.f7314c = f11 + 0.0f;
        this.f7315d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public static a b() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f7312a.equals(cameraPosition.f7312a) && Float.floatToIntBits(this.f7313b) == Float.floatToIntBits(cameraPosition.f7313b) && Float.floatToIntBits(this.f7314c) == Float.floatToIntBits(cameraPosition.f7314c) && Float.floatToIntBits(this.f7315d) == Float.floatToIntBits(cameraPosition.f7315d);
    }

    public int hashCode() {
        return o.b(this.f7312a, Float.valueOf(this.f7313b), Float.valueOf(this.f7314c), Float.valueOf(this.f7315d));
    }

    public String toString() {
        return o.c(this).a("target", this.f7312a).a("zoom", Float.valueOf(this.f7313b)).a("tilt", Float.valueOf(this.f7314c)).a("bearing", Float.valueOf(this.f7315d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f7312a;
        int iA = c.a(parcel);
        c.p(parcel, 2, latLng, i10, false);
        c.h(parcel, 3, this.f7313b);
        c.h(parcel, 4, this.f7314c);
        c.h(parcel, 5, this.f7315d);
        c.b(parcel, iA);
    }
}
