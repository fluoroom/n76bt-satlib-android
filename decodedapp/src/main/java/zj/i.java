package zj;

/* JADX INFO: loaded from: classes3.dex */
public class i implements yj.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xi.a f33396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xi.a f33397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xi.a f33398c;

    public i(xi.a aVar, xi.a aVar2) {
        this.f33396a = aVar;
        this.f33397b = aVar2;
        pi.b bVar = (pi.b) aVar.e().q().a();
        this.f33398c = new xi.a(bVar, bVar, bVar);
    }

    public xi.a b() {
        return this.f33396a;
    }

    public xi.a c() {
        return this.f33397b;
    }

    @Override // yj.e0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i a(double d10) {
        return new i(new xi.a(1.0d, this.f33396a, d10, this.f33397b, 0.5d * d10 * d10, this.f33398c), new xi.a(1.0d, this.f33397b, d10, this.f33398c), this.f33398c);
    }

    public String toString() {
        return "{P(" + this.f33396a.e().s() + ", " + this.f33396a.f().s() + ", " + this.f33396a.g().s() + "), V(" + this.f33397b.e().s() + ", " + this.f33397b.f().s() + ", " + this.f33397b.g().s() + "), A(" + this.f33398c.e().s() + ", " + this.f33398c.f().s() + ", " + this.f33398c.g().s() + ")}";
    }

    public i(xi.a aVar, xi.a aVar2, xi.a aVar3) {
        this.f33396a = aVar;
        this.f33397b = aVar2;
        this.f33398c = aVar3;
    }
}
