package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f24919a = new a0("INVARIANT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f24920b = new a0("IN", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f24921c = new a0("OUT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a0[] f24922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24923e;

    static {
        a0[] a0VarArrA = a();
        f24922d = a0VarArrA;
        f24923e = kd.b.a(a0VarArrA);
    }

    private a0(String str, int i10) {
    }

    private static final /* synthetic */ a0[] a() {
        return new a0[]{f24919a, f24920b, f24921c};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f24922d.clone();
    }
}
