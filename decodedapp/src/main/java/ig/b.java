package ig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16113a = new b("FOR_SUBTYPING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16114b = new b("FOR_INCORPORATION", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f16115c = new b("FROM_EXPRESSION", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f16116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f16117e;

    static {
        b[] bVarArrA = a();
        f16116d = bVarArrA;
        f16117e = kd.b.a(bVarArrA);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f16113a, f16114b, f16115c};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16116d.clone();
    }
}
