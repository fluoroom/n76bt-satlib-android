package jd;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements hd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f18639a = new c();

    private c() {
    }

    @Override // hd.e
    public void d(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // hd.e
    public hd.i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
