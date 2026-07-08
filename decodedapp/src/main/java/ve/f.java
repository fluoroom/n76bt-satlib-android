package ve;

import he.f1;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends u0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f30577o = new f();

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(f1 f1Var, he.b bVar) {
        rd.m.e(bVar, "it");
        return u0.f30675a.j().containsKey(ef.c0.d(f1Var));
    }

    public final mf.f j(f1 f1Var) {
        rd.m.e(f1Var, "functionDescriptor");
        Map mapJ = u0.f30675a.j();
        String strD = ef.c0.d(f1Var);
        if (strD == null) {
            return null;
        }
        return (mf.f) mapJ.get(strD);
    }

    public final boolean k(f1 f1Var) {
        rd.m.e(f1Var, "functionDescriptor");
        return ee.i.h0(f1Var) && uf.e.i(f1Var, false, new e(f1Var), 1, null) != null;
    }

    public final boolean m(f1 f1Var) {
        rd.m.e(f1Var, "<this>");
        return rd.m.a(f1Var.getName().d(), "removeAt") && rd.m.a(ef.c0.d(f1Var), u0.f30675a.h().d());
    }
}
