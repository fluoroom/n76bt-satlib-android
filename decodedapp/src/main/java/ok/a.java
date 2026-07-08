package ok;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f23646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f23647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f23648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f23649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f23650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double f23651f;

    public void a(double d10) {
        this.f23651f *= d10;
        this.f23649d *= d10;
        this.f23650e *= d10;
    }

    public double b() {
        return this.f23646a;
    }

    public double c() {
        return this.f23647b * this.f23646a;
    }

    public double d() {
        return this.f23648c * this.f23646a;
    }

    public double e() {
        return this.f23651f * this.f23646a;
    }

    public double f() {
        return this.f23649d * this.f23646a;
    }

    public double g() {
        return this.f23650e * this.f23646a;
    }

    public void h(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f23646a = d10;
        this.f23647b = d11 / d10;
        this.f23648c = d12 / d10;
        this.f23651f = d13 / d10;
        this.f23649d = d14 / d10;
        this.f23650e = d15 / d10;
    }

    public void i(di.a aVar, di.a aVar2) {
        h(1.0d, -aVar.g(), 0.0d, 1.0d, -aVar2.g(), 0.0d);
    }

    public void j(k kVar) {
        if (kVar.a()) {
            i(kVar.f23671a.f23658a, kVar.f23672b.f23658a);
            return;
        }
        d dVar = kVar.f23671a;
        di.a aVar = dVar.f23658a;
        d dVar2 = kVar.f23672b;
        k(aVar, dVar2.f23658a, dVar.f23659b, dVar2.f23659b);
    }

    public void k(di.a aVar, di.a aVar2, di.a aVar3, di.a aVar4) {
        double dG;
        double dG2;
        double dG3;
        double dG4;
        double dG5;
        double dG6;
        if (aVar.f() != 0.0d) {
            dG = aVar.g() * (-2.0d);
            dG2 = aVar.a();
            dG3 = aVar.a();
        } else {
            dG = -(aVar.g() + aVar3.g());
            dG2 = aVar.g();
            dG3 = aVar3.g();
        }
        double d10 = dG2 * dG3;
        double d11 = dG;
        if (aVar2.f() != 0.0d) {
            dG4 = aVar2.g() * (-2.0d);
            dG5 = aVar2.a();
            dG6 = aVar2.a();
        } else {
            dG4 = -(aVar2.g() + aVar4.g());
            dG5 = aVar2.g();
            dG6 = aVar4.g();
        }
        h(1.0d, d11, d10, 1.0d, dG4, dG5 * dG6);
    }
}
