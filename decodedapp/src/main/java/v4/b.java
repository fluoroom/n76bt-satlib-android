package v4;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends e0 implements q0 {
    public int A;
    public int B;
    private boolean C;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f29716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29718h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a.C0405a f29721t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f29722u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f29723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f29724w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f29725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f29726y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f29727z;

    public b(int i10) {
        super(i10);
        this.f29716f = new int[3];
        this.f29721t = new a.C0405a();
        this.f29722u = new int[10];
        this.f29723v = new int[3];
    }

    public static int d(int i10, int i11) {
        return (i11 >= 79 ? 52 : 36) + ((i10 - 3) * 4);
    }

    @Override // v4.q0
    public byte[] a(int i10) {
        byte[] bArr = new byte[d(this.f29846a.length, i10)];
        a6.v vVar = new a6.v(bArr);
        int i11 = 0;
        while (true) {
            int[][] iArr = this.f29846a;
            if (i11 >= iArr.length) {
                break;
            }
            int[] iArr2 = iArr[i11];
            if (iArr2[0] == iArr2[1]) {
                vVar.n(0, 32);
            } else {
                vVar.p(this.f29848c[i11]);
                vVar.p(!this.f29847b[i11]);
                vVar.n(this.f29846a[i11][0], 14);
                vVar.p(this.f29850e[i11]);
                vVar.p(this.f29849d[i11]);
                vVar.n(this.f29846a[i11][1], 14);
            }
            i11++;
        }
        for (int i12 : this.f29716f) {
            vVar.n(i12, 8);
        }
        vVar.n(this.f29717g, 4);
        vVar.n(this.f29718h, 2);
        vVar.n(0, 2);
        vVar.n(this.f29720s, 16);
        this.f29721t.f(vVar);
        if (i10 >= 79) {
            int i13 = 0;
            while (true) {
                int[] iArr3 = this.f29722u;
                if (i13 >= iArr3.length) {
                    break;
                }
                vVar.n(iArr3[i13], 8);
                i13++;
            }
            vVar.n(this.f29723v[0], 4);
            vVar.n(this.f29723v[1], 4);
            vVar.n(this.f29724w, 7);
            vVar.n(0, 1);
            vVar.n(this.f29726y, 10);
            if (i10 >= 81) {
                vVar.n(this.f29727z, 6);
            } else {
                vVar.n(0, 6);
            }
            vVar.n(this.A, 10);
            if (i10 >= 81) {
                vVar.n(this.B, 6);
                return bArr;
            }
            vVar.n(0, 6);
        }
        return bArr;
    }

    @Override // v4.q0
    public byte[] b() {
        return a(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public boolean e() {
        return this.C;
    }

    public b(byte[] bArr, int i10, int i11, int i12) {
        this(i12);
        try {
            a6.v vVar = new a6.v(Arrays.copyOfRange(bArr, i10, i11), 0);
            for (int i13 = 0; i13 < this.f29846a.length; i13++) {
                this.f29848c[i13] = vVar.c();
                this.f29847b[i13] = !vVar.c();
                this.f29846a[i13][0] = vVar.i(14) & 1023;
                this.f29850e[i13] = vVar.c();
                this.f29849d[i13] = vVar.c();
                this.f29846a[i13][1] = vVar.i(14) & 1023;
            }
            int i14 = 0;
            while (true) {
                int[] iArr = this.f29716f;
                if (i14 >= iArr.length) {
                    break;
                }
                iArr[i14] = vVar.i(8);
                i14++;
            }
            this.f29717g = vVar.i(4);
            this.f29718h = vVar.j(2);
            this.f29719r = vVar.i(2);
            this.f29720s = vVar.i(16);
            this.f29721t.c(vVar);
            int i15 = 0;
            while (true) {
                int[] iArr2 = this.f29722u;
                if (i15 < iArr2.length) {
                    iArr2[i15] = vVar.i(8);
                    i15++;
                } else {
                    this.f29723v[0] = vVar.i(4);
                    this.f29723v[1] = vVar.i(4);
                    this.f29724w = vVar.i(7);
                    this.f29725x = vVar.i(1);
                    this.C = true;
                    this.f29726y = vVar.i(10);
                    this.f29727z = vVar.j(6);
                    this.A = vVar.i(10);
                    this.B = vVar.j(6);
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }
}
