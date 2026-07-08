package be;

import be.l2;
import yd.k;

/* JADX INFO: loaded from: classes3.dex */
public class c2 extends l2 implements yd.k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final dd.j f3831x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final dd.j f3832y;

    public static final class a extends l2.c implements k.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final c2 f3833s;

        public a(c2 c2Var) {
            rd.m.e(c2Var, "property");
            this.f3833s = c2Var;
        }

        @Override // yd.j.a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public c2 b() {
            return this.f3833s;
        }

        @Override // qd.a
        public Object a() {
            return R().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d1 d1Var, he.y0 y0Var) {
        super(d1Var, y0Var);
        rd.m.e(d1Var, "container");
        rd.m.e(y0Var, "descriptor");
        dd.n nVar = dd.n.f10910b;
        this.f3831x = dd.k.a(nVar, new a2(this));
        this.f3832y = dd.k.a(nVar, new b2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a b0(c2 c2Var) {
        return new a(c2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e0(c2 c2Var) {
        return c2Var.W(c2Var.U(), null, null);
    }

    @Override // qd.a
    public Object a() {
        return get();
    }

    @Override // yd.j
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a f() {
        return (a) this.f3831x.getValue();
    }

    @Override // yd.k
    public Object get() {
        return Y().i(new Object[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d1 d1Var, String str, String str2, Object obj) {
        super(d1Var, str, str2, obj);
        rd.m.e(d1Var, "container");
        rd.m.e(str, "name");
        rd.m.e(str2, "signature");
        dd.n nVar = dd.n.f10910b;
        this.f3831x = dd.k.a(nVar, new a2(this));
        this.f3832y = dd.k.a(nVar, new b2(this));
    }
}
