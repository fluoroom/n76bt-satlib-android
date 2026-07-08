package ak;

import aj.d;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f689d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f692c;

    public a(int i10, boolean z10) {
        this.f690a = i10;
        this.f691b = z10;
        this.f692c = d.C(i10, 20);
    }

    public void a(Appendable appendable, long j10) throws IOException {
        long jD;
        int i10;
        char[] cArr = new char[this.f692c];
        int i11 = 0;
        if (j10 == Long.MIN_VALUE) {
            cArr[0] = '8';
            jD = 922337203685477580L;
            i11 = 1;
        } else {
            jD = d.d(j10);
        }
        while (true) {
            i10 = i11 + 1;
            cArr[i11] = f689d[(int) (jD % 10)];
            jD /= 10;
            if (jD <= 0) {
                break;
            } else {
                i11 = i10;
            }
        }
        if (!this.f691b) {
            if (j10 < 0) {
                cArr[i10] = '-';
                i10 = i11 + 2;
            }
            int i12 = this.f690a;
            if (i10 < i12) {
                Arrays.fill(cArr, i10, i12, ' ');
                i10 = this.f690a;
            }
        } else if (j10 < 0) {
            int i13 = this.f690a;
            if (i10 < i13 - 1) {
                Arrays.fill(cArr, i10, i13 - 1, '0');
                i10 = this.f690a - 1;
            }
            cArr[i10] = '-';
            i10++;
        } else {
            int i14 = this.f690a;
            if (i10 < i14) {
                Arrays.fill(cArr, i10, i14, '0');
                i10 = this.f690a;
            }
        }
        while (i10 > 0) {
            i10--;
            appendable.append(cArr[i10]);
        }
    }
}
