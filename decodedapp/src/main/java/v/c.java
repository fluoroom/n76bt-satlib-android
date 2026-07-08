package v;

import java.util.ArrayList;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f29295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f29296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f29297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f29298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f29299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f29300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f29301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f29302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f29303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f29304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f29305k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f29306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f29307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f29308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f29309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f29310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f29311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f29312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f29313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f29314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f29315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f29316v;

    public c(e eVar, int i10, boolean z10) {
        this.f29295a = eVar;
        this.f29310p = i10;
        this.f29311q = z10;
    }

    private void b() {
        int i10 = this.f29310p * 2;
        e eVar = this.f29295a;
        this.f29309o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f29303i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f29310p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.V() != 8) {
                this.f29306l++;
                e.b bVarU = eVar.u(this.f29310p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f29307m += eVar.E(this.f29310p);
                }
                int iF = this.f29307m + eVar.W[i10].f();
                this.f29307m = iF;
                int i12 = i10 + 1;
                this.f29307m = iF + eVar.W[i12].f();
                int iF2 = this.f29308n + eVar.W[i10].f();
                this.f29308n = iF2;
                this.f29308n = iF2 + eVar.W[i12].f();
                if (this.f29296b == null) {
                    this.f29296b = eVar;
                }
                this.f29298d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f29310p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f29384y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f29304j++;
                        float f10 = eVar.D0[i13];
                        if (f10 > 0.0f) {
                            this.f29305k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f29312r = true;
                            } else {
                                this.f29313s = true;
                            }
                            if (this.f29302h == null) {
                                this.f29302h = new ArrayList();
                            }
                            this.f29302h.add(eVar);
                        }
                        if (this.f29300f == null) {
                            this.f29300f = eVar;
                        }
                        e eVar4 = this.f29301g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f29310p] = eVar;
                        }
                        this.f29301g = eVar;
                    }
                    if (this.f29310p == 0) {
                        if (eVar.f29380w != 0 || eVar.f29386z != 0 || eVar.A != 0) {
                            this.f29309o = false;
                        }
                    } else if (eVar.f29382x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f29309o = false;
                    }
                    if (eVar.f29343d0 != 0.0f) {
                        this.f29309o = false;
                        this.f29315u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f29310p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f29322f;
            if (dVar != null) {
                e eVar5 = dVar.f29320d;
                d dVar2 = eVar5.W[i10].f29322f;
                if (dVar2 != null && dVar2.f29320d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f29296b;
        if (eVar6 != null) {
            this.f29307m -= eVar6.W[i10].f();
        }
        e eVar7 = this.f29298d;
        if (eVar7 != null) {
            this.f29307m -= eVar7.W[i10 + 1].f();
        }
        this.f29297c = eVar;
        if (this.f29310p == 0 && this.f29311q) {
            this.f29299e = eVar;
        } else {
            this.f29299e = this.f29295a;
        }
        this.f29314t = this.f29313s && this.f29312r;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.V() == 8 || eVar.Z[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f29384y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f29316v) {
            b();
        }
        this.f29316v = true;
    }
}
