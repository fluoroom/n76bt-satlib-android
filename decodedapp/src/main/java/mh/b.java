package mh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ kd.a A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f22091c = new b("NO_ERROR", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f22092d = new b("PROTOCOL_ERROR", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f22093e = new b("INTERNAL_ERROR", 2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f22094f = new b("FLOW_CONTROL_ERROR", 3, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f22095g = new b("SETTINGS_TIMEOUT", 4, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f22096h = new b("STREAM_CLOSED", 5, 5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f22097r = new b("FRAME_SIZE_ERROR", 6, 6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f22098s = new b("REFUSED_STREAM", 7, 7);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f22099t = new b("CANCEL", 8, 8);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f22100u = new b("COMPRESSION_ERROR", 9, 9);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f22101v = new b("CONNECT_ERROR", 10, 10);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f22102w = new b("ENHANCE_YOUR_CALM", 11, 11);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f22103x = new b("INADEQUATE_SECURITY", 12, 12);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f22104y = new b("HTTP_1_1_REQUIRED", 13, 13);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ b[] f22105z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22106a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final b a(int i10) {
            for (b bVar : b.values()) {
                if (bVar.d() == i10) {
                    return bVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    static {
        b[] bVarArrA = a();
        f22105z = bVarArrA;
        A = kd.b.a(bVarArrA);
        f22090b = new a(null);
    }

    private b(String str, int i10, int i11) {
        this.f22106a = i11;
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f22091c, f22092d, f22093e, f22094f, f22095g, f22096h, f22097r, f22098s, f22099t, f22100u, f22101v, f22102w, f22103x, f22104y};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f22105z.clone();
    }

    public final int d() {
        return this.f22106a;
    }
}
