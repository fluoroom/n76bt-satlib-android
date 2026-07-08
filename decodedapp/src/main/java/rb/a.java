package rb;

import io.grpc.internal.s2;
import java.io.IOException;
import java.net.Socket;
import rb.b;
import vh.l0;
import vh.o0;

/* JADX INFO: loaded from: classes3.dex */
final class a implements l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s2 f25666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.a f25667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25668e;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l0 f25672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Socket f25673s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25674t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25675u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25676v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25664a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vh.e f25665b = new vh.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25669f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25670g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25671h = false;

    /* JADX INFO: renamed from: rb.a$a, reason: collision with other inner class name */
    class C0355a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final gc.b f25677b;

        C0355a() {
            super(a.this, null);
            this.f25677b = gc.c.f();
        }

        @Override // rb.a.e
        public void a() {
            int i10;
            vh.e eVar = new vh.e();
            gc.e eVarH = gc.c.h("WriteRunnable.runWrite");
            try {
                gc.c.e(this.f25677b);
                synchronized (a.this.f25664a) {
                    eVar.C(a.this.f25665b, a.this.f25665b.r());
                    a.this.f25669f = false;
                    i10 = a.this.f25676v;
                }
                a.this.f25672r.C(eVar, eVar.size());
                synchronized (a.this.f25664a) {
                    a.l(a.this, i10);
                }
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

    class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final gc.b f25679b;

        b() {
            super(a.this, null);
            this.f25679b = gc.c.f();
        }

        @Override // rb.a.e
        public void a() {
            vh.e eVar = new vh.e();
            gc.e eVarH = gc.c.h("WriteRunnable.runFlush");
            try {
                gc.c.e(this.f25679b);
                synchronized (a.this.f25664a) {
                    eVar.C(a.this.f25665b, a.this.f25665b.size());
                    a.this.f25670g = false;
                }
                a.this.f25672r.C(eVar, eVar.size());
                a.this.f25672r.flush();
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

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f25672r != null && a.this.f25665b.size() > 0) {
                    a.this.f25672r.C(a.this.f25665b, a.this.f25665b.size());
                }
            } catch (IOException e10) {
                a.this.f25667d.d(e10);
            }
            a.this.f25665b.close();
            try {
                if (a.this.f25672r != null) {
                    a.this.f25672r.close();
                }
            } catch (IOException e11) {
                a.this.f25667d.d(e11);
            }
            try {
                if (a.this.f25673s != null) {
                    a.this.f25673s.close();
                }
            } catch (IOException e12) {
                a.this.f25667d.d(e12);
            }
        }
    }

    private class d extends rb.c {
        public d(tb.c cVar) {
            super(cVar);
        }

        @Override // rb.c, tb.c
        public void I(tb.i iVar) {
            a.v(a.this);
            super.I(iVar);
        }

        @Override // rb.c, tb.c
        public void d(boolean z10, int i10, int i11) {
            if (z10) {
                a.v(a.this);
            }
            super.d(z10, i10, i11);
        }

        @Override // rb.c, tb.c
        public void f(int i10, tb.a aVar) {
            a.v(a.this);
            super.f(i10, aVar);
        }
    }

    private abstract class e implements Runnable {
        private e() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f25672r == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e10) {
                a.this.f25667d.d(e10);
            }
        }

        /* synthetic */ e(a aVar, C0355a c0355a) {
            this();
        }
    }

    private a(s2 s2Var, b.a aVar, int i10) {
        this.f25666c = (s2) r9.l.o(s2Var, "executor");
        this.f25667d = (b.a) r9.l.o(aVar, "exceptionHandler");
        this.f25668e = i10;
    }

    static a G(s2 s2Var, b.a aVar, int i10) {
        return new a(s2Var, aVar, i10);
    }

    static /* synthetic */ int l(a aVar, int i10) {
        int i11 = aVar.f25676v - i10;
        aVar.f25676v = i11;
        return i11;
    }

    static /* synthetic */ int v(a aVar) {
        int i10 = aVar.f25675u;
        aVar.f25675u = i10 + 1;
        return i10;
    }

    @Override // vh.l0
    public void C(vh.e eVar, long j10) throws IOException {
        r9.l.o(eVar, "source");
        if (this.f25671h) {
            throw new IOException("closed");
        }
        gc.e eVarH = gc.c.h("AsyncSink.write");
        try {
            synchronized (this.f25664a) {
                try {
                    this.f25665b.C(eVar, j10);
                    int i10 = this.f25676v + this.f25675u;
                    this.f25676v = i10;
                    boolean z10 = false;
                    this.f25675u = 0;
                    if (this.f25674t || i10 <= this.f25668e) {
                        if (!this.f25669f && !this.f25670g && this.f25665b.r() > 0) {
                            this.f25669f = true;
                        }
                        if (eVarH != null) {
                            eVarH.close();
                            return;
                        }
                        return;
                    }
                    this.f25674t = true;
                    z10 = true;
                    if (!z10) {
                        this.f25666c.execute(new C0355a());
                        if (eVarH != null) {
                            eVarH.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.f25673s.close();
                    } catch (IOException e10) {
                        this.f25667d.d(e10);
                    }
                    if (eVarH != null) {
                        eVarH.close();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
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

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25671h) {
            return;
        }
        this.f25671h = true;
        this.f25666c.execute(new c());
    }

    @Override // vh.l0, java.io.Flushable
    public void flush() throws IOException {
        if (this.f25671h) {
            throw new IOException("closed");
        }
        gc.e eVarH = gc.c.h("AsyncSink.flush");
        try {
            synchronized (this.f25664a) {
                if (this.f25670g) {
                    if (eVarH != null) {
                        eVarH.close();
                    }
                } else {
                    this.f25670g = true;
                    this.f25666c.execute(new b());
                    if (eVarH != null) {
                        eVarH.close();
                    }
                }
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

    @Override // vh.l0
    public o0 i() {
        return o0.f30840e;
    }

    void w(l0 l0Var, Socket socket) {
        r9.l.u(this.f25672r == null, "AsyncSink's becomeConnected should only be called once.");
        this.f25672r = (l0) r9.l.o(l0Var, "sink");
        this.f25673s = (Socket) r9.l.o(socket, "socket");
    }

    tb.c x(tb.c cVar) {
        return new d(cVar);
    }
}
