package a3;

import a3.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a f227f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f226e = aVar;
        this.f227f = aVar;
        this.f222a = obj;
        this.f223b = dVar;
    }

    private boolean l(c cVar) {
        d.a aVar = this.f226e;
        d.a aVar2 = d.a.FAILED;
        if (aVar != aVar2) {
            return cVar.equals(this.f224c);
        }
        if (!cVar.equals(this.f225d)) {
            return false;
        }
        d.a aVar3 = this.f227f;
        return aVar3 == d.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean m() {
        d dVar = this.f223b;
        return dVar == null || dVar.j(this);
    }

    private boolean n() {
        d dVar = this.f223b;
        return dVar == null || dVar.f(this);
    }

    private boolean o() {
        d dVar = this.f223b;
        return dVar == null || dVar.h(this);
    }

    @Override // a3.d, a3.c
    public boolean a() {
        boolean z10;
        synchronized (this.f222a) {
            try {
                z10 = this.f224c.a() || this.f225d.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.d
    public void b(c cVar) {
        synchronized (this.f222a) {
            try {
                if (cVar.equals(this.f224c)) {
                    this.f226e = d.a.SUCCESS;
                } else if (cVar.equals(this.f225d)) {
                    this.f227f = d.a.SUCCESS;
                }
                d dVar = this.f223b;
                if (dVar != null) {
                    dVar.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.d
    public void c(c cVar) {
        synchronized (this.f222a) {
            try {
                if (cVar.equals(this.f225d)) {
                    this.f227f = d.a.FAILED;
                    d dVar = this.f223b;
                    if (dVar != null) {
                        dVar.c(this);
                    }
                    return;
                }
                this.f226e = d.a.FAILED;
                d.a aVar = this.f227f;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f227f = aVar2;
                    this.f225d.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public void clear() {
        synchronized (this.f222a) {
            try {
                d.a aVar = d.a.CLEARED;
                this.f226e = aVar;
                this.f224c.clear();
                if (this.f227f != aVar) {
                    this.f227f = aVar;
                    this.f225d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public void d() {
        synchronized (this.f222a) {
            try {
                d.a aVar = this.f226e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar == aVar2) {
                    this.f226e = d.a.PAUSED;
                    this.f224c.d();
                }
                if (this.f227f == aVar2) {
                    this.f227f = d.a.PAUSED;
                    this.f225d.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public boolean e(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f224c.e(bVar.f224c) && this.f225d.e(bVar.f225d)) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.d
    public boolean f(c cVar) {
        boolean z10;
        synchronized (this.f222a) {
            try {
                z10 = n() && l(cVar);
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.c
    public boolean g() {
        boolean z10;
        synchronized (this.f222a) {
            try {
                d.a aVar = this.f226e;
                d.a aVar2 = d.a.CLEARED;
                z10 = aVar == aVar2 && this.f227f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.d
    public d getRoot() {
        d root;
        synchronized (this.f222a) {
            try {
                d dVar = this.f223b;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // a3.d
    public boolean h(c cVar) {
        boolean zO;
        synchronized (this.f222a) {
            zO = o();
        }
        return zO;
    }

    @Override // a3.c
    public void i() {
        synchronized (this.f222a) {
            try {
                d.a aVar = this.f226e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f226e = aVar2;
                    this.f224c.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f222a) {
            try {
                d.a aVar = this.f226e;
                d.a aVar2 = d.a.RUNNING;
                z10 = aVar == aVar2 || this.f227f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.d
    public boolean j(c cVar) {
        boolean z10;
        synchronized (this.f222a) {
            try {
                z10 = m() && cVar.equals(this.f224c);
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.c
    public boolean k() {
        boolean z10;
        synchronized (this.f222a) {
            try {
                d.a aVar = this.f226e;
                d.a aVar2 = d.a.SUCCESS;
                z10 = aVar == aVar2 || this.f227f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    public void p(c cVar, c cVar2) {
        this.f224c = cVar;
        this.f225d = cVar2;
    }
}
