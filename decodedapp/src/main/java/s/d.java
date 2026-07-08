package s;

import com.facebook.stetho.websocket.CloseCodes;
import java.util.Arrays;
import java.util.HashMap;
import s.i;
import v.d;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f26231s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f26232t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f26233u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f26234v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f26235w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f26236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f26237y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f26242e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final c f26252o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f26255r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26238a = CloseCodes.NORMAL_CLOSURE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26239b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26240c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap f26241d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26243f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26244g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26246i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26247j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean[] f26248k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f26249l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f26250m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26251n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i[] f26253p = new i[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f26254q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    s.b[] f26245h = new s.b[32];

    interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    static class b extends s.b {
        b(c cVar) {
            this.f26225e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f26252o = cVar;
        this.f26242e = new h(cVar);
        if (f26235w) {
            this.f26255r = new b(cVar);
        } else {
            this.f26255r = new s.b(cVar);
        }
    }

    private int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f26249l; i10++) {
            this.f26248k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f26249l * 2) {
                if (aVar.getKey() != null) {
                    this.f26248k[aVar.getKey().f26270c] = true;
                }
                i iVarB = aVar.b(this, this.f26248k);
                if (iVarB != null) {
                    boolean[] zArr = this.f26248k;
                    int i12 = iVarB.f26270c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarB != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f26250m; i14++) {
                        s.b bVar = this.f26245h[i14];
                        if (bVar.f26221a.f26277s != i.a.UNRESTRICTED && !bVar.f26226f && bVar.t(iVarB)) {
                            float f11 = bVar.f26225e.f(iVarB);
                            if (f11 < 0.0f) {
                                float f12 = (-bVar.f26222b) / f11;
                                if (f12 < f10) {
                                    i13 = i14;
                                    f10 = f12;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        s.b bVar2 = this.f26245h[i13];
                        bVar2.f26221a.f26271d = -1;
                        bVar2.x(iVarB);
                        i iVar = bVar2.f26221a;
                        iVar.f26271d = i13;
                        iVar.j(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    private void D() {
        int i10 = 0;
        if (f26235w) {
            while (i10 < this.f26250m) {
                s.b bVar = this.f26245h[i10];
                if (bVar != null) {
                    this.f26252o.f26227a.a(bVar);
                }
                this.f26245h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f26250m) {
            s.b bVar2 = this.f26245h[i10];
            if (bVar2 != null) {
                this.f26252o.f26228b.a(bVar2);
            }
            this.f26245h[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f26252o.f26229c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.i(aVar, str);
        } else {
            iVar.g();
            iVar.i(aVar, str);
        }
        int i10 = this.f26254q;
        int i11 = this.f26238a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f26238a = i12;
            this.f26253p = (i[]) Arrays.copyOf(this.f26253p, i12);
        }
        i[] iVarArr = this.f26253p;
        int i13 = this.f26254q;
        this.f26254q = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private void l(s.b bVar) {
        int i10;
        if (f26233u && bVar.f26226f) {
            bVar.f26221a.h(this, bVar.f26222b);
        } else {
            s.b[] bVarArr = this.f26245h;
            int i11 = this.f26250m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f26221a;
            iVar.f26271d = i11;
            this.f26250m = i11 + 1;
            iVar.j(this, bVar);
        }
        if (f26233u && this.f26239b) {
            int i12 = 0;
            while (i12 < this.f26250m) {
                if (this.f26245h[i12] == null) {
                    System.out.println("WTF");
                }
                s.b bVar2 = this.f26245h[i12];
                if (bVar2 != null && bVar2.f26226f) {
                    bVar2.f26221a.h(this, bVar2.f26222b);
                    if (f26235w) {
                        this.f26252o.f26227a.a(bVar2);
                    } else {
                        this.f26252o.f26228b.a(bVar2);
                    }
                    this.f26245h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f26250m;
                        if (i13 >= i10) {
                            break;
                        }
                        s.b[] bVarArr2 = this.f26245h;
                        int i15 = i13 - 1;
                        s.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f26221a;
                        if (iVar2.f26271d == i13) {
                            iVar2.f26271d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f26245h[i14] = null;
                    }
                    this.f26250m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f26239b = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f26250m; i10++) {
            s.b bVar = this.f26245h[i10];
            bVar.f26221a.f26273f = bVar.f26222b;
        }
    }

    public static s.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f26250m; i10++) {
            s.b bVar = this.f26245h[i10];
            if (bVar.f26221a.f26277s != i.a.UNRESTRICTED) {
                float f10 = 0.0f;
                if (bVar.f26222b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f26250m) {
                                break;
                            }
                            s.b bVar2 = this.f26245h[i12];
                            if (bVar2.f26221a.f26277s != i.a.UNRESTRICTED && !bVar2.f26226f && bVar2.f26222b < f10) {
                                if (f26234v) {
                                    int iB = bVar2.f26225e.b();
                                    int i16 = 0;
                                    while (i16 < iB) {
                                        i iVarE = bVar2.f26225e.e(i16);
                                        float f12 = bVar2.f26225e.f(iVarE);
                                        if (f12 > f10) {
                                            for (int i17 = 0; i17 < 9; i17++) {
                                                float f13 = iVarE.f26275h[i17] / f12;
                                                if ((f13 < f11 && i17 == i15) || i17 > i15) {
                                                    i15 = i17;
                                                    i14 = iVarE.f26270c;
                                                    i13 = i12;
                                                    f11 = f13;
                                                }
                                            }
                                        }
                                        i16++;
                                        f10 = 0.0f;
                                    }
                                } else {
                                    for (int i18 = 1; i18 < this.f26249l; i18++) {
                                        i iVar = this.f26252o.f26230d[i18];
                                        float f14 = bVar2.f26225e.f(iVar);
                                        if (f14 > 0.0f) {
                                            for (int i19 = 0; i19 < 9; i19++) {
                                                float f15 = iVar.f26275h[i19] / f14;
                                                if ((f15 < f11 && i19 == i15) || i19 > i15) {
                                                    i15 = i19;
                                                    i13 = i12;
                                                    i14 = i18;
                                                    f11 = f15;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f10 = 0.0f;
                        }
                        if (i13 != -1) {
                            s.b bVar3 = this.f26245h[i13];
                            bVar3.f26221a.f26271d = -1;
                            bVar3.x(this.f26252o.f26230d[i14]);
                            i iVar2 = bVar3.f26221a;
                            iVar2.f26271d = i13;
                            iVar2.j(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f26249l / 2) {
                            z10 = true;
                        }
                        f10 = 0.0f;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public static e x() {
        return null;
    }

    private void z() {
        int i10 = this.f26243f * 2;
        this.f26243f = i10;
        this.f26245h = (s.b[]) Arrays.copyOf(this.f26245h, i10);
        c cVar = this.f26252o;
        cVar.f26230d = (i[]) Arrays.copyOf(cVar.f26230d, this.f26243f);
        int i11 = this.f26243f;
        this.f26248k = new boolean[i11];
        this.f26244g = i11;
        this.f26251n = i11;
    }

    public void A() {
        if (this.f26242e.isEmpty()) {
            n();
            return;
        }
        if (!this.f26246i && !this.f26247j) {
            B(this.f26242e);
            return;
        }
        for (int i10 = 0; i10 < this.f26250m; i10++) {
            if (!this.f26245h[i10].f26226f) {
                B(this.f26242e);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f26252o;
            i[] iVarArr = cVar.f26230d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.g();
            }
            i10++;
        }
        cVar.f26229c.c(this.f26253p, this.f26254q);
        this.f26254q = 0;
        Arrays.fill(this.f26252o.f26230d, (Object) null);
        HashMap map = this.f26241d;
        if (map != null) {
            map.clear();
        }
        this.f26240c = 0;
        this.f26242e.clear();
        this.f26249l = 1;
        for (int i11 = 0; i11 < this.f26250m; i11++) {
            s.b bVar = this.f26245h[i11];
            if (bVar != null) {
                bVar.f26223c = false;
            }
        }
        D();
        this.f26250m = 0;
        if (f26235w) {
            this.f26255r = new b(this.f26252o);
        } else {
            this.f26255r = new s.b(this.f26252o);
        }
    }

    public void b(v.e eVar, v.e eVar2, float f10, int i10) {
        d.a aVar = d.a.LEFT;
        i iVarQ = q(eVar.o(aVar));
        d.a aVar2 = d.a.TOP;
        i iVarQ2 = q(eVar.o(aVar2));
        d.a aVar3 = d.a.RIGHT;
        i iVarQ3 = q(eVar.o(aVar3));
        d.a aVar4 = d.a.BOTTOM;
        i iVarQ4 = q(eVar.o(aVar4));
        i iVarQ5 = q(eVar2.o(aVar));
        i iVarQ6 = q(eVar2.o(aVar2));
        i iVarQ7 = q(eVar2.o(aVar3));
        i iVarQ8 = q(eVar2.o(aVar4));
        s.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        s.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        s.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(s.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L8a
        L4:
            int r0 = r5.f26250m
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f26251n
            if (r0 >= r2) goto L13
            int r0 = r5.f26249l
            int r0 = r0 + r1
            int r2 = r5.f26244g
            if (r0 < r2) goto L16
        L13:
            r5.z()
        L16:
            boolean r0 = r6.f26226f
            r2 = 0
            if (r0 != 0) goto L85
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L8a
        L25:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7c
            s.i r0 = r5.p()
            r6.f26221a = r0
            int r3 = r5.f26250m
            r5.l(r6)
            int r4 = r5.f26250m
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            s.d$a r2 = r5.f26255r
            r2.c(r6)
            s.d$a r2 = r5.f26255r
            r5.C(r2, r1)
            int r2 = r0.f26271d
            r3 = -1
            if (r2 != r3) goto L7d
            s.i r2 = r6.f26221a
            if (r2 != r0) goto L5a
            s.i r0 = r6.v(r0)
            if (r0 == 0) goto L5a
            r6.x(r0)
        L5a:
            boolean r0 = r6.f26226f
            if (r0 != 0) goto L63
            s.i r0 = r6.f26221a
            r0.j(r5, r6)
        L63:
            boolean r0 = s.d.f26235w
            if (r0 == 0) goto L6f
            s.c r0 = r5.f26252o
            s.f r0 = r0.f26227a
            r0.a(r6)
            goto L76
        L6f:
            s.c r0 = r5.f26252o
            s.f r0 = r0.f26228b
            r0.a(r6)
        L76:
            int r0 = r5.f26250m
            int r0 = r0 - r1
            r5.f26250m = r0
            goto L7d
        L7c:
            r1 = 0
        L7d:
            boolean r0 = r6.s()
            if (r0 != 0) goto L84
            goto L8a
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.l(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.d(s.b):void");
    }

    public s.b e(i iVar, i iVar2, int i10, int i11) {
        if (f26232t && i11 == 8 && iVar2.f26274g && iVar.f26271d == -1) {
            iVar.h(this, iVar2.f26273f + i10);
            return null;
        }
        s.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        if (f26232t && iVar.f26271d == -1) {
            float f10 = i10;
            iVar.h(this, f10);
            for (int i11 = 0; i11 < this.f26240c + 1; i11++) {
                i iVar2 = this.f26252o.f26230d[i11];
                if (iVar2 != null && iVar2.f26281w && iVar2.f26282x == iVar.f26270c) {
                    iVar2.h(this, iVar2.f26283y + f10);
                }
            }
            return;
        }
        int i12 = iVar.f26271d;
        if (i12 == -1) {
            s.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        s.b bVar = this.f26245h[i12];
        if (bVar.f26226f) {
            bVar.f26222b = i10;
            return;
        }
        if (bVar.f26225e.b() == 0) {
            bVar.f26226f = true;
            bVar.f26222b = i10;
        } else {
            s.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        s.b bVarR = r();
        i iVarT = t();
        iVarT.f26272e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        s.b bVarR = r();
        i iVarT = t();
        iVarT.f26272e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f26225e.f(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        s.b bVarR = r();
        i iVarT = t();
        iVarT.f26272e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        s.b bVarR = r();
        i iVarT = t();
        iVarT.f26272e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f26225e.f(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        s.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    void m(s.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f26249l + 1 >= this.f26244g) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f26240c + 1;
        this.f26240c = i11;
        this.f26249l++;
        iVarA.f26270c = i11;
        iVarA.f26272e = i10;
        this.f26252o.f26230d[i11] = iVarA;
        this.f26242e.a(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f26249l + 1 >= this.f26244g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f26240c + 1;
        this.f26240c = i10;
        this.f26249l++;
        iVarA.f26270c = i10;
        this.f26252o.f26230d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f26249l + 1 >= this.f26244g) {
            z();
        }
        if (obj instanceof v.d) {
            v.d dVar = (v.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f26252o);
                iVarI = dVar.i();
            }
            int i10 = iVarI.f26270c;
            if (i10 != -1 && i10 <= this.f26240c && this.f26252o.f26230d[i10] != null) {
                return iVarI;
            }
            if (i10 != -1) {
                iVarI.g();
            }
            int i11 = this.f26240c + 1;
            this.f26240c = i11;
            this.f26249l++;
            iVarI.f26270c = i11;
            iVarI.f26277s = i.a.UNRESTRICTED;
            this.f26252o.f26230d[i11] = iVarI;
        }
        return iVarI;
    }

    public s.b r() {
        s.b bVar;
        if (f26235w) {
            bVar = (s.b) this.f26252o.f26227a.b();
            if (bVar == null) {
                bVar = new b(this.f26252o);
                f26237y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = (s.b) this.f26252o.f26228b.b();
            if (bVar == null) {
                bVar = new s.b(this.f26252o);
                f26236x++;
            } else {
                bVar.y();
            }
        }
        i.e();
        return bVar;
    }

    public i t() {
        if (this.f26249l + 1 >= this.f26244g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f26240c + 1;
        this.f26240c = i10;
        this.f26249l++;
        iVarA.f26270c = i10;
        this.f26252o.f26230d[i10] = iVarA;
        return iVarA;
    }

    public c w() {
        return this.f26252o;
    }

    public int y(Object obj) {
        i iVarI = ((v.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f26273f + 0.5f);
        }
        return 0;
    }

    public void v(e eVar) {
    }
}
