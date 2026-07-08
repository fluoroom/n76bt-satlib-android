package be;

import be.l2;
import java.lang.reflect.Member;
import yd.j;

/* JADX INFO: loaded from: classes3.dex */
public class i2 extends l2 implements yd.j, qd.p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final dd.j f3893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final dd.j f3894y;

    public static final class a extends l2.c implements j.b, qd.p {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final i2 f3895s;

        public a(i2 i2Var) {
            rd.m.e(i2Var, "property");
            this.f3895s = i2Var;
        }

        @Override // yd.j.a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public i2 b() {
            return this.f3895s;
        }

        @Override // qd.p
        public Object s(Object obj, Object obj2) {
            return b().f0(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(d1 d1Var, he.y0 y0Var) {
        super(d1Var, y0Var);
        rd.m.e(d1Var, "container");
        rd.m.e(y0Var, "descriptor");
        dd.n nVar = dd.n.f10910b;
        this.f3893x = dd.k.a(nVar, new g2(this));
        this.f3894y = dd.k.a(nVar, new h2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a b0(i2 i2Var) {
        return new a(i2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member e0(i2 i2Var) {
        return i2Var.U();
    }

    public Object f0(Object obj, Object obj2) {
        return f().i(obj, obj2);
    }

    @Override // yd.j
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public a f() {
        return (a) this.f3893x.getValue();
    }

    @Override // qd.p
    public Object s(Object obj, Object obj2) {
        return f0(obj, obj2);
    }
}
