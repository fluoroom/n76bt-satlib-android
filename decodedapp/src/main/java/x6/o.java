package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public final class o extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p f31784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JavaType f31785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f31786e;

    public o(p pVar, JavaType javaType, j0 j0Var, r rVar, int i10) {
        super(j0Var, rVar);
        this.f31784c = pVar;
        this.f31785d = javaType;
        this.f31786e = i10;
    }

    @Override // x6.b
    public AnnotatedElement b() {
        return null;
    }

    @Override // x6.b
    public String d() {
        return "";
    }

    @Override // x6.b
    public Class e() {
        return this.f31785d.r();
    }

    @Override // x6.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i7.h.H(obj, o.class)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f31784c.equals(this.f31784c) && oVar.f31786e == this.f31786e;
    }

    @Override // x6.b
    public JavaType f() {
        return this.f31785d;
    }

    @Override // x6.b
    public int hashCode() {
        return this.f31784c.hashCode() + this.f31786e;
    }

    @Override // x6.k
    public Class k() {
        return this.f31784c.k();
    }

    @Override // x6.k
    public Member n() {
        return this.f31784c.n();
    }

    @Override // x6.k
    public Object o(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + k().getName());
    }

    @Override // x6.k
    public void p(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + k().getName());
    }

    public int r() {
        return this.f31786e;
    }

    public p s() {
        return this.f31784c;
    }

    @Override // x6.k
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public o q(r rVar) {
        return rVar == this.f31765b ? this : this.f31784c.C(this.f31786e, rVar);
    }

    @Override // x6.b
    public String toString() {
        return "[parameter #" + r() + ", annotations: " + this.f31765b + "]";
    }
}
