package rf;

import ed.q;
import ee.i;
import eg.a2;
import eg.m2;
import eg.r0;
import fg.g;
import fg.n;
import he.h;
import java.util.Collection;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a2 f26000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f26001b;

    public c(a2 a2Var) {
        m.e(a2Var, "projection");
        this.f26000a = a2Var;
        s().a();
        m2 m2Var = m2.f12140e;
    }

    public Void a() {
        return null;
    }

    public final n b() {
        return this.f26001b;
    }

    @Override // eg.u1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c p(g gVar) {
        m.e(gVar, "kotlinTypeRefiner");
        a2 a2VarP = s().p(gVar);
        m.d(a2VarP, "refine(...)");
        return new c(a2VarP);
    }

    public final void d(n nVar) {
        this.f26001b = nVar;
    }

    @Override // eg.u1
    public Collection e() {
        r0 type = s().a() == m2.f12142g ? s().getType() : o().J();
        m.b(type);
        return q.e(type);
    }

    @Override // eg.u1
    public List getParameters() {
        return q.k();
    }

    @Override // eg.u1
    public i o() {
        i iVarO = s().getType().N0().o();
        m.d(iVarO, "getBuiltIns(...)");
        return iVarO;
    }

    @Override // eg.u1
    public /* bridge */ /* synthetic */ h q() {
        return (h) a();
    }

    @Override // eg.u1
    public boolean r() {
        return false;
    }

    @Override // rf.b
    public a2 s() {
        return this.f26000a;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + s() + ')';
    }
}
