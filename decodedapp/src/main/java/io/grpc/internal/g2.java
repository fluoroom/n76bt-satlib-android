package io.grpc.internal;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.c0;

/* JADX INFO: loaded from: classes3.dex */
class g2 implements qb.m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f16604c = Logger.getLogger(g2.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f16605d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r9.q f16606e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r9.q f16607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f16608b;

    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.g2.c
        public PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i10, "");
            } catch (MalformedURLException unused) {
                g2.f16604c.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    class b implements r9.q {
        b() {
        }

        @Override // r9.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4);
    }

    public g2() {
        this(f16606e, f16605d);
    }

    private qb.l1 c(InetSocketAddress inetSocketAddress) {
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = (ProxySelector) this.f16607a.get();
            if (proxySelector == null) {
                f16604c.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> listSelect = proxySelector.select(uri);
            if (listSelect.size() > 1) {
                f16604c.warning("More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationA = this.f16608b.a(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            c0.b bVarC = qb.c0.e().d(inetSocketAddress).c(inetSocketAddress2);
            if (passwordAuthenticationA == null) {
                return bVarC.a();
            }
            return bVarC.e(passwordAuthenticationA.getUserName()).b(passwordAuthenticationA.getPassword() != null ? new String(passwordAuthenticationA.getPassword()) : null).a();
        } catch (URISyntaxException e10) {
            f16604c.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
            return null;
        }
    }

    @Override // qb.m1
    public qb.l1 a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return c((InetSocketAddress) socketAddress);
        }
        return null;
    }

    g2(r9.q qVar, c cVar) {
        this.f16607a = (r9.q) r9.l.n(qVar);
        this.f16608b = (c) r9.l.n(cVar);
    }
}
