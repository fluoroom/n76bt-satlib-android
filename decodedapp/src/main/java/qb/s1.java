package qb;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f24755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f24756c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f24758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f24759c;

        /* JADX INFO: Access modifiers changed from: private */
        public b e(Collection collection) {
            this.f24758b.addAll(collection);
            return this;
        }

        public b f(a1 a1Var) {
            this.f24758b.add((a1) r9.l.o(a1Var, "method"));
            return this;
        }

        public s1 g() {
            return new s1(this);
        }

        public b h(String str) {
            this.f24757a = (String) r9.l.o(str, "name");
            return this;
        }

        public b i(Object obj) {
            this.f24759c = obj;
            return this;
        }

        private b(String str) {
            this.f24758b = new ArrayList();
            h(str);
        }
    }

    public static b c(String str) {
        return new b(str);
    }

    static void d(String str, Collection collection) {
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            r9.l.o(a1Var, "method");
            String strD = a1Var.d();
            r9.l.k(str.equals(strD), "service names %s != %s", strD, str);
            r9.l.j(hashSet.add(a1Var.c()), "duplicate name %s", a1Var.c());
        }
    }

    public Collection a() {
        return this.f24755b;
    }

    public String b() {
        return this.f24754a;
    }

    public String toString() {
        return r9.g.b(this).d("name", this.f24754a).d("schemaDescriptor", this.f24756c).d("methods", this.f24755b).k().toString();
    }

    public s1(String str, Collection collection) {
        this(c(str).e((Collection) r9.l.o(collection, "methods")));
    }

    private s1(b bVar) {
        String str = bVar.f24757a;
        this.f24754a = str;
        d(str, bVar.f24758b);
        this.f24755b = DesugarCollections.unmodifiableList(new ArrayList(bVar.f24758b));
        this.f24756c = bVar.f24759c;
    }
}
