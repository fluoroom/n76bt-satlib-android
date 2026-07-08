package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w7.a {
    public static final Parcelable.Creator<m> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f24440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f24442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f24445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24447h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f24448r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f24449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f24450t;

    public m() {
        this.f24442c = 10.0f;
        this.f24443d = -16777216;
        this.f24444e = 0;
        this.f24445f = 0.0f;
        this.f24446g = true;
        this.f24447h = false;
        this.f24448r = false;
        this.f24449s = 0;
        this.f24450t = null;
        this.f24440a = new ArrayList();
        this.f24441b = new ArrayList();
    }

    public m b(LatLng latLng) {
        v7.q.j(latLng, "point must not be null.");
        this.f24440a.add(latLng);
        return this;
    }

    public m c(Iterable iterable) {
        v7.q.j(iterable, "points must not be null.");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f24440a.add((LatLng) it.next());
        }
        return this;
    }

    public m e(Iterable iterable) {
        v7.q.j(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((LatLng) it.next());
        }
        this.f24441b.add(arrayList);
        return this;
    }

    public m f(boolean z10) {
        this.f24448r = z10;
        return this;
    }

    public m g(int i10) {
        this.f24444e = i10;
        return this;
    }

    public int h() {
        return this.f24444e;
    }

    public List i() {
        return this.f24440a;
    }

    public int j() {
        return this.f24443d;
    }

    public int k() {
        return this.f24449s;
    }

    public List l() {
        return this.f24450t;
    }

    public float m() {
        return this.f24442c;
    }

    public float n() {
        return this.f24445f;
    }

    public boolean o() {
        return this.f24448r;
    }

    public boolean p() {
        return this.f24447h;
    }

    public boolean q() {
        return this.f24446g;
    }

    public m r(int i10) {
        this.f24443d = i10;
        return this;
    }

    public m s(float f10) {
        this.f24442c = f10;
        return this;
    }

    public m t(float f10) {
        this.f24445f = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.v(parcel, 2, i(), false);
        w7.c.n(parcel, 3, this.f24441b, false);
        w7.c.h(parcel, 4, m());
        w7.c.k(parcel, 5, j());
        w7.c.k(parcel, 6, h());
        w7.c.h(parcel, 7, n());
        w7.c.c(parcel, 8, q());
        w7.c.c(parcel, 9, p());
        w7.c.c(parcel, 10, o());
        w7.c.k(parcel, 11, k());
        w7.c.v(parcel, 12, l(), false);
        w7.c.b(parcel, iA);
    }

    m(List list, List list2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, List list3) {
        this.f24440a = list;
        this.f24441b = list2;
        this.f24442c = f10;
        this.f24443d = i10;
        this.f24444e = i11;
        this.f24445f = f11;
        this.f24446g = z10;
        this.f24447h = z11;
        this.f24448r = z12;
        this.f24449s = i12;
        this.f24450t = list3;
    }
}
