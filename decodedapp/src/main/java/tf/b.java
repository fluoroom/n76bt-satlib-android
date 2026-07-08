package tf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f27789a = new b("WARNING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f27790b = new b("ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f27791c = new b("HIDDEN", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f27792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f27793e;

    static {
        b[] bVarArrA = a();
        f27792d = bVarArrA;
        f27793e = kd.b.a(bVarArrA);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f27789a, f27790b, f27791c};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f27792d.clone();
    }
}
