package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f17747c;

    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f17745a = obj;
        this.f17746b = obj2;
        this.f17747c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17745a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17746b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f17745a.hashCode() ^ this.f17746b.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.A(this.f17745a, this.f17746b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f17745a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f17746b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f17746b;
        this.f17746b = obj;
        this.f17747c.put(this.f17745a, obj);
        return obj2;
    }
}
