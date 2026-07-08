package eg;

import eg.t1;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
class e implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f12076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t1 f12077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ig.r f12078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ig.j f12079d;

    public e(Collection collection, t1 t1Var, ig.r rVar, ig.j jVar) {
        this.f12076a = collection;
        this.f12077b = t1Var;
        this.f12078c = rVar;
        this.f12079d = jVar;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return g.x(this.f12076a, this.f12077b, this.f12078c, this.f12079d, (t1.a) obj);
    }
}
