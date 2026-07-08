package io.grpc.internal;

import io.grpc.internal.t2;
import java.util.List;
import java.util.Map;
import qb.f;
import qb.g1;
import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.s0 f16612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16613b;

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0.e f16614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qb.q0 f16615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private qb.r0 f16616c;

        b(q0.e eVar) {
            this.f16614a = eVar;
            qb.r0 r0VarD = i.this.f16612a.d(i.this.f16613b);
            this.f16616c = r0VarD;
            if (r0VarD != null) {
                this.f16615b = r0VarD.a(eVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + i.this.f16613b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        public qb.q0 a() {
            return this.f16615b;
        }

        void b(qb.u1 u1Var) {
            a().b(u1Var);
        }

        void c() {
            a().c();
        }

        void d() {
            this.f16615b.d();
            this.f16615b = null;
        }

        qb.u1 e(q0.i iVar) {
            t2.b bVar = (t2.b) iVar.c();
            if (bVar == null) {
                try {
                    i iVar2 = i.this;
                    bVar = new t2.b(iVar2.d(iVar2.f16613b, "using default policy"), null);
                } catch (f e10) {
                    this.f16614a.f(qb.q.TRANSIENT_FAILURE, new d(qb.u1.f24783s.s(e10.getMessage())));
                    this.f16615b.d();
                    this.f16616c = null;
                    this.f16615b = new e();
                    return qb.u1.f24769e;
                }
            }
            if (this.f16616c == null || !bVar.f17149a.b().equals(this.f16616c.b())) {
                this.f16614a.f(qb.q.CONNECTING, new c());
                this.f16615b.d();
                qb.r0 r0Var = bVar.f17149a;
                this.f16616c = r0Var;
                qb.q0 q0Var = this.f16615b;
                this.f16615b = r0Var.a(this.f16614a);
                this.f16614a.b().b(f.a.INFO, "Load balancer changed from {0} to {1}", q0Var.getClass().getSimpleName(), this.f16615b.getClass().getSimpleName());
            }
            Object obj = bVar.f17150b;
            if (obj != null) {
                this.f16614a.b().b(f.a.DEBUG, "Load-balancing config: {0}", bVar.f17150b);
            }
            return a().a(q0.i.d().b(iVar.a()).c(iVar.b()).d(obj).a());
        }
    }

    private static final class c extends q0.k {
        private c() {
        }

        @Override // qb.q0.k
        public q0.g a(q0.h hVar) {
            return q0.g.i();
        }

        public String toString() {
            return r9.g.a(c.class).toString();
        }
    }

    private static final class d extends q0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qb.u1 f16618a;

        d(qb.u1 u1Var) {
            this.f16618a = u1Var;
        }

        @Override // qb.q0.k
        public q0.g a(q0.h hVar) {
            return q0.g.h(this.f16618a);
        }
    }

    static final class f extends Exception {
        private f(String str) {
            super(str);
        }
    }

    public i(String str) {
        this(qb.s0.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qb.r0 d(String str, String str2) throws f {
        qb.r0 r0VarD = this.f16612a.d(str);
        if (r0VarD != null) {
            return r0VarD;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(q0.e eVar) {
        return new b(eVar);
    }

    g1.b f(Map map) {
        List listA;
        if (map != null) {
            try {
                listA = t2.A(t2.g(map));
            } catch (RuntimeException e10) {
                return g1.b.b(qb.u1.f24771g.s("can't parse load balancer configuration").r(e10));
            }
        } else {
            listA = null;
        }
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return t2.y(listA, this.f16612a);
    }

    i(qb.s0 s0Var, String str) {
        this.f16612a = (qb.s0) r9.l.o(s0Var, "registry");
        this.f16613b = (String) r9.l.o(str, "defaultPolicy");
    }

    private static final class e extends qb.q0 {
        private e() {
        }

        @Override // qb.q0
        public qb.u1 a(q0.i iVar) {
            return qb.u1.f24769e;
        }

        @Override // qb.q0
        public void d() {
        }

        @Override // qb.q0
        public void b(qb.u1 u1Var) {
        }
    }
}
