package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class q5 extends g5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5 f18132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, l5 l5Var) {
        super(l5Var);
        this.f18132d = r5Var;
        this.f18130b = r5Var.f18150s;
        long j10 = r5Var.f18151t;
        this.f18131c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void c(long j10) {
        this.f17991a.c(v3.W(j10, this.f18132d.f18150s, this.f18131c));
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j10) {
        long j11 = this.f18130b;
        if (j11 == 0) {
            long j12 = this.f18131c;
            if (j12 > 0) {
                this.f18131c = j12 - 1;
                this.f17991a.accept(j10);
                return;
            }
            return;
        }
        this.f18130b = j11 - 1;
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final boolean e() {
        return this.f18131c == 0 || this.f17991a.e();
    }
}
