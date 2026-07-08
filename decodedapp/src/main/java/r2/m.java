package r2;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f25380a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f25381b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f25382c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f25383d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f25384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f25385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f25386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i2.g f25387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f25388i;

    private static class a extends m {
        a() {
        }

        @Override // r2.m
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // r2.m
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    private static class b extends m {
        b() {
        }

        @Override // r2.m
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // r2.m
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    private static class c extends m {
        c() {
        }

        @Override // r2.m
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : m.f25382c.a(i10, i11, i12, i13);
        }

        @Override // r2.m
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, m.f25382c.b(i10, i11, i12, i13));
        }
    }

    private static class d extends m {
        d() {
        }

        @Override // r2.m
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // r2.m
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    private static class e extends m {
        e() {
        }

        @Override // r2.m
        public g a(int i10, int i11, int i12, int i13) {
            return m.f25388i ? g.QUALITY : g.MEMORY;
        }

        @Override // r2.m
        public float b(int i10, int i11, int i12, int i13) {
            if (m.f25388i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    private static class f extends m {
        f() {
        }

        @Override // r2.m
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // r2.m
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f25384e = dVar;
        f25385f = new f();
        f25386g = dVar;
        f25387h = i2.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f25388i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
