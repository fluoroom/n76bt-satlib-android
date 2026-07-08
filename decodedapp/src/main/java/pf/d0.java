package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f24150a = new d0("ALL", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f24151b = new d0("ONLY_NON_SYNTHESIZED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f24152c = new d0("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d0[] f24153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24154e;

    static {
        d0[] d0VarArrA = a();
        f24153d = d0VarArrA;
        f24154e = kd.b.a(d0VarArrA);
    }

    private d0(String str, int i10) {
    }

    private static final /* synthetic */ d0[] a() {
        return new d0[]{f24150a, f24151b, f24152c};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f24153d.clone();
    }
}
