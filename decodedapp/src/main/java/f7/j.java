package f7;

import d6.k0;
import d6.n0;
import x6.e0;

/* JADX INFO: loaded from: classes.dex */
public class j extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e7.c f12854b;

    public j(e0 e0Var, e7.c cVar) {
        this(e0Var.f(), cVar);
    }

    @Override // d6.n0, d6.l0, d6.k0
    public boolean a(k0 k0Var) {
        if (k0Var.getClass() == getClass()) {
            j jVar = (j) k0Var;
            if (jVar.d() == this.f10765a && jVar.f12854b == this.f12854b) {
                return true;
            }
        }
        return false;
    }

    @Override // d6.k0
    public k0 b(Class cls) {
        return cls == this.f10765a ? this : new j(cls, this.f12854b);
    }

    @Override // d6.k0
    public Object c(Object obj) {
        try {
            return this.f12854b.p(obj);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IllegalStateException("Problem accessing property '" + this.f12854b.getName() + "': " + e11.getMessage(), e11);
        }
    }

    @Override // d6.k0
    public k0.a f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new k0.a(getClass(), this.f10765a, obj);
    }

    protected j(Class cls, e7.c cVar) {
        super(cls);
        this.f12854b = cVar;
    }

    @Override // d6.k0
    public k0 h(Object obj) {
        return this;
    }
}
