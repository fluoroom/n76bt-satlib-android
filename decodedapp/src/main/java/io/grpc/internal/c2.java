package io.grpc.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
final class c2 extends qb.q0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q0.e f16395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q0.j f16396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private qb.q f16397i = qb.q.IDLE;

    class a implements q0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0.j f16398a;

        a(q0.j jVar) {
            this.f16398a = jVar;
        }

        @Override // qb.q0.l
        public void a(qb.r rVar) {
            c2.this.g(this.f16398a, rVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16400a;

        static {
            int[] iArr = new int[qb.q.values().length];
            f16400a = iArr;
            try {
                iArr[qb.q.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16400a[qb.q.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16400a[qb.q.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16400a[qb.q.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f16401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Long f16402b;

        public c(Boolean bool) {
            this(bool, null);
        }

        c(Boolean bool, Long l10) {
            this.f16401a = bool;
            this.f16402b = l10;
        }
    }

    private static final class d extends q0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0.g f16403a;

        d(q0.g gVar) {
            this.f16403a = (q0.g) r9.l.o(gVar, "result");
        }

        @Override // qb.q0.k
        public q0.g a(q0.h hVar) {
            return this.f16403a;
        }

        public String toString() {
            return r9.g.a(d.class).d("result", this.f16403a).toString();
        }
    }

    c2(q0.e eVar) {
        this.f16395g = (q0.e) r9.l.o(eVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(q0.j jVar, qb.r rVar) {
        q0.k eVar;
        qb.q qVarC = rVar.c();
        if (qVarC == qb.q.SHUTDOWN) {
            return;
        }
        qb.q qVar = qb.q.TRANSIENT_FAILURE;
        if (qVarC == qVar || qVarC == qb.q.IDLE) {
            this.f16395g.e();
        }
        if (this.f16397i == qVar) {
            if (qVarC == qb.q.CONNECTING) {
                return;
            }
            if (qVarC == qb.q.IDLE) {
                c();
                return;
            }
        }
        int i10 = b.f16400a[qVarC.ordinal()];
        if (i10 == 1) {
            eVar = new e(this, null);
        } else if (i10 == 2) {
            eVar = new d(q0.g.i());
        } else if (i10 == 3) {
            eVar = new d(q0.g.j(jVar));
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("Unsupported state:" + qVarC);
            }
            eVar = new d(q0.g.h(rVar.d()));
        }
        h(qVarC, eVar);
    }

    private void h(qb.q qVar, q0.k kVar) {
        this.f16397i = qVar;
        this.f16395g.f(qVar, kVar);
    }

    @Override // qb.q0
    public qb.u1 a(q0.i iVar) {
        c cVar;
        Boolean bool;
        List listA = iVar.a();
        if (listA.isEmpty()) {
            qb.u1 u1VarS = qb.u1.f24784t.s("NameResolver returned no usable address. addrs=" + iVar.a() + ", attrs=" + iVar.b());
            b(u1VarS);
            return u1VarS;
        }
        if ((iVar.c() instanceof c) && (bool = (cVar = (c) iVar.c()).f16401a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listA);
            Collections.shuffle(arrayList, cVar.f16402b != null ? new Random(cVar.f16402b.longValue()) : new Random());
            listA = arrayList;
        }
        q0.j jVar = this.f16396h;
        if (jVar == null) {
            q0.j jVarA = this.f16395g.a(q0.b.d().e(listA).c());
            jVarA.h(new a(jVarA));
            this.f16396h = jVarA;
            h(qb.q.CONNECTING, new d(q0.g.j(jVarA)));
            jVarA.f();
        } else {
            jVar.i(listA);
        }
        return qb.u1.f24769e;
    }

    @Override // qb.q0
    public void b(qb.u1 u1Var) {
        q0.j jVar = this.f16396h;
        if (jVar != null) {
            jVar.g();
            this.f16396h = null;
        }
        h(qb.q.TRANSIENT_FAILURE, new d(q0.g.h(u1Var)));
    }

    @Override // qb.q0
    public void c() {
        q0.j jVar = this.f16396h;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // qb.q0
    public void d() {
        q0.j jVar = this.f16396h;
        if (jVar != null) {
            jVar.g();
        }
    }

    private final class e extends q0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f16404a;

        private e() {
            this.f16404a = new AtomicBoolean(false);
        }

        @Override // qb.q0.k
        public q0.g a(q0.h hVar) {
            if (this.f16404a.compareAndSet(false, true)) {
                qb.z1 z1VarD = c2.this.f16395g.d();
                final c2 c2Var = c2.this;
                z1VarD.execute(new Runnable() { // from class: io.grpc.internal.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2Var.c();
                    }
                });
            }
            return q0.g.i();
        }

        /* synthetic */ e(c2 c2Var, a aVar) {
            this();
        }
    }
}
