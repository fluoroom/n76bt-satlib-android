package fe;

import dg.n;
import ed.r0;
import fe.g;
import he.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements je.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f12978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f12979b;

    public a(n nVar, h0 h0Var) {
        m.e(nVar, "storageManager");
        m.e(h0Var, "module");
        this.f12978a = nVar;
        this.f12979b = h0Var;
    }

    @Override // je.b
    public he.e a(mf.b bVar) {
        mf.c cVarF;
        g.b bVarC;
        m.e(bVar, "classId");
        if (bVar.i() || bVar.j()) {
            return null;
        }
        String strA = bVar.g().a();
        if (!q.P(strA, "Function", false, 2, null) || (bVarC = g.f13009c.a().c((cVarF = bVar.f()), strA)) == null) {
            return null;
        }
        f fVarA = bVarC.a();
        int iB = bVarC.b();
        List listL = this.f12979b.y(cVarF).L();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (obj instanceof ee.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        android.support.v4.media.session.b.a(ed.q.b0(arrayList2));
        return new b(this.f12978a, (ee.c) ed.q.Z(arrayList), fVarA, iB);
    }

    @Override // je.b
    public Collection b(mf.c cVar) {
        m.e(cVar, "packageFqName");
        return r0.d();
    }

    @Override // je.b
    public boolean c(mf.c cVar, mf.f fVar) {
        m.e(cVar, "packageFqName");
        m.e(fVar, "name");
        String strD = fVar.d();
        m.d(strD, "asString(...)");
        return (q.J(strD, "Function", false, 2, null) || q.J(strD, "KFunction", false, 2, null) || q.J(strD, "SuspendFunction", false, 2, null) || q.J(strD, "KSuspendFunction", false, 2, null)) && g.f13009c.a().c(cVar, strD) != null;
    }
}
