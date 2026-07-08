package xg;

import tg.l0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a */
    private static final x f32112a = new x("UNDEFINED");

    /* JADX INFO: renamed from: b */
    public static final x f32113b = new x("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:82:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:66:0x003e, B:68:0x004c, B:70:0x0052, B:83:0x0091, B:73:0x0069, B:75:0x0079, B:80:0x0088, B:82:0x008e, B:88:0x009e, B:91:0x00a7, B:90:0x00a4, B:78:0x007f), top: B:100:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(hd.e r6, java.lang.Object r7) throws tg.l0 {
        /*
            boolean r0 = r6 instanceof xg.f
            if (r0 == 0) goto Lb2
            xg.f r6 = (xg.f) r6
            java.lang.Object r0 = tg.u.b(r7)
            tg.a0 r1 = r6.f32108d
            hd.i r2 = r6.getContext()
            boolean r1 = d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f32110f = r0
            r6.f27852c = r2
            tg.a0 r7 = r6.f32108d
            hd.i r0 = r6.getContext()
            c(r7, r0, r6)
            goto Lac
        L26:
            tg.y1 r1 = tg.y1.f27879a
            tg.s0 r1 = r1.a()
            boolean r3 = r1.B0()
            if (r3 == 0) goto L3b
            r6.f32110f = r0
            r6.f27852c = r2
            r1.x0(r6)
            goto Lac
        L3b:
            r1.z0(r2)
            hd.i r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            tg.f1$b r4 = tg.f1.f27816q     // Catch: java.lang.Throwable -> L67
            hd.i$b r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L67
            tg.f1 r3 = (tg.f1) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.c()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.s()     // Catch: java.lang.Throwable -> L67
            r6.a(r0, r7)     // Catch: java.lang.Throwable -> L67
            dd.r$a r0 = dd.r.f10916a     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = dd.s.a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = dd.r.a(r7)     // Catch: java.lang.Throwable -> L67
            r6.d(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            hd.e r0 = r6.f32109e     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f32111g     // Catch: java.lang.Throwable -> L67
            hd.i r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = xg.e0.i(r4, r3)     // Catch: java.lang.Throwable -> L67
            xg.x r5 = xg.e0.f32103a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            tg.a2 r0 = tg.y.m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            hd.e r5 = r6.f32109e     // Catch: java.lang.Throwable -> L9b
            r5.d(r7)     // Catch: java.lang.Throwable -> L9b
            dd.d0 r7 = dd.d0.f10897a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.A0()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            xg.e0.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.D0()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.v0(r2)
            goto Lac
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.A0()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            xg.e0.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.h(r7)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r6 = move-exception
            r1.v0(r2)
            throw r6
        Lb2:
            r6.d(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.g.b(hd.e, java.lang.Object):void");
    }

    public static final void c(tg.a0 a0Var, hd.i iVar, Runnable runnable) throws l0 {
        try {
            a0Var.G(iVar, runnable);
        } catch (Throwable th2) {
            throw new l0(th2, a0Var, iVar);
        }
    }

    public static final boolean d(tg.a0 a0Var, hd.i iVar) throws l0 {
        try {
            return a0Var.p0(iVar);
        } catch (Throwable th2) {
            throw new l0(th2, a0Var, iVar);
        }
    }
}
