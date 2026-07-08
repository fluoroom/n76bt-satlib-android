package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f17736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f17737j;

    public a(l[] lVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i10, 0, i11);
        this.f17736i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f17757b != null;
    }

    public final boolean hasMoreElements() {
        return this.f17757b != null;
    }

    public final void remove() {
        l lVar = this.f17737j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f17737j = null;
        this.f17736i.g(lVar.f17749b, null, null);
    }
}
