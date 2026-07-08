package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class CollectionLikeType extends TypeBase {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final JavaType f7086u;

    protected CollectionLikeType(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z10) {
        super(cls, bVar, javaType, javaTypeArr, javaType2.hashCode(), obj, obj2, z10);
        this.f7086u = javaType2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean A() {
        return super.A() || this.f7086u.A();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean H() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean L() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionLikeType(cls, bVar, javaType, javaTypeArr, this.f7086u, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType d0(JavaType javaType) {
        return this.f7086u == javaType ? this : new CollectionLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, javaType, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) obj;
        return this.f7079a == collectionLikeType.f7079a && this.f7086u.equals(collectionLikeType.f7086u);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType g0(JavaType javaType) {
        JavaType javaTypeG0;
        JavaType javaTypeG02 = super.g0(javaType);
        JavaType javaTypeK = javaType.k();
        return (javaTypeK == null || (javaTypeG0 = this.f7086u.g0(javaTypeK)) == this.f7086u) ? javaTypeG02 : javaTypeG02.d0(javaTypeG0);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType k() {
        return this.f7086u;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder l(StringBuilder sb2) {
        return TypeBase.k0(this.f7079a, sb2, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String m0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7079a.getName());
        if (this.f7086u != null && l0(1)) {
            sb2.append('<');
            sb2.append(this.f7086u.c());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType e0(Object obj) {
        return new CollectionLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u.q0(obj), this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder o(StringBuilder sb2) {
        TypeBase.k0(this.f7079a, sb2, false);
        sb2.append('<');
        this.f7086u.o(sb2);
        sb2.append(">;");
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType o0(Object obj) {
        return new CollectionLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u.r0(obj), this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType p0() {
        return this.f7083e ? this : new CollectionLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u.p0(), this.f7081c, this.f7082d, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType q0(Object obj) {
        return new CollectionLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u, this.f7081c, obj, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType r0(Object obj) {
        return new CollectionLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u, obj, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[collection-like type; class " + this.f7079a.getName() + ", contains " + this.f7086u + "]";
    }
}
