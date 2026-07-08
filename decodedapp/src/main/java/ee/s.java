package ee;

import dd.w;
import ed.k0;
import eg.i2;
import eg.r0;
import he.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a */
    public static final s f11931a = new s();

    /* JADX INFO: renamed from: b */
    private static final Set f11932b;

    /* JADX INFO: renamed from: c */
    private static final Set f11933c;

    /* JADX INFO: renamed from: d */
    private static final HashMap f11934d;

    /* JADX INFO: renamed from: e */
    private static final HashMap f11935e;

    /* JADX INFO: renamed from: f */
    private static final HashMap f11936f;

    /* JADX INFO: renamed from: g */
    private static final Set f11937g;

    static {
        r[] rVarArrValues = r.values();
        ArrayList arrayList = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList.add(rVar.f());
        }
        f11932b = ed.q.M0(arrayList);
        q[] qVarArrValues = q.values();
        ArrayList arrayList2 = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList2.add(qVar.d());
        }
        f11933c = ed.q.M0(arrayList2);
        f11934d = new HashMap();
        f11935e = new HashMap();
        f11936f = k0.k(w.a(q.f11914c, mf.f.h("ubyteArrayOf")), w.a(q.f11915d, mf.f.h("ushortArrayOf")), w.a(q.f11916e, mf.f.h("uintArrayOf")), w.a(q.f11917f, mf.f.h("ulongArrayOf")));
        r[] rVarArrValues2 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : rVarArrValues2) {
            linkedHashSet.add(rVar2.d().h());
        }
        f11937g = linkedHashSet;
        for (r rVar3 : r.values()) {
            f11934d.put(rVar3.d(), rVar3.e());
            f11935e.put(rVar3.e(), rVar3.d());
        }
    }

    private s() {
    }

    public static final boolean d(r0 r0Var) {
        he.h hVarQ;
        rd.m.e(r0Var, "type");
        if (i2.w(r0Var) || (hVarQ = r0Var.N0().q()) == null) {
            return false;
        }
        return f11931a.c(hVarQ);
    }

    public final mf.b a(mf.b bVar) {
        rd.m.e(bVar, "arrayClassId");
        return (mf.b) f11934d.get(bVar);
    }

    public final boolean b(mf.f fVar) {
        rd.m.e(fVar, "name");
        return f11937g.contains(fVar);
    }

    public final boolean c(he.m mVar) {
        rd.m.e(mVar, "descriptor");
        he.m mVarB = mVar.b();
        return (mVarB instanceof n0) && rd.m.a(((n0) mVarB).d(), o.B) && f11932b.contains(mVar.getName());
    }
}
