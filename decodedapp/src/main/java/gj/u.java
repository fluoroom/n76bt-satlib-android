package gj;

/* JADX INFO: loaded from: classes3.dex */
class u extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14697g;

    u(int i10, int i11, int i12, int i13, int i14) {
        this.f14693c = i10;
        this.f14694d = i11;
        this.f14695e = i12;
        this.f14696f = i13;
        this.f14697g = i14;
    }

    @Override // gj.c0
    protected double b(b bVar) {
        return (((double) this.f14693c) * bVar.k()) + (((double) this.f14694d) * bVar.m()) + (((double) this.f14695e) * bVar.c()) + (((double) this.f14696f) * bVar.a()) + (((double) this.f14697g) * bVar.p());
    }

    @Override // gj.c0
    protected double c(b bVar) {
        return (((double) this.f14693c) * bVar.l()) + (((double) this.f14694d) * bVar.o()) + (((double) this.f14695e) * bVar.h()) + (((double) this.f14696f) * bVar.b()) + (((double) this.f14697g) * bVar.t());
    }
}
