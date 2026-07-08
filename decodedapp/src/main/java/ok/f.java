package ok;

/* JADX INFO: loaded from: classes3.dex */
public class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f23660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f23661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f23662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f23663d;

    public f() {
        b();
    }

    @Override // ok.e
    public double a(double d10, a aVar) {
        double d11 = aVar.f23651f * d10;
        double d12 = aVar.f23649d;
        double d13 = this.f23662c;
        double d14 = d11 + (d12 * d13) + (aVar.f23650e * this.f23660a);
        double d15 = aVar.f23647b;
        double d16 = this.f23663d;
        double d17 = (d14 - (d15 * d16)) - (aVar.f23648c * this.f23661b);
        this.f23660a = d13;
        this.f23661b = d16;
        this.f23662c = d10;
        this.f23663d = d17;
        return d17;
    }

    @Override // ok.e
    public void b() {
        this.f23662c = 0.0d;
        this.f23660a = 0.0d;
        this.f23663d = 0.0d;
        this.f23661b = 0.0d;
    }
}
