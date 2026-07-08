package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24130c = new a("NO_ARGUMENTS", 0, false, false, 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24131d = new a("UNLESS_EMPTY", 1, true, false, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24132e = new a("ALWAYS_PARENTHESIZED", 2, true, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f24133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24134g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24136b;

    static {
        a[] aVarArrA = a();
        f24133f = aVarArrA;
        f24134g = kd.b.a(aVarArrA);
    }

    private a(String str, int i10, boolean z10, boolean z11) {
        this.f24135a = z10;
        this.f24136b = z11;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f24130c, f24131d, f24132e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f24133f.clone();
    }

    public final boolean d() {
        return this.f24135a;
    }

    public final boolean e() {
        return this.f24136b;
    }

    /* synthetic */ a(String str, int i10, boolean z10, boolean z11, int i11, rd.h hVar) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }
}
