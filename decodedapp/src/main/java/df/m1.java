package df;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11012a = new LinkedHashMap();

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m1 f11014b;

        /* JADX INFO: renamed from: df.m1$a$a, reason: collision with other inner class name */
        public final class C0147a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f11015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f11016b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f11017c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private dd.q f11018d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f11019e;

            public C0147a(a aVar, String str, String str2) {
                rd.m.e(str, "functionName");
                this.f11019e = aVar;
                this.f11015a = str;
                this.f11016b = str2;
                this.f11017c = new ArrayList();
                this.f11018d = dd.w.a("V", null);
            }

            public final dd.q a() {
                ef.f0 f0Var = ef.f0.f11965a;
                String strC = this.f11019e.c();
                String str = this.f11015a;
                List list = this.f11017c;
                ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((dd.q) it.next()).c());
                }
                String strM = f0Var.m(strC, f0Var.k(str, arrayList, (String) this.f11018d.c()));
                q1 q1Var = (q1) this.f11018d.d();
                List list2 = this.f11017c;
                ArrayList arrayList2 = new ArrayList(ed.q.v(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((q1) ((dd.q) it2.next()).d());
                }
                return dd.w.a(strM, new f1(q1Var, arrayList2, this.f11016b));
            }

            public final void b(String str, h... hVarArr) {
                q1 q1Var;
                rd.m.e(str, "type");
                rd.m.e(hVarArr, "qualifiers");
                List list = this.f11017c;
                if (hVarArr.length == 0) {
                    q1Var = null;
                } else {
                    Iterable<ed.g0> iterableX0 = ed.j.x0(hVarArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(iterableX0, 10)), 16));
                    for (ed.g0 g0Var : iterableX0) {
                        linkedHashMap.put(Integer.valueOf(g0Var.c()), (h) g0Var.d());
                    }
                    q1Var = new q1(linkedHashMap);
                }
                list.add(dd.w.a(str, q1Var));
            }

            public final void c(String str, h... hVarArr) {
                rd.m.e(str, "type");
                rd.m.e(hVarArr, "qualifiers");
                Iterable<ed.g0> iterableX0 = ed.j.x0(hVarArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(iterableX0, 10)), 16));
                for (ed.g0 g0Var : iterableX0) {
                    linkedHashMap.put(Integer.valueOf(g0Var.c()), (h) g0Var.d());
                }
                this.f11018d = dd.w.a(str, new q1(linkedHashMap));
            }

            public final void d(vf.e eVar) {
                rd.m.e(eVar, "type");
                String strF = eVar.f();
                rd.m.d(strF, "getDesc(...)");
                this.f11018d = dd.w.a(strF, null);
            }
        }

        public a(m1 m1Var, String str) {
            rd.m.e(str, "className");
            this.f11014b = m1Var;
            this.f11013a = str;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, qd.l lVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, lVar);
        }

        public final void a(String str, String str2, qd.l lVar) {
            rd.m.e(str, "name");
            rd.m.e(lVar, "block");
            Map map = this.f11014b.f11012a;
            C0147a c0147a = new C0147a(this, str, str2);
            lVar.l(c0147a);
            dd.q qVarA = c0147a.a();
            map.put(qVarA.c(), qVarA.d());
        }

        public final String c() {
            return this.f11013a;
        }
    }

    public final Map b() {
        return this.f11012a;
    }
}
