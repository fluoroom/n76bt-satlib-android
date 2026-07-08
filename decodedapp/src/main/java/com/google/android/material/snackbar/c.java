package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f8238e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8239a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f8240b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0122c f8241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0122c f8242d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0122c) message.obj);
            return true;
        }
    }

    interface b {
        void a(int i10);

        void show();
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    private static class C0122c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f8244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8246c;

        C0122c(int i10, b bVar) {
            this.f8244a = new WeakReference(bVar);
            this.f8245b = i10;
        }

        boolean a(b bVar) {
            return bVar != null && this.f8244a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(C0122c c0122c, int i10) {
        b bVar = (b) c0122c.f8244a.get();
        if (bVar == null) {
            return false;
        }
        this.f8240b.removeCallbacksAndMessages(c0122c);
        bVar.a(i10);
        return true;
    }

    static c c() {
        if (f8238e == null) {
            f8238e = new c();
        }
        return f8238e;
    }

    private boolean f(b bVar) {
        C0122c c0122c = this.f8241c;
        return c0122c != null && c0122c.a(bVar);
    }

    private boolean g(b bVar) {
        C0122c c0122c = this.f8242d;
        return c0122c != null && c0122c.a(bVar);
    }

    private void l(C0122c c0122c) {
        int i10 = c0122c.f8245b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f8240b.removeCallbacksAndMessages(c0122c);
        Handler handler = this.f8240b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0122c), i10);
    }

    private void n() {
        C0122c c0122c = this.f8242d;
        if (c0122c != null) {
            this.f8241c = c0122c;
            this.f8242d = null;
            b bVar = (b) c0122c.f8244a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f8241c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f8239a) {
            try {
                if (f(bVar)) {
                    a(this.f8241c, i10);
                } else if (g(bVar)) {
                    a(this.f8242d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(C0122c c0122c) {
        synchronized (this.f8239a) {
            try {
                if (this.f8241c == c0122c || this.f8242d == c0122c) {
                    a(c0122c, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f8239a) {
            try {
                z10 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z10;
    }

    public void h(b bVar) {
        synchronized (this.f8239a) {
            try {
                if (f(bVar)) {
                    this.f8241c = null;
                    if (this.f8242d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f8239a) {
            try {
                if (f(bVar)) {
                    l(this.f8241c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f8239a) {
            try {
                if (f(bVar)) {
                    C0122c c0122c = this.f8241c;
                    if (!c0122c.f8246c) {
                        c0122c.f8246c = true;
                        this.f8240b.removeCallbacksAndMessages(c0122c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f8239a) {
            try {
                if (f(bVar)) {
                    C0122c c0122c = this.f8241c;
                    if (c0122c.f8246c) {
                        c0122c.f8246c = false;
                        l(c0122c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(int i10, b bVar) {
        synchronized (this.f8239a) {
            try {
                if (f(bVar)) {
                    C0122c c0122c = this.f8241c;
                    c0122c.f8245b = i10;
                    this.f8240b.removeCallbacksAndMessages(c0122c);
                    l(this.f8241c);
                    return;
                }
                if (g(bVar)) {
                    this.f8242d.f8245b = i10;
                } else {
                    this.f8242d = new C0122c(i10, bVar);
                }
                C0122c c0122c2 = this.f8241c;
                if (c0122c2 == null || !a(c0122c2, 4)) {
                    this.f8241c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
