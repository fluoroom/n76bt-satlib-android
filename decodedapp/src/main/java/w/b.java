package w;

import java.util.ArrayList;
import v.d;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a */
    private final ArrayList f30880a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private a f30881b = new a();

    /* JADX INFO: renamed from: c */
    private v.f f30882c;

    public static class a {

        /* JADX INFO: renamed from: k */
        public static int f30883k = 0;

        /* JADX INFO: renamed from: l */
        public static int f30884l = 1;

        /* JADX INFO: renamed from: m */
        public static int f30885m = 2;

        /* JADX INFO: renamed from: a */
        public e.b f30886a;

        /* JADX INFO: renamed from: b */
        public e.b f30887b;

        /* JADX INFO: renamed from: c */
        public int f30888c;

        /* JADX INFO: renamed from: d */
        public int f30889d;

        /* JADX INFO: renamed from: e */
        public int f30890e;

        /* JADX INFO: renamed from: f */
        public int f30891f;

        /* JADX INFO: renamed from: g */
        public int f30892g;

        /* JADX INFO: renamed from: h */
        public boolean f30893h;

        /* JADX INFO: renamed from: i */
        public boolean f30894i;

        /* JADX INFO: renamed from: j */
        public int f30895j;
    }

    /* JADX INFO: renamed from: w.b$b */
    public interface InterfaceC0410b {
        void a();

        void b(v.e eVar, a aVar);
    }

    public b(v.f fVar) {
        this.f30882c = fVar;
    }

    private boolean a(InterfaceC0410b interfaceC0410b, v.e eVar, int i10) {
        this.f30881b.f30886a = eVar.A();
        this.f30881b.f30887b = eVar.T();
        this.f30881b.f30888c = eVar.W();
        this.f30881b.f30889d = eVar.x();
        a aVar = this.f30881b;
        aVar.f30894i = false;
        aVar.f30895j = i10;
        e.b bVar = aVar.f30886a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f30887b == bVar2;
        boolean z12 = z10 && eVar.f29343d0 > 0.0f;
        boolean z13 = z11 && eVar.f29343d0 > 0.0f;
        if (z12 && eVar.f29384y[0] == 4) {
            aVar.f30886a = e.b.FIXED;
        }
        if (z13 && eVar.f29384y[1] == 4) {
            aVar.f30887b = e.b.FIXED;
        }
        interfaceC0410b.b(eVar, aVar);
        eVar.l1(this.f30881b.f30890e);
        eVar.M0(this.f30881b.f30891f);
        eVar.L0(this.f30881b.f30893h);
        eVar.B0(this.f30881b.f30892g);
        a aVar2 = this.f30881b;
        aVar2.f30895j = a.f30883k;
        return aVar2.f30894i;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:102:0x0061, B:104:0x0067, B:106:0x006b, B:124:0x0094, B:122:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(v.f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.V1(r1)
            w.b$b r2 = r13.K1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            v.e r5 = (v.e) r5
            boolean r6 = r5 instanceof v.h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof v.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            w.l r6 = r5.f29344e
            if (r6 == 0) goto L47
            w.n r7 = r5.f29346f
            if (r7 == 0) goto L47
            w.g r6 = r6.f30963e
            boolean r6 = r6.f30916j
            if (r6 == 0) goto L47
            w.g r6 = r7.f30963e
            boolean r6 = r6.f30916j
            if (r6 == 0) goto L47
            goto La0
        L47:
            v.e$b r6 = r5.u(r3)
            r7 = 1
            v.e$b r8 = r5.u(r7)
            v.e$b r9 = v.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f29380w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f29382x
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.V1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof v.l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f29380w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f29382x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.i0()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f29343d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = w.b.a.f30883k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b.b(v.f):void");
    }

    private void c(v.f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int I = fVar.I();
        int iH = fVar.H();
        fVar.b1(0);
        fVar.a1(0);
        fVar.l1(i11);
        fVar.M0(i12);
        fVar.b1(I);
        fVar.a1(iH);
        this.f30882c.Z1(i10);
        this.f30882c.t1();
    }

    public long d(v.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zI1;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22;
        int i23;
        boolean z11;
        b bVar = this;
        InterfaceC0410b interfaceC0410bK1 = fVar.K1();
        int size = fVar.L0.size();
        int iW = fVar.W();
        int iX = fVar.x();
        boolean zB = v.k.b(i10, 128);
        boolean z12 = zB || v.k.b(i10, 64);
        if (z12) {
            for (int i24 = 0; i24 < size; i24++) {
                v.e eVar = (v.e) fVar.L0.get(i24);
                e.b bVarA = eVar.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z13 = (bVarA == bVar2) && (eVar.T() == bVar2) && eVar.v() > 0.0f;
                if ((eVar.i0() && z13) || ((eVar.k0() && z13) || (eVar instanceof v.l) || eVar.i0() || eVar.k0())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            boolean z14 = s.d.f26231s;
        }
        boolean z15 = z12 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        if (z15) {
            int iMin = Math.min(fVar.G(), i14);
            int iMin2 = Math.min(fVar.F(), i16);
            if (i13 == 1073741824 && fVar.W() != iMin) {
                fVar.l1(iMin);
                fVar.O1();
            }
            if (i15 == 1073741824 && fVar.x() != iMin2) {
                fVar.M0(iMin2);
                fVar.O1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zI1 = fVar.G1(zB);
                i19 = 2;
            } else {
                boolean zH1 = fVar.H1(zB);
                if (i13 == 1073741824) {
                    zH1 &= fVar.I1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zI1 = fVar.I1(zB, 1) & zH1;
                    i19++;
                } else {
                    zI1 = zH1;
                }
            }
            if (zI1) {
                fVar.q1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zI1 = false;
            i19 = 0;
        }
        if (zI1 && i19 == 2) {
            return 0L;
        }
        int iL1 = fVar.L1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f30880a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, iW, iX);
            i20 = iW;
            i21 = iX;
        } else {
            i20 = iW;
            i21 = iX;
        }
        if (size2 > 0) {
            e.b bVarA2 = fVar.A();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z16 = bVarA2 == bVar3;
            boolean z17 = fVar.T() == bVar3;
            int iMax = Math.max(fVar.W(), bVar.f30882c.I());
            int iMax2 = Math.max(fVar.x(), bVar.f30882c.H());
            int i25 = 0;
            boolean zG1 = false;
            while (i25 < size2) {
                v.e eVar2 = (v.e) bVar.f30880a.get(i25);
                if (eVar2 instanceof v.l) {
                    int iW2 = eVar2.W();
                    int iX2 = eVar2.x();
                    i23 = i20;
                    boolean zA = bVar.a(interfaceC0410bK1, eVar2, a.f30884l) | zG1;
                    int iW3 = eVar2.W();
                    int iX3 = eVar2.x();
                    if (iW3 != iW2) {
                        eVar2.l1(iW3);
                        if (z16 && eVar2.M() > iMax) {
                            iMax = Math.max(iMax, eVar2.M() + eVar2.o(d.a.RIGHT).f());
                        }
                        z11 = true;
                    } else {
                        z11 = zA;
                    }
                    if (iX3 != iX2) {
                        eVar2.M0(iX3);
                        if (z17 && eVar2.r() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.r() + eVar2.o(d.a.BOTTOM).f());
                        }
                        z11 = true;
                    }
                    zG1 = z11 | ((v.l) eVar2).G1();
                } else {
                    i23 = i20;
                }
                i25++;
                i20 = i23;
            }
            int i26 = i20;
            int i27 = 0;
            while (i27 < 2) {
                int i28 = 0;
                while (i28 < size2) {
                    v.e eVar3 = (v.e) bVar.f30880a.get(i28);
                    if (((eVar3 instanceof v.i) && !(eVar3 instanceof v.l)) || (eVar3 instanceof v.h) || eVar3.V() == 8 || ((z15 && eVar3.f29344e.f30963e.f30916j && eVar3.f29346f.f30963e.f30916j) || (eVar3 instanceof v.l))) {
                        z10 = z15;
                        i22 = size2;
                    } else {
                        int iW4 = eVar3.W();
                        int iX4 = eVar3.x();
                        z10 = z15;
                        int iP = eVar3.p();
                        int i29 = a.f30884l;
                        i22 = size2;
                        if (i27 == 1) {
                            i29 = a.f30885m;
                        }
                        boolean zA2 = bVar.a(interfaceC0410bK1, eVar3, i29) | zG1;
                        int iW5 = eVar3.W();
                        int iX5 = eVar3.x();
                        if (iW5 != iW4) {
                            eVar3.l1(iW5);
                            if (z16 && eVar3.M() > iMax) {
                                iMax = Math.max(iMax, eVar3.M() + eVar3.o(d.a.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iX5 != iX4) {
                            eVar3.M0(iX5);
                            if (z17 && eVar3.r() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.r() + eVar3.o(d.a.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zG1 = (!eVar3.Z() || iP == eVar3.p()) ? zA2 : true;
                    }
                    i28++;
                    bVar = this;
                    size2 = i22;
                    z15 = z10;
                }
                boolean z18 = z15;
                int i30 = size2;
                if (!zG1) {
                    break;
                }
                i27++;
                c(fVar, "intermediate pass", i27, i26, i21);
                bVar = this;
                size2 = i30;
                z15 = z18;
                zG1 = false;
            }
        }
        fVar.Y1(iL1);
        return 0L;
    }

    public void e(v.f fVar) {
        this.f30880a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            v.e eVar = (v.e) fVar.L0.get(i10);
            e.b bVarA = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || eVar.T() == bVar) {
                this.f30880a.add(eVar);
            }
        }
        fVar.O1();
    }
}
