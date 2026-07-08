package ok;

/* JADX INFO: loaded from: classes3.dex */
public class b extends c {

    class a extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23652e;

        public a(int i10) {
            super(i10);
            this.f23652e = i10;
            h(0.0d, 1.0d);
        }

        public void i() {
            g();
            int i10 = this.f23652e;
            double d10 = i10 * 2;
            int i11 = i10 / 2;
            for (int i12 = 0; i12 < i11; i12++) {
                b(di.b.a(1.0d, ((((double) ((i12 * 2) + 1)) * 3.141592653589793d) / d10) + 1.5707963267948966d), di.a.f11100g);
            }
            if ((this.f23652e & 1) == 1) {
                a(new di.a(-1.0d), di.a.f11100g);
            }
        }
    }

    private void g(int i10, double d10, double d11, int i11) {
        a aVar = new a(i10);
        aVar.i();
        h hVar = new h(i10);
        new i(d11 / d10, hVar, aVar);
        e(hVar, i11);
    }

    public void f(int i10, double d10, double d11) {
        g(i10, d10, d11, 1);
    }
}
