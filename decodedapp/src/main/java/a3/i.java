package a3;

import a3.d;

/* JADX INFO: loaded from: classes.dex */
public class i implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a f273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f274g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f272e = aVar;
        this.f273f = aVar;
        this.f269b = obj;
        this.f268a = dVar;
    }

    private boolean l() {
        d dVar = this.f268a;
        return dVar == null || dVar.j(this);
    }

    private boolean m() {
        d dVar = this.f268a;
        return dVar == null || dVar.f(this);
    }

    private boolean n() {
        d dVar = this.f268a;
        return dVar == null || dVar.h(this);
    }

    @Override // a3.d, a3.c
    public boolean a() {
        boolean z10;
        synchronized (this.f269b) {
            try {
                z10 = this.f271d.a() || this.f270c.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.d
    public void b(c cVar) {
        synchronized (this.f269b) {
            try {
                if (cVar.equals(this.f271d)) {
                    this.f273f = d.a.SUCCESS;
                    return;
                }
                this.f272e = d.a.SUCCESS;
                d dVar = this.f268a;
                if (dVar != null) {
                    dVar.b(this);
                }
                if (!this.f273f.d()) {
                    this.f271d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.d
    public void c(c cVar) {
        synchronized (this.f269b) {
            try {
                if (!cVar.equals(this.f270c)) {
                    this.f273f = d.a.FAILED;
                    return;
                }
                this.f272e = d.a.FAILED;
                d dVar = this.f268a;
                if (dVar != null) {
                    dVar.c(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public void clear() {
        synchronized (this.f269b) {
            this.f274g = false;
            d.a aVar = d.a.CLEARED;
            this.f272e = aVar;
            this.f273f = aVar;
            this.f271d.clear();
            this.f270c.clear();
        }
    }

    @Override // a3.c
    public void d() {
        synchronized (this.f269b) {
            try {
                if (!this.f273f.d()) {
                    this.f273f = d.a.PAUSED;
                    this.f271d.d();
                }
                if (!this.f272e.d()) {
                    this.f272e = d.a.PAUSED;
                    this.f270c.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public boolean e(c cVar) {
        if (cVar instanceof i) {
            i iVar = (i) cVar;
            if (this.f270c != null ? this.f270c.e(iVar.f270c) : iVar.f270c == null) {
                if (this.f271d == null) {
                    if (iVar.f271d == null) {
                        return true;
                    }
                } else if (this.f271d.e(iVar.f271d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a3.d
    public boolean f(c cVar) {
        boolean z10;
        synchronized (this.f269b) {
            try {
                z10 = m() && cVar.equals(this.f270c) && !a();
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.c
    public boolean g() {
        boolean z10;
        synchronized (this.f269b) {
            z10 = this.f272e == d.a.CLEARED;
        }
        return z10;
    }

    @Override // a3.d
    public d getRoot() {
        d root;
        synchronized (this.f269b) {
            try {
                d dVar = this.f268a;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // a3.d
    public boolean h(c cVar) {
        boolean z10;
        synchronized (this.f269b) {
            try {
                z10 = n() && (cVar.equals(this.f270c) || this.f272e != d.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.c
    public void i() {
        synchronized (this.f269b) {
            try {
                this.f274g = true;
                try {
                    if (this.f272e != d.a.SUCCESS) {
                        d.a aVar = this.f273f;
                        d.a aVar2 = d.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f273f = aVar2;
                            this.f271d.i();
                        }
                    }
                    if (this.f274g) {
                        d.a aVar3 = this.f272e;
                        d.a aVar4 = d.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f272e = aVar4;
                            this.f270c.i();
                        }
                    }
                    this.f274g = false;
                } catch (Throwable th2) {
                    this.f274g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // a3.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f269b) {
            z10 = this.f272e == d.a.RUNNING;
        }
        return z10;
    }

    @Override // a3.d
    public boolean j(c cVar) {
        boolean z10;
        synchronized (this.f269b) {
            try {
                z10 = l() && cVar.equals(this.f270c) && this.f272e != d.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.c
    public boolean k() {
        boolean z10;
        synchronized (this.f269b) {
            z10 = this.f272e == d.a.SUCCESS;
        }
        return z10;
    }

    public void o(c cVar, c cVar2) {
        this.f270c = cVar;
        this.f271d = cVar2;
    }
}
