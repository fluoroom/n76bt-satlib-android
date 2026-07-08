package f1;

import dd.d0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f12768a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f12769b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f12770c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f12771d;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                c0.e.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        m.e(str, "key");
        m.e(autoCloseable, "closeable");
        if (this.f12771d) {
            f(autoCloseable);
            return;
        }
        synchronized (this.f12768a) {
            autoCloseable2 = (AutoCloseable) this.f12769b.put(str, autoCloseable);
        }
        f(autoCloseable2);
    }

    public final void e() {
        if (this.f12771d) {
            return;
        }
        this.f12771d = true;
        synchronized (this.f12768a) {
            try {
                Iterator it = this.f12769b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f12770c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f12770c.clear();
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AutoCloseable g(String str) {
        AutoCloseable autoCloseable;
        m.e(str, "key");
        synchronized (this.f12768a) {
            autoCloseable = (AutoCloseable) this.f12769b.get(str);
        }
        return autoCloseable;
    }
}
