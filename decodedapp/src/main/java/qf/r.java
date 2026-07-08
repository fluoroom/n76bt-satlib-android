package qf;

import dd.d0;
import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static final Collection b(Collection collection, qd.l lVar) {
        rd.m.e(collection, "<this>");
        rd.m.e(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        og.k kVarA = og.k.f23578c.a();
        while (!linkedList.isEmpty()) {
            Object objZ = ed.q.Z(linkedList);
            og.k kVarA2 = og.k.f23578c.a();
            Collection collectionQ = o.q(objZ, linkedList, lVar, new q(kVarA2));
            rd.m.d(collectionQ, "extractMembersOverridableInBothWays(...)");
            if (collectionQ.size() == 1 && kVarA2.isEmpty()) {
                Object objV0 = ed.q.v0(collectionQ);
                rd.m.d(objV0, "single(...)");
                kVarA.add(objV0);
            } else {
                Object objL = o.L(collectionQ, lVar);
                he.a aVar = (he.a) lVar.l(objL);
                for (Object obj : collectionQ) {
                    rd.m.b(obj);
                    if (!o.B(aVar, (he.a) lVar.l(obj))) {
                        kVarA2.add(obj);
                    }
                }
                if (!kVarA2.isEmpty()) {
                    kVarA.addAll(kVarA2);
                }
                kVarA.add(objL);
            }
        }
        return kVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 c(og.k kVar, Object obj) {
        rd.m.b(obj);
        kVar.add(obj);
        return d0.f10897a;
    }
}
