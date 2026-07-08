package kj;

import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class y0 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f20271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zj.d f20272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zj.c f20273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f20274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient zj.j f20275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient Map f20276f = new HashMap();

    public y0(b2 b2Var, zj.d dVar, zj.c cVar, int i10, double d10, int i11, double d11, double d12) {
        this.f20271a = b2Var;
        this.f20272b = dVar;
        this.f20273c = cVar;
        this.f20274d = d10;
        this.f20275e = new zj.j(i10, i11, d11, d12, new z1(i10, b2Var, d10));
    }

    @Override // kj.b2
    public /* synthetic */ b1 a(yj.b bVar) {
        return a2.a(this, bVar);
    }

    @Override // kj.b2
    public y1 b(yj.b bVar) {
        return y1.k(bVar, this.f20272b, this.f20273c, (List) this.f20275e.b(bVar).collect(Collectors.toList()));
    }

    @Override // kj.b2
    public /* synthetic */ t1 c(yj.b bVar) {
        return a2.b(this, bVar);
    }

    public int d() {
        return this.f20275e.a();
    }

    public b2 e() {
        return this.f20271a;
    }

    public double f() {
        return this.f20274d;
    }
}
