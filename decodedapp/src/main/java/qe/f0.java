package qe;

import jf.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f24977b = new f0("DECLARATION", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f24978c = new f0("FAKE_OVERRIDE", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f24979d = new f0("DELEGATION", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0 f24980e = new f0("SYNTHESIZED", 3, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ f0[] f24981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24982g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.d f24983a;

    static {
        f0[] f0VarArrA = a();
        f24981f = f0VarArrA;
        f24982g = kd.b.a(f0VarArrA);
    }

    private f0(String str, int i10, int i11) {
        b.d dVar = jf.b.f18675p;
        rd.m.d(dVar, "MEMBER_KIND");
        this.f24983a = new re.d(dVar, i11);
    }

    private static final /* synthetic */ f0[] a() {
        return new f0[]{f24977b, f24978c, f24979d, f24980e};
    }

    public static kd.a d() {
        return f24982g;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f24981f.clone();
    }

    public final re.d e() {
        return this.f24983a;
    }
}
