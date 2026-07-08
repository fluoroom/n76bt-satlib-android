package t6;

import d6.b;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.b f27480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final x6.p f27481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f27482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final a[] f27483d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x6.o f27484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x6.u f27485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b.a f27486c;

        public a(x6.o oVar, x6.u uVar, b.a aVar) {
            this.f27484a = oVar;
            this.f27485b = uVar;
            this.f27486c = aVar;
        }
    }

    protected d(p6.b bVar, x6.p pVar, a[] aVarArr, int i10) {
        this.f27480a = bVar;
        this.f27481b = pVar;
        this.f27483d = aVarArr;
        this.f27482c = i10;
    }

    public static d a(p6.b bVar, x6.p pVar, x6.u[] uVarArr) {
        int iX = pVar.x();
        a[] aVarArr = new a[iX];
        for (int i10 = 0; i10 < iX; i10++) {
            x6.o oVarV = pVar.v(i10);
            aVarArr[i10] = new a(oVarV, uVarArr == null ? null : uVarArr[i10], bVar.v(oVarV));
        }
        return new d(bVar, pVar, aVarArr, iX);
    }

    public x6.p b() {
        return this.f27481b;
    }

    public p6.y c(int i10) {
        x6.u uVar = this.f27483d[i10].f27485b;
        if (uVar == null || !uVar.J()) {
            return null;
        }
        return uVar.a();
    }

    public p6.y d(int i10) {
        String strT = this.f27480a.t(this.f27483d[i10].f27484a);
        if (strT == null || strT.isEmpty()) {
            return null;
        }
        return p6.y.a(strT);
    }

    public int e() {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f27482c; i11++) {
            if (this.f27483d[i11].f27486c == null) {
                if (i10 >= 0) {
                    return -1;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public b.a f(int i10) {
        return this.f27483d[i10].f27486c;
    }

    public int g() {
        return this.f27482c;
    }

    public p6.y h(int i10) {
        x6.u uVar = this.f27483d[i10].f27485b;
        if (uVar != null) {
            return uVar.a();
        }
        return null;
    }

    public x6.o i(int i10) {
        return this.f27483d[i10].f27484a;
    }

    public x6.u j(int i10) {
        return this.f27483d[i10].f27485b;
    }

    public String toString() {
        return this.f27481b.toString();
    }
}
