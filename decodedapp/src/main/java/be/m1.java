package be;

import be.l2;
import yd.h;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends f2 implements yd.h {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final dd.j f3934z;

    public static final class a extends l2.d implements h.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final m1 f3935s;

        public a(m1 m1Var) {
            rd.m.e(m1Var, "property");
            this.f3935s = m1Var;
        }

        @Override // yd.j.a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public m1 b() {
            return this.f3935s;
        }

        public void Y(Object obj, Object obj2) throws zd.a {
            b().set(obj, obj2);
        }

        @Override // qd.p
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2) throws zd.a {
            Y(obj, obj2);
            return dd.d0.f10897a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(d1 d1Var, String str, String str2, Object obj) {
        super(d1Var, str, str2, obj);
        rd.m.e(d1Var, "container");
        rd.m.e(str, "name");
        rd.m.e(str2, "signature");
        this.f3934z = dd.k.a(dd.n.f10910b, new l1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a g0(m1 m1Var) {
        return new a(m1Var);
    }

    @Override // yd.h, yd.g
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) this.f3934z.getValue();
    }

    @Override // yd.h
    public void set(Object obj, Object obj2) throws zd.a {
        h().i(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(d1 d1Var, he.y0 y0Var) {
        super(d1Var, y0Var);
        rd.m.e(d1Var, "container");
        rd.m.e(y0Var, "descriptor");
        this.f3934z = dd.k.a(dd.n.f10910b, new l1(this));
    }
}
