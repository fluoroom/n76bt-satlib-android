package gg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14414b = new b("ERROR_CLASS", 0, "<Error class: %s>");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14415c = new b("ERROR_FUNCTION", 1, "<Error function>");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14416d = new b("ERROR_SCOPE", 2, "<Error scope>");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f14417e = new b("ERROR_MODULE", 3, "<Error module>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f14418f = new b("ERROR_PROPERTY", 4, "<Error property>");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f14419g = new b("ERROR_TYPE", 5, "[Error type: %s]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f14420h = new b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ b[] f14421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ kd.a f14422s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14423a;

    static {
        b[] bVarArrA = a();
        f14421r = bVarArrA;
        f14422s = kd.b.a(bVarArrA);
    }

    private b(String str, int i10, String str2) {
        this.f14423a = str2;
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f14414b, f14415c, f14416d, f14417e, f14418f, f14419g, f14420h};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f14421r.clone();
    }

    public final String d() {
        return this.f14423a;
    }
}
