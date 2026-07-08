package yd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f32530a = new p("INVARIANT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f32531b = new p("IN", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f32532c = new p("OUT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ p[] f32533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f32534e;

    static {
        p[] pVarArrA = a();
        f32533d = pVarArrA;
        f32534e = kd.b.a(pVarArrA);
    }

    private p(String str, int i10) {
    }

    private static final /* synthetic */ p[] a() {
        return new p[]{f32530a, f32531b, f32532c};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f32533d.clone();
    }
}
