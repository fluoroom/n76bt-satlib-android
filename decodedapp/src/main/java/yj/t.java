package yj;

/* JADX INFO: loaded from: classes3.dex */
public class t implements b0 {

    /* JADX INFO: renamed from: a */
    private final b f32737a;

    /* JADX INFO: renamed from: b */
    private final u f32738b;

    t(u uVar, b0 b0Var) {
        this.f32738b = uVar;
        this.f32737a = new b(1977, 1, 1, b0Var);
    }

    @Override // yj.b0
    public y a(b bVar) {
        return this.f32738b.a(bVar).j(new y(bVar.X(this.f32737a) * 1.550519768E-8d));
    }

    @Override // yj.b0
    public /* synthetic */ boolean b(b bVar) {
        return a0.b(this, bVar);
    }

    @Override // yj.b0
    public /* synthetic */ y c(i iVar, w wVar) {
        return a0.d(this, iVar, wVar);
    }

    @Override // yj.b0
    public /* synthetic */ y d(b bVar) {
        return a0.a(this, bVar);
    }

    @Override // yj.b0
    public /* synthetic */ int e(b bVar) {
        return a0.c(this, bVar);
    }

    public String f() {
        return "TCB";
    }

    public String toString() {
        return f();
    }
}
