package w;

import v.d;
import v.e;
import w.f;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k */
    private static int[] f30932k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f30933a;

        static {
            int[] iArr = new int[p.b.values().length];
            f30933a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30933a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30933a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(v.e eVar) {
        super(eVar);
        this.f30966h.f30911e = f.a.LEFT;
        this.f30967i.f30911e = f.a.RIGHT;
        this.f30964f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x02ce  */
    @Override // w.p, w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(w.d r14) {
        /*
            Method dump skipped, instruction units count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.a(w.d):void");
    }

    @Override // w.p
    void d() {
        v.e eVarK;
        v.e eVarK2;
        v.e eVar = this.f30960b;
        if (eVar.f29336a) {
            this.f30963e.d(eVar.W());
        }
        if (this.f30963e.f30916j) {
            e.b bVar = this.f30962d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarK = this.f30960b.K()) != null && (eVarK.A() == e.b.FIXED || eVarK.A() == bVar2)) {
                b(this.f30966h, eVarK.f29344e.f30966h, this.f30960b.O.f());
                b(this.f30967i, eVarK.f29344e.f30967i, -this.f30960b.Q.f());
                return;
            }
        } else {
            e.b bVarA = this.f30960b.A();
            this.f30962d = bVarA;
            if (bVarA != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarA == bVar3 && (eVarK2 = this.f30960b.K()) != null && (eVarK2.A() == e.b.FIXED || eVarK2.A() == bVar3)) {
                    int iW = (eVarK2.W() - this.f30960b.O.f()) - this.f30960b.Q.f();
                    b(this.f30966h, eVarK2.f29344e.f30966h, this.f30960b.O.f());
                    b(this.f30967i, eVarK2.f29344e.f30967i, -this.f30960b.Q.f());
                    this.f30963e.d(iW);
                    return;
                }
                if (this.f30962d == e.b.FIXED) {
                    this.f30963e.d(this.f30960b.W());
                }
            }
        }
        g gVar = this.f30963e;
        if (gVar.f30916j) {
            v.e eVar2 = this.f30960b;
            if (eVar2.f29336a) {
                v.d[] dVarArr = eVar2.W;
                v.d dVar = dVarArr[0];
                v.d dVar2 = dVar.f29322f;
                if (dVar2 != null && dVarArr[1].f29322f != null) {
                    if (eVar2.i0()) {
                        this.f30966h.f30912f = this.f30960b.W[0].f();
                        this.f30967i.f30912f = -this.f30960b.W[1].f();
                        return;
                    }
                    f fVarH = h(this.f30960b.W[0]);
                    if (fVarH != null) {
                        b(this.f30966h, fVarH, this.f30960b.W[0].f());
                    }
                    f fVarH2 = h(this.f30960b.W[1]);
                    if (fVarH2 != null) {
                        b(this.f30967i, fVarH2, -this.f30960b.W[1].f());
                    }
                    this.f30966h.f30908b = true;
                    this.f30967i.f30908b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f30966h, fVarH3, this.f30960b.W[0].f());
                        b(this.f30967i, this.f30966h, this.f30963e.f30913g);
                        return;
                    }
                    return;
                }
                v.d dVar3 = dVarArr[1];
                if (dVar3.f29322f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f30967i, fVarH4, -this.f30960b.W[1].f());
                        b(this.f30966h, this.f30967i, -this.f30963e.f30913g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof v.i) || eVar2.K() == null || this.f30960b.o(d.a.CENTER).f29322f != null) {
                    return;
                }
                b(this.f30966h, this.f30960b.K().f29344e.f30966h, this.f30960b.X());
                b(this.f30967i, this.f30966h, this.f30963e.f30913g);
                return;
            }
        }
        if (this.f30962d == e.b.MATCH_CONSTRAINT) {
            v.e eVar3 = this.f30960b;
            int i10 = eVar3.f29380w;
            if (i10 == 2) {
                v.e eVarK3 = eVar3.K();
                if (eVarK3 != null) {
                    g gVar2 = eVarK3.f29346f.f30963e;
                    this.f30963e.f30918l.add(gVar2);
                    gVar2.f30917k.add(this.f30963e);
                    g gVar3 = this.f30963e;
                    gVar3.f30908b = true;
                    gVar3.f30917k.add(this.f30966h);
                    this.f30963e.f30917k.add(this.f30967i);
                }
            } else if (i10 == 3) {
                if (eVar3.f29382x == 3) {
                    this.f30966h.f30907a = this;
                    this.f30967i.f30907a = this;
                    n nVar = eVar3.f29346f;
                    nVar.f30966h.f30907a = this;
                    nVar.f30967i.f30907a = this;
                    gVar.f30907a = this;
                    if (eVar3.k0()) {
                        this.f30963e.f30918l.add(this.f30960b.f29346f.f30963e);
                        this.f30960b.f29346f.f30963e.f30917k.add(this.f30963e);
                        n nVar2 = this.f30960b.f29346f;
                        nVar2.f30963e.f30907a = this;
                        this.f30963e.f30918l.add(nVar2.f30966h);
                        this.f30963e.f30918l.add(this.f30960b.f29346f.f30967i);
                        this.f30960b.f29346f.f30966h.f30917k.add(this.f30963e);
                        this.f30960b.f29346f.f30967i.f30917k.add(this.f30963e);
                    } else if (this.f30960b.i0()) {
                        this.f30960b.f29346f.f30963e.f30918l.add(this.f30963e);
                        this.f30963e.f30917k.add(this.f30960b.f29346f.f30963e);
                    } else {
                        this.f30960b.f29346f.f30963e.f30918l.add(this.f30963e);
                    }
                } else {
                    g gVar4 = eVar3.f29346f.f30963e;
                    gVar.f30918l.add(gVar4);
                    gVar4.f30917k.add(this.f30963e);
                    this.f30960b.f29346f.f30966h.f30917k.add(this.f30963e);
                    this.f30960b.f29346f.f30967i.f30917k.add(this.f30963e);
                    g gVar5 = this.f30963e;
                    gVar5.f30908b = true;
                    gVar5.f30917k.add(this.f30966h);
                    this.f30963e.f30917k.add(this.f30967i);
                    this.f30966h.f30918l.add(this.f30963e);
                    this.f30967i.f30918l.add(this.f30963e);
                }
            }
        }
        v.e eVar4 = this.f30960b;
        v.d[] dVarArr2 = eVar4.W;
        v.d dVar4 = dVarArr2[0];
        v.d dVar5 = dVar4.f29322f;
        if (dVar5 != null && dVarArr2[1].f29322f != null) {
            if (eVar4.i0()) {
                this.f30966h.f30912f = this.f30960b.W[0].f();
                this.f30967i.f30912f = -this.f30960b.W[1].f();
                return;
            }
            f fVarH5 = h(this.f30960b.W[0]);
            f fVarH6 = h(this.f30960b.W[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f30968j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f30966h, fVarH7, this.f30960b.W[0].f());
                c(this.f30967i, this.f30966h, 1, this.f30963e);
                return;
            }
            return;
        }
        v.d dVar6 = dVarArr2[1];
        if (dVar6.f29322f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f30967i, fVarH8, -this.f30960b.W[1].f());
                c(this.f30966h, this.f30967i, -1, this.f30963e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof v.i) || eVar4.K() == null) {
            return;
        }
        b(this.f30966h, this.f30960b.K().f29344e.f30966h, this.f30960b.X());
        c(this.f30967i, this.f30966h, 1, this.f30963e);
    }

    @Override // w.p
    public void e() {
        f fVar = this.f30966h;
        if (fVar.f30916j) {
            this.f30960b.n1(fVar.f30913g);
        }
    }

    @Override // w.p
    void f() {
        this.f30961c = null;
        this.f30966h.c();
        this.f30967i.c();
        this.f30963e.c();
        this.f30965g = false;
    }

    @Override // w.p
    boolean m() {
        return this.f30962d != e.b.MATCH_CONSTRAINT || this.f30960b.f29380w == 0;
    }

    void r() {
        this.f30965g = false;
        this.f30966h.c();
        this.f30966h.f30916j = false;
        this.f30967i.c();
        this.f30967i.f30916j = false;
        this.f30963e.f30916j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f30960b.t();
    }
}
