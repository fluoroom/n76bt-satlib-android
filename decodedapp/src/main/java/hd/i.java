package hd;

import hd.f;
import hd.i;
import qd.p;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public interface i {

    public static final class a {
        public static i b(i iVar, i iVar2) {
            m.e(iVar2, "context");
            return iVar2 == j.f15243a ? iVar : (i) iVar2.r(iVar, new p() { // from class: hd.h
                @Override // qd.p
                public final Object s(Object obj, Object obj2) {
                    return i.a.c((i) obj, (i.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i c(i iVar, b bVar) {
            m.e(iVar, "acc");
            m.e(bVar, "element");
            i iVarK = iVar.k(bVar.getKey());
            j jVar = j.f15243a;
            if (iVarK == jVar) {
                return bVar;
            }
            f.b bVar2 = f.f15241k;
            f fVar = (f) iVarK.a(bVar2);
            if (fVar == null) {
                return new d(iVarK, bVar);
            }
            i iVarK2 = iVarK.k(bVar2);
            return iVarK2 == jVar ? new d(bVar, fVar) : new d(new d(iVarK2, bVar), fVar);
        }
    }

    public interface b extends i {

        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                m.e(pVar, "operation");
                return pVar.s(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                m.e(cVar, "key");
                if (!m.a(bVar.getKey(), cVar)) {
                    return null;
                }
                m.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c cVar) {
                m.e(cVar, "key");
                return m.a(bVar.getKey(), cVar) ? j.f15243a : bVar;
            }

            public static i d(b bVar, i iVar) {
                m.e(iVar, "context");
                return a.b(bVar, iVar);
            }
        }

        @Override // hd.i
        b a(c cVar);

        c getKey();
    }

    public interface c {
    }

    b a(c cVar);

    i k(c cVar);

    i l(i iVar);

    Object r(Object obj, p pVar);
}
