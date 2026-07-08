package k2;

/* JADX INFO: loaded from: classes.dex */
class p implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f19091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f19092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i2.f f19093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19095g;

    interface a {
        void a(i2.f fVar, p pVar);
    }

    p(v vVar, boolean z10, boolean z11, i2.f fVar, a aVar) {
        this.f19091c = (v) e3.k.e(vVar);
        this.f19089a = z10;
        this.f19090b = z11;
        this.f19093e = fVar;
        this.f19092d = (a) e3.k.e(aVar);
    }

    @Override // k2.v
    public int a() {
        return this.f19091c.a();
    }

    synchronized void b() {
        if (this.f19095g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f19094f++;
    }

    @Override // k2.v
    public synchronized void c() {
        if (this.f19094f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f19095g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f19095g = true;
        if (this.f19090b) {
            this.f19091c.c();
        }
    }

    @Override // k2.v
    public Class d() {
        return this.f19091c.d();
    }

    v e() {
        return this.f19091c;
    }

    boolean f() {
        return this.f19089a;
    }

    void g() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f19094f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f19094f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f19092d.a(this.f19093e, this);
        }
    }

    @Override // k2.v
    public Object get() {
        return this.f19091c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f19089a + ", listener=" + this.f19092d + ", key=" + this.f19093e + ", acquired=" + this.f19094f + ", isRecycled=" + this.f19095g + ", resource=" + this.f19091c + '}';
    }
}
