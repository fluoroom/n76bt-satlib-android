package m2;

import k2.v;
import m2.h;

/* JADX INFO: loaded from: classes.dex */
public class g extends e3.h implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f20939e;

    public g(long j10) {
        super(j10);
    }

    @Override // m2.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // m2.h
    public /* bridge */ /* synthetic */ v c(i2.f fVar) {
        return (v) super.l(fVar);
    }

    @Override // m2.h
    public /* bridge */ /* synthetic */ v d(i2.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    @Override // m2.h
    public void e(h.a aVar) {
        this.f20939e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v vVar) {
        return vVar == null ? super.i(null) : vVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(i2.f fVar, v vVar) {
        h.a aVar = this.f20939e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.d(vVar);
    }
}
