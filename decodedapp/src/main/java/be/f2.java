package be;

import be.l2;
import java.lang.reflect.Member;
import yd.l;

/* JADX INFO: loaded from: classes3.dex */
public class f2 extends l2 implements yd.l {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final dd.j f3862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final dd.j f3863y;

    public static final class a extends l2.c implements l.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final f2 f3864s;

        public a(f2 f2Var) {
            rd.m.e(f2Var, "property");
            this.f3864s = f2Var;
        }

        @Override // yd.j.a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public f2 b() {
            return this.f3864s;
        }

        @Override // qd.l
        public Object l(Object obj) {
            return b().get(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(d1 d1Var, String str, String str2, Object obj) {
        super(d1Var, str, str2, obj);
        rd.m.e(d1Var, "container");
        rd.m.e(str, "name");
        rd.m.e(str2, "signature");
        dd.n nVar = dd.n.f10910b;
        this.f3862x = dd.k.a(nVar, new d2(this));
        this.f3863y = dd.k.a(nVar, new e2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a b0(f2 f2Var) {
        return new a(f2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member e0(f2 f2Var) {
        return f2Var.U();
    }

    @Override // yd.j
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public a f() {
        return (a) this.f3862x.getValue();
    }

    @Override // yd.l
    public Object get(Object obj) {
        return f().i(obj);
    }

    @Override // qd.l
    public Object l(Object obj) {
        return get(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(d1 d1Var, he.y0 y0Var) {
        super(d1Var, y0Var);
        rd.m.e(d1Var, "container");
        rd.m.e(y0Var, "descriptor");
        dd.n nVar = dd.n.f10910b;
        this.f3862x = dd.k.a(nVar, new d2(this));
        this.f3863y = dd.k.a(nVar, new e2(this));
    }
}
