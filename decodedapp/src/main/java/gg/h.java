package gg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f14435b = new h("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f14436c = new h("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f14437d = new h("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f14438e = new h("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f14439f = new h("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f14440g = new h("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f14441h = new h("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f14442r = new h("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f14443s = new h("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f14444t = new h("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ h[] f14445u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ kd.a f14446v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14447a;

    static {
        h[] hVarArrA = a();
        f14445u = hVarArrA;
        f14446v = kd.b.a(hVarArrA);
    }

    private h(String str, int i10, String str2) {
        this.f14447a = str2;
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f14435b, f14436c, f14437d, f14438e, f14439f, f14440g, f14441h, f14442r, f14443s, f14444t};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f14445u.clone();
    }

    public final String d() {
        return this.f14447a;
    }
}
