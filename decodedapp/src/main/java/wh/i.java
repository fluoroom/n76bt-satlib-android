package wh;

import java.io.EOFException;
import java.io.IOException;
import vh.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends vh.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f31459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n0 n0Var, long j10, boolean z10) {
        super(n0Var);
        rd.m.e(n0Var, "delegate");
        this.f31457b = j10;
        this.f31458c = z10;
    }

    private final void c(vh.e eVar, long j10) throws EOFException {
        vh.e eVar2 = new vh.e();
        eVar2.F0(eVar);
        eVar.C(eVar2, j10);
        eVar2.k();
    }

    @Override // vh.n, vh.n0
    public long N(vh.e eVar, long j10) throws IOException {
        rd.m.e(eVar, "sink");
        long j11 = this.f31459d;
        long j12 = this.f31457b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f31458c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jN = super.N(eVar, j10);
        if (jN != -1) {
            this.f31459d += jN;
        }
        long j14 = this.f31459d;
        long j15 = this.f31457b;
        if ((j14 >= j15 || jN != -1) && j14 <= j15) {
            return jN;
        }
        if (jN > 0 && j14 > j15) {
            c(eVar, eVar.size() - (this.f31459d - this.f31457b));
        }
        throw new IOException("expected " + this.f31457b + " bytes but got " + this.f31459d);
    }
}
