package rd;

import be.d3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f25936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final yd.c[] f25937b;

    static {
        d0 d0Var = null;
        try {
            d0Var = (d0) d3.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (d0Var == null) {
            d0Var = new d0();
        }
        f25936a = d0Var;
        f25937b = new yd.c[0];
    }

    public static yd.f a(k kVar) {
        return f25936a.a(kVar);
    }

    public static yd.c b(Class cls) {
        return f25936a.b(cls);
    }

    public static yd.e c(Class cls) {
        return f25936a.c(cls, "");
    }

    public static yd.h d(p pVar) {
        return f25936a.d(pVar);
    }

    public static yd.k e(t tVar) {
        return f25936a.e(tVar);
    }

    public static yd.l f(v vVar) {
        return f25936a.f(vVar);
    }

    public static String g(j jVar) {
        return f25936a.g(jVar);
    }

    public static String h(o oVar) {
        return f25936a.h(oVar);
    }
}
