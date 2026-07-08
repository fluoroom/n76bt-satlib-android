package fd;

import java.util.Map;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends ed.g {
    public final boolean c(Map.Entry entry) {
        m.e(entry, "element");
        return d(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean d(Map.Entry entry);

    public abstract /* bridge */ boolean e(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }
}
