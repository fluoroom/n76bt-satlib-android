package yd;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class q implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f32535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f32536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type[] f32537c;

    static final /* synthetic */ class a extends rd.l implements qd.l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f32538s = new a();

        a() {
            super(1, s.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final String l(Type type) {
            rd.m.e(type, "p0");
            return s.h(type);
        }
    }

    public q(Class cls, Type type, List list) {
        rd.m.e(cls, "rawType");
        rd.m.e(list, "typeArguments");
        this.f32535a = cls;
        this.f32536b = type;
        this.f32537c = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return rd.m.a(this.f32535a, parameterizedType.getRawType()) && rd.m.a(this.f32536b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f32537c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f32536b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f32535a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f32536b;
        if (type != null) {
            sb2.append(s.h(type));
            sb2.append("$");
            sb2.append(this.f32535a.getSimpleName());
        } else {
            sb2.append(s.h(this.f32535a));
        }
        Type[] typeArr = this.f32537c;
        if (!(typeArr.length == 0)) {
            ed.o.N(typeArr, sb2, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f32538s);
        }
        return sb2.toString();
    }

    public int hashCode() {
        int iHashCode = this.f32535a.hashCode();
        Type type = this.f32536b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
