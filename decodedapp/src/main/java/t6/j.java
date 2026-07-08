package t6;

import java.lang.reflect.Constructor;
import s6.u;

/* JADX INFO: loaded from: classes.dex */
public final class j extends u.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final transient Constructor f27516y;

    public j(s6.u uVar, Constructor constructor) {
        super(uVar);
        this.f27516y = constructor;
    }

    @Override // s6.u.a
    protected s6.u a0(s6.u uVar) {
        return uVar == this.f26973x ? this : new j(uVar, this.f27516y);
    }

    @Override // s6.u
    public void n(e6.j jVar, p6.h hVar, Object obj) throws v6.b {
        Object objNewInstance;
        Object objG;
        if (jVar.n() == e6.m.VALUE_NULL) {
            objG = this.f26966g.a(hVar);
        } else {
            a7.e eVar = this.f26967h;
            if (eVar != null) {
                objG = this.f26966g.g(jVar, hVar, eVar);
            } else {
                try {
                    objNewInstance = this.f27516y.newInstance(obj);
                } catch (Exception e10) {
                    i7.h.n0(e10, String.format("Failed to instantiate class %s, problem: %s", this.f27516y.getDeclaringClass().getName(), e10.getMessage()));
                    objNewInstance = null;
                }
                this.f26966g.f(jVar, hVar, objNewInstance);
                objG = objNewInstance;
            }
        }
        L(obj, objG);
    }

    @Override // s6.u
    public Object o(e6.j jVar, p6.h hVar, Object obj) {
        return N(obj, l(jVar, hVar));
    }
}
