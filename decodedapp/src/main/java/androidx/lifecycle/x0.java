package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f2707a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f2707a.values().iterator();
        while (it.hasNext()) {
            ((s0) it.next()).b();
        }
        this.f2707a.clear();
    }

    public final s0 b(String str) {
        rd.m.e(str, "key");
        return (s0) this.f2707a.get(str);
    }

    public final Set c() {
        return new HashSet(this.f2707a.keySet());
    }

    public final void d(String str, s0 s0Var) {
        rd.m.e(str, "key");
        rd.m.e(s0Var, "viewModel");
        s0 s0Var2 = (s0) this.f2707a.put(str, s0Var);
        if (s0Var2 != null) {
            s0Var2.b();
        }
    }
}
