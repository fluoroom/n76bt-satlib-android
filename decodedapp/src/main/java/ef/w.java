package ef;

import ef.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static final x a(v vVar, cf.g gVar, jf.c cVar) {
        rd.m.e(vVar, "<this>");
        rd.m.e(gVar, "javaClass");
        rd.m.e(cVar, "metadataVersion");
        v.a aVarA = vVar.a(gVar, cVar);
        if (aVarA != null) {
            return aVarA.a();
        }
        return null;
    }

    public static final x b(v vVar, mf.b bVar, jf.c cVar) {
        rd.m.e(vVar, "<this>");
        rd.m.e(bVar, "classId");
        rd.m.e(cVar, "metadataVersion");
        v.a aVarB = vVar.b(bVar, cVar);
        if (aVarB != null) {
            return aVarB.a();
        }
        return null;
    }
}
