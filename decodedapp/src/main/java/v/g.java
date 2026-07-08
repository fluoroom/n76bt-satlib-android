package v;

import java.util.ArrayList;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class g extends l {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private e[] f29433x1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f29410a1 = -1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f29411b1 = -1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f29412c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f29413d1 = -1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f29414e1 = -1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f29415f1 = -1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private float f29416g1 = 0.5f;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private float f29417h1 = 0.5f;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private float f29418i1 = 0.5f;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private float f29419j1 = 0.5f;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private float f29420k1 = 0.5f;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private float f29421l1 = 0.5f;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int f29422m1 = 0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f29423n1 = 0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f29424o1 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f29425p1 = 2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private int f29426q1 = 0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f29427r1 = -1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f29428s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private ArrayList f29429t1 = new ArrayList();

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private e[] f29430u1 = null;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private e[] f29431v1 = null;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private int[] f29432w1 = null;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f29434y1 = 0;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29435a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f29438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f29439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f29440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f29441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29442h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29443i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f29444j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f29445k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f29451q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f29436b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29437c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f29446l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f29447m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f29448n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f29449o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f29450p = 0;

        a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f29442h = 0;
            this.f29443i = 0;
            this.f29444j = 0;
            this.f29445k = 0;
            this.f29451q = 0;
            this.f29435a = i10;
            this.f29438d = dVar;
            this.f29439e = dVar2;
            this.f29440f = dVar3;
            this.f29441g = dVar4;
            this.f29442h = g.this.A1();
            this.f29443i = g.this.C1();
            this.f29444j = g.this.B1();
            this.f29445k = g.this.z1();
            this.f29451q = i11;
        }

        private void h() {
            this.f29446l = 0;
            this.f29447m = 0;
            this.f29436b = null;
            this.f29437c = 0;
            int i10 = this.f29449o;
            for (int i11 = 0; i11 < i10 && this.f29448n + i11 < g.this.f29434y1; i11++) {
                e eVar = g.this.f29433x1[this.f29448n + i11];
                if (this.f29435a == 0) {
                    int iW = eVar.W();
                    int i12 = g.this.f29422m1;
                    if (eVar.V() == 8) {
                        i12 = 0;
                    }
                    this.f29446l += iW + i12;
                    int iL2 = g.this.l2(eVar, this.f29451q);
                    if (this.f29436b == null || this.f29437c < iL2) {
                        this.f29436b = eVar;
                        this.f29437c = iL2;
                        this.f29447m = iL2;
                    }
                } else {
                    int iM2 = g.this.m2(eVar, this.f29451q);
                    int iL22 = g.this.l2(eVar, this.f29451q);
                    int i13 = g.this.f29423n1;
                    if (eVar.V() == 8) {
                        i13 = 0;
                    }
                    this.f29447m += iL22 + i13;
                    if (this.f29436b == null || this.f29437c < iM2) {
                        this.f29436b = eVar;
                        this.f29437c = iM2;
                        this.f29446l = iM2;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f29435a == 0) {
                int iM2 = g.this.m2(eVar, this.f29451q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f29450p++;
                    iM2 = 0;
                }
                this.f29446l += iM2 + (eVar.V() != 8 ? g.this.f29422m1 : 0);
                int iL2 = g.this.l2(eVar, this.f29451q);
                if (this.f29436b == null || this.f29437c < iL2) {
                    this.f29436b = eVar;
                    this.f29437c = iL2;
                    this.f29447m = iL2;
                }
            } else {
                int iM22 = g.this.m2(eVar, this.f29451q);
                int iL22 = g.this.l2(eVar, this.f29451q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.f29450p++;
                    iL22 = 0;
                }
                this.f29447m += iL22 + (eVar.V() != 8 ? g.this.f29423n1 : 0);
                if (this.f29436b == null || this.f29437c < iM22) {
                    this.f29436b = eVar;
                    this.f29437c = iM22;
                    this.f29446l = iM22;
                }
            }
            this.f29449o++;
        }

        public void c() {
            this.f29437c = 0;
            this.f29436b = null;
            this.f29446l = 0;
            this.f29447m = 0;
            this.f29448n = 0;
            this.f29449o = 0;
            this.f29450p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            float f10;
            float f11;
            int i11 = this.f29449o;
            for (int i12 = 0; i12 < i11 && this.f29448n + i12 < g.this.f29434y1; i12++) {
                e eVar2 = g.this.f29433x1[this.f29448n + i12];
                if (eVar2 != null) {
                    eVar2.u0();
                }
            }
            if (i11 == 0 || this.f29436b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = z10 ? (i11 - 1) - i15 : i15;
                if (this.f29448n + i16 >= g.this.f29434y1) {
                    break;
                }
                e eVar3 = g.this.f29433x1[this.f29448n + i16];
                if (eVar3 != null && eVar3.V() == 0) {
                    if (i13 == -1) {
                        i13 = i15;
                    }
                    i14 = i15;
                }
            }
            e eVar4 = null;
            if (this.f29435a != 0) {
                e eVar5 = this.f29436b;
                eVar5.O0(g.this.f29410a1);
                int i17 = this.f29442h;
                if (i10 > 0) {
                    i17 += g.this.f29422m1;
                }
                if (z10) {
                    eVar5.Q.a(this.f29440f, i17);
                    if (z11) {
                        eVar5.O.a(this.f29438d, this.f29444j);
                    }
                    if (i10 > 0) {
                        this.f29440f.f29320d.O.a(eVar5.Q, 0);
                    }
                } else {
                    eVar5.O.a(this.f29438d, i17);
                    if (z11) {
                        eVar5.Q.a(this.f29440f, this.f29444j);
                    }
                    if (i10 > 0) {
                        this.f29438d.f29320d.Q.a(eVar5.O, 0);
                    }
                }
                for (int i18 = 0; i18 < i11 && this.f29448n + i18 < g.this.f29434y1; i18++) {
                    e eVar6 = g.this.f29433x1[this.f29448n + i18];
                    if (eVar6 != null) {
                        if (i18 == 0) {
                            eVar6.k(eVar6.P, this.f29439e, this.f29443i);
                            int i19 = g.this.f29411b1;
                            float f12 = g.this.f29417h1;
                            if (this.f29448n == 0 && g.this.f29413d1 != -1) {
                                i19 = g.this.f29413d1;
                                f12 = g.this.f29419j1;
                            } else if (z11 && g.this.f29415f1 != -1) {
                                i19 = g.this.f29415f1;
                                f12 = g.this.f29421l1;
                            }
                            eVar6.f1(i19);
                            eVar6.e1(f12);
                        }
                        if (i18 == i11 - 1) {
                            eVar6.k(eVar6.R, this.f29441g, this.f29445k);
                        }
                        if (eVar4 != null) {
                            eVar6.P.a(eVar4.R, g.this.f29423n1);
                            if (i18 == i13) {
                                eVar6.P.u(this.f29443i);
                            }
                            eVar4.R.a(eVar6.P, 0);
                            if (i18 == i14 + 1) {
                                eVar4.R.u(this.f29445k);
                            }
                        }
                        if (eVar6 == eVar5) {
                            eVar4 = eVar6;
                        } else if (z10) {
                            int i20 = g.this.f29424o1;
                            if (i20 == 0) {
                                eVar6.Q.a(eVar5.Q, 0);
                            } else if (i20 == 1) {
                                eVar6.O.a(eVar5.O, 0);
                            } else if (i20 == 2) {
                                eVar6.O.a(eVar5.O, 0);
                                eVar6.Q.a(eVar5.Q, 0);
                            }
                            eVar4 = eVar6;
                        } else {
                            int i21 = g.this.f29424o1;
                            if (i21 == 0) {
                                eVar6.O.a(eVar5.O, 0);
                            } else if (i21 == 1) {
                                eVar6.Q.a(eVar5.Q, 0);
                            } else if (i21 == 2) {
                                if (z12) {
                                    eVar6.O.a(this.f29438d, this.f29442h);
                                    eVar6.Q.a(this.f29440f, this.f29444j);
                                } else {
                                    eVar6.O.a(eVar5.O, 0);
                                    eVar6.Q.a(eVar5.Q, 0);
                                }
                            }
                            eVar4 = eVar6;
                        }
                    }
                }
                return;
            }
            e eVar7 = this.f29436b;
            eVar7.f1(g.this.f29411b1);
            int i22 = this.f29443i;
            if (i10 > 0) {
                i22 += g.this.f29423n1;
            }
            eVar7.P.a(this.f29439e, i22);
            if (z11) {
                eVar7.R.a(this.f29441g, this.f29445k);
            }
            if (i10 > 0) {
                this.f29439e.f29320d.R.a(eVar7.P, 0);
            }
            if (g.this.f29425p1 != 3 || eVar7.Z()) {
                eVar = eVar7;
            } else {
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = z10 ? (i11 - 1) - i23 : i23;
                    if (this.f29448n + i24 >= g.this.f29434y1) {
                        break;
                    }
                    eVar = g.this.f29433x1[this.f29448n + i24];
                    if (eVar.Z()) {
                        break;
                    }
                }
                eVar = eVar7;
            }
            int i25 = 0;
            while (i25 < i11) {
                int i26 = z10 ? (i11 - 1) - i25 : i25;
                if (this.f29448n + i26 >= g.this.f29434y1) {
                    return;
                }
                e eVar8 = g.this.f29433x1[this.f29448n + i26];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                } else {
                    if (i25 == 0) {
                        eVar8.k(eVar8.O, this.f29438d, this.f29442h);
                    }
                    if (i26 == 0) {
                        int i27 = g.this.f29410a1;
                        float f13 = g.this.f29416g1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f29448n != 0 || g.this.f29412c1 == -1) {
                            if (z11 && g.this.f29414e1 != -1) {
                                i27 = g.this.f29414e1;
                                if (z10) {
                                    f11 = g.this.f29420k1;
                                    f10 = 1.0f - f11;
                                    f13 = f10;
                                } else {
                                    f10 = g.this.f29420k1;
                                    f13 = f10;
                                }
                            }
                            eVar8.O0(i27);
                            eVar8.N0(f13);
                        } else {
                            i27 = g.this.f29412c1;
                            if (z10) {
                                f11 = g.this.f29418i1;
                                f10 = 1.0f - f11;
                                f13 = f10;
                                eVar8.O0(i27);
                                eVar8.N0(f13);
                            } else {
                                f10 = g.this.f29418i1;
                                f13 = f10;
                                eVar8.O0(i27);
                                eVar8.N0(f13);
                            }
                        }
                        i25++;
                        eVar4 = eVar8;
                    }
                    if (i25 == i11 - 1) {
                        eVar8.k(eVar8.Q, this.f29440f, this.f29444j);
                    }
                    if (eVar4 != null) {
                        eVar8.O.a(eVar4.Q, g.this.f29422m1);
                        if (i25 == i13) {
                            eVar8.O.u(this.f29442h);
                        }
                        eVar4.Q.a(eVar8.O, 0);
                        if (i25 == i14 + 1) {
                            eVar4.Q.u(this.f29444j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        if (g.this.f29425p1 == 3 && eVar.Z() && eVar8 != eVar && eVar8.Z()) {
                            eVar8.S.a(eVar.S, 0);
                        } else {
                            int i28 = g.this.f29425p1;
                            if (i28 == 0) {
                                eVar8.P.a(eVar7.P, 0);
                            } else if (i28 == 1) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (z12) {
                                eVar8.P.a(this.f29439e, this.f29443i);
                                eVar8.R.a(this.f29441g, this.f29445k);
                            } else {
                                eVar8.P.a(eVar7.P, 0);
                                eVar8.R.a(eVar7.R, 0);
                            }
                        }
                    }
                    i25++;
                    eVar4 = eVar8;
                }
                i25++;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f29435a == 1 ? this.f29447m - g.this.f29423n1 : this.f29447m;
        }

        public int f() {
            return this.f29435a == 0 ? this.f29446l - g.this.f29422m1 : this.f29446l;
        }

        public void g(int i10) {
            int i11 = this.f29450p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f29449o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f29448n + i14 < g.this.f29434y1; i14++) {
                e eVar = g.this.f29433x1[this.f29448n + i14];
                if (this.f29435a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f29380w == 0) {
                        g.this.E1(eVar, e.b.FIXED, i13, eVar.T(), eVar.x());
                    }
                } else if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f29382x == 0) {
                    int i15 = i13;
                    g.this.E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public void i(int i10) {
            this.f29448n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f29435a = i10;
            this.f29438d = dVar;
            this.f29439e = dVar2;
            this.f29440f = dVar3;
            this.f29441g = dVar4;
            this.f29442h = i11;
            this.f29443i = i12;
            this.f29444j = i13;
            this.f29445k = i14;
            this.f29451q = i15;
        }
    }

    private void k2(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.f29432w1 == null || this.f29431v1 == null || this.f29430u1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f29434y1; i11++) {
            this.f29433x1[i11].u0();
        }
        int[] iArr = this.f29432w1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f29416g1;
        e eVar2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f29416g1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            e eVar3 = this.f29431v1[i10];
            if (eVar3 != null && eVar3.V() != 8) {
                if (i14 == 0) {
                    eVar3.k(eVar3.O, this.O, A1());
                    eVar3.O0(this.f29410a1);
                    eVar3.N0(f10);
                }
                if (i14 == i12 - 1) {
                    eVar3.k(eVar3.Q, this.Q, B1());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.k(eVar3.O, eVar2.Q, this.f29422m1);
                    eVar2.k(eVar2.Q, eVar3.O, 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            e eVar4 = this.f29430u1[i15];
            if (eVar4 != null && eVar4.V() != 8) {
                if (i15 == 0) {
                    eVar4.k(eVar4.P, this.P, C1());
                    eVar4.f1(this.f29411b1);
                    eVar4.e1(this.f29417h1);
                }
                if (i15 == i13 - 1) {
                    eVar4.k(eVar4.R, this.R, z1());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.k(eVar4.P, eVar2.R, this.f29423n1);
                    eVar2.k(eVar2.R, eVar4.P, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f29428s1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                e[] eVarArr = this.f29433x1;
                if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.V() != 8) {
                    e eVar5 = this.f29431v1[i16];
                    e eVar6 = this.f29430u1[i17];
                    if (eVar != eVar5) {
                        eVar.k(eVar.O, eVar5.O, 0);
                        eVar.k(eVar.Q, eVar5.Q, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.P, eVar6.P, 0);
                        eVar.k(eVar.R, eVar6.R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f29382x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.E * i10);
                if (i12 != eVar.x()) {
                    eVar.Z0(true);
                    E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.x();
            }
            if (i11 == 3) {
                return (int) ((eVar2.W() * eVar2.f29343d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f29380w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.B * i10);
                if (i12 != eVar.W()) {
                    eVar.Z0(true);
                    E1(eVar, e.b.FIXED, i12, eVar.T(), eVar.x());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.W();
            }
            if (i11 == 3) {
                return (int) ((eVar2.x() * eVar2.f29343d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.W();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n2(v.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.n2(v.e[], int, int, int, int[]):void");
    }

    private void o2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f29429t1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
        gVar2.f29429t1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iM2 = gVar2.m2(eVar, i16);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (gVar2.f29422m1 + i17) + iM2 > i16) && aVar.f29436b != null;
                if (!z10 && i18 > 0 && (i15 = gVar2.f29427r1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    aVar.i(i18);
                    gVar2.f29429t1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += gVar2.f29422m1 + iM2;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iM2;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iL2 = gVar2.l2(eVar2, i16);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (gVar2.f29423n1 + i20) + iL2 > i16) && aVar.f29436b != null;
                if (!z11 && i21 > 0 && (i14 = gVar2.f29427r1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.f29429t1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f29423n1 + iL2;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    gVar2 = gVar;
                }
                i20 = iL2;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f29429t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int iA1 = gVar3.A1();
        int iC1 = gVar3.C1();
        int iB1 = gVar3.B1();
        int iZ1 = gVar3.z1();
        e.b bVarA = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarA == bVar || gVar3.T() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) gVar3.f29429t1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iZ12 = iZ1;
        int i24 = 0;
        int iB12 = iB1;
        int i25 = iC1;
        int i26 = iA1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = (a) gVar3.f29429t1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = ((a) gVar3.f29429t1.get(i28 + 1)).f29436b.P;
                    iZ12 = 0;
                } else {
                    dVar7 = gVar3.R;
                    iZ12 = gVar3.z1();
                }
                d dVar10 = aVar3.f29436b.R;
                int i29 = i27;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iB12, iZ12, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += gVar3.f29423n1;
                }
                i27 = iE;
                i24 = iMax;
                dVar9 = dVar10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    dVar = ((a) gVar3.f29429t1.get(i28 + 1)).f29436b.O;
                    iB12 = 0;
                } else {
                    dVar = gVar3.Q;
                    iB12 = gVar3.B1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f29436b.Q;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iB12, iZ12, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += gVar3.f29422m1;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                dVar6 = dVar11;
                i26 = 0;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    private void p2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f29429t1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
        gVar2.f29429t1.add(aVar);
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                e eVar = eVarArr[i19];
                int iM2 = gVar2.m2(eVar, i16);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z10 = (i18 == i16 || (gVar2.f29422m1 + i18) + iM2 > i16) && aVar.f29436b != null;
                if (!z10 && i19 > 0 && (i15 = gVar2.f29427r1) > 0 && i17 > i15) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    aVar.i(i19);
                    gVar2.f29429t1.add(aVar);
                    i18 = iM2;
                    i17 = 1;
                } else {
                    i18 = i19 > 0 ? i18 + gVar2.f29422m1 + iM2 : iM2;
                }
                aVar.b(eVar);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                e eVar2 = eVarArr[i23];
                int iL2 = gVar2.l2(eVar2, i16);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z11 = (i22 == i16 || (gVar2.f29423n1 + i22) + iL2 > i16) && aVar.f29436b != null;
                if (!z11 && i23 > 0 && (i14 = gVar2.f29427r1) > 0 && i21 > i14) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    gVar = gVar2;
                    aVar.i(i23);
                    gVar.f29429t1.add(aVar);
                    i22 = iL2;
                    i21 = 1;
                } else {
                    gVar = gVar2;
                    i22 = i23 > 0 ? i22 + gVar.f29423n1 + iL2 : iL2;
                }
                aVar.b(eVar2);
                i23++;
                i16 = i12;
                i13 = i24;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f29429t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int iA1 = gVar3.A1();
        int iC1 = gVar3.C1();
        int iB1 = gVar3.B1();
        int iZ1 = gVar3.z1();
        e.b bVarA = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarA == bVar || gVar3.T() == bVar;
        if (i13 > 0 && z12) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = (a) gVar3.f29429t1.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int iZ12 = iZ1;
        int i26 = 0;
        int iB12 = iB1;
        int i27 = iC1;
        int i28 = iA1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i29 = 0;
        for (int i30 = 0; i30 < size; i30++) {
            a aVar3 = (a) gVar3.f29429t1.get(i30);
            if (i11 == 0) {
                if (i30 < size - 1) {
                    dVar7 = ((a) gVar3.f29429t1.get(i30 + 1)).f29436b.P;
                    iZ12 = 0;
                } else {
                    dVar7 = gVar3.R;
                    iZ12 = gVar3.z1();
                }
                d dVar10 = aVar3.f29436b.R;
                int i31 = i26;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i28, i27, iB12, iZ12, i12);
                int iMax = Math.max(i29, aVar3.f());
                int iE = aVar3.e() + i31;
                if (i30 > 0) {
                    iE += gVar3.f29423n1;
                }
                i26 = iE;
                i29 = iMax;
                dVar6 = dVar10;
                i27 = 0;
            } else {
                int i32 = i29;
                int i33 = i26;
                if (i30 < size - 1) {
                    dVar = ((a) gVar3.f29429t1.get(i30 + 1)).f29436b.O;
                    iB12 = 0;
                } else {
                    dVar = gVar3.Q;
                    iB12 = gVar3.B1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f29436b.Q;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i28, i27, iB12, iZ12, i12);
                int iF = aVar3.f() + i32;
                int iMax2 = Math.max(i33, aVar3.e());
                if (i30 > 0) {
                    iF += gVar3.f29422m1;
                }
                int i34 = iF;
                i26 = iMax2;
                i29 = i34;
                dVar9 = dVar11;
                i28 = 0;
            }
        }
        iArr[0] = i29;
        iArr[1] = i26;
    }

    private void q2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f29429t1.size() == 0) {
            aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
            this.f29429t1.add(aVar);
        } else {
            a aVar2 = (a) this.f29429t1.get(0);
            aVar2.c();
            aVar2.j(i11, this.O, this.P, this.Q, this.R, A1(), C1(), B1(), z1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(int i10) {
        this.f29414e1 = i10;
    }

    public void B2(float f10) {
        this.f29421l1 = f10;
    }

    public void C2(int i10) {
        this.f29415f1 = i10;
    }

    @Override // v.l
    public void D1(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.M0 > 0 && !F1()) {
            I1(0, 0);
            H1(false);
            return;
        }
        int iA1 = A1();
        int iB1 = B1();
        int iC1 = C1();
        int iZ1 = z1();
        int[] iArr = new int[2];
        int i15 = (i11 - iA1) - iB1;
        int i16 = this.f29428s1;
        if (i16 == 1) {
            i15 = (i13 - iC1) - iZ1;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f29410a1 == -1) {
                this.f29410a1 = 0;
            }
            if (this.f29411b1 == -1) {
                this.f29411b1 = 0;
            }
        } else {
            if (this.f29410a1 == -1) {
                this.f29410a1 = 0;
            }
            if (this.f29411b1 == -1) {
                this.f29411b1 = 0;
            }
        }
        e[] eVarArr2 = this.L0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.M0;
            if (i18 >= i14) {
                break;
            }
            if (this.L0[i18].V() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.M0) {
                e eVar = this.L0[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.V() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.f29433x1 = eVarArr;
        this.f29434y1 = i21;
        int i22 = this.f29426q1;
        if (i22 == 0) {
            q2(eVarArr, i21, this.f29428s1, i17, iArr);
        } else if (i22 == 1) {
            o2(eVarArr, i21, this.f29428s1, i17, iArr);
        } else if (i22 == 2) {
            n2(eVarArr, i21, this.f29428s1, i17, iArr);
        } else if (i22 == 3) {
            p2(eVarArr, i21, this.f29428s1, i17, iArr);
        }
        int iMin = iArr[0] + iA1 + iB1;
        int iMin2 = iArr[1] + iC1 + iZ1;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        I1(iMin, iMin2);
        l1(iMin);
        M0(iMin2);
        H1(this.M0 > 0);
    }

    public void D2(int i10) {
        this.f29427r1 = i10;
    }

    public void E2(int i10) {
        this.f29428s1 = i10;
    }

    public void F2(int i10) {
        this.f29425p1 = i10;
    }

    public void G2(float f10) {
        this.f29417h1 = f10;
    }

    public void H2(int i10) {
        this.f29423n1 = i10;
    }

    public void I2(int i10) {
        this.f29411b1 = i10;
    }

    public void J2(int i10) {
        this.f29426q1 = i10;
    }

    @Override // v.e
    public void g(s.d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = K() != null && ((f) K()).R1();
        int i10 = this.f29426q1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f29429t1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f29429t1.get(i11)).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                k2(z11);
            } else if (i10 == 3) {
                int size2 = this.f29429t1.size();
                int i12 = 0;
                while (i12 < size2) {
                    ((a) this.f29429t1.get(i12)).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f29429t1.size() > 0) {
            ((a) this.f29429t1.get(0)).d(z11, 0, true);
        }
        H1(false);
    }

    public void r2(float f10) {
        this.f29418i1 = f10;
    }

    public void s2(int i10) {
        this.f29412c1 = i10;
    }

    public void t2(float f10) {
        this.f29419j1 = f10;
    }

    public void u2(int i10) {
        this.f29413d1 = i10;
    }

    public void v2(int i10) {
        this.f29424o1 = i10;
    }

    public void w2(float f10) {
        this.f29416g1 = f10;
    }

    public void x2(int i10) {
        this.f29422m1 = i10;
    }

    public void y2(int i10) {
        this.f29410a1 = i10;
    }

    public void z2(float f10) {
        this.f29420k1 = f10;
    }
}
