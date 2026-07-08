package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class m5 extends h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n5 f18084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(n5 n5Var, l5 l5Var) {
        super(l5Var);
        this.f18084d = n5Var;
        this.f18082b = n5Var.f18100s;
        long j10 = n5Var.f18101t;
        this.f18083c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j10) {
        this.f18003a.c(v3.W(j10, this.f18084d.f18100s, this.f18083c));
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        long j10 = this.f18082b;
        if (j10 == 0) {
            long j11 = this.f18083c;
            if (j11 > 0) {
                this.f18083c = j11 - 1;
                this.f18003a.n(obj);
                return;
            }
            return;
        }
        this.f18082b = j10 - 1;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final boolean e() {
        return this.f18083c == 0 || this.f18003a.e();
    }
}
