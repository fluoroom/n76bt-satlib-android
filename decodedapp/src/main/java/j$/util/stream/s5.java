package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class s5 extends e5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t5 f18164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(t5 t5Var, l5 l5Var) {
        super(l5Var);
        this.f18164d = t5Var;
        this.f18162b = t5Var.f18171s;
        long j10 = t5Var.f18172t;
        this.f18163c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void c(long j10) {
        this.f17969a.c(v3.W(j10, this.f18164d.f18171s, this.f18163c));
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d10) {
        long j10 = this.f18162b;
        if (j10 == 0) {
            long j11 = this.f18163c;
            if (j11 > 0) {
                this.f18163c = j11 - 1;
                this.f17969a.accept(d10);
                return;
            }
            return;
        }
        this.f18162b = j10 - 1;
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final boolean e() {
        return this.f18163c == 0 || this.f17969a.e();
    }
}
