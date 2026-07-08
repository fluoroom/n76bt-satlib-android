package gj;

/* JADX INFO: loaded from: classes3.dex */
class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f14708a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14709b = 15;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f14710c;

    private w(long j10) {
        this.f14710c = j10;
    }

    private void a(int i10) {
        if (i10 != 0) {
            long j10 = this.f14710c | this.f14708a;
            this.f14710c = j10;
            int i11 = this.f14709b;
            if (i11 > 57 || i10 < -64 || i10 > 63) {
                throw new hj.e(null);
            }
            this.f14710c = j10 | (((((long) i10) + 64) & 127) << i11);
            this.f14709b = i11 + 7;
        }
        this.f14708a <<= 1;
    }

    public static int[] b(long j10) {
        int[] iArr = new int[15];
        w wVar = new w(j10);
        for (int i10 = 0; i10 < 15; i10++) {
            iArr[i10] = wVar.e();
        }
        return iArr;
    }

    public static long c(int... iArr) {
        w wVar = new w(0L);
        for (int i10 : iArr) {
            wVar.a(i10);
        }
        return wVar.d();
    }

    private int e() {
        int i10;
        long j10 = this.f14710c;
        long j11 = this.f14708a;
        if ((j10 & j11) == 0) {
            i10 = 0;
        } else {
            int i11 = this.f14709b;
            i10 = ((int) ((j10 >>> i11) & 127)) - 64;
            this.f14709b = i11 + 7;
        }
        this.f14708a = j11 << 1;
        return i10;
    }

    public long d() {
        return this.f14710c;
    }
}
