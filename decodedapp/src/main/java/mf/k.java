package mf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f22084a = new k("BEGINNING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f22085b = new k("MIDDLE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f22086c = new k("AFTER_DOT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ k[] f22087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f22088e;

    static {
        k[] kVarArrA = a();
        f22087d = kVarArrA;
        f22088e = kd.b.a(kVarArrA);
    }

    private k(String str, int i10) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f22084a, f22085b, f22086c};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f22087d.clone();
    }
}
