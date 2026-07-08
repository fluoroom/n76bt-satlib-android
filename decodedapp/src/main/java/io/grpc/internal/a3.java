package io.grpc.internal;

/* JADX INFO: loaded from: classes3.dex */
final class a3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final qb.t0 f16298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final qb.t0 f16299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final qb.t0 f16300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final qb.u0 f16301e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.e1 f16302a;

    public enum a {
        GOAWAY("goaway"),
        SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
        CONNECTION_RESET("connection reset"),
        CONNECTION_TIMED_OUT("connection timed out"),
        CONNECTION_ABORTED("connection aborted"),
        SOCKET_ERROR("socket error"),
        UNKNOWN("unknown");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16311a;

        a(String str) {
            this.f16311a = str;
        }

        public String a(String str) {
            if (this != GOAWAY) {
                return this.f16311a;
            }
            if (str == null || str.isEmpty()) {
                return this.f16311a;
            }
            return this.f16311a + " " + str;
        }
    }

    static {
        qb.c1 c1VarA = qb.c1.a();
        f16298b = c1VarA.b("grpc.subchannel.disconnections", "EXPERIMENTAL. Number of times the selected subchannel becomes disconnected", "{disconnection}", s9.p.g("grpc.target"), s9.p.g("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"), false);
        f16299c = c1VarA.b("grpc.subchannel.connection_attempts_succeeded", "EXPERIMENTAL. Number of successful connection attempts", "{attempt}", s9.p.g("grpc.target"), s9.p.g("grpc.lb.backend_service", "grpc.lb.locality"), false);
        f16300d = c1VarA.b("grpc.subchannel.connection_attempts_failed", "EXPERIMENTAL. Number of failed connection attempts", "{attempt}", s9.p.g("grpc.target"), s9.p.g("grpc.lb.backend_service", "grpc.lb.locality"), false);
        f16301e = c1VarA.c("grpc.subchannel.open_connections", "EXPERIMENTAL. Number of open connections.", "{connection}", s9.p.g("grpc.target"), s9.p.g("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality"), false);
    }

    public a3(qb.e1 e1Var) {
        this.f16302a = e1Var;
    }

    public void a(String str, String str2, String str3) {
        this.f16302a.b(f16300d, 1L, s9.k.z(str), s9.k.A(str2, str3));
    }

    public void b(String str, String str2, String str3, String str4) {
        this.f16302a.b(f16299c, 1L, s9.k.z(str), s9.k.A(str2, str3));
        this.f16302a.a(f16301e, 1L, s9.k.z(str), s9.k.C(str4, str2, str3));
    }

    public void c(String str, String str2, String str3, String str4, String str5) {
        this.f16302a.b(f16298b, 1L, s9.k.z(str), s9.k.C(str2, str3, str4));
        this.f16302a.a(f16301e, -1L, s9.k.z(str), s9.k.C(str5, str2, str3));
    }
}
