package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Constructor f31701d;

    public f(j0 j0Var, Constructor constructor, r rVar, r[] rVarArr) {
        super(j0Var, rVar, rVarArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.f31701d = constructor;
    }

    @Override // x6.p
    public Class A(int i10) {
        Class<?>[] parameterTypes = this.f31701d.getParameterTypes();
        if (i10 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i10];
    }

    @Override // x6.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Constructor b() {
        return this.f31701d;
    }

    @Override // x6.k
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public f q(r rVar) {
        return new f(this.f31764a, this.f31701d, rVar, this.f31787c);
    }

    @Override // x6.b
    public String d() {
        return this.f31701d.getName();
    }

    @Override // x6.b
    public Class e() {
        return this.f31701d.getDeclaringClass();
    }

    @Override // x6.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i7.h.H(obj, f.class)) {
            return false;
        }
        Constructor constructor = ((f) obj).f31701d;
        return constructor == null ? this.f31701d == null : constructor.equals(this.f31701d);
    }

    @Override // x6.b
    public JavaType f() {
        return this.f31764a.a(e());
    }

    @Override // x6.b
    public int hashCode() {
        return this.f31701d.getName().hashCode();
    }

    @Override // x6.k
    public Class k() {
        return this.f31701d.getDeclaringClass();
    }

    @Override // x6.k
    public Member n() {
        return this.f31701d;
    }

    @Override // x6.k
    public Object o(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + k().getName());
    }

    @Override // x6.k
    public void p(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + k().getName());
    }

    @Override // x6.p
    public final Object r() {
        return this.f31701d.newInstance(null);
    }

    @Override // x6.p
    public final Object s(Object[] objArr) {
        return this.f31701d.newInstance(objArr);
    }

    @Override // x6.p
    public final Object t(Object obj) {
        return this.f31701d.newInstance(obj);
    }

    @Override // x6.b
    public String toString() {
        int parameterCount = this.f31701d.getParameterCount();
        return String.format("[constructor for %s (%d arg%s), annotations: %s", i7.h.Y(this.f31701d.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? "" : "s", this.f31765b);
    }

    @Override // x6.p
    public int x() {
        return this.f31701d.getParameterCount();
    }

    @Override // x6.p
    public JavaType z(int i10) {
        Type[] genericParameterTypes = this.f31701d.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this.f31764a.a(genericParameterTypes[i10]);
    }
}
