package ee;

import ed.r0;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f11806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f11807g = new l("BOOLEAN", 0, "Boolean");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f11808h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f11809r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f11810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f11811t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l f11812u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f11813v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l f11814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ l[] f11815x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ kd.a f11816y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.f f11817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mf.f f11818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dd.j f11819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd.j f11820d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        l lVar = new l("CHAR", 1, "Char");
        f11808h = lVar;
        l lVar2 = new l("BYTE", 2, "Byte");
        f11809r = lVar2;
        l lVar3 = new l("SHORT", 3, "Short");
        f11810s = lVar3;
        l lVar4 = new l("INT", 4, "Int");
        f11811t = lVar4;
        l lVar5 = new l("FLOAT", 5, "Float");
        f11812u = lVar5;
        l lVar6 = new l("LONG", 6, "Long");
        f11813v = lVar6;
        l lVar7 = new l("DOUBLE", 7, "Double");
        f11814w = lVar7;
        l[] lVarArrA = a();
        f11815x = lVarArrA;
        f11816y = kd.b.a(lVarArrA);
        f11805e = new a(null);
        f11806f = r0.g(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7);
    }

    private l(String str, int i10, String str2) {
        mf.f fVarH = mf.f.h(str2);
        rd.m.d(fVarH, "identifier(...)");
        this.f11817a = fVarH;
        mf.f fVarH2 = mf.f.h(str2 + "Array");
        rd.m.d(fVarH2, "identifier(...)");
        this.f11818b = fVarH2;
        dd.n nVar = dd.n.f10910b;
        this.f11819c = dd.k.a(nVar, new j(this));
        this.f11820d = dd.k.a(nVar, new k(this));
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f11807g, f11808h, f11809r, f11810s, f11811t, f11812u, f11813v, f11814w};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf.c f(l lVar) {
        return o.B.b(lVar.f11818b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf.c k(l lVar) {
        return o.B.b(lVar.f11817a);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f11815x.clone();
    }

    public final mf.c g() {
        return (mf.c) this.f11820d.getValue();
    }

    public final mf.f h() {
        return this.f11818b;
    }

    public final mf.c i() {
        return (mf.c) this.f11819c.getValue();
    }

    public final mf.f j() {
        return this.f11817a;
    }
}
