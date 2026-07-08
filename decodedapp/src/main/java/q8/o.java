package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q8.t;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w7.a {
    public static final Parcelable.Creator<o> CREATOR = new p0();

    /* JADX INFO: renamed from: a */
    private final List f24452a;

    /* JADX INFO: renamed from: b */
    private float f24453b;

    /* JADX INFO: renamed from: c */
    private int f24454c;

    /* JADX INFO: renamed from: d */
    private float f24455d;

    /* JADX INFO: renamed from: e */
    private boolean f24456e;

    /* JADX INFO: renamed from: f */
    private boolean f24457f;

    /* JADX INFO: renamed from: g */
    private boolean f24458g;

    /* JADX INFO: renamed from: h */
    private e f24459h;

    /* JADX INFO: renamed from: r */
    private e f24460r;

    /* JADX INFO: renamed from: s */
    private int f24461s;

    /* JADX INFO: renamed from: t */
    private List f24462t;

    /* JADX INFO: renamed from: u */
    private List f24463u;

    public o() {
        this.f24453b = 10.0f;
        this.f24454c = -16777216;
        this.f24455d = 0.0f;
        this.f24456e = true;
        this.f24457f = false;
        this.f24458g = false;
        this.f24459h = new d();
        this.f24460r = new d();
        this.f24461s = 0;
        this.f24462t = null;
        this.f24463u = new ArrayList();
        this.f24452a = new ArrayList();
    }

    public o b(LatLng latLng) {
        List list = this.f24452a;
        v7.q.j(list, "point must not be null.");
        list.add(latLng);
        return this;
    }

    public o c(Iterable iterable) {
        v7.q.j(iterable, "points must not be null.");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f24452a.add((LatLng) it.next());
        }
        return this;
    }

    public o e(boolean z10) {
        this.f24458g = z10;
        return this;
    }

    public o f(int i10) {
        this.f24454c = i10;
        return this;
    }

    public o g(e eVar) {
        this.f24460r = (e) v7.q.j(eVar, "endCap must not be null");
        return this;
    }

    public int h() {
        return this.f24454c;
    }

    public e i() {
        return this.f24460r.b();
    }

    public int j() {
        return this.f24461s;
    }

    public List k() {
        return this.f24462t;
    }

    public List l() {
        return this.f24452a;
    }

    public e m() {
        return this.f24459h.b();
    }

    public float n() {
        return this.f24453b;
    }

    public float o() {
        return this.f24455d;
    }

    public boolean p() {
        return this.f24458g;
    }

    public boolean q() {
        return this.f24457f;
    }

    public boolean r() {
        return this.f24456e;
    }

    public o s(e eVar) {
        this.f24459h = (e) v7.q.j(eVar, "startCap must not be null");
        return this;
    }

    public o t(float f10) {
        this.f24453b = f10;
        return this;
    }

    public o u(float f10) {
        this.f24455d = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.v(parcel, 2, l(), false);
        w7.c.h(parcel, 3, n());
        w7.c.k(parcel, 4, h());
        w7.c.h(parcel, 5, o());
        w7.c.c(parcel, 6, r());
        w7.c.c(parcel, 7, q());
        w7.c.c(parcel, 8, p());
        w7.c.p(parcel, 9, m(), i10, false);
        w7.c.p(parcel, 10, i(), i10, false);
        w7.c.k(parcel, 11, j());
        w7.c.v(parcel, 12, k(), false);
        ArrayList arrayList = new ArrayList(this.f24463u.size());
        for (u uVar : this.f24463u) {
            t.a aVar = new t.a(uVar.c());
            aVar.c(this.f24453b);
            aVar.b(this.f24456e);
            arrayList.add(new u(aVar.a(), uVar.b()));
        }
        w7.c.v(parcel, 13, arrayList, false);
        w7.c.b(parcel, iA);
    }

    o(List list, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, e eVar, e eVar2, int i11, List list2, List list3) {
        this.f24453b = 10.0f;
        this.f24454c = -16777216;
        this.f24455d = 0.0f;
        this.f24456e = true;
        this.f24457f = false;
        this.f24458g = false;
        this.f24459h = new d();
        this.f24460r = new d();
        this.f24461s = 0;
        this.f24462t = null;
        this.f24463u = new ArrayList();
        this.f24452a = list;
        this.f24453b = f10;
        this.f24454c = i10;
        this.f24455d = f11;
        this.f24456e = z10;
        this.f24457f = z11;
        this.f24458g = z12;
        if (eVar != null) {
            this.f24459h = eVar;
        }
        if (eVar2 != null) {
            this.f24460r = eVar2;
        }
        this.f24461s = i11;
        this.f24462t = list2;
        if (list3 != null) {
            this.f24463u = list3;
        }
    }
}
