package w5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f31312b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f31313c = new long[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31314d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface a {
        long a();
    }

    public e(int i10, int i11) {
        this.f31311a = ((long) i10) * 1000000;
        this.f31314d = i11;
        f(8);
    }

    private void f(int i10) {
        long[] jArr = this.f31312b;
        if (i10 == jArr.length) {
            return;
        }
        this.f31312b = Arrays.copyOf(jArr, i10);
        this.f31313c = Arrays.copyOf(this.f31313c, i10);
    }

    public void a(long j10) {
        long jNanoTime = System.nanoTime();
        long j11 = jNanoTime - this.f31311a;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f31313c;
            if (i10 >= jArr.length) {
                long[] jArr2 = this.f31312b;
                int length = jArr2.length;
                int i11 = this.f31314d;
                if (length < i11) {
                    f(Math.min(jArr2.length * 2, i11));
                    a(j10);
                    return;
                }
                return;
            }
            if (jArr[i10] < j11) {
                jArr[i10] = jNanoTime;
                this.f31312b[i10] = j10;
                return;
            } else {
                if (this.f31312b[i10] == j10) {
                    jArr[i10] = jNanoTime;
                    return;
                }
                i10++;
            }
        }
    }

    public void b(a aVar) {
        a(aVar.a());
    }

    public boolean c(a aVar) {
        if (e(aVar)) {
            return true;
        }
        b(aVar);
        return false;
    }

    public boolean d(long j10) {
        long jNanoTime = System.nanoTime() - this.f31311a;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f31313c;
            if (i10 >= jArr.length) {
                return false;
            }
            if (jArr[i10] >= jNanoTime && this.f31312b[i10] == j10) {
                return true;
            }
            i10++;
        }
    }

    public boolean e(a aVar) {
        return d(aVar.a());
    }
}
