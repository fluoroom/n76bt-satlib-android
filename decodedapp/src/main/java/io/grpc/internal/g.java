package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f16595c = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f16597b;

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f16598a;

        public void a() {
            long j10 = this.f16598a;
            long jMax = Math.max(2 * j10, j10);
            if (g.this.f16597b.compareAndSet(this.f16598a, jMax)) {
                g.f16595c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{g.this.f16596a, Long.valueOf(jMax)});
            }
        }

        public long b() {
            return this.f16598a;
        }

        private b(long j10) {
            this.f16598a = j10;
        }
    }

    public g(String str, long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f16597b = atomicLong;
        r9.l.e(j10 > 0, "value must be positive");
        this.f16596a = str;
        atomicLong.set(j10);
    }

    public b d() {
        return new b(this.f16597b.get());
    }
}
