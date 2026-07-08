package x6;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map f31783a;

    public n() {
    }

    public l b(String str, Class[] clsArr) {
        Map map = this.f31783a;
        if (map == null) {
            return null;
        }
        return (l) map.get(new b0(str, clsArr));
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map map = this.f31783a;
        return map == null ? Collections.emptyIterator() : map.values().iterator();
    }

    public n(Map map) {
        this.f31783a = map;
    }
}
