package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import qb.e0;

/* JADX INFO: loaded from: classes3.dex */
final class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Logger f16995f = Logger.getLogger(qb.f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16996a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb.j0 f16997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f16998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f16999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17000e;

    class a extends ArrayDeque {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17001a;

        a(int i10) {
            this.f17001a = i10;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(qb.e0 e0Var) {
            if (size() == this.f17001a) {
                removeFirst();
            }
            p.a(p.this);
            return super.add(e0Var);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17003a;

        static {
            int[] iArr = new int[e0.b.values().length];
            f17003a = iArr;
            try {
                iArr[e0.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17003a[e0.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    p(qb.j0 j0Var, int i10, long j10, String str) {
        r9.l.o(str, "description");
        this.f16997b = (qb.j0) r9.l.o(j0Var, "logId");
        if (i10 > 0) {
            this.f16998c = new a(i10);
        } else {
            this.f16998c = null;
        }
        this.f16999d = j10;
        e(new e0.a().b(str + " created").c(e0.b.CT_INFO).e(j10).a());
    }

    static /* synthetic */ int a(p pVar) {
        int i10 = pVar.f17000e;
        pVar.f17000e = i10 + 1;
        return i10;
    }

    static void d(qb.j0 j0Var, Level level, String str) {
        Logger logger = f16995f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + j0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    qb.j0 b() {
        return this.f16997b;
    }

    boolean c() {
        boolean z10;
        synchronized (this.f16996a) {
            z10 = this.f16998c != null;
        }
        return z10;
    }

    void e(qb.e0 e0Var) {
        int i10 = b.f17003a[e0Var.f24594b.ordinal()];
        Level level = i10 != 1 ? i10 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        f(e0Var);
        d(this.f16997b, level, e0Var.f24593a);
    }

    void f(qb.e0 e0Var) {
        synchronized (this.f16996a) {
            try {
                Collection collection = this.f16998c;
                if (collection != null) {
                    collection.add(e0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
