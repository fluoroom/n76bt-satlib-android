package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ yd.j[] f12175a = {rd.c0.f(new rd.w(t.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1))};

    /* JADX INFO: renamed from: b */
    private static final ud.c f12176b;

    static {
        lg.n nVarD = q1.f12167b.d(rd.c0.b(s.class));
        rd.m.c(nVarD, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f12176b = nVarD;
    }

    public static final ie.h a(q1 q1Var) {
        ie.h hVarE;
        rd.m.e(q1Var, "<this>");
        s sVarB = b(q1Var);
        return (sVarB == null || (hVarE = sVarB.e()) == null) ? ie.h.f16054l.b() : hVarE;
    }

    public static final s b(q1 q1Var) {
        rd.m.e(q1Var, "<this>");
        return (s) f12176b.a(q1Var, f12175a[0]);
    }
}
