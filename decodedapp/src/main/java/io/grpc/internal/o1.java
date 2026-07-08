package io.grpc.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class o1 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReferenceQueue f16984c = new ReferenceQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f16985d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f16986e = Logger.getLogger(o1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f16987b;

    static final class a extends WeakReference {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final boolean f16988f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final RuntimeException f16989g = e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReferenceQueue f16990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentMap f16991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f16992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Reference f16993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f16994e;

        a(o1 o1Var, qb.v0 v0Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
            super(o1Var, referenceQueue);
            this.f16994e = new AtomicBoolean();
            this.f16993d = new SoftReference(f16988f ? new RuntimeException("ManagedChannel allocation site") : f16989g);
            this.f16992c = v0Var.toString();
            this.f16990a = referenceQueue;
            this.f16991b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        static int b(ReferenceQueue referenceQueue) {
            int i10 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i10;
                }
                RuntimeException runtimeException = (RuntimeException) aVar.f16993d.get();
                aVar.c();
                if (!aVar.f16994e.get()) {
                    i10++;
                    Level level = Level.SEVERE;
                    if (o1.f16986e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(o1.f16986e.getName());
                        logRecord.setParameters(new Object[]{aVar.f16992c});
                        logRecord.setThrown(runtimeException);
                        o1.f16986e.log(logRecord);
                    }
                }
            }
        }

        private void c() {
            super.clear();
            this.f16991b.remove(this);
            this.f16993d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.f16994e.getAndSet(true)) {
                return;
            }
            clear();
        }

        private static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            c();
            b(this.f16990a);
        }
    }

    o1(qb.v0 v0Var) {
        this(v0Var, f16984c, f16985d);
    }

    @Override // io.grpc.internal.r0, qb.v0
    public qb.v0 l() {
        this.f16987b.d();
        return super.l();
    }

    o1(qb.v0 v0Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(v0Var);
        this.f16987b = new a(this, v0Var, referenceQueue, concurrentMap);
    }
}
