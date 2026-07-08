package gg;

import ed.q;
import ed.r0;
import he.g0;
import he.h0;
import he.o;
import he.u0;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f14426a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final mf.f f14427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f14428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f14429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f14430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dd.j f14431f;

    static {
        mf.f fVarK = mf.f.k(b.f14417e.d());
        rd.m.d(fVarK, "special(...)");
        f14427b = fVarK;
        f14428c = q.k();
        f14429d = q.k();
        f14430e = r0.d();
        f14431f = dd.k.b(d.f14425a);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ee.g f0() {
        return ee.g.f11786h.a();
    }

    @Override // he.h0
    public Object A0(g0 g0Var) {
        rd.m.e(g0Var, "capability");
        return null;
    }

    public mf.f B0() {
        return f14427b;
    }

    @Override // he.m
    public he.m b() {
        return null;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        return ie.h.f16054l.b();
    }

    @Override // he.j0
    public mf.f getName() {
        return B0();
    }

    @Override // he.h0
    public ee.i o() {
        return (ee.i) f14431f.getValue();
    }

    @Override // he.h0
    public Collection q(mf.c cVar, qd.l lVar) {
        rd.m.e(cVar, "fqName");
        rd.m.e(lVar, "nameFilter");
        return q.k();
    }

    @Override // he.h0
    public List s0() {
        return f14429d;
    }

    @Override // he.m
    public Object t0(o oVar, Object obj) {
        rd.m.e(oVar, "visitor");
        return null;
    }

    @Override // he.h0
    public u0 y(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // he.h0
    public boolean z(h0 h0Var) {
        rd.m.e(h0Var, "targetModule");
        return false;
    }

    @Override // he.m
    public he.m a() {
        return this;
    }
}
