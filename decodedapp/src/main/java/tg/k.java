package tg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final void a(i iVar, h hVar) {
        if (!(iVar instanceof j)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((j) iVar).D(hVar);
    }
}
