package qb;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s1 f24740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24741b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s1 f24743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f24744c;

        public b a(a1 a1Var, o1 o1Var) {
            return b(p1.a((a1) r9.l.o(a1Var, "method must not be null"), (o1) r9.l.o(o1Var, "handler must not be null")));
        }

        public b b(p1 p1Var) {
            a1 a1VarB = p1Var.b();
            r9.l.k(this.f24742a.equals(a1VarB.d()), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", this.f24742a, a1VarB.c());
            String strC = a1VarB.c();
            r9.l.w(!this.f24744c.containsKey(strC), "Method by same name already registered: %s", strC);
            this.f24744c.put(strC, p1Var);
            return this;
        }

        public r1 c() {
            s1 s1Var = this.f24743b;
            if (s1Var == null) {
                ArrayList arrayList = new ArrayList(this.f24744c.size());
                Iterator it = this.f24744c.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((p1) it.next()).b());
                }
                s1Var = new s1(this.f24742a, arrayList);
            }
            HashMap map = new HashMap(this.f24744c);
            for (a1 a1Var : s1Var.a()) {
                p1 p1Var = (p1) map.remove(a1Var.c());
                if (p1Var == null) {
                    throw new IllegalStateException("No method bound for descriptor entry " + a1Var.c());
                }
                if (p1Var.b() != a1Var) {
                    throw new IllegalStateException("Bound method for " + a1Var.c() + " not same instance as method in service descriptor");
                }
            }
            if (map.size() <= 0) {
                return new r1(s1Var, this.f24744c);
            }
            throw new IllegalStateException("No entry in descriptor matching bound method " + ((p1) map.values().iterator().next()).b().c());
        }

        private b(s1 s1Var) {
            this.f24744c = new HashMap();
            this.f24743b = (s1) r9.l.o(s1Var, "serviceDescriptor");
            this.f24742a = s1Var.b();
        }
    }

    public static b a(s1 s1Var) {
        return new b(s1Var);
    }

    private r1(s1 s1Var, Map map) {
        this.f24740a = (s1) r9.l.o(s1Var, "serviceDescriptor");
        this.f24741b = DesugarCollections.unmodifiableMap(new HashMap(map));
    }
}
