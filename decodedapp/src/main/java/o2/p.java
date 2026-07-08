package o2;

import com.bumptech.glide.j;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f23125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f23126b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f23127a = new HashMap();

        /* JADX INFO: renamed from: o2.p$a$a, reason: collision with other inner class name */
        private static class C0313a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List f23128a;

            public C0313a(List list) {
                this.f23128a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f23127a.clear();
        }

        public List b(Class cls) {
            C0313a c0313a = (C0313a) this.f23127a.get(cls);
            if (c0313a == null) {
                return null;
            }
            return c0313a.f23128a;
        }

        public void c(Class cls, List list) {
            if (((C0313a) this.f23127a.put(cls, new C0313a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(l0.d dVar) {
        this(new r(dVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List listB;
        listB = this.f23126b.b(cls);
        if (listB == null) {
            listB = DesugarCollections.unmodifiableList(this.f23125a.c(cls));
            this.f23126b.c(cls, listB);
        }
        return listB;
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f23125a.b(cls, cls2, oVar);
        this.f23126b.a();
    }

    public synchronized List c(Class cls) {
        return this.f23125a.g(cls);
    }

    public List d(Object obj) {
        List listE = e(b(obj));
        if (listE.isEmpty()) {
            throw new j.c(obj);
        }
        int size = listE.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) listE.get(i10);
            if (nVar.a(obj)) {
                if (z10) {
                    arrayList = new ArrayList(size - i10);
                    z10 = false;
                }
                arrayList.add(nVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new j.c(obj, listE);
        }
        return arrayList;
    }

    private p(r rVar) {
        this.f23126b = new a();
        this.f23125a = rVar;
    }
}
