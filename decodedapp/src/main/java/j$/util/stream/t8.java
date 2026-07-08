package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class t8 extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f18184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IntFunction f18185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f18186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18188l;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f17948d;
        if (dVar != null) {
            if (this.f18186j) {
                t8 t8Var = (t8) dVar;
                long j10 = t8Var.f18188l;
                this.f18188l = j10;
                if (j10 == t8Var.f18187k) {
                    this.f18188l = j10 + ((t8) this.f17949e).f18188l;
                }
            }
            t8 t8Var2 = (t8) dVar;
            long j11 = t8Var2.f18187k;
            t8 t8Var3 = (t8) this.f17949e;
            this.f18187k = j11 + t8Var3.f18187k;
            g2 g2VarE0 = t8Var2.f18187k == 0 ? (g2) t8Var3.f17950f : t8Var3.f18187k == 0 ? (g2) t8Var2.f17950f : v3.e0(this.f18184h.M0(), (g2) ((t8) this.f17948d).f17950f, (g2) ((t8) this.f17949e).f17950f);
            if (b() && this.f18186j) {
                g2VarE0 = g2VarE0.i(this.f18188l, g2VarE0.count(), this.f18185i);
            }
            this.f17950f = g2VarE0;
        }
        super.onCompletion(countedCompleter);
    }

    public t8(a aVar, v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        super(v3Var, spliterator);
        this.f18184h = aVar;
        this.f18185i = intFunction;
        this.f18186j = y6.ORDERED.l(((a) v3Var).f17893m);
    }

    public t8(t8 t8Var, Spliterator spliterator) {
        super(t8Var, spliterator);
        this.f18184h = t8Var.f18184h;
        this.f18185i = t8Var.f18185i;
        this.f18186j = t8Var.f18186j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new t8(this, spliterator);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            if (r0 != 0) goto L1c
            boolean r1 = r5.f18186j
            if (r1 == 0) goto L1c
            j$.util.stream.y6 r1 = j$.util.stream.y6.SIZED
            j$.util.stream.a r2 = r5.f18184h
            int r3 = r2.f17890j
            int r1 = r1.f18278e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.f17946b
            long r1 = r2.k0(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.v3 r3 = r5.f17945a
            java.util.function.IntFunction r4 = r5.f18185i
            j$.util.stream.y1 r1 = r3.A0(r1, r4)
            j$.util.stream.a r2 = r5.f18184h
            j$.util.stream.r8 r2 = (j$.util.stream.r8) r2
            boolean r3 = r5.f18186j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.s8 r0 = r2.h(r1, r0)
            j$.util.stream.v3 r2 = r5.f17945a
            j$.util.Spliterator r3 = r5.f17946b
            r2.F0(r3, r0)
            j$.util.stream.g2 r1 = r1.build()
            long r2 = r1.count()
            r5.f18187k = r2
            long r2 = r0.h()
            r5.f18188l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.t8.a():java.lang.Object");
    }
}
