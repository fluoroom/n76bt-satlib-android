package o2;

import com.bumptech.glide.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f23138e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f23139f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f23141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f23142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0.d f23143d;

    private static class a implements n {
        a() {
        }

        @Override // o2.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // o2.n
        public n.a b(Object obj, int i10, int i11, i2.h hVar) {
            return null;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f23144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f23145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o f23146c;

        public b(Class cls, Class cls2, o oVar) {
            this.f23144a = cls;
            this.f23145b = cls2;
            this.f23146c = oVar;
        }

        public boolean a(Class cls) {
            return this.f23144a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f23145b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public q a(List list, l0.d dVar) {
            return new q(list, dVar);
        }
    }

    public r(l0.d dVar) {
        this(dVar, f23138e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f23140a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private n e(b bVar) {
        return (n) e3.k.e(bVar.f23146c.d(this));
    }

    private static n f() {
        return f23139f;
    }

    synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    synchronized List c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f23140a) {
                if (!this.f23142c.contains(bVar) && bVar.a(cls)) {
                    this.f23142c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f23142c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f23140a) {
                if (this.f23142c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f23142c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f23142c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f23141b.a(arrayList, this.f23143d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new j.c(cls, cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f23142c.clear();
            throw th2;
        }
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f23140a) {
            if (!arrayList.contains(bVar.f23145b) && bVar.a(cls)) {
                arrayList.add(bVar.f23145b);
            }
        }
        return arrayList;
    }

    r(l0.d dVar, c cVar) {
        this.f23140a = new ArrayList();
        this.f23142c = new HashSet();
        this.f23143d = dVar;
        this.f23141b = cVar;
    }
}
