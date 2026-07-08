package ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f30557b = new c("METHOD_RETURN_TYPE", 0, "METHOD");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f30558c = new c("VALUE_PARAMETER", 1, "PARAMETER");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f30559d = new c("FIELD", 2, "FIELD");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f30560e = new c("TYPE_USE", 3, "TYPE_USE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f30561f = new c("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f30562g = new c("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ c[] f30563h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ kd.a f30564r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30565a;

    static {
        c[] cVarArrA = a();
        f30563h = cVarArrA;
        f30564r = kd.b.a(cVarArrA);
    }

    private c(String str, int i10, String str2) {
        this.f30565a = str2;
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f30557b, f30558c, f30559d, f30560e, f30561f, f30562g};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f30563h.clone();
    }

    public final String d() {
        return this.f30565a;
    }
}
