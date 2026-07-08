package z2;

import e3.j;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import k2.i;
import k2.t;
import w2.g;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t f32872c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.a f32873a = new androidx.collection.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f32874b = new AtomicReference();

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f32874b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f32873a) {
            tVar = (t) this.f32873a.get(jVarB);
        }
        this.f32874b.set(jVarB);
        return tVar;
    }

    public boolean c(t tVar) {
        return f32872c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f32873a) {
            androidx.collection.a aVar = this.f32873a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f32872c;
            }
            aVar.put(jVar, tVar);
        }
    }
}
