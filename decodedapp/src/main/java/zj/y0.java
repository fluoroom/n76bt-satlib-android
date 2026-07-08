package zj;

/* JADX INFO: loaded from: classes3.dex */
public class y0 implements yj.e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y0 f33561d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xi.f f33562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xi.f f33563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xi.f f33564c;

    static {
        xi.f fVar = xi.f.f32232d;
        f33561d = new y0(fVar, fVar, fVar);
    }

    public y0(xi.f fVar, xi.f fVar2) {
        this.f33562a = fVar;
        this.f33563b = fVar2;
        this.f33564c = xi.f.f32232d;
    }

    public xi.f o() {
        return this.f33564c;
    }

    public xi.f p() {
        return xi.f.d(this.f33562a, this.f33563b);
    }

    public xi.f s() {
        return this.f33563b;
    }

    public xi.f t() {
        return this.f33562a;
    }

    public String toString() {
        return "{P(" + this.f33562a.j() + ", " + this.f33562a.k() + ", " + this.f33562a.l() + "), V(" + this.f33563b.j() + ", " + this.f33563b.k() + ", " + this.f33563b.l() + "), A(" + this.f33564c.j() + ", " + this.f33564c.k() + ", " + this.f33564c.l() + ")}";
    }

    public y0 u() {
        return new y0(this.f33562a.o(), this.f33563b.o(), this.f33564c.o());
    }

    public xi.f v(double d10) {
        return new xi.f(1.0d, this.f33562a, d10, this.f33563b, 0.5d * d10 * d10, this.f33564c);
    }

    public /* synthetic */ yj.e0 w(yj.y yVar) {
        return yj.d0.a(this, yVar);
    }

    @Override // yj.e0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public y0 a(double d10) {
        return new y0(v(d10), new xi.f(1.0d, this.f33563b, d10, this.f33564c), this.f33564c);
    }

    public y0(xi.f fVar, xi.f fVar2, xi.f fVar3) {
        this.f33562a = fVar;
        this.f33563b = fVar2;
        this.f33564c = fVar3;
    }

    public y0(xi.f fVar) {
        this(fVar, xi.f.f32232d);
    }
}
