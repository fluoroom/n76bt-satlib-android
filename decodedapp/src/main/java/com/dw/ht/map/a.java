package com.dw.ht.map;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0092a f6530d = new C0092a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6533c;

    /* JADX INFO: renamed from: com.dw.ht.map.a$a, reason: collision with other inner class name */
    public static final class C0092a {
        public /* synthetic */ C0092a(h hVar) {
            this();
        }

        private final boolean b(a aVar, a aVar2, int i10) {
            return aVar2.a() <= aVar.a() ? aVar2.a() <= i10 && i10 <= aVar.a() : aVar.a() <= i10 && i10 <= aVar2.a();
        }

        private final boolean c(a aVar, a aVar2, int i10) {
            return aVar.b() <= aVar2.b() ? aVar.b() <= i10 && i10 <= aVar2.b() : aVar2.b() <= i10 && i10 <= aVar.b();
        }

        public final boolean a(LatLngBounds latLngBounds, int i10, int i11, int i12) {
            m.e(latLngBounds, "bounds");
            C0092a c0092a = a.f6530d;
            LatLng latLng = latLngBounds.f7323b;
            m.d(latLng, "northeast");
            a aVarF = c0092a.f(i10, latLng);
            LatLng latLng2 = latLngBounds.f7322a;
            m.d(latLng2, "southwest");
            a aVarF2 = c0092a.f(i10, latLng2);
            return c(aVarF, aVarF2, i12) && b(aVarF, aVarF2, i11);
        }

        public final int d(int i10) {
            return (int) Math.pow(2.0d, i10);
        }

        public final long e(LatLngBounds latLngBounds, int i10) {
            m.e(latLngBounds, "bounds");
            long j10 = 0;
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    C0092a c0092a = a.f6530d;
                    LatLng latLng = latLngBounds.f7323b;
                    m.d(latLng, "northeast");
                    a aVarF = c0092a.f(i11, latLng);
                    LatLng latLng2 = latLngBounds.f7322a;
                    m.d(latLng2, "southwest");
                    a aVarF2 = c0092a.f(i11, latLng2);
                    int iA = (aVarF.a() - aVarF2.a()) + 1;
                    int iB = (aVarF2.b() - aVarF.b()) + 1;
                    if (iA <= 0) {
                        iA += c0092a.d(i11);
                    }
                    if (iB <= 0) {
                        iB += c0092a.d(i11);
                    }
                    j10 += (long) (iA * iB);
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            return j10;
        }

        public final a f(int i10, LatLng latLng) {
            m.e(latLng, "loc");
            double dPow = Math.pow(2.0d, i10);
            double d10 = 1;
            return new a((int) (((latLng.f7321b + ((double) 180)) / ((double) 360)) * dPow), (int) (((d10 - (Math.log(Math.tan(Math.toRadians(latLng.f7320a)) + (d10 / Math.cos(Math.toRadians(latLng.f7320a)))) / 3.141592653589793d)) / ((double) 2)) * dPow), i10);
        }

        private C0092a() {
        }
    }

    public a(int i10, int i11, int i12) {
        this.f6531a = i10;
        this.f6532b = i11;
        this.f6533c = i12;
    }

    public final int a() {
        return this.f6531a;
    }

    public final int b() {
        return this.f6532b;
    }

    public final int c() {
        return this.f6533c;
    }

    public String toString() {
        return "x=" + this.f6531a + ", y=" + this.f6532b + ", zoom=" + this.f6533c;
    }
}
