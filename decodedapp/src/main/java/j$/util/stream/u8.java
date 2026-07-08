package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class u8 extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f18201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f18202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f18206o;

    @Override // j$.util.stream.b
    public final void f() {
        this.f17921i = true;
        if (this.f18203l && this.f18206o) {
            d(v3.i0(this.f18201j.M0()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.d r0 = r8.f17948d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.u8 r0 = (j$.util.stream.u8) r0
            boolean r0 = r0.f18205n
            j$.util.stream.d r1 = r8.f17949e
            j$.util.stream.u8 r1 = (j$.util.stream.u8) r1
            boolean r1 = r1.f18205n
            r0 = r0 | r1
            r8.f18205n = r0
            boolean r0 = r8.f18203l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.f17921i
            if (r0 == 0) goto L2a
            r8.f18204m = r1
            j$.util.stream.a r0 = r8.f18201j
            j$.util.stream.z6 r0 = r0.M0()
            j$.util.stream.z2 r0 = j$.util.stream.v3.i0(r0)
            goto L88
        L2a:
            boolean r0 = r8.f18203l
            if (r0 == 0) goto L41
            j$.util.stream.d r0 = r8.f17948d
            j$.util.stream.u8 r0 = (j$.util.stream.u8) r0
            boolean r3 = r0.f18205n
            if (r3 == 0) goto L41
            long r1 = r0.f18204m
            r8.f18204m = r1
            java.lang.Object r0 = r0.i()
            j$.util.stream.g2 r0 = (j$.util.stream.g2) r0
            goto L88
        L41:
            j$.util.stream.d r0 = r8.f17948d
            j$.util.stream.u8 r0 = (j$.util.stream.u8) r0
            long r3 = r0.f18204m
            j$.util.stream.d r5 = r8.f17949e
            j$.util.stream.u8 r5 = (j$.util.stream.u8) r5
            long r6 = r5.f18204m
            long r3 = r3 + r6
            r8.f18204m = r3
            long r3 = r0.f18204m
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L5d
            java.lang.Object r0 = r5.i()
            j$.util.stream.g2 r0 = (j$.util.stream.g2) r0
            goto L88
        L5d:
            long r3 = r5.f18204m
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L6a
            java.lang.Object r0 = r0.i()
            j$.util.stream.g2 r0 = (j$.util.stream.g2) r0
            goto L88
        L6a:
            j$.util.stream.a r0 = r8.f18201j
            j$.util.stream.z6 r0 = r0.M0()
            j$.util.stream.d r1 = r8.f17948d
            j$.util.stream.u8 r1 = (j$.util.stream.u8) r1
            java.lang.Object r1 = r1.i()
            j$.util.stream.g2 r1 = (j$.util.stream.g2) r1
            j$.util.stream.d r2 = r8.f17949e
            j$.util.stream.u8 r2 = (j$.util.stream.u8) r2
            java.lang.Object r2 = r2.i()
            j$.util.stream.g2 r2 = (j$.util.stream.g2) r2
            j$.util.stream.i2 r0 = j$.util.stream.v3.e0(r0, r1, r2)
        L88:
            r8.d(r0)
        L8b:
            r0 = 1
            r8.f18206o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.u8.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public u8(a aVar, v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        super(v3Var, spliterator);
        this.f18201j = aVar;
        this.f18202k = intFunction;
        this.f18203l = y6.ORDERED.l(((a) v3Var).f17893m);
    }

    public u8(u8 u8Var, Spliterator spliterator) {
        super(u8Var, spliterator);
        this.f18201j = u8Var.f18201j;
        this.f18202k = u8Var.f18202k;
        this.f18203l = u8Var.f18203l;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new u8(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return v3.i0(this.f18201j.M0());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        y1 y1VarA0 = this.f17945a.A0(-1L, this.f18202k);
        l5 l5VarQ0 = this.f18201j.Q0(((a) this.f17945a).f17893m, y1VarA0);
        v3 v3Var = this.f17945a;
        boolean zG0 = v3Var.g0(this.f17946b, v3Var.G0(l5VarQ0));
        this.f18205n = zG0;
        if (zG0) {
            g();
        }
        g2 g2VarBuild = y1VarA0.build();
        this.f18204m = g2VarBuild.count();
        return g2VarBuild;
    }
}
