package jf;

import gf.c;
import gf.l;
import gf.y;
import of.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final C0243b A;
    public static final C0243b B;
    public static final C0243b C;
    public static final C0243b D;
    public static final C0243b E;
    public static final C0243b F;
    public static final C0243b G;
    public static final C0243b H;
    public static final C0243b I;
    public static final C0243b J;
    public static final C0243b K;
    public static final C0243b L;
    public static final C0243b M;
    public static final C0243b N;
    public static final C0243b O;
    public static final C0243b P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0243b f18660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0243b f18661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0243b f18662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f18663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f18664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f18665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0243b f18666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0243b f18667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0243b f18668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0243b f18669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0243b f18670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0243b f18671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0243b f18672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0243b f18673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0243b f18674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f18675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0243b f18676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0243b f18677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0243b f18678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0243b f18679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0243b f18680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0243b f18681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0243b f18682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0243b f18683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0243b f18684y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0243b f18685z;

    /* JADX INFO: renamed from: jf.b$b, reason: collision with other inner class name */
    public static class C0243b extends d {
        public C0243b(int i10) {
            super(i10, 1);
        }

        @Override // jf.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f18687a)) != 0);
        }

        @Override // jf.b.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f18687a;
            }
            return 0;
        }
    }

    private static class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j.a[] f18686c;

        public c(int i10, j.a[] aVarArr) {
            super(i10, g(aVarArr));
            this.f18686c = aVarArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static int g(Object[] objArr) {
            if (objArr == null) {
                f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + objArr.getClass());
        }

        @Override // jf.b.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public j.a d(int i10) {
            int i11 = (1 << this.f18688b) - 1;
            int i12 = this.f18687a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (j.a aVar : this.f18686c) {
                if (aVar.getNumber() == i13) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // jf.b.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(j.a aVar) {
            return aVar.getNumber() << this.f18687a;
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18688b;

        public static d a(d dVar, j.a[] aVarArr) {
            return new c(dVar.f18687a + dVar.f18688b, aVarArr);
        }

        public static C0243b b(d dVar) {
            return new C0243b(dVar.f18687a + dVar.f18688b);
        }

        public static C0243b c() {
            return new C0243b(0);
        }

        public abstract Object d(int i10);

        public abstract int e(Object obj);

        private d(int i10, int i11) {
            this.f18687a = i10;
            this.f18688b = i11;
        }
    }

    static {
        C0243b c0243bC = d.c();
        f18660a = c0243bC;
        f18661b = d.b(c0243bC);
        C0243b c0243bC2 = d.c();
        f18662c = c0243bC2;
        d dVarA = d.a(c0243bC2, y.values());
        f18663d = dVarA;
        d dVarA2 = d.a(dVarA, l.values());
        f18664e = dVarA2;
        d dVarA3 = d.a(dVarA2, c.EnumC0201c.values());
        f18665f = dVarA3;
        C0243b c0243bB = d.b(dVarA3);
        f18666g = c0243bB;
        C0243b c0243bB2 = d.b(c0243bB);
        f18667h = c0243bB2;
        C0243b c0243bB3 = d.b(c0243bB2);
        f18668i = c0243bB3;
        C0243b c0243bB4 = d.b(c0243bB3);
        f18669j = c0243bB4;
        C0243b c0243bB5 = d.b(c0243bB4);
        f18670k = c0243bB5;
        C0243b c0243bB6 = d.b(c0243bB5);
        f18671l = c0243bB6;
        f18672m = d.b(c0243bB6);
        C0243b c0243bB7 = d.b(dVarA);
        f18673n = c0243bB7;
        f18674o = d.b(c0243bB7);
        d dVarA4 = d.a(dVarA2, gf.k.values());
        f18675p = dVarA4;
        C0243b c0243bB8 = d.b(dVarA4);
        f18676q = c0243bB8;
        C0243b c0243bB9 = d.b(c0243bB8);
        f18677r = c0243bB9;
        C0243b c0243bB10 = d.b(c0243bB9);
        f18678s = c0243bB10;
        C0243b c0243bB11 = d.b(c0243bB10);
        f18679t = c0243bB11;
        C0243b c0243bB12 = d.b(c0243bB11);
        f18680u = c0243bB12;
        C0243b c0243bB13 = d.b(c0243bB12);
        f18681v = c0243bB13;
        C0243b c0243bB14 = d.b(c0243bB13);
        f18682w = c0243bB14;
        f18683x = d.b(c0243bB14);
        C0243b c0243bB15 = d.b(dVarA4);
        f18684y = c0243bB15;
        C0243b c0243bB16 = d.b(c0243bB15);
        f18685z = c0243bB16;
        C0243b c0243bB17 = d.b(c0243bB16);
        A = c0243bB17;
        C0243b c0243bB18 = d.b(c0243bB17);
        B = c0243bB18;
        C0243b c0243bB19 = d.b(c0243bB18);
        C = c0243bB19;
        C0243b c0243bB20 = d.b(c0243bB19);
        D = c0243bB20;
        C0243b c0243bB21 = d.b(c0243bB20);
        E = c0243bB21;
        C0243b c0243bB22 = d.b(c0243bB21);
        F = c0243bB22;
        G = d.b(c0243bB22);
        C0243b c0243bB23 = d.b(c0243bC2);
        H = c0243bB23;
        C0243b c0243bB24 = d.b(c0243bB23);
        I = c0243bB24;
        J = d.b(c0243bB24);
        C0243b c0243bB25 = d.b(dVarA2);
        K = c0243bB25;
        C0243b c0243bB26 = d.b(c0243bB25);
        L = c0243bB26;
        M = d.b(c0243bB26);
        C0243b c0243bC3 = d.c();
        N = c0243bC3;
        O = d.b(c0243bC3);
        P = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.b.a(int):void");
    }

    public static int b(boolean z10, y yVar, l lVar, boolean z11, boolean z12, boolean z13) {
        if (yVar == null) {
            a(10);
        }
        if (lVar == null) {
            a(11);
        }
        return f18662c.e(Boolean.valueOf(z10)) | f18664e.e(lVar) | f18663d.e(yVar) | K.e(Boolean.valueOf(z11)) | L.e(Boolean.valueOf(z12)) | M.e(Boolean.valueOf(z13));
    }
}
