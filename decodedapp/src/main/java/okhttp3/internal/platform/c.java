package okhttp3.internal.platform;

import ed.q;
import eh.d0;
import eh.e0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import rd.h;
import rd.m;
import vh.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f23685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f23686c;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c d() {
            return d.f23687a.a();
        }

        public final List b(List list) {
            m.e(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((e0) obj) != e0.f12387c) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((e0) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List list) {
            m.e(list, "protocols");
            e eVar = new e();
            for (String str : b(list)) {
                eVar.writeByte(str.length());
                eVar.J(str);
            }
            return eVar.y();
        }

        public final c e() {
            return c.f23685b;
        }

        public final boolean f() {
            return d.f23687a.c();
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f23684a = aVar;
        f23685b = aVar.d();
        f23686c = Logger.getLogger(d0.class.getName());
    }

    public void d(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
    }

    public th.c e(X509TrustManager x509TrustManager) {
        m.e(x509TrustManager, "trustManager");
        return new th.a(f(x509TrustManager));
    }

    public th.e f(X509TrustManager x509TrustManager) {
        m.e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new th.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void g(SSLSocket sSLSocket, String str, List list);

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        m.e(socket, "socket");
        m.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public final String i() {
        return "OkHttp";
    }

    public abstract String j(SSLSocket sSLSocket);

    public Object k(String str) {
        m.e(str, "closer");
        if (f23686c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public abstract boolean l(String str);

    public abstract void m(String str, int i10, Throwable th2);

    public void n(String str, Object obj) {
        m.e(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m(str, 5, (Throwable) obj);
    }

    public SSLContext o() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        m.d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public SSLSocketFactory p(X509TrustManager x509TrustManager) {
        m.e(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextO = o();
            sSLContextO.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextO.getSocketFactory();
            m.d(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager q() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        m.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                m.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        m.d(string, "toString(...)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        m.d(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
