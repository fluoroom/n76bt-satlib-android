package qf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends n {
    @Override // qf.n
    public void b(he.b bVar, he.b bVar2) {
        rd.m.e(bVar, "first");
        rd.m.e(bVar2, "second");
        e(bVar, bVar2);
    }

    @Override // qf.n
    public void c(he.b bVar, he.b bVar2) {
        rd.m.e(bVar, "fromSuper");
        rd.m.e(bVar2, "fromCurrent");
        e(bVar, bVar2);
    }

    protected abstract void e(he.b bVar, he.b bVar2);
}
