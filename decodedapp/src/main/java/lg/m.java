package lg;

import d.h0;
import he.s1;
import java.util.List;
import lg.f;

/* JADX INFO: loaded from: classes3.dex */
final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f20604a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20605b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // lg.f
    public String a() {
        return f20605b;
    }

    @Override // lg.f
    public boolean b(he.z zVar) {
        rd.m.e(zVar, "functionDescriptor");
        List<s1> listI = zVar.i();
        rd.m.d(listI, "getValueParameters(...)");
        if (h0.a(listI) && listI.isEmpty()) {
            return true;
        }
        for (s1 s1Var : listI) {
            rd.m.b(s1Var);
            if (uf.e.f(s1Var) || s1Var.k0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // lg.f
    public String c(he.z zVar) {
        return f.a.a(this, zVar);
    }
}
