package yj;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class m0 implements g0, Serializable {

    /* JADX INFO: renamed from: a */
    private final b f32705a;

    /* JADX INFO: renamed from: b */
    private final int f32706b;

    /* JADX INFO: renamed from: c */
    private final b f32707c;

    /* JADX INFO: renamed from: d */
    private final int f32708d;

    /* JADX INFO: renamed from: e */
    private final b f32709e;

    /* JADX INFO: renamed from: f */
    private final y f32710f;

    /* JADX INFO: renamed from: g */
    private final y f32711g;

    /* JADX INFO: renamed from: h */
    private final int f32712h;

    m0(b bVar, int i10, y yVar, y yVar2, int i11, int i12, b bVar2) {
        this.f32705a = bVar;
        this.f32706b = i10;
        this.f32707c = bVar.f0(yVar);
        this.f32708d = i11;
        this.f32709e = bVar2;
        this.f32710f = yVar;
        this.f32711g = yVar2;
        this.f32712h = i12;
    }

    public y a() {
        return this.f32710f;
    }

    public int b() {
        return this.f32706b;
    }

    public y c(b bVar) {
        if (this.f32712h == 0) {
            return this.f32711g;
        }
        return this.f32711g.j(bVar.R(this.f32709e).K(this.f32712h).l(this.f32712h + 1000000000));
    }

    @Override // yj.g0
    public /* synthetic */ double e(g0 g0Var) {
        return f0.a(this, g0Var);
    }

    @Override // yj.g0
    public b getDate() {
        return this.f32705a;
    }

    public y h(i iVar, w wVar) {
        if (this.f32712h == 0) {
            return this.f32711g;
        }
        return this.f32711g.j(new y((((long) (iVar.g() - this.f32708d)) * y.f32766v.x()) + (((long) wVar.e()) * y.f32765u.x()) + (((long) wVar.f()) * y.f32764t.x()) + wVar.i().x(), wVar.i().v()).K(this.f32712h).l(1000000000));
    }

    public b i() {
        return this.f32707c;
    }
}
