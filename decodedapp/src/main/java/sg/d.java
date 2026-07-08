package sg;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f27364b = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f27365c = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f27366d = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f27367e = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f27368f = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f27369g = new d("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f27370h = new d("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ d[] f27371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ kd.a f27372s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f27373a;

    static {
        d[] dVarArrA = a();
        f27371r = dVarArrA;
        f27372s = kd.b.a(dVarArrA);
    }

    private d(String str, int i10, TimeUnit timeUnit) {
        this.f27373a = timeUnit;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f27364b, f27365c, f27366d, f27367e, f27368f, f27369g, f27370h};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f27371r.clone();
    }

    public final TimeUnit d() {
        return this.f27373a;
    }
}
