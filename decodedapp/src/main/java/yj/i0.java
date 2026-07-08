package yj;

/* JADX INFO: loaded from: classes3.dex */
public class i0 implements b0 {

    /* JADX INFO: renamed from: a */
    private final k0 f32679a;

    /* JADX INFO: renamed from: b */
    private final kj.z f32680b;

    protected i0(kj.z zVar, k0 k0Var) {
        this.f32680b = zVar;
        this.f32679a = k0Var;
    }

    @Override // yj.b0
    public y a(b bVar) {
        kj.z zVar = this.f32680b;
        return this.f32679a.a(bVar).j(new y(zVar == null ? 0.0d : zVar.q(bVar)));
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
        return "UT1";
    }

    public String toString() {
        return f();
    }
}
