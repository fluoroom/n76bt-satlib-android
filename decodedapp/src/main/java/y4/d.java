package y4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f32412a = new d("NO_CHANGE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f32413b = new d("L", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f32414c = new d("M", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f32415d = new d("H", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ d[] f32416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kd.a f32417f;

    static {
        d[] dVarArrA = a();
        f32416e = dVarArrA;
        f32417f = kd.b.a(dVarArrA);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f32412a, f32413b, f32414c, f32415d};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f32416e.clone();
    }
}
