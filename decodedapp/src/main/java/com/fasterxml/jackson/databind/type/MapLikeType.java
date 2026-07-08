package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class MapLikeType extends TypeBase {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final JavaType f7087u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final JavaType f7088v;

    protected MapLikeType(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z10) {
        super(cls, bVar, javaType, javaTypeArr, (javaType2.hashCode() * 31) + javaType3.hashCode(), obj, obj2, z10);
        this.f7087u = javaType2;
        this.f7088v = javaType3;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean A() {
        return super.A() || this.f7088v.A() || this.f7087u.A();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean L() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean T() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapLikeType(cls, bVar, javaType, javaTypeArr, this.f7087u, this.f7088v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType d0(JavaType javaType) {
        return this.f7088v == javaType ? this : new MapLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, javaType, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MapLikeType mapLikeType = (MapLikeType) obj;
        return this.f7079a == mapLikeType.f7079a && this.f7087u.equals(mapLikeType.f7087u) && this.f7088v.equals(mapLikeType.f7088v);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType g0(JavaType javaType) {
        JavaType javaTypeG0;
        JavaType javaTypeG02;
        JavaType javaTypeG03 = super.g0(javaType);
        JavaType javaTypeQ = javaType.q();
        if ((javaTypeG03 instanceof MapLikeType) && javaTypeQ != null && (javaTypeG02 = this.f7087u.g0(javaTypeQ)) != this.f7087u) {
            javaTypeG03 = ((MapLikeType) javaTypeG03).p0(javaTypeG02);
        }
        JavaType javaTypeK = javaType.k();
        return (javaTypeK == null || (javaTypeG0 = this.f7088v.g0(javaTypeK)) == this.f7088v) ? javaTypeG03 : javaTypeG03.d0(javaTypeG0);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType k() {
        return this.f7088v;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder l(StringBuilder sb2) {
        return TypeBase.k0(this.f7079a, sb2, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String m0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7079a.getName());
        if (this.f7087u != null && l0(2)) {
            sb2.append('<');
            sb2.append(this.f7087u.c());
            sb2.append(',');
            sb2.append(this.f7088v.c());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public MapLikeType e0(Object obj) {
        return new MapLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v.q0(obj), this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder o(StringBuilder sb2) {
        TypeBase.k0(this.f7079a, sb2, false);
        sb2.append('<');
        this.f7087u.o(sb2);
        this.f7088v.o(sb2);
        sb2.append(">;");
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public MapLikeType o0(Object obj) {
        return new MapLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v.r0(obj), this.f7081c, this.f7082d, this.f7083e);
    }

    public MapLikeType p0(JavaType javaType) {
        return javaType == this.f7087u ? this : new MapLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, javaType, this.f7088v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType q() {
        return this.f7087u;
    }

    public MapLikeType q0(Object obj) {
        return new MapLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u.r0(obj), this.f7088v, this.f7081c, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public MapLikeType p0() {
        return this.f7083e ? this : new MapLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v.p0(), this.f7081c, this.f7082d, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public MapLikeType q0(Object obj) {
        return new MapLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v, this.f7081c, obj, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public MapLikeType r0(Object obj) {
        return new MapLikeType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7087u, this.f7088v, obj, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this.f7079a.getName(), this.f7087u, this.f7088v);
    }
}
