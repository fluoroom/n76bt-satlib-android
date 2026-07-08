package e7;

import com.fasterxml.jackson.databind.JavaType;
import java.util.concurrent.atomic.AtomicReference;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i7.p f11658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f11659b;

    public p() {
        this(4000);
    }

    private final synchronized f7.m a() {
        f7.m mVarC;
        mVarC = (f7.m) this.f11659b.get();
        if (mVarC == null) {
            mVarC = f7.m.c(this.f11658a);
            this.f11659b.set(mVarC);
        }
        return mVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(JavaType javaType, p6.p pVar, d0 d0Var) {
        synchronized (this) {
            try {
                if (this.f11658a.b(new i7.d0(javaType, false), pVar) == null) {
                    this.f11659b.set(null);
                }
                if (pVar instanceof o) {
                    ((o) pVar).b(d0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Class cls, JavaType javaType, p6.p pVar, d0 d0Var) {
        synchronized (this) {
            try {
                Object objB = this.f11658a.b(new i7.d0(cls, false), pVar);
                Object objB2 = this.f11658a.b(new i7.d0(javaType, false), pVar);
                if (objB == null || objB2 == null) {
                    this.f11659b.set(null);
                }
                if (pVar instanceof o) {
                    ((o) pVar).b(d0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(JavaType javaType, p6.p pVar) {
        synchronized (this) {
            try {
                if (this.f11658a.b(new i7.d0(javaType, true), pVar) == null) {
                    this.f11659b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(Class cls, p6.p pVar) {
        synchronized (this) {
            try {
                if (this.f11658a.b(new i7.d0(cls, true), pVar) == null) {
                    this.f11659b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public f7.m f() {
        f7.m mVar = (f7.m) this.f11659b.get();
        return mVar != null ? mVar : a();
    }

    public p6.p g(JavaType javaType) {
        p6.p pVar;
        synchronized (this) {
            pVar = (p6.p) this.f11658a.get(new i7.d0(javaType, true));
        }
        return pVar;
    }

    public p6.p h(Class cls) {
        p6.p pVar;
        synchronized (this) {
            pVar = (p6.p) this.f11658a.get(new i7.d0(cls, true));
        }
        return pVar;
    }

    public p6.p i(JavaType javaType) {
        p6.p pVar;
        synchronized (this) {
            pVar = (p6.p) this.f11658a.get(new i7.d0(javaType, false));
        }
        return pVar;
    }

    public p6.p j(Class cls) {
        p6.p pVar;
        synchronized (this) {
            pVar = (p6.p) this.f11658a.get(new i7.d0(cls, false));
        }
        return pVar;
    }

    public p(int i10) {
        this.f11658a = new i7.p(Math.min(64, i10 >> 2), i10);
        this.f11659b = new AtomicReference();
    }
}
