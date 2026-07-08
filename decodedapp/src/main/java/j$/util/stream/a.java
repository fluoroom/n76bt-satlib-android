package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends v3 implements g {

    /* JADX INFO: renamed from: h */
    public final a f17888h;

    /* JADX INFO: renamed from: i */
    public final a f17889i;

    /* JADX INFO: renamed from: j */
    public final int f17890j;

    /* JADX INFO: renamed from: k */
    public final a f17891k;

    /* JADX INFO: renamed from: l */
    public int f17892l;

    /* JADX INFO: renamed from: m */
    public int f17893m;

    /* JADX INFO: renamed from: n */
    public Spliterator f17894n;

    /* JADX INFO: renamed from: o */
    public boolean f17895o;

    /* JADX INFO: renamed from: p */
    public final boolean f17896p;

    /* JADX INFO: renamed from: q */
    public Runnable f17897q;

    /* JADX INFO: renamed from: r */
    public boolean f17898r;

    public abstract g2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction);

    public abstract boolean L0(Spliterator spliterator, l5 l5Var);

    public abstract z6 M0();

    public abstract boolean P0();

    public abstract l5 Q0(int i10, l5 l5Var);

    public abstract Spliterator T0(a aVar, Supplier supplier, boolean z10);

    public a(Spliterator spliterator, int i10, boolean z10) {
        this.f17889i = null;
        this.f17894n = spliterator;
        this.f17888h = this;
        int i11 = y6.f18258g & i10;
        this.f17890j = i11;
        this.f17893m = (~(i11 << 1)) & y6.f18263l;
        this.f17892l = 0;
        this.f17898r = z10;
    }

    public a(a aVar, int i10) {
        if (aVar.f17895o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.f17895o = true;
        aVar.f17891k = this;
        this.f17889i = aVar;
        this.f17890j = y6.f18259h & i10;
        this.f17893m = y6.i(i10, aVar.f17893m);
        a aVar2 = aVar.f17888h;
        this.f17888h = aVar2;
        if (P0()) {
            aVar2.f17896p = true;
        }
        this.f17892l = aVar.f17892l + 1;
    }

    public final Object I0(g8 g8Var) {
        if (this.f17895o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f17895o = true;
        if (this.f17888h.f17898r) {
            return g8Var.i(this, R0(g8Var.v()));
        }
        return g8Var.f(this, R0(g8Var.v()));
    }

    public final g2 J0(IntFunction intFunction) {
        if (this.f17895o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f17895o = true;
        if (this.f17888h.f17898r && this.f17889i != null && P0()) {
            this.f17892l = 0;
            a aVar = this.f17889i;
            return N0(aVar, aVar.R0(0), intFunction);
        }
        return j0(R0(0), true, intFunction);
    }

    public final Spliterator S0() {
        a aVar = this.f17888h;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.f17895o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f17895o = true;
        Spliterator spliterator = aVar.f17894n;
        if (spliterator != null) {
            aVar.f17894n = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.g
    public final g sequential() {
        this.f17888h.f17898r = false;
        return this;
    }

    @Override // j$.util.stream.g
    public final g parallel() {
        this.f17888h.f17898r = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f17895o = true;
        this.f17894n = null;
        a aVar = this.f17888h;
        Runnable runnable = aVar.f17897q;
        if (runnable != null) {
            aVar.f17897q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.g
    public final g onClose(Runnable runnable) {
        if (this.f17895o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        a aVar = this.f17888h;
        Runnable runnable2 = aVar.f17897q;
        if (runnable2 != null) {
            runnable = new d8(runnable2, runnable);
        }
        aVar.f17897q = runnable;
        return this;
    }

    @Override // j$.util.stream.g
    public Spliterator spliterator() {
        if (this.f17895o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f17895o = true;
        a aVar = this.f17888h;
        if (this == aVar) {
            Spliterator spliterator = aVar.f17894n;
            if (spliterator != null) {
                aVar.f17894n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return T0(this, new j$.util.q(2, this), aVar.f17898r);
    }

    @Override // j$.util.stream.g
    public final boolean isParallel() {
        return this.f17888h.f17898r;
    }

    @Override // j$.util.stream.v3
    public final g2 j0(Spliterator spliterator, boolean z10, IntFunction intFunction) {
        if (this.f17888h.f17898r) {
            return K0(this, spliterator, z10, intFunction);
        }
        y1 y1VarA0 = A0(k0(spliterator), intFunction);
        F0(spliterator, y1VarA0);
        return y1VarA0.build();
    }

    public final Spliterator R0(int i10) {
        int i11;
        int i12;
        a aVar = this.f17888h;
        Spliterator spliteratorO0 = aVar.f17894n;
        if (spliteratorO0 != null) {
            aVar.f17894n = null;
            if (aVar.f17898r && aVar.f17896p) {
                a aVar2 = aVar.f17891k;
                int i13 = 1;
                while (aVar != this) {
                    int i14 = aVar2.f17890j;
                    if (aVar2.P0()) {
                        if (y6.SHORT_CIRCUIT.l(i14)) {
                            i14 &= ~y6.f18272u;
                        }
                        spliteratorO0 = aVar2.O0(aVar, spliteratorO0);
                        if (spliteratorO0.hasCharacteristics(64)) {
                            i11 = (~y6.f18271t) & i14;
                            i12 = y6.f18270s;
                        } else {
                            i11 = (~y6.f18270s) & i14;
                            i12 = y6.f18271t;
                        }
                        i14 = i11 | i12;
                        i13 = 0;
                    }
                    int i15 = i13 + 1;
                    aVar2.f17892l = i13;
                    aVar2.f17893m = y6.i(i14, aVar.f17893m);
                    a aVar3 = aVar2;
                    aVar2 = aVar2.f17891k;
                    aVar = aVar3;
                    i13 = i15;
                }
            }
            if (i10 != 0) {
                this.f17893m = y6.i(i10, this.f17893m);
            }
            return spliteratorO0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.v3
    public final long k0(Spliterator spliterator) {
        if (y6.SIZED.l(this.f17893m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.v3
    public final l5 F0(Spliterator spliterator, l5 l5Var) {
        f0(spliterator, G0((l5) Objects.requireNonNull(l5Var)));
        return l5Var;
    }

    @Override // j$.util.stream.v3
    public final void f0(Spliterator spliterator, l5 l5Var) {
        Objects.requireNonNull(l5Var);
        if (!y6.SHORT_CIRCUIT.l(this.f17893m)) {
            l5Var.c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(l5Var);
            l5Var.end();
            return;
        }
        g0(spliterator, l5Var);
    }

    @Override // j$.util.stream.v3
    public final boolean g0(Spliterator spliterator, l5 l5Var) {
        a aVar = this;
        while (aVar.f17892l > 0) {
            aVar = aVar.f17889i;
        }
        l5Var.c(spliterator.getExactSizeIfKnown());
        boolean zL0 = aVar.L0(spliterator, l5Var);
        l5Var.end();
        return zL0;
    }

    @Override // j$.util.stream.v3
    public final l5 G0(l5 l5Var) {
        Objects.requireNonNull(l5Var);
        for (a aVar = this; aVar.f17892l > 0; aVar = aVar.f17889i) {
            l5Var = aVar.Q0(aVar.f17889i.f17893m, l5Var);
        }
        return l5Var;
    }

    @Override // j$.util.stream.v3
    public final Spliterator H0(Spliterator spliterator) {
        return this.f17892l == 0 ? spliterator : T0(this, new j$.util.q(3, spliterator), this.f17888h.f17898r);
    }

    public g2 N0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator O0(a aVar, Spliterator spliterator) {
        return N0(aVar, spliterator, new j$.time.format.b(8)).spliterator();
    }
}
