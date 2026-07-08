package be;

import be.l2;
import yd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends i2 implements yd.j, qd.p, yd.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final dd.j f3958z;

    public static final class a extends l2.d implements g.a, qd.q {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final o1 f3959s;

        public a(o1 o1Var) {
            rd.m.e(o1Var, "property");
            this.f3959s = o1Var;
        }

        @Override // yd.j.a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public o1 b() {
            return this.f3959s;
        }

        public void Y(Object obj, Object obj2, Object obj3) throws zd.a {
            b().k0(obj, obj2, obj3);
        }

        @Override // qd.q
        public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3) throws zd.a {
            Y(obj, obj2, obj3);
            return dd.d0.f10897a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(d1 d1Var, he.y0 y0Var) {
        super(d1Var, y0Var);
        rd.m.e(d1Var, "container");
        rd.m.e(y0Var, "descriptor");
        this.f3958z = dd.k.a(dd.n.f10910b, new n1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a h0(o1 o1Var) {
        return new a(o1Var);
    }

    @Override // yd.g
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) this.f3958z.getValue();
    }

    public void k0(Object obj, Object obj2, Object obj3) throws zd.a {
        h().i(obj, obj2, obj3);
    }
}
