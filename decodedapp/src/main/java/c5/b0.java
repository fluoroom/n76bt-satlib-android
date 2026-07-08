package c5;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ea.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LatLng f4305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap f4312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LatLngBounds f4314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4315k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(LatLng latLng, String str) {
        this(latLng, str, null, 0L, 0L, 28, null);
        rd.m.e(latLng, "location");
    }

    @Override // ea.b
    public Float a() {
        return Float.valueOf(n());
    }

    @Override // ea.b
    public String b() {
        return null;
    }

    public final void c(b0 b0Var) {
        LatLngBounds latLngBoundsA;
        rd.m.e(b0Var, "overlay");
        this.f4311g++;
        LatLngBounds latLngBounds = this.f4314j;
        if (latLngBounds == null || (latLngBoundsA = latLngBounds.f(b0Var.f4305a)) == null) {
            latLngBoundsA = new LatLngBounds.a().b(this.f4305a).b(b0Var.f4305a).a();
            rd.m.d(latLngBoundsA, "build(...)");
        }
        this.f4314j = latLngBoundsA;
    }

    public final LatLng d() {
        LatLng latLngE;
        LatLngBounds latLngBounds = this.f4314j;
        return (latLngBounds == null || (latLngE = latLngBounds.e()) == null) ? this.f4305a : latLngE;
    }

    public final Bitmap e() {
        return this.f4312h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rd.m.a(b0.class, obj.getClass())) {
            b0 b0Var = (b0) obj;
            if (this.f4310f == b0Var.f4310f && this.f4311g == b0Var.f4311g && this.f4309e == b0Var.f4309e && a6.q.f(this.f4306b, b0Var.f4306b) && a6.q.f(this.f4307c, b0Var.f4307c) && a6.q.f(this.f4305a, b0Var.f4305a)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f4308d;
    }

    public final String g() {
        return "" + this.f4308d + this.f4306b + this.f4309e + this.f4307c + this.f4311g + this.f4310f;
    }

    @Override // ea.b
    public LatLng getPosition() {
        z4.m mVarC = z4.m.c(null);
        if (mVarC == null) {
            return d();
        }
        LatLng latLngJ = mVarC.j(d());
        rd.m.b(latLngJ);
        return latLngJ;
    }

    @Override // ea.b
    public String getTitle() {
        int i10 = this.f4311g;
        return i10 > 1 ? String.valueOf(i10) : this.f4306b;
    }

    public final double h() {
        return this.f4305a.f7320a;
    }

    public int hashCode() {
        return a6.q.g(g());
    }

    public final LatLng i() {
        return this.f4305a;
    }

    public final double j() {
        return this.f4305a.f7321b;
    }

    public final boolean k() {
        return this.f4310f;
    }

    public final long l() {
        return this.f4313i;
    }

    public final long m() {
        return this.f4309e;
    }

    public final float n() {
        return this.f4313i;
    }

    public final boolean o() {
        return this.f4311g > 1;
    }

    public final boolean p() {
        return this.f4315k;
    }

    public final void q(Bitmap bitmap) {
        this.f4312h = bitmap;
    }

    public final void r(Bitmap bitmap, boolean z10) {
        this.f4312h = bitmap;
        this.f4315k = z10;
    }

    public final void s(boolean z10) {
        this.f4310f = z10;
    }

    public final void t(long j10) {
        this.f4313i = j10;
    }

    public String toString() {
        String str = this.f4306b;
        return str == null ? "" : str;
    }

    public b0(LatLng latLng, String str, String str2, long j10, long j11) {
        rd.m.e(latLng, "location");
        this.f4305a = latLng;
        this.f4306b = str;
        this.f4307c = str2;
        this.f4308d = j10;
        this.f4309e = j11;
        this.f4311g = 1;
        this.f4312h = o5.a.b().c(str2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ b0(com.google.android.gms.maps.model.LatLng r9, java.lang.String r10, java.lang.String r11, long r12, long r14, int r16, rd.h r17) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L5
            r11 = 0
        L5:
            r3 = r11
            r11 = r16 & 8
            r0 = 0
            if (r11 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r12
        Lf:
            r11 = r16 & 16
            if (r11 == 0) goto L18
            r6 = r0
            r2 = r10
            r0 = r8
            r1 = r9
            goto L1c
        L18:
            r6 = r14
            r0 = r8
            r1 = r9
            r2 = r10
        L1c:
            r0.<init>(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.b0.<init>(com.google.android.gms.maps.model.LatLng, java.lang.String, java.lang.String, long, long, int, rd.h):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(Location location, String str, String str2, long j10, long j11) {
        this(z4.a.a(location), str, str2, j10, j11);
        rd.m.e(location, "location");
    }
}
