package qe;

import jf.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f24924b = new b("CLASS", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f24925c = new b("INTERFACE", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f24926d = new b("ENUM_CLASS", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f24927e = new b("ENUM_ENTRY", 3, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f24928f = new b("ANNOTATION_CLASS", 4, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f24929g = new b("OBJECT", 5, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f24930h = new b("COMPANION_OBJECT", 6, 6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ b[] f24931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24932s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.d f24933a;

    static {
        b[] bVarArrA = a();
        f24931r = bVarArrA;
        f24932s = kd.b.a(bVarArrA);
    }

    private b(String str, int i10, int i11) {
        b.d dVar = jf.b.f18665f;
        rd.m.d(dVar, "CLASS_KIND");
        this.f24933a = new re.d(dVar, i11);
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f24924b, f24925c, f24926d, f24927e, f24928f, f24929g, f24930h};
    }

    public static kd.a d() {
        return f24932s;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f24931r.clone();
    }

    public final re.d e() {
        return this.f24933a;
    }
}
