package l2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f20332a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f20333b = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f20334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f20335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f20336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f20337d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f20335b == null) {
                this.f20335b = new ArrayList();
            }
            this.f20335b.add(obj);
        }

        public Object b() {
            int iC = c();
            if (iC > 0) {
                return this.f20335b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f20335b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f20337d = this;
            this.f20336c = this;
            this.f20334a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f20332a;
        aVar.f20337d = aVar2;
        aVar.f20336c = aVar2.f20336c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f20332a;
        aVar.f20337d = aVar2.f20337d;
        aVar.f20336c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f20337d;
        aVar2.f20336c = aVar.f20336c;
        aVar.f20336c.f20337d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f20336c.f20337d = aVar;
        aVar.f20337d.f20336c = aVar;
    }

    public Object a(m mVar) {
        a aVar = (a) this.f20333b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            this.f20333b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(m mVar, Object obj) {
        a aVar = (a) this.f20333b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            c(aVar);
            this.f20333b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f20332a.f20337d; !aVar.equals(this.f20332a); aVar = aVar.f20337d) {
            Object objB = aVar.b();
            if (objB != null) {
                return objB;
            }
            e(aVar);
            this.f20333b.remove(aVar.f20334a);
            ((m) aVar.f20334a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f20332a.f20336c;
        boolean z10 = false;
        while (!aVar.equals(this.f20332a)) {
            sb2.append('{');
            sb2.append(aVar.f20334a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f20336c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
