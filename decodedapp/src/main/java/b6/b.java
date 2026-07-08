package b6;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3686a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3687b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f3688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f3690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f3691f;

    protected b(int i10) {
        this.f3688c = i10;
    }

    public synchronized void a(int i10) {
        try {
            if (i10 >= c()) {
                e();
            } else {
                int i11 = this.f3691f + i10;
                this.f3691f = i11;
                this.f3691f = i11 % this.f3688c;
                g(this.f3689d - i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int b() {
        return this.f3688c - this.f3689d;
    }

    public final int c() {
        return this.f3689d;
    }

    public final int d() {
        return this.f3688c;
    }

    public synchronized void e() {
        this.f3691f = 0;
        this.f3690e = 0;
        g(0);
    }

    public synchronized void f(int i10) {
        int i11 = this.f3691f;
        int i12 = this.f3688c;
        int i13 = (i11 + i12) - i10;
        this.f3691f = i13;
        this.f3691f = i13 % i12;
        g(this.f3689d + i10);
    }

    protected final synchronized void g(int i10) {
        try {
            int i11 = this.f3689d;
            if (i11 == i10) {
                return;
            }
            this.f3689d = i10;
            if (i10 < i11) {
                synchronized (this.f3686a) {
                    this.f3686a.notifyAll();
                }
            } else {
                synchronized (this.f3687b) {
                    this.f3687b.notifyAll();
                }
            }
        } finally {
        }
    }

    public boolean h(int i10, long j10) {
        if (b() >= i10) {
            return true;
        }
        if (this.f3688c < i10) {
            return false;
        }
        synchronized (this.f3686a) {
            try {
                if (b() >= i10) {
                    return true;
                }
                this.f3686a.wait(j10);
                return b() >= i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean i(int i10, long j10) {
        if (this.f3689d >= i10) {
            return true;
        }
        if (this.f3688c < i10) {
            return false;
        }
        synchronized (this.f3687b) {
            try {
                if (this.f3689d >= i10) {
                    return true;
                }
                this.f3687b.wait(j10);
                return this.f3689d >= i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f3686a) {
            this.f3686a.notifyAll();
        }
        synchronized (this.f3687b) {
            this.f3687b.notifyAll();
        }
    }
}
