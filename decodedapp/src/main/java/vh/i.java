package vh;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantLock f30804d = r0.b();

    private static final class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f30805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f30806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f30807c;

        public a(i iVar, long j10) {
            rd.m.e(iVar, "fileHandle");
            this.f30805a = iVar;
            this.f30806b = j10;
        }

        @Override // vh.n0
        public long N(e eVar, long j10) {
            rd.m.e(eVar, "sink");
            if (this.f30807c) {
                throw new IllegalStateException("closed");
            }
            long jS = this.f30805a.s(this.f30806b, eVar, j10);
            if (jS != -1) {
                this.f30806b += jS;
            }
            return jS;
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30807c) {
                return;
            }
            this.f30807c = true;
            ReentrantLock reentrantLockL = this.f30805a.l();
            reentrantLockL.lock();
            try {
                i iVar = this.f30805a;
                iVar.f30803c--;
                if (this.f30805a.f30803c == 0 && this.f30805a.f30802b) {
                    dd.d0 d0Var = dd.d0.f10897a;
                    reentrantLockL.unlock();
                    this.f30805a.n();
                }
            } finally {
                reentrantLockL.unlock();
            }
        }

        @Override // vh.n0
        public o0 i() {
            return o0.f30840e;
        }
    }

    public i(boolean z10) {
        this.f30801a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s(long j10, e eVar, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            i0 i0VarB0 = eVar.B0(1);
            int iQ = q(j13, i0VarB0.f30809a, i0VarB0.f30811c, (int) Math.min(j12 - j13, 8192 - r7));
            if (iQ == -1) {
                if (i0VarB0.f30810b == i0VarB0.f30811c) {
                    eVar.f30774a = i0VarB0.b();
                    j0.b(i0VarB0);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                i0VarB0.f30811c += iQ;
                long j14 = iQ;
                j13 += j14;
                eVar.y0(eVar.size() + j14);
            }
        }
        return j13 - j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f30804d;
        reentrantLock.lock();
        try {
            if (this.f30802b) {
                return;
            }
            this.f30802b = true;
            if (this.f30803c != 0) {
                return;
            }
            dd.d0 d0Var = dd.d0.f10897a;
            reentrantLock.unlock();
            n();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock l() {
        return this.f30804d;
    }

    protected abstract void n();

    protected abstract int q(long j10, byte[] bArr, int i10, int i11);

    protected abstract long r();

    public final long size() {
        ReentrantLock reentrantLock = this.f30804d;
        reentrantLock.lock();
        try {
            if (this.f30802b) {
                throw new IllegalStateException("closed");
            }
            dd.d0 d0Var = dd.d0.f10897a;
            reentrantLock.unlock();
            return r();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final n0 v(long j10) {
        ReentrantLock reentrantLock = this.f30804d;
        reentrantLock.lock();
        try {
            if (this.f30802b) {
                throw new IllegalStateException("closed");
            }
            this.f30803c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
