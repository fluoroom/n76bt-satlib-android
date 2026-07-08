package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public final class MapType extends MapLikeType {
    private MapType(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z10) {
        super(cls, bVar, javaType, javaTypeArr, javaType2, javaType3, obj, obj2, z10);
    }

    public static MapType u0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3) {
        return new MapType(cls, bVar, javaType, javaTypeArr, javaType2, javaType3, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public MapType i0(Object obj) {
        return new MapType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v, this.f7081c, obj, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public MapType j0(Object obj) {
        return new MapType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v, obj, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapType(cls, bVar, javaType, javaTypeArr, this.f7087u, this.f7088v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public JavaType d0(JavaType javaType) {
        return this.f7088v == javaType ? this : new MapType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, javaType, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[map type; class " + this.f7079a.getName() + ", " + this.f7087u + " -> " + this.f7088v + "]";
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public MapType e0(Object obj) {
        return new MapType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v.q0(obj), this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public MapType f0(Object obj) {
        return new MapType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v.r0(obj), this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public MapType p0(JavaType javaType) {
        return javaType == this.f7087u ? this : new MapType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, javaType, this.f7088v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public MapType q0(Object obj) {
        return new MapType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u.r0(obj), this.f7088v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public MapType h0() {
        return this.f7083e ? this : new MapType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u.p0(), this.f7088v.p0(), this.f7081c, this.f7082d, true);
    }
}
