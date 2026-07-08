package x6;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final transient j0 f31764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final transient r f31765b;

    protected k(j0 j0Var, r rVar) {
        this.f31764a = j0Var;
        this.f31765b = rVar;
    }

    @Override // x6.b
    public final Annotation c(Class cls) {
        r rVar = this.f31765b;
        if (rVar == null) {
            return null;
        }
        return rVar.a(cls);
    }

    @Override // x6.b
    public final boolean g(Class cls) {
        r rVar = this.f31765b;
        if (rVar == null) {
            return false;
        }
        return rVar.b(cls);
    }

    @Override // x6.b
    public boolean h(Class[] clsArr) {
        r rVar = this.f31765b;
        if (rVar == null) {
            return false;
        }
        return rVar.c(clsArr);
    }

    public final void i(boolean z10) {
        Member memberN = n();
        if (memberN != null) {
            i7.h.g(memberN, z10);
        }
    }

    public r j() {
        return this.f31765b;
    }

    public abstract Class k();

    public String l() {
        return k().getName() + "#" + d();
    }

    public abstract Member n();

    public abstract Object o(Object obj);

    public abstract void p(Object obj, Object obj2);

    public abstract b q(r rVar);
}
