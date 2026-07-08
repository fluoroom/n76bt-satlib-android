package g7;

import p6.o;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f13565c = new a0();

    protected a0() {
        super(p6.o.class);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void g(p6.o oVar, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        oVar.e(gVar, d0Var, hVar);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, p6.o oVar) {
        if (oVar instanceof o.a) {
            return ((o.a) oVar).f(d0Var);
        }
        return false;
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void f(p6.o oVar, e6.g gVar, p6.d0 d0Var) {
        oVar.d(gVar, d0Var);
    }
}
