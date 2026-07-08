package eh;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12600a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f12601b = new a();

    public static final class a extends s {
        a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        s a(e eVar);
    }

    public void A(e eVar, IOException iOException) {
        rd.m.e(eVar, "call");
        rd.m.e(iOException, "ioe");
    }

    public void B(e eVar, h0 h0Var) {
        rd.m.e(eVar, "call");
        rd.m.e(h0Var, "response");
    }

    public void C(e eVar) {
        rd.m.e(eVar, "call");
    }

    public void D(e eVar, IOException iOException, boolean z10) {
        rd.m.e(eVar, "call");
        rd.m.e(iOException, "exception");
    }

    public void E(e eVar, h0 h0Var) {
        rd.m.e(eVar, "call");
        rd.m.e(h0Var, "response");
    }

    public void F(e eVar, x xVar) {
        rd.m.e(eVar, "call");
    }

    public void G(e eVar) {
        rd.m.e(eVar, "call");
    }

    public void a(e eVar, h0 h0Var) {
        rd.m.e(eVar, "call");
        rd.m.e(h0Var, "cachedResponse");
    }

    public void b(e eVar, h0 h0Var) {
        rd.m.e(eVar, "call");
        rd.m.e(h0Var, "response");
    }

    public void c(e eVar) {
        rd.m.e(eVar, "call");
    }

    public void d(e eVar) {
        rd.m.e(eVar, "call");
    }

    public void e(e eVar, IOException iOException) {
        rd.m.e(eVar, "call");
        rd.m.e(iOException, "ioe");
    }

    public void f(e eVar) {
        rd.m.e(eVar, "call");
    }

    public void g(e eVar) {
        rd.m.e(eVar, "call");
    }

    public void h(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, e0 e0Var) {
        rd.m.e(eVar, "call");
        rd.m.e(inetSocketAddress, "inetSocketAddress");
        rd.m.e(proxy, "proxy");
    }

    public void i(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, e0 e0Var, IOException iOException) {
        rd.m.e(eVar, "call");
        rd.m.e(inetSocketAddress, "inetSocketAddress");
        rd.m.e(proxy, "proxy");
        rd.m.e(iOException, "ioe");
    }

    public void j(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        rd.m.e(eVar, "call");
        rd.m.e(inetSocketAddress, "inetSocketAddress");
        rd.m.e(proxy, "proxy");
    }

    public void k(e eVar, k kVar) {
        rd.m.e(eVar, "call");
        rd.m.e(kVar, "connection");
    }

    public void l(e eVar, k kVar) {
        rd.m.e(eVar, "call");
        rd.m.e(kVar, "connection");
    }

    public void m(e eVar, q qVar) {
        rd.m.e(eVar, "call");
        rd.m.e(qVar, "dispatcher");
    }

    public void n(e eVar, q qVar) {
        rd.m.e(eVar, "call");
        rd.m.e(qVar, "dispatcher");
    }

    public void o(e eVar, String str, List list) {
        rd.m.e(eVar, "call");
        rd.m.e(str, "domainName");
        rd.m.e(list, "inetAddressList");
    }

    public void p(e eVar, String str) {
        rd.m.e(eVar, "call");
        rd.m.e(str, "domainName");
    }

    public void q(e eVar, h0 h0Var, f0 f0Var) {
        rd.m.e(eVar, "call");
        rd.m.e(h0Var, "networkResponse");
    }

    public void r(e eVar, z zVar, List list) {
        rd.m.e(eVar, "call");
        rd.m.e(zVar, "url");
        rd.m.e(list, "proxies");
    }

    public void s(e eVar, z zVar) {
        rd.m.e(eVar, "call");
        rd.m.e(zVar, "url");
    }

    public void t(e eVar, long j10) {
        rd.m.e(eVar, "call");
    }

    public void u(e eVar) {
        rd.m.e(eVar, "call");
    }

    public void v(e eVar, IOException iOException) {
        rd.m.e(eVar, "call");
        rd.m.e(iOException, "ioe");
    }

    public void w(e eVar, f0 f0Var) {
        rd.m.e(eVar, "call");
        rd.m.e(f0Var, "request");
    }

    public void x(e eVar) {
        rd.m.e(eVar, "call");
    }

    public void y(e eVar, long j10) {
        rd.m.e(eVar, "call");
    }

    public void z(e eVar) {
        rd.m.e(eVar, "call");
    }
}
