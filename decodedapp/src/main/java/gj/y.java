package gj;

import aj.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f14720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14721b;

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0[] f14722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0[] f14723b;

        a(a0[] a0VarArr, c0[] c0VarArr) {
            this.f14722a = a0VarArr;
            this.f14723b = c0VarArr;
        }

        @Override // gj.y.b
        public double[] a(gj.b bVar) {
            int length = this.f14722a.length;
            double[] dArr = new double[length];
            for (c0 c0Var : this.f14723b) {
                double[] dArrE = c0Var.e(bVar);
                for (int i10 = 0; i10 < dArrE.length; i10++) {
                    dArr[i10] = dArr[i10] + dArrE[i10];
                }
            }
            for (int i11 = 0; i11 < length; i11++) {
                dArr[i11] = dArr[i11] + this.f14722a[i11].a(bVar.u());
            }
            return dArr;
        }

        @Override // gj.y.b
        public double[] b(gj.b bVar) {
            a0[] a0VarArr = this.f14722a;
            int length = a0VarArr.length;
            double[] dArr = new double[length];
            double[] dArr2 = new double[a0VarArr.length];
            for (c0 c0Var : this.f14723b) {
                double[] dArrK = c0Var.k(bVar);
                for (int i10 = 0; i10 < dArrK.length; i10++) {
                    j.b bVarH = aj.j.h(dArr[i10], dArrK[i10]);
                    dArr[i10] = bVarH.b();
                    dArr2[i10] = dArr2[i10] + bVarH.a();
                }
            }
            for (int i11 = 0; i11 < length; i11++) {
                dArr[i11] = dArr[i11] + dArr2[i11] + this.f14722a[i11].b(bVar.u());
            }
            return dArr;
        }
    }

    public interface b {
        double[] a(gj.b bVar);

        double[] b(gj.b bVar);
    }

    public y(a0 a0Var, Map map) {
        this.f14720a = a0Var;
        this.f14721b = map;
    }

    public static b a(y... yVarArr) {
        int length = yVarArr.length;
        a0[] a0VarArr = new a0[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            a0VarArr[i11] = yVarArr[i11].f14720a;
        }
        HashMap map = new HashMap();
        for (y yVar : yVarArr) {
            Iterator it = yVar.f14721b.entrySet().iterator();
            while (it.hasNext()) {
                Long l10 = (Long) ((Map.Entry) it.next()).getKey();
                long jLongValue = l10.longValue();
                if (!map.containsKey(l10)) {
                    int[] iArrB = w.b(jLongValue);
                    c0 c0VarD = c0.d(iArrB[0], iArrB[1], iArrB[2], iArrB[3], iArrB[4], iArrB[5], iArrB[6], iArrB[7], iArrB[8], iArrB[9], iArrB[10], iArrB[11], iArrB[12], iArrB[13], iArrB[14]);
                    c0VarD.a(yVarArr.length - 1, -1, Double.NaN, Double.NaN);
                    map.put(l10, c0VarD);
                }
            }
        }
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            for (Map.Entry entry : yVarArr[i12].f14721b.entrySet()) {
                c0 c0Var = (c0) entry.getValue();
                c0 c0Var2 = (c0) map.get(entry.getKey());
                for (int i13 = 0; i13 <= c0Var.i(0); i13++) {
                    c0Var2.a(i12, i13, c0Var.j(0, i13), c0Var.h(0, i13));
                }
            }
        }
        c0[] c0VarArr = new c0[map.size()];
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            c0VarArr[i10] = (c0) ((Map.Entry) it2.next()).getValue();
            i10++;
        }
        return new a(a0VarArr, c0VarArr);
    }

    public a0 b() {
        return this.f14720a;
    }
}
