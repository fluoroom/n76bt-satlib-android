package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final transient Method f31769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Class[] f31770e;

    public l(j0 j0Var, Method method, r rVar, r[] rVarArr) {
        super(j0Var, rVar, rVarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.f31769d = method;
    }

    @Override // x6.p
    public Class A(int i10) {
        Class[] clsArrK = K();
        if (i10 >= clsArrK.length) {
            return null;
        }
        return clsArrK[i10];
    }

    public final Object D(Object obj, Object... objArr) {
        return this.f31769d.invoke(obj, objArr);
    }

    @Override // x6.b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Method b() {
        return this.f31769d;
    }

    @Override // x6.k
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Method n() {
        return this.f31769d;
    }

    public Class[] K() {
        if (this.f31770e == null) {
            this.f31770e = this.f31769d.getParameterTypes();
        }
        return this.f31770e;
    }

    public Class L() {
        return this.f31769d.getReturnType();
    }

    @Override // x6.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public l q(r rVar) {
        return new l(this.f31764a, this.f31769d, rVar, this.f31787c);
    }

    @Override // x6.b
    public String d() {
        return this.f31769d.getName();
    }

    @Override // x6.b
    public Class e() {
        return this.f31769d.getReturnType();
    }

    @Override // x6.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i7.h.H(obj, l.class)) {
            return false;
        }
        Method method = ((l) obj).f31769d;
        return method == null ? this.f31769d == null : method.equals(this.f31769d);
    }

    @Override // x6.b
    public JavaType f() {
        return this.f31764a.a(this.f31769d.getGenericReturnType());
    }

    @Override // x6.b
    public int hashCode() {
        return this.f31769d.getName().hashCode();
    }

    @Override // x6.k
    public Class k() {
        return this.f31769d.getDeclaringClass();
    }

    @Override // x6.k
    public String l() {
        String strL = super.l();
        int iX = x();
        if (iX == 0) {
            return strL + "()";
        }
        if (iX != 1) {
            return String.format("%s(%d params)", super.l(), Integer.valueOf(x()));
        }
        return strL + "(" + A(0).getName() + ")";
    }

    @Override // x6.k
    public Object o(Object obj) {
        try {
            return this.f31769d.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new IllegalArgumentException("Failed to getValue() with method " + l() + ": " + i7.h.o(e10), e10);
        }
    }

    @Override // x6.k
    public void p(Object obj, Object obj2) {
        try {
            this.f31769d.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new IllegalArgumentException("Failed to setValue() with method " + l() + ": " + i7.h.o(e10), e10);
        }
    }

    @Override // x6.p
    public final Object r() {
        return this.f31769d.invoke(null, null);
    }

    @Override // x6.p
    public final Object s(Object[] objArr) {
        return this.f31769d.invoke(null, objArr);
    }

    @Override // x6.p
    public final Object t(Object obj) {
        return this.f31769d.invoke(null, obj);
    }

    @Override // x6.b
    public String toString() {
        return "[method " + l() + "]";
    }

    @Override // x6.p
    public int x() {
        return g.a(this.f31769d);
    }

    @Override // x6.p
    public JavaType z(int i10) {
        Type[] genericParameterTypes = this.f31769d.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this.f31764a.a(genericParameterTypes[i10]);
    }
}
