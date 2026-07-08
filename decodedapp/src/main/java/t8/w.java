package t8;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class w extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27634a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f27635b = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f27637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f27638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f27639f;

    w() {
    }

    private final void p() {
        v7.q.l(this.f27636c, "Task is not yet complete");
    }

    private final void q() {
        if (this.f27637d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void r() {
        if (this.f27636c) {
            throw b.a(this);
        }
    }

    private final void s() {
        synchronized (this.f27634a) {
            try {
                if (this.f27636c) {
                    this.f27635b.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t8.g
    public final g a(Executor executor, c cVar) {
        this.f27635b.a(new m(executor, cVar));
        s();
        return this;
    }

    @Override // t8.g
    public final g b(c cVar) {
        this.f27635b.a(new m(i.f27607a, cVar));
        s();
        return this;
    }

    @Override // t8.g
    public final g c(Activity activity, d dVar) {
        o oVar = new o(i.f27607a, dVar);
        this.f27635b.a(oVar);
        v.l(activity).m(oVar);
        s();
        return this;
    }

    @Override // t8.g
    public final g d(Activity activity, e eVar) {
        q qVar = new q(i.f27607a, eVar);
        this.f27635b.a(qVar);
        v.l(activity).m(qVar);
        s();
        return this;
    }

    @Override // t8.g
    public final g e(Executor executor, a aVar) {
        w wVar = new w();
        this.f27635b.a(new k(executor, aVar, wVar));
        s();
        return wVar;
    }

    @Override // t8.g
    public final Exception f() {
        Exception exc;
        synchronized (this.f27634a) {
            exc = this.f27639f;
        }
        return exc;
    }

    @Override // t8.g
    public final Object g() {
        Object obj;
        synchronized (this.f27634a) {
            try {
                p();
                q();
                Exception exc = this.f27639f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f27638e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // t8.g
    public final boolean h() {
        return this.f27637d;
    }

    @Override // t8.g
    public final boolean i() {
        boolean z10;
        synchronized (this.f27634a) {
            z10 = this.f27636c;
        }
        return z10;
    }

    @Override // t8.g
    public final boolean j() {
        boolean z10;
        synchronized (this.f27634a) {
            try {
                z10 = false;
                if (this.f27636c && !this.f27637d && this.f27639f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final void k(Exception exc) {
        v7.q.j(exc, "Exception must not be null");
        synchronized (this.f27634a) {
            r();
            this.f27636c = true;
            this.f27639f = exc;
        }
        this.f27635b.b(this);
    }

    public final void l(Object obj) {
        synchronized (this.f27634a) {
            r();
            this.f27636c = true;
            this.f27638e = obj;
        }
        this.f27635b.b(this);
    }

    public final boolean m() {
        synchronized (this.f27634a) {
            try {
                if (this.f27636c) {
                    return false;
                }
                this.f27636c = true;
                this.f27637d = true;
                this.f27635b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean n(Exception exc) {
        v7.q.j(exc, "Exception must not be null");
        synchronized (this.f27634a) {
            try {
                if (this.f27636c) {
                    return false;
                }
                this.f27636c = true;
                this.f27639f = exc;
                this.f27635b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean o(Object obj) {
        synchronized (this.f27634a) {
            try {
                if (this.f27636c) {
                    return false;
                }
                this.f27636c = true;
                this.f27638e = obj;
                this.f27635b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
