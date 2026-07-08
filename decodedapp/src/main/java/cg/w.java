package cg;

import he.f1;
import he.k1;
import he.y0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xf.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w extends xf.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f4854f = {rd.c0.f(new rd.w(w.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), rd.c0.f(new rd.w(w.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ag.p f4855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f4856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.i f4857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.j f4858e;

    private interface a {
        Collection a(mf.f fVar, pe.b bVar);

        Set b();

        Collection c(mf.f fVar, pe.b bVar);

        Set d();

        void e(Collection collection, xf.d dVar, qd.l lVar, pe.b bVar);

        Set f();

        k1 g(mf.f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final /* synthetic */ yd.j[] f4859o = {rd.c0.f(new rd.w(b.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), rd.c0.f(new rd.w(b.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), rd.c0.f(new rd.w(b.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), rd.c0.f(new rd.w(b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), rd.c0.f(new rd.w(b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f4860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f4861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f4862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final dg.i f4863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final dg.i f4864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final dg.i f4865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final dg.i f4866g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final dg.i f4867h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final dg.i f4868i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final dg.i f4869j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final dg.i f4870k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final dg.i f4871l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final dg.i f4872m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w f4873n;

        public b(w wVar, List list, List list2, List list3) {
            rd.m.e(list, "functionList");
            rd.m.e(list2, "propertyList");
            rd.m.e(list3, "typeAliasList");
            this.f4873n = wVar;
            this.f4860a = list;
            this.f4861b = list2;
            this.f4862c = wVar.s().c().g().f() ? list3 : ed.q.k();
            this.f4863d = wVar.s().h().d(new x(this));
            this.f4864e = wVar.s().h().d(new y(this));
            this.f4865f = wVar.s().h().d(new z(this));
            this.f4866g = wVar.s().h().d(new a0(this));
            this.f4867h = wVar.s().h().d(new b0(this));
            this.f4868i = wVar.s().h().d(new c0(this));
            this.f4869j = wVar.s().h().d(new d0(this));
            this.f4870k = wVar.s().h().d(new e0(this));
            this.f4871l = wVar.s().h().d(new f0(this, wVar));
            this.f4872m = wVar.s().h().d(new g0(this, wVar));
        }

        private final List A() {
            List list = this.f4862c;
            w wVar = this.f4873n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k1 k1VarA = wVar.s().f().A((gf.s) ((of.p) it.next()));
                if (k1VarA != null) {
                    arrayList.add(k1VarA);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set D(b bVar, w wVar) {
            List list = bVar.f4860a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f4873n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(ag.l0.b(wVar2.s().g(), ((gf.j) ((of.p) it.next())).C0()));
            }
            return ed.r0.j(linkedHashSet, wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map E(b bVar) {
            List listF = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listF) {
                mf.f name = ((f1) obj).getName();
                rd.m.d(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List F() {
            return (List) dg.m.a(this.f4866g, this, f4859o[3]);
        }

        private final List G() {
            return (List) dg.m.a(this.f4867h, this, f4859o[4]);
        }

        private final List H() {
            return (List) dg.m.a(this.f4865f, this, f4859o[2]);
        }

        private final List I() {
            return (List) dg.m.a(this.f4863d, this, f4859o[0]);
        }

        private final List J() {
            return (List) dg.m.a(this.f4864e, this, f4859o[1]);
        }

        private final Map K() {
            return (Map) dg.m.a(this.f4869j, this, f4859o[6]);
        }

        private final Map L() {
            return (Map) dg.m.a(this.f4870k, this, f4859o[7]);
        }

        private final Map M() {
            return (Map) dg.m.a(this.f4868i, this, f4859o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map N(b bVar) {
            List listG = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listG) {
                mf.f name = ((y0) obj).getName();
                rd.m.d(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map O(b bVar) {
            List listH = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(listH, 10)), 16));
            for (Object obj : listH) {
                mf.f name = ((k1) obj).getName();
                rd.m.d(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set P(b bVar, w wVar) {
            List list = bVar.f4861b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f4873n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(ag.l0.b(wVar2.s().g(), ((gf.o) ((of.p) it.next())).S0()));
            }
            return ed.r0.j(linkedHashSet, wVar.x());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List r(b bVar) {
            return ed.q.s0(bVar.I(), bVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List s(b bVar) {
            return ed.q.s0(bVar.J(), bVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List u() {
            Set setW = this.f4873n.w();
            ArrayList arrayList = new ArrayList();
            Iterator it = setW.iterator();
            while (it.hasNext()) {
                ed.q.A(arrayList, x((mf.f) it.next()));
            }
            return arrayList;
        }

        private final List v() {
            Set setX = this.f4873n.x();
            ArrayList arrayList = new ArrayList();
            Iterator it = setX.iterator();
            while (it.hasNext()) {
                ed.q.A(arrayList, y((mf.f) it.next()));
            }
            return arrayList;
        }

        private final List w() {
            List list = this.f4860a;
            w wVar = this.f4873n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f1 f1VarS = wVar.s().f().s((gf.j) ((of.p) it.next()));
                if (!wVar.A(f1VarS)) {
                    f1VarS = null;
                }
                if (f1VarS != null) {
                    arrayList.add(f1VarS);
                }
            }
            return arrayList;
        }

        private final List x(mf.f fVar) {
            List listI = I();
            w wVar = this.f4873n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (rd.m.a(((he.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.n(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List y(mf.f fVar) {
            List listJ = J();
            w wVar = this.f4873n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (rd.m.a(((he.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List z() {
            List list = this.f4861b;
            w wVar = this.f4873n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y0 y0VarV = ag.k0.v(wVar.s().f(), (gf.o) ((of.p) it.next()), false, 2, null);
                if (y0VarV != null) {
                    arrayList.add(y0VarV);
                }
            }
            return arrayList;
        }

        @Override // cg.w.a
        public Collection a(mf.f fVar, pe.b bVar) {
            rd.m.e(fVar, "name");
            rd.m.e(bVar, "location");
            if (!b().contains(fVar)) {
                return ed.q.k();
            }
            Collection collection = (Collection) K().get(fVar);
            return collection == null ? ed.q.k() : collection;
        }

        @Override // cg.w.a
        public Set b() {
            return (Set) dg.m.a(this.f4871l, this, f4859o[8]);
        }

        @Override // cg.w.a
        public Collection c(mf.f fVar, pe.b bVar) {
            rd.m.e(fVar, "name");
            rd.m.e(bVar, "location");
            if (!d().contains(fVar)) {
                return ed.q.k();
            }
            Collection collection = (Collection) L().get(fVar);
            return collection == null ? ed.q.k() : collection;
        }

        @Override // cg.w.a
        public Set d() {
            return (Set) dg.m.a(this.f4872m, this, f4859o[9]);
        }

        @Override // cg.w.a
        public void e(Collection collection, xf.d dVar, qd.l lVar, pe.b bVar) {
            rd.m.e(collection, "result");
            rd.m.e(dVar, "kindFilter");
            rd.m.e(lVar, "nameFilter");
            rd.m.e(bVar, "location");
            if (dVar.a(xf.d.f32038c.i())) {
                for (Object obj : G()) {
                    mf.f name = ((y0) obj).getName();
                    rd.m.d(name, "getName(...)");
                    if (((Boolean) lVar.l(name)).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (dVar.a(xf.d.f32038c.d())) {
                for (Object obj2 : F()) {
                    mf.f name2 = ((f1) obj2).getName();
                    rd.m.d(name2, "getName(...)");
                    if (((Boolean) lVar.l(name2)).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // cg.w.a
        public Set f() {
            List list = this.f4862c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar = this.f4873n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(ag.l0.b(wVar.s().g(), ((gf.s) ((of.p) it.next())).h0()));
            }
            return linkedHashSet;
        }

        @Override // cg.w.a
        public k1 g(mf.f fVar) {
            rd.m.e(fVar, "name");
            return (k1) M().get(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ yd.j[] f4874j = {rd.c0.f(new rd.w(c.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), rd.c0.f(new rd.w(c.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f4875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f4876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f4877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final dg.g f4878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final dg.g f4879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final dg.h f4880f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final dg.i f4881g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final dg.i f4882h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w f4883i;

        public static final class a implements qd.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ of.r f4884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f4885b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w f4886c;

            public a(of.r rVar, ByteArrayInputStream byteArrayInputStream, w wVar) {
                this.f4884a = rVar;
                this.f4885b = byteArrayInputStream;
                this.f4886c = wVar;
            }

            @Override // qd.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final of.p a() {
                return (of.p) this.f4884a.a(this.f4885b, this.f4886c.s().c().k());
            }
        }

        public c(w wVar, List list, List list2, List list3) throws IOException {
            Map mapI;
            rd.m.e(list, "functionList");
            rd.m.e(list2, "propertyList");
            rd.m.e(list3, "typeAliasList");
            this.f4883i = wVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                mf.f fVarB = ag.l0.b(wVar.s().g(), ((gf.j) ((of.p) obj)).C0());
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f4875a = r(linkedHashMap);
            w wVar2 = this.f4883i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                mf.f fVarB2 = ag.l0.b(wVar2.s().g(), ((gf.o) ((of.p) obj2)).S0());
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f4876b = r(linkedHashMap2);
            if (this.f4883i.s().c().g().f()) {
                w wVar3 = this.f4883i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    mf.f fVarB3 = ag.l0.b(wVar3.s().g(), ((gf.s) ((of.p) obj3)).h0());
                    Object arrayList3 = linkedHashMap3.get(fVarB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(fVarB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapI = r(linkedHashMap3);
            } else {
                mapI = ed.k0.i();
            }
            this.f4877c = mapI;
            this.f4878d = this.f4883i.s().h().f(new h0(this));
            this.f4879e = this.f4883i.s().h().f(new i0(this));
            this.f4880f = this.f4883i.s().h().h(new j0(this));
            this.f4881g = this.f4883i.s().h().d(new k0(this, this.f4883i));
            this.f4882h = this.f4883i.s().h().d(new l0(this, this.f4883i));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Collection m(mf.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f4875a
                of.r r1 = gf.j.J
                java.lang.String r2 = "PARSER"
                rd.m.d(r1, r2)
                cg.w r2 = r5.f4883i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                cg.w r3 = r5.f4883i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                cg.w$c$a r0 = new cg.w$c$a
                r0.<init>(r1, r4, r3)
                qg.h r0 = qg.k.o(r0)
                java.util.List r0 = qg.k.O(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = ed.q.k()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L64
                java.lang.Object r3 = r0.next()
                gf.j r3 = (gf.j) r3
                ag.p r4 = r2.s()
                ag.k0 r4 = r4.f()
                rd.m.b(r3)
                he.f1 r3 = r4.s(r3)
                boolean r4 = r2.A(r3)
                if (r4 == 0) goto L5d
                goto L5e
            L5d:
                r3 = 0
            L5e:
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L64:
                r2.n(r6, r1)
                java.util.List r6 = og.a.c(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cg.w.c.m(mf.f):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Collection n(mf.f r9) {
            /*
                r8 = this;
                java.util.Map r0 = r8.f4876b
                of.r r1 = gf.o.N
                java.lang.String r2 = "PARSER"
                rd.m.d(r1, r2)
                cg.w r2 = r8.f4883i
                java.lang.Object r0 = r0.get(r9)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                cg.w r3 = r8.f4883i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                cg.w$c$a r0 = new cg.w$c$a
                r0.<init>(r1, r4, r3)
                qg.h r0 = qg.k.o(r0)
                java.util.List r0 = qg.k.O(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = ed.q.k()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r0.next()
                gf.o r3 = (gf.o) r3
                ag.p r4 = r2.s()
                ag.k0 r4 = r4.f()
                rd.m.b(r3)
                r5 = 2
                r6 = 0
                r7 = 0
                he.y0 r3 = ag.k0.v(r4, r3, r7, r5, r6)
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L5f:
                r2.o(r9, r1)
                java.util.List r9 = og.a.c(r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: cg.w.c.n(mf.f):java.util.Collection");
        }

        private final k1 o(mf.f fVar) {
            gf.s sVarY0;
            byte[] bArr = (byte[]) this.f4877c.get(fVar);
            if (bArr == null || (sVarY0 = gf.s.y0(new ByteArrayInputStream(bArr), this.f4883i.s().c().k())) == null) {
                return null;
            }
            return this.f4883i.s().f().A(sVarY0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set p(c cVar, w wVar) {
            return ed.r0.j(cVar.f4875a.keySet(), wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection q(c cVar, mf.f fVar) {
            rd.m.e(fVar, "it");
            return cVar.m(fVar);
        }

        private final Map r(Map map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(ed.k0.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(ed.q.v(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((of.a) it.next()).c(byteArrayOutputStream);
                    arrayList.add(dd.d0.f10897a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection s(c cVar, mf.f fVar) {
            rd.m.e(fVar, "it");
            return cVar.n(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k1 t(c cVar, mf.f fVar) {
            rd.m.e(fVar, "it");
            return cVar.o(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set u(c cVar, w wVar) {
            return ed.r0.j(cVar.f4876b.keySet(), wVar.x());
        }

        @Override // cg.w.a
        public Collection a(mf.f fVar, pe.b bVar) {
            rd.m.e(fVar, "name");
            rd.m.e(bVar, "location");
            return !b().contains(fVar) ? ed.q.k() : (Collection) this.f4878d.l(fVar);
        }

        @Override // cg.w.a
        public Set b() {
            return (Set) dg.m.a(this.f4881g, this, f4874j[0]);
        }

        @Override // cg.w.a
        public Collection c(mf.f fVar, pe.b bVar) {
            rd.m.e(fVar, "name");
            rd.m.e(bVar, "location");
            return !d().contains(fVar) ? ed.q.k() : (Collection) this.f4879e.l(fVar);
        }

        @Override // cg.w.a
        public Set d() {
            return (Set) dg.m.a(this.f4882h, this, f4874j[1]);
        }

        @Override // cg.w.a
        public void e(Collection collection, xf.d dVar, qd.l lVar, pe.b bVar) {
            rd.m.e(collection, "result");
            rd.m.e(dVar, "kindFilter");
            rd.m.e(lVar, "nameFilter");
            rd.m.e(bVar, "location");
            if (dVar.a(xf.d.f32038c.i())) {
                Set<mf.f> setD = d();
                ArrayList arrayList = new ArrayList();
                for (mf.f fVar : setD) {
                    if (((Boolean) lVar.l(fVar)).booleanValue()) {
                        arrayList.addAll(c(fVar, bVar));
                    }
                }
                qf.l lVar2 = qf.l.f25141a;
                rd.m.d(lVar2, "INSTANCE");
                ed.q.z(arrayList, lVar2);
                collection.addAll(arrayList);
            }
            if (dVar.a(xf.d.f32038c.d())) {
                Set<mf.f> setB = b();
                ArrayList arrayList2 = new ArrayList();
                for (mf.f fVar2 : setB) {
                    if (((Boolean) lVar.l(fVar2)).booleanValue()) {
                        arrayList2.addAll(a(fVar2, bVar));
                    }
                }
                qf.l lVar3 = qf.l.f25141a;
                rd.m.d(lVar3, "INSTANCE");
                ed.q.z(arrayList2, lVar3);
                collection.addAll(arrayList2);
            }
        }

        @Override // cg.w.a
        public Set f() {
            return this.f4877c.keySet();
        }

        @Override // cg.w.a
        public k1 g(mf.f fVar) {
            rd.m.e(fVar, "name");
            return (k1) this.f4880f.l(fVar);
        }
    }

    protected w(ag.p pVar, List list, List list2, List list3, qd.a aVar) {
        rd.m.e(pVar, "c");
        rd.m.e(list, "functionList");
        rd.m.e(list2, "propertyList");
        rd.m.e(list3, "typeAliasList");
        rd.m.e(aVar, "classNames");
        this.f4855b = pVar;
        this.f4856c = q(list, list2, list3);
        this.f4857d = pVar.h().d(new u(aVar));
        this.f4858e = pVar.h().a(new v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(qd.a aVar) {
        return ed.q.M0((Iterable) aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set l(w wVar) {
        Set setV = wVar.v();
        if (setV == null) {
            return null;
        }
        return ed.r0.j(ed.r0.j(wVar.t(), wVar.f4856c.f()), setV);
    }

    private final a q(List list, List list2, List list3) {
        return this.f4855b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final he.e r(mf.f fVar) {
        return this.f4855b.c().b(p(fVar));
    }

    private final Set u() {
        return (Set) dg.m.b(this.f4858e, this, f4854f[1]);
    }

    private final k1 y(mf.f fVar) {
        return this.f4856c.g(fVar);
    }

    protected boolean A(f1 f1Var) {
        rd.m.e(f1Var, "function");
        return true;
    }

    @Override // xf.l, xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return this.f4856c.a(fVar, bVar);
    }

    @Override // xf.l, xf.k
    public Set b() {
        return this.f4856c.b();
    }

    @Override // xf.l, xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return this.f4856c.c(fVar, bVar);
    }

    @Override // xf.l, xf.k
    public Set d() {
        return this.f4856c.d();
    }

    @Override // xf.l, xf.k
    public Set f() {
        return u();
    }

    @Override // xf.l, xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        if (z(fVar)) {
            return r(fVar);
        }
        if (this.f4856c.f().contains(fVar)) {
            return y(fVar);
        }
        return null;
    }

    protected abstract void j(Collection collection, qd.l lVar);

    protected final Collection m(xf.d dVar, qd.l lVar, pe.b bVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        rd.m.e(bVar, "location");
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = xf.d.f32038c;
        if (dVar.a(aVar.g())) {
            j(arrayList, lVar);
        }
        this.f4856c.e(arrayList, dVar, lVar, bVar);
        if (dVar.a(aVar.c())) {
            for (mf.f fVar : t()) {
                if (((Boolean) lVar.l(fVar)).booleanValue()) {
                    og.a.a(arrayList, r(fVar));
                }
            }
        }
        if (dVar.a(xf.d.f32038c.h())) {
            for (mf.f fVar2 : this.f4856c.f()) {
                if (((Boolean) lVar.l(fVar2)).booleanValue()) {
                    og.a.a(arrayList, this.f4856c.g(fVar2));
                }
            }
        }
        return og.a.c(arrayList);
    }

    protected void n(mf.f fVar, List list) {
        rd.m.e(fVar, "name");
        rd.m.e(list, "functions");
    }

    protected void o(mf.f fVar, List list) {
        rd.m.e(fVar, "name");
        rd.m.e(list, "descriptors");
    }

    protected abstract mf.b p(mf.f fVar);

    protected final ag.p s() {
        return this.f4855b;
    }

    public final Set t() {
        return (Set) dg.m.a(this.f4857d, this, f4854f[0]);
    }

    protected abstract Set v();

    protected abstract Set w();

    protected abstract Set x();

    protected boolean z(mf.f fVar) {
        rd.m.e(fVar, "name");
        return t().contains(fVar);
    }
}
