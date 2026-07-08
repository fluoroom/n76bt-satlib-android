package xb;

import io.grpc.internal.t2;
import java.util.List;
import qb.g1;
import qb.q;
import qb.q0;
import qb.s0;
import qb.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends xb.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q0 f31846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q0.e f31847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q0.c f31848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q0 f31849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q0.c f31850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q0 f31851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q f31852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q0.k f31853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f31854o;

    class b extends xb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        q0 f31856a;

        b() {
        }

        @Override // xb.c, qb.q0.e
        public void f(q qVar, q0.k kVar) {
            if (this.f31856a == e.this.f31851l) {
                r9.l.u(e.this.f31854o, "there's pending lb while current lb has been out of READY");
                e.this.f31852m = qVar;
                e.this.f31853n = kVar;
                if (qVar != q.CONNECTING) {
                    e.this.r();
                    return;
                }
                return;
            }
            if (this.f31856a == e.this.f31849j) {
                e.this.f31854o = qVar == q.READY;
                if (e.this.f31854o || e.this.f31851l == e.this.f31846g) {
                    e.this.f31847h.f(qVar, kVar);
                } else {
                    e.this.r();
                }
            }
        }

        @Override // xb.c
        protected q0.e g() {
            return e.this.f31847h;
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q0.c f31858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f31859b;

        public c(q0.c cVar, Object obj) {
            this.f31858a = (q0.c) r9.l.o(cVar, "childFactory");
            this.f31859b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return r9.h.a(this.f31858a, cVar.f31858a) && r9.h.a(this.f31859b, cVar.f31859b);
        }

        public int hashCode() {
            return r9.h.b(this.f31858a, this.f31859b);
        }

        public String toString() {
            return r9.g.c("GracefulSwitchLoadBalancer.Config").d("childFactory", this.f31858a).d("childConfig", this.f31859b).toString();
        }
    }

    public e(q0.e eVar) {
        a aVar = new a();
        this.f31846g = aVar;
        this.f31849j = aVar;
        this.f31851l = aVar;
        this.f31847h = (q0.e) r9.l.o(eVar, "helper");
    }

    public static Object o(q0.c cVar, Object obj) {
        return new c(cVar, obj);
    }

    public static g1.b p(List list) {
        return q(list, s0.b());
    }

    public static g1.b q(List list, s0 s0Var) {
        List listA = t2.A(list);
        if (listA == null || listA.isEmpty()) {
            return g1.b.b(u1.f24783s.s("No child LB config specified"));
        }
        g1.b bVarY = t2.y(listA, s0Var);
        if (bVarY.d() != null) {
            u1 u1VarD = bVarY.d();
            return g1.b.b(u1.f24783s.r(u1VarD.n()).s(u1VarD.p()).g("Failed to select child config"));
        }
        t2.b bVar = (t2.b) bVarY.c();
        return g1.b.a(o(bVar.b(), bVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.f31847h.f(this.f31852m, this.f31853n);
        this.f31849j.d();
        this.f31849j = this.f31851l;
        this.f31848i = this.f31850k;
        this.f31851l = this.f31846g;
        this.f31850k = null;
    }

    private void s(q0.c cVar) {
        r9.l.o(cVar, "newBalancerFactory");
        if (cVar.equals(this.f31850k)) {
            return;
        }
        this.f31851l.d();
        this.f31851l = this.f31846g;
        this.f31850k = null;
        this.f31852m = q.CONNECTING;
        this.f31853n = new q0.d(q0.g.i());
        if (cVar.equals(this.f31848i)) {
            return;
        }
        b bVar = new b();
        q0 q0VarA = cVar.a(bVar);
        bVar.f31856a = q0VarA;
        this.f31851l = q0VarA;
        this.f31850k = cVar;
        if (this.f31854o) {
            return;
        }
        r();
    }

    @Override // qb.q0
    public u1 a(q0.i iVar) {
        c cVar = (c) iVar.c();
        s(cVar.f31858a);
        return e().a(iVar.e().d(cVar.f31859b).a());
    }

    @Override // qb.q0
    public void d() {
        this.f31851l.d();
        this.f31849j.d();
    }

    @Override // xb.b
    protected q0 e() {
        q0 q0Var = this.f31851l;
        return q0Var == this.f31846g ? this.f31849j : q0Var;
    }

    class a extends q0 {
        a() {
        }

        @Override // qb.q0
        public u1 a(q0.i iVar) {
            throw new AssertionError("real LB is called instead");
        }

        @Override // qb.q0
        public void b(u1 u1Var) {
            e.this.f31847h.f(q.TRANSIENT_FAILURE, new q0.d(q0.g.h(u1Var)));
        }

        @Override // qb.q0
        public void d() {
        }
    }
}
