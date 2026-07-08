package nc;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements pc.b {
    INSTANCE,
    NEVER;

    @Override // kc.b
    public boolean d() {
        return this == INSTANCE;
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

    @Override // pc.g
    public void clear() {
    }

    @Override // kc.b
    public void dispose() {
    }
}
