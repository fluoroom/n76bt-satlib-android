package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class PlaceholderForType extends a {

    /* JADX INFO: renamed from: u */
    protected final int f7089u;

    /* JADX INFO: renamed from: v */
    protected JavaType f7090v;

    public PlaceholderForType(int i10) {
        super(Object.class, b.i(), c.b0(), null, 1, null, null, false);
        this.f7089u = i10;
    }

    private Object n0() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean L() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType b0(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return (JavaType) n0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType d0(JavaType javaType) {
        return (JavaType) n0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e0(Object obj) {
        return (JavaType) n0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: f0 */
    public JavaType o0(Object obj) {
        return (JavaType) n0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: h0 */
    public JavaType p0() {
        return (JavaType) n0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: i0 */
    public JavaType q0(Object obj) {
        return (JavaType) n0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: j0 */
    public JavaType r0(Object obj) {
        return (JavaType) n0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder l(StringBuilder sb2) {
        sb2.append('$');
        sb2.append(this.f7089u + 1);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String m0() {
        return toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder o(StringBuilder sb2) {
        return l(sb2);
    }

    public JavaType o0() {
        return this.f7090v;
    }

    public void p0(JavaType javaType) {
        this.f7090v = javaType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return l(new StringBuilder()).toString();
    }
}
