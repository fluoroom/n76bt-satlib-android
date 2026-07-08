package gc;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e f13788a = new e();

    private e() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c.g();
    }
}
