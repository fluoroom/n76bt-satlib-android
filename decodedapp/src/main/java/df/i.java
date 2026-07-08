package df;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f10988a = new i("READ_ONLY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f10989b = new i("MUTABLE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ i[] f10990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ kd.a f10991d;

    static {
        i[] iVarArrA = a();
        f10990c = iVarArrA;
        f10991d = kd.b.a(iVarArrA);
    }

    private i(String str, int i10) {
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f10988a, f10989b};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f10990c.clone();
    }
}
