package sg;

import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0379a f27358a = new C0379a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f27359b = a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f27360c = c.b(4611686018427387903L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f27361d = c.b(-4611686018427387903L);

    /* JADX INFO: renamed from: sg.a$a, reason: collision with other inner class name */
    public static final class C0379a {
        public /* synthetic */ C0379a(h hVar) {
            this();
        }

        private C0379a() {
        }
    }

    public static long a(long j10) {
        if (!b.a()) {
            return j10;
        }
        if (g(j10)) {
            long jF = f(j10);
            if (-4611686018426999999L <= jF && jF < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(f(j10) + " ns is out of nanoseconds range");
        }
        long jF2 = f(j10);
        if (-4611686018427387903L > jF2 || jF2 >= 4611686018427387904L) {
            throw new AssertionError(f(j10) + " ms is out of milliseconds range");
        }
        long jF3 = f(j10);
        if (-4611686018426L > jF3 || jF3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(f(j10) + " ms is denormalized");
    }

    public static final long d(long j10) {
        return h(j10, d.f27367e);
    }

    private static final d e(long j10) {
        return g(j10) ? d.f27364b : d.f27366d;
    }

    private static final long f(long j10) {
        return j10 >> 1;
    }

    private static final boolean g(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final long h(long j10, d dVar) {
        m.e(dVar, "unit");
        if (j10 == f27360c) {
            return Long.MAX_VALUE;
        }
        if (j10 == f27361d) {
            return Long.MIN_VALUE;
        }
        return e.a(f(j10), e(j10), dVar);
    }
}
