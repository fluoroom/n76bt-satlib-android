package nc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements kc.b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List f22663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f22664b;

    @Override // nc.a
    public boolean a(kc.b bVar) {
        oc.b.c(bVar, "Disposable item is null");
        if (this.f22664b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f22664b) {
                    return false;
                }
                List list = this.f22663a;
                if (list != null && list.remove(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // nc.a
    public boolean b(kc.b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // nc.a
    public boolean c(kc.b bVar) {
        oc.b.c(bVar, "d is null");
        if (!this.f22664b) {
            synchronized (this) {
                try {
                    if (!this.f22664b) {
                        List linkedList = this.f22663a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f22663a = linkedList;
                        }
                        linkedList.add(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // kc.b
    public boolean d() {
        return this.f22664b;
    }

    @Override // kc.b
    public void dispose() {
        if (this.f22664b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f22664b) {
                    return;
                }
                this.f22664b = true;
                List list = this.f22663a;
                this.f22663a = null;
                e(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((kc.b) it.next()).dispose();
            } catch (Throwable th2) {
                lc.b.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new lc.a(arrayList);
            }
            throw xc.e.d((Throwable) arrayList.get(0));
        }
    }
}
