package pf;

import ed.r0;
import he.s1;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import pf.b;
import pf.n;
import pf.w;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements w {
    static final /* synthetic */ yd.j[] Z = {rd.c0.d(new rd.q(z.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), rd.c0.d(new rd.q(z.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), rd.c0.d(new rd.q(z.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), rd.c0.d(new rd.q(z.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), rd.c0.d(new rd.q(z.class, "startFromName", "getStartFromName()Z", 0)), rd.c0.d(new rd.q(z.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), rd.c0.d(new rd.q(z.class, "debugMode", "getDebugMode()Z", 0)), rd.c0.d(new rd.q(z.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), rd.c0.d(new rd.q(z.class, "verbose", "getVerbose()Z", 0)), rd.c0.d(new rd.q(z.class, "unitReturnType", "getUnitReturnType()Z", 0)), rd.c0.d(new rd.q(z.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), rd.c0.d(new rd.q(z.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), rd.c0.d(new rd.q(z.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), rd.c0.d(new rd.q(z.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), rd.c0.d(new rd.q(z.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), rd.c0.d(new rd.q(z.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), rd.c0.d(new rd.q(z.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), rd.c0.d(new rd.q(z.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), rd.c0.d(new rd.q(z.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), rd.c0.d(new rd.q(z.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), rd.c0.d(new rd.q(z.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), rd.c0.d(new rd.q(z.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), rd.c0.d(new rd.q(z.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), rd.c0.d(new rd.q(z.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), rd.c0.d(new rd.q(z.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), rd.c0.d(new rd.q(z.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), rd.c0.d(new rd.q(z.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), rd.c0.d(new rd.q(z.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), rd.c0.d(new rd.q(z.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), rd.c0.d(new rd.q(z.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), rd.c0.d(new rd.q(z.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), rd.c0.d(new rd.q(z.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), rd.c0.d(new rd.q(z.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), rd.c0.d(new rd.q(z.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), rd.c0.d(new rd.q(z.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), rd.c0.d(new rd.q(z.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), rd.c0.d(new rd.q(z.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), rd.c0.d(new rd.q(z.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), rd.c0.d(new rd.q(z.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), rd.c0.d(new rd.q(z.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), rd.c0.d(new rd.q(z.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), rd.c0.d(new rd.q(z.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), rd.c0.d(new rd.q(z.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), rd.c0.d(new rd.q(z.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), rd.c0.d(new rd.q(z.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), rd.c0.d(new rd.q(z.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), rd.c0.d(new rd.q(z.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), rd.c0.d(new rd.q(z.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), rd.c0.d(new rd.q(z.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), rd.c0.d(new rd.q(z.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};
    private final ud.d A;
    private final ud.d B;
    private final ud.d C;
    private final ud.d D;
    private final ud.d E;
    private final ud.d F;
    private final ud.d G;
    private final ud.d H;
    private final ud.d I;
    private final ud.d J;
    private final ud.d K;
    private final ud.d L;
    private final ud.d M;
    private final ud.d N;
    private final ud.d O;
    private final ud.d P;
    private final ud.d Q;
    private final ud.d R;
    private final ud.d S;
    private final ud.d T;
    private final ud.d U;
    private final ud.d V;
    private final ud.d W;
    private final ud.d X;
    private final ud.d Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ud.d f24219b = r0(b.c.f24141a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ud.d f24220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ud.d f24221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ud.d f24222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ud.d f24223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ud.d f24224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ud.d f24225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ud.d f24226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ud.d f24227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ud.d f24228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ud.d f24229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ud.d f24230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ud.d f24231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ud.d f24232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ud.d f24233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ud.d f24234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ud.d f24235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ud.d f24236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ud.d f24237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ud.d f24238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ud.d f24239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ud.d f24240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ud.d f24241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ud.d f24242y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ud.d f24243z;

    public static final class a extends ud.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f24244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, z zVar) {
            super(obj);
            this.f24244b = zVar;
        }

        @Override // ud.b
        protected boolean d(yd.j jVar, Object obj, Object obj2) {
            rd.m.e(jVar, "property");
            if (this.f24244b.p0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public z() {
        Boolean bool = Boolean.TRUE;
        this.f24220c = r0(bool);
        this.f24221d = r0(bool);
        this.f24222e = r0(v.f24200c);
        Boolean bool2 = Boolean.FALSE;
        this.f24223f = r0(bool2);
        this.f24224g = r0(bool2);
        this.f24225h = r0(bool2);
        this.f24226i = r0(bool2);
        this.f24227j = r0(bool2);
        this.f24228k = r0(bool);
        this.f24229l = r0(bool2);
        this.f24230m = r0(bool2);
        this.f24231n = r0(bool2);
        this.f24232o = r0(bool);
        this.f24233p = r0(bool);
        this.f24234q = r0(bool2);
        this.f24235r = r0(bool2);
        this.f24236s = r0(bool2);
        this.f24237t = r0(bool2);
        this.f24238u = r0(bool2);
        this.f24239v = r0(null);
        this.f24240w = r0(bool2);
        this.f24241x = r0(bool2);
        this.f24242y = r0(x.f24216a);
        this.f24243z = r0(y.f24217a);
        this.A = r0(bool);
        this.B = r0(c0.f24145b);
        this.C = r0(n.b.a.f24186a);
        this.D = r0(f0.f24162a);
        this.E = r0(d0.f24150a);
        this.F = r0(bool2);
        this.G = r0(bool2);
        this.H = r0(e0.f24157b);
        this.I = r0(bool2);
        this.J = r0(bool2);
        this.K = r0(r0.d());
        this.L = r0(a0.f24137a.a());
        this.M = r0(null);
        this.N = r0(pf.a.f24130c);
        this.O = r0(bool2);
        this.P = r0(bool);
        this.Q = r0(bool);
        this.R = r0(bool2);
        this.S = r0(bool2);
        this.T = r0(bool);
        this.U = r0(bool);
        this.V = r0(bool2);
        this.W = r0(bool2);
        this.X = r0(bool2);
        this.Y = r0(bool);
    }

    private final ud.d r0(Object obj) {
        ud.a aVar = ud.a.f29110a;
        return new a(obj, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eg.r0 s0(eg.r0 r0Var) {
        rd.m.e(r0Var, "it");
        return r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(s1 s1Var) {
        rd.m.e(s1Var, "it");
        return "...";
    }

    public qd.l A() {
        return (qd.l) this.f24243z.a(this, Z[24]);
    }

    public boolean B() {
        return ((Boolean) this.J.a(this, Z[34])).booleanValue();
    }

    public Set C() {
        return (Set) this.K.a(this, Z[35]);
    }

    public boolean D() {
        return ((Boolean) this.T.a(this, Z[44])).booleanValue();
    }

    public boolean E() {
        return w.a.a(this);
    }

    public boolean F() {
        return w.a.b(this);
    }

    public boolean G() {
        return ((Boolean) this.f24238u.a(this, Z[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.Y.a(this, Z[49])).booleanValue();
    }

    public Set I() {
        return (Set) this.f24222e.a(this, Z[3]);
    }

    public boolean J() {
        return ((Boolean) this.f24231n.a(this, Z[12])).booleanValue();
    }

    public c0 K() {
        return (c0) this.B.a(this, Z[26]);
    }

    public d0 L() {
        return (d0) this.E.a(this, Z[29]);
    }

    public boolean M() {
        return ((Boolean) this.U.a(this, Z[45])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.W.a(this, Z[47])).booleanValue();
    }

    public e0 O() {
        return (e0) this.H.a(this, Z[32]);
    }

    public qd.l P() {
        return (qd.l) this.f24239v.a(this, Z[20]);
    }

    public boolean Q() {
        return ((Boolean) this.F.a(this, Z[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.S.a(this, Z[43])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.G.a(this, Z[31])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f24234q.a(this, Z[15])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.P.a(this, Z[40])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.I.a(this, Z[33])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f24233p.a(this, Z[14])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f24232o.a(this, Z[13])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f24235r.a(this, Z[16])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.R.a(this, Z[42])).booleanValue();
    }

    @Override // pf.w
    public void a(Set set) {
        rd.m.e(set, "<set-?>");
        this.L.b(this, Z[36], set);
    }

    public boolean a0() {
        return ((Boolean) this.Q.a(this, Z[41])).booleanValue();
    }

    @Override // pf.w
    public void b(boolean z10) {
        this.f24223f.b(this, Z[4], Boolean.valueOf(z10));
    }

    public boolean b0() {
        return ((Boolean) this.A.a(this, Z[25])).booleanValue();
    }

    @Override // pf.w
    public void c(Set set) {
        rd.m.e(set, "<set-?>");
        this.f24222e.b(this, Z[3], set);
    }

    public boolean c0() {
        return ((Boolean) this.f24224g.a(this, Z[5])).booleanValue();
    }

    @Override // pf.w
    public void d(boolean z10) {
        this.f24220c.b(this, Z[1], Boolean.valueOf(z10));
    }

    public boolean d0() {
        return ((Boolean) this.f24223f.a(this, Z[4])).booleanValue();
    }

    @Override // pf.w
    public boolean e() {
        return ((Boolean) this.f24230m.a(this, Z[11])).booleanValue();
    }

    public f0 e0() {
        return (f0) this.D.a(this, Z[28]);
    }

    @Override // pf.w
    public void f(boolean z10) {
        this.f24241x.b(this, Z[22], Boolean.valueOf(z10));
    }

    public qd.l f0() {
        return (qd.l) this.f24242y.a(this, Z[23]);
    }

    @Override // pf.w
    public void g(boolean z10) {
        this.f24225h.b(this, Z[6], Boolean.valueOf(z10));
    }

    public boolean g0() {
        return ((Boolean) this.f24237t.a(this, Z[18])).booleanValue();
    }

    @Override // pf.w
    public void h(boolean z10) {
        this.G.b(this, Z[31], Boolean.valueOf(z10));
    }

    public boolean h0() {
        return ((Boolean) this.f24228k.a(this, Z[9])).booleanValue();
    }

    @Override // pf.w
    public void i(boolean z10) {
        this.F.b(this, Z[30], Boolean.valueOf(z10));
    }

    public n.b i0() {
        return (n.b) this.C.a(this, Z[27]);
    }

    @Override // pf.w
    public void j(d0 d0Var) {
        rd.m.e(d0Var, "<set-?>");
        this.E.b(this, Z[29], d0Var);
    }

    public boolean j0() {
        return ((Boolean) this.f24227j.a(this, Z[8])).booleanValue();
    }

    @Override // pf.w
    public Set k() {
        return (Set) this.L.a(this, Z[36]);
    }

    public boolean k0() {
        return ((Boolean) this.f24220c.a(this, Z[1])).booleanValue();
    }

    @Override // pf.w
    public boolean l() {
        return ((Boolean) this.f24225h.a(this, Z[6])).booleanValue();
    }

    public boolean l0() {
        return ((Boolean) this.f24221d.a(this, Z[2])).booleanValue();
    }

    @Override // pf.w
    public pf.a m() {
        return (pf.a) this.N.a(this, Z[38]);
    }

    public boolean m0() {
        return ((Boolean) this.f24229l.a(this, Z[10])).booleanValue();
    }

    @Override // pf.w
    public void n(f0 f0Var) {
        rd.m.e(f0Var, "<set-?>");
        this.D.b(this, Z[28], f0Var);
    }

    public boolean n0() {
        return ((Boolean) this.f24241x.a(this, Z[22])).booleanValue();
    }

    @Override // pf.w
    public void o(boolean z10) {
        this.f24240w.b(this, Z[21], Boolean.valueOf(z10));
    }

    public boolean o0() {
        return ((Boolean) this.f24240w.a(this, Z[21])).booleanValue();
    }

    @Override // pf.w
    public void p(b bVar) {
        rd.m.e(bVar, "<set-?>");
        this.f24219b.b(this, Z[0], bVar);
    }

    public final boolean p0() {
        return this.f24218a;
    }

    public final void q0() {
        this.f24218a = true;
    }

    public final z s() {
        z zVar = new z();
        Iterator itA = rd.c.a(z.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ud.b bVar = obj instanceof ud.b ? (ud.b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    rd.m.d(name, "getName(...)");
                    rg.q.J(name, "is", false, 2, null);
                    yd.c cVarB = rd.c0.b(z.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    rd.m.d(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        rd.m.d(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(zVar, zVar.r0(bVar.a(this, new rd.w(cVarB, name2, sb2.toString()))));
                }
            }
        }
        return zVar;
    }

    public boolean u() {
        return ((Boolean) this.f24236s.a(this, Z[17])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.O.a(this, Z[39])).booleanValue();
    }

    public qd.l w() {
        return (qd.l) this.M.a(this, Z[37]);
    }

    public boolean x() {
        return ((Boolean) this.X.a(this, Z[48])).booleanValue();
    }

    public boolean y() {
        return ((Boolean) this.f24226i.a(this, Z[7])).booleanValue();
    }

    public b z() {
        return (b) this.f24219b.a(this, Z[0]);
    }
}
