package ie;

import dd.w;
import ed.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    private static final List A;
    private static final Map B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f16079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f16081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f16083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f16085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f16087h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final List f16098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final List f16100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f16102t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final /* synthetic */ r[] f16103t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List f16104u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final /* synthetic */ kd.a f16105u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List f16106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f16107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List f16108x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List f16109y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List f16110z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16112b;
    public static final r C = new r("CLASS", 0, Name.LABEL, false, 2, null);
    public static final r D = new r("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final r E = new r("TYPE_PARAMETER", 2, "type parameter", false);
    public static final r F = new r("PROPERTY", 3, "property", false, 2, null);
    public static final r G = new r("FIELD", 4, "field", false, 2, null);
    public static final r H = new r("LOCAL_VARIABLE", 5, "local variable", false, 2, null);
    public static final r I = new r("VALUE_PARAMETER", 6, "value parameter", false, 2, null);
    public static final r J = new r("CONSTRUCTOR", 7, "constructor", false, 2, null);
    public static final r K = new r("FUNCTION", 8, "function", false, 2, null);
    public static final r L = new r("PROPERTY_GETTER", 9, "getter", false, 2, null);
    public static final r M = new r("PROPERTY_SETTER", 10, "setter", false, 2, null);
    public static final r N = new r("TYPE", 11, "type usage", false);
    public static final r O = new r("EXPRESSION", 12, "expression", false);
    public static final r P = new r("FILE", 13, "file", false);
    public static final r Q = new r("TYPEALIAS", 14, "typealias", false);
    public static final r R = new r("TYPE_PROJECTION", 15, "type projection", false);
    public static final r S = new r("STAR_PROJECTION", 16, "star projection", false);
    public static final r T = new r("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final r U = new r("CLASS_ONLY", 18, Name.LABEL, false);
    public static final r V = new r("OBJECT", 19, "object", false);
    public static final r W = new r("STANDALONE_OBJECT", 20, "standalone object", false);
    public static final r X = new r("COMPANION_OBJECT", 21, "companion object", false);
    public static final r Y = new r("INTERFACE", 22, "interface", false);
    public static final r Z = new r("ENUM_CLASS", 23, "enum class", false);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final r f16075a0 = new r("ENUM_ENTRY", 24, "enum entry", false);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final r f16076b0 = new r("LOCAL_CLASS", 25, "local class", false);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final r f16078c0 = new r("LOCAL_FUNCTION", 26, "local function", false);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final r f16080d0 = new r("MEMBER_FUNCTION", 27, "member function", false);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final r f16082e0 = new r("TOP_LEVEL_FUNCTION", 28, "top level function", false);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final r f16084f0 = new r("MEMBER_PROPERTY", 29, "member property", false);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final r f16086g0 = new r("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final r f16088h0 = new r("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final r f16089i0 = new r("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final r f16090j0 = new r("TOP_LEVEL_PROPERTY", 33, "top level property", false);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final r f16091k0 = new r("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final r f16092l0 = new r("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final r f16093m0 = new r("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final r f16094n0 = new r("BACKING_FIELD", 37, "backing field", false, 2, null);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final r f16095o0 = new r("INITIALIZER", 38, "initializer", false);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r f16096p0 = new r("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final r f16097q0 = new r("LAMBDA_EXPRESSION", 40, "lambda expression", false);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final r f16099r0 = new r("ANONYMOUS_FUNCTION", 41, "anonymous function", false);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final r f16101s0 = new r("OBJECT_LITERAL", 42, "object literal", false);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        r[] rVarArrA = a();
        f16103t0 = rVarArrA;
        f16105u0 = kd.b.a(rVarArrA);
        f16077c = new a(null);
        f16079d = new HashMap();
        for (r rVar : d()) {
            f16079d.put(rVar.name(), rVar);
        }
        kd.a aVarD = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : aVarD) {
            if (((r) obj).f16112b) {
                arrayList.add(obj);
            }
        }
        f16081e = ed.q.M0(arrayList);
        f16083f = ed.q.M0(d());
        r rVar2 = C;
        f16085g = ed.q.n(D, rVar2);
        f16087h = ed.q.n(f16076b0, rVar2);
        f16098r = ed.q.n(U, rVar2);
        r rVar3 = V;
        f16100s = ed.q.n(X, rVar3, rVar2);
        f16102t = ed.q.n(W, rVar3, rVar2);
        f16104u = ed.q.n(Y, rVar2);
        f16106v = ed.q.n(Z, rVar2);
        r rVar4 = F;
        r rVar5 = G;
        f16107w = ed.q.n(f16075a0, rVar4, rVar5);
        r rVar6 = M;
        f16108x = ed.q.e(rVar6);
        r rVar7 = L;
        f16109y = ed.q.e(rVar7);
        f16110z = ed.q.e(K);
        r rVar8 = P;
        A = ed.q.e(rVar8);
        e eVar = e.f16042r;
        r rVar9 = I;
        B = k0.l(w.a(eVar, rVar9), w.a(e.f16036c, rVar5), w.a(e.f16038e, rVar4), w.a(e.f16037d, rVar8), w.a(e.f16039f, rVar7), w.a(e.f16040g, rVar6), w.a(e.f16041h, rVar9), w.a(e.f16043s, rVar9), w.a(e.f16044t, rVar5));
    }

    private r(String str, int i10, String str2, boolean z10) {
        this.f16111a = str2;
        this.f16112b = z10;
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, f16075a0, f16076b0, f16078c0, f16080d0, f16082e0, f16084f0, f16086g0, f16088h0, f16089i0, f16090j0, f16091k0, f16092l0, f16093m0, f16094n0, f16095o0, f16096p0, f16097q0, f16099r0, f16101s0};
    }

    public static kd.a d() {
        return f16105u0;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f16103t0.clone();
    }

    /* synthetic */ r(String str, int i10, String str2, boolean z10, int i11, rd.h hVar) {
        this(str, i10, str2, (i11 & 2) != 0 ? true : z10);
    }
}
