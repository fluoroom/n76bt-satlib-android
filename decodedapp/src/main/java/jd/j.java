package jd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends a {
    public j(hd.e eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != hd.j.f15243a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // hd.e
    public hd.i getContext() {
        return hd.j.f15243a;
    }
}
