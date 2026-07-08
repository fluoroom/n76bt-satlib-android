package dk;

import eh.e;
import eh.f0;
import eh.h0;
import eh.i0;
import j$.util.Objects;
import java.io.IOException;
import vh.n0;

/* JADX INFO: loaded from: classes3.dex */
final class s implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f11192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f11194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e.a f11195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f11196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f11197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private eh.e f11198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Throwable f11199h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11200r;

    class a implements eh.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f11201a;

        a(f fVar) {
            this.f11201a = fVar;
        }

        private void c(Throwable th2) {
            try {
                this.f11201a.a(s.this, th2);
            } catch (Throwable th3) {
                e0.t(th3);
                th3.printStackTrace();
            }
        }

        @Override // eh.f
        public void a(eh.e eVar, h0 h0Var) {
            try {
                try {
                    this.f11201a.b(s.this, s.this.f(h0Var));
                } catch (Throwable th2) {
                    e0.t(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                e0.t(th3);
                c(th3);
            }
        }

        @Override // eh.f
        public void b(eh.e eVar, IOException iOException) {
            c(iOException);
        }
    }

    static final class b extends i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i0 f11203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vh.g f11204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        IOException f11205c;

        class a extends vh.n {
            a(n0 n0Var) {
                super(n0Var);
            }

            @Override // vh.n, vh.n0
            public long N(vh.e eVar, long j10) throws IOException {
                try {
                    return super.N(eVar, j10);
                } catch (IOException e10) {
                    b.this.f11205c = e10;
                    throw e10;
                }
            }
        }

        b(i0 i0Var) {
            this.f11203a = i0Var;
            this.f11204b = vh.z.c(new a(i0Var.source()));
        }

        void c() throws IOException {
            IOException iOException = this.f11205c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // eh.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f11203a.close();
        }

        @Override // eh.i0
        public long contentLength() {
            return this.f11203a.contentLength();
        }

        @Override // eh.i0
        public eh.b0 contentType() {
            return this.f11203a.contentType();
        }

        @Override // eh.i0
        public vh.g source() {
            return this.f11204b;
        }
    }

    static final class c extends i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final eh.b0 f11207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f11208b;

        c(eh.b0 b0Var, long j10) {
            this.f11207a = b0Var;
            this.f11208b = j10;
        }

        @Override // eh.i0
        public long contentLength() {
            return this.f11208b;
        }

        @Override // eh.i0
        public eh.b0 contentType() {
            return this.f11207a;
        }

        @Override // eh.i0
        public vh.g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    s(y yVar, Object obj, Object[] objArr, e.a aVar, i iVar) {
        this.f11192a = yVar;
        this.f11193b = obj;
        this.f11194c = objArr;
        this.f11195d = aVar;
        this.f11196e = iVar;
    }

    private eh.e b() {
        eh.e eVarA = this.f11195d.a(this.f11192a.a(this.f11193b, this.f11194c));
        if (eVarA != null) {
            return eVarA;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private eh.e d() throws IOException {
        eh.e eVar = this.f11198g;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.f11199h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            eh.e eVarB = b();
            this.f11198g = eVarB;
            return eVarB;
        } catch (IOException | Error | RuntimeException e10) {
            e0.t(e10);
            this.f11199h = e10;
            throw e10;
        }
    }

    @Override // dk.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public s m1195clone() {
        return new s(this.f11192a, this.f11193b, this.f11194c, this.f11195d, this.f11196e);
    }

    @Override // dk.d
    public boolean c() {
        boolean z10 = true;
        if (this.f11197f) {
            return true;
        }
        synchronized (this) {
            try {
                eh.e eVar = this.f11198g;
                if (eVar == null || !eVar.c()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // dk.d
    public void cancel() {
        eh.e eVar;
        this.f11197f = true;
        synchronized (this) {
            eVar = this.f11198g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // dk.d
    public synchronized f0 e() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return d().e();
    }

    z f(h0 h0Var) throws IOException {
        i0 i0VarC = h0Var.c();
        h0 h0VarC = h0Var.T().b(new c(i0VarC.contentType(), i0VarC.contentLength())).c();
        int iN = h0VarC.n();
        if (iN < 200 || iN >= 300) {
            try {
                return z.c(e0.a(i0VarC), h0VarC);
            } finally {
                i0VarC.close();
            }
        }
        if (iN == 204 || iN == 205) {
            i0VarC.close();
            return z.g(null, h0VarC);
        }
        b bVar = new b(i0VarC);
        try {
            return z.g(this.f11196e.convert(bVar), h0VarC);
        } catch (RuntimeException e10) {
            bVar.c();
            throw e10;
        }
    }

    @Override // dk.d
    public z l() {
        eh.e eVarD;
        synchronized (this) {
            if (this.f11200r) {
                throw new IllegalStateException("Already executed.");
            }
            this.f11200r = true;
            eVarD = d();
        }
        if (this.f11197f) {
            eVarD.cancel();
        }
        return f(eVarD.l());
    }

    @Override // dk.d
    public void s(f fVar) {
        eh.e eVar;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f11200r) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f11200r = true;
                eVar = this.f11198g;
                th2 = this.f11199h;
                if (eVar == null && th2 == null) {
                    try {
                        eh.e eVarB = b();
                        this.f11198g = eVarB;
                        eVar = eVarB;
                    } catch (Throwable th3) {
                        th2 = th3;
                        e0.t(th2);
                        this.f11199h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            fVar.a(this, th2);
            return;
        }
        if (this.f11197f) {
            eVar.cancel();
        }
        eVar.q(new a(fVar));
    }
}
