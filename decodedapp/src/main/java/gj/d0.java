package gj;

/* JADX INFO: loaded from: classes3.dex */
class d0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f14560h;

    d0(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f14555c = i10;
        this.f14556d = i11;
        this.f14557e = i12;
        this.f14558f = i13;
        this.f14559g = i14;
        this.f14560h = i15;
    }

    @Override // gj.c0
    protected double b(b bVar) {
        return (((double) this.f14555c) * bVar.i()) + (((double) this.f14556d) * bVar.k()) + (((double) this.f14557e) * bVar.m()) + (((double) this.f14558f) * bVar.c()) + (((double) this.f14559g) * bVar.a()) + (((double) this.f14560h) * bVar.p());
    }

    @Override // gj.c0
    protected double c(b bVar) {
        return (((double) this.f14555c) * bVar.j()) + (((double) this.f14556d) * bVar.l()) + (((double) this.f14557e) * bVar.o()) + (((double) this.f14558f) * bVar.h()) + (((double) this.f14559g) * bVar.b()) + (((double) this.f14560h) * bVar.t());
    }
}
