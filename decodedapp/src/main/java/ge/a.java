package ge;

import he.b;
import he.e0;
import he.g1;
import java.util.List;
import ke.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends xf.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0196a f13792e = new C0196a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final mf.f f13793f;

    /* JADX INFO: renamed from: ge.a$a, reason: collision with other inner class name */
    public static final class C0196a {
        public /* synthetic */ C0196a(rd.h hVar) {
            this();
        }

        public final mf.f a() {
            return a.f13793f;
        }

        private C0196a() {
        }
    }

    static {
        mf.f fVarH = mf.f.h("clone");
        rd.m.d(fVarH, "identifier(...)");
        f13793f = fVarH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dg.n nVar, he.e eVar) {
        super(nVar, eVar);
        rd.m.e(nVar, "storageManager");
        rd.m.e(eVar, "containingClass");
    }

    @Override // xf.f
    protected List j() {
        o0 o0VarL1 = o0.l1(m(), ie.h.f16054l.b(), f13793f, b.a.DECLARATION, g1.f15281a);
        o0VarL1.R0(null, m().J0(), ed.q.k(), ed.q.k(), ed.q.k(), uf.e.m(m()).i(), e0.f15261d, he.t.f15307c);
        return ed.q.e(o0VarL1);
    }
}
