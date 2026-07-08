package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayType extends TypeBase {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final JavaType f7084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final Object f7085v;

    protected ArrayType(JavaType javaType, b bVar, Object obj, Object obj2, Object obj3, boolean z10) {
        super(obj.getClass(), bVar, null, null, javaType.hashCode(), obj2, obj3, z10);
        this.f7084u = javaType;
        this.f7085v = obj;
    }

    public static ArrayType n0(JavaType javaType, b bVar) {
        return o0(javaType, bVar, null, null);
    }

    public static ArrayType o0(JavaType javaType, b bVar, Object obj, Object obj2) {
        return new ArrayType(javaType, bVar, Array.newInstance((Class<?>) javaType.r(), 0), obj, obj2, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean A() {
        return super.A() || this.f7084u.A();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean D() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean G() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean K() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean L() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType d0(JavaType javaType) {
        return new ArrayType(javaType, this.f7098h, Array.newInstance((Class<?>) javaType.r(), 0), this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == ArrayType.class) {
            return this.f7084u.equals(((ArrayType) obj).f7084u);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType k() {
        return this.f7084u;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder l(StringBuilder sb2) {
        sb2.append('[');
        return this.f7084u.l(sb2);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder o(StringBuilder sb2) {
        sb2.append('[');
        return this.f7084u.o(sb2);
    }

    public Object[] p0() {
        return (Object[]) this.f7085v;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public ArrayType e0(Object obj) {
        return obj == this.f7084u.v() ? this : new ArrayType(this.f7084u.q0(obj), this.f7098h, this.f7085v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public ArrayType o0(Object obj) {
        return obj == this.f7084u.w() ? this : new ArrayType(this.f7084u.r0(obj), this.f7098h, this.f7085v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public ArrayType p0() {
        return this.f7083e ? this : new ArrayType(this.f7084u.p0(), this.f7098h, this.f7085v, this.f7081c, this.f7082d, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public ArrayType q0(Object obj) {
        return obj == this.f7082d ? this : new ArrayType(this.f7084u, this.f7098h, this.f7085v, this.f7081c, obj, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[array type, component type: " + this.f7084u + "]";
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public ArrayType r0(Object obj) {
        return obj == this.f7081c ? this : new ArrayType(this.f7084u, this.f7098h, this.f7085v, obj, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean z() {
        return this.f7084u.z();
    }
}
