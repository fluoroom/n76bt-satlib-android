package qe;

import jf.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f25003b = new g0("FINAL", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f25004c = new g0("OPEN", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f25005d = new g0("ABSTRACT", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f25006e = new g0("SEALED", 3, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ g0[] f25007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kd.a f25008g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.d f25009a;

    static {
        g0[] g0VarArrA = a();
        f25007f = g0VarArrA;
        f25008g = kd.b.a(g0VarArrA);
    }

    private g0(String str, int i10, int i11) {
        b.d dVar = jf.b.f18664e;
        rd.m.d(dVar, "MODALITY");
        this.f25009a = new re.d(dVar, i11);
    }

    private static final /* synthetic */ g0[] a() {
        return new g0[]{f25003b, f25004c, f25005d, f25006e};
    }

    public static kd.a d() {
        return f25008g;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f25007f.clone();
    }

    public final re.d e() {
        return this.f25009a;
    }
}
