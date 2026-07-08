package ef;

import eg.r0;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f11993a = new h0();

    private h0() {
    }

    @Override // ef.g0
    public void b(r0 r0Var, he.e eVar) {
        rd.m.e(r0Var, "kotlinType");
        rd.m.e(eVar, "descriptor");
    }

    @Override // ef.g0
    public r0 c(r0 r0Var) {
        rd.m.e(r0Var, "kotlinType");
        return null;
    }

    @Override // ef.g0
    public r0 d(Collection collection) {
        rd.m.e(collection, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + ed.q.i0(collection, null, null, null, 0, null, null, 63, null));
    }

    @Override // ef.g0
    public String e(he.e eVar) {
        rd.m.e(eVar, "classDescriptor");
        return null;
    }

    @Override // ef.g0
    public String f(he.e eVar) {
        rd.m.e(eVar, "classDescriptor");
        return null;
    }

    @Override // ef.g0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s a(he.e eVar) {
        rd.m.e(eVar, "classDescriptor");
        return null;
    }
}
