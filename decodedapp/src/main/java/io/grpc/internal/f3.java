package io.grpc.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class f3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f16582l = new b(b3.f16355a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b3 f16583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f16587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f16588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f16589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f16590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f16591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k1 f16592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f16593k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b3 f16594a;

        public b(b3 b3Var) {
            this.f16594a = b3Var;
        }

        public f3 a() {
            return new f3(this.f16594a);
        }
    }

    public interface c {
    }

    public static b a() {
        return f16582l;
    }

    public void b() {
        this.f16588f++;
    }

    public void c() {
        this.f16584b++;
        this.f16585c = this.f16583a.a();
    }

    public void d() {
        this.f16592j.add(1L);
        this.f16593k = this.f16583a.a();
    }

    public void e(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f16590h += (long) i10;
        this.f16591i = this.f16583a.a();
    }

    public void f(boolean z10) {
        if (z10) {
            this.f16586d++;
        } else {
            this.f16587e++;
        }
    }

    public void g(c cVar) {
        this.f16589g = (c) r9.l.n(cVar);
    }

    private f3(b3 b3Var) {
        this.f16592j = l1.a();
        this.f16583a = b3Var;
    }
}
