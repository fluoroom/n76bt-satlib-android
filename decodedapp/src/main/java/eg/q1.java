package eg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends lg.e implements Iterable, sd.a {

    /* JADX INFO: renamed from: b */
    public static final a f12167b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final q1 f12168c = new q1(ed.q.k());

    public static final class a extends lg.z {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        @Override // lg.z
        public int c(ConcurrentHashMap concurrentHashMap, String str, qd.l lVar) {
            int iIntValue;
            rd.m.e(concurrentHashMap, "<this>");
            rd.m.e(str, "key");
            rd.m.e(lVar, "compute");
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objL = lVar.l(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objL).intValue()));
                        iIntValue = ((Number) objL).intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        public final q1 j(List list) {
            rd.m.e(list, "attributes");
            return list.isEmpty() ? k() : new q1(list, null);
        }

        public final q1 k() {
            return q1.f12168c;
        }

        private a() {
        }
    }

    public /* synthetic */ q1(List list, rd.h hVar) {
        this(list);
    }

    @Override // lg.a
    protected lg.z c() {
        return f12167b;
    }

    public final q1 h(q1 q1Var) {
        rd.m.e(q1Var, "other");
        if (isEmpty() && q1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f12167b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            o1 o1Var = (o1) b().get(iIntValue);
            o1 o1Var2 = (o1) q1Var.b().get(iIntValue);
            og.a.a(arrayList, o1Var == null ? o1Var2 != null ? o1Var2.a(o1Var) : null : o1Var.a(o1Var2));
        }
        return f12167b.j(arrayList);
    }

    public final boolean i(o1 o1Var) {
        rd.m.e(o1Var, "attribute");
        return b().get(f12167b.f(o1Var.b())) != null;
    }

    public final q1 j(q1 q1Var) {
        rd.m.e(q1Var, "other");
        if (isEmpty() && q1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f12167b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            o1 o1Var = (o1) b().get(iIntValue);
            o1 o1Var2 = (o1) q1Var.b().get(iIntValue);
            og.a.a(arrayList, o1Var == null ? o1Var2 != null ? o1Var2.c(o1Var) : null : o1Var.c(o1Var2));
        }
        return f12167b.j(arrayList);
    }

    public final q1 l(o1 o1Var) {
        rd.m.e(o1Var, "attribute");
        if (i(o1Var)) {
            return this;
        }
        if (isEmpty()) {
            return new q1(o1Var);
        }
        return f12167b.j(ed.q.t0(ed.q.H0(this), o1Var));
    }

    public final q1 m(o1 o1Var) {
        rd.m.e(o1Var, "attribute");
        if (!isEmpty()) {
            lg.c cVarB = b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : cVarB) {
                if (!rd.m.a((o1) obj, o1Var)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != b().b()) {
                return f12167b.j(arrayList);
            }
        }
        return this;
    }

    private q1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            e(o1Var.b(), o1Var);
        }
    }

    private q1(o1 o1Var) {
        this(ed.q.e(o1Var));
    }
}
