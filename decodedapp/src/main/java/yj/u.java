package yj;

/* JADX INFO: loaded from: classes3.dex */
public class u implements b0 {

    /* JADX INFO: renamed from: c */
    private static final double f32739c = aj.d.Z(357.53d);

    /* JADX INFO: renamed from: d */
    private static final double f32740d = aj.d.Z(0.9856003d);

    /* JADX INFO: renamed from: a */
    private final b0 f32741a;

    /* JADX INFO: renamed from: b */
    private final b f32742b;

    u(b0 b0Var, b bVar) {
        this.f32741a = b0Var;
        this.f32742b = bVar;
    }

    @Override // yj.b0
    public y a(b bVar) {
        aj.m mVarR = aj.d.R(f32739c + (f32740d * (bVar.X(this.f32742b) / 86400.0d)));
        return this.f32741a.a(bVar).j(new y(mVarR.b() * ((mVarR.a() * 2.8E-5d) + 0.001658d)));
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
        return "TDB";
    }

    public String toString() {
        return f();
    }
}
