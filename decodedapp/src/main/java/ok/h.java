package ok;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23666a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k[] f23667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f23668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f23669d;

    public h(int i10) {
        if (i10 % 2 == 1) {
            this.f23667b = new k[(i10 / 2) + 1];
        } else {
            this.f23667b = new k[i10 / 2];
        }
    }

    public void a(di.a aVar, di.a aVar2) {
        this.f23667b[this.f23666a / 2] = new k(aVar, aVar2);
        this.f23666a++;
    }

    public void b(di.a aVar, di.a aVar2) {
        if (aVar == null) {
            System.out.println("LayoutBase addConj() pole == null");
        }
        if (aVar2 == null) {
            System.out.println("LayoutBase addConj() zero == null");
        }
        if (this.f23667b == null) {
            System.out.println("LayoutBase addConj() m_pair == null");
        }
        this.f23667b[this.f23666a / 2] = new k(aVar, aVar2, aVar.c(), aVar2.c());
        this.f23666a += 2;
    }

    public double c() {
        return this.f23669d;
    }

    public double d() {
        return this.f23668c;
    }

    public int e() {
        return this.f23666a;
    }

    public k f(int i10) {
        return this.f23667b[i10];
    }

    public void g() {
        this.f23666a = 0;
    }

    public void h(double d10, double d11) {
        this.f23668c = d10;
        this.f23669d = d11;
    }
}
