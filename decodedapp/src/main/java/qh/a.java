package qh;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0344a f25220a = new C0344a(null);

    /* JADX INFO: renamed from: qh.a$a, reason: collision with other inner class name */
    public static final class C0344a {
        public /* synthetic */ C0344a(rd.h hVar) {
            this();
        }

        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return okhttp3.internal.platform.c.f23684a.f() && Build.VERSION.SDK_INT >= 29;
        }

        private C0344a() {
        }
    }

    @Override // qh.j
    public boolean a(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // qh.j
    public boolean b() {
        return f25220a.b();
    }

    @Override // qh.j
    public String c(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!m.a(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // qh.j
    public void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        m.e(sSLSocket, "sslSocket");
        m.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) okhttp3.internal.platform.c.f23684a.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
