package z4;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f32975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f32977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f32978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f32979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f32980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f32981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f32982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f32983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f32984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f32985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f32986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f32987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double f32988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private double f32989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f32990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f32991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final double f32992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final double f32993s;

    public v(float f10, int i10, float f11) {
        this.f32975a = f10;
        this.f32976b = i10;
        this.f32977c = f11;
        if (i10 < 0 || i10 > 5) {
            throw new IllegalArgumentException("滤波强度必须属于[1,5]");
        }
    }

    private final void a() {
        this.f32984j = 0.001d;
        this.f32985k = 0.001d;
        this.f32986l = 5.698402909980532E-4d;
        this.f32987m = 5.698402909980532E-4d;
    }

    private final LatLng b(double d10, double d11, double d12, double d13) {
        this.f32978d = d10;
        this.f32979e = d11;
        double d14 = this.f32984j;
        double d15 = this.f32986l;
        double dSqrt = Math.sqrt((d14 * d14) + (d15 * d15)) + this.f32993s;
        this.f32988n = dSqrt;
        double d16 = this.f32984j;
        double dSqrt2 = Math.sqrt((dSqrt * dSqrt) / ((dSqrt * dSqrt) + (d16 * d16))) + this.f32992r;
        this.f32990p = dSqrt2;
        double d17 = this.f32979e;
        double d18 = this.f32978d;
        this.f32982h = ((d17 - d18) * dSqrt2) + d18;
        double d19 = 1;
        double d20 = this.f32988n;
        this.f32986l = Math.sqrt((d19 - dSqrt2) * d20 * d20);
        this.f32980f = d12;
        this.f32981g = d13;
        double d21 = this.f32985k;
        double d22 = this.f32987m;
        double dSqrt3 = Math.sqrt((d21 * d21) + (d22 * d22)) + this.f32993s;
        this.f32989o = dSqrt3;
        double d23 = this.f32985k;
        double dSqrt4 = Math.sqrt((dSqrt3 * dSqrt3) / ((dSqrt3 * dSqrt3) + (d23 * d23))) + this.f32992r;
        this.f32991q = dSqrt4;
        double d24 = this.f32981g;
        double d25 = this.f32980f;
        this.f32983i = ((d24 - d25) * dSqrt4) + d25;
        double d26 = d19 - dSqrt4;
        double d27 = this.f32989o;
        this.f32987m = Math.sqrt(d26 * d27 * d27);
        return new LatLng(this.f32983i, this.f32982h);
    }

    private final List c(List list) {
        if (this.f32976b <= 0 || list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        a();
        w wVarD = (w) list.get(0);
        arrayList.add(wVarD);
        int size = list.size();
        for (int i10 = 1; i10 < size; i10++) {
            wVarD = d(wVarD, (w) list.get(i10));
            arrayList.add(wVarD);
        }
        return arrayList;
    }

    private final w d(w wVar, w wVar2) {
        if (this.f32984j == 0.0d || this.f32985k == 0.0d) {
            a();
        }
        int i10 = this.f32976b;
        for (int i11 = 0; i11 < i10; i11++) {
            LatLng latLngB = b(wVar.getLongitude(), wVar2.getLongitude(), wVar.getLatitude(), wVar2.getLatitude());
            wVar2.b(latLngB.f7320a);
            wVar2.d(latLngB.f7321b);
        }
        return wVar2;
    }

    private final List f(List list) {
        if (this.f32977c <= 0.0f || list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) ed.q.m0(arrayList);
            w wVar2 = (w) list.get(i10);
            Float accuracy = wVar2.getAccuracy();
            if (wVar == null || accuracy == null || i10 == list.size() - 1 || wVar2.e()) {
                arrayList.add(wVar2);
            } else if (o5.h.b(wVar2.getLongitude(), wVar2.getLatitude(), wVar.getLongitude(), wVar.getLatitude()) >= 1 + accuracy.floatValue()) {
                arrayList.add(wVar2);
            }
        }
        return arrayList;
    }

    private final List g(List list) {
        if (this.f32977c <= 0.0f || list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) ed.q.m0(arrayList);
            w wVar2 = (w) list.get(i10);
            if (wVar == null || i10 == list.size() - 1 || wVar2.e()) {
                arrayList.add(wVar2);
            } else if (o5.h.a(wVar2, wVar, (w) list.get(i10 + 1)) > this.f32977c) {
                arrayList.add(wVar2);
            }
        }
        return arrayList;
    }

    private final List h(List list) {
        if (list.size() <= 2 || this.f32975a > 1000.0f) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            w wVar = (w) ed.q.m0(arrayList);
            w wVar2 = (w) list.get(i11);
            if (wVar == null || i11 == list.size() - 1 || wVar2.e()) {
                arrayList.add(wVar2);
            } else {
                w wVar3 = (w) list.get(i11 + 1);
                if (i10 > 3) {
                    wVar = (w) list.get(i11 - 1);
                }
                if (o5.h.a(wVar2, wVar, wVar3) < (wVar3.getDate() > 0 ? this.f32975a * ((wVar3.getDate() - wVar.getDate()) / 2000.0f) : this.f32975a)) {
                    arrayList.add(wVar2);
                    i10 = 0;
                } else {
                    i10++;
                }
            }
        }
        return arrayList;
    }

    public final List e(List list) {
        rd.m.e(list, "points");
        return f(g(c(h(list))));
    }
}
