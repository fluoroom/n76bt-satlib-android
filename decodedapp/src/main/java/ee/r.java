package ee;

import mf.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f11922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f11923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f11924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f11925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ r[] f11926h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ kd.a f11927r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.b f11928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mf.f f11929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mf.b f11930c;

    static {
        b.a aVar = mf.b.f21989d;
        f11922d = new r("UBYTE", 0, b.a.b(aVar, "kotlin/UByte", false, 2, null));
        f11923e = new r("USHORT", 1, b.a.b(aVar, "kotlin/UShort", false, 2, null));
        f11924f = new r("UINT", 2, b.a.b(aVar, "kotlin/UInt", false, 2, null));
        f11925g = new r("ULONG", 3, b.a.b(aVar, "kotlin/ULong", false, 2, null));
        r[] rVarArrA = a();
        f11926h = rVarArrA;
        f11927r = kd.b.a(rVarArrA);
    }

    private r(String str, int i10, mf.b bVar) {
        this.f11928a = bVar;
        mf.f fVarH = bVar.h();
        this.f11929b = fVarH;
        mf.c cVarF = bVar.f();
        mf.f fVarH2 = mf.f.h(fVarH.d() + "Array");
        rd.m.d(fVarH2, "identifier(...)");
        this.f11930c = new mf.b(cVarF, fVarH2);
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f11922d, f11923e, f11924f, f11925g};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f11926h.clone();
    }

    public final mf.b d() {
        return this.f11930c;
    }

    public final mf.b e() {
        return this.f11928a;
    }

    public final mf.f f() {
        return this.f11929b;
    }
}
