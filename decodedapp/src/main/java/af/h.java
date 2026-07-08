package af;

import eg.c1;
import qd.l;

/* JADX INFO: loaded from: classes3.dex */
class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.e f450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c1 f452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f453d;

    public h(he.e eVar, i iVar, c1 c1Var, a aVar) {
        this.f450a = eVar;
        this.f451b = iVar;
        this.f452c = c1Var;
        this.f453d = aVar;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return i.k(this.f450a, this.f451b, this.f452c, this.f453d, (fg.g) obj);
    }
}
