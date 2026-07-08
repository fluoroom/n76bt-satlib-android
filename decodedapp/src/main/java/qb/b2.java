package qb;

import j$.time.Duration;

/* JADX INFO: loaded from: classes3.dex */
abstract class b2 {
    static long a(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }
}
