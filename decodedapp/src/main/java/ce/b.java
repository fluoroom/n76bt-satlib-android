package ce;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class b implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4726a;

    public b(Map map) {
        this.f4726a = map;
    }

    @Override // qd.a
    public Object a() {
        return Integer.valueOf(f.j(this.f4726a));
    }
}
