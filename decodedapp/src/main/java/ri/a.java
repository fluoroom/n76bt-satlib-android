package ri;

import aj.m;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: j */
    private static AtomicReference f26078j = new AtomicReference(null);

    /* JADX INFO: renamed from: a */
    private final int f26079a;

    /* JADX INFO: renamed from: b */
    private final int f26080b;

    /* JADX INFO: renamed from: c */
    private final int[][] f26081c;

    /* JADX INFO: renamed from: d */
    private final int[][] f26082d;

    /* JADX INFO: renamed from: e */
    private final int[] f26083e;

    /* JADX INFO: renamed from: f */
    private final int[] f26084f;

    /* JADX INFO: renamed from: g */
    private final b[][] f26085g;

    /* JADX INFO: renamed from: h */
    private final c[][] f26086h;

    /* JADX INFO: renamed from: i */
    private final List f26087i;

    /* JADX INFO: renamed from: ri.a$a */
    private static abstract class AbstractC0360a {

        /* JADX INFO: renamed from: a */
        private int f26088a;

        AbstractC0360a(int i10) {
            this.f26088a = i10;
        }

        public int a() {
            return this.f26088a;
        }

        protected abstract boolean b(AbstractC0360a abstractC0360a);

        public void c(int i10) {
            this.f26088a = i10;
        }
    }

    private static class b extends AbstractC0360a {

        /* JADX INFO: renamed from: b */
        private final int f26089b;

        /* JADX INFO: renamed from: c */
        private final int f26090c;

        b(int i10, int i11, int i12) {
            super(i10);
            this.f26089b = i11;
            this.f26090c = i12;
        }

        @Override // ri.a.AbstractC0360a
        /* JADX INFO: renamed from: f */
        public boolean b(b bVar) {
            return this.f26089b == bVar.f26089b && this.f26090c == bVar.f26090c;
        }
    }

    private static class c extends AbstractC0360a {

        /* JADX INFO: renamed from: b */
        private final int f26091b;

        /* JADX INFO: renamed from: c */
        private final int[] f26092c;

        c(int i10, int i11, int[] iArr) {
            super(i10);
            this.f26091b = i11;
            this.f26092c = (int[]) iArr.clone();
        }

        @Override // ri.a.AbstractC0360a
        /* JADX INFO: renamed from: f */
        public boolean b(c cVar) {
            if (this.f26091b != cVar.f26091b || this.f26092c.length != cVar.f26092c.length) {
                return false;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f26092c;
                if (i10 >= iArr.length) {
                    return true;
                }
                if (iArr[i10] != cVar.f26092c[i10]) {
                    return false;
                }
                i10++;
            }
        }

        public void g() {
            Arrays.sort(this.f26092c);
        }
    }

    private a(int i10, int i11, a aVar, a aVar2) {
        this.f26079a = i10;
        this.f26080b = i11;
        int[][] iArrK = k(i10, i11, aVar);
        this.f26081c = iArrK;
        int[][] iArrG = g(i10, i11, aVar, aVar2);
        this.f26082d = iArrG;
        this.f26083e = h(iArrG);
        int[] iArrI = i(i10, i11, aVar, aVar2);
        this.f26084f = iArrI;
        this.f26085g = j(i10, i11, aVar, aVar2, iArrI);
        this.f26086h = f(i10, i11, aVar, aVar2, iArrK, iArrG);
        this.f26087i = new ArrayList();
    }

    private static AbstractC0360a[] e(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC0360a abstractC0360a = (AbstractC0360a) list.get(i10);
            if (abstractC0360a.a() > 0) {
                for (int i11 = i10 + 1; i11 < list.size(); i11++) {
                    AbstractC0360a abstractC0360a2 = (AbstractC0360a) list.get(i11);
                    if (abstractC0360a.b(abstractC0360a2)) {
                        abstractC0360a.c(abstractC0360a.a() + abstractC0360a2.a());
                        abstractC0360a2.c(0);
                    }
                }
                arrayList.add(abstractC0360a);
            }
        }
        return (AbstractC0360a[]) arrayList.toArray((AbstractC0360a[]) Array.newInstance(((AbstractC0360a) list.get(0)).getClass(), arrayList.size()));
    }

    private static c[][] f(int i10, int i11, a aVar, a aVar2, int[][] iArr, int[][] iArr2) {
        int i12 = i10;
        int i13 = i11;
        a aVar3 = aVar2;
        int[][] iArr3 = iArr;
        if (i12 == 0 || i13 == 0) {
            return new c[][]{new c[]{new c(1, 0, new int[0])}};
        }
        c[][] cVarArr = aVar.f26086h;
        int length = cVarArr.length;
        int length2 = aVar3.f26086h.length;
        c[][] cVarArr2 = new c[length + length2][];
        System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
        int i14 = 0;
        while (i14 < length2) {
            ArrayList arrayList = new ArrayList();
            c[] cVarArr3 = aVar3.f26086h[i14];
            int length3 = cVarArr3.length;
            int i15 = 0;
            while (i15 < length3) {
                c cVar = cVarArr3[i15];
                c cVar2 = new c(cVar.a(), cVar.f26091b + 1, new int[cVar.f26092c.length + 1]);
                int[] iArr4 = new int[i12];
                int i16 = i12 - 1;
                iArr4[i16] = 1;
                int i17 = i15;
                cVar2.f26092c[cVar.f26092c.length] = r(i12, i13, iArr3, iArr4);
                int i18 = 0;
                while (i18 < cVar.f26092c.length) {
                    int i19 = i18;
                    cVar2.f26092c[i19] = m(cVar.f26092c[i18], i12, aVar3.f26082d, i10, i13, iArr3);
                    i18 = i19 + 1;
                    i12 = i10;
                    i13 = i11;
                    cVar2 = cVar2;
                    iArr3 = iArr;
                    i17 = i17;
                }
                int i20 = i17;
                c cVar3 = cVar2;
                cVar3.g();
                arrayList.add(cVar3);
                int i21 = 0;
                while (i21 < cVar.f26092c.length) {
                    c cVar4 = new c(cVar.a(), cVar.f26091b, new int[cVar.f26092c.length]);
                    int i22 = 0;
                    while (i22 < cVar.f26092c.length) {
                        int i23 = i22;
                        int i24 = i21;
                        c cVar5 = cVar4;
                        int i25 = i16;
                        cVar4.f26092c[i23] = m(cVar.f26092c[i22], i10, aVar3.f26082d, i10, i11, iArr);
                        if (i23 == i24) {
                            System.arraycopy(iArr2[cVar5.f26092c[i23]], 0, iArr4, 0, i10);
                            iArr4[i25] = iArr4[i25] + 1;
                            cVar5.f26092c[i23] = r(i10, i11, iArr, iArr4);
                        }
                        i22 = i23 + 1;
                        cVar4 = cVar5;
                        i21 = i24;
                        i16 = i25;
                        aVar3 = aVar2;
                    }
                    c cVar6 = cVar4;
                    cVar6.g();
                    arrayList.add(cVar6);
                    i21++;
                    aVar3 = aVar2;
                }
                i12 = i10;
                i13 = i11;
                iArr3 = iArr;
                i15 = i20 + 1;
                aVar3 = aVar2;
            }
            cVarArr2[length + i14] = (c[]) e(arrayList);
            i14++;
            aVar3 = aVar2;
        }
        return cVarArr2;
    }

    private static int[][] g(int i10, int i11, a aVar, a aVar2) {
        Class cls = Integer.TYPE;
        if (i10 == 0 || i11 == 0) {
            return (int[][]) Array.newInstance((Class<?>) cls, 1, i10);
        }
        int length = aVar.f26082d.length;
        int length2 = aVar2.f26082d.length;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, length + length2, i10);
        for (int i12 = 0; i12 < length; i12++) {
            System.arraycopy(aVar.f26082d[i12], 0, iArr[i12], 0, i10 - 1);
        }
        for (int i13 = 0; i13 < length2; i13++) {
            int i14 = length + i13;
            System.arraycopy(aVar2.f26082d[i13], 0, iArr[i14], 0, i10);
            int[] iArr2 = iArr[i14];
            int i15 = i10 - 1;
            iArr2[i15] = iArr2[i15] + 1;
        }
        return iArr;
    }

    private static int[] h(int[][] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 : iArr[i10]) {
                iArr2[i10] = iArr2[i10] + i11;
            }
        }
        return iArr2;
    }

    private static int[] i(int i10, int i11, a aVar, a aVar2) {
        if (i10 == 0 || i11 <= 1) {
            return new int[]{0};
        }
        int[] iArr = aVar.f26084f;
        int length = iArr.length;
        int length2 = aVar2.f26084f.length;
        int[] iArr2 = new int[length + length2];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        for (int i12 = 0; i12 < length2; i12++) {
            iArr2[length + i12] = aVar.s() + aVar2.f26084f[i12];
        }
        return iArr2;
    }

    private static b[][] j(int i10, int i11, a aVar, a aVar2, int[] iArr) {
        if (i10 == 0 || i11 == 0) {
            return new b[][]{new b[]{new b(1, 0, 0)}};
        }
        b[][] bVarArr = aVar.f26085g;
        int length = bVarArr.length;
        int length2 = aVar2.f26085g.length;
        b[][] bVarArr2 = new b[length + length2][];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
        for (int i12 = 0; i12 < length2; i12++) {
            b[] bVarArr3 = aVar2.f26085g[i12];
            ArrayList arrayList = new ArrayList(bVarArr3.length * 2);
            for (b bVar : bVarArr3) {
                arrayList.add(new b(bVar.a(), iArr[bVar.f26089b], bVar.f26090c + length));
                arrayList.add(new b(bVar.a(), bVar.f26089b + length, iArr[bVar.f26090c]));
            }
            bVarArr2[length + i12] = (b[]) e(arrayList);
        }
        return bVarArr2;
    }

    private static int[][] k(int i10, int i11, a aVar) {
        int i12 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10 + 1, i11 + 1);
        if (i10 == 0) {
            Arrays.fill(iArr[0], 1);
            return iArr;
        }
        System.arraycopy(aVar.f26081c, 0, iArr, 0, i10);
        iArr[i10][0] = 1;
        while (i12 < i11) {
            int[] iArr2 = iArr[i10];
            int i13 = i12 + 1;
            iArr2[i13] = iArr2[i12] + iArr[i10 - 1][i13];
            i12 = i13;
        }
        return iArr;
    }

    private static int m(int i10, int i11, int[][] iArr, int i12, int i13, int[][] iArr2) {
        int[] iArr3 = new int[i12];
        System.arraycopy(iArr[i10], 0, iArr3, 0, aj.d.E(i11, i12));
        return r(i12, i13, iArr2, iArr3);
    }

    public static a o(int i10, int i11) {
        a aVar;
        a[][] aVarArr = (a[][]) f26078j.get();
        if (aVarArr != null && aVarArr.length > i10) {
            a[] aVarArr2 = aVarArr[i10];
            if (aVarArr2.length > i11 && (aVar = aVarArr2[i11]) != null) {
                return aVar;
            }
        }
        a[][] aVarArr3 = (a[][]) Array.newInstance((Class<?>) a.class, aj.d.C(i10, aVarArr == null ? 0 : aVarArr.length) + 1, aj.d.C(i11, aVarArr == null ? 0 : aVarArr[0].length) + 1);
        if (aVarArr != null) {
            for (int i12 = 0; i12 < aVarArr.length; i12++) {
                a[] aVarArr4 = aVarArr[i12];
                System.arraycopy(aVarArr4, 0, aVarArr3[i12], 0, aVarArr4.length);
            }
        }
        for (int i13 = 0; i13 <= i10 + i11; i13++) {
            int iC = aj.d.C(0, i13 - i10);
            while (iC <= aj.d.E(i11, i13)) {
                int i14 = i13 - iC;
                a[] aVarArr5 = aVarArr3[i14];
                if (aVarArr5[iC] == null) {
                    aVarArr5[iC] = new a(i14, iC, i14 == 0 ? null : aVarArr3[i14 - 1][iC], iC != 0 ? aVarArr5[iC - 1] : null);
                }
                iC++;
            }
        }
        androidx.lifecycle.b.a(f26078j, aVarArr, aVarArr3);
        return aVarArr3[i10][i11];
    }

    private static int r(int i10, int i11, int[][] iArr, int... iArr2) {
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = i10 - 1; i15 >= 0; i15--) {
            int i16 = iArr2[i15];
            i14 += i16;
            if (i14 > i11) {
                throw new ui.e(ui.d.NUMBER_TOO_LARGE, Integer.valueOf(i14), Integer.valueOf(i11));
            }
            while (i16 > 0) {
                i16--;
                i13 += iArr[i15][i12];
                i12--;
            }
        }
        return i13;
    }

    public void A(double[] dArr, int i10, double[] dArr2, int i11) {
        double[] dArr3 = new double[this.f26080b + 1];
        dArr3[0] = aj.d.T(dArr[i10]);
        if (this.f26080b > 0) {
            dArr3[1] = aj.d.p(dArr[i10]);
            for (int i12 = 2; i12 <= this.f26080b; i12++) {
                dArr3[i12] = dArr3[i12 - 2];
            }
        }
        l(dArr, i10, dArr3, dArr2, i11);
    }

    public void B(double[] dArr, int i10, double[] dArr2, int i11) {
        b[] bVarArr;
        double dU = aj.d.U(dArr[i10]);
        dArr2[i11] = dU;
        for (int i12 = 1; i12 < this.f26085g.length; i12++) {
            int i13 = i11 + i12;
            dArr2[i13] = dArr[i10 + i12];
            int i14 = 1;
            while (true) {
                bVarArr = this.f26085g[i12];
                if (i14 < bVarArr.length - 1) {
                    b bVar = bVarArr[i14];
                    dArr2[i13] = dArr2[i13] - (((double) bVar.a()) * (dArr2[i11 + bVar.f26089b] * dArr2[i10 + bVar.f26090c]));
                    i14++;
                }
            }
            dArr2[i13] = dArr2[i13] / (((double) (bVarArr[bVarArr.length - 1].a() + this.f26085g[i12][0].a())) * dU);
        }
    }

    public void C(double[] dArr, int i10, double[] dArr2, int i11, double[] dArr3, int i12) {
        for (int i13 = 0; i13 < s(); i13++) {
            dArr3[i12 + i13] = dArr[i10 + i13] - dArr2[i11 + i13];
        }
    }

    public void D(double[] dArr, int i10, double[] dArr2, int i11) {
        double[] dArr3;
        double d10;
        double[] dArr4 = new double[this.f26080b + 1];
        double dX = aj.d.X(dArr[i10]);
        dArr4[0] = dX;
        int i12 = this.f26080b;
        if (i12 > 0) {
            int i13 = 2;
            double[] dArr5 = new double[i12 + 2];
            dArr5[1] = 1.0d;
            double d11 = dX * dX;
            int i14 = 1;
            while (i14 <= this.f26080b) {
                int i15 = i14 + 1;
                dArr5[i15] = ((double) (-i14)) * dArr5[i14];
                double d12 = 0.0d;
                int i16 = i15;
                while (i16 >= 0) {
                    d12 = (d12 * d11) + dArr5[i16];
                    if (i16 > i13) {
                        int i17 = i16 - 1;
                        dArr3 = dArr4;
                        double d13 = ((double) i17) * dArr5[i17];
                        int i18 = i16 - 3;
                        d10 = d11;
                        dArr5[i16 - 2] = d13 - (((double) i18) * dArr5[i18]);
                    } else {
                        dArr3 = dArr4;
                        d10 = d11;
                        if (i16 == 2) {
                            dArr5[0] = dArr5[1];
                        }
                    }
                    i16 -= 2;
                    dArr4 = dArr3;
                    d11 = d10;
                    i13 = 2;
                }
                double[] dArr6 = dArr4;
                double d14 = d11;
                if ((i14 & 1) == 0) {
                    d12 *= dX;
                }
                dArr6[i14] = d12;
                i14 = i15;
                dArr4 = dArr6;
                d11 = d14;
                i13 = 2;
            }
        }
        l(dArr, i10, dArr4, dArr2, i11);
    }

    public void a(double[] dArr, int i10, double[] dArr2, int i11, double[] dArr3, int i12) {
        for (int i13 = 0; i13 < s(); i13++) {
            dArr3[i12 + i13] = dArr[i10 + i13] + dArr2[i11 + i13];
        }
    }

    public void b(double[] dArr, int i10, double[] dArr2, int i11) {
        double d10;
        a aVar = this;
        double[] dArr3 = new double[aVar.f26080b + 1];
        double d11 = dArr[i10];
        dArr3[0] = aj.d.g(d11);
        int i12 = aVar.f26080b;
        if (i12 > 0) {
            double[] dArr4 = new double[i12];
            dArr4[0] = 1.0d;
            double d12 = d11 * d11;
            double d13 = 1.0d / (d12 + 1.0d);
            double dU = aj.d.U(d13);
            dArr3[1] = dArr4[0] * dU;
            int i13 = 2;
            int i14 = 2;
            while (i14 <= aVar.f26080b) {
                int i15 = i14 - 1;
                double[] dArr5 = dArr3;
                dArr4[i15] = ((double) (1 - i14)) * dArr4[i14 - 2];
                double d14 = 0.0d;
                while (i15 >= 0) {
                    double d15 = (d14 * d12) + dArr4[i15];
                    if (i15 > i13) {
                        int i16 = i15 - 1;
                        d10 = d15;
                        dArr4[i15 - 2] = (((double) i16) * dArr4[i16]) + (((double) (i15 - (i14 * 2))) * dArr4[i15 - 3]);
                    } else {
                        d10 = d15;
                        if (i15 == 2) {
                            dArr4[0] = dArr4[1];
                        }
                    }
                    i15 -= 2;
                    i13 = 2;
                    d14 = d10;
                }
                if ((i14 & 1) == 0) {
                    d14 *= d11;
                }
                dU *= d13;
                dArr5[i14] = d14 * dU;
                i14++;
                i13 = 2;
                aVar = this;
                dArr3 = dArr5;
            }
        }
        l(dArr, i10, dArr3, dArr2, i11);
    }

    public void c(double[] dArr, int i10, double[] dArr2, int i11) {
        double d10;
        a aVar = this;
        double[] dArr3 = new double[aVar.f26080b + 1];
        double d11 = dArr[i10];
        dArr3[0] = aj.d.h(d11);
        int i12 = aVar.f26080b;
        if (i12 > 0) {
            double[] dArr4 = new double[i12];
            dArr4[0] = 1.0d;
            double d12 = d11 * d11;
            double d13 = 1.0d / (d12 + 1.0d);
            dArr3[1] = 1.0d * d13;
            int i13 = 2;
            double d14 = d13;
            int i14 = 2;
            while (i14 <= aVar.f26080b) {
                int i15 = i14 - 1;
                double[] dArr5 = dArr3;
                dArr4[i15] = ((double) (-i14)) * dArr4[i14 - 2];
                double d15 = 0.0d;
                while (i15 >= 0) {
                    double d16 = (d15 * d12) + dArr4[i15];
                    if (i15 > i13) {
                        int i16 = i15 - 1;
                        d10 = d16;
                        dArr4[i15 - 2] = (((double) i16) * dArr4[i16]) + (((double) (i16 - (i14 * 2))) * dArr4[i15 - 3]);
                    } else {
                        d10 = d16;
                        if (i15 == 2) {
                            dArr4[0] = dArr4[1];
                        }
                    }
                    i15 -= 2;
                    i13 = 2;
                    d15 = d10;
                }
                if ((i14 & 1) == 0) {
                    d15 *= d11;
                }
                d14 *= d13;
                dArr5[i14] = d15 * d14;
                i14++;
                i13 = 2;
                aVar = this;
                dArr3 = dArr5;
            }
        }
        l(dArr, i10, dArr3, dArr2, i11);
    }

    public void d(a aVar) {
        aj.j.a(this.f26079a, aVar.f26079a);
        aj.j.a(this.f26080b, aVar.f26080b);
    }

    public void l(double[] dArr, int i10, double[] dArr2, double[] dArr3, int i11) {
        int i12 = 0;
        while (true) {
            c[][] cVarArr = this.f26086h;
            if (i12 >= cVarArr.length) {
                return;
            }
            double d10 = 0.0d;
            for (c cVar : cVarArr[i12]) {
                double dA = ((double) cVar.a()) * dArr2[cVar.f26091b];
                for (int i13 = 0; i13 < cVar.f26092c.length; i13++) {
                    dA *= dArr[cVar.f26092c[i13] + i10];
                }
                d10 += dA;
            }
            dArr3[i11 + i12] = d10;
            i12++;
        }
    }

    public void n(double[] dArr, int i10, double[] dArr2, int i11, double[] dArr3, int i12) {
        b[] bVarArr;
        dArr3[i12] = dArr[i10] / dArr2[i11];
        for (int i13 = 1; i13 < this.f26085g.length; i13++) {
            int i14 = i12 + i13;
            dArr3[i14] = dArr[i10 + i13];
            int i15 = 0;
            while (true) {
                bVarArr = this.f26085g[i13];
                if (i15 < bVarArr.length - 1) {
                    b bVar = bVarArr[i15];
                    dArr3[i14] = dArr3[i14] - (((double) bVar.a()) * (dArr3[i12 + bVar.f26089b] * dArr2[i11 + bVar.f26090c]));
                    i15++;
                }
            }
            dArr3[i14] = dArr3[i14] / (dArr2[i10] * ((double) bVarArr[0].a()));
        }
    }

    public int p() {
        return this.f26079a;
    }

    public int q() {
        return this.f26080b;
    }

    public int s() {
        return this.f26081c[this.f26079a][this.f26080b];
    }

    public void t(double d10, double[] dArr, int i10, double d11, double[] dArr2, int i11, double d12, double[] dArr3, int i12, double[] dArr4, int i13) {
        for (int i14 = 0; i14 < s(); i14++) {
            dArr4[i13 + i14] = aj.i.e(d10, dArr[i10 + i14], d11, dArr2[i11 + i14], d12, dArr3[i12 + i14]);
        }
    }

    public void u(double d10, double[] dArr, int i10, double d11, double[] dArr2, int i11, double[] dArr3, int i12) {
        for (int i13 = 0; i13 < s(); i13++) {
            dArr3[i12 + i13] = aj.i.d(d10, dArr[i10 + i13], d11, dArr2[i11 + i13]);
        }
    }

    public void v(double[] dArr, int i10, double[] dArr2, int i11, double[] dArr3, int i12) {
        int i13 = 0;
        while (true) {
            b[][] bVarArr = this.f26085g;
            if (i13 >= bVarArr.length) {
                return;
            }
            double dA = 0.0d;
            for (b bVar : bVarArr[i13]) {
                dA += ((double) bVar.a()) * dArr[bVar.f26089b + i10] * dArr2[i11 + bVar.f26090c];
            }
            dArr3[i12 + i13] = dA;
            i13++;
        }
    }

    public void w(double[] dArr, int i10, double[] dArr2, int i11) {
        b[] bVarArr;
        dArr2[i11] = 1.0d / dArr[i10];
        for (int i12 = 1; i12 < this.f26085g.length; i12++) {
            int i13 = i11 + i12;
            dArr2[i13] = 0.0d;
            int i14 = 0;
            while (true) {
                bVarArr = this.f26085g[i12];
                if (i14 < bVarArr.length - 1) {
                    b bVar = bVarArr[i14];
                    dArr2[i13] = dArr2[i13] - (((double) bVar.a()) * (dArr2[i11 + bVar.f26089b] * dArr[i10 + bVar.f26090c]));
                    i14++;
                }
            }
            dArr2[i13] = dArr2[i13] / (dArr[i10] * ((double) bVarArr[0].a()));
        }
    }

    public void x(double[] dArr, int i10, int i11, double[] dArr2, int i12) {
        double d10;
        double dJ;
        double d11;
        double[] dArr3 = new double[this.f26080b + 1];
        if (i11 == 2) {
            double dU = aj.d.U(dArr[i10]);
            dArr3[0] = dU;
            d11 = 0.5d / dU;
        } else {
            if (i11 == 3) {
                dJ = aj.d.k(dArr[i10]);
                dArr3[0] = dJ;
                d10 = 3.0d * dJ;
            } else {
                d10 = i11;
                double dI = aj.d.I(dArr[i10], 1.0d / d10);
                dArr3[0] = dI;
                dJ = aj.d.J(dI, i11 - 1);
            }
            d11 = 1.0d / (d10 * dJ);
        }
        double d12 = 1.0d / ((double) i11);
        double d13 = 1.0d / dArr[i10];
        for (int i13 = 1; i13 <= this.f26080b; i13++) {
            dArr3[i13] = d11;
            d11 *= (d12 - ((double) i13)) * d13;
        }
        l(dArr, i10, dArr3, dArr2, i12);
    }

    public void y(double[] dArr, int i10, double[] dArr2, int i11) {
        double[] dArr3 = new double[this.f26080b + 1];
        m mVarR = aj.d.R(dArr[i10]);
        dArr3[0] = mVarR.b();
        if (this.f26080b > 0) {
            dArr3[1] = mVarR.a();
            for (int i12 = 2; i12 <= this.f26080b; i12++) {
                dArr3[i12] = -dArr3[i12 - 2];
            }
        }
        l(dArr, i10, dArr3, dArr2, i11);
    }

    public void z(double[] dArr, int i10, double[] dArr2, int i11, double[] dArr3, int i12) {
        int i13 = this.f26080b;
        double[] dArr4 = new double[i13 + 1];
        double[] dArr5 = new double[i13 + 1];
        m mVarR = aj.d.R(dArr[i10]);
        dArr4[0] = mVarR.b();
        dArr5[0] = mVarR.a();
        if (this.f26080b > 0) {
            dArr4[1] = mVarR.a();
            dArr5[1] = -mVarR.b();
            for (int i14 = 2; i14 <= this.f26080b; i14++) {
                int i15 = i14 - 2;
                dArr4[i14] = -dArr4[i15];
                dArr5[i14] = -dArr5[i15];
            }
        }
        l(dArr, i10, dArr4, dArr2, i11);
        l(dArr, i10, dArr5, dArr3, i12);
    }
}
