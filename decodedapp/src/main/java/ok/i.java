package ok;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f23670a;

    public i(double d10, h hVar, h hVar2) {
        hVar.g();
        if (d10 < 0.0d) {
            throw new ArithmeticException("Cutoff frequency cannot be negative.");
        }
        if (d10 >= 0.5d) {
            throw new ArithmeticException("Cutoff frequency must be less than the Nyquist frequency.");
        }
        this.f23670a = Math.tan(d10 * 3.141592653589793d);
        int iE = hVar2.e();
        int i10 = iE / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            k kVarF = hVar2.f(i11);
            hVar.b(a(kVarF.f23671a.f23658a), a(kVarF.f23672b.f23658a));
        }
        if ((iE & 1) == 1) {
            k kVarF2 = hVar2.f(i10);
            hVar.a(a(kVarF2.f23671a.f23658a), a(kVarF2.f23672b.f23658a));
        }
        hVar.h(hVar2.d(), hVar2.c());
    }

    private di.a a(di.a aVar) {
        if (aVar.h()) {
            return new di.a(-1.0d, 0.0d);
        }
        di.a aVarI = aVar.i(this.f23670a);
        di.a aVar2 = new di.a(1.0d, 0.0d);
        return aVar2.b(aVarI).e(aVar2.k(aVarI));
    }
}
