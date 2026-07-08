package qe;

import jf.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f25013b = new h0("INTERNAL", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f25014c = new h0("PRIVATE", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f25015d = new h0("PROTECTED", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h0 f25016e = new h0("PUBLIC", 3, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f25017f = new h0("PRIVATE_TO_THIS", 4, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h0 f25018g = new h0("LOCAL", 5, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ h0[] f25019h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ kd.a f25020r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.d f25021a;

    static {
        h0[] h0VarArrA = a();
        f25019h = h0VarArrA;
        f25020r = kd.b.a(h0VarArrA);
    }

    private h0(String str, int i10, int i11) {
        b.d dVar = jf.b.f18663d;
        rd.m.d(dVar, "VISIBILITY");
        this.f25021a = new re.d(dVar, i11);
    }

    private static final /* synthetic */ h0[] a() {
        return new h0[]{f25013b, f25014c, f25015d, f25016e, f25017f, f25018g};
    }

    public static kd.a d() {
        return f25020r;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f25019h.clone();
    }

    public final re.d e() {
        return this.f25021a;
    }
}
