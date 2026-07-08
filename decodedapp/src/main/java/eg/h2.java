package eg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f12103a = new h2("SUPERTYPE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2 f12104b = new h2("COMMON", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ h2[] f12105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ kd.a f12106d;

    static {
        h2[] h2VarArrA = a();
        f12105c = h2VarArrA;
        f12106d = kd.b.a(h2VarArrA);
    }

    private h2(String str, int i10) {
    }

    private static final /* synthetic */ h2[] a() {
        return new h2[]{f12103a, f12104b};
    }

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) f12105c.clone();
    }
}
