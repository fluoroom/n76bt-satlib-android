package qb;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import qb.l;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f24695b = new o(new l.a(), l.b.f24679a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f24696a = new ConcurrentHashMap();

    o(n... nVarArr) {
        for (n nVar : nVarArr) {
            this.f24696a.put(nVar.a(), nVar);
        }
    }

    public static o a() {
        return f24695b;
    }

    public n b(String str) {
        return (n) this.f24696a.get(str);
    }
}
