package yd;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f32518a;

    public a(Type type) {
        rd.m.e(type, "elementType");
        this.f32518a = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && rd.m.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f32518a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return s.h(this.f32518a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
