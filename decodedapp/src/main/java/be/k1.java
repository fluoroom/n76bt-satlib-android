package be;

import be.l2;
import yd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends c2 implements yd.k, yd.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final dd.j f3903z;

    public static final class a extends l2.d implements g.a, qd.l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final k1 f3904s;

        public a(k1 k1Var) {
            rd.m.e(k1Var, "property");
            this.f3904s = k1Var;
        }

        @Override // yd.j.a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public k1 b() {
            return this.f3904s;
        }

        public void Y(Object obj) throws zd.a {
            b().j0(obj);
        }

        @Override // qd.l
        public /* bridge */ /* synthetic */ Object l(Object obj) throws zd.a {
            Y(obj);
            return dd.d0.f10897a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(d1 d1Var, he.y0 y0Var) {
        super(d1Var, y0Var);
        rd.m.e(d1Var, "container");
        rd.m.e(y0Var, "descriptor");
        this.f3903z = dd.k.a(dd.n.f10910b, new j1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a g0(k1 k1Var) {
        return new a(k1Var);
    }

    @Override // yd.g
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) this.f3903z.getValue();
    }

    public void j0(Object obj) throws zd.a {
        h().i(obj);
    }
}
