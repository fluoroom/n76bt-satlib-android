package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class v5 extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f18218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f18219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f18220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f18221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f18223o;

    @Override // j$.util.stream.b
    public final void f() {
        this.f17921i = true;
        if (this.f18223o) {
            d(v3.i0(this.f18218j.M0()));
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        v5 v5Var;
        g2 g2VarI0;
        d dVar = this.f17948d;
        if (dVar != null) {
            this.f18222n = ((v5) dVar).f18222n + ((v5) this.f17949e).f18222n;
            if (this.f17921i) {
                this.f18222n = 0L;
                g2VarI0 = v3.i0(this.f18218j.M0());
            } else {
                g2VarI0 = this.f18222n == 0 ? v3.i0(this.f18218j.M0()) : ((v5) this.f17948d).f18222n == 0 ? (g2) ((v5) this.f17949e).i() : v3.e0(this.f18218j.M0(), (g2) ((v5) this.f17948d).i(), (g2) ((v5) this.f17949e).i());
            }
            g2 g2VarI = g2VarI0;
            if (b()) {
                g2VarI = g2VarI.i(this.f18220l, this.f18221m >= 0 ? Math.min(g2VarI.count(), this.f18220l + this.f18221m) : this.f18222n, this.f18219k);
            }
            d(g2VarI);
            this.f18223o = true;
        }
        if (this.f18221m >= 0 && !b()) {
            long j10 = this.f18220l + this.f18221m;
            long j11 = this.f18223o ? this.f18222n : j(j10);
            if (j11 >= j10) {
                g();
            } else {
                v5 v5Var2 = (v5) ((d) getCompleter());
                Object obj = this;
                while (true) {
                    if (v5Var2 == null) {
                        if (j11 >= j10) {
                            break;
                        }
                    } else {
                        if (obj == v5Var2.f17949e && (v5Var = (v5) v5Var2.f17948d) != null) {
                            long j12 = v5Var.j(j10) + j11;
                            if (j12 >= j10) {
                                break;
                            } else {
                                j11 = j12;
                            }
                        }
                        obj = v5Var2;
                        v5Var2 = (v5) ((d) v5Var2.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public v5(a aVar, v3 v3Var, Spliterator spliterator, IntFunction intFunction, long j10, long j11) {
        super(v3Var, spliterator);
        this.f18218j = aVar;
        this.f18219k = intFunction;
        this.f18220l = j10;
        this.f18221m = j11;
    }

    public v5(v5 v5Var, Spliterator spliterator) {
        super(v5Var, spliterator);
        this.f18218j = v5Var.f18218j;
        this.f18219k = v5Var.f18219k;
        this.f18220l = v5Var.f18220l;
        this.f18221m = v5Var.f18221m;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new v5(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return v3.i0(this.f18218j.M0());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            y6 y6Var = y6.SIZED;
            a aVar = this.f18218j;
            int i10 = aVar.f17890j;
            int i11 = y6Var.f18278e;
            y1 y1VarA0 = this.f18218j.A0((i10 & i11) == i11 ? aVar.k0(this.f17946b) : -1L, this.f18219k);
            l5 l5VarQ0 = this.f18218j.Q0(((a) this.f17945a).f17893m, y1VarA0);
            v3 v3Var = this.f17945a;
            v3Var.g0(this.f17946b, v3Var.G0(l5VarQ0));
            return y1VarA0.build();
        }
        y1 y1VarA02 = this.f18218j.A0(-1L, this.f18219k);
        if (this.f18220l == 0) {
            l5 l5VarQ02 = this.f18218j.Q0(((a) this.f17945a).f17893m, y1VarA02);
            v3 v3Var2 = this.f17945a;
            v3Var2.g0(this.f17946b, v3Var2.G0(l5VarQ02));
        } else {
            this.f17945a.F0(this.f17946b, y1VarA02);
        }
        g2 g2VarBuild = y1VarA02.build();
        this.f18222n = g2VarBuild.count();
        this.f18223o = true;
        this.f17946b = null;
        return g2VarBuild;
    }

    public final long j(long j10) {
        if (this.f18223o) {
            return this.f18222n;
        }
        v5 v5Var = (v5) this.f17948d;
        v5 v5Var2 = (v5) this.f17949e;
        if (v5Var == null || v5Var2 == null) {
            return this.f18222n;
        }
        long j11 = v5Var.j(j10);
        return j11 >= j10 ? j11 : v5Var2.j(j10) + j11;
    }
}
