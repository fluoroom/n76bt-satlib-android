package x6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Class[] f31658c = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f31659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Class[] f31660b;

    public b0(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public int a() {
        return this.f31660b.length;
    }

    public String b() {
        return this.f31659a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != b0.class) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!this.f31659a.equals(b0Var.f31659a)) {
            return false;
        }
        Class[] clsArr = b0Var.f31660b;
        int length = this.f31660b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (clsArr[i10] != this.f31660b[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f31659a.hashCode() + this.f31660b.length;
    }

    public String toString() {
        return this.f31659a + "(" + this.f31660b.length + "-args)";
    }

    public b0(Constructor constructor) {
        this("", constructor.getParameterTypes());
    }

    public b0(String str, Class[] clsArr) {
        this.f31659a = str;
        this.f31660b = clsArr == null ? f31658c : clsArr;
    }
}
