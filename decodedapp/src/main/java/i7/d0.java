package i7;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f15877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Class f15878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected JavaType f15879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f15880d;

    public d0(Class cls, boolean z10) {
        this.f15878b = cls;
        this.f15879c = null;
        this.f15880d = z10;
        this.f15877a = z10 ? e(cls) : g(cls);
    }

    public static final int d(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public static final int e(Class cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int f(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int g(Class cls) {
        return cls.getName().hashCode();
    }

    public Class a() {
        return this.f15878b;
    }

    public JavaType b() {
        return this.f15879c;
    }

    public boolean c() {
        return this.f15880d;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (d0Var.f15880d != this.f15880d) {
            return false;
        }
        Class cls = this.f15878b;
        return cls != null ? d0Var.f15878b == cls : this.f15879c.equals(d0Var.f15879c);
    }

    public final int hashCode() {
        return this.f15877a;
    }

    public final String toString() {
        if (this.f15878b != null) {
            return "{class: " + this.f15878b.getName() + ", typed? " + this.f15880d + "}";
        }
        return "{type: " + this.f15879c + ", typed? " + this.f15880d + "}";
    }

    public d0(JavaType javaType, boolean z10) {
        this.f15879c = javaType;
        this.f15878b = null;
        this.f15880d = z10;
        this.f15877a = z10 ? d(javaType) : f(javaType);
    }
}
