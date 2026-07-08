package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f24144a = new c0("RENDER_OVERRIDE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f24145b = new c0("RENDER_OPEN", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f24146c = new c0("RENDER_OPEN_OVERRIDE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c0[] f24147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24148e;

    static {
        c0[] c0VarArrA = a();
        f24147d = c0VarArrA;
        f24148e = kd.b.a(c0VarArrA);
    }

    private c0(String str, int i10) {
    }

    private static final /* synthetic */ c0[] a() {
        return new c0[]{f24144a, f24145b, f24146c};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f24147d.clone();
    }
}
