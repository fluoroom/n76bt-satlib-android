package ee;

import mf.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f11914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f11915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f11916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f11917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ q[] f11918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kd.a f11919h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.b f11920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mf.f f11921b;

    static {
        b.a aVar = mf.b.f21989d;
        f11914c = new q("UBYTEARRAY", 0, b.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        f11915d = new q("USHORTARRAY", 1, b.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        f11916e = new q("UINTARRAY", 2, b.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        f11917f = new q("ULONGARRAY", 3, b.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        q[] qVarArrA = a();
        f11918g = qVarArrA;
        f11919h = kd.b.a(qVarArrA);
    }

    private q(String str, int i10, mf.b bVar) {
        this.f11920a = bVar;
        this.f11921b = bVar.h();
    }

    private static final /* synthetic */ q[] a() {
        return new q[]{f11914c, f11915d, f11916e, f11917f};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f11918g.clone();
    }

    public final mf.f d() {
        return this.f11921b;
    }
}
