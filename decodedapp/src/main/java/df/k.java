package df;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f10997a = new k("FORCE_FLEXIBILITY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f10998b = new k("NULLABLE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f10999c = new k("NOT_NULL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ k[] f11000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f11001e;

    static {
        k[] kVarArrA = a();
        f11000d = kVarArrA;
        f11001e = kd.b.a(kVarArrA);
    }

    private k(String str, int i10) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f10997a, f10998b, f10999c};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f11000d.clone();
    }
}
