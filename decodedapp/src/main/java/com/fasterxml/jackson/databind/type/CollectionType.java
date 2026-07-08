package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionType extends CollectionLikeType {
    private CollectionType(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z10) {
        super(cls, bVar, javaType, javaTypeArr, javaType2, obj, obj2, z10);
    }

    public static CollectionType s0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new CollectionType(cls, bVar, javaType, javaTypeArr, javaType2, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionType(cls, bVar, javaType, javaTypeArr, this.f7086u, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public JavaType d0(JavaType javaType) {
        return this.f7086u == javaType ? this : new CollectionType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, javaType, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public CollectionType e0(Object obj) {
        return new CollectionType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u.q0(obj), this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[collection type; class " + this.f7079a.getName() + ", contains " + this.f7086u + "]";
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public CollectionType f0(Object obj) {
        return new CollectionType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u.r0(obj), this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public CollectionType h0() {
        return this.f7083e ? this : new CollectionType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u.p0(), this.f7081c, this.f7082d, true);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public CollectionType i0(Object obj) {
        return new CollectionType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u, this.f7081c, obj, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public CollectionType j0(Object obj) {
        return new CollectionType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7086u, obj, this.f7082d, this.f7083e);
    }
}
