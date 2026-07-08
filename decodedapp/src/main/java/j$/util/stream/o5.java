package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class o5 extends f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5 f18114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p5 p5Var, l5 l5Var) {
        super(l5Var);
        this.f18114d = p5Var;
        this.f18112b = p5Var.f18122s;
        long j10 = p5Var.f18123t;
        this.f18113c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void c(long j10) {
        this.f17981a.c(v3.W(j10, this.f18114d.f18122s, this.f18113c));
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i10) {
        long j10 = this.f18112b;
        if (j10 == 0) {
            long j11 = this.f18113c;
            if (j11 > 0) {
                this.f18113c = j11 - 1;
                this.f17981a.accept(i10);
                return;
            }
            return;
        }
        this.f18112b = j10 - 1;
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final boolean e() {
        return this.f18113c == 0 || this.f17981a.e();
    }
}
