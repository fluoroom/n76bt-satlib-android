package e3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11422a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11425d;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f11426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f11427b;

        a(Object obj, int i10) {
            this.f11426a = obj;
            this.f11427b = i10;
        }
    }

    public h(long j10) {
        this.f11423b = j10;
        this.f11424c = j10;
    }

    private void f() {
        m(this.f11424c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f11422a.get(obj);
        return aVar != null ? aVar.f11426a : null;
    }

    public synchronized long h() {
        return this.f11424c;
    }

    protected int i(Object obj) {
        return 1;
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i10 = i(obj2);
        long j10 = i10;
        if (j10 >= this.f11424c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f11425d += j10;
        }
        a aVar = (a) this.f11422a.put(obj, obj2 == null ? null : new a(obj2, i10));
        if (aVar != null) {
            this.f11425d -= (long) aVar.f11427b;
            if (!aVar.f11426a.equals(obj2)) {
                j(obj, aVar.f11426a);
            }
        }
        f();
        return aVar != null ? aVar.f11426a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f11422a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f11425d -= (long) aVar.f11427b;
        return aVar.f11426a;
    }

    protected synchronized void m(long j10) {
        while (this.f11425d > j10) {
            Iterator it = this.f11422a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f11425d -= (long) aVar.f11427b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f11426a);
        }
    }

    protected void j(Object obj, Object obj2) {
    }
}
