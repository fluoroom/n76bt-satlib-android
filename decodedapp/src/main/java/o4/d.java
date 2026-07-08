package o4;

import d5.a;
import rd.h;
import rd.m;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a.d f23173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a.d f23174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23177g;

    public d(int i10, int i11, a.d dVar, a.d dVar2, int i12, int i13, int i14) {
        m.e(dVar, "txModulation");
        m.e(dVar2, "rxModulation");
        this.f23171a = i10;
        this.f23172b = i11;
        this.f23173c = dVar;
        this.f23174d = dVar2;
        this.f23175e = i12;
        this.f23176f = i13;
        this.f23177g = i14;
    }

    public final int a() {
        return this.f23177g;
    }

    public final int b() {
        return this.f23172b;
    }

    public final int c() {
        int i10 = this.f23172b;
        if (i10 == 0) {
            return 0;
        }
        return r.I(this.f23174d, i10);
    }

    public final a.d d() {
        return this.f23174d;
    }

    public final int e() {
        return this.f23176f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23171a == dVar.f23171a && this.f23172b == dVar.f23172b && this.f23173c == dVar.f23173c && this.f23174d == dVar.f23174d && this.f23175e == dVar.f23175e && this.f23176f == dVar.f23176f && this.f23177g == dVar.f23177g;
    }

    public final int f() {
        return this.f23171a;
    }

    public final int g() {
        int i10 = this.f23171a;
        if (i10 == 0) {
            return 0;
        }
        return r.I(this.f23173c, i10);
    }

    public final a.d h() {
        return this.f23173c;
    }

    public int hashCode() {
        return (((((((((((this.f23171a * 31) + this.f23172b) * 31) + this.f23173c.hashCode()) * 31) + this.f23174d.hashCode()) * 31) + this.f23175e) * 31) + this.f23176f) * 31) + this.f23177g;
    }

    public final int i() {
        return this.f23175e;
    }

    public final boolean j() {
        return this.f23172b == 0 && this.f23171a == 0;
    }

    public final void k(int i10) {
        this.f23172b = i10;
    }

    public final void l(a.d dVar) {
        m.e(dVar, "<set-?>");
        this.f23174d = dVar;
    }

    public final void m(int i10) {
        this.f23176f = i10;
    }

    public final void n(int i10) {
        this.f23171a = i10;
    }

    public final void o(a.d dVar) {
        m.e(dVar, "<set-?>");
        this.f23173c = dVar;
    }

    public final void p(int i10) {
        this.f23175e = i10;
    }

    public String toString() {
        return "RadioInfo(txFreq=" + this.f23171a + ", rxFreq=" + this.f23172b + ", txModulation=" + this.f23173c + ", rxModulation=" + this.f23174d + ", txSubAudio=" + this.f23175e + ", rxSubAudio=" + this.f23176f + ", bandwidth=" + this.f23177g + ')';
    }

    public /* synthetic */ d(int i10, int i11, a.d dVar, a.d dVar2, int i12, int i13, int i14, int i15, h hVar) {
        this((i15 & 1) != 0 ? 0 : i10, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? a.d.FM : dVar, (i15 & 8) != 0 ? a.d.FM : dVar2, (i15 & 16) != 0 ? 0 : i12, (i15 & 32) != 0 ? 0 : i13, (i15 & 64) != 0 ? 25000 : i14);
    }
}
