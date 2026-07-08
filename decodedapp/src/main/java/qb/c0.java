package qb;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SocketAddress f24565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InetSocketAddress f24566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24568d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SocketAddress f24569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InetSocketAddress f24570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f24571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f24572d;

        public c0 a() {
            return new c0(this.f24569a, this.f24570b, this.f24571c, this.f24572d);
        }

        public b b(String str) {
            this.f24572d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.f24569a = (SocketAddress) r9.l.o(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.f24570b = (InetSocketAddress) r9.l.o(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(String str) {
            this.f24571c = str;
            return this;
        }

        private b() {
        }
    }

    public static b e() {
        return new b();
    }

    public String a() {
        return this.f24568d;
    }

    public SocketAddress b() {
        return this.f24565a;
    }

    public InetSocketAddress c() {
        return this.f24566b;
    }

    public String d() {
        return this.f24567c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return r9.h.a(this.f24565a, c0Var.f24565a) && r9.h.a(this.f24566b, c0Var.f24566b) && r9.h.a(this.f24567c, c0Var.f24567c) && r9.h.a(this.f24568d, c0Var.f24568d);
    }

    public int hashCode() {
        return r9.h.b(this.f24565a, this.f24566b, this.f24567c, this.f24568d);
    }

    public String toString() {
        return r9.g.b(this).d("proxyAddr", this.f24565a).d("targetAddr", this.f24566b).d("username", this.f24567c).e("hasPassword", this.f24568d != null).toString();
    }

    private c0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        r9.l.o(socketAddress, "proxyAddress");
        r9.l.o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            r9.l.w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f24565a = socketAddress;
        this.f24566b = inetSocketAddress;
        this.f24567c = str;
        this.f24568d = str2;
    }
}
