package qb;

import qb.a;
import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.c f24613a = a.c.a("internal:io.grpc.config-selector");

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u1 f24614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f24615b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Object f24616a;

            public b a() {
                r9.l.u(this.f24616a != null, "config is not set");
                return new b(u1.f24769e, this.f24616a, null);
            }

            public a b(Object obj) {
                this.f24616a = r9.l.o(obj, "config");
                return this;
            }

            private a() {
            }
        }

        public static a d() {
            return new a();
        }

        public Object a() {
            return this.f24615b;
        }

        public h b() {
            return null;
        }

        public u1 c() {
            return this.f24614a;
        }

        private b(u1 u1Var, Object obj, h hVar) {
            this.f24614a = (u1) r9.l.o(u1Var, "status");
            this.f24615b = obj;
        }
    }

    public abstract b a(q0.h hVar);
}
