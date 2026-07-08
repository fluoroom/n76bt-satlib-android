package dd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10889a = new a("WARNING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10890b = new a("ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10891c = new a("HIDDEN", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f10892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f10893e;

    static {
        a[] aVarArrA = a();
        f10892d = aVarArrA;
        f10893e = kd.b.a(aVarArrA);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f10889a, f10890b, f10891c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10892d.clone();
    }
}
