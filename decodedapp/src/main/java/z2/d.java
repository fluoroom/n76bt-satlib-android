package z2;

import e3.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f32875a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a f32876b = new androidx.collection.a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f32875a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f32876b) {
            list = (List) this.f32876b.get(jVar);
        }
        this.f32875a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f32876b) {
            this.f32876b.put(new j(cls, cls2, cls3), list);
        }
    }
}
