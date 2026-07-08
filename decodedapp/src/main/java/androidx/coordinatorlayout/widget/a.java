package androidx.coordinatorlayout.widget;

import androidx.collection.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l0.d;
import l0.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f1892a = new e(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f1893b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f1894c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f1895d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f1893b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f1892a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void k(ArrayList arrayList) {
        arrayList.clear();
        this.f1892a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f1893b.containsKey(obj) || !this.f1893b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f1893b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f1893b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f1893b.containsKey(obj)) {
            return;
        }
        this.f1893b.put(obj, null);
    }

    public void c() {
        int size = this.f1893b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f1893b.j(i10);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f1893b.clear();
    }

    public boolean d(Object obj) {
        return this.f1893b.containsKey(obj);
    }

    public List g(Object obj) {
        return (List) this.f1893b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f1893b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f1893b.j(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1893b.f(i10));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f1894c.clear();
        this.f1895d.clear();
        int size = this.f1893b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f1893b.f(i10), this.f1894c, this.f1895d);
        }
        return this.f1894c;
    }

    public boolean j(Object obj) {
        int size = this.f1893b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f1893b.j(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
