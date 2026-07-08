package zg;

import tg.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f33302r = new c();

    private c() {
        super(j.f33314c, j.f33315d, j.f33316e, j.f33312a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // tg.a0
    public a0 t0(int i10, String str) {
        xg.i.a(i10);
        return i10 >= j.f33314c ? xg.i.b(this, str) : super.t0(i10, str);
    }

    @Override // tg.a0
    public String toString() {
        return "Dispatchers.Default";
    }
}
