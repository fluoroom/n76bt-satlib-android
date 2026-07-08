package ok;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23657d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23656c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a[] f23654a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e[] f23655b = null;

    private void b(int i10) {
        int i11 = 0;
        if (i10 != 0) {
            this.f23655b = new g[this.f23656c];
            while (i11 < this.f23656c) {
                this.f23655b[i11] = new g();
                i11++;
            }
            return;
        }
        this.f23655b = new f[this.f23656c];
        while (i11 < this.f23656c) {
            this.f23655b[i11] = new f();
            i11++;
        }
    }

    public void a(double d10) {
        a[] aVarArr = this.f23654a;
        if (aVarArr.length > 0) {
            aVarArr[0].a(d10);
        }
    }

    public double c(double d10) {
        for (int i10 = 0; i10 < this.f23656c; i10++) {
            e eVar = this.f23655b[i10];
            if (eVar != null) {
                d10 = eVar.a(d10, this.f23654a[i10]);
            }
        }
        return d10;
    }

    public di.a d(double d10) {
        double d11 = d10 * 6.283185307179586d;
        di.a aVarA = di.b.a(1.0d, -d11);
        di.a aVarA2 = di.b.a(1.0d, d11 * (-2.0d));
        di.a aVar = new di.a(1.0d);
        di.a aVar2 = new di.a(1.0d);
        for (int i10 = 0; i10 < this.f23656c; i10++) {
            a aVar3 = this.f23654a[i10];
            di.a aVar4 = new di.a(1.0d);
            di.a aVarA3 = j.a(j.a(new di.a(aVar3.e() / aVar3.b()), aVar3.f() / aVar3.b(), aVarA), aVar3.g() / aVar3.b(), aVarA2);
            di.a aVarA4 = j.a(j.a(aVar4, aVar3.c() / aVar3.b(), aVarA), aVar3.d() / aVar3.b(), aVarA2);
            aVar = aVar.j(aVarA3);
            aVar2 = aVar2.j(aVarA4);
        }
        return aVar.e(aVar2);
    }

    public void e(h hVar, int i10) {
        int iE = hVar.e();
        this.f23657d = iE;
        int i11 = (iE + 1) / 2;
        this.f23656c = i11;
        this.f23654a = new a[i11];
        b(i10);
        for (int i12 = 0; i12 < this.f23656c; i12++) {
            k kVarF = hVar.f(i12);
            this.f23654a[i12] = new a();
            this.f23654a[i12].j(kVarF);
        }
        a(hVar.c() / d(hVar.d() / 6.283185307179586d).a());
    }
}
