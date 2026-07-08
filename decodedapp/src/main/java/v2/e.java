package v2;

import k2.r;

/* JADX INFO: loaded from: classes.dex */
public class e extends t2.e implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // k2.v
    public int a() {
        return ((c) this.f27460a).i();
    }

    @Override // t2.e, k2.r
    public void b() {
        ((c) this.f27460a).e().prepareToDraw();
    }

    @Override // k2.v
    public void c() {
        ((c) this.f27460a).stop();
        ((c) this.f27460a).k();
    }

    @Override // k2.v
    public Class d() {
        return c.class;
    }
}
