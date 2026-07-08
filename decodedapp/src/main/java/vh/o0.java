package vh;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f30839d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f30840e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f30843c;

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    public o0 a() {
        this.f30841a = false;
        return this;
    }

    public o0 b() {
        this.f30843c = 0L;
        return this;
    }

    public long c() {
        if (this.f30841a) {
            return this.f30842b;
        }
        throw new IllegalStateException("No deadline");
    }

    public o0 d(long j10) {
        this.f30841a = true;
        this.f30842b = j10;
        return this;
    }

    public boolean e() {
        return this.f30841a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f30841a && this.f30842b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public o0 g(long j10, TimeUnit timeUnit) {
        rd.m.e(timeUnit, "unit");
        if (j10 >= 0) {
            this.f30843c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f30843c;
    }

    public static final class a extends o0 {
        a() {
        }

        @Override // vh.o0
        public o0 g(long j10, TimeUnit timeUnit) {
            rd.m.e(timeUnit, "unit");
            return this;
        }

        @Override // vh.o0
        public void f() {
        }

        @Override // vh.o0
        public o0 d(long j10) {
            return this;
        }
    }
}
