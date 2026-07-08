package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class ResolvedRecursiveType extends a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected JavaType f7093u;

    public ResolvedRecursiveType(Class cls, b bVar) {
        super(cls, bVar, null, null, 0, null, null, false);
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
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e0(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType f0(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType h0() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType i0(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public b j() {
        JavaType javaType = this.f7093u;
        return javaType != null ? javaType.j() : super.j();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType j0(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder l(StringBuilder sb2) {
        JavaType javaType = this.f7093u;
        return javaType != null ? javaType.l(sb2) : sb2;
    }

    public JavaType n0() {
        return this.f7093u;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder o(StringBuilder sb2) {
        JavaType javaType = this.f7093u;
        if (javaType != null) {
            return javaType.l(sb2);
        }
        sb2.append("?");
        return sb2;
    }

    public void o0(JavaType javaType) {
        if (this.f7093u == null) {
            this.f7093u = javaType;
            return;
        }
        throw new IllegalStateException("Trying to re-set self reference; old value = " + this.f7093u + ", new = " + javaType);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public JavaType t() {
        JavaType javaType = this.f7093u;
        return javaType != null ? javaType.t() : super.t();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[recursive type; ");
        JavaType javaType = this.f7093u;
        if (javaType == null) {
            sb2.append("UNRESOLVED");
        } else {
            sb2.append(javaType.r().getName());
        }
        return sb2.toString();
    }
}
