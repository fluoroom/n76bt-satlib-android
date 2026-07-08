package io.objectbox;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Cursor<T> implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static boolean f17332h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static boolean f17333r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Transaction f17334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final long f17335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final yb.b f17336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final BoxStore f17337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f17338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f17339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Throwable f17340g;

    protected Cursor(Transaction transaction, long j10, yb.b bVar, BoxStore boxStore) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction is null");
        }
        this.f17334a = transaction;
        this.f17338e = transaction.r();
        this.f17335b = j10;
        this.f17336c = bVar;
        this.f17337d = boxStore;
        for (e eVar : bVar.B()) {
            if (!eVar.b()) {
                eVar.c(q(eVar.f17389h));
            }
        }
        this.f17340g = f17332h ? new Throwable() : null;
        nativeSetBoxStoreForEntities(j10, boxStore);
    }

    protected static native long collect002033(long j10, long j11, int i10, int i11, long j12, int i12, long j13, int i13, float f10, int i14, float f11, int i15, float f12, int i16, double d10, int i17, double d11, int i18, double d12);

    protected static native long collect004000(long j10, long j11, int i10, int i11, long j12, int i12, long j13, int i13, long j14, int i14, long j15);

    protected static native long collect313311(long j10, long j11, int i10, int i11, String str, int i12, String str2, int i13, String str3, int i14, byte[] bArr, int i15, long j12, int i16, long j13, int i17, long j14, int i18, int i19, int i20, int i21, int i22, int i23, int i24, float f10, int i25, double d10);

    protected static native long collect400000(long j10, long j11, int i10, int i11, String str, int i12, String str2, int i13, String str3, int i14, String str4);

    protected static native long collect430000(long j10, long j11, int i10, int i11, String str, int i12, String str2, int i13, String str3, int i14, String str4, int i15, byte[] bArr, int i16, byte[] bArr2, int i17, byte[] bArr3);

    static native boolean nativeDeleteEntity(long j10, long j11);

    static native Object nativeFirstEntity(long j10);

    static native Object nativeGetEntity(long j10, long j11);

    static native Object nativeNextEntity(long j10);

    public long a(long j10) {
        return nativeCount(this.f17335b, j10);
    }

    public void c() {
        nativeDeleteAll(this.f17335b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f17339f) {
            this.f17339f = true;
            Transaction transaction = this.f17334a;
            if (transaction != null && !transaction.n().isClosed()) {
                nativeDestroy(this.f17335b);
            }
        }
    }

    public boolean e(long j10) {
        return nativeDeleteEntity(this.f17335b, j10);
    }

    protected void finalize() throws Throwable {
        if (this.f17339f) {
            return;
        }
        if (!this.f17338e || f17333r) {
            System.err.println("Cursor was not closed.");
            if (this.f17340g != null) {
                System.err.println("Cursor was initially created here:");
                this.f17340g.printStackTrace();
            }
            System.err.flush();
        }
        close();
        super.finalize();
    }

    public boolean isClosed() {
        return this.f17339f;
    }

    public Object k() {
        return nativeFirstEntity(this.f17335b);
    }

    public Object l(long j10) {
        return nativeGetEntity(this.f17335b, j10);
    }

    protected abstract long n(Object obj);

    native long nativeCount(long j10, long j11);

    native void nativeDeleteAll(long j10);

    native void nativeDestroy(long j10);

    native int nativePropertyId(long j10, String str);

    native long nativeRenew(long j10);

    native void nativeSetBoxStoreForEntities(long j10, Object obj);

    public int q(String str) {
        return nativePropertyId(this.f17335b, str);
    }

    public Transaction r() {
        return this.f17334a;
    }

    long s() {
        return this.f17335b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cursor ");
        sb2.append(Long.toString(this.f17335b, 16));
        sb2.append(isClosed() ? "(closed)" : "");
        return sb2.toString();
    }

    public Object v() {
        return nativeNextEntity(this.f17335b);
    }

    public abstract long w(Object obj);

    public void x() {
        nativeRenew(this.f17335b);
    }
}
