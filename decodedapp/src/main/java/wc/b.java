package wc;

/* JADX INFO: loaded from: classes3.dex */
public enum b implements pc.d {
    INSTANCE;

    public static void a(ck.b bVar) {
        bVar.a(INSTANCE);
        bVar.onComplete();
    }

    public static void d(Throwable th2, ck.b bVar) {
        bVar.a(INSTANCE);
        bVar.onError(th2);
    }

    @Override // pc.c
    public int e(int i10) {
        return i10 & 2;
    }

    @Override // pc.g
    public boolean isEmpty() {
        return true;
    }

    @Override // pc.g
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // pc.g
    public Object poll() {
        return null;
    }

    @Override // ck.c
    public void request(long j10) {
        d.h(j10);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // ck.c
    public void cancel() {
    }

    @Override // pc.g
    public void clear() {
    }
}
