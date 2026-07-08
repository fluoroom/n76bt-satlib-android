package fg;

import eg.c1;
import eg.g1;
import eg.l0;
import eg.l2;
import eg.q0;
import eg.q1;
import eg.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f13089a = new z();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13090a = new c("START", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13091b = new C0188a("ACCEPT_NULL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f13092c = new d("UNKNOWN", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f13093d = new b("NOT_NULL", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f13094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kd.a f13095f;

        /* JADX INFO: renamed from: fg.z$a$a, reason: collision with other inner class name */
        static final class C0188a extends a {
            C0188a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // fg.z.a
            public a d(l2 l2Var) {
                rd.m.e(l2Var, "nextType");
                return e(l2Var);
            }
        }

        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // fg.z.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public b d(l2 l2Var) {
                rd.m.e(l2Var, "nextType");
                return this;
            }
        }

        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // fg.z.a
            public a d(l2 l2Var) {
                rd.m.e(l2Var, "nextType");
                return e(l2Var);
            }
        }

        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // fg.z.a
            public a d(l2 l2Var) {
                rd.m.e(l2Var, "nextType");
                a aVarE = e(l2Var);
                return aVarE == a.f13091b ? this : aVarE;
            }
        }

        static {
            a[] aVarArrA = a();
            f13094e = aVarArrA;
            f13095f = kd.b.a(aVarArrA);
        }

        public /* synthetic */ a(String str, int i10, rd.h hVar) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f13090a, f13091b, f13092c, f13093d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f13094e.clone();
        }

        public abstract a d(l2 l2Var);

        protected final a e(l2 l2Var) {
            rd.m.e(l2Var, "<this>");
            if (l2Var.O0()) {
                return f13091b;
            }
            if (l2Var instanceof eg.y) {
                ((eg.y) l2Var).Z0();
            }
            return r.f13083a.a(l2Var) ? f13093d : f13092c;
        }

        private a(String str, int i10) {
        }
    }

    static final /* synthetic */ class b extends rd.l implements qd.p {
        b(Object obj) {
            super(2, obj, z.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // qd.p
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Boolean s(r0 r0Var, r0 r0Var2) {
            rd.m.e(r0Var, "p0");
            rd.m.e(r0Var2, "p1");
            return Boolean.valueOf(((z) this.f25940b).g(r0Var, r0Var2));
        }
    }

    static final /* synthetic */ class c extends rd.l implements qd.p {
        c(Object obj) {
            super(2, obj, q.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // qd.p
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Boolean s(r0 r0Var, r0 r0Var2) {
            rd.m.e(r0Var, "p0");
            rd.m.e(r0Var2, "p1");
            return Boolean.valueOf(((q) this.f25940b).c(r0Var, r0Var2));
        }
    }

    private z() {
    }

    private final Collection c(Collection collection, qd.p pVar) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    c1 c1Var2 = (c1) it2.next();
                    if (c1Var2 != c1Var) {
                        rd.m.b(c1Var2);
                        rd.m.b(c1Var);
                        if (((Boolean) pVar.s(c1Var2, c1Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final c1 e(Set set) {
        if (set.size() == 1) {
            return (c1) ed.q.v0(set);
        }
        new y(set);
        Collection collectionC = c(set, new b(this));
        collectionC.isEmpty();
        c1 c1VarB = sf.q.f27342f.b(collectionC);
        if (c1VarB != null) {
            return c1VarB;
        }
        Collection collectionC2 = c(collectionC, new c(p.f13077b.a()));
        collectionC2.isEmpty();
        return collectionC2.size() < 2 ? (c1) ed.q.v0(collectionC2) : new q0(set).f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + ed.q.i0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(r0 r0Var, r0 r0Var2) {
        q qVarA = p.f13077b.a();
        return qVarA.a(r0Var, r0Var2) && !qVarA.a(r0Var2, r0Var);
    }

    public final c1 d(List list) {
        rd.m.e(list, "types");
        list.size();
        ArrayList<c1> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            if (c1Var.N0() instanceof q0) {
                Collection<r0> collectionE = c1Var.N0().e();
                rd.m.d(collectionE, "getSupertypes(...)");
                ArrayList arrayList2 = new ArrayList(ed.q.v(collectionE, 10));
                for (r0 r0Var : collectionE) {
                    rd.m.b(r0Var);
                    c1 c1VarD = l0.d(r0Var);
                    if (c1Var.O0()) {
                        c1VarD = c1VarD.R0(true);
                    }
                    arrayList2.add(c1VarD);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(c1Var);
            }
        }
        a aVarD = a.f13090a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarD = aVarD.d((l2) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c1 c1VarI : arrayList) {
            if (aVarD == a.f13093d) {
                if (c1VarI instanceof i) {
                    c1VarI = g1.k((i) c1VarI);
                }
                c1VarI = g1.i(c1VarI, false, 1, null);
            }
            linkedHashSet.add(c1VarI);
        }
        ArrayList arrayList3 = new ArrayList(ed.q.v(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((c1) it3.next()).M0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((q1) next).j((q1) it4.next());
        }
        return e(linkedHashSet).T0((q1) next);
    }
}
