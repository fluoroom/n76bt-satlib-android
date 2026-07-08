package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f24943a = new d0("WARNING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f24944b = new d0("ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f24945c = new d0("HIDDEN", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d0[] f24946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24947e;

    static {
        d0[] d0VarArrA = a();
        f24946d = d0VarArrA;
        f24947e = kd.b.a(d0VarArrA);
    }

    private d0(String str, int i10) {
    }

    private static final /* synthetic */ d0[] a() {
        return new d0[]{f24943a, f24944b, f24945c};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f24946d.clone();
    }
}
