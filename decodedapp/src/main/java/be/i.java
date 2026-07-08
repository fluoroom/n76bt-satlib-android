package be;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class i extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.l f3883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f3884b;

    public i(qd.l lVar) {
        rd.m.e(lVar, "compute");
        this.f3883a = lVar;
        this.f3884b = new ConcurrentHashMap();
    }

    @Override // be.a
    public Object a(Class cls) {
        rd.m.e(cls, "key");
        ConcurrentHashMap concurrentHashMap = this.f3884b;
        V v10 = concurrentHashMap.get(cls);
        if (v10 != 0) {
            return v10;
        }
        Object objL = this.f3883a.l(cls);
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objL);
        return vPutIfAbsent == 0 ? objL : vPutIfAbsent;
    }
}
