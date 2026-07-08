package rd;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {
    public static Map a(Object obj) {
        if ((obj instanceof sd.a) && !(obj instanceof sd.b)) {
            j(obj, "kotlin.collections.MutableMap");
        }
        return d(obj);
    }

    public static Set b(Object obj) {
        if ((obj instanceof sd.a) && !(obj instanceof sd.c)) {
            j(obj, "kotlin.collections.MutableSet");
        }
        return e(obj);
    }

    public static Object c(Object obj, int i10) {
        if (obj != null && !g(obj, i10)) {
            j(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Map d(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw i(e10);
        }
    }

    public static Set e(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw i(e10);
        }
    }

    public static int f(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).c();
        }
        if (obj instanceof qd.a) {
            return 0;
        }
        if (obj instanceof qd.l) {
            return 1;
        }
        if (obj instanceof qd.p) {
            return 2;
        }
        if (obj instanceof qd.q) {
            return 3;
        }
        if (obj instanceof qd.r) {
            return 4;
        }
        if (obj instanceof qd.s) {
            return 5;
        }
        if (obj instanceof qd.t) {
            return 6;
        }
        if (obj instanceof qd.u) {
            return 7;
        }
        if (obj instanceof qd.v) {
            return 8;
        }
        if (obj instanceof qd.w) {
            return 9;
        }
        if (obj instanceof qd.b) {
            return 10;
        }
        if (obj instanceof qd.c) {
            return 11;
        }
        if (obj instanceof qd.d) {
            return 12;
        }
        if (obj instanceof qd.e) {
            return 13;
        }
        if (obj instanceof qd.f) {
            return 14;
        }
        if (obj instanceof qd.g) {
            return 15;
        }
        if (obj instanceof qd.h) {
            return 16;
        }
        if (obj instanceof qd.i) {
            return 17;
        }
        if (obj instanceof qd.j) {
            return 18;
        }
        if (obj instanceof qd.k) {
            return 19;
        }
        if (obj instanceof qd.m) {
            return 20;
        }
        if (obj instanceof qd.n) {
            return 21;
        }
        return obj instanceof qd.o ? 22 : -1;
    }

    public static boolean g(Object obj, int i10) {
        return (obj instanceof dd.d) && f(obj) == i10;
    }

    private static Throwable h(Throwable th2) {
        return m.j(th2, h0.class.getName());
    }

    public static ClassCastException i(ClassCastException classCastException) {
        throw ((ClassCastException) h(classCastException));
    }

    public static void j(Object obj, String str) {
        k((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void k(String str) {
        throw i(new ClassCastException(str));
    }
}
