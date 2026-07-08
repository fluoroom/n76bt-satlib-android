package qb;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: f */
    private static final Logger f24582f = Logger.getLogger(d0.class.getName());

    /* JADX INFO: renamed from: g */
    private static final d0 f24583g = new d0();

    /* JADX INFO: renamed from: a */
    private final ConcurrentNavigableMap f24584a = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: b */
    private final ConcurrentNavigableMap f24585b = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: c */
    private final ConcurrentMap f24586c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    private final ConcurrentMap f24587d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    private final ConcurrentMap f24588e = new ConcurrentHashMap();

    public static final class b {

        /* JADX INFO: renamed from: a */
        public final c f24589a;

        public b(c cVar) {
            this.f24589a = (c) r9.l.n(cVar);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f24590a;

        /* JADX INFO: renamed from: b */
        public final Certificate f24591b;

        /* JADX INFO: renamed from: c */
        public final Certificate f24592c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                d0.f24582f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e10);
            }
            this.f24590a = cipherSuite;
            this.f24591b = certificate2;
            this.f24592c = certificate;
        }
    }

    private static void b(Map map, i0 i0Var) {
    }

    public static long f(o0 o0Var) {
        return o0Var.e().d();
    }

    public static d0 g() {
        return f24583g;
    }

    private static void h(Map map, i0 i0Var) {
    }

    public void c(i0 i0Var) {
        b(this.f24587d, i0Var);
    }

    public void d(i0 i0Var) {
        b(this.f24585b, i0Var);
    }

    public void e(i0 i0Var) {
        b(this.f24586c, i0Var);
    }

    public void i(i0 i0Var) {
        h(this.f24587d, i0Var);
    }

    public void j(i0 i0Var) {
        h(this.f24585b, i0Var);
    }

    public void k(i0 i0Var) {
        h(this.f24586c, i0Var);
    }
}
