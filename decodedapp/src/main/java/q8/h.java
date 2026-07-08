package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w7.a {
    public static final Parcelable.Creator<h> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f24407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLng f24408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f24409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f24410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LatLngBounds f24411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f24412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f24413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24414h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f24415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f24416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f24417t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f24418u;

    public h() {
        this.f24414h = true;
        this.f24415r = 0.0f;
        this.f24416s = 0.5f;
        this.f24417t = 0.5f;
        this.f24418u = false;
    }

    public h b(float f10) {
        this.f24412f = ((f10 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public float c() {
        return this.f24416s;
    }

    public float e() {
        return this.f24417t;
    }

    public float f() {
        return this.f24412f;
    }

    public LatLngBounds g() {
        return this.f24411e;
    }

    public float h() {
        return this.f24410d;
    }

    public LatLng i() {
        return this.f24408b;
    }

    public float j() {
        return this.f24415r;
    }

    public float k() {
        return this.f24409c;
    }

    public float l() {
        return this.f24413g;
    }

    public h m(b bVar) {
        v7.q.j(bVar, "imageDescriptor must not be null");
        this.f24407a = bVar;
        return this;
    }

    public boolean n() {
        return this.f24418u;
    }

    public boolean o() {
        return this.f24414h;
    }

    public h p(LatLngBounds latLngBounds) {
        LatLng latLng = this.f24408b;
        v7.q.l(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.f24411e = latLngBounds;
        return this;
    }

    public h q(boolean z10) {
        this.f24414h = z10;
        return this;
    }

    public h r(float f10) {
        this.f24413g = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.j(parcel, 2, this.f24407a.a().asBinder(), false);
        w7.c.p(parcel, 3, i(), i10, false);
        w7.c.h(parcel, 4, k());
        w7.c.h(parcel, 5, h());
        w7.c.p(parcel, 6, g(), i10, false);
        w7.c.h(parcel, 7, f());
        w7.c.h(parcel, 8, l());
        w7.c.c(parcel, 9, o());
        w7.c.h(parcel, 10, j());
        w7.c.h(parcel, 11, c());
        w7.c.h(parcel, 12, e());
        w7.c.c(parcel, 13, n());
        w7.c.b(parcel, iA);
    }

    h(IBinder iBinder, LatLng latLng, float f10, float f11, LatLngBounds latLngBounds, float f12, float f13, boolean z10, float f14, float f15, float f16, boolean z11) {
        this.f24414h = true;
        this.f24415r = 0.0f;
        this.f24416s = 0.5f;
        this.f24417t = 0.5f;
        this.f24418u = false;
        this.f24407a = new b(b.a.q(iBinder));
        this.f24408b = latLng;
        this.f24409c = f10;
        this.f24410d = f11;
        this.f24411e = latLngBounds;
        this.f24412f = f12;
        this.f24413g = f13;
        this.f24414h = z10;
        this.f24415r = f14;
        this.f24416s = f15;
        this.f24417t = f16;
        this.f24418u = z11;
    }
}
