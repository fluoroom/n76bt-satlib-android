package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.i;
import k8.f0;
import k8.y;
import n8.j;
import n8.k;
import n8.m;
import v7.o;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends w7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f7271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7272h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f7273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f7274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f7275t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f7276u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final WorkSource f7277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final y f7278w;

    LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, boolean z11, WorkSource workSource, y yVar) {
        this.f7265a = i10;
        if (i10 == 105) {
            this.f7266b = Long.MAX_VALUE;
        } else {
            this.f7266b = j10;
        }
        this.f7267c = j11;
        this.f7268d = j12;
        this.f7269e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f7270f = i11;
        this.f7271g = f10;
        this.f7272h = z10;
        this.f7273r = j15 != -1 ? j15 : j10;
        this.f7274s = i12;
        this.f7275t = i13;
        this.f7276u = z11;
        this.f7277v = workSource;
        this.f7278w = yVar;
    }

    private static String s(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : f0.b(j10);
    }

    public long b() {
        return this.f7269e;
    }

    public int c() {
        return this.f7274s;
    }

    public long e() {
        return this.f7266b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f7265a == locationRequest.f7265a && ((m() || this.f7266b == locationRequest.f7266b) && this.f7267c == locationRequest.f7267c && l() == locationRequest.l() && ((!l() || this.f7268d == locationRequest.f7268d) && this.f7269e == locationRequest.f7269e && this.f7270f == locationRequest.f7270f && this.f7271g == locationRequest.f7271g && this.f7272h == locationRequest.f7272h && this.f7274s == locationRequest.f7274s && this.f7275t == locationRequest.f7275t && this.f7276u == locationRequest.f7276u && this.f7277v.equals(locationRequest.f7277v) && o.a(this.f7278w, locationRequest.f7278w)))) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f7273r;
    }

    public long g() {
        return this.f7268d;
    }

    public int h() {
        return this.f7270f;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f7265a), Long.valueOf(this.f7266b), Long.valueOf(this.f7267c), this.f7277v);
    }

    public float i() {
        return this.f7271g;
    }

    public long j() {
        return this.f7267c;
    }

    public int k() {
        return this.f7265a;
    }

    public boolean l() {
        long j10 = this.f7268d;
        return j10 > 0 && (j10 >> 1) >= this.f7266b;
    }

    public boolean m() {
        return this.f7265a == 105;
    }

    public boolean n() {
        return this.f7272h;
    }

    public final int o() {
        return this.f7275t;
    }

    public final boolean p() {
        return this.f7276u;
    }

    public final WorkSource q() {
        return this.f7277v;
    }

    public final y r() {
        return this.f7278w;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (m()) {
            sb2.append(j.b(this.f7265a));
            if (this.f7268d > 0) {
                sb2.append("/");
                f0.c(this.f7268d, sb2);
            }
        } else {
            sb2.append("@");
            if (l()) {
                f0.c(this.f7266b, sb2);
                sb2.append("/");
                f0.c(this.f7268d, sb2);
            } else {
                f0.c(this.f7266b, sb2);
            }
            sb2.append(" ");
            sb2.append(j.b(this.f7265a));
        }
        if (m() || this.f7267c != this.f7266b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(s(this.f7267c));
        }
        if (this.f7271g > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f7271g);
        }
        if (!m() ? this.f7273r != this.f7266b : this.f7273r != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(s(this.f7273r));
        }
        if (this.f7269e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            f0.c(this.f7269e, sb2);
        }
        if (this.f7270f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f7270f);
        }
        if (this.f7275t != 0) {
            sb2.append(", ");
            sb2.append(k.b(this.f7275t));
        }
        if (this.f7274s != 0) {
            sb2.append(", ");
            sb2.append(m.b(this.f7274s));
        }
        if (this.f7272h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f7276u) {
            sb2.append(", bypass");
        }
        if (!i.b(this.f7277v)) {
            sb2.append(", ");
            sb2.append(this.f7277v);
        }
        if (this.f7278w != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f7278w);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, k());
        w7.c.o(parcel, 2, e());
        w7.c.o(parcel, 3, j());
        w7.c.k(parcel, 6, h());
        w7.c.h(parcel, 7, i());
        w7.c.o(parcel, 8, g());
        w7.c.c(parcel, 9, n());
        w7.c.o(parcel, 10, b());
        w7.c.o(parcel, 11, f());
        w7.c.k(parcel, 12, c());
        w7.c.k(parcel, 13, this.f7275t);
        w7.c.c(parcel, 15, this.f7276u);
        w7.c.p(parcel, 16, this.f7277v, i10, false);
        w7.c.p(parcel, 17, this.f7278w, i10, false);
        w7.c.b(parcel, iA);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f7280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f7281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f7282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f7283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f7284f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f7285g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f7286h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f7287i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f7288j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f7289k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f7290l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private WorkSource f7291m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private y f7292n;

        public a(int i10, long j10) {
            this(j10);
            j(i10);
        }

        public LocationRequest a() {
            int i10 = this.f7279a;
            long j10 = this.f7280b;
            long jMin = this.f7281c;
            if (jMin == -1) {
                jMin = j10;
            } else if (i10 != 105) {
                jMin = Math.min(jMin, j10);
            }
            long jMax = Math.max(this.f7282d, this.f7280b);
            long j11 = this.f7283e;
            int i11 = this.f7284f;
            float f10 = this.f7285g;
            boolean z10 = this.f7286h;
            long j12 = this.f7287i;
            if (j12 == -1) {
                j12 = this.f7280b;
            }
            return new LocationRequest(i10, j10, jMin, jMax, Long.MAX_VALUE, j11, i11, f10, z10, j12, this.f7288j, this.f7289k, this.f7290l, new WorkSource(this.f7291m), this.f7292n);
        }

        public a b(long j10) {
            q.b(j10 > 0, "durationMillis must be greater than 0");
            this.f7283e = j10;
            return this;
        }

        public a c(int i10) {
            m.a(i10);
            this.f7288j = i10;
            return this;
        }

        public a d(long j10) {
            q.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f7280b = j10;
            return this;
        }

        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            q.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f7287i = j10;
            return this;
        }

        public a f(long j10) {
            q.b(j10 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f7282d = j10;
            return this;
        }

        public a g(int i10) {
            q.b(i10 > 0, "maxUpdates must be greater than 0");
            this.f7284f = i10;
            return this;
        }

        public a h(float f10) {
            q.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f7285g = f10;
            return this;
        }

        public a i(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            q.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f7281c = j10;
            return this;
        }

        public a j(int i10) {
            j.a(i10);
            this.f7279a = i10;
            return this;
        }

        public a k(boolean z10) {
            this.f7286h = z10;
            return this;
        }

        public final a l(int i10) {
            k.a(i10);
            this.f7289k = i10;
            return this;
        }

        public final a m(boolean z10) {
            this.f7290l = z10;
            return this;
        }

        public final a n(WorkSource workSource) {
            this.f7291m = workSource;
            return this;
        }

        public a(long j10) {
            this.f7279a = 102;
            this.f7281c = -1L;
            this.f7282d = 0L;
            this.f7283e = Long.MAX_VALUE;
            this.f7284f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f7285g = 0.0f;
            this.f7286h = true;
            this.f7287i = -1L;
            this.f7288j = 0;
            this.f7289k = 0;
            this.f7290l = false;
            this.f7291m = null;
            this.f7292n = null;
            d(j10);
        }

        public a(LocationRequest locationRequest) {
            this(locationRequest.k(), locationRequest.e());
            i(locationRequest.j());
            f(locationRequest.g());
            b(locationRequest.b());
            g(locationRequest.h());
            h(locationRequest.i());
            k(locationRequest.n());
            e(locationRequest.f());
            c(locationRequest.c());
            int iO = locationRequest.o();
            k.a(iO);
            this.f7289k = iO;
            this.f7290l = locationRequest.p();
            this.f7291m = locationRequest.q();
            y yVarR = locationRequest.r();
            boolean z10 = true;
            if (yVarR != null && yVarR.b()) {
                z10 = false;
            }
            q.a(z10);
            this.f7292n = yVarR;
        }
    }
}
