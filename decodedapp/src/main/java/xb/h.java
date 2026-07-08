package xb;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import qb.a;
import qb.f;
import qb.k;
import qb.q;
import qb.q0;
import qb.r;
import qb.u1;
import qb.y;
import qb.z0;
import qb.z1;
import r9.s;
import s9.m;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends q0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a.c f31880q = a.c.a("endpointTrackerKey");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final e f31881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map f31882h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z1 f31883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q0.e f31884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final xb.e f31885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private s f31886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ScheduledExecutorService f31887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private z1.d f31888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Long f31889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final qb.f f31890p;

    final class b extends xb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q0.e f31891a;

        b(q0.e eVar) {
            this.f31891a = new xb.f(eVar);
        }

        @Override // xb.c, qb.q0.e
        public q0.j a(q0.b bVar) {
            i iVar = h.this.new i(bVar, this.f31891a);
            List listA = bVar.a();
            if (h.k(listA) && h.this.f31882h.containsKey(((y) listA.get(0)).a().get(0))) {
                d dVar = (d) h.this.f31882h.get(((y) listA.get(0)).a().get(0));
                dVar.b(iVar);
                if (dVar.f31899d != null) {
                    iVar.n();
                }
            }
            return iVar;
        }

        @Override // xb.c, qb.q0.e
        public void f(q qVar, q0.k kVar) {
            this.f31891a.f(qVar, h.this.new C0430h(kVar));
        }

        @Override // xb.c
        protected q0.e g() {
            return this.f31891a;
        }
    }

    final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f31893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        qb.f f31894b;

        c(g gVar, qb.f fVar) {
            this.f31893a = gVar;
            this.f31894b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f31889o = Long.valueOf(hVar.f31886l.a());
            h.this.f31881g.h();
            for (j jVar : xb.i.a(this.f31893a, this.f31894b)) {
                h hVar2 = h.this;
                jVar.a(hVar2.f31881g, hVar2.f31889o.longValue());
            }
            h hVar3 = h.this;
            hVar3.f31881g.e(hVar3.f31889o.longValue());
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f31896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile a f31897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f31898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f31899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f31900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Set f31901f = new HashSet();

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            AtomicLong f31902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            AtomicLong f31903b;

            private a() {
                this.f31902a = new AtomicLong();
                this.f31903b = new AtomicLong();
            }

            void a() {
                this.f31902a.set(0L);
                this.f31903b.set(0L);
            }
        }

        d(g gVar) {
            this.f31897b = new a();
            this.f31898c = new a();
            this.f31896a = gVar;
        }

        boolean b(i iVar) {
            if (m() && !iVar.o()) {
                iVar.n();
            } else if (!m() && iVar.o()) {
                iVar.q();
            }
            iVar.p(this);
            return this.f31901f.add(iVar);
        }

        void c() {
            int i10 = this.f31900e;
            this.f31900e = i10 == 0 ? 0 : i10 - 1;
        }

        void d(long j10) {
            this.f31899d = Long.valueOf(j10);
            this.f31900e++;
            Iterator it = this.f31901f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).n();
            }
        }

        double e() {
            return this.f31898c.f31903b.get() / f();
        }

        long f() {
            return this.f31898c.f31902a.get() + this.f31898c.f31903b.get();
        }

        void g(boolean z10) {
            g gVar = this.f31896a;
            if (gVar.f31911e == null && gVar.f31912f == null) {
                return;
            }
            if (z10) {
                this.f31897b.f31902a.getAndIncrement();
            } else {
                this.f31897b.f31903b.getAndIncrement();
            }
        }

        public boolean h(long j10) {
            g gVar = this.f31896a;
            return j10 - (this.f31899d.longValue() + Math.min(this.f31896a.f31908b * ((long) this.f31900e), Math.max(gVar.f31908b, gVar.f31909c))) > 0;
        }

        boolean i(i iVar) {
            iVar.m();
            return this.f31901f.remove(iVar);
        }

        void j() {
            this.f31897b.a();
            this.f31898c.a();
        }

        void k() {
            this.f31900e = 0;
        }

        void l(g gVar) {
            this.f31896a = gVar;
        }

        boolean m() {
            return this.f31899d != null;
        }

        double n() {
            return this.f31898c.f31902a.get() / f();
        }

        void o() {
            this.f31898c.a();
            a aVar = this.f31897b;
            this.f31897b = this.f31898c;
            this.f31898c = aVar;
        }

        void p() {
            r9.l.u(this.f31899d != null, "not currently ejected");
            this.f31899d = null;
            Iterator it = this.f31901f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).q();
            }
        }

        public String toString() {
            return "EndpointTracker{subchannels=" + this.f31901f + '}';
        }
    }

    static final class e extends s9.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f31904a = new HashMap();

        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // s9.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.f31904a;
        }

        void c() {
            for (d dVar : this.f31904a.values()) {
                if (dVar.m()) {
                    dVar.p();
                }
                dVar.k();
            }
        }

        double d() {
            if (this.f31904a.isEmpty()) {
                return 0.0d;
            }
            Iterator it = this.f31904a.values().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                i11++;
                if (((d) it.next()).m()) {
                    i10++;
                }
            }
            return (((double) i10) / ((double) i11)) * 100.0d;
        }

        void e(long j10) {
            for (d dVar : this.f31904a.values()) {
                if (!dVar.m()) {
                    dVar.c();
                }
                if (dVar.m() && dVar.h(j10)) {
                    dVar.p();
                }
            }
        }

        void f(g gVar, Set set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Set set2 = (Set) it.next();
                if (!this.f31904a.containsKey(set2)) {
                    this.f31904a.put(set2, new d(gVar));
                }
            }
        }

        void g() {
            Iterator it = this.f31904a.values().iterator();
            while (it.hasNext()) {
                ((d) it.next()).j();
            }
        }

        void h() {
            Iterator it = this.f31904a.values().iterator();
            while (it.hasNext()) {
                ((d) it.next()).o();
            }
        }

        void i(g gVar) {
            Iterator it = this.f31904a.values().iterator();
            while (it.hasNext()) {
                ((d) it.next()).l(gVar);
            }
        }
    }

    static final class f implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f31905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qb.f f31906b;

        f(g gVar, qb.f fVar) {
            this.f31905a = gVar;
            this.f31906b = fVar;
        }

        @Override // xb.h.j
        public void a(e eVar, long j10) {
            List<d> listL = h.l(eVar, this.f31905a.f31912f.f31924d);
            if (listL.size() < this.f31905a.f31912f.f31923c || listL.size() == 0) {
                return;
            }
            for (d dVar : listL) {
                if (eVar.d() >= this.f31905a.f31910d) {
                    return;
                }
                long jF = dVar.f();
                g.b bVar = this.f31905a.f31912f;
                if (jF >= bVar.f31924d && dVar.e() > ((double) bVar.f31921a) / 100.0d) {
                    this.f31906b.b(f.a.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", dVar, Double.valueOf(dVar.e()));
                    if (new Random().nextInt(100) < this.f31905a.f31912f.f31922b) {
                        dVar.d(j10);
                    }
                }
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f31907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f31908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f31909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f31910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f31911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b f31912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f31913g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f31914a = 10000000000L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            long f31915b = 30000000000L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f31916c = 300000000000L;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f31917d = 10;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            c f31918e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            b f31919f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f31920g;

            public g a() {
                r9.l.t(this.f31920g != null);
                return new g(this);
            }

            public a b(long j10) {
                this.f31915b = j10;
                return this;
            }

            public a c(Object obj) {
                r9.l.t(obj != null);
                this.f31920g = obj;
                return this;
            }

            public a d(b bVar) {
                this.f31919f = bVar;
                return this;
            }

            public a e(long j10) {
                this.f31914a = j10;
                return this;
            }

            public a f(int i10) {
                this.f31917d = i10;
                return this;
            }

            public a g(long j10) {
                this.f31916c = j10;
                return this;
            }

            public a h(c cVar) {
                this.f31918e = cVar;
                return this;
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f31921a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f31922b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f31923c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f31924d;

            public static class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f31925a = 85;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f31926b = 100;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f31927c = 5;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f31928d = 50;

                public b a() {
                    return new b(this);
                }

                public a b(int i10) {
                    r9.l.d(i10 >= 0 && i10 <= 100);
                    this.f31926b = i10;
                    return this;
                }

                public a c(int i10) {
                    r9.l.d(i10 >= 0);
                    this.f31927c = i10;
                    return this;
                }

                public a d(int i10) {
                    r9.l.d(i10 >= 0);
                    this.f31928d = i10;
                    return this;
                }

                public a e(int i10) {
                    r9.l.d(i10 >= 0 && i10 <= 100);
                    this.f31925a = i10;
                    return this;
                }
            }

            b(a aVar) {
                this.f31921a = aVar.f31925a;
                this.f31922b = aVar.f31926b;
                this.f31923c = aVar.f31927c;
                this.f31924d = aVar.f31928d;
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f31929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f31930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f31931c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f31932d;

            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f31933a = 1900;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f31934b = 100;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f31935c = 5;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f31936d = 100;

                public c a() {
                    return new c(this);
                }

                public a b(int i10) {
                    r9.l.d(i10 >= 0 && i10 <= 100);
                    this.f31934b = i10;
                    return this;
                }

                public a c(int i10) {
                    r9.l.d(i10 >= 0);
                    this.f31935c = i10;
                    return this;
                }

                public a d(int i10) {
                    r9.l.d(i10 >= 0);
                    this.f31936d = i10;
                    return this;
                }

                public a e(int i10) {
                    this.f31933a = i10;
                    return this;
                }
            }

            c(a aVar) {
                this.f31929a = aVar.f31933a;
                this.f31930b = aVar.f31934b;
                this.f31931c = aVar.f31935c;
                this.f31932d = aVar.f31936d;
            }
        }

        boolean a() {
            return (this.f31911e == null && this.f31912f == null) ? false : true;
        }

        private g(a aVar) {
            this.f31907a = aVar.f31914a;
            this.f31908b = aVar.f31915b;
            this.f31909c = aVar.f31916c;
            this.f31910d = aVar.f31917d;
            this.f31911e = aVar.f31918e;
            this.f31912f = aVar.f31919f;
            this.f31913g = aVar.f31920g;
        }
    }

    /* JADX INFO: renamed from: xb.h$h, reason: collision with other inner class name */
    final class C0430h extends q0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0.k f31937a;

        /* JADX INFO: renamed from: xb.h$h$a */
        final class a extends k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final d f31939a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final k.a f31940b;

            /* JADX INFO: renamed from: xb.h$h$a$a, reason: collision with other inner class name */
            class C0431a extends xb.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ qb.k f31942b;

                C0431a(qb.k kVar) {
                    this.f31942b = kVar;
                }

                @Override // qb.y1
                public void i(u1 u1Var) {
                    a.this.f31939a.g(u1Var.q());
                    p().i(u1Var);
                }

                @Override // xb.a
                protected qb.k p() {
                    return this.f31942b;
                }
            }

            /* JADX INFO: renamed from: xb.h$h$a$b */
            class b extends qb.k {
                b() {
                }

                @Override // qb.y1
                public void i(u1 u1Var) {
                    a.this.f31939a.g(u1Var.q());
                }
            }

            a(d dVar, k.a aVar) {
                this.f31939a = dVar;
                this.f31940b = aVar;
            }

            @Override // qb.k.a
            public qb.k a(k.b bVar, z0 z0Var) {
                k.a aVar = this.f31940b;
                return aVar != null ? new C0431a(aVar.a(bVar, z0Var)) : new b();
            }
        }

        C0430h(q0.k kVar) {
            this.f31937a = kVar;
        }

        @Override // qb.q0.k
        public q0.g a(q0.h hVar) {
            q0.g gVarA = this.f31937a.a(hVar);
            q0.j jVarD = gVarA.d();
            return jVarD != null ? q0.g.k(jVarD, new a((d) jVarD.c().b(h.f31880q), gVarA.c())) : gVarA;
        }
    }

    final class i extends xb.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0.j f31945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f31946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private r f31948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private q0.l f31949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final qb.f f31950f;

        final class a implements q0.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final q0.l f31952a;

            a(q0.l lVar) {
                this.f31952a = lVar;
            }

            @Override // qb.q0.l
            public void a(r rVar) {
                i.this.f31948d = rVar;
                if (i.this.f31947c) {
                    return;
                }
                this.f31952a.a(rVar);
            }
        }

        i(q0.b bVar, q0.e eVar) {
            q0.b.C0340b c0340b = q0.f24710b;
            q0.l lVar = (q0.l) bVar.c(c0340b);
            if (lVar != null) {
                this.f31949e = lVar;
                this.f31945a = eVar.a(bVar.e().b(c0340b, new a(lVar)).c());
            } else {
                this.f31945a = eVar.a(bVar);
            }
            this.f31950f = this.f31945a.d();
        }

        @Override // xb.d, qb.q0.j
        public qb.a c() {
            return this.f31946b != null ? this.f31945a.c().d().d(h.f31880q, this.f31946b).a() : this.f31945a.c();
        }

        @Override // xb.d, qb.q0.j
        public void g() {
            d dVar = this.f31946b;
            if (dVar != null) {
                dVar.i(this);
            }
            super.g();
        }

        @Override // xb.d, qb.q0.j
        public void h(q0.l lVar) {
            if (this.f31949e != null) {
                super.h(lVar);
            } else {
                this.f31949e = lVar;
                super.h(new a(lVar));
            }
        }

        @Override // xb.d, qb.q0.j
        public void i(List list) {
            if (h.k(b()) && h.k(list)) {
                if (h.this.f31881g.containsValue(this.f31946b)) {
                    this.f31946b.i(this);
                }
                SocketAddress socketAddress = (SocketAddress) ((y) list.get(0)).a().get(0);
                if (h.this.f31882h.containsKey(socketAddress)) {
                    ((d) h.this.f31882h.get(socketAddress)).b(this);
                }
            } else if (!h.k(b()) || h.k(list)) {
                if (!h.k(b()) && h.k(list)) {
                    SocketAddress socketAddress2 = (SocketAddress) ((y) list.get(0)).a().get(0);
                    if (h.this.f31882h.containsKey(socketAddress2)) {
                        ((d) h.this.f31882h.get(socketAddress2)).b(this);
                    }
                }
            } else if (h.this.f31882h.containsKey(a().a().get(0))) {
                d dVar = (d) h.this.f31882h.get(a().a().get(0));
                dVar.i(this);
                dVar.j();
            }
            this.f31945a.i(list);
        }

        @Override // xb.d
        protected q0.j j() {
            return this.f31945a;
        }

        void m() {
            this.f31946b = null;
        }

        void n() {
            this.f31947c = true;
            this.f31949e.a(r.b(u1.f24784t.s("The subchannel has been ejected by outlier detection")));
            this.f31950f.b(f.a.INFO, "Subchannel ejected: {0}", this);
        }

        boolean o() {
            return this.f31947c;
        }

        void p(d dVar) {
            this.f31946b = dVar;
        }

        void q() {
            this.f31947c = false;
            r rVar = this.f31948d;
            if (rVar != null) {
                this.f31949e.a(rVar);
                this.f31950f.b(f.a.INFO, "Subchannel unejected: {0}", this);
            }
        }

        @Override // xb.d
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f31945a.b() + '}';
        }
    }

    interface j {
        void a(e eVar, long j10);
    }

    static final class k implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f31954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qb.f f31955b;

        k(g gVar, qb.f fVar) {
            r9.l.e(gVar.f31911e != null, "success rate ejection config is null");
            this.f31954a = gVar;
            this.f31955b = fVar;
        }

        static double b(Collection collection) {
            Iterator it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Double) it.next()).doubleValue();
            }
            return dDoubleValue / ((double) collection.size());
        }

        static double c(Collection collection, double d10) {
            Iterator it = collection.iterator();
            double d11 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = ((Double) it.next()).doubleValue() - d10;
                d11 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d11 / ((double) collection.size()));
        }

        @Override // xb.h.j
        public void a(e eVar, long j10) {
            Iterator it;
            List listL = h.l(eVar, this.f31954a.f31911e.f31932d);
            if (listL.size() < this.f31954a.f31911e.f31931c || listL.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listL.iterator();
            while (it2.hasNext()) {
                arrayList.add(Double.valueOf(((d) it2.next()).n()));
            }
            double dB = b(arrayList);
            double dC = c(arrayList, dB);
            double d10 = dB - (((double) (this.f31954a.f31911e.f31929a / 1000.0f)) * dC);
            Iterator it3 = listL.iterator();
            while (it3.hasNext()) {
                d dVar = (d) it3.next();
                if (eVar.d() >= this.f31954a.f31910d) {
                    return;
                }
                if (dVar.n() < d10) {
                    it = it3;
                    this.f31955b.b(f.a.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", dVar, Double.valueOf(dVar.n()), Double.valueOf(dB), Double.valueOf(dC), Double.valueOf(d10));
                    if (new Random().nextInt(100) < this.f31954a.f31911e.f31930b) {
                        dVar.d(j10);
                    }
                } else {
                    it = it3;
                }
                it3 = it;
            }
        }
    }

    public h(q0.e eVar, s sVar) {
        qb.f fVarB = eVar.b();
        this.f31890p = fVarB;
        b bVar = new b((q0.e) r9.l.o(eVar, "helper"));
        this.f31884j = bVar;
        this.f31885k = new xb.e(bVar);
        this.f31881g = new e();
        this.f31883i = (z1) r9.l.o(eVar.d(), "syncContext");
        this.f31887m = (ScheduledExecutorService) r9.l.o(eVar.c(), "timeService");
        this.f31886l = sVar;
        fVarB.a(f.a.DEBUG, "OutlierDetection lb created.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((y) it.next()).a().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List l(e eVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : eVar.values()) {
            if (dVar.f() >= i10) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    @Override // qb.q0
    public u1 a(q0.i iVar) {
        this.f31890p.b(f.a.DEBUG, "Received resolution result: {0}", iVar);
        g gVar = (g) iVar.c();
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        for (y yVar : iVar.a()) {
            m mVarJ = m.j(yVar.a());
            hashSet.add(mVarJ);
            for (SocketAddress socketAddress : yVar.a()) {
                if (map.containsKey(socketAddress)) {
                    this.f31890p.b(f.a.WARNING, "Unexpected duplicated address {0} belongs to multiple endpoints", socketAddress);
                }
                map.put(socketAddress, mVarJ);
            }
        }
        this.f31881g.keySet().retainAll(hashSet);
        this.f31881g.i(gVar);
        this.f31881g.f(gVar, hashSet);
        this.f31882h.clear();
        for (Map.Entry entry : map.entrySet()) {
            this.f31882h.put((SocketAddress) entry.getKey(), (d) this.f31881g.get(entry.getValue()));
        }
        if (gVar.a()) {
            long jMax = this.f31889o == null ? gVar.f31907a : Math.max(0L, gVar.f31907a - (this.f31886l.a() - this.f31889o.longValue()));
            z1.d dVar = this.f31888n;
            if (dVar != null) {
                dVar.a();
                this.f31881g.g();
            }
            this.f31888n = this.f31883i.d(new c(gVar, this.f31890p), jMax, gVar.f31907a, TimeUnit.NANOSECONDS, this.f31887m);
        } else {
            z1.d dVar2 = this.f31888n;
            if (dVar2 != null) {
                dVar2.a();
                this.f31889o = null;
                this.f31881g.c();
            }
        }
        return this.f31885k.a(iVar.e().d(gVar.f31913g).a());
    }

    @Override // qb.q0
    public void b(u1 u1Var) {
        this.f31885k.b(u1Var);
    }

    @Override // qb.q0
    public void d() {
        this.f31885k.d();
    }
}
