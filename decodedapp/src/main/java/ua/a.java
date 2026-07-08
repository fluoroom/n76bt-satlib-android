package ua;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28999a = new a("CURRENT_ACTIVITY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29000b = new a("FOREGROUND", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29001c = new a("BACKGROUND", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29002d = new a("ALL_TIME", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f29003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kd.a f29004f;

    static {
        a[] aVarArrA = a();
        f29003e = aVarArrA;
        f29004f = kd.b.a(aVarArrA);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f28999a, f29000b, f29001c, f29002d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f29003e.clone();
    }
}
