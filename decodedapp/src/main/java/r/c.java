package r;

import java.util.LinkedHashMap;
import java.util.Set;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f25266a;

    public c(int i10, float f10) {
        this.f25266a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object obj) {
        m.e(obj, "key");
        return this.f25266a.get(obj);
    }

    public final Set b() {
        Set setEntrySet = this.f25266a.entrySet();
        m.d(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f25266a.isEmpty();
    }

    public final Object d(Object obj, Object obj2) {
        m.e(obj, "key");
        m.e(obj2, "value");
        return this.f25266a.put(obj, obj2);
    }

    public final Object e(Object obj) {
        m.e(obj, "key");
        return this.f25266a.remove(obj);
    }
}
