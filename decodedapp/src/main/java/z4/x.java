package z4;

/* JADX INFO: loaded from: classes.dex */
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f32994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f32995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Float f32998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Float f32999f;

    public x(double d10, double d11, boolean z10, long j10, Float f10, Float f11) {
        this.f32994a = d10;
        this.f32995b = d11;
        this.f32996c = z10;
        this.f32997d = j10;
        this.f32998e = f10;
        this.f32999f = f11;
    }

    @Override // z4.w
    public double a() {
        return this.f32995b;
    }

    @Override // z4.w
    public void b(double d10) {
        this.f32994a = d10;
    }

    @Override // z4.w
    public double c() {
        return this.f32994a;
    }

    @Override // z4.w
    public void d(double d10) {
        this.f32995b = d10;
    }

    @Override // z4.w
    public boolean e() {
        return this.f32996c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Double.compare(this.f32994a, xVar.f32994a) == 0 && Double.compare(this.f32995b, xVar.f32995b) == 0 && this.f32996c == xVar.f32996c && this.f32997d == xVar.f32997d && rd.m.a(this.f32998e, xVar.f32998e) && rd.m.a(this.f32999f, xVar.f32999f);
    }

    @Override // z4.w
    public Float f() {
        return this.f32999f;
    }

    @Override // z4.w
    public long getDate() {
        return this.f32997d;
    }

    public int hashCode() {
        int iA = ((((((o4.c.a(this.f32994a) * 31) + o4.c.a(this.f32995b)) * 31) + o4.b.a(this.f32996c)) * 31) + o4.a.a(this.f32997d)) * 31;
        Float f10 = this.f32998e;
        int iHashCode = (iA + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f32999f;
        return iHashCode + (f11 != null ? f11.hashCode() : 0);
    }

    public String toString() {
        return "PointData(latitude=" + this.f32994a + ", longitude=" + this.f32995b + ", isKeyPoint=" + this.f32996c + ", date=" + this.f32997d + ", speed=" + this.f32998e + ", accuracy=" + this.f32999f + ')';
    }
}
