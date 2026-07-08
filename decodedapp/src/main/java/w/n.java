package w;

import v.d;
import v.e;
import w.f;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k */
    public f f30942k;

    /* JADX INFO: renamed from: l */
    g f30943l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f30944a;

        static {
            int[] iArr = new int[p.b.values().length];
            f30944a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30944a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30944a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(v.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f30942k = fVar;
        this.f30943l = null;
        this.f30966h.f30911e = f.a.TOP;
        this.f30967i.f30911e = f.a.BOTTOM;
        fVar.f30911e = f.a.BASELINE;
        this.f30964f = 1;
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        float f10;
        float fV;
        float fV2;
        int i10;
        int i11 = a.f30944a[this.f30968j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            v.e eVar = this.f30960b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f30963e;
        if (gVar.f30909c && !gVar.f30916j && this.f30962d == e.b.MATCH_CONSTRAINT) {
            v.e eVar2 = this.f30960b;
            int i12 = eVar2.f29382x;
            if (i12 == 2) {
                v.e eVarK = eVar2.K();
                if (eVarK != null) {
                    if (eVarK.f29346f.f30963e.f30916j) {
                        this.f30963e.d((int) ((r7.f30913g * this.f30960b.E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f29344e.f30963e.f30916j) {
                int iW = eVar2.w();
                if (iW == -1) {
                    v.e eVar3 = this.f30960b;
                    f10 = eVar3.f29344e.f30963e.f30913g;
                    fV = eVar3.v();
                } else if (iW == 0) {
                    fV2 = r7.f29344e.f30963e.f30913g * this.f30960b.v();
                    i10 = (int) (fV2 + 0.5f);
                    this.f30963e.d(i10);
                } else if (iW != 1) {
                    i10 = 0;
                    this.f30963e.d(i10);
                } else {
                    v.e eVar4 = this.f30960b;
                    f10 = eVar4.f29344e.f30963e.f30913g;
                    fV = eVar4.v();
                }
                fV2 = f10 / fV;
                i10 = (int) (fV2 + 0.5f);
                this.f30963e.d(i10);
            }
        }
        f fVar = this.f30966h;
        if (fVar.f30909c) {
            f fVar2 = this.f30967i;
            if (fVar2.f30909c) {
                if (fVar.f30916j && fVar2.f30916j && this.f30963e.f30916j) {
                    return;
                }
                if (!this.f30963e.f30916j && this.f30962d == e.b.MATCH_CONSTRAINT) {
                    v.e eVar5 = this.f30960b;
                    if (eVar5.f29380w == 0 && !eVar5.k0()) {
                        f fVar3 = (f) this.f30966h.f30918l.get(0);
                        f fVar4 = (f) this.f30967i.f30918l.get(0);
                        int i13 = fVar3.f30913g;
                        f fVar5 = this.f30966h;
                        int i14 = i13 + fVar5.f30912f;
                        int i15 = fVar4.f30913g + this.f30967i.f30912f;
                        fVar5.d(i14);
                        this.f30967i.d(i15);
                        this.f30963e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f30963e.f30916j && this.f30962d == e.b.MATCH_CONSTRAINT && this.f30959a == 1 && this.f30966h.f30918l.size() > 0 && this.f30967i.f30918l.size() > 0) {
                    f fVar6 = (f) this.f30966h.f30918l.get(0);
                    int i16 = (((f) this.f30967i.f30918l.get(0)).f30913g + this.f30967i.f30912f) - (fVar6.f30913g + this.f30966h.f30912f);
                    g gVar2 = this.f30963e;
                    int i17 = gVar2.f30928m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f30963e.f30916j && this.f30966h.f30918l.size() > 0 && this.f30967i.f30918l.size() > 0) {
                    f fVar7 = (f) this.f30966h.f30918l.get(0);
                    f fVar8 = (f) this.f30967i.f30918l.get(0);
                    int i18 = fVar7.f30913g + this.f30966h.f30912f;
                    int i19 = fVar8.f30913g + this.f30967i.f30912f;
                    float fR = this.f30960b.R();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f30913g;
                        i19 = fVar8.f30913g;
                        fR = 0.5f;
                    }
                    this.f30966h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f30963e.f30913g) * fR)));
                    this.f30967i.d(this.f30966h.f30913g + this.f30963e.f30913g);
                }
            }
        }
    }

    @Override // w.p
    void d() {
        v.e eVarK;
        v.e eVarK2;
        v.e eVar = this.f30960b;
        if (eVar.f29336a) {
            this.f30963e.d(eVar.x());
        }
        if (!this.f30963e.f30916j) {
            this.f30962d = this.f30960b.T();
            if (this.f30960b.Z()) {
                this.f30943l = new w.a(this);
            }
            e.b bVar = this.f30962d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarK2 = this.f30960b.K()) != null && eVarK2.T() == e.b.FIXED) {
                    int iX = (eVarK2.x() - this.f30960b.P.f()) - this.f30960b.R.f();
                    b(this.f30966h, eVarK2.f29346f.f30966h, this.f30960b.P.f());
                    b(this.f30967i, eVarK2.f29346f.f30967i, -this.f30960b.R.f());
                    this.f30963e.d(iX);
                    return;
                }
                if (this.f30962d == e.b.FIXED) {
                    this.f30963e.d(this.f30960b.x());
                }
            }
        } else if (this.f30962d == e.b.MATCH_PARENT && (eVarK = this.f30960b.K()) != null && eVarK.T() == e.b.FIXED) {
            b(this.f30966h, eVarK.f29346f.f30966h, this.f30960b.P.f());
            b(this.f30967i, eVarK.f29346f.f30967i, -this.f30960b.R.f());
            return;
        }
        g gVar = this.f30963e;
        boolean z10 = gVar.f30916j;
        if (z10) {
            v.e eVar2 = this.f30960b;
            if (eVar2.f29336a) {
                v.d[] dVarArr = eVar2.W;
                v.d dVar = dVarArr[2];
                v.d dVar2 = dVar.f29322f;
                if (dVar2 != null && dVarArr[3].f29322f != null) {
                    if (eVar2.k0()) {
                        this.f30966h.f30912f = this.f30960b.W[2].f();
                        this.f30967i.f30912f = -this.f30960b.W[3].f();
                    } else {
                        f fVarH = h(this.f30960b.W[2]);
                        if (fVarH != null) {
                            b(this.f30966h, fVarH, this.f30960b.W[2].f());
                        }
                        f fVarH2 = h(this.f30960b.W[3]);
                        if (fVarH2 != null) {
                            b(this.f30967i, fVarH2, -this.f30960b.W[3].f());
                        }
                        this.f30966h.f30908b = true;
                        this.f30967i.f30908b = true;
                    }
                    if (this.f30960b.Z()) {
                        b(this.f30942k, this.f30966h, this.f30960b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f30966h, fVarH3, this.f30960b.W[2].f());
                        b(this.f30967i, this.f30966h, this.f30963e.f30913g);
                        if (this.f30960b.Z()) {
                            b(this.f30942k, this.f30966h, this.f30960b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                v.d dVar3 = dVarArr[3];
                if (dVar3.f29322f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f30967i, fVarH4, -this.f30960b.W[3].f());
                        b(this.f30966h, this.f30967i, -this.f30963e.f30913g);
                    }
                    if (this.f30960b.Z()) {
                        b(this.f30942k, this.f30966h, this.f30960b.p());
                        return;
                    }
                    return;
                }
                v.d dVar4 = dVarArr[4];
                if (dVar4.f29322f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f30942k, fVarH5, 0);
                        b(this.f30966h, this.f30942k, -this.f30960b.p());
                        b(this.f30967i, this.f30966h, this.f30963e.f30913g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof v.i) || eVar2.K() == null || this.f30960b.o(d.a.CENTER).f29322f != null) {
                    return;
                }
                b(this.f30966h, this.f30960b.K().f29346f.f30966h, this.f30960b.Y());
                b(this.f30967i, this.f30966h, this.f30963e.f30913g);
                if (this.f30960b.Z()) {
                    b(this.f30942k, this.f30966h, this.f30960b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f30962d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            v.e eVar3 = this.f30960b;
            int i10 = eVar3.f29382x;
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
            } else if (i10 == 3 && !eVar3.k0()) {
                v.e eVar4 = this.f30960b;
                if (eVar4.f29380w != 3) {
                    g gVar4 = eVar4.f29344e.f30963e;
                    this.f30963e.f30918l.add(gVar4);
                    gVar4.f30917k.add(this.f30963e);
                    g gVar5 = this.f30963e;
                    gVar5.f30908b = true;
                    gVar5.f30917k.add(this.f30966h);
                    this.f30963e.f30917k.add(this.f30967i);
                }
            }
        }
        v.e eVar5 = this.f30960b;
        v.d[] dVarArr2 = eVar5.W;
        v.d dVar5 = dVarArr2[2];
        v.d dVar6 = dVar5.f29322f;
        if (dVar6 != null && dVarArr2[3].f29322f != null) {
            if (eVar5.k0()) {
                this.f30966h.f30912f = this.f30960b.W[2].f();
                this.f30967i.f30912f = -this.f30960b.W[3].f();
            } else {
                f fVarH6 = h(this.f30960b.W[2]);
                f fVarH7 = h(this.f30960b.W[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f30968j = p.b.CENTER;
            }
            if (this.f30960b.Z()) {
                c(this.f30942k, this.f30966h, 1, this.f30943l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f30966h, fVarH8, this.f30960b.W[2].f());
                c(this.f30967i, this.f30966h, 1, this.f30963e);
                if (this.f30960b.Z()) {
                    c(this.f30942k, this.f30966h, 1, this.f30943l);
                }
                e.b bVar2 = this.f30962d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f30960b.v() > 0.0f) {
                    l lVar = this.f30960b.f29344e;
                    if (lVar.f30962d == bVar3) {
                        lVar.f30963e.f30917k.add(this.f30963e);
                        this.f30963e.f30918l.add(this.f30960b.f29344e.f30963e);
                        this.f30963e.f30907a = this;
                    }
                }
            }
        } else {
            v.d dVar7 = dVarArr2[3];
            if (dVar7.f29322f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f30967i, fVarH9, -this.f30960b.W[3].f());
                    c(this.f30966h, this.f30967i, -1, this.f30963e);
                    if (this.f30960b.Z()) {
                        c(this.f30942k, this.f30966h, 1, this.f30943l);
                    }
                }
            } else {
                v.d dVar8 = dVarArr2[4];
                if (dVar8.f29322f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f30942k, fVarH10, 0);
                        c(this.f30966h, this.f30942k, -1, this.f30943l);
                        c(this.f30967i, this.f30966h, 1, this.f30963e);
                    }
                } else if (!(eVar5 instanceof v.i) && eVar5.K() != null) {
                    b(this.f30966h, this.f30960b.K().f29346f.f30966h, this.f30960b.Y());
                    c(this.f30967i, this.f30966h, 1, this.f30963e);
                    if (this.f30960b.Z()) {
                        c(this.f30942k, this.f30966h, 1, this.f30943l);
                    }
                    e.b bVar4 = this.f30962d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f30960b.v() > 0.0f) {
                        l lVar2 = this.f30960b.f29344e;
                        if (lVar2.f30962d == bVar5) {
                            lVar2.f30963e.f30917k.add(this.f30963e);
                            this.f30963e.f30918l.add(this.f30960b.f29344e.f30963e);
                            this.f30963e.f30907a = this;
                        }
                    }
                }
            }
        }
        if (this.f30963e.f30918l.size() == 0) {
            this.f30963e.f30909c = true;
        }
    }

    @Override // w.p
    public void e() {
        f fVar = this.f30966h;
        if (fVar.f30916j) {
            this.f30960b.o1(fVar.f30913g);
        }
    }

    @Override // w.p
    void f() {
        this.f30961c = null;
        this.f30966h.c();
        this.f30967i.c();
        this.f30942k.c();
        this.f30963e.c();
        this.f30965g = false;
    }

    @Override // w.p
    boolean m() {
        return this.f30962d != e.b.MATCH_CONSTRAINT || this.f30960b.f29382x == 0;
    }

    void q() {
        this.f30965g = false;
        this.f30966h.c();
        this.f30966h.f30916j = false;
        this.f30967i.c();
        this.f30967i.f30916j = false;
        this.f30942k.c();
        this.f30942k.f30916j = false;
        this.f30963e.f30916j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f30960b.t();
    }
}
