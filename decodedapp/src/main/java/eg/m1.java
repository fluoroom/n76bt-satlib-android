package eg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12135e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f12136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.k1 f12137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f12139d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final m1 a(m1 m1Var, he.k1 k1Var, List list) {
            rd.m.e(k1Var, "typeAliasDescriptor");
            rd.m.e(list, "arguments");
            List parameters = k1Var.k().getParameters();
            rd.m.d(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(ed.q.v(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((he.l1) it.next()).a());
            }
            return new m1(m1Var, k1Var, list, ed.k0.r(ed.q.Q0(arrayList, list)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ m1(m1 m1Var, he.k1 k1Var, List list, Map map, rd.h hVar) {
        this(m1Var, k1Var, list, map);
    }

    public final List a() {
        return this.f12138c;
    }

    public final he.k1 b() {
        return this.f12137b;
    }

    public final a2 c(u1 u1Var) {
        rd.m.e(u1Var, "constructor");
        he.h hVarQ = u1Var.q();
        if (hVarQ instanceof he.l1) {
            return (a2) this.f12139d.get(hVarQ);
        }
        return null;
    }

    public final boolean d(he.k1 k1Var) {
        rd.m.e(k1Var, "descriptor");
        if (rd.m.a(this.f12137b, k1Var)) {
            return true;
        }
        m1 m1Var = this.f12136a;
        return m1Var != null ? m1Var.d(k1Var) : false;
    }

    private m1(m1 m1Var, he.k1 k1Var, List list, Map map) {
        this.f12136a = m1Var;
        this.f12137b = k1Var;
        this.f12138c = list;
        this.f12139d = map;
    }
}
