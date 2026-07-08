package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public class Transaction implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static boolean f17341g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f17342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BoxStore f17343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f17345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f17347f;

    public Transaction(BoxStore boxStore, long j10, int i10) {
        this.f17343b = boxStore;
        this.f17342a = j10;
        this.f17346e = i10;
        this.f17344c = nativeIsReadOnly(j10);
        this.f17345d = f17341g ? new Throwable() : null;
    }

    public void a() {
        c();
        nativeAbort(this.f17342a);
    }

    void c() {
        if (this.f17347f) {
            throw new IllegalStateException("Transaction is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!this.f17347f) {
                this.f17347f = true;
                this.f17343b.H0(this);
                boolean zNativeIsOwnerThread = nativeIsOwnerThread(this.f17342a);
                if (!zNativeIsOwnerThread) {
                    boolean zNativeIsActive = nativeIsActive(this.f17342a);
                    boolean zNativeIsRecycled = nativeIsRecycled(this.f17342a);
                    if (zNativeIsActive || zNativeIsRecycled) {
                        String str = " (initial commit count: " + this.f17346e + ").";
                        if (zNativeIsActive) {
                            System.err.println("Transaction is still active" + str);
                        } else {
                            System.out.println("Hint: use closeThreadResources() to avoid finalizing recycled transactions" + str);
                            System.out.flush();
                        }
                        if (this.f17345d != null) {
                            System.err.println("Transaction was initially created here:");
                            this.f17345d.printStackTrace();
                        }
                        System.err.flush();
                    }
                }
                if (this.f17343b.B0()) {
                    boolean zNativeIsActive2 = nativeIsActive(this.f17342a);
                    if (this.f17344c) {
                        System.out.printf("Info: closing read transaction after store was closed (isActive=%s, isOwnerThread=%s), this should be avoided.%n", Boolean.valueOf(zNativeIsActive2), Boolean.valueOf(zNativeIsOwnerThread));
                        System.out.flush();
                        if (!nativeIsActive(this.f17342a)) {
                            nativeDestroy(this.f17342a);
                        }
                    } else {
                        System.out.printf("WARN: closing write transaction after store was closed (isActive=%s, isOwnerThread=%s), this must be avoided.%n", Boolean.valueOf(zNativeIsActive2), Boolean.valueOf(zNativeIsOwnerThread));
                        System.out.flush();
                        if (nativeIsActive(this.f17342a) && this.f17343b.C0()) {
                            throw new IllegalStateException("Internal error: cannot close active write transaction for an already destroyed store");
                        }
                        nativeDestroy(this.f17342a);
                    }
                } else {
                    nativeDestroy(this.f17342a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void e() {
        c();
        this.f17343b.G0(this, nativeCommit(this.f17342a));
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public boolean isClosed() {
        return this.f17347f;
    }

    public void k() {
        e();
        close();
    }

    public Cursor l(Class cls) {
        c();
        yb.b bVarW = this.f17343b.W(cls);
        cc.b bVarM = bVarW.M();
        long jNativeCreateCursor = nativeCreateCursor(this.f17342a, bVarW.J(), cls);
        if (jNativeCreateCursor != 0) {
            return bVarM.a(this, jNativeCreateCursor, this.f17343b);
        }
        throw new DbException("Could not create native cursor");
    }

    public BoxStore n() {
        return this.f17343b;
    }

    native void nativeAbort(long j10);

    native int[] nativeCommit(long j10);

    native long nativeCreateCursor(long j10, String str, Class<?> cls);

    native void nativeDestroy(long j10);

    native boolean nativeIsActive(long j10);

    native boolean nativeIsOwnerThread(long j10);

    native boolean nativeIsReadOnly(long j10);

    native boolean nativeIsRecycled(long j10);

    native void nativeRecycle(long j10);

    native void nativeRenew(long j10);

    public boolean q() {
        return !this.f17347f && nativeIsActive(this.f17342a);
    }

    public boolean r() {
        return this.f17344c;
    }

    public boolean s() {
        c();
        return nativeIsRecycled(this.f17342a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TX ");
        sb2.append(Long.toString(this.f17342a, 16));
        sb2.append(" (");
        sb2.append(this.f17344c ? "read-only" : "write");
        sb2.append(", initialCommitCount=");
        sb2.append(this.f17346e);
        sb2.append(")");
        return sb2.toString();
    }

    public void v() {
        c();
        nativeRecycle(this.f17342a);
    }

    public void w() {
        c();
        this.f17346e = this.f17343b.D;
        nativeRenew(this.f17342a);
    }
}
