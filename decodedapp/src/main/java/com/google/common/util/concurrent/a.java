package com.google.common.util.concurrent;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import r9.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends com.google.common.util.concurrent.b {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    private static final class C0123a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final C0123a f8571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final C0123a f8572d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f8573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f8574b;

        static {
            if (com.google.common.util.concurrent.b.f8583f) {
                f8572d = null;
                f8571c = null;
            } else {
                f8572d = new C0123a(false, null);
                f8571c = new C0123a(true, null);
            }
        }

        C0123a(boolean z10, Throwable th2) {
            this.f8573a = z10;
            this.f8574b = th2;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final b f8575b = new b(new C0124a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f8576a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$b$a, reason: collision with other inner class name */
        class C0124a extends Throwable {
            C0124a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                return this;
            }
        }

        b(Throwable th2) {
            this.f8576a = (Throwable) r9.l.n(th2);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f8577d = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f8578a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f8579b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f8580c;

        c() {
        }
    }

    protected a() {
    }

    private void o(StringBuilder sb2) {
        try {
            Object objX = x(this);
            sb2.append("SUCCESS, result=[");
            r(sb2, objX);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void p(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        n();
        try {
            strA = p.a(A());
        } catch (Throwable th2) {
            k.d(th2);
            strA = "Exception thrown from implementation: " + th2.getClass();
        }
        if (strA != null) {
            sb2.append(", info=[");
            sb2.append(strA);
            sb2.append("]");
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            o(sb2);
        }
    }

    private void r(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private static CancellationException s(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private c t(c cVar) {
        c cVar2 = cVar;
        c cVarG = g(c.f8577d);
        while (cVarG != null) {
            c cVar3 = cVarG.f8580c;
            cVarG.f8580c = cVar2;
            cVar2 = cVarG;
            cVarG = cVar3;
        }
        return cVar2;
    }

    private static void u(a aVar, boolean z10) {
        aVar.l();
        if (z10) {
            aVar.y();
        }
        aVar.q();
        c cVarT = aVar.t(null);
        while (cVarT != null) {
            c cVar = cVarT.f8580c;
            Runnable runnable = cVarT.f8578a;
            Objects.requireNonNull(runnable);
            Executor executor = cVarT.f8579b;
            Objects.requireNonNull(executor);
            v(runnable, executor);
            cVarT = cVar;
        }
    }

    private static void v(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            com.google.common.util.concurrent.b.f8582e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    static Object w(Object obj) throws ExecutionException {
        if (obj instanceof C0123a) {
            throw s("Task was cancelled.", ((C0123a) obj).f8574b);
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f8576a);
        }
        return obj == com.google.common.util.concurrent.b.f8581d ? i.a() : obj;
    }

    private static Object x(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    k.c();
                }
                throw th2;
            }
        }
        if (z10) {
            k.c();
        }
        return obj;
    }

    static boolean z(Object obj) {
        return true;
    }

    protected abstract String A();

    protected boolean B(Object obj) {
        if (obj == null) {
            obj = com.google.common.util.concurrent.b.f8581d;
        }
        if (!com.google.common.util.concurrent.b.e(this, null, obj)) {
            return false;
        }
        u(this, false);
        return true;
    }

    protected boolean C(Throwable th2) {
        if (!com.google.common.util.concurrent.b.e(this, null, new b((Throwable) r9.l.n(th2)))) {
            return false;
        }
        u(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        C0123a c0123a;
        Object objN = n();
        if (objN == null) {
            if (com.google.common.util.concurrent.b.f8583f) {
                c0123a = new C0123a(z10, new CancellationException("Future.cancel() was called."));
            } else {
                c0123a = z10 ? C0123a.f8571c : C0123a.f8572d;
                Objects.requireNonNull(c0123a);
            }
            while (!com.google.common.util.concurrent.b.e(this, objN, c0123a)) {
                objN = n();
                if (z(objN)) {
                }
            }
            u(this, z10);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return k.b(this, j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return n() instanceof C0123a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object objN = n();
        return z(objN) & (objN != null);
    }

    protected void q() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            o(sb2);
        } else {
            p(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected abstract void y();

    @Override // java.util.concurrent.Future
    public Object get() {
        return k.a(this);
    }
}
