package io.objectbox.relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ToMany<TARGET> implements List<TARGET>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Integer f17424e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f17425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f17426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map f17427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f17428d;

    private void b() {
        this.f17425a.getClass();
    }

    private void c() {
        b();
        if (this.f17427c == null) {
            synchronized (this) {
                try {
                    if (this.f17427c == null) {
                        this.f17427c = new LinkedHashMap();
                        this.f17428d = new LinkedHashMap();
                        this.f17426b = new HashMap();
                        for (Object obj : this.f17425a) {
                            Integer num = (Integer) this.f17426b.put(obj, f17424e);
                            if (num != null) {
                                this.f17426b.put(obj, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void d(Object obj) {
        c();
        Integer num = (Integer) this.f17426b.put(obj, f17424e);
        if (num != null) {
            this.f17426b.put(obj, Integer.valueOf(num.intValue() + 1));
        }
        this.f17427c.put(obj, Boolean.TRUE);
        this.f17428d.remove(obj);
    }

    private void e(Collection collection) {
        c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    private void f(Object obj) {
        c();
        Integer num = (Integer) this.f17426b.remove(obj);
        if (num != null) {
            if (num.intValue() == 1) {
                this.f17426b.remove(obj);
                this.f17427c.remove(obj);
                this.f17428d.put(obj, Boolean.TRUE);
            } else {
                if (num.intValue() > 1) {
                    this.f17426b.put(obj, Integer.valueOf(num.intValue() - 1));
                    return;
                }
                throw new IllegalStateException("Illegal count: " + num);
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean add(Object obj) {
        d(obj);
        return this.f17425a.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean addAll(Collection collection) {
        e(collection);
        return this.f17425a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized void clear() {
        try {
            c();
            List list = this.f17425a;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f17428d.put(it.next(), Boolean.TRUE);
                }
                list.clear();
            }
            Map map = this.f17427c;
            if (map != null) {
                map.clear();
            }
            Map map2 = this.f17426b;
            if (map2 != null) {
                map2.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        b();
        return this.f17425a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        b();
        return this.f17425a.containsAll(collection);
    }

    @Override // java.util.List
    public Object get(int i10) {
        b();
        return this.f17425a.get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        b();
        return this.f17425a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        b();
        return this.f17425a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        b();
        return this.f17425a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        b();
        return this.f17425a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        b();
        return this.f17425a.listIterator();
    }

    @Override // java.util.List
    public synchronized Object remove(int i10) {
        Object objRemove;
        c();
        objRemove = this.f17425a.remove(i10);
        f(objRemove);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean removeAll(Collection collection) {
        boolean zRemove;
        Iterator it = collection.iterator();
        zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean retainAll(Collection collection) {
        boolean z10;
        try {
            c();
            z10 = false;
            ArrayList arrayList = null;
            for (Object obj : this.f17425a) {
                if (!collection.contains(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(obj);
                    z10 = true;
                }
            }
            if (arrayList != null) {
                removeAll(arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Override // java.util.List
    public synchronized Object set(int i10, Object obj) {
        Object obj2;
        c();
        obj2 = this.f17425a.set(i10, obj);
        f(obj2);
        d(obj);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        b();
        return this.f17425a.size();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        b();
        return this.f17425a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        b();
        return this.f17425a.toArray();
    }

    @Override // java.util.List
    public synchronized void add(int i10, Object obj) {
        d(obj);
        this.f17425a.add(i10, obj);
    }

    @Override // java.util.List
    public synchronized boolean addAll(int i10, Collection collection) {
        e(collection);
        return this.f17425a.addAll(i10, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        b();
        return this.f17425a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        b();
        return this.f17425a.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean remove(Object obj) {
        boolean zRemove;
        c();
        zRemove = this.f17425a.remove(obj);
        if (zRemove) {
            f(obj);
        }
        return zRemove;
    }
}
