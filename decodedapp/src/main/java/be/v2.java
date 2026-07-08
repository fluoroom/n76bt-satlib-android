package be;

import be.c3;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 implements rd.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f3995e = {rd.c0.f(new rd.w(v2.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), rd.c0.f(new rd.w(v2.class, "arguments", "getArguments()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg.r0 f3996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c3.a f3997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c3.a f3998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c3.a f3999d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4000a;

        static {
            int[] iArr = new int[eg.m2.values().length];
            try {
                iArr[eg.m2.f12140e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eg.m2.f12141f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eg.m2.f12142g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4000a = iArr;
        }
    }

    public v2(eg.r0 r0Var, qd.a aVar) {
        rd.m.e(r0Var, "type");
        this.f3996a = r0Var;
        c3.a aVarC = null;
        c3.a aVar2 = aVar instanceof c3.a ? (c3.a) aVar : null;
        if (aVar2 != null) {
            aVarC = aVar2;
        } else if (aVar != null) {
            aVarC = c3.c(aVar);
        }
        this.f3997b = aVarC;
        this.f3998c = c3.c(new r2(this));
        this.f3999d = c3.c(new s2(this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(v2 v2Var, qd.a aVar) {
        yd.o oVarD;
        List listL0 = v2Var.f3996a.L0();
        if (listL0.isEmpty()) {
            return ed.q.k();
        }
        dd.j jVarA = dd.k.a(dd.n.f10910b, new t2(v2Var));
        ArrayList arrayList = new ArrayList(ed.q.v(listL0, 10));
        int i10 = 0;
        for (Object obj : listL0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            eg.a2 a2Var = (eg.a2) obj;
            if (a2Var.b()) {
                oVarD = yd.o.f32525c.c();
            } else {
                eg.r0 type = a2Var.getType();
                rd.m.d(type, "getType(...)");
                v2 v2Var2 = new v2(type, aVar == null ? null : new u2(v2Var, i10, jVarA));
                int i12 = a.f4000a[a2Var.a().ordinal()];
                if (i12 == 1) {
                    oVarD = yd.o.f32525c.d(v2Var2);
                } else if (i12 == 2) {
                    oVarD = yd.o.f32525c.a(v2Var2);
                } else {
                    if (i12 != 3) {
                        throw new dd.o();
                    }
                    oVarD = yd.o.f32525c.b(v2Var2);
                }
            }
            arrayList.add(oVarD);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(v2 v2Var) {
        Type typeA = v2Var.a();
        rd.m.b(typeA);
        return ne.f.h(typeA);
    }

    private static final List j(dd.j jVar) {
        return (List) jVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type k(v2 v2Var, int i10, dd.j jVar) {
        Type typeA = v2Var.a();
        if (typeA instanceof Class) {
            Class cls = (Class) typeA;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            rd.m.b(componentType);
            return componentType;
        }
        if (typeA instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) typeA).getGenericComponentType();
                rd.m.b(genericComponentType);
                return genericComponentType;
            }
            throw new z2("Array type has been queried for a non-0th argument: " + v2Var);
        }
        if (!(typeA instanceof ParameterizedType)) {
            throw new z2("Non-generic type has been queried for arguments: " + v2Var);
        }
        Type type = (Type) j(jVar).get(i10);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        rd.m.d(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) ed.j.E(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            rd.m.d(upperBounds, "getUpperBounds(...)");
            type2 = (Type) ed.j.D(upperBounds);
        }
        rd.m.b(type2);
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yd.d l(v2 v2Var) {
        return v2Var.m(v2Var.f3996a);
    }

    private final yd.d m(eg.r0 r0Var) {
        eg.r0 type;
        he.h hVarQ = r0Var.N0().q();
        if (!(hVarQ instanceof he.e)) {
            if (hVarQ instanceof he.l1) {
                return new x2(null, (he.l1) hVarQ);
            }
            if (!(hVarQ instanceof he.k1)) {
                return null;
            }
            throw new dd.p("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class clsQ = l3.q((he.e) hVarQ);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (eg.i2.l(r0Var)) {
                return new c0(clsQ);
            }
            Class clsI = ne.f.i(clsQ);
            if (clsI != null) {
                clsQ = clsI;
            }
            return new c0(clsQ);
        }
        eg.a2 a2Var = (eg.a2) ed.q.y0(r0Var.L0());
        if (a2Var == null || (type = a2Var.getType()) == null) {
            return new c0(clsQ);
        }
        yd.d dVarM = m(type);
        if (dVarM != null) {
            return new c0(l3.f(pd.a.b(ae.b.a(dVarM))));
        }
        throw new z2("Cannot determine classifier for array element type: " + this);
    }

    @Override // rd.n
    public Type a() {
        c3.a aVar = this.f3997b;
        if (aVar != null) {
            return (Type) aVar.a();
        }
        return null;
    }

    @Override // yd.m
    public List c() {
        Object objD = this.f3999d.d(this, f3995e[1]);
        rd.m.d(objD, "getValue(...)");
        return (List) objD;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return rd.m.a(this.f3996a, v2Var.f3996a) && rd.m.a(f(), v2Var.f()) && rd.m.a(c(), v2Var.c());
    }

    @Override // yd.m
    public yd.d f() {
        return (yd.d) this.f3998c.d(this, f3995e[0]);
    }

    public int hashCode() {
        int iHashCode = this.f3996a.hashCode() * 31;
        yd.d dVarF = f();
        return ((iHashCode + (dVarF != null ? dVarF.hashCode() : 0)) * 31) + c().hashCode();
    }

    public final eg.r0 n() {
        return this.f3996a;
    }

    public String toString() {
        return g3.f3870a.l(this.f3996a);
    }

    public /* synthetic */ v2(eg.r0 r0Var, qd.a aVar, int i10, rd.h hVar) {
        this(r0Var, (i10 & 2) != 0 ? null : aVar);
    }
}
