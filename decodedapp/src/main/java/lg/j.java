package lg;

import ee.n;
import eg.r0;
import he.s1;
import lg.f;

/* JADX INFO: loaded from: classes3.dex */
final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f20598a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20599b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // lg.f
    public String a() {
        return f20599b;
    }

    @Override // lg.f
    public boolean b(he.z zVar) {
        rd.m.e(zVar, "functionDescriptor");
        s1 s1Var = (s1) zVar.i().get(1);
        n.b bVar = ee.n.f11822k;
        rd.m.b(s1Var);
        r0 r0VarA = bVar.a(uf.e.s(s1Var));
        if (r0VarA == null) {
            return false;
        }
        r0 type = s1Var.getType();
        rd.m.d(type, "getType(...)");
        return jg.d.w(r0VarA, jg.d.A(type));
    }

    @Override // lg.f
    public String c(he.z zVar) {
        return f.a.a(this, zVar);
    }
}
