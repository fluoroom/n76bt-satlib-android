package af;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f434a = new c("INFLEXIBLE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f435b = new c("FLEXIBLE_UPPER_BOUND", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f436c = new c("FLEXIBLE_LOWER_BOUND", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f438e;

    static {
        c[] cVarArrA = a();
        f437d = cVarArrA;
        f438e = kd.b.a(cVarArrA);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f434a, f435b, f436c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f437d.clone();
    }
}
