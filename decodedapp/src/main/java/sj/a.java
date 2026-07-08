package sj;

import kj.r0;
import oj.k;
import oj.m;
import rj.e;
import tj.d;
import yj.b0;
import zj.a1;

/* JADX INFO: loaded from: classes3.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tj.a f27385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f27386b;

    public a(double d10, int i10, double d11, b0 b0Var, r0 r0Var) {
        this.f27385a = new tj.a(new d(b0Var, r0Var), d10, i10, d11);
        this.f27386b = b0Var;
    }

    @Override // sj.b
    public e a(pj.d dVar, e eVar) {
        k kVar = (k) m.f23640d.a(this.f27385a.a(dVar.l()));
        e eVarA = c.a(kVar, eVar, eVar.m(kVar.getDate()), this.f27386b);
        for (a1 a1Var : eVar.a()) {
            if (a1Var.h()) {
                eVarA.F(a1Var.a()).i(true);
            }
        }
        return eVarA;
    }
}
