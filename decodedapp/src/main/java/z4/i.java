package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f32930a = new i("Terrain", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f32931b = new i("TerrainAndMap", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f32932c = new i("HybridSatelliteMap", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f32933d = new i("SatelliteMap", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ i[] f32934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kd.a f32935f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32936a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.f32930a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.f32931b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.f32932c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.f32933d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32936a = iArr;
        }
    }

    static {
        i[] iVarArrA = a();
        f32934e = iVarArrA;
        f32935f = kd.b.a(iVarArrA);
    }

    private i(String str, int i10) {
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f32930a, f32931b, f32932c, f32933d};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f32934e.clone();
    }

    public final String d() {
        int i10 = a.f32936a[ordinal()];
        if (i10 == 1) {
            return "t";
        }
        if (i10 == 2) {
            return "p";
        }
        if (i10 == 3) {
            return "y";
        }
        if (i10 == 4) {
            return "s";
        }
        throw new dd.o();
    }
}
