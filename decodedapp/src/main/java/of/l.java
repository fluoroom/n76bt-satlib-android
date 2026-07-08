package of;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f23481a;

    public l(Iterator it) {
        this.f23481a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f23481a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23481a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f23481a.remove();
    }
}
