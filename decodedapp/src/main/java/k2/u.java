package k2;

import f3.a;

/* JADX INFO: loaded from: classes.dex */
final class u implements v, a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l0.d f19111e = f3.a.d(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f3.c f19112a = f3.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f19113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19115d;

    class a implements a.d {
        a() {
        }

        @Override // f3.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u create() {
            return new u();
        }
    }

    u() {
    }

    private void b(v vVar) {
        this.f19115d = false;
        this.f19114c = true;
        this.f19113b = vVar;
    }

    static u e(v vVar) {
        u uVar = (u) e3.k.e((u) f19111e.b());
        uVar.b(vVar);
        return uVar;
    }

    private void g() {
        this.f19113b = null;
        f19111e.a(this);
    }

    @Override // k2.v
    public int a() {
        return this.f19113b.a();
    }

    @Override // k2.v
    public synchronized void c() {
        this.f19112a.c();
        this.f19115d = true;
        if (!this.f19114c) {
            this.f19113b.c();
            g();
        }
    }

    @Override // k2.v
    public Class d() {
        return this.f19113b.d();
    }

    @Override // f3.a.f
    public f3.c f() {
        return this.f19112a;
    }

    @Override // k2.v
    public Object get() {
        return this.f19113b.get();
    }

    synchronized void h() {
        this.f19112a.c();
        if (!this.f19114c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f19114c = false;
        if (this.f19115d) {
            c();
        }
    }
}
