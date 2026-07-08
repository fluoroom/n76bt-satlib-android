package ne;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends u implements cf.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.c f22677a;

    public b0(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        this.f22677a = cVar;
    }

    @Override // cf.u
    public Collection A() {
        return ed.q.k();
    }

    @Override // cf.d
    public cf.a a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return null;
    }

    @Override // cf.u
    public mf.c d() {
        return this.f22677a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && rd.m.a(d(), ((b0) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    @Override // cf.d
    public boolean m() {
        return false;
    }

    @Override // cf.u
    public Collection t(qd.l lVar) {
        rd.m.e(lVar, "nameFilter");
        return ed.q.k();
    }

    public String toString() {
        return b0.class.getName() + ": " + d();
    }

    @Override // cf.d
    public List getAnnotations() {
        return ed.q.k();
    }
}
