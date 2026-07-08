package uj;

import java.util.function.DoubleFunction;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f29277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private vj.b f29278b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29290n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private yj.b f29279c = yj.b.Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f29280d = Double.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private yj.b f29281e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f29282f = Double.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f29283g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f29284h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private yj.b f29285i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private yj.b f29286j = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f29291o = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private yj.b f29289m = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private yj.b f29287k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f29288l = Double.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zi.a f29292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final pj.d f29293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final yj.b f29294c;

        a(zi.a aVar, pj.d dVar, yj.b bVar) {
            this.f29292a = aVar;
            this.f29293b = dVar;
            this.f29294c = bVar;
        }

        public zi.a a() {
            return this.f29292a;
        }

        public pj.d b() {
            return this.f29293b;
        }

        public yj.b c() {
            return this.f29294c;
        }
    }

    public n(h hVar) {
        this.f29277a = hVar;
        this.f29278b = hVar.getHandler();
    }

    public static /* synthetic */ double a(n nVar, xj.b bVar, DoubleFunction doubleFunction, double d10) {
        nVar.getClass();
        return nVar.h(bVar.h((yj.b) doubleFunction.apply(d10)));
    }

    public static /* synthetic */ yj.b b(n nVar, double d10, yj.b bVar, yj.b bVar2, double d11, double d12) {
        return nVar.f29290n == ((d12 > d10 ? 1 : (d12 == d10 ? 0 : -1)) <= 0) ? bVar.a(d12) : bVar2.a(d12 - d11);
    }

    private void c(boolean z10) {
        if (!z10) {
            throw new hj.e(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean f(final xj.b r31, yj.b r32, double r33, yj.b r35, double r36) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uj.n.f(xj.b, yj.b, double, yj.b, double):boolean");
    }

    private double h(pj.d dVar) {
        if (!dVar.getDate().equals(this.f29279c)) {
            this.f29280d = this.f29277a.i(dVar);
            this.f29279c = dVar.getDate();
        }
        return this.f29280d;
    }

    private yj.b l(yj.b bVar, yj.b bVar2) {
        return this.f29290n ^ (bVar.compareTo(bVar2) > 0) ? bVar : bVar2;
    }

    private yj.b m(yj.b bVar) {
        return bVar.a(this.f29290n ? aj.l.f681a : -aj.l.f681a);
    }

    private pj.d n(pj.d dVar, pj.d dVar2, xj.b bVar) {
        if (dVar == dVar2) {
            return null;
        }
        double dX = dVar2.getDate().X(dVar.getDate());
        int iC = aj.d.C(1, (int) aj.d.l(aj.d.b(dX) / this.f29277a.j().a(dVar, dX >= 0.0d)));
        return iC == 1 ? dVar2 : bVar.h(dVar.getDate().a(dX / ((double) iC)));
    }

    private yj.b p(yj.b bVar, double d10) {
        if (this.f29290n) {
            yj.b bVarA = bVar.a(d10);
            return bVarA.X(bVar) > d10 ? bVarA.a(-aj.l.f681a) : bVarA;
        }
        yj.b bVarA2 = bVar.a(-d10);
        return bVar.X(bVarA2) > d10 ? bVarA2.a(aj.l.f681a) : bVarA2;
    }

    private boolean q(yj.b bVar, yj.b bVar2) {
        if (bVar != null && bVar2 != null) {
            if (this.f29290n) {
                return bVar.compareTo(bVar2) < 0;
            }
            if (bVar2.compareTo(bVar) < 0) {
                return true;
            }
        }
        return false;
    }

    public a d(pj.d dVar) {
        c(this.f29284h);
        c(dVar.getDate().equals(this.f29285i));
        boolean z10 = true;
        zi.a aVarA = this.f29278b.a(dVar, this.f29277a, this.f29291o == this.f29290n);
        if (aVarA == zi.a.RESET_STATE) {
            dVar = this.f29278b.d(this.f29277a, dVar);
        }
        this.f29284h = false;
        this.f29285i = null;
        yj.b bVar = this.f29287k;
        this.f29289m = bVar;
        this.f29281e = bVar;
        double d10 = this.f29288l;
        this.f29282f = d10;
        boolean z11 = this.f29291o;
        this.f29283g = z11;
        if (d10 != 0.0d) {
            if (z11 != (d10 > 0.0d)) {
                z10 = false;
            }
        }
        c(z10);
        return new a(aVarA, dVar, this.f29286j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(xj.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r1.i()
            r0.f29290n = r2
            pj.d r2 = r1.m()
            pj.d r8 = r1.j()
            yj.b r3 = r8.getDate()
            yj.b r4 = r0.f29281e
            double r3 = r3.X(r4)
            double r3 = aj.d.b(r3)
            uj.h r5 = r0.f29277a
            double r5 = r5.l()
            r9 = 0
            r10 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L31
            r0.f29284h = r10
            r0.f29285i = r9
            return r10
        L31:
            yj.b r3 = r0.f29281e
            double r4 = r0.f29282f
            pj.d r2 = r0.n(r2, r8, r1)
            r11 = r2
            r2 = r3
            r3 = r4
        L3c:
            if (r11 == 0) goto L67
            yj.b r5 = r11.getDate()
            double r6 = r0.h(r11)
            r12 = 0
            r14 = 1
            int r15 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r15 == 0) goto L5b
            boolean r12 = r0.f29283g
            if (r15 <= 0) goto L53
            r13 = 1
            goto L54
        L53:
            r13 = 0
        L54:
            r12 = r12 ^ r13
            if (r12 == 0) goto L58
            goto L5b
        L58:
            r2 = r5
            r3 = r6
            goto L62
        L5b:
            boolean r5 = r0.f(r1, r2, r3, r5, r6)
            if (r5 == 0) goto L62
            return r14
        L62:
            pj.d r11 = r0.n(r11, r8, r1)
            goto L3c
        L67:
            r0.f29284h = r10
            r0.f29285i = r9
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uj.n.e(xj.b):boolean");
    }

    public void g(pj.d dVar) {
        this.f29277a.a(dVar);
    }

    public yj.b i() {
        return this.f29285i;
    }

    public h j() {
        return this.f29277a;
    }

    public void k(pj.d dVar, yj.b bVar) {
        this.f29277a.b(dVar, bVar);
        this.f29279c = yj.b.Q;
        this.f29280d = Double.NaN;
    }

    public void o(xj.b bVar) {
        double d10;
        this.f29290n = bVar.i();
        pj.d dVarM = bVar.m();
        this.f29281e = dVarM.getDate();
        this.f29282f = h(dVarM);
        while (true) {
            d10 = this.f29282f;
            if (d10 != 0.0d) {
                break;
            }
            yj.b bVarA = this.f29281e.a((this.f29290n ? 0.5d : -0.5d) * this.f29277a.l());
            if (this.f29281e.equals(bVarA)) {
                bVarA = m(bVarA);
            }
            this.f29281e = bVarA;
            this.f29282f = h(bVar.h(bVarA));
        }
        boolean z10 = d10 > 0.0d;
        this.f29283g = z10;
        this.f29291o = z10;
    }

    public boolean r(pj.d dVar, xj.b bVar) {
        n nVar;
        yj.b date = dVar.getDate();
        boolean z10 = false;
        c((this.f29284h && q(this.f29285i, date)) ? false : true);
        if (q(date, this.f29289m)) {
            nVar = this;
        } else {
            double dH = h(dVar);
            if ((dH > 0.0d) == this.f29283g) {
                this.f29282f = dH;
                nVar = this;
            } else {
                nVar = this;
                z10 = nVar.f(bVar, this.f29281e, this.f29282f, date, dH) && !nVar.f29285i.equals(this.f29285i);
            }
        }
        if (!z10) {
            nVar.f29281e = date;
        }
        return z10;
    }
}
