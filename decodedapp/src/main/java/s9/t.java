package s9;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t implements Comparator {
    protected t() {
    }

    public static t a(Comparator comparator) {
        return comparator instanceof t ? (t) comparator : new e(comparator);
    }

    public t b(r9.e eVar) {
        return new b(eVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
