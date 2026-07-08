package io.grpc.internal;

import io.grpc.internal.p1;
import io.grpc.internal.s;
import io.grpc.internal.z2;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.a1;
import qb.g;
import qb.l;
import qb.s;
import qb.u1;
import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
final class q extends qb.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f17024r = Logger.getLogger(q.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f17025s = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double f17026t = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.a1 f17027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gc.d f17028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f17029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f17031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qb.s f17032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f17033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f17034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private qb.c f17035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f17036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e f17039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f17040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17041o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private qb.w f17042p = qb.w.c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private qb.o f17043q = qb.o.a();

    class a extends z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.a f17044b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g.a aVar) {
            super(q.this.f17032f);
            this.f17044b = aVar;
        }

        @Override // io.grpc.internal.z
        public void a() {
            q qVar = q.this;
            qVar.t(this.f17044b, qb.t.a(qVar.f17032f), new qb.z0());
        }
    }

    class b extends z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.a f17046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17047c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g.a aVar, String str) {
            super(q.this.f17032f);
            this.f17046b = aVar;
            this.f17047c = str;
        }

        @Override // io.grpc.internal.z
        public void a() {
            q.this.t(this.f17046b, qb.u1.f24783s.s(String.format("Unable to find compressor by name %s", this.f17047c)), new qb.z0());
        }
    }

    private final class c implements Runnable, s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f17049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f17050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f17051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile ScheduledFuture f17052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f17053e;

        c(qb.u uVar, boolean z10) {
            this.f17049a = z10;
            if (uVar == null) {
                this.f17050b = false;
                this.f17051c = 0L;
            } else {
                this.f17050b = true;
                this.f17051c = uVar.k(TimeUnit.NANOSECONDS);
            }
        }

        qb.u1 b() {
            long jAbs = Math.abs(this.f17051c);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.f17051c) % timeUnit.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f17049a ? "Context" : "CallOptions");
            sb2.append(" deadline exceeded after ");
            if (this.f17051c < 0) {
                sb2.append('-');
            }
            sb2.append(nanos);
            Locale locale = Locale.US;
            sb2.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            sb2.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) q.this.f17035i.i(qb.k.f24661a)) == null ? 0.0d : r1.longValue() / q.f17026t)));
            if (q.this.f17036j != null) {
                c1 c1Var = new c1();
                q.this.f17036j.o(c1Var);
                sb2.append(" ");
                sb2.append(c1Var);
            }
            return qb.u1.f24773i.s(sb2.toString());
        }

        void c() {
            if (this.f17053e) {
                return;
            }
            if (this.f17050b && !this.f17049a && q.this.f17040n != null) {
                this.f17052d = q.this.f17040n.schedule(new j1(this), this.f17051c, TimeUnit.NANOSECONDS);
            }
            q.this.f17032f.a(this, com.google.common.util.concurrent.h.a());
            if (this.f17053e) {
                d();
            }
        }

        void d() {
            this.f17053e = true;
            ScheduledFuture scheduledFuture = this.f17052d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            q.this.f17032f.i(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.f17036j.b(b());
        }
    }

    private class d implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g.a f17055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qb.u1 f17056b;

        final class a extends z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ gc.b f17058b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ qb.z0 f17059c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(gc.b bVar, qb.z0 z0Var) {
                super(q.this.f17032f);
                this.f17058b = bVar;
                this.f17059c = z0Var;
            }

            private void b() {
                if (d.this.f17056b != null) {
                    return;
                }
                try {
                    d.this.f17055a.b(this.f17059c);
                } catch (Throwable th2) {
                    d.this.i(qb.u1.f24770f.r(th2).s("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.z
            public void a() {
                gc.e eVarH = gc.c.h("ClientCall$Listener.headersRead");
                try {
                    gc.c.a(q.this.f17028b);
                    gc.c.e(this.f17058b);
                    b();
                    if (eVarH != null) {
                        eVarH.close();
                    }
                } catch (Throwable th2) {
                    if (eVarH != null) {
                        try {
                            eVarH.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        final class b extends z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ gc.b f17061b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z2.a f17062c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(gc.b bVar, z2.a aVar) {
                super(q.this.f17032f);
                this.f17061b = bVar;
                this.f17062c = aVar;
            }

            private void b() {
                if (d.this.f17056b != null) {
                    w0.d(this.f17062c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f17062c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f17055a.c(q.this.f17027a.i(next));
                            next.close();
                        } finally {
                        }
                    } catch (Throwable th2) {
                        w0.d(this.f17062c);
                        d.this.i(qb.u1.f24770f.r(th2).s("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.z
            public void a() {
                gc.e eVarH = gc.c.h("ClientCall$Listener.messagesAvailable");
                try {
                    gc.c.a(q.this.f17028b);
                    gc.c.e(this.f17061b);
                    b();
                    if (eVarH != null) {
                        eVarH.close();
                    }
                } catch (Throwable th2) {
                    if (eVarH != null) {
                        try {
                            eVarH.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        final class c extends z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ gc.b f17064b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ qb.u1 f17065c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ qb.z0 f17066d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(gc.b bVar, qb.u1 u1Var, qb.z0 z0Var) {
                super(q.this.f17032f);
                this.f17064b = bVar;
                this.f17065c = u1Var;
                this.f17066d = z0Var;
            }

            private void b() {
                q.this.f17033g.d();
                qb.u1 u1Var = this.f17065c;
                qb.z0 z0Var = this.f17066d;
                if (d.this.f17056b != null) {
                    u1Var = d.this.f17056b;
                    z0Var = new qb.z0();
                }
                try {
                    d dVar = d.this;
                    q.this.t(dVar.f17055a, u1Var, z0Var);
                } finally {
                    q.this.f17031e.a(u1Var.q());
                }
            }

            @Override // io.grpc.internal.z
            public void a() {
                gc.e eVarH = gc.c.h("ClientCall$Listener.onClose");
                try {
                    gc.c.a(q.this.f17028b);
                    gc.c.e(this.f17064b);
                    b();
                    if (eVarH != null) {
                        eVarH.close();
                    }
                } catch (Throwable th2) {
                    if (eVarH != null) {
                        try {
                            eVarH.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.q$d$d, reason: collision with other inner class name */
        final class C0230d extends z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ gc.b f17068b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0230d(gc.b bVar) {
                super(q.this.f17032f);
                this.f17068b = bVar;
            }

            private void b() {
                if (d.this.f17056b != null) {
                    return;
                }
                try {
                    d.this.f17055a.d();
                } catch (Throwable th2) {
                    d.this.i(qb.u1.f24770f.r(th2).s("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.z
            public void a() {
                gc.e eVarH = gc.c.h("ClientCall$Listener.onReady");
                try {
                    gc.c.a(q.this.f17028b);
                    gc.c.e(this.f17068b);
                    b();
                    if (eVarH != null) {
                        eVarH.close();
                    }
                } catch (Throwable th2) {
                    if (eVarH != null) {
                        try {
                            eVarH.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        public d(g.a aVar) {
            this.f17055a = (g.a) r9.l.o(aVar, "observer");
        }

        private void h(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
            qb.u uVarU = q.this.u();
            if (u1Var.o() == u1.b.CANCELLED && uVarU != null && uVarU.i()) {
                u1Var = q.this.f17033g.b();
                z0Var = new qb.z0();
            }
            q.this.f17029c.execute(new c(gc.c.f(), u1Var, z0Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(qb.u1 u1Var) {
            this.f17056b = u1Var;
            q.this.f17036j.b(u1Var);
        }

        @Override // io.grpc.internal.z2
        public void a(z2.a aVar) {
            gc.e eVarH = gc.c.h("ClientStreamListener.messagesAvailable");
            try {
                gc.c.a(q.this.f17028b);
                q.this.f17029c.execute(new b(gc.c.f(), aVar));
                if (eVarH != null) {
                    eVarH.close();
                }
            } catch (Throwable th2) {
                if (eVarH != null) {
                    try {
                        eVarH.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // io.grpc.internal.s
        public void b(qb.z0 z0Var) {
            gc.e eVarH = gc.c.h("ClientStreamListener.headersRead");
            try {
                gc.c.a(q.this.f17028b);
                q.this.f17029c.execute(new a(gc.c.f(), z0Var));
                if (eVarH != null) {
                    eVarH.close();
                }
            } catch (Throwable th2) {
                if (eVarH != null) {
                    try {
                        eVarH.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // io.grpc.internal.z2
        public void c() {
            if (q.this.f17027a.e().a()) {
                return;
            }
            gc.e eVarH = gc.c.h("ClientStreamListener.onReady");
            try {
                gc.c.a(q.this.f17028b);
                q.this.f17029c.execute(new C0230d(gc.c.f()));
                if (eVarH != null) {
                    eVarH.close();
                }
            } catch (Throwable th2) {
                if (eVarH != null) {
                    try {
                        eVarH.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // io.grpc.internal.s
        public void d(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
            gc.e eVarH = gc.c.h("ClientStreamListener.closed");
            try {
                gc.c.a(q.this.f17028b);
                h(u1Var, aVar, z0Var);
                if (eVarH != null) {
                    eVarH.close();
                }
            } catch (Throwable th2) {
                if (eVarH != null) {
                    try {
                        eVarH.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    interface e {
        r a(qb.a1 a1Var, qb.c cVar, qb.z0 z0Var, qb.s sVar);
    }

    q(qb.a1 a1Var, Executor executor, qb.c cVar, e eVar, ScheduledExecutorService scheduledExecutorService, n nVar, qb.f0 f0Var) {
        this.f17027a = a1Var;
        gc.d dVarC = gc.c.c(a1Var.c(), System.identityHashCode(this));
        this.f17028b = dVarC;
        if (executor == com.google.common.util.concurrent.h.a()) {
            this.f17029c = new r2();
            this.f17030d = true;
        } else {
            this.f17029c = new s2(executor);
            this.f17030d = false;
        }
        this.f17031e = nVar;
        this.f17032f = qb.s.e();
        this.f17034h = a1Var.e() == a1.d.UNARY || a1Var.e() == a1.d.SERVER_STREAMING;
        this.f17035i = cVar;
        this.f17039m = eVar;
        this.f17040n = scheduledExecutorService;
        gc.c.d("ClientCall.<init>", dVarC);
    }

    private void C(g.a aVar, qb.z0 z0Var) {
        qb.n nVarB;
        r9.l.u(this.f17036j == null, "Already started");
        r9.l.u(!this.f17037k, "call was cancelled");
        r9.l.o(aVar, "observer");
        r9.l.o(z0Var, "headers");
        if (this.f17032f.h()) {
            this.f17036j = v1.f17181a;
            this.f17029c.execute(new a(aVar));
            return;
        }
        r();
        String strB = this.f17035i.b();
        if (strB != null) {
            nVarB = this.f17043q.b(strB);
            if (nVarB == null) {
                this.f17036j = v1.f17181a;
                this.f17029c.execute(new b(aVar, strB));
                return;
            }
        } else {
            nVarB = l.b.f24679a;
        }
        x(z0Var, this.f17042p, nVarB, this.f17041o);
        qb.u uVarU = u();
        boolean z10 = uVarU != null && uVarU.equals(this.f17032f.g());
        c cVar = new c(uVarU, z10);
        this.f17033g = cVar;
        if (uVarU == null || cVar.f17051c > 0) {
            this.f17036j = this.f17039m.a(this.f17027a, this.f17035i, z0Var, this.f17032f);
        } else {
            qb.k[] kVarArrF = w0.f(this.f17035i, z0Var, 0, false, false);
            String str = z10 ? "Context" : "CallOptions";
            Long l10 = (Long) this.f17035i.i(qb.k.f24661a);
            double d10 = this.f17033g.f17051c;
            double d11 = f17026t;
            this.f17036j = new k0(qb.u1.f24773i.s(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d10 / d11), Double.valueOf(l10 == null ? 0.0d : l10.longValue() / d11))), kVarArrF);
        }
        if (this.f17030d) {
            this.f17036j.f();
        }
        if (this.f17035i.a() != null) {
            this.f17036j.n(this.f17035i.a());
        }
        if (this.f17035i.f() != null) {
            this.f17036j.k(this.f17035i.f().intValue());
        }
        if (this.f17035i.g() != null) {
            this.f17036j.l(this.f17035i.g().intValue());
        }
        if (uVarU != null) {
            this.f17036j.m(uVarU);
        }
        this.f17036j.c(nVarB);
        boolean z11 = this.f17041o;
        if (z11) {
            this.f17036j.s(z11);
        }
        this.f17036j.q(this.f17042p);
        this.f17031e.b();
        this.f17036j.r(new d(aVar));
        this.f17033g.c();
    }

    private void r() {
        p1.b bVar = (p1.b) this.f17035i.i(p1.b.f17010g);
        if (bVar == null) {
            return;
        }
        Long l10 = bVar.f17011a;
        if (l10 != null) {
            qb.u uVarA = qb.u.a(l10.longValue(), TimeUnit.NANOSECONDS);
            qb.u uVarD = this.f17035i.d();
            if (uVarD == null || uVarA.compareTo(uVarD) < 0) {
                this.f17035i = this.f17035i.p(uVarA);
            }
        }
        Boolean bool = bVar.f17012b;
        if (bool != null) {
            this.f17035i = bool.booleanValue() ? this.f17035i.x() : this.f17035i.y();
        }
        if (bVar.f17013c != null) {
            Integer numF = this.f17035i.f();
            if (numF != null) {
                this.f17035i = this.f17035i.s(Math.min(numF.intValue(), bVar.f17013c.intValue()));
            } else {
                this.f17035i = this.f17035i.s(bVar.f17013c.intValue());
            }
        }
        if (bVar.f17014d != null) {
            Integer numG = this.f17035i.g();
            if (numG != null) {
                this.f17035i = this.f17035i.t(Math.min(numG.intValue(), bVar.f17014d.intValue()));
            } else {
                this.f17035i = this.f17035i.t(bVar.f17014d.intValue());
            }
        }
    }

    private void s(String str, Throwable th2) {
        if (str == null && th2 == null) {
            th2 = new CancellationException("Cancelled without a message or cause");
            f17024r.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th2);
        }
        if (this.f17037k) {
            return;
        }
        this.f17037k = true;
        try {
            if (this.f17036j != null) {
                qb.u1 u1Var = qb.u1.f24770f;
                qb.u1 u1VarS = str != null ? u1Var.s(str) : u1Var.s("Call cancelled without message");
                if (th2 != null) {
                    u1VarS = u1VarS.r(th2);
                }
                this.f17036j.b(u1VarS);
            }
            c cVar = this.f17033g;
            if (cVar != null) {
                cVar.d();
            }
        } catch (Throwable th3) {
            c cVar2 = this.f17033g;
            if (cVar2 != null) {
                cVar2.d();
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(g.a aVar, qb.u1 u1Var, qb.z0 z0Var) {
        try {
            aVar.a(u1Var, z0Var);
        } catch (RuntimeException e10) {
            f17024r.log(Level.WARNING, "Exception thrown by onClose() in ClientCall", (Throwable) e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qb.u u() {
        return w(this.f17035i.d(), this.f17032f.g());
    }

    private void v() {
        r9.l.u(this.f17036j != null, "Not started");
        r9.l.u(!this.f17037k, "call was cancelled");
        r9.l.u(!this.f17038l, "call already half-closed");
        this.f17038l = true;
        this.f17036j.p();
    }

    private static qb.u w(qb.u uVar, qb.u uVar2) {
        return uVar == null ? uVar2 : uVar2 == null ? uVar : uVar.j(uVar2);
    }

    static void x(qb.z0 z0Var, qb.w wVar, qb.n nVar, boolean z10) {
        z0Var.e(w0.f17191i);
        z0.h hVar = w0.f17187e;
        z0Var.e(hVar);
        if (nVar != l.b.f24679a) {
            z0Var.o(hVar, nVar.a());
        }
        z0.h hVar2 = w0.f17188f;
        z0Var.e(hVar2);
        byte[] bArrA = qb.h0.a(wVar);
        if (bArrA.length != 0) {
            z0Var.o(hVar2, bArrA);
        }
        z0Var.e(w0.f17189g);
        z0.h hVar3 = w0.f17190h;
        z0Var.e(hVar3);
        if (z10) {
            z0Var.o(hVar3, f17025s);
        }
    }

    private void y(Object obj) {
        r9.l.u(this.f17036j != null, "Not started");
        r9.l.u(!this.f17037k, "call was cancelled");
        r9.l.u(!this.f17038l, "call was half-closed");
        try {
            r rVar = this.f17036j;
            if (rVar instanceof m2) {
                ((m2) rVar).n0(obj);
            } else {
                rVar.d(this.f17027a.j(obj));
            }
            if (this.f17034h) {
                return;
            }
            this.f17036j.flush();
        } catch (Error e10) {
            this.f17036j.b(qb.u1.f24770f.s("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.f17036j.b(qb.u1.f24770f.r(e11).s("Failed to stream message"));
        }
    }

    q A(qb.w wVar) {
        this.f17042p = wVar;
        return this;
    }

    q B(boolean z10) {
        this.f17041o = z10;
        return this;
    }

    @Override // qb.g
    public void a(String str, Throwable th2) {
        gc.e eVarH = gc.c.h("ClientCall.cancel");
        try {
            gc.c.a(this.f17028b);
            s(str, th2);
            if (eVarH != null) {
                eVarH.close();
            }
        } catch (Throwable th3) {
            if (eVarH != null) {
                try {
                    eVarH.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // qb.g
    public void b() {
        gc.e eVarH = gc.c.h("ClientCall.halfClose");
        try {
            gc.c.a(this.f17028b);
            v();
            if (eVarH != null) {
                eVarH.close();
            }
        } catch (Throwable th2) {
            if (eVarH != null) {
                try {
                    eVarH.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // qb.g
    public void c(int i10) {
        gc.e eVarH = gc.c.h("ClientCall.request");
        try {
            gc.c.a(this.f17028b);
            r9.l.u(this.f17036j != null, "Not started");
            r9.l.e(i10 >= 0, "Number requested must be non-negative");
            this.f17036j.e(i10);
            if (eVarH != null) {
                eVarH.close();
            }
        } catch (Throwable th2) {
            if (eVarH != null) {
                try {
                    eVarH.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // qb.g
    public void d(Object obj) {
        gc.e eVarH = gc.c.h("ClientCall.sendMessage");
        try {
            gc.c.a(this.f17028b);
            y(obj);
            if (eVarH != null) {
                eVarH.close();
            }
        } catch (Throwable th2) {
            if (eVarH != null) {
                try {
                    eVarH.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // qb.g
    public void e(g.a aVar, qb.z0 z0Var) {
        gc.e eVarH = gc.c.h("ClientCall.start");
        try {
            gc.c.a(this.f17028b);
            C(aVar, z0Var);
            if (eVarH != null) {
                eVarH.close();
            }
        } catch (Throwable th2) {
            if (eVarH != null) {
                try {
                    eVarH.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String toString() {
        return r9.g.b(this).d("method", this.f17027a).toString();
    }

    q z(qb.o oVar) {
        this.f17043q = oVar;
        return this;
    }
}
