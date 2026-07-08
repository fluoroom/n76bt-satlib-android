package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import com.google.common.util.concurrent.b;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
abstract class b extends x9.a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f8581d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final com.google.common.util.concurrent.f f8582e = new com.google.common.util.concurrent.f(com.google.common.util.concurrent.a.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final boolean f8583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC0125b f8584g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f8585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile a.c f8586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile f f8587c;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0125b {
        private AbstractC0125b() {
        }

        abstract boolean a(b bVar, Object obj, Object obj2);

        abstract boolean b(b bVar, f fVar, f fVar2);

        abstract a.c c(b bVar, a.c cVar);

        abstract f d(b bVar, f fVar);

        abstract void e(f fVar, f fVar2);

        abstract void f(f fVar, Thread thread);
    }

    private static final class c extends AbstractC0125b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f8588a = AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f8589b = AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f8590c = AtomicReferenceFieldUpdater.newUpdater(b.class, f.class, "c");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f8591d = AtomicReferenceFieldUpdater.newUpdater(b.class, a.c.class, "b");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f8592e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "a");

        private c() {
            super();
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        boolean a(b bVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(f8592e, bVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        boolean b(b bVar, f fVar, f fVar2) {
            return androidx.concurrent.futures.b.a(f8590c, bVar, fVar, fVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        a.c c(b bVar, a.c cVar) {
            return (a.c) f8591d.getAndSet(bVar, cVar);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        f d(b bVar, f fVar) {
            return (f) f8590c.getAndSet(bVar, fVar);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        void e(f fVar, f fVar2) {
            f8589b.lazySet(fVar, fVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        void f(f fVar, Thread thread) {
            f8588a.lazySet(fVar, thread);
        }
    }

    private static final class d extends AbstractC0125b {
        private d() {
            super();
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        boolean a(b bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                try {
                    if (bVar.f8585a != obj) {
                        return false;
                    }
                    bVar.f8585a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        boolean b(b bVar, f fVar, f fVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.f8587c != fVar) {
                        return false;
                    }
                    bVar.f8587c = fVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        a.c c(b bVar, a.c cVar) {
            a.c cVar2;
            synchronized (bVar) {
                try {
                    cVar2 = bVar.f8586b;
                    if (cVar2 != cVar) {
                        bVar.f8586b = cVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        f d(b bVar, f fVar) {
            f fVar2;
            synchronized (bVar) {
                try {
                    fVar2 = bVar.f8587c;
                    if (fVar2 != fVar) {
                        bVar.f8587c = fVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        void e(f fVar, f fVar2) {
            fVar.f8601b = fVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        void f(f fVar, Thread thread) {
            fVar.f8600a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e extends AbstractC0125b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f8593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f8594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f8595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f8596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f8597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f8598f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.common.util.concurrent.d
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            return b.e.i();
                        }
                    });
                }
                try {
                    f8595c = unsafe.objectFieldOffset(b.class.getDeclaredField("c"));
                    f8594b = unsafe.objectFieldOffset(b.class.getDeclaredField("b"));
                    f8596d = unsafe.objectFieldOffset(b.class.getDeclaredField("a"));
                    f8597e = unsafe.objectFieldOffset(f.class.getDeclaredField("a"));
                    f8598f = unsafe.objectFieldOffset(f.class.getDeclaredField("b"));
                    f8593a = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private e() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe i() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        boolean a(b bVar, Object obj, Object obj2) {
            return com.google.common.util.concurrent.c.a(f8593a, bVar, f8596d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        boolean b(b bVar, f fVar, f fVar2) {
            return com.google.common.util.concurrent.c.a(f8593a, bVar, f8595c, fVar, fVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        a.c c(b bVar, a.c cVar) {
            a.c cVar2;
            do {
                cVar2 = bVar.f8586b;
                if (cVar == cVar2) {
                    break;
                }
            } while (!h(bVar, cVar2, cVar));
            return cVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        f d(b bVar, f fVar) {
            f fVar2;
            do {
                fVar2 = bVar.f8587c;
                if (fVar == fVar2) {
                    break;
                }
            } while (!b(bVar, fVar2, fVar));
            return fVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        void e(f fVar, f fVar2) {
            f8593a.putObject(fVar, f8598f, fVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0125b
        void f(f fVar, Thread thread) {
            f8593a.putObject(fVar, f8597e, thread);
        }

        boolean h(b bVar, a.c cVar, a.c cVar2) {
            return com.google.common.util.concurrent.c.a(f8593a, bVar, f8594b, cVar, cVar2);
        }
    }

    static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final f f8599c = new f(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f8600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile f f8601b;

        f(boolean z10) {
        }

        void a(f fVar) {
            b.j(this, fVar);
        }

        void b() {
            Thread thread = this.f8600a;
            if (thread != null) {
                this.f8600a = null;
                LockSupport.unpark(thread);
            }
        }

        f() {
            b.k(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.util.concurrent.b$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    static {
        boolean z10;
        AbstractC0125b cVar;
        Throwable th2;
        AbstractC0125b eVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f8583f = z10;
        ?? r12 = 0;
        ?? r13 = 0;
        if (i()) {
            try {
                eVar = new e();
            } catch (Error | Exception e10) {
                try {
                    cVar = new c();
                } catch (Error | Exception e11) {
                    d dVar = new d();
                    r12 = e11;
                    cVar = dVar;
                }
                AbstractC0125b abstractC0125b = cVar;
                th2 = e10;
                eVar = abstractC0125b;
                r13 = r12;
            }
        } else {
            try {
                eVar = new c();
            } catch (NoClassDefFoundError unused2) {
                eVar = new d();
            }
        }
        th2 = null;
        f8584g = eVar;
        if (r13 != 0) {
            com.google.common.util.concurrent.f fVar = f8582e;
            Logger loggerA = fVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            fVar.a().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", r13);
        }
    }

    b() {
    }

    static boolean e(b bVar, Object obj, Object obj2) {
        return f8584g.a(bVar, obj, obj2);
    }

    private boolean f(f fVar, f fVar2) {
        return f8584g.b(this, fVar, fVar2);
    }

    private final f h(f fVar) {
        return f8584g.d(this, fVar);
    }

    private static boolean i() {
        String property = System.getProperty("java.runtime.name", "");
        return property == null || property.contains("Android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(f fVar, f fVar2) {
        f8584g.e(fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(f fVar, Thread thread) {
        f8584g.f(fVar, thread);
    }

    private void m(f fVar) {
        fVar.f8600a = null;
        while (true) {
            f fVar2 = this.f8587c;
            if (fVar2 == f.f8599c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f8601b;
                if (fVar2.f8600a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f8601b = fVar4;
                    if (fVar3.f8600a == null) {
                        break;
                    }
                } else if (!f(fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    final Object c() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f8585a;
        if ((obj2 != null) && com.google.common.util.concurrent.a.z(obj2)) {
            return com.google.common.util.concurrent.a.w(obj2);
        }
        f fVar = this.f8587c;
        if (fVar != f.f8599c) {
            f fVar2 = new f();
            do {
                fVar2.a(fVar);
                if (f(fVar, fVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m(fVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f8585a;
                    } while (!((obj != null) & com.google.common.util.concurrent.a.z(obj)));
                    return com.google.common.util.concurrent.a.w(obj);
                }
                fVar = this.f8587c;
            } while (fVar != f.f8599c);
        }
        Object obj3 = this.f8585a;
        Objects.requireNonNull(obj3);
        return com.google.common.util.concurrent.a.w(obj3);
    }

    final Object d(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8585a;
        if ((obj != null) && com.google.common.util.concurrent.a.z(obj)) {
            return com.google.common.util.concurrent.a.w(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f8587c;
            if (fVar != f.f8599c) {
                f fVar2 = new f();
                do {
                    fVar2.a(fVar);
                    if (f(fVar, fVar2)) {
                        do {
                            j.a(this, nanos);
                            if (Thread.interrupted()) {
                                m(fVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8585a;
                            if ((obj2 != null) && com.google.common.util.concurrent.a.z(obj2)) {
                                return com.google.common.util.concurrent.a.w(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(fVar2);
                    } else {
                        fVar = this.f8587c;
                    }
                } while (fVar != f.f8599c);
            }
            Object obj3 = this.f8585a;
            Objects.requireNonNull(obj3);
            return com.google.common.util.concurrent.a.w(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f8585a;
            if ((obj4 != null) && com.google.common.util.concurrent.a.z(obj4)) {
                return com.google.common.util.concurrent.a.w(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    final a.c g(a.c cVar) {
        return f8584g.c(this, cVar);
    }

    final void l() {
        for (f fVarH = h(f.f8599c); fVarH != null; fVarH = fVarH.f8601b) {
            fVarH.b();
        }
    }

    final Object n() {
        return this.f8585a;
    }
}
