package df;

import df.m1;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f10960a = new h(k.f10998b, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f10961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f10962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f10963d;

    static {
        k kVar = k.f10999c;
        f10961b = new h(kVar, null, false, false, 8, null);
        f10962c = new h(kVar, null, true, false, 8, null);
        ef.f0 f0Var = ef.f0.f11965a;
        String strH = f0Var.h("Object");
        String strG = f0Var.g("Predicate");
        String strG2 = f0Var.g("Function");
        String strG3 = f0Var.g("Consumer");
        String strG4 = f0Var.g("BiFunction");
        String strG5 = f0Var.g("BiConsumer");
        String strG6 = f0Var.g("UnaryOperator");
        String strI = f0Var.i("stream/Stream");
        String strI2 = f0Var.i("Optional");
        m1 m1Var = new m1();
        m1.a.b(new m1.a(m1Var, f0Var.i("Iterator")), "forEachRemaining", null, new m(strG3), 2, null);
        m1.a.b(new m1.a(m1Var, f0Var.h("Iterable")), "spliterator", null, new x(f0Var), 2, null);
        m1.a aVar = new m1.a(m1Var, f0Var.i("Collection"));
        m1.a.b(aVar, "removeIf", null, new i0(strG), 2, null);
        m1.a.b(aVar, "stream", null, new t0(strI), 2, null);
        m1.a.b(aVar, "parallelStream", null, new y0(strI), 2, null);
        m1.a aVar2 = new m1.a(m1Var, f0Var.i("List"));
        m1.a.b(aVar2, "replaceAll", null, new z0(strG6), 2, null);
        aVar2.a("addFirst", "2.1", new a1(strH));
        aVar2.a("addLast", "2.1", new b1(strH));
        aVar2.a("removeFirst", "2.1", new c1(strH));
        aVar2.a("removeLast", "2.1", new d1(strH));
        m1.a aVar3 = new m1.a(m1Var, f0Var.i("LinkedList"));
        aVar3.a("addFirst", "2.1", new n(strH));
        aVar3.a("addLast", "2.1", new o(strH));
        aVar3.a("removeFirst", "2.1", new p(strH));
        aVar3.a("removeLast", "2.1", new q(strH));
        m1.a aVar4 = new m1.a(m1Var, f0Var.i("LinkedHashSet"));
        aVar4.a("addFirst", "2.2", new r(strH));
        aVar4.a("addLast", "2.2", new s(strH));
        aVar4.a("removeFirst", "2.2", new t(strH));
        aVar4.a("removeLast", "2.2", new u(strH));
        aVar4.a("getFirst", "2.2", new v(strH));
        aVar4.a("getLast", "2.2", new w(strH));
        m1.a aVar5 = new m1.a(m1Var, f0Var.i("Map"));
        m1.a.b(aVar5, "forEach", null, new y(strG5), 2, null);
        m1.a.b(aVar5, "putIfAbsent", null, new z(strH), 2, null);
        m1.a.b(aVar5, "replace", null, new a0(strH), 2, null);
        m1.a.b(aVar5, "replace", null, new b0(strH), 2, null);
        m1.a.b(aVar5, "replaceAll", null, new c0(strG4), 2, null);
        m1.a.b(aVar5, "compute", null, new d0(strH, strG4), 2, null);
        m1.a.b(aVar5, "computeIfAbsent", null, new e0(strH, strG2), 2, null);
        m1.a.b(aVar5, "computeIfPresent", null, new f0(strH, strG4), 2, null);
        m1.a.b(aVar5, "merge", null, new g0(strH, strG4), 2, null);
        m1.a aVar6 = new m1.a(m1Var, f0Var.i("LinkedHashMap"));
        aVar6.a("putFirst", "2.2", new h0(strH));
        aVar6.a("putLast", "2.2", new j0(strH));
        m1.a aVar7 = new m1.a(m1Var, strI2);
        m1.a.b(aVar7, "empty", null, new k0(strI2), 2, null);
        m1.a.b(aVar7, "of", null, new l0(strH, strI2), 2, null);
        m1.a.b(aVar7, "ofNullable", null, new m0(strH, strI2), 2, null);
        m1.a.b(aVar7, "get", null, new n0(strH), 2, null);
        m1.a.b(aVar7, "ifPresent", null, new o0(strG3), 2, null);
        m1.a.b(new m1.a(m1Var, f0Var.h("ref/Reference")), "get", null, new p0(strH), 2, null);
        m1.a.b(new m1.a(m1Var, strG), "test", null, new q0(strH), 2, null);
        m1.a.b(new m1.a(m1Var, f0Var.g("BiPredicate")), "test", null, new r0(strH), 2, null);
        m1.a.b(new m1.a(m1Var, strG3), "accept", null, new s0(strH), 2, null);
        m1.a.b(new m1.a(m1Var, strG5), "accept", null, new u0(strH), 2, null);
        m1.a.b(new m1.a(m1Var, strG2), "apply", null, new v0(strH), 2, null);
        m1.a.b(new m1.a(m1Var, strG4), "apply", null, new w0(strH), 2, null);
        m1.a.b(new m1.a(m1Var, f0Var.g("Supplier")), "get", null, new x0(strH), 2, null);
        f10963d = m1Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 A(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        c0147a.c(str, f10960a);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 B(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        c0147a.c(str, f10960a);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 C(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b, f10962c);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 D(String str, String str2, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10962c;
        c0147a.b(str, hVar);
        c0147a.c(str2, f10961b, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 E(String str, String str2, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10960a);
        c0147a.c(str2, f10961b, f10962c);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 F(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10962c);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 G(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b, f10962c);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 H(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10960a);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 I(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b);
        c0147a.d(vf.e.BOOLEAN);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 J(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        c0147a.d(vf.e.BOOLEAN);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 K(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b);
        return dd.d0.f10897a;
    }

    public static final Map K0() {
        return f10963d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 L(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 M(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.c(str, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 N(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        c0147a.c(str, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 O(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 P(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar, hVar);
        c0147a.d(vf.e.BOOLEAN);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 Q(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.c(str, hVar, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 R(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.c(str, hVar, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 a(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 b(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 c(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 d(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 e(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 f(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 g(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 h(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 i(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 j(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 k(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 l(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.b(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 m(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 n(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 o(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 p(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        c0147a.c(str, f10961b);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 q(ef.f0 f0Var, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        String strI = f0Var.i("Spliterator");
        h hVar = f10961b;
        c0147a.c(strI, hVar, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 r(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar, hVar, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 s(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        c0147a.c(str, f10960a);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 t(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        c0147a.c(str, f10960a);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 u(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        c0147a.b(str, hVar);
        c0147a.d(vf.e.BOOLEAN);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 v(String str, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar, hVar, hVar, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 w(String str, String str2, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        h hVar2 = f10960a;
        c0147a.b(str2, hVar, hVar, hVar2, hVar2);
        c0147a.c(str, hVar2);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 x(String str, String str2, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        c0147a.b(str2, hVar, hVar, hVar);
        c0147a.c(str, hVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 y(String str, String str2, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        h hVar2 = f10960a;
        c0147a.b(str2, hVar, hVar, f10962c, hVar2);
        c0147a.c(str, hVar2);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 z(String str, String str2, m1.a.C0147a c0147a) {
        rd.m.e(c0147a, "$this$function");
        h hVar = f10961b;
        c0147a.b(str, hVar);
        h hVar2 = f10962c;
        c0147a.b(str, hVar2);
        h hVar3 = f10960a;
        c0147a.b(str2, hVar, hVar2, hVar2, hVar3);
        c0147a.c(str, hVar3);
        return dd.d0.f10897a;
    }
}
