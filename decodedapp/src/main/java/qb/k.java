package qb;

import qb.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.C0338c f24661a = c.C0338c.b("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    public static abstract class a {
        public abstract k a(b bVar, z0 z0Var);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f24662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f24664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f24665d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private c f24666a = c.f24540l;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f24667b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f24668c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f24669d;

            a() {
            }

            public b a() {
                return new b(this.f24666a, this.f24667b, this.f24668c, this.f24669d);
            }

            public a b(c cVar) {
                this.f24666a = (c) r9.l.o(cVar, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z10) {
                this.f24669d = z10;
                return this;
            }

            public a d(boolean z10) {
                this.f24668c = z10;
                return this;
            }

            public a e(int i10) {
                this.f24667b = i10;
                return this;
            }
        }

        b(c cVar, int i10, boolean z10, boolean z11) {
            this.f24662a = (c) r9.l.o(cVar, "callOptions");
            this.f24663b = i10;
            this.f24664c = z10;
            this.f24665d = z11;
        }

        public static a a() {
            return new a();
        }

        public String toString() {
            return r9.g.b(this).d("callOptions", this.f24662a).b("previousAttempts", this.f24663b).e("isTransparentRetry", this.f24664c).e("isHedging", this.f24665d).toString();
        }
    }

    public void l(z0 z0Var) {
        k();
    }

    public void j() {
    }

    public void k() {
    }

    public void n() {
    }

    public void m(z0 z0Var) {
    }

    public void o(qb.a aVar, z0 z0Var) {
    }
}
