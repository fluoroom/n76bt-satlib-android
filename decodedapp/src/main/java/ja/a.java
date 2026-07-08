package ja;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a extends HashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18581a = new HashMap();

    @Override // java.util.HashMap, java.util.AbstractMap
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        a aVar = new a();
        aVar.putAll((Map) super.clone());
        return aVar;
    }

    public Object b(Object obj, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f18581a.put(it.next(), obj);
        }
        return super.put(obj, collection);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.f18581a.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj2 instanceof Collection) {
            return b(obj, (Collection) obj2);
        }
        this.f18581a.put(obj2, obj);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        if (!(objRemove instanceof Collection)) {
            this.f18581a.remove(objRemove);
            return objRemove;
        }
        Iterator it = ((Collection) objRemove).iterator();
        while (it.hasNext()) {
            this.f18581a.remove(it.next());
        }
        return objRemove;
    }
}
