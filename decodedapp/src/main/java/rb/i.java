package rb;

import io.grpc.internal.a;
import io.grpc.internal.f3;
import io.grpc.internal.g3;
import io.grpc.internal.s;
import io.grpc.internal.x2;
import java.io.EOFException;
import java.util.List;
import qb.a1;
import qb.u1;
import qb.z0;
import rb.s;

/* JADX INFO: loaded from: classes3.dex */
class i extends io.grpc.internal.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final vh.e f25747q = new vh.e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a1 f25748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x2 f25750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f25751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f25752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f25753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final qb.a f25754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25755p;

    class a implements a.b {
        a() {
        }

        @Override // io.grpc.internal.a.b
        public void b(u1 u1Var) {
            gc.e eVarH = gc.c.h("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (i.this.f25752m.A) {
                    i.this.f25752m.b0(u1Var, true, null);
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

        @Override // io.grpc.internal.a.b
        public void c(z0 z0Var, byte[] bArr) {
            gc.e eVarH = gc.c.h("OkHttpClientStream$Sink.writeHeaders");
            try {
                String str = "/" + i.this.f25748i.c();
                if (bArr != null) {
                    i.this.f25755p = true;
                    str = str + "?" + t9.a.a().e(bArr);
                }
                synchronized (i.this.f25752m.A) {
                    i.this.f25752m.h0(z0Var, str);
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

        @Override // io.grpc.internal.a.b
        public void d(g3 g3Var, boolean z10, boolean z11, int i10) {
            vh.e eVarD;
            gc.e eVarH = gc.c.h("OkHttpClientStream$Sink.writeFrame");
            try {
                if (g3Var == null) {
                    eVarD = i.f25747q;
                } else {
                    eVarD = ((q) g3Var).d();
                    int size = (int) eVarD.size();
                    if (size > 0) {
                        i.this.t(size);
                    }
                }
                synchronized (i.this.f25752m.A) {
                    i.this.f25752m.f0(eVarD, z10, z11);
                    i.this.x().e(i10);
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

    class b extends io.grpc.internal.z0 implements s.b {
        private final Object A;
        private List B;
        private vh.e C;
        private boolean D;
        private boolean E;
        private boolean F;
        private int G;
        private int H;
        private final rb.b I;
        private final s J;
        private final j K;
        private boolean L;
        private final gc.d M;
        private s.c N;
        private int O;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final int f25757z;

        public b(int i10, x2 x2Var, Object obj, rb.b bVar, s sVar, j jVar, int i11, String str, qb.c cVar) {
            super(i10, x2Var, i.this.x(), cVar);
            this.C = new vh.e();
            this.D = false;
            this.E = false;
            this.F = false;
            this.L = true;
            this.O = -1;
            this.A = r9.l.o(obj, "lock");
            this.I = bVar;
            this.J = sVar;
            this.K = jVar;
            this.G = i11;
            this.H = i11;
            this.f25757z = i11;
            this.M = gc.c.b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(u1 u1Var, boolean z10, z0 z0Var) throws EOFException {
            if (this.F) {
                return;
            }
            this.F = true;
            if (!this.L) {
                this.K.Y(d0(), u1Var, s.a.PROCESSED, z10, tb.a.CANCEL, z0Var);
                return;
            }
            this.K.k0(i.this);
            this.B = null;
            this.C.k();
            this.L = false;
            if (z0Var == null) {
                z0Var = new z0();
            }
            O(u1Var, true, z0Var);
        }

        private void e0() {
            if (H()) {
                this.K.Y(d0(), null, s.a.PROCESSED, false, null, null);
            } else {
                this.K.Y(d0(), null, s.a.PROCESSED, false, tb.a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(vh.e eVar, boolean z10, boolean z11) {
            if (this.F) {
                return;
            }
            if (!this.L) {
                r9.l.u(d0() != -1, "streamId should be set");
                this.J.d(z10, this.N, eVar, z11);
            } else {
                this.C.C(eVar, (int) eVar.size());
                this.D |= z10;
                this.E |= z11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(z0 z0Var, String str) {
            this.B = d.b(z0Var, str, i.this.f25751l, i.this.f25749j, i.this.f25755p, this.K.e0());
            j jVar = this.K;
            i iVar = i.this;
            jVar.r0(iVar, iVar.f25751l);
        }

        @Override // io.grpc.internal.z0
        protected void Q(u1 u1Var, boolean z10, z0 z0Var) throws EOFException {
            b0(u1Var, z10, z0Var);
        }

        @Override // io.grpc.internal.z0, io.grpc.internal.a.c, io.grpc.internal.r1.b
        public void c(boolean z10) {
            e0();
            super.c(z10);
        }

        s.c c0() {
            s.c cVar;
            synchronized (this.A) {
                cVar = this.N;
            }
            return cVar;
        }

        @Override // io.grpc.internal.r1.b
        public void d(int i10) {
            int i11 = this.H - i10;
            this.H = i11;
            float f10 = i11;
            int i12 = this.f25757z;
            if (f10 <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.G += i13;
                this.H = i11 + i13;
                this.I.b(d0(), i13);
            }
        }

        int d0() {
            return this.O;
        }

        @Override // io.grpc.internal.r1.b
        public void e(Throwable th2) throws EOFException {
            Q(u1.m(th2), true, new z0());
        }

        @Override // io.grpc.internal.f.d
        public void f(Runnable runnable) {
            synchronized (this.A) {
                runnable.run();
            }
        }

        public void g0(int i10) {
            r9.l.v(this.O == -1, "the stream has been started with id %s", i10);
            this.O = i10;
            this.N = this.J.c(this, i10);
            i.this.f25752m.r();
            if (this.L) {
                this.I.k0(i.this.f25755p, false, this.O, 0, this.B);
                i.this.f25750k.c();
                this.B = null;
                if (this.C.size() > 0) {
                    this.J.d(this.D, this.N, this.C, this.E);
                }
                this.L = false;
            }
        }

        gc.d i0() {
            return this.M;
        }

        public void j0(vh.e eVar, boolean z10, int i10) throws Throwable {
            int size = this.G - (((int) eVar.size()) + i10);
            this.G = size;
            this.H -= i10;
            if (size >= 0) {
                super.T(new m(eVar), z10);
            } else {
                this.I.f(d0(), tb.a.FLOW_CONTROL_ERROR);
                this.K.Y(d0(), u1.f24783s.s("Received data size exceeded our receiving window size"), s.a.PROCESSED, false, null, null);
            }
        }

        public void k0(List list, boolean z10) {
            if (z10) {
                V(t.c(list));
            } else {
                U(t.a(list));
            }
        }

        @Override // io.grpc.internal.c.a
        protected void r() {
            super.r();
            m().c();
        }
    }

    i(a1 a1Var, z0 z0Var, rb.b bVar, j jVar, s sVar, Object obj, int i10, int i11, String str, String str2, x2 x2Var, f3 f3Var, qb.c cVar, boolean z10) {
        super(new r(), x2Var, f3Var, z0Var, cVar, z10 && a1Var.f());
        this.f25753n = new a();
        this.f25755p = false;
        this.f25750k = (x2) r9.l.o(x2Var, "statsTraceCtx");
        this.f25748i = a1Var;
        this.f25751l = str;
        this.f25749j = str2;
        this.f25754o = jVar.getAttributes();
        this.f25752m = new b(i10, x2Var, obj, bVar, sVar, jVar, i11, a1Var.c(), cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a v() {
        return this.f25753n;
    }

    public a1.d M() {
        return this.f25748i.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b z() {
        return this.f25752m;
    }

    boolean O() {
        return this.f25755p;
    }

    @Override // io.grpc.internal.r
    public qb.a getAttributes() {
        return this.f25754o;
    }

    @Override // io.grpc.internal.r
    public void n(String str) {
        this.f25751l = (String) r9.l.o(str, "authority");
    }
}
