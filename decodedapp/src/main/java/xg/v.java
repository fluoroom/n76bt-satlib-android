package xg;

import tg.l0;

/* JADX INFO: loaded from: classes3.dex */
public class v extends tg.a implements jd.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hd.e f32147d;

    public v(hd.i iVar, hd.e eVar) {
        super(iVar, true, true);
        this.f32147d = eVar;
    }

    @Override // tg.l1
    protected final boolean S() {
        return true;
    }

    @Override // jd.e
    public final jd.e b() {
        hd.e eVar = this.f32147d;
        if (eVar instanceof jd.e) {
            return (jd.e) eVar;
        }
        return null;
    }

    @Override // tg.l1
    protected void i(Object obj) throws l0 {
        g.b(id.b.c(this.f32147d), tg.u.a(obj, this.f32147d));
    }

    @Override // tg.a
    protected void v0(Object obj) {
        hd.e eVar = this.f32147d;
        eVar.d(tg.u.a(obj, eVar));
    }

    public void z0() {
    }
}
