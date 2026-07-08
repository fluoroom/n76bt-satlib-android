package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ReferenceType extends SimpleType {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final JavaType f7091u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final JavaType f7092v;

    protected ReferenceType(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z10) {
        super(cls, bVar, javaType, javaTypeArr, Objects.hashCode(javaType2), obj, obj2, z10);
        this.f7091u = javaType2;
        this.f7092v = javaType3 == null ? this : javaType3;
    }

    public static ReferenceType s0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new ReferenceType(cls, bVar, javaType, javaTypeArr, javaType2, null, null, null, false);
    }

    @Override // n6.a
    public boolean b() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new ReferenceType(cls, this.f7098h, javaType, javaTypeArr, this.f7091u, this.f7092v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public JavaType d0(JavaType javaType) {
        return this.f7091u == javaType ? this : new ReferenceType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, javaType, this.f7092v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ReferenceType referenceType = (ReferenceType) obj;
        if (referenceType.f7079a != this.f7079a) {
            return false;
        }
        return this.f7091u.equals(referenceType.f7091u);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType k() {
        return this.f7091u;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public StringBuilder l(StringBuilder sb2) {
        return TypeBase.k0(this.f7079a, sb2, true);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.type.TypeBase
    protected String m0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7079a.getName());
        if (this.f7091u != null && l0(1)) {
            sb2.append('<');
            sb2.append(this.f7091u.c());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public StringBuilder o(StringBuilder sb2) {
        TypeBase.k0(this.f7079a, sb2, false);
        sb2.append('<');
        StringBuilder sbO = this.f7091u.o(sb2);
        sbO.append(">;");
        return sbO;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, n6.a
    /* JADX INFO: renamed from: s */
    public JavaType a() {
        return this.f7091u;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public ReferenceType e0(Object obj) {
        return obj == this.f7091u.v() ? this : new ReferenceType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7091u.q0(obj), this.f7092v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[reference type, class ");
        sb2.append(m0());
        sb2.append('<');
        sb2.append(this.f7091u);
        sb2.append('>');
        sb2.append(']');
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReferenceType o0(Object obj) {
        if (obj == this.f7091u.w()) {
            return this;
        }
        return new ReferenceType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7091u.r0(obj), this.f7092v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReferenceType p0() {
        return this.f7083e ? this : new ReferenceType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7091u.p0(), this.f7092v, this.f7081c, this.f7082d, true);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReferenceType q0(Object obj) {
        return obj == this.f7082d ? this : new ReferenceType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7091u, this.f7092v, this.f7081c, obj, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public boolean x() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReferenceType r0(Object obj) {
        return obj == this.f7081c ? this : new ReferenceType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7091u, this.f7092v, obj, this.f7082d, this.f7083e);
    }
}
