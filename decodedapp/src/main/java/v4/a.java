package v4;

/* JADX INFO: loaded from: classes.dex */
public class a extends e0 {
    public int A;
    public final int[] B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final int[] G;
    public final int[] H;
    public final C0405a[] I;
    public final C0405a J;
    public final int[] K;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29619h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29622t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29623u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f29624v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f29625w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f29626x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f29627y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f29628z;

    /* JADX INFO: renamed from: v4.a$a, reason: collision with other inner class name */
    public static class C0405a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b[] f29629a = new b[4];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f29630b = new b[5];

        C0405a() {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                b[] bVarArr = this.f29629a;
                if (i11 >= bVarArr.length) {
                    break;
                }
                bVarArr[i11] = new b();
                i11++;
            }
            while (true) {
                b[] bVarArr2 = this.f29630b;
                if (i10 >= bVarArr2.length) {
                    return;
                }
                bVarArr2[i10] = new b();
                i10++;
            }
        }

        public int a(int i10) {
            return this.f29630b[i10 / 4].f29631a[i10 % 4];
        }

        public int b(int i10) {
            return this.f29629a[i10 / 4].f29631a[i10 % 4];
        }

        public void c(a6.v vVar) {
            for (b bVar : this.f29629a) {
                bVar.a(vVar);
            }
            for (b bVar2 : this.f29630b) {
                bVar2.a(vVar);
            }
        }

        public void d(int i10, int i11) {
            this.f29630b[i10 / 4].f29631a[i10 % 4] = i11;
        }

        public void e(int i10, int i11) {
            this.f29629a[i10 / 4].f29631a[i10 % 4] = i11;
        }

        public void f(a6.v vVar) {
            for (b bVar : this.f29629a) {
                bVar.b(vVar);
            }
            for (b bVar2 : this.f29630b) {
                bVar2.b(vVar);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f29631a = new int[4];

        public void a(a6.v vVar) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f29631a;
                if (i10 >= iArr.length) {
                    return;
                }
                iArr[i10] = vVar.i(4);
                i10++;
            }
        }

        public void b(a6.v vVar) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f29631a;
                if (i10 >= iArr.length) {
                    return;
                }
                vVar.n(iArr[i10], 4);
                i10++;
            }
        }
    }

    public a(int i10) {
        super(i10);
        this.B = new int[3];
        this.G = new int[3];
        this.H = new int[10];
        this.I = new C0405a[3];
        this.J = new C0405a();
        this.K = new int[9];
        try {
            int[][] iArr = this.f29846a;
            int[] iArr2 = iArr[0];
            iArr2[0] = 136;
            iArr2[1] = 174;
            int[] iArr3 = iArr[1];
            iArr3[0] = 200;
            iArr3[1] = 260;
            int[] iArr4 = iArr[2];
            iArr4[0] = 400;
            iArr4[1] = 480;
            boolean[] zArr = this.f29848c;
            zArr[0] = true;
            zArr[1] = true;
            zArr[2] = true;
        } catch (Exception unused) {
        }
        int i11 = 0;
        while (true) {
            C0405a[] c0405aArr = this.I;
            if (i11 >= c0405aArr.length) {
                System.arraycopy(new int[]{0, 20, 21, 22, 23, 24, 27, 30, 33, 35}, 0, this.H, 0, 10);
                this.f29618g = 9;
                this.f29619h = 15;
                this.f29620r = 15;
                this.f29621s = 15;
                this.f29622t = 38;
                this.f29623u = 15;
                this.f29624v = 36;
                this.f29625w = 12;
                this.f29626x = 64;
                this.f29627y = 57;
                this.f29628z = 2;
                this.A = 2;
                this.C = 13;
                return;
            }
            c0405aArr[i11] = new C0405a();
            i11++;
        }
    }

    public static int d(int i10) {
        return ((i10 - 3) * 4) + 114;
    }

    public byte[] b() {
        byte[] bArr = new byte[d(this.f29846a.length)];
        a6.v vVar = new a6.v(bArr);
        for (int i10 = 0; i10 < this.f29846a.length; i10++) {
            vVar.p(this.f29848c[i10]);
            vVar.p(!this.f29847b[i10]);
            vVar.n(this.f29846a[i10][0], 14);
            vVar.p(this.f29850e[i10]);
            vVar.p(this.f29849d[i10]);
            vVar.n(this.f29846a[i10][1], 14);
        }
        vVar.n(this.f29618g, 4);
        vVar.n(this.f29619h, 4);
        vVar.n(this.f29620r, 4);
        vVar.n(this.f29621s, 4);
        vVar.n(this.f29622t, 10);
        vVar.n(this.f29623u, 6);
        vVar.n(this.f29624v, 10);
        vVar.n(this.f29625w, 6);
        vVar.n(this.f29626x, 8);
        vVar.n(this.f29627y, 8);
        vVar.n(this.f29628z, 4);
        vVar.n(this.A, 4);
        for (int i11 : this.B) {
            vVar.n(i11, 8);
        }
        vVar.n(this.C, 5);
        vVar.p(this.D);
        vVar.p(this.E);
        vVar.p(this.F);
        vVar.n(this.G[0], 4);
        vVar.n(this.G[1], 4);
        for (int i12 : this.H) {
            vVar.n(i12, 8);
        }
        for (C0405a c0405a : this.I) {
            c0405a.f(vVar);
        }
        this.J.f(vVar);
        for (int i13 = 0; i13 < 9; i13++) {
            vVar.n(this.K[i13], 5);
            if (i13 == 2 || i13 == 5 || i13 == 8) {
                vVar.p(false);
            }
        }
        return bArr;
    }

    public a(byte[] bArr, int i10, int i11, int i12) throws w5.g {
        this(i12);
        if (d(i12) + i10 <= i11) {
            a6.v vVar = new a6.v(bArr, i10 * 8);
            for (int i13 = 0; i13 < this.f29846a.length; i13++) {
                this.f29848c[i13] = vVar.c();
                this.f29847b[i13] = !vVar.c();
                this.f29846a[i13][0] = vVar.i(14) & 1023;
                this.f29850e[i13] = vVar.c();
                this.f29849d[i13] = vVar.c();
                this.f29846a[i13][1] = vVar.i(14) & 1023;
            }
            this.f29618g = vVar.i(4);
            this.f29619h = vVar.i(4);
            this.f29620r = vVar.i(4);
            this.f29621s = vVar.i(4);
            this.f29622t = vVar.i(10);
            this.f29623u = vVar.i(6);
            this.f29624v = vVar.i(10);
            this.f29625w = vVar.i(6);
            this.f29626x = vVar.i(8);
            this.f29627y = vVar.i(8);
            this.f29628z = vVar.i(4);
            this.A = vVar.i(4);
            int i14 = 0;
            while (true) {
                int[] iArr = this.B;
                if (i14 >= iArr.length) {
                    break;
                }
                iArr[i14] = vVar.i(8);
                i14++;
            }
            this.C = vVar.i(5);
            this.D = vVar.c();
            this.E = vVar.c();
            this.F = vVar.c();
            this.G[0] = vVar.i(4);
            this.G[1] = vVar.i(4);
            int i15 = 0;
            while (true) {
                int[] iArr2 = this.H;
                if (i15 >= iArr2.length) {
                    break;
                }
                iArr2[i15] = vVar.i(8);
                i15++;
            }
            for (C0405a c0405a : this.I) {
                c0405a.c(vVar);
            }
            this.J.c(vVar);
            for (int i16 = 0; i16 < 9; i16++) {
                this.K[i16] = vVar.i(5);
                if (i16 == 2 || i16 == 5 || i16 == 8) {
                    vVar.c();
                }
            }
            return;
        }
        throw new w5.g("长度不够");
    }
}
