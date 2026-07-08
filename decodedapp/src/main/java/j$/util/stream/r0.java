package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3 f18135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spliterator f18136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f18138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f18139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f18140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g2 f18141g;

    public r0(v3 v3Var, Spliterator spliterator, q0 q0Var) {
        super(null);
        this.f18135a = v3Var;
        this.f18136b = spliterator;
        this.f18137c = d.e(spliterator.estimateSize());
        this.f18138d = new ConcurrentHashMap(Math.max(16, d.f17944g << 1));
        this.f18139e = q0Var;
        this.f18140f = null;
    }

    public r0(r0 r0Var, Spliterator spliterator, r0 r0Var2) {
        super(r0Var);
        this.f18135a = r0Var.f18135a;
        this.f18136b = spliterator;
        this.f18137c = r0Var.f18137c;
        this.f18138d = r0Var.f18138d;
        this.f18139e = r0Var.f18139e;
        this.f18140f = r0Var2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f18136b;
        long j10 = this.f18137c;
        boolean z10 = false;
        r0 r0Var = this;
        while (spliterator.estimateSize() > j10 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            r0 r0Var2 = new r0(r0Var, spliteratorTrySplit, r0Var.f18140f);
            r0 r0Var3 = new r0(r0Var, spliterator, r0Var2);
            r0Var.addToPendingCount(1);
            r0Var3.addToPendingCount(1);
            r0Var.f18138d.put(r0Var2, r0Var3);
            if (r0Var.f18140f != null) {
                r0Var2.addToPendingCount(1);
                if (r0Var.f18138d.replace(r0Var.f18140f, r0Var, r0Var2)) {
                    r0Var.addToPendingCount(-1);
                } else {
                    r0Var2.addToPendingCount(-1);
                }
            }
            if (z10) {
                spliterator = spliteratorTrySplit;
                r0Var = r0Var2;
                r0Var2 = r0Var3;
            } else {
                r0Var = r0Var3;
            }
            z10 = !z10;
            r0Var2.fork();
        }
        if (r0Var.getPendingCount() > 0) {
            o oVar = new o(13);
            v3 v3Var = r0Var.f18135a;
            y1 y1VarA0 = v3Var.A0(v3Var.k0(spliterator), oVar);
            r0Var.f18135a.F0(spliterator, y1VarA0);
            r0Var.f18141g = y1VarA0.build();
            r0Var.f18136b = null;
        }
        r0Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        g2 g2Var = this.f18141g;
        if (g2Var != null) {
            g2Var.forEach(this.f18139e);
            this.f18141g = null;
        } else {
            Spliterator spliterator = this.f18136b;
            if (spliterator != null) {
                this.f18135a.F0(spliterator, this.f18139e);
                this.f18136b = null;
            }
        }
        r0 r0Var = (r0) this.f18138d.remove(this);
        if (r0Var != null) {
            r0Var.tryComplete();
        }
    }
}
