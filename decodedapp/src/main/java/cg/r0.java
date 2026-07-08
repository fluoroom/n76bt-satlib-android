package cg;

import ag.w0;
import gf.t;
import he.g1;
import he.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends ke.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ag.p f4845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final gf.t f4846u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a f4847v;

    /* JADX WARN: Illegal instructions before constructor call */
    public r0(ag.p pVar, gf.t tVar, int i10) {
        rd.m.e(pVar, "c");
        rd.m.e(tVar, "proto");
        dg.n nVarH = pVar.h();
        he.m mVarE = pVar.e();
        ie.h hVarB = ie.h.f16054l.b();
        mf.f fVarB = ag.l0.b(pVar.g(), tVar.R());
        ag.o0 o0Var = ag.o0.f557a;
        t.c cVarA0 = tVar.a0();
        rd.m.d(cVarA0, "getVariance(...)");
        super(nVarH, mVarE, hVarB, fVarB, o0Var.d(cVarA0), tVar.T(), i10, g1.f15281a, j1.a.f15286a);
        this.f4845t = pVar;
        this.f4846u = tVar;
        this.f4847v = new a(pVar.h(), new q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(r0 r0Var) {
        return ed.q.H0(r0Var.f4845t.c().d().h(r0Var.f4846u, r0Var.f4845t.g()));
    }

    @Override // ke.h
    protected List L0() {
        List listT = jf.g.t(this.f4846u, this.f4845t.j());
        if (listT.isEmpty()) {
            return ed.q.e(uf.e.m(this).z());
        }
        w0 w0VarI = this.f4845t.i();
        ArrayList arrayList = new ArrayList(ed.q.v(listT, 10));
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(w0VarI.u((gf.r) it.next()));
        }
        return arrayList;
    }

    @Override // ie.b, ie.a
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public a getAnnotations() {
        return this.f4847v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.h
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public Void K0(eg.r0 r0Var) {
        rd.m.e(r0Var, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
