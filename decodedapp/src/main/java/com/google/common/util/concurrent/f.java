package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8604a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f8606c;

    f(Class cls) {
        this.f8605b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f8606c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f8604a) {
            try {
                Logger logger2 = this.f8606c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f8605b);
                this.f8606c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
