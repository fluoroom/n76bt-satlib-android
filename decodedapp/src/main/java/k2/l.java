package k2;

import f3.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k2.h;
import k2.p;

/* JADX INFO: loaded from: classes.dex */
class l implements h.b, a.f {
    private static final c I = new c();
    i2.a A;
    private boolean B;
    q C;
    private boolean D;
    p E;
    private h F;
    private volatile boolean G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f19056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f3.c f19057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.a f19058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0.d f19059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f19060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f19061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n2.a f19062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n2.a f19063h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final n2.a f19064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final n2.a f19065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicInteger f19066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i2.f f19067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19068v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f19070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f19071y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private v f19072z;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a3.g f19073a;

        a(a3.g gVar) {
            this.f19073a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f19073a.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f19056a.c(this.f19073a)) {
                            l.this.e(this.f19073a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a3.g f19075a;

        b(a3.g gVar) {
            this.f19075a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f19075a.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f19056a.c(this.f19075a)) {
                            l.this.E.b();
                            l.this.g(this.f19075a);
                            l.this.r(this.f19075a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public p a(v vVar, boolean z10, i2.f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a3.g f19077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f19078b;

        d(a3.g gVar, Executor executor) {
            this.f19077a = gVar;
            this.f19078b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f19077a.equals(((d) obj).f19077a);
            }
            return false;
        }

        public int hashCode() {
            return this.f19077a.hashCode();
        }
    }

    static final class e implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f19079a;

        e() {
            this(new ArrayList(2));
        }

        private static d e(a3.g gVar) {
            return new d(gVar, e3.e.a());
        }

        void b(a3.g gVar, Executor executor) {
            this.f19079a.add(new d(gVar, executor));
        }

        boolean c(a3.g gVar) {
            return this.f19079a.contains(e(gVar));
        }

        void clear() {
            this.f19079a.clear();
        }

        e d() {
            return new e(new ArrayList(this.f19079a));
        }

        void f(a3.g gVar) {
            this.f19079a.remove(e(gVar));
        }

        boolean isEmpty() {
            return this.f19079a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f19079a.iterator();
        }

        int size() {
            return this.f19079a.size();
        }

        e(List list) {
            this.f19079a = list;
        }
    }

    l(n2.a aVar, n2.a aVar2, n2.a aVar3, n2.a aVar4, m mVar, p.a aVar5, l0.d dVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, dVar, I);
    }

    private n2.a j() {
        return this.f19069w ? this.f19064r : this.f19070x ? this.f19065s : this.f19063h;
    }

    private boolean m() {
        return this.D || this.B || this.G;
    }

    private synchronized void q() {
        if (this.f19067u == null) {
            throw new IllegalArgumentException();
        }
        this.f19056a.clear();
        this.f19067u = null;
        this.E = null;
        this.f19072z = null;
        this.D = false;
        this.G = false;
        this.B = false;
        this.H = false;
        this.F.C(false);
        this.F = null;
        this.C = null;
        this.A = null;
        this.f19059d.a(this);
    }

    @Override // k2.h.b
    public void a(h hVar) {
        j().execute(hVar);
    }

    @Override // k2.h.b
    public void b(q qVar) {
        synchronized (this) {
            this.C = qVar;
        }
        n();
    }

    @Override // k2.h.b
    public void c(v vVar, i2.a aVar, boolean z10) {
        synchronized (this) {
            this.f19072z = vVar;
            this.A = aVar;
            this.H = z10;
        }
        o();
    }

    synchronized void d(a3.g gVar, Executor executor) {
        try {
            this.f19057b.c();
            this.f19056a.b(gVar, executor);
            if (this.B) {
                k(1);
                executor.execute(new b(gVar));
            } else if (this.D) {
                k(1);
                executor.execute(new a(gVar));
            } else {
                e3.k.b(!this.G, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void e(a3.g gVar) {
        try {
            gVar.b(this.C);
        } catch (Throwable th2) {
            throw new k2.b(th2);
        }
    }

    @Override // f3.a.f
    public f3.c f() {
        return this.f19057b;
    }

    void g(a3.g gVar) {
        try {
            gVar.c(this.E, this.A, this.H);
        } catch (Throwable th2) {
            throw new k2.b(th2);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.G = true;
        this.F.g();
        this.f19061f.c(this, this.f19067u);
    }

    void i() {
        p pVar;
        synchronized (this) {
            try {
                this.f19057b.c();
                e3.k.b(m(), "Not yet complete!");
                int iDecrementAndGet = this.f19066t.decrementAndGet();
                e3.k.b(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    pVar = this.E;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar != null) {
            pVar.g();
        }
    }

    synchronized void k(int i10) {
        p pVar;
        e3.k.b(m(), "Not yet complete!");
        if (this.f19066t.getAndAdd(i10) == 0 && (pVar = this.E) != null) {
            pVar.b();
        }
    }

    synchronized l l(i2.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19067u = fVar;
        this.f19068v = z10;
        this.f19069w = z11;
        this.f19070x = z12;
        this.f19071y = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f19057b.c();
                if (this.G) {
                    q();
                    return;
                }
                if (this.f19056a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.D) {
                    throw new IllegalStateException("Already failed once");
                }
                this.D = true;
                i2.f fVar = this.f19067u;
                e<d> eVarD = this.f19056a.d();
                k(eVarD.size() + 1);
                this.f19061f.b(this, fVar, null);
                for (d dVar : eVarD) {
                    dVar.f19078b.execute(new a(dVar.f19077a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f19057b.c();
                if (this.G) {
                    this.f19072z.c();
                    q();
                    return;
                }
                if (this.f19056a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.B) {
                    throw new IllegalStateException("Already have resource");
                }
                this.E = this.f19060e.a(this.f19072z, this.f19068v, this.f19067u, this.f19058c);
                this.B = true;
                e<d> eVarD = this.f19056a.d();
                k(eVarD.size() + 1);
                this.f19061f.b(this, this.f19067u, this.E);
                for (d dVar : eVarD) {
                    dVar.f19078b.execute(new b(dVar.f19077a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean p() {
        return this.f19071y;
    }

    synchronized void r(a3.g gVar) {
        try {
            this.f19057b.c();
            this.f19056a.f(gVar);
            if (this.f19056a.isEmpty()) {
                h();
                if (this.B || this.D) {
                    if (this.f19066t.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.F = hVar;
            (hVar.K() ? this.f19062g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    l(n2.a aVar, n2.a aVar2, n2.a aVar3, n2.a aVar4, m mVar, p.a aVar5, l0.d dVar, c cVar) {
        this.f19056a = new e();
        this.f19057b = f3.c.a();
        this.f19066t = new AtomicInteger();
        this.f19062g = aVar;
        this.f19063h = aVar2;
        this.f19064r = aVar3;
        this.f19065s = aVar4;
        this.f19061f = mVar;
        this.f19058c = aVar5;
        this.f19059d = dVar;
        this.f19060e = cVar;
    }
}
