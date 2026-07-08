package ce;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class c implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f4727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4728b;

    public c(Class cls, Map map) {
        this.f4727a = cls;
        this.f4728b = map;
    }

    @Override // qd.a
    public Object a() {
        return f.l(this.f4727a, this.f4728b);
    }
}
