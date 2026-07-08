package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f12310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f12311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f12312p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f12321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f12322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f12323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f12324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f12325m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12328c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12329d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12330e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f12331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f12332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f12333h;

        public final d a() {
            return fh.i.a(this);
        }

        public final boolean b() {
            return this.f12333h;
        }

        public final int c() {
            return this.f12328c;
        }

        public final int d() {
            return this.f12329d;
        }

        public final int e() {
            return this.f12330e;
        }

        public final boolean f() {
            return this.f12326a;
        }

        public final boolean g() {
            return this.f12327b;
        }

        public final boolean h() {
            return this.f12332g;
        }

        public final boolean i() {
            return this.f12331f;
        }

        public final a j(long j10) {
            long jD = sg.a.d(j10);
            if (jD >= 0) {
                this.f12329d = fh.i.b(jD);
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + jD).toString());
        }

        public final a k() {
            return fh.i.e(this);
        }

        public final a l() {
            return fh.i.f(this);
        }

        public final void m(boolean z10) {
            this.f12326a = z10;
        }

        public final void n(boolean z10) {
            this.f12331f = z10;
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final d a(y yVar) {
            rd.m.e(yVar, "headers");
            return fh.i.g(this, yVar);
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        f12310n = bVar;
        f12311o = fh.i.d(bVar);
        f12312p = fh.i.c(bVar);
    }

    public d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f12313a = z10;
        this.f12314b = z11;
        this.f12315c = i10;
        this.f12316d = i11;
        this.f12317e = z12;
        this.f12318f = z13;
        this.f12319g = z14;
        this.f12320h = i12;
        this.f12321i = i13;
        this.f12322j = z15;
        this.f12323k = z16;
        this.f12324l = z17;
        this.f12325m = str;
    }

    public final String a() {
        return this.f12325m;
    }

    public final boolean b() {
        return this.f12324l;
    }

    public final boolean c() {
        return this.f12317e;
    }

    public final boolean d() {
        return this.f12318f;
    }

    public final int e() {
        return this.f12315c;
    }

    public final int f() {
        return this.f12320h;
    }

    public final int g() {
        return this.f12321i;
    }

    public final boolean h() {
        return this.f12319g;
    }

    public final boolean i() {
        return this.f12313a;
    }

    public final boolean j() {
        return this.f12314b;
    }

    public final boolean k() {
        return this.f12323k;
    }

    public final boolean l() {
        return this.f12322j;
    }

    public final int m() {
        return this.f12316d;
    }

    public final void n(String str) {
        this.f12325m = str;
    }

    public String toString() {
        return fh.i.h(this);
    }
}
