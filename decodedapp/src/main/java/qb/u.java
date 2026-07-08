package qb;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f24761d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f24762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f24763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f24764g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f24765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f24767c;

    private static final class b extends c {
        private b() {
        }

        @Override // qb.u.c
        public long a() {
            return System.nanoTime();
        }
    }

    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f24762e = nanos;
        f24763f = -nanos;
        f24764g = TimeUnit.SECONDS.toNanos(1L);
    }

    private u(c cVar, long j10, boolean z10) {
        this(cVar, cVar.a(), j10, z10);
    }

    public static u a(long j10, TimeUnit timeUnit) {
        return d(j10, timeUnit, f24761d);
    }

    public static u d(long j10, TimeUnit timeUnit, c cVar) {
        Objects.requireNonNull(timeUnit, "units");
        return new u(cVar, timeUnit.toNanos(j10), true);
    }

    private void e(u uVar) {
        if (this.f24765a == uVar.f24765a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f24765a + " and " + uVar.f24765a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public static c g() {
        return f24761d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        c cVar = this.f24765a;
        if (cVar != null ? cVar == uVar.f24765a : uVar.f24765a == null) {
            return this.f24766b == uVar.f24766b;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(u uVar) {
        e(uVar);
        return Long.compare(this.f24766b, uVar.f24766b);
    }

    public boolean h(u uVar) {
        e(uVar);
        return this.f24766b - uVar.f24766b < 0;
    }

    public int hashCode() {
        return Objects.hash(this.f24765a, Long.valueOf(this.f24766b));
    }

    public boolean i() {
        if (!this.f24767c) {
            if (this.f24766b - this.f24765a.a() > 0) {
                return false;
            }
            this.f24767c = true;
        }
        return true;
    }

    public u j(u uVar) {
        e(uVar);
        return h(uVar) ? this : uVar;
    }

    public long k(TimeUnit timeUnit) {
        long jA = this.f24765a.a();
        if (!this.f24767c && this.f24766b - jA <= 0) {
            this.f24767c = true;
        }
        return timeUnit.convert(this.f24766b - jA, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jK = k(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jK);
        long j10 = f24764g;
        long j11 = jAbs / j10;
        long jAbs2 = Math.abs(jK) % j10;
        StringBuilder sb2 = new StringBuilder();
        if (jK < 0) {
            sb2.append('-');
        }
        sb2.append(j11);
        if (jAbs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb2.append("s from now");
        if (this.f24765a != f24761d) {
            sb2.append(" (ticker=" + this.f24765a + ")");
        }
        return sb2.toString();
    }

    private u(c cVar, long j10, long j11, boolean z10) {
        this.f24765a = cVar;
        long jMin = Math.min(f24762e, Math.max(f24763f, j11));
        this.f24766b = j10 + jMin;
        this.f24767c = z10 && jMin <= 0;
    }
}
