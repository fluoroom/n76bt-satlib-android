package tj;

import kj.r0;
import oj.k;
import oj.l;
import oj.m;
import rj.e;
import rj.f;
import yj.b0;

/* JADX INFO: loaded from: classes3.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f27913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f27914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0 f27915c;

    public d(b0 b0Var, r0 r0Var) {
        this(new e("1 00000U 00000A   00001.00000000  .00000000  00000+0  00000+0 0    02", "2 00000   0.0000   0.0000 0000000   0.0000   0.0000  0.00000000    02", b0Var), b0Var, r0Var);
    }

    @Override // tj.c
    public double a() {
        return 6378135.0d;
    }

    @Override // tj.c
    public String b() {
        return "TLE";
    }

    @Override // tj.c
    public /* synthetic */ l c(l lVar) {
        return b.a(this, lVar);
    }

    @Override // tj.c
    public l d(l lVar) {
        return new k(lVar.U(this.f27915c), this.f27915c, f.I());
    }

    @Override // tj.c
    public l e(l lVar) {
        k kVar = (k) m.f23640d.a(lVar);
        e eVar = this.f27913a;
        return f.P(sj.c.a(kVar, eVar, eVar.m(lVar.getDate()), this.f27914b), this.f27915c).e().l();
    }

    @Override // tj.c
    public l f(l lVar, l lVar2) {
        return m.f23640d.a(lVar2);
    }

    public d(e eVar, b0 b0Var, r0 r0Var) {
        this.f27913a = eVar;
        this.f27914b = b0Var;
        this.f27915c = r0Var;
    }
}
