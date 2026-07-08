package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class SimpleType extends TypeBase {
    protected SimpleType(Class cls) {
        this(cls, b.i(), null, null);
    }

    public static SimpleType n0(Class cls) {
        return new SimpleType(cls, null, null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean L() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType d0(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e0(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType.f7079a != this.f7079a) {
            return false;
        }
        return this.f7098h.equals(simpleType.f7098h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder l(StringBuilder sb2) {
        return TypeBase.k0(this.f7079a, sb2, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String m0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7079a.getName());
        int iQ = this.f7098h.q();
        if (iQ > 0 && l0(iQ)) {
            sb2.append('<');
            for (int i10 = 0; i10 < iQ; i10++) {
                JavaType javaTypeF = f(i10);
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(javaTypeF.c());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder o(StringBuilder sb2) {
        TypeBase.k0(this.f7079a, sb2, false);
        int iQ = this.f7098h.q();
        if (iQ > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < iQ; i10++) {
                sb2 = f(i10).o(sb2);
            }
            sb2.append('>');
        }
        sb2.append(';');
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType o0(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType p0() {
        return this.f7083e ? this : new SimpleType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7081c, this.f7082d, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType q0(Object obj) {
        return this.f7082d == obj ? this : new SimpleType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, this.f7081c, obj, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType r0(Object obj) {
        return obj == this.f7081c ? this : new SimpleType(this.f7079a, this.f7098h, this.f7096f, this.f7097g, obj, this.f7082d, this.f7083e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[simple type, class ");
        sb2.append(m0());
        sb2.append(']');
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean x() {
        return false;
    }

    protected SimpleType(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, bVar, javaType, javaTypeArr, null, null, false);
    }

    protected SimpleType(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z10) {
        super(cls, bVar, javaType, javaTypeArr, (bVar == null ? b.i() : bVar).hashCode(), obj, obj2, z10);
    }

    protected SimpleType(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, bVar, javaType, javaTypeArr, i10, obj, obj2, z10);
    }
}
