package xg;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements tg.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hd.i f32100a;

    public b(hd.i iVar) {
        this.f32100a = iVar;
    }

    @Override // tg.d0
    public hd.i G() {
        return this.f32100a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + G() + ')';
    }
}
