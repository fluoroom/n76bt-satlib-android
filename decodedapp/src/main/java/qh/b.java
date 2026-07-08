package qh;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends th.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25221d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X509TrustManager f25222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X509TrustManagerExtensions f25223c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final b a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            m.e(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private a() {
        }
    }

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        m.e(x509TrustManager, "trustManager");
        m.e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f25222b = x509TrustManager;
        this.f25223c = x509TrustManagerExtensions;
    }

    @Override // th.c
    public List a(List list, String str) throws SSLPeerUnverifiedException {
        m.e(list, "chain");
        m.e(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f25223c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            m.d(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f25222b == this.f25222b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f25222b);
    }
}
