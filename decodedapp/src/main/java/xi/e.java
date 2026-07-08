package xi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f32228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f32229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f32230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e[] f32231d;

    enum a extends e {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // xi.e
        public f a() {
            return f.f32233e;
        }
    }

    static {
        a aVar = new a("X", 0);
        f32228a = aVar;
        e eVar = new e("Y", 1) { // from class: xi.e.b
            {
                a aVar2 = null;
            }

            @Override // xi.e
            public f a() {
                return f.f32235g;
            }
        };
        f32229b = eVar;
        e eVar2 = new e("Z", 2) { // from class: xi.e.c
            {
                a aVar2 = null;
            }

            @Override // xi.e
            public f a() {
                return f.f32237r;
            }
        };
        f32230c = eVar2;
        f32231d = new e[]{aVar, eVar, eVar2};
    }

    private e(String str, int i10) {
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f32231d.clone();
    }

    public abstract f a();

    /* synthetic */ e(String str, int i10, a aVar) {
        this(str, i10);
    }
}
