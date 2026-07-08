package yd;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class t implements WildcardType, Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32542c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t f32543d = new t(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f32544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f32545b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final t a() {
            return t.f32543d;
        }

        private a() {
        }
    }

    public t(Type type, Type type2) {
        this.f32544a = type;
        this.f32545b = type2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f32545b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.f32545b != null) {
            return "? super " + s.h(this.f32545b);
        }
        Type type = this.f32544a;
        if (type == null || rd.m.a(type, Object.class)) {
            return "?";
        }
        return "? extends " + s.h(this.f32544a);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f32544a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
