package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
abstract class k {
    static Object a(a aVar) {
        return aVar.c();
    }

    static Object b(a aVar, long j10, TimeUnit timeUnit) {
        return aVar.d(j10, timeUnit);
    }

    static void c() {
        Thread.currentThread().interrupt();
    }

    static void d(Throwable th2) {
        r9.l.n(th2);
        if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
            throw ((Error) th2);
        }
    }
}
