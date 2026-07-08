package ok;

/* JADX INFO: loaded from: classes3.dex */
public class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f23664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f23665b;

    public g() {
        b();
    }

    @Override // ok.e
    public double a(double d10, a aVar) {
        if (aVar == null) {
            return d10;
        }
        double d11 = aVar.f23647b;
        double d12 = this.f23664a;
        double d13 = d10 - (d11 * d12);
        double d14 = aVar.f23648c;
        double d15 = this.f23665b;
        double d16 = d13 - (d14 * d15);
        double d17 = (aVar.f23651f * d16) + (aVar.f23649d * d12) + (aVar.f23650e * d15);
        this.f23665b = d12;
        this.f23664a = d16;
        return d17;
    }

    @Override // ok.e
    public void b() {
        this.f23664a = 0.0d;
        this.f23665b = 0.0d;
    }
}
