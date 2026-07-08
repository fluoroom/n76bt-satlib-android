package jf;

import ed.q;
import gf.r;
import gf.u;
import java.util.ArrayList;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    private final List f18697a;

    public h(u uVar) {
        m.e(uVar, "typeTable");
        List listW = uVar.w();
        if (uVar.x()) {
            int iS = uVar.s();
            List listW2 = uVar.w();
            m.d(listW2, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(q.v(listW2, 10));
            int i10 = 0;
            for (Object obj : listW2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    q.u();
                }
                r rVarBuild = (r) obj;
                if (i10 >= iS) {
                    rVarBuild = rVarBuild.toBuilder().F(true).build();
                }
                arrayList.add(rVarBuild);
                i10 = i11;
            }
            listW = arrayList;
        }
        m.d(listW, "run(...)");
        this.f18697a = listW;
    }

    public final r a(int i10) {
        return (r) this.f18697a.get(i10);
    }
}
