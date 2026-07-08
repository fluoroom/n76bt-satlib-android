package io.grpc.internal;

import io.grpc.internal.a3;
import io.grpc.internal.j;
import io.grpc.internal.q1;
import io.grpc.internal.s;
import io.grpc.internal.u;
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import qb.a;
import qb.f;
import qb.q0;
import qb.z1;

/* JADX INFO: loaded from: classes3.dex */
final class e1 implements qb.i0, e3 {
    private qb.u1 A;
    private volatile qb.a B;
    private final a3 C;
    private final String D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.j0 f16505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j.a f16508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f16509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f16510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f16511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qb.d0 f16512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.grpc.internal.n f16513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p f16514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final qb.f f16515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f16516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f16517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qb.z1 f16518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m f16519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile List f16520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.grpc.internal.j f16521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r9.o f16522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private z1.d f16523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private z1.d f16524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private q1 f16525u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private x f16528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile q1 f16529y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Collection f16526v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final b1 f16527w = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile qb.r f16530z = qb.r.a(qb.q.IDLE);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16531a;

        static {
            int[] iArr = new int[qb.n1.values().length];
            f16531a = iArr;
            try {
                iArr[qb.n1.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16531a[qb.n1.INTEGRITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16531a[qb.n1.PRIVACY_AND_INTEGRITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class b extends b1 {
        b() {
        }

        @Override // io.grpc.internal.b1
        protected void b() {
            e1.this.f16509e.a(e1.this);
        }

        @Override // io.grpc.internal.b1
        protected void c() {
            e1.this.f16509e.b(e1.this);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.f16523s = null;
            e1.this.f16515k.a(f.a.INFO, "CONNECTING after backoff");
            e1.this.Q(qb.q.CONNECTING);
            e1.this.X();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e1.this.f16530z.c() == qb.q.IDLE) {
                e1.this.f16515k.a(f.a.INFO, "CONNECTING as requested");
                e1.this.Q(qb.q.CONNECTING);
                e1.this.X();
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e1.this.f16530z.c() != qb.q.TRANSIENT_FAILURE) {
                return;
            }
            e1.this.O();
            e1.this.f16515k.a(f.a.INFO, "CONNECTING; backoff interrupted");
            e1.this.Q(qb.q.CONNECTING);
            e1.this.X();
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f16536a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                q1 q1Var = e1.this.f16525u;
                e1.this.f16524t = null;
                e1.this.f16525u = null;
                q1Var.b(qb.u1.f24784t.s("InternalSubchannel closed transport due to address change"));
            }
        }

        f(List list) {
            this.f16536a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            q1 q1Var;
            SocketAddress socketAddressA = e1.this.f16519o.a();
            e1.this.f16519o.h(this.f16536a);
            e1.this.f16520p = this.f16536a;
            qb.q qVarC = e1.this.f16530z.c();
            qb.q qVar = qb.q.READY;
            if ((qVarC != qVar && e1.this.f16530z.c() != qb.q.CONNECTING) || e1.this.f16519o.g(socketAddressA)) {
                q1Var = null;
            } else if (e1.this.f16530z.c() == qVar) {
                q1Var = e1.this.f16529y;
                e1.this.f16529y = null;
                e1.this.f16519o.f();
                e1.this.Q(qb.q.IDLE);
            } else {
                e1.this.f16528x.b(qb.u1.f24784t.s("InternalSubchannel closed pending transport due to address change"));
                e1.this.f16528x = null;
                e1.this.f16519o.f();
                e1.this.X();
                q1Var = null;
            }
            if (q1Var != null) {
                if (e1.this.f16524t != null) {
                    e1.this.f16525u.b(qb.u1.f24784t.s("InternalSubchannel closed transport early due to address change"));
                    e1.this.f16524t.a();
                    e1.this.f16524t = null;
                    e1.this.f16525u = null;
                }
                e1.this.f16525u = q1Var;
                e1 e1Var = e1.this;
                e1Var.f16524t = e1Var.f16518n.c(new a(), 5L, TimeUnit.SECONDS, e1.this.f16511g);
            }
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.u1 f16539a;

        g(qb.u1 u1Var) {
            this.f16539a = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            qb.q qVarC = e1.this.f16530z.c();
            qb.q qVar = qb.q.SHUTDOWN;
            if (qVarC == qVar) {
                return;
            }
            e1.this.A = this.f16539a;
            q1 q1Var = e1.this.f16529y;
            x xVar = e1.this.f16528x;
            e1.this.f16529y = null;
            e1.this.f16528x = null;
            e1.this.Q(qVar);
            e1.this.f16519o.f();
            if (e1.this.f16526v.isEmpty()) {
                e1.this.S();
            }
            e1.this.O();
            if (e1.this.f16524t != null) {
                e1.this.f16524t.a();
                e1.this.f16525u.b(this.f16539a);
                e1.this.f16524t = null;
                e1.this.f16525u = null;
            }
            if (q1Var != null) {
                q1Var.b(this.f16539a);
            }
            if (xVar != null) {
                xVar.b(this.f16539a);
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.f16515k.a(f.a.INFO, "Terminated");
            e1.this.f16509e.d(e1.this);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f16542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16543b;

        i(x xVar, boolean z10) {
            this.f16542a = xVar;
            this.f16543b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.f16527w.e(this.f16542a, this.f16543b);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.u1 f16545a;

        j(qb.u1 u1Var) {
            this.f16545a = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(e1.this.f16526v).iterator();
            while (it.hasNext()) {
                ((q1) it.next()).f(this.f16545a);
            }
        }
    }

    static final class k extends p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f16547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.internal.n f16548b;

        class a extends n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f16549a;

            /* JADX INFO: renamed from: io.grpc.internal.e1$k$a$a, reason: collision with other inner class name */
            class C0228a extends o0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ s f16551a;

                C0228a(s sVar) {
                    this.f16551a = sVar;
                }

                @Override // io.grpc.internal.o0, io.grpc.internal.s
                public void d(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
                    k.this.f16548b.a(u1Var.q());
                    super.d(u1Var, aVar, z0Var);
                }

                @Override // io.grpc.internal.o0
                protected s e() {
                    return this.f16551a;
                }
            }

            a(r rVar) {
                this.f16549a = rVar;
            }

            @Override // io.grpc.internal.n0
            protected r g() {
                return this.f16549a;
            }

            @Override // io.grpc.internal.n0, io.grpc.internal.r
            public void r(s sVar) {
                k.this.f16548b.b();
                super.r(new C0228a(sVar));
            }
        }

        /* synthetic */ k(x xVar, io.grpc.internal.n nVar, b bVar) {
            this(xVar, nVar);
        }

        @Override // io.grpc.internal.p0
        protected x a() {
            return this.f16547a;
        }

        @Override // io.grpc.internal.p0, io.grpc.internal.t
        public r g(qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, qb.k[] kVarArr) {
            return new a(super.g(a1Var, z0Var, cVar, kVarArr));
        }

        private k(x xVar, io.grpc.internal.n nVar) {
            this.f16547a = xVar;
            this.f16548b = nVar;
        }
    }

    static abstract class l {
        l() {
        }

        abstract void a(e1 e1Var);

        abstract void b(e1 e1Var);

        abstract void c(e1 e1Var, qb.r rVar);

        abstract void d(e1 e1Var);
    }

    static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f16553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16555c;

        public m(List list) {
            this.f16553a = list;
        }

        public SocketAddress a() {
            return (SocketAddress) ((qb.y) this.f16553a.get(this.f16554b)).a().get(this.f16555c);
        }

        public qb.a b() {
            return ((qb.y) this.f16553a.get(this.f16554b)).b();
        }

        public void c() {
            qb.y yVar = (qb.y) this.f16553a.get(this.f16554b);
            int i10 = this.f16555c + 1;
            this.f16555c = i10;
            if (i10 >= yVar.a().size()) {
                this.f16554b++;
                this.f16555c = 0;
            }
        }

        public boolean d() {
            return this.f16554b == 0 && this.f16555c == 0;
        }

        public boolean e() {
            return this.f16554b < this.f16553a.size();
        }

        public void f() {
            this.f16554b = 0;
            this.f16555c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            for (int i10 = 0; i10 < this.f16553a.size(); i10++) {
                int iIndexOf = ((qb.y) this.f16553a.get(i10)).a().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f16554b = i10;
                    this.f16555c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public void h(List list) {
            this.f16553a = list;
            f();
        }
    }

    private class n implements q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final x f16556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f16557b = false;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e1.this.f16521q = null;
                if (e1.this.A != null) {
                    r9.l.u(e1.this.f16529y == null, "Unexpected non-null activeTransport");
                    n nVar = n.this;
                    nVar.f16556a.b(e1.this.A);
                    return;
                }
                x xVar = e1.this.f16528x;
                n nVar2 = n.this;
                x xVar2 = nVar2.f16556a;
                if (xVar == xVar2) {
                    e1.this.f16529y = xVar2;
                    e1.this.f16528x = null;
                    e1 e1Var = e1.this;
                    e1Var.B = e1Var.f16519o.b();
                    e1.this.Q(qb.q.READY);
                    a3 a3Var = e1.this.C;
                    String str = e1.this.D;
                    n nVar3 = n.this;
                    String strI = nVar3.i(e1.this.f16519o.b(), qb.g1.f24617a);
                    n nVar4 = n.this;
                    String strI2 = nVar4.i(e1.this.f16519o.b(), qb.y.f24823e);
                    n nVar5 = n.this;
                    a3Var.b(str, strI, strI2, nVar5.h((qb.n1) e1.this.f16519o.b().b(v0.f17178a)));
                }
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.u1 f16560a;

            b(qb.u1 u1Var) {
                this.f16560a = u1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e1.this.f16530z.c() == qb.q.SHUTDOWN) {
                    return;
                }
                q1 q1Var = e1.this.f16529y;
                n nVar = n.this;
                if (q1Var == nVar.f16556a) {
                    e1.this.f16529y = null;
                    e1.this.f16519o.f();
                    e1.this.Q(qb.q.IDLE);
                    a3 a3Var = e1.this.C;
                    String str = e1.this.D;
                    n nVar2 = n.this;
                    String strI = nVar2.i(e1.this.f16519o.b(), qb.g1.f24617a);
                    n nVar3 = n.this;
                    String strI2 = nVar3.i(e1.this.f16519o.b(), qb.y.f24823e);
                    String strA = a3.a.UNKNOWN.a(null);
                    n nVar4 = n.this;
                    a3Var.c(str, strI, strI2, strA, nVar4.h((qb.n1) e1.this.f16519o.b().b(v0.f17178a)));
                    return;
                }
                x xVar = e1.this.f16528x;
                n nVar5 = n.this;
                if (xVar == nVar5.f16556a) {
                    a3 a3Var2 = e1.this.C;
                    String str2 = e1.this.D;
                    n nVar6 = n.this;
                    String strI3 = nVar6.i(e1.this.f16519o.b(), qb.g1.f24617a);
                    n nVar7 = n.this;
                    a3Var2.a(str2, strI3, nVar7.i(e1.this.f16519o.b(), qb.y.f24823e));
                    r9.l.w(e1.this.f16530z.c() == qb.q.CONNECTING, "Expected state is CONNECTING, actual state is %s", e1.this.f16530z.c());
                    e1.this.f16519o.c();
                    if (e1.this.f16519o.e()) {
                        e1.this.X();
                        return;
                    }
                    e1.this.f16528x = null;
                    e1.this.f16519o.f();
                    e1.this.W(this.f16560a);
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e1.this.f16526v.remove(n.this.f16556a);
                if (e1.this.f16530z.c() == qb.q.SHUTDOWN && e1.this.f16526v.isEmpty()) {
                    e1.this.S();
                }
            }
        }

        n(x xVar) {
            this.f16556a = xVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String h(qb.n1 n1Var) {
            int i10;
            if (n1Var == null || (i10 = a.f16531a[n1Var.ordinal()]) == 1) {
                return "none";
            }
            if (i10 == 2) {
                return "integrity_only";
            }
            if (i10 == 3) {
                return "privacy_and_integrity";
            }
            throw new IllegalArgumentException("Unknown SecurityLevel: " + n1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String i(qb.a aVar, a.c cVar) {
            String str = (String) aVar.b(cVar);
            return str == null ? "" : str;
        }

        @Override // io.grpc.internal.q1.a
        public void a() {
            e1.this.f16515k.a(f.a.INFO, "READY");
            e1.this.f16518n.execute(new a());
        }

        @Override // io.grpc.internal.q1.a
        public void b() {
            r9.l.u(this.f16557b, "transportShutdown() must be called before transportTerminated().");
            e1.this.f16515k.b(f.a.INFO, "{0} Terminated", this.f16556a.e());
            e1.this.f16512h.i(this.f16556a);
            e1.this.T(this.f16556a, false);
            Iterator it = e1.this.f16517m.iterator();
            if (!it.hasNext()) {
                e1.this.f16518n.execute(new c());
            } else {
                android.support.v4.media.session.b.a(it.next());
                this.f16556a.getAttributes();
                throw null;
            }
        }

        @Override // io.grpc.internal.q1.a
        public void c(qb.u1 u1Var) {
            e1.this.f16515k.b(f.a.INFO, "{0} SHUTDOWN with {1}", this.f16556a.e(), e1.this.U(u1Var));
            this.f16557b = true;
            e1.this.f16518n.execute(new b(u1Var));
        }

        @Override // io.grpc.internal.q1.a
        public void d(boolean z10) {
            e1.this.T(this.f16556a, z10);
        }

        @Override // io.grpc.internal.q1.a
        public qb.a e(qb.a aVar) {
            Iterator it = e1.this.f16517m.iterator();
            if (!it.hasNext()) {
                return aVar;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    static final class o extends qb.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        qb.j0 f16563a;

        o() {
        }

        @Override // qb.f
        public void a(f.a aVar, String str) {
            io.grpc.internal.o.d(this.f16563a, aVar, str);
        }

        @Override // qb.f
        public void b(f.a aVar, String str, Object... objArr) {
            io.grpc.internal.o.e(this.f16563a, aVar, str, objArr);
        }
    }

    e1(q0.b bVar, String str, String str2, j.a aVar, u uVar, ScheduledExecutorService scheduledExecutorService, r9.q qVar, qb.z1 z1Var, l lVar, qb.d0 d0Var, io.grpc.internal.n nVar, p pVar, qb.j0 j0Var, qb.f fVar, List list, String str3, qb.e1 e1Var) {
        List listA = bVar.a();
        r9.l.o(listA, "addressGroups");
        r9.l.e(!listA.isEmpty(), "addressGroups is empty");
        P(listA, "addressGroups contains null entry");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(listA));
        this.f16520p = listUnmodifiableList;
        this.f16519o = new m(listUnmodifiableList);
        this.f16506b = str;
        this.f16507c = str2;
        this.f16508d = aVar;
        this.f16510f = uVar;
        this.f16511g = scheduledExecutorService;
        this.f16522r = (r9.o) qVar.get();
        this.f16518n = z1Var;
        this.f16509e = lVar;
        this.f16512h = d0Var;
        this.f16513i = nVar;
        this.f16514j = (p) r9.l.o(pVar, "channelTracer");
        this.f16505a = (qb.j0) r9.l.o(j0Var, "logId");
        this.f16515k = (qb.f) r9.l.o(fVar, "channelLogger");
        this.f16517m = list;
        this.f16516l = ((Boolean) bVar.c(qb.q0.f24711c)).booleanValue();
        this.D = str3;
        this.C = new a3(e1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.f16518n.f();
        z1.d dVar = this.f16523s;
        if (dVar != null) {
            dVar.a();
            this.f16523s = null;
            this.f16521q = null;
        }
    }

    private static void P(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r9.l.o(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(qb.q qVar) {
        this.f16518n.f();
        R(qb.r.a(qVar));
    }

    private void R(qb.r rVar) {
        this.f16518n.f();
        if (this.f16530z.c() != rVar.c()) {
            r9.l.w(this.f16530z.c() != qb.q.SHUTDOWN, "Cannot transition out of SHUTDOWN to %s", rVar.c());
            if (this.f16516l && rVar.c() == qb.q.TRANSIENT_FAILURE) {
                this.f16530z = qb.r.a(qb.q.IDLE);
            } else {
                this.f16530z = rVar;
            }
            this.f16509e.c(this, rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        this.f16518n.execute(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(x xVar, boolean z10) {
        this.f16518n.execute(new i(xVar, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String U(qb.u1 u1Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u1Var.o());
        if (u1Var.p() != null) {
            sb2.append("(");
            sb2.append(u1Var.p());
            sb2.append(")");
        }
        if (u1Var.n() != null) {
            sb2.append("[");
            sb2.append(u1Var.n());
            sb2.append("]");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(qb.u1 u1Var) {
        this.f16518n.f();
        R(qb.r.b(u1Var));
        if (this.f16516l) {
            return;
        }
        if (this.f16521q == null) {
            this.f16521q = this.f16508d.get();
        }
        long jA = this.f16521q.a();
        r9.o oVar = this.f16522r;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jD = jA - oVar.d(timeUnit);
        this.f16515k.b(f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", U(u1Var), Long.valueOf(jD));
        r9.l.u(this.f16523s == null, "previous reconnectTask is not done");
        this.f16523s = this.f16518n.c(new c(), jD, timeUnit, this.f16511g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        SocketAddress socketAddressC;
        qb.c0 c0Var;
        this.f16518n.f();
        r9.l.u(this.f16523s == null, "Should have no reconnectTask scheduled");
        if (this.f16519o.d()) {
            this.f16522r.f().g();
        }
        SocketAddress socketAddressA = this.f16519o.a();
        b bVar = null;
        if (socketAddressA instanceof qb.c0) {
            c0Var = (qb.c0) socketAddressA;
            socketAddressC = c0Var.c();
        } else {
            socketAddressC = socketAddressA;
            c0Var = null;
        }
        qb.a aVarB = this.f16519o.b();
        String str = (String) aVarB.b(qb.y.f24822d);
        u.a aVar = new u.a();
        if (str == null) {
            str = this.f16506b;
        }
        u.a aVarG = aVar.e(str).f(aVarB).h(this.f16507c).g(c0Var);
        o oVar = new o();
        oVar.f16563a = e();
        k kVar = new k(this.f16510f.g0(socketAddressC, aVarG, oVar), this.f16513i, bVar);
        oVar.f16563a = kVar.e();
        this.f16512h.c(kVar);
        this.f16528x = kVar;
        this.f16526v.add(kVar);
        Runnable runnableC = kVar.c(new n(kVar));
        if (runnableC != null) {
            this.f16518n.b(runnableC);
        }
        this.f16515k.b(f.a.INFO, "Started transport {0}", oVar.f16563a);
    }

    void V() {
        this.f16518n.execute(new e());
    }

    public void Y(List list) {
        r9.l.o(list, "newAddressGroups");
        P(list, "newAddressGroups contains null entry");
        r9.l.e(!list.isEmpty(), "newAddressGroups is empty");
        this.f16518n.execute(new f(DesugarCollections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.internal.e3
    public t a() {
        q1 q1Var = this.f16529y;
        if (q1Var != null) {
            return q1Var;
        }
        this.f16518n.execute(new d());
        return null;
    }

    public void b(qb.u1 u1Var) {
        this.f16518n.execute(new g(u1Var));
    }

    @Override // qb.o0
    public qb.j0 e() {
        return this.f16505a;
    }

    void f(qb.u1 u1Var) {
        b(u1Var);
        this.f16518n.execute(new j(u1Var));
    }

    public String toString() {
        return r9.g.b(this).c("logId", this.f16505a.d()).d("addressGroups", this.f16520p).toString();
    }
}
