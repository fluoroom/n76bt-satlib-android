package xb;

import io.grpc.internal.e2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.q;
import qb.q0;
import qb.r0;
import qb.u1;
import qb.y;
import s9.n;
import s9.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Logger f31865l = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f31866m = new Random().nextInt();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q0.e f31868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f31869i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected q f31871k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f31867g = new ArrayList(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final r0 f31870j = new e2();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f31872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q0 f31873b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private q0.k f31875d = new q0.d(q0.g.i());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q f31874c = q.CONNECTING;

        /* JADX INFO: renamed from: xb.g$a$a, reason: collision with other inner class name */
        protected class C0429a extends c {
            protected C0429a() {
            }

            @Override // xb.c, qb.q0.e
            public void f(q qVar, q0.k kVar) {
                if (a.this.f31874c == q.SHUTDOWN) {
                    return;
                }
                a.this.f31874c = qVar;
                a.this.f31875d = kVar;
                g gVar = g.this;
                if (gVar.f31869i) {
                    return;
                }
                gVar.n();
            }

            @Override // xb.c
            protected q0.e g() {
                return g.this.f31868h;
            }
        }

        public a(Object obj, q0.c cVar) {
            this.f31872a = obj;
            this.f31873b = cVar.a(e());
        }

        protected abstract C0429a e();

        public final q0.k f() {
            return this.f31875d;
        }

        public final q g() {
            return this.f31874c;
        }

        public final Object h() {
            return this.f31872a;
        }

        public final q0 i() {
            return this.f31873b;
        }

        protected void j() {
            this.f31873b.d();
            this.f31874c = q.SHUTDOWN;
            g.f31865l.log(Level.FINE, "Child balancer {0} deleted", this.f31872a);
        }

        public String toString() {
            return "Address = " + this.f31872a + ", state = " + this.f31874c + ", picker type: " + this.f31875d.getClass() + ", lb: " + this.f31873b;
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Collection f31878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f31879b;

        public b(y yVar) {
            r9.l.o(yVar, "eag");
            if (yVar.a().size() < 10) {
                this.f31878a = yVar.a();
            } else {
                this.f31878a = new HashSet(yVar.a());
            }
            Iterator it = yVar.a().iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += ((SocketAddress) it.next()).hashCode();
            }
            this.f31879b = iHashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.f31879b == this.f31879b && bVar.f31878a.size() == this.f31878a.size()) {
                return bVar.f31878a.containsAll(this.f31878a);
            }
            return false;
        }

        public int hashCode() {
            return this.f31879b;
        }

        public String toString() {
            return this.f31878a.toString();
        }
    }

    protected g(q0.e eVar) {
        this.f31868h = (q0.e) r9.l.o(eVar, "helper");
        f31865l.log(Level.FINE, "Created");
    }

    static Iterable l(Collection collection, int i10) {
        int iA = collection.isEmpty() ? 0 : w9.d.a(i10, collection.size());
        return n.a(n.c(collection, iA), n.b(collection, iA));
    }

    private u1 m(Map map) {
        LinkedHashMap linkedHashMapC = r.c(this.f31867g.size());
        for (a aVar : this.f31867g) {
            linkedHashMapC.put(aVar.h(), aVar);
        }
        u1 u1Var = u1.f24769e;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            a aVarH = (a) linkedHashMapC.remove(entry.getKey());
            if (aVarH == null) {
                aVarH = h(entry.getKey());
            }
            arrayList.add(aVarH);
        }
        for (a aVar2 : l(arrayList, f31866m)) {
            q0.i iVar = (q0.i) map.get(aVar2.h());
            if (iVar != null) {
                u1 u1VarA = aVar2.f31873b.a(iVar);
                if (!u1VarA.q()) {
                    u1Var = u1VarA;
                }
            }
        }
        this.f31867g = arrayList;
        n();
        Iterator it = linkedHashMapC.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).j();
        }
        return u1Var;
    }

    @Override // qb.q0
    public u1 a(q0.i iVar) {
        f31865l.log(Level.FINE, "Received resolution result: {0}", iVar);
        try {
            this.f31869i = true;
            Map mapG = g(iVar);
            if (!mapG.isEmpty()) {
                return m(mapG);
            }
            u1 u1VarS = u1.f24784t.s("NameResolver returned no usable address. " + iVar);
            b(u1VarS);
            return u1VarS;
        } finally {
            this.f31869i = false;
        }
    }

    @Override // qb.q0
    public void b(u1 u1Var) {
        if (this.f31871k != q.READY) {
            this.f31868h.f(q.TRANSIENT_FAILURE, new q0.d(q0.g.h(u1Var)));
        }
    }

    @Override // qb.q0
    public void d() {
        f31865l.log(Level.FINE, "Shutdown");
        Iterator it = this.f31867g.iterator();
        while (it.hasNext()) {
            ((a) it.next()).j();
        }
        this.f31867g.clear();
    }

    protected Map g(q0.i iVar) {
        LinkedHashMap linkedHashMapC = r.c(iVar.a().size());
        for (y yVar : iVar.a()) {
            linkedHashMapC.put(new b(yVar), iVar.e().b(Collections.singletonList(yVar)).c(qb.a.c().d(q0.f24713e, Boolean.TRUE).a()).d(null).a());
        }
        return linkedHashMapC;
    }

    protected abstract a h(Object obj);

    public final Collection i() {
        return this.f31867g;
    }

    protected final q0.e j() {
        return this.f31868h;
    }

    protected final List k() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : i()) {
            if (aVar.g() == q.READY) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    protected abstract void n();
}
