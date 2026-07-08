package ae;

import be.v2;
import be.z2;
import ed.q;
import he.e;
import he.f;
import he.h;
import java.util.Iterator;
import java.util.List;
import rd.c0;
import rd.m;
import yd.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final yd.c a(yd.d dVar) {
        Object obj;
        yd.c cVarB;
        m.e(dVar, "<this>");
        if (dVar instanceof yd.c) {
            return (yd.c) dVar;
        }
        if (!(dVar instanceof n)) {
            throw new z2("Cannot calculate JVM erasure for type: " + dVar);
        }
        List upperBounds = ((n) dVar).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            yd.m mVar = (yd.m) next;
            m.c(mVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            h hVarQ = ((v2) mVar).n().N0().q();
            e eVar = hVarQ instanceof e ? (e) hVarQ : null;
            if (eVar != null && eVar.j() != f.f15272c && eVar.j() != f.f15275f) {
                obj = next;
                break;
            }
        }
        yd.m mVar2 = (yd.m) obj;
        if (mVar2 == null) {
            mVar2 = (yd.m) q.b0(upperBounds);
        }
        return (mVar2 == null || (cVarB = b(mVar2)) == null) ? c0.b(Object.class) : cVarB;
    }

    public static final yd.c b(yd.m mVar) {
        yd.c cVarA;
        m.e(mVar, "<this>");
        yd.d dVarF = mVar.f();
        if (dVarF != null && (cVarA = a(dVarF)) != null) {
            return cVarA;
        }
        throw new z2("Cannot calculate JVM erasure for type: " + mVar);
    }
}
