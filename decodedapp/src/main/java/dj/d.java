package dj;

import j$.util.stream.Stream;
import java.util.List;
import kj.r0;
import kj.y1;
import uj.j;
import yj.g0;
import zj.z0;

/* JADX INFO: loaded from: classes3.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f11109a;

    public d(r0 r0Var) {
        this.f11109a = r0Var;
    }

    public static c d(r0 r0Var) {
        return new d(r0Var);
    }

    @Override // dj.c, zj.c1
    public /* synthetic */ List a() {
        return b.b(this);
    }

    @Override // uj.k
    public /* synthetic */ uj.d b(g0... g0VarArr) {
        return j.a(this, g0VarArr);
    }

    @Override // uj.k
    public /* synthetic */ Stream c(List list) {
        return j.b(this, list);
    }

    @Override // dj.c
    public a h(z0 z0Var, yj.b bVar, r0 r0Var) {
        y1 y1VarX = r0Var.x(this.f11109a, bVar);
        return new a(bVar, r0Var, y1VarX.r(), y1VarX.g(), y1VarX.j());
    }

    @Override // dj.c
    public /* synthetic */ Stream i() {
        return b.a(this);
    }
}
