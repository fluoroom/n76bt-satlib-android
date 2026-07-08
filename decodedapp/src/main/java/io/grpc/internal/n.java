package io.grpc.internal;

/* JADX INFO: loaded from: classes3.dex */
final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f16941f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b3 f16942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f16943b = l1.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k1 f16944c = l1.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k1 f16945d = l1.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f16946e;

    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.n.b
        public n create() {
            return new n(b3.f16355a);
        }
    }

    public interface b {
        n create();
    }

    n(b3 b3Var) {
        this.f16942a = b3Var;
    }

    public void a(boolean z10) {
        if (z10) {
            this.f16944c.add(1L);
        } else {
            this.f16945d.add(1L);
        }
    }

    public void b() {
        this.f16943b.add(1L);
        this.f16946e = this.f16942a.a();
    }
}
