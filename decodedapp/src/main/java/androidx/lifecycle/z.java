package androidx.lifecycle;

import androidx.lifecycle.m;
import java.util.Map;
import m.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f2711k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f2712a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m.b f2713b = new m.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2714c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f2716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f2717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f2721j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (z.this.f2712a) {
                obj = z.this.f2717f;
                z.this.f2717f = z.f2711k;
            }
            z.this.n(obj);
        }
    }

    private class b extends d {
        b(c0 c0Var) {
            super(c0Var);
        }

        @Override // androidx.lifecycle.z.d
        boolean f() {
            return true;
        }
    }

    class c extends d implements q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final t f2724e;

        c(t tVar, c0 c0Var) {
            super(c0Var);
            this.f2724e = tVar;
        }

        @Override // androidx.lifecycle.z.d
        void b() {
            this.f2724e.S0().d(this);
        }

        @Override // androidx.lifecycle.z.d
        boolean d(t tVar) {
            return this.f2724e == tVar;
        }

        @Override // androidx.lifecycle.z.d
        boolean f() {
            return this.f2724e.S0().b().d(m.b.f2654d);
        }

        @Override // androidx.lifecycle.q
        public void k(t tVar, m.a aVar) {
            m.b bVarB = this.f2724e.S0().b();
            if (bVarB == m.b.f2651a) {
                z.this.m(this.f2726a);
                return;
            }
            m.b bVar = null;
            while (bVar != bVarB) {
                a(f());
                bVar = bVarB;
                bVarB = this.f2724e.S0().b();
            }
        }
    }

    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c0 f2726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2728c = -1;

        d(c0 c0Var) {
            this.f2726a = c0Var;
        }

        void a(boolean z10) {
            if (z10 == this.f2727b) {
                return;
            }
            this.f2727b = z10;
            z.this.c(z10 ? 1 : -1);
            if (this.f2727b) {
                z.this.e(this);
            }
        }

        void b() {
        }

        boolean d(t tVar) {
            return false;
        }

        abstract boolean f();
    }

    public z() {
        Object obj = f2711k;
        this.f2717f = obj;
        this.f2721j = new a();
        this.f2716e = obj;
        this.f2718g = -1;
    }

    static void b(String str) {
        if (l.c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(d dVar) {
        if (dVar.f2727b) {
            if (!dVar.f()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f2728c;
            int i11 = this.f2718g;
            if (i10 >= i11) {
                return;
            }
            dVar.f2728c = i11;
            dVar.f2726a.b(this.f2716e);
        }
    }

    void c(int i10) {
        int i11 = this.f2714c;
        this.f2714c = i10 + i11;
        if (this.f2715d) {
            return;
        }
        this.f2715d = true;
        while (true) {
            try {
                int i12 = this.f2714c;
                if (i11 == i12) {
                    this.f2715d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f2715d = false;
                throw th2;
            }
        }
    }

    void e(d dVar) {
        if (this.f2719h) {
            this.f2720i = true;
            return;
        }
        this.f2719h = true;
        do {
            this.f2720i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                b.d dVarD = this.f2713b.d();
                while (dVarD.hasNext()) {
                    d((d) ((Map.Entry) dVarD.next()).getValue());
                    if (this.f2720i) {
                        break;
                    }
                }
            }
        } while (this.f2720i);
        this.f2719h = false;
    }

    public Object f() {
        Object obj = this.f2716e;
        if (obj != f2711k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f2714c > 0;
    }

    public void h(t tVar, c0 c0Var) {
        b("observe");
        if (tVar.S0().b() == m.b.f2651a) {
            return;
        }
        c cVar = new c(tVar, c0Var);
        d dVar = (d) this.f2713b.g(c0Var, cVar);
        if (dVar != null && !dVar.d(tVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        tVar.S0().a(cVar);
    }

    public void i(c0 c0Var) {
        b("observeForever");
        b bVar = new b(c0Var);
        d dVar = (d) this.f2713b.g(c0Var, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(Object obj) {
        boolean z10;
        synchronized (this.f2712a) {
            z10 = this.f2717f == f2711k;
            this.f2717f = obj;
        }
        if (z10) {
            l.c.f().c(this.f2721j);
        }
    }

    public void m(c0 c0Var) {
        b("removeObserver");
        d dVar = (d) this.f2713b.h(c0Var);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void n(Object obj) {
        b("setValue");
        this.f2718g++;
        this.f2716e = obj;
        e(null);
    }
}
