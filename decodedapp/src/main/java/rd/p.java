package rd;

import yd.h;
import yd.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends r implements yd.h {
    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // rd.d
    protected yd.b d() {
        return c0.d(this);
    }

    @Override // qd.l
    public Object l(Object obj) {
        return get(obj);
    }

    @Override // yd.j
    public l.a f() {
        return ((yd.h) p()).f();
    }

    @Override // yd.g
    public h.a h() {
        return ((yd.h) p()).h();
    }
}
