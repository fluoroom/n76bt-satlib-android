package io.grpc.stub;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.a1;
import qb.c;
import qb.g;
import qb.u1;
import qb.v1;
import qb.x1;
import qb.z0;
import r9.l;
import r9.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a */
    private static final Logger f17283a = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: b */
    static boolean f17284b;

    /* JADX INFO: renamed from: c */
    static final c.C0338c f17285c;

    private static final class b extends io.grpc.stub.g {

        /* JADX INFO: renamed from: a */
        private boolean f17286a;

        /* JADX INFO: renamed from: b */
        private final qb.g f17287b;

        /* JADX INFO: renamed from: c */
        private final boolean f17288c;

        /* JADX INFO: renamed from: d */
        private Runnable f17289d;

        /* JADX INFO: renamed from: e */
        private int f17290e = 1;

        /* JADX INFO: renamed from: f */
        private boolean f17291f = true;

        /* JADX INFO: renamed from: g */
        private boolean f17292g = false;

        /* JADX INFO: renamed from: h */
        private boolean f17293h = false;

        b(qb.g gVar, boolean z10) {
            this.f17287b = gVar;
            this.f17288c = z10;
        }

        public void f() {
            this.f17286a = true;
        }

        public void g(int i10) {
            if (this.f17288c || i10 != 1) {
                this.f17287b.c(i10);
            } else {
                this.f17287b.c(2);
            }
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
            this.f17287b.b();
            this.f17293h = true;
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            this.f17287b.a("Cancelled by client with StreamObserver.onError()", th2);
            this.f17292g = true;
        }

        @Override // io.grpc.stub.j
        public void onNext(Object obj) {
            l.u(!this.f17292g, "Stream was terminated by error, no further calls are allowed");
            l.u(!this.f17293h, "Stream is already completed, no further calls are allowed");
            this.f17287b.d(obj);
        }
    }

    private static final class c extends com.google.common.util.concurrent.a {

        /* JADX INFO: renamed from: h */
        private final qb.g f17294h;

        c(qb.g gVar) {
            this.f17294h = gVar;
        }

        @Override // com.google.common.util.concurrent.a
        protected String A() {
            return r9.g.b(this).d("clientCall", this.f17294h).toString();
        }

        @Override // com.google.common.util.concurrent.a
        protected boolean B(Object obj) {
            return super.B(obj);
        }

        @Override // com.google.common.util.concurrent.a
        protected boolean C(Throwable th2) {
            return super.C(th2);
        }

        @Override // com.google.common.util.concurrent.a
        protected void y() {
            this.f17294h.a("GrpcFuture was cancelled", null);
        }
    }

    private static abstract class d extends g.a {
        private d() {
        }

        abstract void e();

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    enum f {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    static final class g extends ConcurrentLinkedQueue implements Executor {

        /* JADX INFO: renamed from: c */
        private static final Logger f17302c = Logger.getLogger(g.class.getName());

        /* JADX INFO: renamed from: a */
        private final Lock f17303a;

        /* JADX INFO: renamed from: b */
        private final Condition f17304b;

        g() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f17303a = reentrantLock;
            this.f17304b = reentrantLock.newCondition();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f17303a.lock();
            try {
                add(runnable);
                this.f17304b.signalAll();
            } finally {
                this.f17303a.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.h$h */
    private static final class ExecutorC0231h extends ConcurrentLinkedQueue implements Executor {

        /* JADX INFO: renamed from: b */
        private static final Logger f17305b = Logger.getLogger(ExecutorC0231h.class.getName());

        /* JADX INFO: renamed from: c */
        private static final Object f17306c = new Object();

        /* JADX INFO: renamed from: a */
        private volatile Object f17307a;

        ExecutorC0231h() {
        }

        private static void b(Runnable runnable) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                f17305b.log(Level.WARNING, "Runnable threw exception", th2);
            }
        }

        private static void c() throws InterruptedException {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        public void d() throws InterruptedException {
            Runnable runnable;
            c();
            Runnable runnable2 = (Runnable) poll();
            if (runnable2 == null) {
                this.f17307a = Thread.currentThread();
                while (true) {
                    try {
                        runnable = (Runnable) poll();
                        if (runnable != null) {
                            break;
                        }
                        LockSupport.park(this);
                        c();
                    } catch (Throwable th2) {
                        this.f17307a = null;
                        throw th2;
                    }
                }
                this.f17307a = null;
                runnable2 = runnable;
            }
            do {
                b(runnable2);
                runnable2 = (Runnable) poll();
            } while (runnable2 != null);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f17307a;
            if (obj != f17306c) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && h.f17284b) {
                throw new RejectedExecutionException();
            }
        }

        public void shutdown() {
            this.f17307a = f17306c;
            while (true) {
                Runnable runnable = (Runnable) poll();
                if (runnable == null) {
                    return;
                } else {
                    b(runnable);
                }
            }
        }
    }

    static {
        f17284b = !p.b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f17285c = c.C0338c.b("internal-stub-type");
    }

    public static j a(qb.g gVar, j jVar) {
        l.o(jVar, "responseObserver");
        return b(gVar, jVar, true);
    }

    private static j b(qb.g gVar, j jVar, boolean z10) {
        b bVar = new b(gVar, z10);
        l(gVar, new e(jVar, bVar));
        return bVar;
    }

    public static void c(qb.g gVar, Object obj, j jVar) {
        l.o(jVar, "responseObserver");
        e(gVar, obj, jVar, false);
    }

    private static void d(qb.g gVar, Object obj, d dVar) {
        l(gVar, dVar);
        try {
            gVar.d(obj);
            gVar.b();
        } catch (Error | RuntimeException e10) {
            throw i(gVar, e10);
        }
    }

    private static void e(qb.g gVar, Object obj, j jVar, boolean z10) {
        d(gVar, obj, new e(jVar, new b(gVar, z10)));
    }

    public static io.grpc.stub.e f(qb.d dVar, a1 a1Var, qb.c cVar) {
        g gVar = new g();
        qb.g gVarD = dVar.d(a1Var, cVar.r(gVar));
        io.grpc.stub.e eVar = new io.grpc.stub.e(gVarD, gVar);
        gVarD.e(eVar.c(), new z0());
        gVarD.c(1);
        return eVar;
    }

    public static Object g(qb.d dVar, a1 a1Var, qb.c cVar, Object obj) throws Throwable {
        ExecutorC0231h executorC0231h = new ExecutorC0231h();
        qb.g gVarD = dVar.d(a1Var, cVar.v(f17285c, f.BLOCKING).r(executorC0231h));
        boolean z10 = false;
        try {
            try {
                com.google.common.util.concurrent.g gVarJ = j(gVarD, obj);
                while (!gVarJ.isDone()) {
                    try {
                        executorC0231h.d();
                    } catch (InterruptedException e10) {
                        try {
                            gVarD.a("Thread interrupted", e10);
                            z10 = true;
                        } catch (Error e11) {
                            e = e11;
                            throw i(gVarD, e);
                        } catch (RuntimeException e12) {
                            e = e12;
                            throw i(gVarD, e);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                executorC0231h.shutdown();
                Object objK = k(gVarJ);
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                return objK;
            } catch (Error e13) {
                e = e13;
            } catch (RuntimeException e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Object h(qb.d dVar, a1 a1Var, qb.c cVar, Object obj) throws v1 {
        try {
            return g(dVar, a1Var, cVar, obj);
        } catch (x1 e10) {
            throw e10.a().d(e10.b());
        }
    }

    private static RuntimeException i(qb.g gVar, Throwable th2) {
        try {
            gVar.a(null, th2);
        } catch (Error | RuntimeException e10) {
            f17283a.log(Level.SEVERE, "RuntimeException encountered while closing call", e10);
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new AssertionError(th2);
    }

    public static com.google.common.util.concurrent.g j(qb.g gVar, Object obj) {
        c cVar = new c(gVar);
        d(gVar, obj, new i(cVar));
        return cVar;
    }

    private static Object k(Future future) {
        try {
            return future.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw u1.f24770f.s("Thread interrupted").r(e10).e();
        } catch (ExecutionException e11) {
            throw m(e11.getCause());
        }
    }

    private static void l(qb.g gVar, d dVar) {
        gVar.e(dVar, new z0());
        dVar.e();
    }

    private static x1 m(Throwable th2) {
        for (Throwable cause = (Throwable) l.o(th2, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof v1) {
                v1 v1Var = (v1) cause;
                return new x1(v1Var.a(), v1Var.b());
            }
            if (cause instanceof x1) {
                x1 x1Var = (x1) cause;
                return new x1(x1Var.a(), x1Var.b());
            }
        }
        return u1.f24771g.s("unexpected exception").r(th2).e();
    }

    private static final class e extends d {

        /* JADX INFO: renamed from: a */
        private final j f17295a;

        /* JADX INFO: renamed from: b */
        private final b f17296b;

        /* JADX INFO: renamed from: c */
        private boolean f17297c;

        e(j jVar, b bVar) {
            super();
            this.f17295a = jVar;
            this.f17296b = bVar;
            bVar.f();
        }

        @Override // qb.g.a
        public void a(u1 u1Var, z0 z0Var) {
            if (u1Var.q()) {
                this.f17295a.onCompleted();
            } else {
                this.f17295a.onError(u1Var.f(z0Var));
            }
        }

        @Override // qb.g.a
        public void c(Object obj) {
            if (this.f17297c && !this.f17296b.f17288c) {
                throw u1.f24783s.s("More than one responses received for unary or client-streaming call").e();
            }
            this.f17297c = true;
            this.f17295a.onNext(obj);
            if (this.f17296b.f17288c && this.f17296b.f17291f) {
                this.f17296b.g(1);
            }
        }

        @Override // qb.g.a
        public void d() {
            if (this.f17296b.f17289d != null) {
                this.f17296b.f17289d.run();
            }
        }

        @Override // io.grpc.stub.h.d
        void e() {
            if (this.f17296b.f17290e > 0) {
                b bVar = this.f17296b;
                bVar.g(bVar.f17290e);
            }
        }

        @Override // qb.g.a
        public void b(z0 z0Var) {
        }
    }

    private static final class i extends d {

        /* JADX INFO: renamed from: a */
        private final c f17308a;

        /* JADX INFO: renamed from: b */
        private Object f17309b;

        /* JADX INFO: renamed from: c */
        private boolean f17310c;

        i(c cVar) {
            super();
            this.f17310c = false;
            this.f17308a = cVar;
        }

        @Override // qb.g.a
        public void a(u1 u1Var, z0 z0Var) {
            if (!u1Var.q()) {
                this.f17308a.C(u1Var.f(z0Var));
                return;
            }
            if (!this.f17310c) {
                this.f17308a.C(u1.f24783s.s("No value received for unary call").f(z0Var));
            }
            this.f17308a.B(this.f17309b);
        }

        @Override // qb.g.a
        public void c(Object obj) {
            if (this.f17310c) {
                throw u1.f24783s.s("More than one value received for unary call").e();
            }
            this.f17309b = obj;
            this.f17310c = true;
        }

        @Override // io.grpc.stub.h.d
        void e() {
            this.f17308a.f17294h.c(2);
        }

        @Override // qb.g.a
        public void b(z0 z0Var) {
        }
    }
}
