package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import o8.i;
import p8.g;
import v7.o;
import w7.c;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleMapOptions extends w7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();
    private static final Integer D = Integer.valueOf(Color.argb(255, 236, 233, 225));
    private Integer A;
    private String B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f7295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f7296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CameraPosition f7298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f7299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f7300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f7301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f7302h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f7303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f7304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Boolean f7305t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Boolean f7306u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f7307v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Float f7308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Float f7309x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private LatLngBounds f7310y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f7311z;

    public GoogleMapOptions() {
        this.f7297c = -1;
        this.f7308w = null;
        this.f7309x = null;
        this.f7310y = null;
        this.A = null;
        this.B = null;
    }

    public static CameraPosition F(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, i.f23286a);
        int i10 = i.f23292g;
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(i10) ? typedArrayObtainAttributes.getFloat(i10, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(i.f23293h) ? typedArrayObtainAttributes.getFloat(r0, 0.0f) : 0.0f);
        CameraPosition.a aVarB = CameraPosition.b();
        aVarB.c(latLng);
        int i11 = i.f23295j;
        if (typedArrayObtainAttributes.hasValue(i11)) {
            aVarB.e(typedArrayObtainAttributes.getFloat(i11, 0.0f));
        }
        int i12 = i.f23289d;
        if (typedArrayObtainAttributes.hasValue(i12)) {
            aVarB.a(typedArrayObtainAttributes.getFloat(i12, 0.0f));
        }
        int i13 = i.f23294i;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            aVarB.d(typedArrayObtainAttributes.getFloat(i13, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return aVarB.b();
    }

    public static LatLngBounds G(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, i.f23286a);
        int i10 = i.f23298m;
        Float fValueOf = typedArrayObtainAttributes.hasValue(i10) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i10, 0.0f)) : null;
        int i11 = i.f23299n;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(i11) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i11, 0.0f)) : null;
        int i12 = i.f23296k;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(i12) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i12, 0.0f)) : null;
        int i13 = i.f23297l;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(i13) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i13, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public static GoogleMapOptions g(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, i.f23286a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i10 = i.f23303r;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            googleMapOptions.u(typedArrayObtainAttributes.getInt(i10, -1));
        }
        int i11 = i.B;
        if (typedArrayObtainAttributes.hasValue(i11)) {
            googleMapOptions.C(typedArrayObtainAttributes.getBoolean(i11, false));
        }
        int i12 = i.A;
        if (typedArrayObtainAttributes.hasValue(i12)) {
            googleMapOptions.B(typedArrayObtainAttributes.getBoolean(i12, false));
        }
        int i13 = i.f23304s;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            googleMapOptions.f(typedArrayObtainAttributes.getBoolean(i13, true));
        }
        int i14 = i.f23306u;
        if (typedArrayObtainAttributes.hasValue(i14)) {
            googleMapOptions.x(typedArrayObtainAttributes.getBoolean(i14, true));
        }
        int i15 = i.f23308w;
        if (typedArrayObtainAttributes.hasValue(i15)) {
            googleMapOptions.z(typedArrayObtainAttributes.getBoolean(i15, true));
        }
        int i16 = i.f23307v;
        if (typedArrayObtainAttributes.hasValue(i16)) {
            googleMapOptions.y(typedArrayObtainAttributes.getBoolean(i16, true));
        }
        int i17 = i.f23309x;
        if (typedArrayObtainAttributes.hasValue(i17)) {
            googleMapOptions.A(typedArrayObtainAttributes.getBoolean(i17, true));
        }
        int i18 = i.f23311z;
        if (typedArrayObtainAttributes.hasValue(i18)) {
            googleMapOptions.E(typedArrayObtainAttributes.getBoolean(i18, true));
        }
        int i19 = i.f23310y;
        if (typedArrayObtainAttributes.hasValue(i19)) {
            googleMapOptions.D(typedArrayObtainAttributes.getBoolean(i19, true));
        }
        int i20 = i.f23300o;
        if (typedArrayObtainAttributes.hasValue(i20)) {
            googleMapOptions.q(typedArrayObtainAttributes.getBoolean(i20, false));
        }
        int i21 = i.f23305t;
        if (typedArrayObtainAttributes.hasValue(i21)) {
            googleMapOptions.t(typedArrayObtainAttributes.getBoolean(i21, true));
        }
        int i22 = i.f23287b;
        if (typedArrayObtainAttributes.hasValue(i22)) {
            googleMapOptions.b(typedArrayObtainAttributes.getBoolean(i22, false));
        }
        int i23 = i.f23291f;
        if (typedArrayObtainAttributes.hasValue(i23)) {
            googleMapOptions.w(typedArrayObtainAttributes.getFloat(i23, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(i23)) {
            googleMapOptions.v(typedArrayObtainAttributes.getFloat(i.f23290e, Float.POSITIVE_INFINITY));
        }
        int i24 = i.f23288c;
        if (typedArrayObtainAttributes.hasValue(i24)) {
            googleMapOptions.c(Integer.valueOf(typedArrayObtainAttributes.getColor(i24, D.intValue())));
        }
        int i25 = i.f23302q;
        if (typedArrayObtainAttributes.hasValue(i25) && (string = typedArrayObtainAttributes.getString(i25)) != null && !string.isEmpty()) {
            googleMapOptions.s(string);
        }
        int i26 = i.f23301p;
        if (typedArrayObtainAttributes.hasValue(i26)) {
            googleMapOptions.r(typedArrayObtainAttributes.getInt(i26, 0));
        }
        googleMapOptions.p(G(context, attributeSet));
        googleMapOptions.e(F(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions A(boolean z10) {
        this.f7303r = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions B(boolean z10) {
        this.f7296b = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions C(boolean z10) {
        this.f7295a = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions D(boolean z10) {
        this.f7299e = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions E(boolean z10) {
        this.f7302h = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions b(boolean z10) {
        this.f7307v = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions c(Integer num) {
        this.A = num;
        return this;
    }

    public GoogleMapOptions e(CameraPosition cameraPosition) {
        this.f7298d = cameraPosition;
        return this;
    }

    public GoogleMapOptions f(boolean z10) {
        this.f7300f = Boolean.valueOf(z10);
        return this;
    }

    public Integer h() {
        return this.A;
    }

    public CameraPosition i() {
        return this.f7298d;
    }

    public LatLngBounds j() {
        return this.f7310y;
    }

    public int k() {
        return this.C;
    }

    public String l() {
        return this.B;
    }

    public int m() {
        return this.f7297c;
    }

    public Float n() {
        return this.f7309x;
    }

    public Float o() {
        return this.f7308w;
    }

    public GoogleMapOptions p(LatLngBounds latLngBounds) {
        this.f7310y = latLngBounds;
        return this;
    }

    public GoogleMapOptions q(boolean z10) {
        this.f7305t = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions r(int i10) {
        this.C = i10;
        return this;
    }

    public GoogleMapOptions s(String str) {
        this.B = str;
        return this;
    }

    public GoogleMapOptions t(boolean z10) {
        this.f7306u = Boolean.valueOf(z10);
        return this;
    }

    public String toString() {
        return o.c(this).a("MapType", Integer.valueOf(this.f7297c)).a("LiteMode", this.f7305t).a("Camera", this.f7298d).a("CompassEnabled", this.f7300f).a("ZoomControlsEnabled", this.f7299e).a("ScrollGesturesEnabled", this.f7301g).a("ZoomGesturesEnabled", this.f7302h).a("TiltGesturesEnabled", this.f7303r).a("RotateGesturesEnabled", this.f7304s).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f7311z).a("MapToolbarEnabled", this.f7306u).a("AmbientEnabled", this.f7307v).a("MinZoomPreference", this.f7308w).a("MaxZoomPreference", this.f7309x).a("BackgroundColor", this.A).a("LatLngBoundsForCameraTarget", this.f7310y).a("ZOrderOnTop", this.f7295a).a("UseViewLifecycleInFragment", this.f7296b).a("mapColorScheme", Integer.valueOf(this.C)).toString();
    }

    public GoogleMapOptions u(int i10) {
        this.f7297c = i10;
        return this;
    }

    public GoogleMapOptions v(float f10) {
        this.f7309x = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions w(float f10) {
        this.f7308w = Float.valueOf(f10);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.e(parcel, 2, g.a(this.f7295a));
        c.e(parcel, 3, g.a(this.f7296b));
        c.k(parcel, 4, m());
        c.p(parcel, 5, i(), i10, false);
        c.e(parcel, 6, g.a(this.f7299e));
        c.e(parcel, 7, g.a(this.f7300f));
        c.e(parcel, 8, g.a(this.f7301g));
        c.e(parcel, 9, g.a(this.f7302h));
        c.e(parcel, 10, g.a(this.f7303r));
        c.e(parcel, 11, g.a(this.f7304s));
        c.e(parcel, 12, g.a(this.f7305t));
        c.e(parcel, 14, g.a(this.f7306u));
        c.e(parcel, 15, g.a(this.f7307v));
        c.i(parcel, 16, o(), false);
        c.i(parcel, 17, n(), false);
        c.p(parcel, 18, j(), i10, false);
        c.e(parcel, 19, g.a(this.f7311z));
        c.m(parcel, 20, h(), false);
        c.r(parcel, 21, l(), false);
        c.k(parcel, 23, k());
        c.b(parcel, iA);
    }

    public GoogleMapOptions x(boolean z10) {
        this.f7304s = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions y(boolean z10) {
        this.f7301g = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions z(boolean z10) {
        this.f7311z = Boolean.valueOf(z10);
        return this;
    }

    GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str, int i11) {
        this.f7297c = -1;
        this.f7308w = null;
        this.f7309x = null;
        this.f7310y = null;
        this.A = null;
        this.B = null;
        this.f7295a = g.b(b10);
        this.f7296b = g.b(b11);
        this.f7297c = i10;
        this.f7298d = cameraPosition;
        this.f7299e = g.b(b12);
        this.f7300f = g.b(b13);
        this.f7301g = g.b(b14);
        this.f7302h = g.b(b15);
        this.f7303r = g.b(b16);
        this.f7304s = g.b(b17);
        this.f7305t = g.b(b18);
        this.f7306u = g.b(b19);
        this.f7307v = g.b(b20);
        this.f7308w = f10;
        this.f7309x = f11;
        this.f7310y = latLngBounds;
        this.f7311z = g.b(b21);
        this.A = num;
        this.B = str;
        this.C = i11;
    }
}
