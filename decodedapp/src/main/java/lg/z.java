package lg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f20658a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f20659b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(z zVar, String str) {
        rd.m.e(str, "it");
        return zVar.f20659b.getAndIncrement();
    }

    public final Map b() {
        return this.f20658a;
    }

    public abstract int c(ConcurrentHashMap concurrentHashMap, String str, qd.l lVar);

    public final n d(yd.c cVar) {
        rd.m.e(cVar, "kClass");
        return new n(f(cVar));
    }

    public final int e(String str) {
        rd.m.e(str, "keyQualifiedName");
        return c(this.f20658a, str, new y(this));
    }

    public final int f(yd.c cVar) {
        rd.m.e(cVar, "kClass");
        String strA = cVar.a();
        rd.m.b(strA);
        return e(strA);
    }

    protected final Collection h() {
        Collection collectionValues = this.f20658a.values();
        rd.m.d(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
