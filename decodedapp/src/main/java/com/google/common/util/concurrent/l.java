package com.google.common.util.concurrent;

import j$.util.Objects;
import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8607a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f8608b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f8609c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f8610d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ThreadFactory f8611e = null;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f8612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f8614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f8615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f8616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f8617f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f8612a = threadFactory;
            this.f8613b = str;
            this.f8614c = atomicLong;
            this.f8615d = bool;
            this.f8616e = num;
            this.f8617f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f8612a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f8613b;
            if (str != null) {
                AtomicLong atomicLong = this.f8614c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(l.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f8615d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f8616e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8617f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory c(l lVar) {
        String str = lVar.f8607a;
        Boolean bool = lVar.f8608b;
        Integer num = lVar.f8609c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = lVar.f8610d;
        ThreadFactory threadFactoryDefaultThreadFactory = lVar.f8611e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public l e(boolean z10) {
        this.f8608b = Boolean.valueOf(z10);
        return this;
    }

    public l f(String str) {
        d(str, 0);
        this.f8607a = str;
        return this;
    }
}
