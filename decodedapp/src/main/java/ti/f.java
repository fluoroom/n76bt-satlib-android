package ti;

import ti.e;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f27906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f27907j;

    public f(double d10, double d11, double d12, int i10) {
        super(d10, d11, d12);
        if (i10 < 2) {
            throw new ui.e(ui.d.NUMBER_TOO_SMALL, Integer.valueOf(i10), 2);
        }
        this.f27906i = i10;
        this.f27907j = b.ANY_SIDE;
    }

    private double n(double d10, double[] dArr, double[] dArr2, int i10, int i11) {
        int i12;
        int i13 = i10;
        while (true) {
            i12 = i11 - 1;
            if (i13 >= i12) {
                break;
            }
            int i14 = i13 + 1;
            int i15 = i14 - i10;
            while (i12 > i13) {
                dArr[i12] = (dArr[i12] - dArr[i12 - 1]) / (dArr2[i12] - dArr2[i12 - i15]);
                i12--;
            }
            i13 = i14;
        }
        double d11 = 0.0d;
        while (i12 >= i10) {
            d11 = (d11 * (d10 - dArr2[i12])) + dArr[i12];
            i12--;
        }
        return d11;
    }

    @Override // ti.e
    public e.a a(int i10, qi.a aVar, double d10, double d11, double d12) {
        k(i10, aVar, d10, d11, d12);
        this.f27907j = null;
        return m();
    }

    @Override // ti.e
    public /* synthetic */ e.a b(int i10, qi.a aVar, double d10, double d11) {
        return d.a(this, i10, aVar, d10, d11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x023a, code lost:
    
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0247, code lost:
    
        return new ti.e.a(r5, r19, r10, r23);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected ti.e.a m() {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.f.m():ti.e$a");
    }
}
