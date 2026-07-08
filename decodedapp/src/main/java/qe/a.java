package qe;

import java.util.ArrayList;
import java.util.Iterator;
import jf.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private static final re.a A;
    private static final re.a B;
    private static final re.a C;
    private static final re.a D;
    private static final re.a E;
    private static final re.a F;
    private static final re.b G;
    private static final re.b H;
    private static final re.b I;
    private static final re.a J;
    private static final re.a K;
    private static final re.a L;
    private static final re.a M;
    private static final re.a N;
    private static final re.a O;
    private static final re.a P;
    private static final re.b Q;
    private static final re.b R;
    private static final re.a S;
    private static final re.a T;
    private static final re.a U;
    private static final re.a V;
    private static final re.a W;
    private static final re.a X;
    private static final re.a Y;
    private static final re.b Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f24872a = {rd.c0.d(new rd.q(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1)), rd.c0.d(new rd.q(a.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1)), rd.c0.d(new rd.q(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1)), rd.c0.d(new rd.q(a.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1)), rd.c0.d(new rd.q(a.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1)), rd.c0.d(new rd.q(a.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1)), rd.c0.d(new rd.q(a.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1)), rd.c0.d(new rd.q(a.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1)), rd.c0.d(new rd.q(a.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1)), rd.c0.d(new rd.q(a.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1)), rd.c0.d(new rd.q(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1)), rd.c0.d(new rd.q(a.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1)), rd.c0.d(new rd.q(a.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1)), rd.c0.d(new rd.q(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1)), rd.c0.d(new rd.q(a.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1)), rd.c0.d(new rd.q(a.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1)), rd.c0.d(new rd.q(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1)), rd.c0.d(new rd.q(a.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1)), rd.c0.d(new rd.q(a.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1)), rd.c0.d(new rd.q(a.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1)), rd.c0.d(new rd.q(a.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1)), rd.c0.d(new rd.q(a.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1)), rd.c0.d(new rd.q(a.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1)), rd.c0.d(new rd.q(a.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1)), rd.c0.d(new rd.q(a.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1)), rd.c0.d(new rd.q(a.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1)), rd.c0.d(new rd.q(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1)), rd.c0.d(new rd.q(a.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1)), rd.c0.d(new rd.q(a.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), rd.c0.d(new rd.q(a.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), rd.c0.d(new rd.q(a.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), rd.c0.d(new rd.q(a.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1)), rd.c0.d(new rd.q(a.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1)), rd.c0.d(new rd.q(a.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1)), rd.c0.d(new rd.q(a.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1)), rd.c0.d(new rd.q(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1)), rd.c0.d(new rd.q(a.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1)), rd.c0.d(new rd.q(a.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), rd.c0.d(new rd.q(a.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), rd.c0.d(new rd.q(a.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1)), rd.c0.d(new rd.q(a.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1))};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final re.a f24873a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final re.a f24874b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final re.a f24875b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final re.a f24876c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final re.a f24877c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final re.a f24878d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final re.a f24879d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final re.a f24880e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final re.a f24881e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final re.a f24882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final re.a f24883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final re.a f24884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final re.b f24885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final re.b f24886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final re.b f24887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final re.a f24888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final re.a f24889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final re.a f24890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final re.a f24891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final re.a f24892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final re.a f24893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final re.a f24894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final re.b f24895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final re.a f24896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final re.a f24897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final re.b f24898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final re.b f24899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final re.b f24900x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final re.a f24901y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final re.a f24902z;

    static {
        b.C0243b c0243b = jf.b.f18662c;
        rd.m.d(c0243b, "HAS_ANNOTATIONS");
        f24874b = re.c.a(new re.d(c0243b));
        rd.m.d(c0243b, "HAS_ANNOTATIONS");
        f24876c = re.c.b(new re.d(c0243b));
        rd.m.d(c0243b, "HAS_ANNOTATIONS");
        f24878d = re.c.c(new re.d(c0243b));
        rd.m.d(c0243b, "HAS_ANNOTATIONS");
        f24880e = re.c.g(new re.d(c0243b));
        rd.m.d(c0243b, "HAS_ANNOTATIONS");
        f24882f = re.c.f(new re.d(c0243b));
        rd.m.d(c0243b, "HAS_ANNOTATIONS");
        f24883g = re.c.j(new re.d(c0243b));
        rd.m.d(c0243b, "HAS_ANNOTATIONS");
        f24884h = re.c.h(new re.d(c0243b));
        f24885i = re.c.e(new rd.q() { // from class: qe.a.i
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((qe.g) obj).i());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((qe.g) obj).r(((Number) obj2).intValue());
            }
        });
        f24886j = re.c.k(new rd.q() { // from class: qe.a.o
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((qe.g) obj).i());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((qe.g) obj).r(((Number) obj2).intValue());
            }
        });
        e eVar = new rd.q() { // from class: qe.a.e
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((qe.g) obj).i());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((qe.g) obj).r(((Number) obj2).intValue());
            }
        };
        b.d dVar = jf.b.f18665f;
        rd.m.d(dVar, "CLASS_KIND");
        kd.a aVarD = qe.b.d();
        kd.a aVarD2 = qe.b.d();
        ArrayList arrayList = new ArrayList(ed.q.v(aVarD2, 10));
        Iterator<E> it = aVarD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((qe.b) it.next()).e());
        }
        f24887k = new re.b(eVar, dVar, aVarD, arrayList);
        b.C0243b c0243b2 = jf.b.f18666g;
        rd.m.d(c0243b2, "IS_INNER");
        f24888l = re.c.a(new re.d(c0243b2));
        b.C0243b c0243b3 = jf.b.f18667h;
        rd.m.d(c0243b3, "IS_DATA");
        f24889m = re.c.a(new re.d(c0243b3));
        b.C0243b c0243b4 = jf.b.f18668i;
        rd.m.d(c0243b4, "IS_EXTERNAL_CLASS");
        f24890n = re.c.a(new re.d(c0243b4));
        b.C0243b c0243b5 = jf.b.f18669j;
        rd.m.d(c0243b5, "IS_EXPECT_CLASS");
        f24891o = re.c.a(new re.d(c0243b5));
        b.C0243b c0243b6 = jf.b.f18670k;
        rd.m.d(c0243b6, "IS_VALUE_CLASS");
        f24892p = re.c.a(new re.d(c0243b6));
        b.C0243b c0243b7 = jf.b.f18671l;
        rd.m.d(c0243b7, "IS_FUN_INTERFACE");
        f24893q = re.c.a(new re.d(c0243b7));
        b.C0243b c0243b8 = jf.b.f18672m;
        rd.m.d(c0243b8, "HAS_ENUM_ENTRIES");
        f24894r = re.c.a(new re.d(c0243b8));
        f24895s = re.c.k(new rd.q() { // from class: qe.a.p
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((qe.j) obj).c());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((qe.j) obj).f(((Number) obj2).intValue());
            }
        });
        b.C0243b c0243b9 = jf.b.f18673n;
        rd.m.d(c0243b9, "IS_SECONDARY");
        f24896t = re.c.b(new re.d(c0243b9));
        b.C0243b c0243b10 = jf.b.f18674o;
        rd.m.d(c0243b10, "IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES");
        f24897u = re.c.b(new re.d(c0243b10));
        f24898v = re.c.d(new rd.q() { // from class: qe.a.f
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((s) obj).e());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((s) obj).j(((Number) obj2).intValue());
            }
        });
        f24899w = re.c.k(new rd.q() { // from class: qe.a.k
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((s) obj).e());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((s) obj).j(((Number) obj2).intValue());
            }
        });
        f24900x = re.c.e(new rd.q() { // from class: qe.a.j
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((s) obj).e());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((s) obj).j(((Number) obj2).intValue());
            }
        });
        b.C0243b c0243b11 = jf.b.f18676q;
        rd.m.d(c0243b11, "IS_OPERATOR");
        f24901y = re.c.c(new re.d(c0243b11));
        b.C0243b c0243b12 = jf.b.f18677r;
        rd.m.d(c0243b12, "IS_INFIX");
        f24902z = re.c.c(new re.d(c0243b12));
        b.C0243b c0243b13 = jf.b.f18678s;
        rd.m.d(c0243b13, "IS_INLINE");
        A = re.c.c(new re.d(c0243b13));
        b.C0243b c0243b14 = jf.b.f18679t;
        rd.m.d(c0243b14, "IS_TAILREC");
        B = re.c.c(new re.d(c0243b14));
        b.C0243b c0243b15 = jf.b.f18680u;
        rd.m.d(c0243b15, "IS_EXTERNAL_FUNCTION");
        C = re.c.c(new re.d(c0243b15));
        b.C0243b c0243b16 = jf.b.f18681v;
        rd.m.d(c0243b16, "IS_SUSPEND");
        D = re.c.c(new re.d(c0243b16));
        b.C0243b c0243b17 = jf.b.f18682w;
        rd.m.d(c0243b17, "IS_EXPECT_FUNCTION");
        E = re.c.c(new re.d(c0243b17));
        b.C0243b c0243b18 = jf.b.f18683x;
        rd.m.d(c0243b18, "IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES");
        F = re.c.c(new re.d(c0243b18));
        G = re.c.k(new rd.q() { // from class: qe.a.l
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((t) obj).g());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((t) obj).m(((Number) obj2).intValue());
            }
        });
        H = re.c.e(new rd.q() { // from class: qe.a.g
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((t) obj).g());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((t) obj).m(((Number) obj2).intValue());
            }
        });
        I = re.c.d(new rd.q() { // from class: qe.a.d
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((t) obj).g());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((t) obj).m(((Number) obj2).intValue());
            }
        });
        b.C0243b c0243b19 = jf.b.f18684y;
        rd.m.d(c0243b19, "IS_VAR");
        J = re.c.g(new re.d(c0243b19));
        b.C0243b c0243b20 = jf.b.B;
        rd.m.d(c0243b20, "IS_CONST");
        K = re.c.g(new re.d(c0243b20));
        b.C0243b c0243b21 = jf.b.C;
        rd.m.d(c0243b21, "IS_LATEINIT");
        L = re.c.g(new re.d(c0243b21));
        b.C0243b c0243b22 = jf.b.D;
        rd.m.d(c0243b22, "HAS_CONSTANT");
        M = re.c.g(new re.d(c0243b22));
        b.C0243b c0243b23 = jf.b.E;
        rd.m.d(c0243b23, "IS_EXTERNAL_PROPERTY");
        N = re.c.g(new re.d(c0243b23));
        b.C0243b c0243b24 = jf.b.F;
        rd.m.d(c0243b24, "IS_DELEGATED");
        O = re.c.g(new re.d(c0243b24));
        b.C0243b c0243b25 = jf.b.G;
        rd.m.d(c0243b25, "IS_EXPECT_PROPERTY");
        P = re.c.g(new re.d(c0243b25));
        Q = re.c.k(new rd.q() { // from class: qe.a.m
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((u) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((u) obj).c(((Number) obj2).intValue());
            }
        });
        R = re.c.e(new rd.q() { // from class: qe.a.h
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((u) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((u) obj).c(((Number) obj2).intValue());
            }
        });
        b.C0243b c0243b26 = jf.b.K;
        rd.m.d(c0243b26, "IS_NOT_DEFAULT");
        S = re.c.f(new re.d(c0243b26));
        b.C0243b c0243b27 = jf.b.L;
        rd.m.d(c0243b27, "IS_EXTERNAL_ACCESSOR");
        T = re.c.f(new re.d(c0243b27));
        b.C0243b c0243b28 = jf.b.M;
        rd.m.d(c0243b28, "IS_INLINE_ACCESSOR");
        U = re.c.f(new re.d(c0243b28));
        V = re.c.i(new re.d(0, 1, 1));
        b.C0243b c0243b29 = jf.b.f18660a;
        W = re.c.i(new re.d(c0243b29.f18687a + 1, c0243b29.f18688b, 1));
        b.C0243b c0243b30 = jf.b.f18661b;
        X = re.c.i(new re.d(c0243b30.f18687a + 1, c0243b30.f18688b, 1));
        Y = new re.a(new rd.q() { // from class: qe.a.c
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((x) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((x) obj).d(((Number) obj2).intValue());
            }
        }, new re.d(0, 1, 1));
        Z = re.c.k(new rd.q() { // from class: qe.a.n
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((w) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((w) obj).f(((Number) obj2).intValue());
            }
        });
        b.C0243b c0243b31 = jf.b.H;
        rd.m.d(c0243b31, "DECLARES_DEFAULT_VALUE");
        f24873a0 = re.c.j(new re.d(c0243b31));
        b.C0243b c0243b32 = jf.b.I;
        rd.m.d(c0243b32, "IS_CROSSINLINE");
        f24875b0 = re.c.j(new re.d(c0243b32));
        b.C0243b c0243b33 = jf.b.J;
        rd.m.d(c0243b33, "IS_NOINLINE");
        f24877c0 = re.c.j(new re.d(c0243b33));
        C0341a c0341a = new rd.q() { // from class: qe.a.a
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((qe.n) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((qe.n) obj).e(((Number) obj2).intValue());
            }
        };
        b.C0243b c0243b34 = jf.b.N;
        rd.m.d(c0243b34, "IS_NEGATED");
        f24879d0 = new re.a(c0341a, new re.d(c0243b34));
        b bVar = new rd.q() { // from class: qe.a.b
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((qe.n) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((qe.n) obj).e(((Number) obj2).intValue());
            }
        };
        b.C0243b c0243b35 = jf.b.O;
        rd.m.d(c0243b35, "IS_NULL_CHECK_PREDICATE");
        f24881e0 = new re.a(bVar, new re.d(c0243b35));
    }

    public static final qe.b a(qe.g gVar) {
        rd.m.e(gVar, "<this>");
        return (qe.b) f24887k.a(gVar, f24872a[9]);
    }

    public static final boolean b(qe.g gVar) {
        rd.m.e(gVar, "<this>");
        return f24892p.a(gVar, f24872a[14]);
    }
}
