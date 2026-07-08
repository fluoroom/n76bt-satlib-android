package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.type.b;
import com.fasterxml.jackson.databind.type.c;
import i7.h;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import n6.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class JavaType extends a implements Serializable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class f7079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f7080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Object f7081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Object f7082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f7083e;

    protected JavaType(Class cls, int i10, Object obj, Object obj2, boolean z10) {
        this.f7079a = cls;
        this.f7080b = (i10 * 31) + cls.hashCode();
        this.f7081c = obj;
        this.f7082d = obj2;
        this.f7083e = z10;
    }

    public boolean A() {
        return (this.f7082d == null && this.f7081c == null) ? false : true;
    }

    public final boolean C(Class cls) {
        return this.f7079a == cls;
    }

    public boolean D() {
        return Modifier.isAbstract(this.f7079a.getModifiers());
    }

    public boolean G() {
        return false;
    }

    public boolean H() {
        return false;
    }

    public boolean K() {
        if ((this.f7079a.getModifiers() & 1536) == 0) {
            return true;
        }
        return this.f7079a.isPrimitive();
    }

    public abstract boolean L();

    public final boolean N() {
        return h.M(this.f7079a) && this.f7079a != Enum.class;
    }

    public final boolean O() {
        return h.M(this.f7079a);
    }

    public final boolean Q() {
        return Modifier.isFinal(this.f7079a.getModifiers());
    }

    public final boolean R() {
        return this.f7079a.isInterface();
    }

    public final boolean S() {
        return this.f7079a == Object.class;
    }

    public boolean T() {
        return false;
    }

    public final boolean W() {
        return this.f7079a.isPrimitive();
    }

    public final boolean X() {
        return h.U(this.f7079a);
    }

    public boolean Y() {
        return Throwable.class.isAssignableFrom(this.f7079a);
    }

    public final boolean Z(Class cls) {
        Class cls2 = this.f7079a;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean a0(Class cls) {
        Class cls2 = this.f7079a;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr);

    public final boolean c0() {
        return this.f7083e;
    }

    public abstract JavaType d0(JavaType javaType);

    public abstract JavaType e0(Object obj);

    public abstract boolean equals(Object obj);

    public abstract JavaType f(int i10);

    public abstract JavaType f0(Object obj);

    public abstract int g();

    public JavaType g0(JavaType javaType) {
        Object objV = javaType.v();
        JavaType javaTypeI0 = objV != this.f7082d ? i0(objV) : this;
        Object objW = javaType.w();
        return objW != this.f7081c ? javaTypeI0.j0(objW) : javaTypeI0;
    }

    public JavaType h(int i10) {
        JavaType javaTypeF = f(i10);
        return javaTypeF == null ? c.b0() : javaTypeF;
    }

    public abstract JavaType h0();

    public int hashCode() {
        return this.f7080b;
    }

    public abstract JavaType i(Class cls);

    public abstract JavaType i0(Object obj);

    public abstract b j();

    public abstract JavaType j0(Object obj);

    public JavaType k() {
        return null;
    }

    public abstract StringBuilder l(StringBuilder sb2);

    public String n() {
        StringBuilder sb2 = new StringBuilder(40);
        o(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder o(StringBuilder sb2);

    public abstract List p();

    public JavaType q() {
        return null;
    }

    public final Class r() {
        return this.f7079a;
    }

    @Override // n6.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public JavaType a() {
        return null;
    }

    public abstract JavaType t();

    public abstract String toString();

    public Object v() {
        return this.f7082d;
    }

    public Object w() {
        return this.f7081c;
    }

    public boolean x() {
        return true;
    }

    public boolean z() {
        return g() > 0;
    }
}
