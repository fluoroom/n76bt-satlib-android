package ve;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a */
    public static final a f30675a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final List f30676b;

    /* JADX INFO: renamed from: c */
    private static final List f30677c;

    /* JADX INFO: renamed from: d */
    private static final List f30678d;

    /* JADX INFO: renamed from: e */
    private static final Map f30679e;

    /* JADX INFO: renamed from: f */
    private static final Map f30680f;

    /* JADX INFO: renamed from: g */
    private static final Set f30681g;

    /* JADX INFO: renamed from: h */
    private static final Set f30682h;

    /* JADX INFO: renamed from: i */
    private static final a.C0408a f30683i;

    /* JADX INFO: renamed from: j */
    private static final Map f30684j;

    /* JADX INFO: renamed from: k */
    private static final Map f30685k;

    /* JADX INFO: renamed from: l */
    private static final Set f30686l;

    /* JADX INFO: renamed from: m */
    private static final Set f30687m;

    /* JADX INFO: renamed from: n */
    private static final Map f30688n;

    public static final class a {

        /* JADX INFO: renamed from: ve.u0$a$a */
        public static final class C0408a {

            /* JADX INFO: renamed from: a */
            private final String f30689a;

            /* JADX INFO: renamed from: b */
            private final mf.f f30690b;

            /* JADX INFO: renamed from: c */
            private final String f30691c;

            /* JADX INFO: renamed from: d */
            private final String f30692d;

            /* JADX INFO: renamed from: e */
            private final String f30693e;

            public C0408a(String str, mf.f fVar, String str2, String str3) {
                rd.m.e(str, "classInternalName");
                rd.m.e(fVar, "name");
                rd.m.e(str2, "parameters");
                rd.m.e(str3, "returnType");
                this.f30689a = str;
                this.f30690b = fVar;
                this.f30691c = str2;
                this.f30692d = str3;
                this.f30693e = ef.f0.f11965a.m(str, fVar + '(' + str2 + ')' + str3);
            }

            public static /* synthetic */ C0408a b(C0408a c0408a, String str, mf.f fVar, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0408a.f30689a;
                }
                if ((i10 & 2) != 0) {
                    fVar = c0408a.f30690b;
                }
                if ((i10 & 4) != 0) {
                    str2 = c0408a.f30691c;
                }
                if ((i10 & 8) != 0) {
                    str3 = c0408a.f30692d;
                }
                return c0408a.a(str, fVar, str2, str3);
            }

            public final C0408a a(String str, mf.f fVar, String str2, String str3) {
                rd.m.e(str, "classInternalName");
                rd.m.e(fVar, "name");
                rd.m.e(str2, "parameters");
                rd.m.e(str3, "returnType");
                return new C0408a(str, fVar, str2, str3);
            }

            public final mf.f c() {
                return this.f30690b;
            }

            public final String d() {
                return this.f30693e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0408a)) {
                    return false;
                }
                C0408a c0408a = (C0408a) obj;
                return rd.m.a(this.f30689a, c0408a.f30689a) && rd.m.a(this.f30690b, c0408a.f30690b) && rd.m.a(this.f30691c, c0408a.f30691c) && rd.m.a(this.f30692d, c0408a.f30692d);
            }

            public int hashCode() {
                return (((((this.f30689a.hashCode() * 31) + this.f30690b.hashCode()) * 31) + this.f30691c.hashCode()) * 31) + this.f30692d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f30689a + ", name=" + this.f30690b + ", parameters=" + this.f30691c + ", returnType=" + this.f30692d + ')';
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final C0408a m(String str, String str2, String str3, String str4) {
            mf.f fVarH = mf.f.h(str2);
            rd.m.d(fVarH, "identifier(...)");
            return new C0408a(str, fVarH, str3, str4);
        }

        public final mf.f b(mf.f fVar) {
            rd.m.e(fVar, "name");
            return (mf.f) f().get(fVar);
        }

        public final List c() {
            return u0.f30677c;
        }

        public final Set d() {
            return u0.f30681g;
        }

        public final Set e() {
            return u0.f30682h;
        }

        public final Map f() {
            return u0.f30688n;
        }

        public final Set g() {
            return u0.f30687m;
        }

        public final C0408a h() {
            return u0.f30683i;
        }

        public final Map i() {
            return u0.f30680f;
        }

        public final Map j() {
            return u0.f30685k;
        }

        public final boolean k(mf.f fVar) {
            rd.m.e(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String str) {
            rd.m.e(str, "builtinSignature");
            return c().contains(str) ? b.f30694c : ((c) ed.k0.j(i(), str)) == c.f30701b ? b.f30696e : b.f30695d;
        }

        private a() {
        }
    }

    public static final class b extends Enum {

        /* JADX INFO: renamed from: c */
        public static final b f30694c = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);

        /* JADX INFO: renamed from: d */
        public static final b f30695d = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);

        /* JADX INFO: renamed from: e */
        public static final b f30696e = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ b[] f30697f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ kd.a f30698g;

        /* JADX INFO: renamed from: a */
        private final String f30699a;

        /* JADX INFO: renamed from: b */
        private final boolean f30700b;

        static {
            b[] bVarArrA = a();
            f30697f = bVarArrA;
            f30698g = kd.b.a(bVarArrA);
        }

        private b(String str, int i10, String str2, boolean z10) {
            super(str, i10);
            this.f30699a = str2;
            this.f30700b = z10;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f30694c, f30695d, f30696e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f30697f.clone();
        }
    }

    public static final class c extends Enum {

        /* JADX INFO: renamed from: b */
        public static final c f30701b = new c("NULL", 0, null);

        /* JADX INFO: renamed from: c */
        public static final c f30702c = new c("INDEX", 1, -1);

        /* JADX INFO: renamed from: d */
        public static final c f30703d = new c("FALSE", 2, Boolean.FALSE);

        /* JADX INFO: renamed from: e */
        public static final c f30704e = new a("MAP_GET_OR_DEFAULT", 3);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ c[] f30705f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ kd.a f30706g;

        /* JADX INFO: renamed from: a */
        private final Object f30707a;

        static final class a extends c {
            a(String str, int i10) {
                super(str, i10, null, null);
            }
        }

        static {
            c[] cVarArrA = a();
            f30705f = cVarArrA;
            f30706g = kd.b.a(cVarArrA);
        }

        public /* synthetic */ c(String str, int i10, Object obj, rd.h hVar) {
            this(str, i10, obj);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f30701b, f30702c, f30703d, f30704e};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f30705f.clone();
        }

        private c(String str, int i10, Object obj) {
            super(str, i10);
            this.f30707a = obj;
        }
    }

    static {
        Set<String> setG = ed.r0.g("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(ed.q.v(setG, 10));
        for (String str : setG) {
            a aVar = f30675a;
            String strF = vf.e.BOOLEAN.f();
            rd.m.d(strF, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", strF));
        }
        f30676b = arrayList;
        ArrayList arrayList2 = new ArrayList(ed.q.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0408a) it.next()).d());
        }
        f30677c = arrayList2;
        List list = f30676b;
        ArrayList arrayList3 = new ArrayList(ed.q.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C0408a) it2.next()).c().d());
        }
        f30678d = arrayList3;
        ef.f0 f0Var = ef.f0.f11965a;
        a aVar2 = f30675a;
        String strI = f0Var.i("Collection");
        vf.e eVar = vf.e.BOOLEAN;
        String strF2 = eVar.f();
        rd.m.d(strF2, "getDesc(...)");
        a.C0408a c0408aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", strF2);
        c cVar = c.f30703d;
        dd.q qVarA = dd.w.a(c0408aM, cVar);
        String strI2 = f0Var.i("Collection");
        String strF3 = eVar.f();
        rd.m.d(strF3, "getDesc(...)");
        dd.q qVarA2 = dd.w.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", strF3), cVar);
        String strI3 = f0Var.i("Map");
        String strF4 = eVar.f();
        rd.m.d(strF4, "getDesc(...)");
        dd.q qVarA3 = dd.w.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", strF4), cVar);
        String strI4 = f0Var.i("Map");
        String strF5 = eVar.f();
        rd.m.d(strF5, "getDesc(...)");
        dd.q qVarA4 = dd.w.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", strF5), cVar);
        String strI5 = f0Var.i("Map");
        String strF6 = eVar.f();
        rd.m.d(strF6, "getDesc(...)");
        dd.q qVarA5 = dd.w.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strF6), cVar);
        dd.q qVarA6 = dd.w.a(aVar2.m(f0Var.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f30704e);
        a.C0408a c0408aM2 = aVar2.m(f0Var.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f30701b;
        dd.q qVarA7 = dd.w.a(c0408aM2, cVar2);
        dd.q qVarA8 = dd.w.a(aVar2.m(f0Var.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strI6 = f0Var.i("List");
        vf.e eVar2 = vf.e.INT;
        String strF7 = eVar2.f();
        rd.m.d(strF7, "getDesc(...)");
        a.C0408a c0408aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", strF7);
        c cVar3 = c.f30702c;
        dd.q qVarA9 = dd.w.a(c0408aM3, cVar3);
        String strI7 = f0Var.i("List");
        String strF8 = eVar2.f();
        rd.m.d(strF8, "getDesc(...)");
        Map mapL = ed.k0.l(qVarA, qVarA2, qVarA3, qVarA4, qVarA5, qVarA6, qVarA7, qVarA8, qVarA9, dd.w.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", strF8), cVar3));
        f30679e = mapL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ed.k0.e(mapL.size()));
        for (Map.Entry entry : mapL.entrySet()) {
            linkedHashMap.put(((a.C0408a) entry.getKey()).d(), entry.getValue());
        }
        f30680f = linkedHashMap;
        Set setJ = ed.r0.j(f30679e.keySet(), f30676b);
        ArrayList arrayList4 = new ArrayList(ed.q.v(setJ, 10));
        Iterator it3 = setJ.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.C0408a) it3.next()).c());
        }
        f30681g = ed.q.M0(arrayList4);
        ArrayList arrayList5 = new ArrayList(ed.q.v(setJ, 10));
        Iterator it4 = setJ.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C0408a) it4.next()).d());
        }
        f30682h = ed.q.M0(arrayList5);
        a aVar3 = f30675a;
        vf.e eVar3 = vf.e.INT;
        String strF9 = eVar3.f();
        rd.m.d(strF9, "getDesc(...)");
        a.C0408a c0408aM4 = aVar3.m("java/util/List", "removeAt", strF9, "Ljava/lang/Object;");
        f30683i = c0408aM4;
        ef.f0 f0Var2 = ef.f0.f11965a;
        String strH = f0Var2.h("Number");
        String strF10 = vf.e.BYTE.f();
        rd.m.d(strF10, "getDesc(...)");
        dd.q qVarA10 = dd.w.a(aVar3.m(strH, "toByte", "", strF10), mf.f.h("byteValue"));
        String strH2 = f0Var2.h("Number");
        String strF11 = vf.e.SHORT.f();
        rd.m.d(strF11, "getDesc(...)");
        dd.q qVarA11 = dd.w.a(aVar3.m(strH2, "toShort", "", strF11), mf.f.h("shortValue"));
        String strH3 = f0Var2.h("Number");
        String strF12 = eVar3.f();
        rd.m.d(strF12, "getDesc(...)");
        dd.q qVarA12 = dd.w.a(aVar3.m(strH3, "toInt", "", strF12), mf.f.h("intValue"));
        String strH4 = f0Var2.h("Number");
        String strF13 = vf.e.LONG.f();
        rd.m.d(strF13, "getDesc(...)");
        dd.q qVarA13 = dd.w.a(aVar3.m(strH4, "toLong", "", strF13), mf.f.h("longValue"));
        String strH5 = f0Var2.h("Number");
        String strF14 = vf.e.FLOAT.f();
        rd.m.d(strF14, "getDesc(...)");
        dd.q qVarA14 = dd.w.a(aVar3.m(strH5, "toFloat", "", strF14), mf.f.h("floatValue"));
        String strH6 = f0Var2.h("Number");
        String strF15 = vf.e.DOUBLE.f();
        rd.m.d(strF15, "getDesc(...)");
        dd.q qVarA15 = dd.w.a(aVar3.m(strH6, "toDouble", "", strF15), mf.f.h("doubleValue"));
        dd.q qVarA16 = dd.w.a(c0408aM4, mf.f.h("remove"));
        String strH7 = f0Var2.h("CharSequence");
        String strF16 = eVar3.f();
        rd.m.d(strF16, "getDesc(...)");
        String strF17 = vf.e.CHAR.f();
        rd.m.d(strF17, "getDesc(...)");
        Map mapL2 = ed.k0.l(qVarA10, qVarA11, qVarA12, qVarA13, qVarA14, qVarA15, qVarA16, dd.w.a(aVar3.m(strH7, "get", strF16, strF17), mf.f.h("charAt")), dd.w.a(aVar3.m(f0Var2.j("AtomicInteger"), "load", "", "I"), mf.f.h("get")), dd.w.a(aVar3.m(f0Var2.j("AtomicInteger"), "store", "I", "V"), mf.f.h("set")), dd.w.a(aVar3.m(f0Var2.j("AtomicInteger"), "exchange", "I", "I"), mf.f.h("getAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicInteger"), "fetchAndAdd", "I", "I"), mf.f.h("getAndAdd")), dd.w.a(aVar3.m(f0Var2.j("AtomicInteger"), "addAndFetch", "I", "I"), mf.f.h("addAndGet")), dd.w.a(aVar3.m(f0Var2.j("AtomicLong"), "load", "", "J"), mf.f.h("get")), dd.w.a(aVar3.m(f0Var2.j("AtomicLong"), "store", "J", "V"), mf.f.h("set")), dd.w.a(aVar3.m(f0Var2.j("AtomicLong"), "exchange", "J", "J"), mf.f.h("getAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicLong"), "fetchAndAdd", "J", "J"), mf.f.h("getAndAdd")), dd.w.a(aVar3.m(f0Var2.j("AtomicLong"), "addAndFetch", "J", "J"), mf.f.h("addAndGet")), dd.w.a(aVar3.m(f0Var2.j("AtomicBoolean"), "load", "", "Z"), mf.f.h("get")), dd.w.a(aVar3.m(f0Var2.j("AtomicBoolean"), "store", "Z", "V"), mf.f.h("set")), dd.w.a(aVar3.m(f0Var2.j("AtomicBoolean"), "exchange", "Z", "Z"), mf.f.h("getAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicReference"), "load", "", "Ljava/lang/Object;"), mf.f.h("get")), dd.w.a(aVar3.m(f0Var2.j("AtomicReference"), "store", "Ljava/lang/Object;", "V"), mf.f.h("set")), dd.w.a(aVar3.m(f0Var2.j("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), mf.f.h("getAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicIntegerArray"), "loadAt", "I", "I"), mf.f.h("get")), dd.w.a(aVar3.m(f0Var2.j("AtomicIntegerArray"), "storeAt", "II", "V"), mf.f.h("set")), dd.w.a(aVar3.m(f0Var2.j("AtomicIntegerArray"), "exchangeAt", "II", "I"), mf.f.h("getAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), mf.f.h("compareAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), mf.f.h("getAndAdd")), dd.w.a(aVar3.m(f0Var2.j("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), mf.f.h("addAndGet")), dd.w.a(aVar3.m(f0Var2.j("AtomicLongArray"), "loadAt", "I", "J"), mf.f.h("get")), dd.w.a(aVar3.m(f0Var2.j("AtomicLongArray"), "storeAt", "IJ", "V"), mf.f.h("set")), dd.w.a(aVar3.m(f0Var2.j("AtomicLongArray"), "exchangeAt", "IJ", "J"), mf.f.h("getAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), mf.f.h("compareAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), mf.f.h("getAndAdd")), dd.w.a(aVar3.m(f0Var2.j("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), mf.f.h("addAndGet")), dd.w.a(aVar3.m(f0Var2.j("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), mf.f.h("get")), dd.w.a(aVar3.m(f0Var2.j("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), mf.f.h("set")), dd.w.a(aVar3.m(f0Var2.j("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), mf.f.h("getAndSet")), dd.w.a(aVar3.m(f0Var2.j("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), mf.f.h("compareAndSet")));
        f30684j = mapL2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ed.k0.e(mapL2.size()));
        for (Map.Entry entry2 : mapL2.entrySet()) {
            linkedHashMap2.put(((a.C0408a) entry2.getKey()).d(), entry2.getValue());
        }
        f30685k = linkedHashMap2;
        Map map = f30684j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0408a.b((a.C0408a) entry3.getKey(), null, (mf.f) entry3.getValue(), null, null, 13, null).d());
        }
        f30686l = linkedHashSet;
        Set setKeySet = f30684j.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a.C0408a) it5.next()).c());
        }
        f30687m = hashSet;
        Set<Map.Entry> setEntrySet = f30684j.entrySet();
        ArrayList<dd.q> arrayList6 = new ArrayList(ed.q.v(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList6.add(new dd.q(((a.C0408a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(arrayList6, 10)), 16));
        for (dd.q qVar : arrayList6) {
            linkedHashMap3.put((mf.f) qVar.d(), (mf.f) qVar.c());
        }
        f30688n = linkedHashMap3;
    }
}
