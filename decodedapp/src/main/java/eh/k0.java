package eh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f12542c = new k0("TLS_1_3", 0, "TLSv1.3");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f12543d = new k0("TLS_1_2", 1, "TLSv1.2");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k0 f12544e = new k0("TLS_1_1", 2, "TLSv1.1");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k0 f12545f = new k0("TLS_1_0", 3, "TLSv1");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k0 f12546g = new k0("SSL_3_0", 4, "SSLv3");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ k0[] f12547h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ kd.a f12548r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12549a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final k0 a(String str) {
            rd.m.e(str, "javaName");
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return k0.f12544e;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return k0.f12543d;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return k0.f12542c;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return k0.f12545f;
                }
            } else if (str.equals("SSLv3")) {
                return k0.f12546g;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }

        private a() {
        }
    }

    static {
        k0[] k0VarArrA = a();
        f12547h = k0VarArrA;
        f12548r = kd.b.a(k0VarArrA);
        f12541b = new a(null);
    }

    private k0(String str, int i10, String str2) {
        this.f12549a = str2;
    }

    private static final /* synthetic */ k0[] a() {
        return new k0[]{f12542c, f12543d, f12544e, f12545f, f12546g};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f12547h.clone();
    }

    public final String d() {
        return this.f12549a;
    }
}
