package qh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import qh.i;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f25236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i.a f25237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f25238c;

    public static final class a implements i.a {
        a() {
        }

        @Override // qh.i.a
        public boolean a(SSLSocket sSLSocket) {
            m.e(sSLSocket, "sslSocket");
            g.f25236a.b();
            return false;
        }

        @Override // qh.i.a
        public j b(SSLSocket sSLSocket) {
            m.e(sSLSocket, "sslSocket");
            return new g();
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final i.a a() {
            return g.f25237b;
        }

        public final boolean b() {
            return g.f25238c;
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        f25236a = bVar;
        f25237b = new a();
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, bVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f25238c = z10;
    }

    @Override // qh.j
    public boolean a(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        return false;
    }

    @Override // qh.j
    public boolean b() {
        return f25238c;
    }

    @Override // qh.j
    public String c(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || m.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // qh.j
    public void d(SSLSocket sSLSocket, String str, List list) {
        m.e(sSLSocket, "sslSocket");
        m.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) okhttp3.internal.platform.c.f23684a.b(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
