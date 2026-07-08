package d4;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f10570a = new ArrayList();

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f10570a.add(i10, new WeakReference(obj));
    }

    public void b() {
        Iterator it = this.f10570a.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return ((WeakReference) this.f10570a.get(i10)).get();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        WeakReference weakReference = (WeakReference) this.f10570a.remove(i10);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return ((WeakReference) this.f10570a.set(i10, new WeakReference(obj))).get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10570a.size();
    }
}
