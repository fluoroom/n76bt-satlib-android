package m6;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReference f21748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f21749c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int[] f21752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f21753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f21754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f21755i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f21757k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f21747a = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f21756j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f21758l = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f21750d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f21751e = true;

    /* JADX INFO: renamed from: m6.a$a, reason: collision with other inner class name */
    private static final class C0286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f21762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f21763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f21764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f21765g;

        public C0286a(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.f21759a = i10;
            this.f21760b = i11;
            this.f21761c = i12;
            this.f21762d = iArr;
            this.f21763e = strArr;
            this.f21764f = i13;
            this.f21765g = i14;
        }

        public static C0286a a(int i10) {
            int i11 = i10 << 3;
            return new C0286a(i10, 0, a.a(i10), new int[i11], new String[i10 << 1], i11 - i10, i11);
        }
    }

    private a(int i10, int i11) {
        this.f21749c = i11;
        int i12 = 16;
        if (i10 < 16) {
            i10 = 16;
        } else if (((i10 - 1) & i10) != 0) {
            while (i12 < i10) {
                i12 += i12;
            }
            i10 = i12;
        }
        this.f21748b = new AtomicReference(C0286a.a(i10));
    }

    static int a(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    private final int b() {
        int i10 = this.f21753g;
        return (i10 << 3) - i10;
    }

    public static a c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return d((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static a d(int i10) {
        return new a(64, i10);
    }

    public int e() {
        int i10 = this.f21754h;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f21752f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int f() {
        int i10 = this.f21755i;
        int i11 = 0;
        for (int i12 = this.f21754h + 3; i12 < i10; i12 += 4) {
            if (this.f21752f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int g() {
        return (this.f21757k - b()) >> 2;
    }

    public int h() {
        int i10 = this.f21755i + 3;
        int i11 = this.f21753g + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this.f21752f[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public int i() {
        int i10 = this.f21753g << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f21752f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public String toString() {
        int iE = e();
        int iF = f();
        int iH = h();
        int iG = g();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", a.class.getName(), Integer.valueOf(this.f21756j), Integer.valueOf(this.f21753g), Integer.valueOf(iE), Integer.valueOf(iF), Integer.valueOf(iH), Integer.valueOf(iG), Integer.valueOf(iE + iF + iH + iG), Integer.valueOf(i()));
    }
}
