package xi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final d A;
    private static final /* synthetic */ d[] B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f32211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f32212h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f32213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f32214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f32215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f32216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f32217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f32218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f32219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f32220y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f32221z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f32223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f32224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f32225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f32226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f32227f;

    static {
        e eVar = e.f32228a;
        e eVar2 = e.f32229b;
        e eVar3 = e.f32230c;
        d dVar = new d("XYZ", 0, eVar, eVar2, eVar3);
        f32211g = dVar;
        d dVar2 = new d("XZY", 1, eVar, eVar3, eVar2);
        f32212h = dVar2;
        d dVar3 = new d("YXZ", 2, eVar2, eVar, eVar3);
        f32213r = dVar3;
        d dVar4 = new d("YZX", 3, eVar2, eVar3, eVar);
        f32214s = dVar4;
        d dVar5 = new d("ZXY", 4, eVar3, eVar, eVar2);
        f32215t = dVar5;
        d dVar6 = new d("ZYX", 5, eVar3, eVar2, eVar);
        f32216u = dVar6;
        d dVar7 = new d("XYX", 6, eVar, eVar2, eVar);
        f32217v = dVar7;
        d dVar8 = new d("XZX", 7, eVar, eVar3, eVar);
        f32218w = dVar8;
        d dVar9 = new d("YXY", 8, eVar2, eVar, eVar2);
        f32219x = dVar9;
        d dVar10 = new d("YZY", 9, eVar2, eVar3, eVar2);
        f32220y = dVar10;
        d dVar11 = new d("ZXZ", 10, eVar3, eVar, eVar3);
        f32221z = dVar11;
        d dVar12 = new d("ZYZ", 11, eVar3, eVar2, eVar3);
        A = dVar12;
        B = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12};
    }

    private d(String str, int i10, e eVar, e eVar2, e eVar3) {
        this.f32222a = eVar.name() + eVar2.name() + eVar3.name();
        this.f32223b = eVar;
        this.f32224c = eVar2;
        this.f32225d = eVar3;
        if (eVar == eVar3) {
            e eVar4 = e.f32228a;
            if (eVar == eVar4 || eVar2 == eVar4) {
                e eVar5 = e.f32229b;
                if (eVar == eVar5 || eVar2 == eVar5) {
                    this.f32226e = e.f32230c;
                } else {
                    this.f32226e = eVar5;
                }
            } else {
                this.f32226e = eVar4;
            }
        } else {
            this.f32226e = null;
        }
        f fVarA = eVar.a();
        f fVarA2 = eVar2.a();
        e eVar6 = this.f32226e;
        this.f32227f = aj.d.m(1.0d, f.f(eVar6 == null ? eVar3.a() : eVar6.a(), f.d(fVarA, fVarA2)));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) B.clone();
    }

    public f a() {
        return this.f32223b.a();
    }

    public f d() {
        return this.f32224c.a();
    }

    public f e() {
        return this.f32225d.a();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f32222a;
    }
}
