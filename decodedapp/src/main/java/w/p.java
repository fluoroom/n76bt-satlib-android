package w;

import v.d;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    v.e f30960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f30961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e.b f30962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f30963e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30964f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f30965g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f30966h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f30967i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f30968j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30969a;

        static {
            int[] iArr = new int[d.a.values().length];
            f30969a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30969a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30969a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30969a[d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30969a[d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(v.e eVar) {
        this.f30960b = eVar;
    }

    private void l(int i10, int i11) {
        int i12 = this.f30959a;
        if (i12 == 0) {
            this.f30963e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f30963e.d(Math.min(g(this.f30963e.f30928m, i10), i11));
            return;
        }
        if (i12 == 2) {
            v.e eVarK = this.f30960b.K();
            if (eVarK != null) {
                if ((i10 == 0 ? eVarK.f29344e : eVarK.f29346f).f30963e.f30916j) {
                    this.f30963e.d(g((int) ((r9.f30913g * (i10 == 0 ? this.f30960b.B : this.f30960b.E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        v.e eVar = this.f30960b;
        p pVar = eVar.f29344e;
        e.b bVar = pVar.f30962d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f30959a == 3) {
            n nVar = eVar.f29346f;
            if (nVar.f30962d == bVar2 && nVar.f30959a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f29346f;
        }
        if (pVar.f30963e.f30916j) {
            float fV = eVar.v();
            this.f30963e.d(i10 == 1 ? (int) ((pVar.f30963e.f30913g / fV) + 0.5f) : (int) ((fV * pVar.f30963e.f30913g) + 0.5f));
        }
    }

    @Override // w.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f30918l.add(fVar2);
        fVar.f30912f = i10;
        fVar2.f30917k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f30918l.add(fVar2);
        fVar.f30918l.add(this.f30963e);
        fVar.f30914h = i10;
        fVar.f30915i = gVar;
        fVar2.f30917k.add(fVar);
        gVar.f30917k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            v.e eVar = this.f30960b;
            int i12 = eVar.A;
            int iMax = Math.max(eVar.f29386z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            v.e eVar2 = this.f30960b;
            int i13 = eVar2.D;
            int iMax2 = Math.max(eVar2.C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(v.d dVar) {
        v.d dVar2 = dVar.f29322f;
        if (dVar2 == null) {
            return null;
        }
        v.e eVar = dVar2.f29320d;
        int i10 = a.f30969a[dVar2.f29321e.ordinal()];
        if (i10 == 1) {
            return eVar.f29344e.f30966h;
        }
        if (i10 == 2) {
            return eVar.f29344e.f30967i;
        }
        if (i10 == 3) {
            return eVar.f29346f.f30966h;
        }
        if (i10 == 4) {
            return eVar.f29346f.f30942k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f29346f.f30967i;
    }

    protected final f i(v.d dVar, int i10) {
        v.d dVar2 = dVar.f29322f;
        if (dVar2 == null) {
            return null;
        }
        v.e eVar = dVar2.f29320d;
        p pVar = i10 == 0 ? eVar.f29344e : eVar.f29346f;
        int i11 = a.f30969a[dVar2.f29321e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f30967i;
        }
        return pVar.f30966h;
    }

    public long j() {
        if (this.f30963e.f30916j) {
            return r0.f30913g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f30965g;
    }

    abstract boolean m();

    protected void n(d dVar, v.d dVar2, v.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f30916j && fVarH2.f30916j) {
            int iF = fVarH.f30913g + dVar2.f();
            int iF2 = fVarH2.f30913g - dVar3.f();
            int i11 = iF2 - iF;
            if (!this.f30963e.f30916j && this.f30962d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f30963e;
            if (gVar.f30916j) {
                if (gVar.f30913g == i11) {
                    this.f30966h.d(iF);
                    this.f30967i.d(iF2);
                    return;
                }
                float fY = i10 == 0 ? this.f30960b.y() : this.f30960b.R();
                if (fVarH == fVarH2) {
                    iF = fVarH.f30913g;
                    iF2 = fVarH2.f30913g;
                    fY = 0.5f;
                }
                this.f30966h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f30963e.f30913g) * fY)));
                this.f30967i.d(this.f30966h.f30913g + this.f30963e.f30913g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
