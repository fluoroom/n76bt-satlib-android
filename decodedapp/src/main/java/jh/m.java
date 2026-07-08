package jh;

import eh.d0;
import eh.f0;
import eh.h0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jh.u;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements eh.e, Cloneable {
    private volatile boolean A;
    private volatile h B;
    private final CopyOnWriteArrayList C;
    private final AtomicReference D;

    /* JADX INFO: renamed from: a */
    private final d0 f18784a;

    /* JADX INFO: renamed from: b */
    private final f0 f18785b;

    /* JADX INFO: renamed from: c */
    private final boolean f18786c;

    /* JADX INFO: renamed from: d */
    private final o f18787d;

    /* JADX INFO: renamed from: e */
    private final eh.s f18788e;

    /* JADX INFO: renamed from: f */
    private final c f18789f;

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f18790g;

    /* JADX INFO: renamed from: h */
    private Object f18791h;

    /* JADX INFO: renamed from: r */
    private i f18792r;

    /* JADX INFO: renamed from: s */
    private n f18793s;

    /* JADX INFO: renamed from: t */
    private boolean f18794t;

    /* JADX INFO: renamed from: u */
    private h f18795u;

    /* JADX INFO: renamed from: v */
    private boolean f18796v;

    /* JADX INFO: renamed from: w */
    private boolean f18797w;

    /* JADX INFO: renamed from: x */
    private boolean f18798x;

    /* JADX INFO: renamed from: y */
    private boolean f18799y;

    /* JADX INFO: renamed from: z */
    private boolean f18800z;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final eh.f f18801a;

        /* JADX INFO: renamed from: b */
        private volatile AtomicInteger f18802b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ m f18803c;

        public a(m mVar, eh.f fVar) {
            rd.m.e(fVar, "responseCallback");
            this.f18803c = mVar;
            this.f18801a = fVar;
            this.f18802b = new AtomicInteger(0);
        }

        public static /* synthetic */ void c(a aVar, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.b(rejectedExecutionException);
        }

        public final void a(ExecutorService executorService) {
            rd.m.e(executorService, "executorService");
            fh.p.e(this.f18803c.k().o());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    b(e10);
                    this.f18803c.k().o().e(this);
                }
            } catch (Throwable th2) {
                this.f18803c.k().o().e(this);
                throw th2;
            }
        }

        public final void b(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.f18803c.y(interruptedIOException);
            this.f18801a.b(this.f18803c, interruptedIOException);
        }

        public final m d() {
            return this.f18803c;
        }

        public final AtomicInteger e() {
            return this.f18802b;
        }

        public final String f() {
            return this.f18803c.r().m().h();
        }

        public final void g(a aVar) {
            rd.m.e(aVar, "other");
            this.f18802b = aVar.f18802b;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2;
            boolean z10;
            IOException e10;
            d0 d0VarK;
            String str = "OkHttp " + this.f18803c.z();
            m mVar = this.f18803c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                mVar.f18789f.s();
                try {
                    try {
                        z10 = true;
                    } catch (IOException e11) {
                        e10 = e11;
                        z10 = false;
                    } catch (Throwable th3) {
                        th2 = th3;
                        z10 = false;
                    }
                    try {
                        this.f18801a.a(mVar, mVar.u());
                        d0VarK = mVar.k();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            okhttp3.internal.platform.c.f23684a.e().m("Callback failure for " + mVar.E(), 4, e10);
                        } else {
                            this.f18801a.b(mVar, e10);
                        }
                        d0VarK = mVar.k();
                    } catch (Throwable th4) {
                        th2 = th4;
                        mVar.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th2);
                            iOException.initCause(th2);
                            this.f18801a.b(mVar, iOException);
                        }
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        d0VarK = mVar.k();
                    }
                    d0VarK.o().e(this);
                } catch (Throwable th5) {
                    mVar.k().o().e(this);
                    throw th5;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a */
        private final Object f18804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar, Object obj) {
            super(mVar);
            rd.m.e(mVar, "referent");
            this.f18804a = obj;
        }

        public final Object a() {
            return this.f18804a;
        }
    }

    public static final class c extends vh.c {
        c() {
        }

        @Override // vh.c
        protected void B() {
            m.this.cancel();
        }
    }

    public m(d0 d0Var, f0 f0Var, boolean z10) {
        rd.m.e(d0Var, "client");
        rd.m.e(f0Var, "originalRequest");
        this.f18784a = d0Var;
        this.f18785b = f0Var;
        this.f18786c = z10;
        this.f18787d = d0Var.l().a();
        this.f18788e = d0Var.q().a(this);
        c cVar = new c();
        cVar.g(d0Var.h(), TimeUnit.MILLISECONDS);
        this.f18789f = cVar;
        this.f18790g = new AtomicBoolean();
        this.f18800z = true;
        this.C = new CopyOnWriteArrayList();
        this.D = new AtomicReference(f0Var.d());
    }

    private final IOException D(IOException iOException) {
        if (this.f18794t || !this.f18789f.t()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final String E() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c() ? "canceled " : "");
        sb2.append(this.f18786c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(z());
        return sb2.toString();
    }

    private final IOException f(IOException iOException) {
        Socket socketA;
        boolean z10 = fh.p.f13109b;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        n nVar = this.f18793s;
        if (nVar != null) {
            if (z10 && Thread.holdsLock(nVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + nVar);
            }
            synchronized (nVar) {
                socketA = A();
            }
            if (this.f18793s == null) {
                if (socketA != null) {
                    fh.p.h(socketA);
                }
                this.f18788e.l(this, nVar);
                nVar.i().g(nVar, this);
                if (socketA != null) {
                    nVar.i().f(nVar);
                }
            } else if (socketA != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionD = D(iOException);
        if (iOException == null) {
            this.f18788e.d(this);
            return iOExceptionD;
        }
        eh.s sVar = this.f18788e;
        rd.m.b(iOExceptionD);
        sVar.e(this, iOExceptionD);
        return iOExceptionD;
    }

    private final void g() {
        this.f18791h = okhttp3.internal.platform.c.f23684a.e().k("response.body().close()");
        this.f18788e.f(this);
    }

    public static /* synthetic */ IOException x(m mVar, h hVar, boolean z10, boolean z11, boolean z12, boolean z13, IOException iOException, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        }
        return mVar.w(hVar, z10, z11, z12, z13, iOException);
    }

    public final Socket A() {
        n nVar = this.f18793s;
        rd.m.b(nVar);
        if (fh.p.f13109b && !Thread.holdsLock(nVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + nVar);
        }
        List listG = nVar.g();
        Iterator it = listG.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (rd.m.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listG.remove(i10);
        this.f18793s = null;
        if (listG.isEmpty()) {
            nVar.v(System.nanoTime());
            if (this.f18787d.c(nVar)) {
                return nVar.x();
            }
        }
        return null;
    }

    public final boolean B() {
        h hVar = this.B;
        if (hVar == null || !hVar.m()) {
            return false;
        }
        i iVar = this.f18792r;
        rd.m.b(iVar);
        u uVarB = iVar.b();
        h hVar2 = this.B;
        return uVarB.a(hVar2 != null ? hVar2.j() : null);
    }

    public final void C() {
        if (this.f18794t) {
            throw new IllegalStateException("Check failed.");
        }
        this.f18794t = true;
        this.f18789f.t();
    }

    public final void F() {
        C();
        synchronized (this) {
            if (this.B == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f18798x || this.f18799y) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f18796v) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.f18797w) {
                throw new IllegalStateException("Check failed.");
            }
            this.f18797w = false;
            this.f18798x = true;
            this.f18799y = true;
            dd.d0 d0Var = dd.d0.f10897a;
        }
    }

    @Override // eh.e
    public boolean c() {
        return this.A;
    }

    @Override // eh.e
    public void cancel() {
        if (this.A) {
            return;
        }
        this.A = true;
        h hVar = this.B;
        if (hVar != null) {
            hVar.d();
        }
        Iterator it = this.C.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((u.b) it.next()).cancel();
        }
        this.f18788e.g(this);
    }

    public final void d(n nVar) {
        rd.m.e(nVar, "connection");
        if (!fh.p.f13109b || Thread.holdsLock(nVar)) {
            if (this.f18793s != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f18793s = nVar;
            nVar.g().add(new b(this, this.f18791h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + nVar);
    }

    @Override // eh.e
    public f0 e() {
        return this.f18785b;
    }

    /* JADX INFO: renamed from: h */
    public eh.e clone() {
        return new m(this.f18784a, this.f18785b, this.f18786c);
    }

    public final void i(f0 f0Var, boolean z10, kh.g gVar) {
        rd.m.e(f0Var, "request");
        rd.m.e(gVar, "chain");
        if (this.f18795u != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f18797w) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f18796v || this.f18799y || this.f18798x) {
                throw new IllegalStateException("Check failed.");
            }
            dd.d0 d0Var = dd.d0.f10897a;
        }
        if (z10) {
            p pVar = new p(this.f18784a.v(), this.f18787d, this.f18784a.G(), this.f18784a.M(), gVar.g(), gVar.i(), this.f18784a.B(), this.f18784a.H(), this.f18784a.r(), this.f18784a.e(f0Var.m()), this.f18784a.u(), this, f0Var);
            this.f18792r = this.f18784a.r() ? new k(pVar, this.f18784a.v()) : new w(pVar);
        }
    }

    public final void j(boolean z10) {
        h hVar;
        synchronized (this) {
            if (!this.f18800z) {
                throw new IllegalStateException("released");
            }
            dd.d0 d0Var = dd.d0.f10897a;
        }
        if (z10 && (hVar = this.B) != null) {
            hVar.f();
        }
        this.f18795u = null;
    }

    public final d0 k() {
        return this.f18784a;
    }

    @Override // eh.e
    public h0 l() {
        if (!this.f18790g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f18789f.s();
        g();
        try {
            this.f18784a.o().b(this);
            return u();
        } finally {
            this.f18784a.o().f(this);
        }
    }

    public final n m() {
        return this.f18793s;
    }

    public final eh.s n() {
        return this.f18788e;
    }

    public final boolean o() {
        return this.f18786c;
    }

    public final h p() {
        return this.f18795u;
    }

    @Override // eh.e
    public void q(eh.f fVar) {
        rd.m.e(fVar, "responseCallback");
        if (!this.f18790g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        g();
        this.f18784a.o().a(new a(this, fVar));
    }

    public final f0 r() {
        return this.f18785b;
    }

    public final CopyOnWriteArrayList t() {
        return this.C;
    }

    public final h0 u() {
        ArrayList arrayList = new ArrayList();
        ed.q.A(arrayList, this.f18784a.x());
        arrayList.add(new kh.j(this.f18784a));
        arrayList.add(new kh.a(this.f18784a.n()));
        arrayList.add(new hh.a(this.f18784a.g()));
        arrayList.add(jh.c.f18719a);
        if (!this.f18786c) {
            ed.q.A(arrayList, this.f18784a.z());
        }
        arrayList.add(kh.b.f19932a);
        try {
            try {
                h0 h0VarA = new kh.g(this, arrayList, 0, null, this.f18785b, this.f18784a.k(), this.f18784a.G(), this.f18784a.M()).a(this.f18785b);
                if (c()) {
                    fh.m.f(h0VarA);
                    throw new IOException("Canceled");
                }
                y(null);
                return h0VarA;
            } catch (IOException e10) {
                IOException iOExceptionY = y(e10);
                rd.m.c(iOExceptionY, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionY;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                y(null);
            }
            throw th2;
        }
    }

    public final h v(kh.g gVar) throws IOException {
        rd.m.e(gVar, "chain");
        synchronized (this) {
            if (!this.f18800z) {
                throw new IllegalStateException("released");
            }
            if (this.f18797w || this.f18796v || this.f18799y || this.f18798x) {
                throw new IllegalStateException("Check failed.");
            }
            dd.d0 d0Var = dd.d0.f10897a;
        }
        i iVar = this.f18792r;
        rd.m.b(iVar);
        h hVar = new h(this, this.f18788e, iVar, iVar.a().r(this.f18784a, gVar));
        this.f18795u = hVar;
        this.B = hVar;
        synchronized (this) {
            this.f18796v = true;
            this.f18797w = true;
        }
        if (this.A) {
            throw new IOException("Canceled");
        }
        return hVar;
    }

    public final IOException w(h hVar, boolean z10, boolean z11, boolean z12, boolean z13, IOException iOException) {
        boolean z14;
        boolean z15;
        rd.m.e(hVar, "exchange");
        if (rd.m.a(hVar, this.B)) {
            synchronized (this) {
                z14 = false;
                if (z10) {
                    try {
                        if (!this.f18796v) {
                            if ((z11 || !this.f18797w) && ((!z13 || !this.f18798x) && (!z12 || !this.f18799y))) {
                                z15 = false;
                            }
                            dd.d0 d0Var = dd.d0.f10897a;
                        }
                        if (z10) {
                            this.f18796v = false;
                        }
                        if (z11) {
                            this.f18797w = false;
                        }
                        if (z13) {
                            this.f18798x = false;
                        }
                        if (z12) {
                            this.f18799y = false;
                        }
                        boolean z16 = (this.f18796v || this.f18797w || this.f18798x || this.f18799y) ? false : true;
                        if (z16 && !this.f18800z) {
                            z14 = true;
                        }
                        boolean z17 = z16;
                        z15 = z14;
                        z14 = z17;
                        dd.d0 d0Var2 = dd.d0.f10897a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (z11) {
                    z15 = false;
                    dd.d0 d0Var22 = dd.d0.f10897a;
                } else {
                    z15 = false;
                    dd.d0 d0Var222 = dd.d0.f10897a;
                }
            }
            if (z14) {
                this.B = null;
                n nVar = this.f18793s;
                if (nVar != null) {
                    nVar.n();
                }
            }
            if (z15) {
                return f(iOException);
            }
        }
        return iOException;
    }

    public final IOException y(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f18800z) {
                    this.f18800z = false;
                    if (!this.f18796v && !this.f18797w && !this.f18798x && !this.f18799y) {
                        z10 = true;
                    }
                }
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? f(iOException) : iOException;
    }

    public final String z() {
        return this.f18785b.m().o();
    }
}
