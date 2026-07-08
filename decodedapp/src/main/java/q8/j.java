package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import c8.b;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public class j extends w7.a {
    public static final Parcelable.Creator<j> CREATOR = new m0();
    private String A;
    private float B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLng f24420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f24423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f24425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24427h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f24428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f24429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f24430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f24431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f24432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f24433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f24434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f24435y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f24436z;

    public j() {
        this.f24424e = 0.5f;
        this.f24425f = 1.0f;
        this.f24427h = true;
        this.f24428r = false;
        this.f24429s = 0.0f;
        this.f24430t = 0.5f;
        this.f24431u = 0.0f;
        this.f24432v = 1.0f;
        this.f24434x = 0;
    }

    public j b(float f10, float f11) {
        this.f24424e = f10;
        this.f24425f = f11;
        return this;
    }

    public j c(boolean z10) {
        this.f24428r = z10;
        return this;
    }

    public float e() {
        return this.f24432v;
    }

    public float f() {
        return this.f24424e;
    }

    public float g() {
        return this.f24425f;
    }

    public b h() {
        return this.f24423d;
    }

    public float i() {
        return this.f24430t;
    }

    public float j() {
        return this.f24431u;
    }

    public LatLng k() {
        return this.f24420a;
    }

    public float l() {
        return this.f24429s;
    }

    public String m() {
        return this.f24422c;
    }

    public String n() {
        return this.f24421b;
    }

    public float o() {
        return this.f24433w;
    }

    public j p(b bVar) {
        this.f24423d = bVar;
        return this;
    }

    public boolean q() {
        return this.f24426g;
    }

    public boolean r() {
        return this.f24428r;
    }

    public boolean s() {
        return this.f24427h;
    }

    public j t(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f24420a = latLng;
        return this;
    }

    public j u(float f10) {
        this.f24429s = f10;
        return this;
    }

    public j v(String str) {
        this.f24422c = str;
        return this;
    }

    public j w(String str) {
        this.f24421b = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 2, k(), i10, false);
        w7.c.r(parcel, 3, n(), false);
        w7.c.r(parcel, 4, m(), false);
        b bVar = this.f24423d;
        w7.c.j(parcel, 5, bVar == null ? null : bVar.a().asBinder(), false);
        w7.c.h(parcel, 6, f());
        w7.c.h(parcel, 7, g());
        w7.c.c(parcel, 8, q());
        w7.c.c(parcel, 9, s());
        w7.c.c(parcel, 10, r());
        w7.c.h(parcel, 11, l());
        w7.c.h(parcel, 12, i());
        w7.c.h(parcel, 13, j());
        w7.c.h(parcel, 14, e());
        w7.c.h(parcel, 15, o());
        w7.c.k(parcel, 17, this.f24434x);
        w7.c.j(parcel, 18, c8.d.v1(this.f24435y).asBinder(), false);
        w7.c.k(parcel, 19, this.f24436z);
        w7.c.r(parcel, 20, this.A, false);
        w7.c.h(parcel, 21, this.B);
        w7.c.b(parcel, iA);
    }

    public j x(float f10) {
        this.f24433w = f10;
        return this;
    }

    public final int y() {
        return this.f24436z;
    }

    j(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f24424e = 0.5f;
        this.f24425f = 1.0f;
        this.f24427h = true;
        this.f24428r = false;
        this.f24429s = 0.0f;
        this.f24430t = 0.5f;
        this.f24431u = 0.0f;
        this.f24432v = 1.0f;
        this.f24434x = 0;
        this.f24420a = latLng;
        this.f24421b = str;
        this.f24422c = str2;
        if (iBinder == null) {
            this.f24423d = null;
        } else {
            this.f24423d = new b(b.a.q(iBinder));
        }
        this.f24424e = f10;
        this.f24425f = f11;
        this.f24426g = z10;
        this.f24427h = z11;
        this.f24428r = z12;
        this.f24429s = f12;
        this.f24430t = f13;
        this.f24431u = f14;
        this.f24432v = f15;
        this.f24433w = f16;
        this.f24436z = i11;
        this.f24434x = i10;
        c8.b bVarQ = b.a.q(iBinder2);
        this.f24435y = bVarQ != null ? (View) c8.d.x(bVarQ) : null;
        this.A = str3;
        this.B = f17;
    }
}
