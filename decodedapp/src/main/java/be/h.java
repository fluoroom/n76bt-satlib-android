package be;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f3873a = b.a(c.f3803a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f3874b = b.a(d.f3837a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f3875c = b.a(e.f3852a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f3876d = b.a(f.f3858a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f3877e = b.a(g.f3866a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final yd.m a(Class cls) {
        rd.m.e(cls, "it");
        return zd.c.b(k(cls), ed.q.k(), false, ed.q.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class cls) {
        rd.m.e(cls, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yd.m c(Class cls) {
        rd.m.e(cls, "it");
        return zd.c.b(k(cls), ed.q.k(), true, ed.q.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 d(Class cls) {
        rd.m.e(cls, "it");
        return new c0(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w1 e(Class cls) {
        rd.m.e(cls, "it");
        return new w1(cls);
    }

    public static final c0 k(Class cls) {
        rd.m.e(cls, "jClass");
        Object objA = f3873a.a(cls);
        rd.m.c(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (c0) objA;
    }

    public static final yd.e l(Class cls) {
        rd.m.e(cls, "jClass");
        return (yd.e) f3874b.a(cls);
    }
}
