package qb;

import java.net.URI;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import qb.a;
import r9.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.c f24617a = a.c.a("io.grpc.NameResolver.ATTR_BACKEND_SERVICE");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m1 f24619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z1 f24620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f f24621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f24622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final qb.f f24623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f24624g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f24625h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final e1 f24626i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final i1 f24627j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final IdentityHashMap f24628k;

        /* JADX INFO: renamed from: qb.g1$a$a, reason: collision with other inner class name */
        public static final class C0339a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Integer f24629a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private m1 f24630b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private z1 f24631c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private f f24632d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private ScheduledExecutorService f24633e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private qb.f f24634f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f24635g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f24636h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private e1 f24637i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private i1 f24638j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private IdentityHashMap f24639k;

            C0339a() {
            }

            public a l() {
                return new a(this, null);
            }

            public C0339a m(b bVar, Object obj) {
                r9.l.o(bVar, "key");
                r9.l.o(obj, "value");
                if (this.f24639k == null) {
                    this.f24639k = new IdentityHashMap();
                }
                this.f24639k.put(bVar, obj);
                return this;
            }

            public C0339a n(qb.f fVar) {
                this.f24634f = (qb.f) r9.l.n(fVar);
                return this;
            }

            public C0339a o(int i10) {
                this.f24629a = Integer.valueOf(i10);
                return this;
            }

            public C0339a p(e1 e1Var) {
                this.f24637i = e1Var;
                return this;
            }

            public C0339a q(i1 i1Var) {
                this.f24638j = i1Var;
                return this;
            }

            public C0339a r(Executor executor) {
                this.f24635g = executor;
                return this;
            }

            public C0339a s(String str) {
                this.f24636h = str;
                return this;
            }

            public C0339a t(m1 m1Var) {
                this.f24630b = (m1) r9.l.n(m1Var);
                return this;
            }

            public C0339a u(ScheduledExecutorService scheduledExecutorService) {
                this.f24633e = (ScheduledExecutorService) r9.l.n(scheduledExecutorService);
                return this;
            }

            public C0339a v(f fVar) {
                this.f24632d = (f) r9.l.n(fVar);
                return this;
            }

            public C0339a w(z1 z1Var) {
                this.f24631c = (z1) r9.l.n(z1Var);
                return this;
            }
        }

        public static final class b {
        }

        /* synthetic */ a(C0339a c0339a, f1 f1Var) {
            this(c0339a);
        }

        public static C0339a g() {
            return new C0339a();
        }

        public int a() {
            return this.f24618a;
        }

        public Executor b() {
            return this.f24624g;
        }

        public m1 c() {
            return this.f24619b;
        }

        public ScheduledExecutorService d() {
            ScheduledExecutorService scheduledExecutorService = this.f24622e;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        public f e() {
            return this.f24621d;
        }

        public z1 f() {
            return this.f24620c;
        }

        public String toString() {
            return r9.g.b(this).b("defaultPort", this.f24618a).d("proxyDetector", this.f24619b).d("syncContext", this.f24620c).d("serviceConfigParser", this.f24621d).d("customArgs", this.f24628k).d("scheduledExecutorService", this.f24622e).d("channelLogger", this.f24623f).d("executor", this.f24624g).d("overrideAuthority", this.f24625h).d("metricRecorder", this.f24626i).d("nameResolverRegistry", this.f24627j).toString();
        }

        private a(C0339a c0339a) {
            this.f24618a = ((Integer) r9.l.o(c0339a.f24629a, "defaultPort not set")).intValue();
            this.f24619b = (m1) r9.l.o(c0339a.f24630b, "proxyDetector not set");
            this.f24620c = (z1) r9.l.o(c0339a.f24631c, "syncContext not set");
            this.f24621d = (f) r9.l.o(c0339a.f24632d, "serviceConfigParser not set");
            this.f24622e = c0339a.f24633e;
            this.f24623f = c0339a.f24634f;
            this.f24624g = c0339a.f24635g;
            this.f24625h = c0339a.f24636h;
            this.f24626i = c0339a.f24637i;
            this.f24627j = c0339a.f24638j;
            this.f24628k = g1.b(c0339a.f24639k);
        }
    }

    public static abstract class c {
        public abstract String a();

        public abstract g1 b(URI uri, a aVar);
    }

    public static abstract class d {
        public abstract u1 a(e eVar);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w1 f24642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qb.a f24643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f24644c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private w1 f24645a = w1.b(Collections.EMPTY_LIST);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private qb.a f24646b = qb.a.f24506c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private b f24647c;

            a() {
            }

            public e a() {
                return new e(this.f24645a, this.f24646b, this.f24647c);
            }

            public a b(w1 w1Var) {
                this.f24645a = (w1) r9.l.o(w1Var, "StatusOr addresses cannot be null.");
                return this;
            }

            public a c(qb.a aVar) {
                this.f24646b = aVar;
                return this;
            }

            public a d(b bVar) {
                this.f24647c = bVar;
                return this;
            }
        }

        e(w1 w1Var, qb.a aVar, b bVar) {
            this.f24642a = w1Var;
            this.f24643b = (qb.a) r9.l.o(aVar, "attributes");
            this.f24644c = bVar;
        }

        public static a d() {
            return new a();
        }

        public w1 a() {
            return this.f24642a;
        }

        public qb.a b() {
            return this.f24643b;
        }

        public b c() {
            return this.f24644c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return r9.h.a(this.f24642a, eVar.f24642a) && r9.h.a(this.f24643b, eVar.f24643b) && r9.h.a(this.f24644c, eVar.f24644c);
        }

        public int hashCode() {
            return r9.h.b(this.f24642a, this.f24643b, this.f24644c);
        }

        public String toString() {
            g.b bVarB = r9.g.b(this);
            bVarB.d("addressesOrError", this.f24642a.toString());
            bVarB.d("attributes", this.f24643b);
            bVarB.d("serviceConfigOrError", this.f24644c);
            return bVarB.toString();
        }
    }

    public static abstract class f {
        public abstract b a(Map map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IdentityHashMap b(IdentityHashMap identityHashMap) {
        if (identityHashMap != null) {
            return new IdentityHashMap(identityHashMap);
        }
        return null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public abstract void f(d dVar);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u1 f24640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f24641b;

        private b(Object obj) {
            this.f24641b = r9.l.o(obj, "config");
            this.f24640a = null;
        }

        public static b a(Object obj) {
            return new b(obj);
        }

        public static b b(u1 u1Var) {
            return new b(u1Var);
        }

        public Object c() {
            return this.f24641b;
        }

        public u1 d() {
            return this.f24640a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (r9.h.a(this.f24640a, bVar.f24640a) && r9.h.a(this.f24641b, bVar.f24641b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return r9.h.b(this.f24640a, this.f24641b);
        }

        public String toString() {
            return this.f24641b != null ? r9.g.b(this).d("config", this.f24641b).toString() : r9.g.b(this).d("error", this.f24640a).toString();
        }

        private b(u1 u1Var) {
            this.f24641b = null;
            this.f24640a = (u1) r9.l.o(u1Var, "status");
            r9.l.j(!u1Var.q(), "cannot use OK status: %s", u1Var);
        }
    }
}
