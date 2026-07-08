package ve;

import he.w1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v0 {
    public static final ie.c a(ye.k kVar, cf.c0 c0Var) {
        Object next;
        rd.m.e(kVar, "c");
        rd.m.e(c0Var, "wildcardType");
        if (c0Var.C() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator it = new ye.g(kVar, c0Var, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ie.c cVar = (ie.c) next;
            for (mf.c cVar2 : b0.e()) {
                if (rd.m.a(cVar.d(), cVar2)) {
                    break loop0;
                }
            }
        }
        return (ie.c) next;
    }

    public static final boolean b(he.b bVar) {
        rd.m.e(bVar, "memberDescriptor");
        return (bVar instanceof he.z) && rd.m.a(bVar.d0(xe.e.Q), Boolean.TRUE);
    }

    public static final boolean c(e0 e0Var) {
        rd.m.e(e0Var, "javaTypeEnhancementState");
        return e0Var.b().l(b0.d()) == p0.f30661e;
    }

    public static final he.u d(w1 w1Var) {
        rd.m.e(w1Var, "<this>");
        he.u uVarG = y.g(w1Var);
        rd.m.d(uVarG, "toDescriptorVisibility(...)");
        return uVarG;
    }
}
