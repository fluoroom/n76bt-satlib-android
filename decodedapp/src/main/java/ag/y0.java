package ag;

import he.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y0 {
    public static final dd.q a(gf.c cVar, jf.d dVar, jf.h hVar) {
        List listH1;
        rd.m.e(cVar, "<this>");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar, "typeTable");
        List<Integer> listC1 = cVar.c1();
        rd.m.d(listC1, "getMultiFieldValueClassUnderlyingNameList(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(listC1, 10));
        for (Integer num : listC1) {
            rd.m.b(num);
            arrayList.add(l0.b(dVar, num.intValue()));
        }
        dd.q qVarA = dd.w.a(Integer.valueOf(cVar.f1()), Integer.valueOf(cVar.e1()));
        if (rd.m.a(qVarA, dd.w.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listG1 = cVar.g1();
            rd.m.d(listG1, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            listH1 = new ArrayList(ed.q.v(listG1, 10));
            for (Integer num2 : listG1) {
                rd.m.b(num2);
                listH1.add(hVar.a(num2.intValue()));
            }
        } else {
            if (!rd.m.a(qVarA, dd.w.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + l0.b(dVar, cVar.U0()) + " has illegal multi-field value class representation").toString());
            }
            listH1 = cVar.h1();
        }
        return dd.w.a(arrayList, listH1);
    }

    public static final q1 b(gf.c cVar, jf.d dVar, jf.h hVar, qd.l lVar, qd.l lVar2) {
        ig.j jVar;
        rd.m.e(cVar, "<this>");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar, "typeTable");
        rd.m.e(lVar, "typeDeserializer");
        rd.m.e(lVar2, "typeOfPublicProperty");
        if (cVar.b1() > 0) {
            dd.q qVarA = a(cVar, dVar, hVar);
            List list = (List) qVarA.a();
            List list2 = (List) qVarA.b();
            ArrayList arrayList = new ArrayList(ed.q.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(lVar.l(it.next()));
            }
            return new he.i0(ed.q.Q0(list, arrayList));
        }
        if (!cVar.D1()) {
            return null;
        }
        mf.f fVarB = l0.b(dVar, cVar.Y0());
        gf.r rVarI = jf.g.i(cVar, hVar);
        if ((rVarI != null && (jVar = (ig.j) lVar.l(rVarI)) != null) || (jVar = (ig.j) lVar2.l(fVarB)) != null) {
            return new he.a0(fVarB, jVar);
        }
        throw new IllegalStateException(("cannot determine underlying type for value class " + l0.b(dVar, cVar.U0()) + " with property " + fVarB).toString());
    }
}
