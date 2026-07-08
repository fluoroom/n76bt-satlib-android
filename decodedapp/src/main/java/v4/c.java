package v4;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[][] f29732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f29733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[][] f29734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[][] f29735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f29736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[][] f29737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29749s;

    public c() {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 3, 2);
        this.f29732b = iArr;
        this.f29733c = new boolean[]{true, true, true};
        this.f29734d = (int[][]) Array.newInstance((Class<?>) cls, 3, 16);
        this.f29735e = (int[][]) Array.newInstance((Class<?>) cls, 3, 16);
        this.f29736f = new int[10];
        this.f29737g = (int[][]) Array.newInstance((Class<?>) cls, 3, 16);
        int[] iArr2 = iArr[0];
        iArr2[0] = 136;
        iArr2[1] = 174;
        int[] iArr3 = iArr[1];
        iArr3[0] = 200;
        iArr3[1] = 260;
        int[] iArr4 = iArr[2];
        iArr4[0] = 400;
        iArr4[1] = 480;
        for (int i10 = 0; i10 < this.f29735e.length; i10++) {
            int i11 = 0;
            while (true) {
                int[] iArr5 = this.f29735e[i10];
                if (i11 < iArr5.length) {
                    iArr5[i11] = 30;
                    i11++;
                }
            }
        }
        int i12 = 0;
        while (true) {
            int[][] iArr6 = this.f29734d;
            if (i12 >= iArr6.length) {
                System.arraycopy(new int[]{9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 12, 13, 15, 15, 15, 15}, 0, iArr6[1], 0, 16);
                System.arraycopy(new int[]{0, 20, 21, 22, 23, 24, 27, 30, 33, 35}, 0, this.f29736f, 0, 10);
                System.arraycopy(new int[]{8, 5, 5, 5, 5, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0}, 0, this.f29737g[0], 0, 16);
                System.arraycopy(new int[]{1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0, this.f29737g[0], 0, 16);
                System.arraycopy(new int[]{1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0, this.f29737g[0], 0, 16);
                this.f29738h = 9;
                this.f29739i = 15;
                this.f29740j = 15;
                this.f29741k = 15;
                this.f29742l = 38;
                this.f29743m = 15;
                this.f29744n = 36;
                this.f29745o = 12;
                this.f29746p = 64;
                this.f29747q = 57;
                this.f29748r = 2;
                this.f29749s = 2;
                return;
            }
            int i13 = 0;
            while (true) {
                int[] iArr7 = this.f29735e[i12];
                if (i13 < iArr7.length) {
                    iArr7[i13] = 5;
                    i13++;
                }
            }
            i12++;
        }
    }

    public byte[] a() {
        byte[] bArr = new byte[152];
        for (int i10 = 0; i10 < 152; i10++) {
            bArr[i10] = 0;
        }
        a6.v vVar = new a6.v(bArr);
        for (int i11 = 0; i11 < this.f29732b.length; i11++) {
            vVar.p(this.f29733c[i11]);
            vVar.n(this.f29732b[i11][0], 15);
            vVar.n(this.f29732b[i11][1], 16);
        }
        for (int[] iArr : this.f29734d) {
            for (int i12 : iArr) {
                vVar.n(i12, 8);
            }
        }
        for (int[] iArr2 : this.f29735e) {
            for (int i13 : iArr2) {
                vVar.n(i13, 8);
            }
        }
        for (int i14 : this.f29736f) {
            vVar.n(i14, 8);
        }
        for (int[] iArr3 : this.f29737g) {
            for (int i15 : iArr3) {
                vVar.n(i15, 4);
            }
        }
        vVar.n(this.f29738h, 4);
        vVar.n(this.f29739i, 4);
        vVar.n(this.f29740j, 4);
        vVar.n(this.f29741k, 4);
        vVar.n(this.f29742l, 10);
        vVar.n(this.f29743m, 6);
        vVar.n(this.f29744n, 10);
        vVar.n(this.f29745o, 6);
        vVar.n(this.f29746p, 8);
        vVar.n(this.f29747q, 8);
        vVar.n(this.f29748r, 4);
        vVar.n(this.f29749s, 4);
        return bArr;
    }

    public c(byte[] bArr, int i10, int i11) throws w5.g {
        Class cls = Integer.TYPE;
        this.f29732b = (int[][]) Array.newInstance((Class<?>) cls, 3, 2);
        this.f29733c = new boolean[3];
        this.f29734d = (int[][]) Array.newInstance((Class<?>) cls, 3, 16);
        this.f29735e = (int[][]) Array.newInstance((Class<?>) cls, 3, 16);
        this.f29736f = new int[10];
        this.f29737g = (int[][]) Array.newInstance((Class<?>) cls, 3, 16);
        if (i10 + 152 <= i11) {
            a6.v vVar = new a6.v(bArr, i10 * 8);
            for (int i12 = 0; i12 < this.f29732b.length; i12++) {
                this.f29733c[i12] = vVar.c();
                this.f29732b[i12][0] = vVar.i(15) & 1023;
                this.f29732b[i12][1] = vVar.i(16) & 1023;
            }
            for (int[] iArr : this.f29734d) {
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    iArr[i13] = vVar.i(8);
                }
            }
            for (int[] iArr2 : this.f29735e) {
                for (int i14 = 0; i14 < iArr2.length; i14++) {
                    iArr2[i14] = vVar.i(8);
                }
            }
            int i15 = 0;
            while (true) {
                int[] iArr3 = this.f29736f;
                if (i15 >= iArr3.length) {
                    break;
                }
                iArr3[i15] = vVar.i(8);
                i15++;
            }
            for (int[] iArr4 : this.f29737g) {
                for (int i16 = 0; i16 < iArr4.length; i16++) {
                    iArr4[i16] = vVar.i(4);
                }
            }
            this.f29738h = vVar.i(4);
            this.f29739i = vVar.i(4);
            this.f29740j = vVar.i(4);
            this.f29741k = vVar.i(4);
            this.f29742l = vVar.i(10);
            this.f29743m = vVar.i(6);
            this.f29744n = vVar.i(10);
            this.f29745o = vVar.i(6);
            this.f29746p = vVar.i(8);
            this.f29747q = vVar.i(8);
            this.f29748r = vVar.i(4);
            this.f29749s = vVar.i(4);
            return;
        }
        throw new w5.g("长度不够");
    }
}
