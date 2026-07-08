package sh;

import dd.d0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import rd.m;
import vh.g;
import vh.h;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements okhttp3.internal.publicsuffix.a {

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f27377b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private final CountDownLatch f27378c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public h f27379d;

    /* JADX INFO: renamed from: e */
    public h f27380e;

    /* JADX INFO: renamed from: f */
    private IOException f27381f;

    private final void f() {
        try {
            g gVarC = z.c(e());
            try {
                h hVarP = gVarC.p(gVarC.readInt());
                h hVarP2 = gVarC.p(gVarC.readInt());
                d0 d0Var = d0.f10897a;
                od.a.a(gVarC, null);
                synchronized (this) {
                    m.b(hVarP);
                    h(hVarP);
                    m.b(hVarP2);
                    i(hVarP2);
                }
            } finally {
            }
        } finally {
            this.f27378c.countDown();
        }
    }

    private final void g() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    this.f27381f = e10;
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // okhttp3.internal.publicsuffix.a
    public h a() {
        h hVar = this.f27379d;
        if (hVar != null) {
            return hVar;
        }
        m.o("bytes");
        return null;
    }

    @Override // okhttp3.internal.publicsuffix.a
    public void b() {
        if (this.f27377b.get() || !this.f27377b.compareAndSet(false, true)) {
            try {
                this.f27378c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            g();
        }
        if (this.f27379d != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + d() + " resource.");
        illegalStateException.initCause(this.f27381f);
        throw illegalStateException;
    }

    @Override // okhttp3.internal.publicsuffix.a
    public h c() {
        h hVar = this.f27380e;
        if (hVar != null) {
            return hVar;
        }
        m.o("exceptionBytes");
        return null;
    }

    public abstract Object d();

    public abstract n0 e();

    public void h(h hVar) {
        m.e(hVar, "<set-?>");
        this.f27379d = hVar;
    }

    public void i(h hVar) {
        m.e(hVar, "<set-?>");
        this.f27380e = hVar;
    }
}
