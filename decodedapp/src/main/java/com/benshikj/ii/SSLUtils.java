package com.benshikj.ii;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/benshikj/ii/SSLUtils;", "", "<init>", "()V", "Companion", "iilib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SSLUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f5074a = "-----BEGIN CERTIFICATE-----\nMIIFazCCA1OgAwIBAgIRAIIQz7DSQONZRGPgu2OCiwAwDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMTUwNjA0MTEwNDM4\nWhcNMzUwNjA0MTEwNDM4WjBPMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJu\nZXQgU2VjdXJpdHkgUmVzZWFyY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBY\nMTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAK3oJHP0FDfzm54rVygc\nh77ct984kIxuPOZXoHj3dcKi/vVqbvYATyjb3miGbESTtrFj/RQSa78f0uoxmyF+\n0TM8ukj13Xnfs7j/EvEhmkvBioZxaUpmZmyPfjxwv60pIgbz5MDmgK7iS4+3mX6U\nA5/TR5d8mUgjU+g4rk8Kb4Mu0UlXjIB0ttov0DiNewNwIRt18jA8+o+u3dpjq+sW\nT8KOEUt+zwvo/7V3LvSye0rgTBIlDHCNAymg4VMk7BPZ7hm/ELNKjD+Jo2FR3qyH\nB5T0Y3HsLuJvW5iB4YlcNHlsdu87kGJ55tukmi8mxdAQ4Q7e2RCOFvu396j3x+UC\nB5iPNgiV5+I3lg02dZ77DnKxHZu8A/lJBdiB3QW0KtZB6awBdpUKD9jf1b0SHzUv\nKBds0pjBqAlkd25HN7rOrFleaJ1/ctaJxQZBKT5ZPt0m9STJEadao0xAH0ahmbWn\nOlFuhjuefXKnEgV4We0+UXgVCwOPjdAvBbI+e0ocS3MFEvzG6uBQE3xDk3SzynTn\njh8BCNAw1FtxNrQHusEwMFxIt4I7mKZ9YIqioymCzLq9gwQbooMDQaHWBfEbwrbw\nqHyGO0aoSCqI3Haadr8faqU9GY/rOPNk3sgrDQoo//fb4hVC1CLQJ13hef4Y53CI\nrU7m2Ys6xt0nUW7/vGT1M0NPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNV\nHRMBAf8EBTADAQH/MB0GA1UdDgQWBBR5tFnme7bl5AFzgAiIyBpY9umbbjANBgkq\nhkiG9w0BAQsFAAOCAgEAVR9YqbyyqFDQDLHYGmkgJykIrGF1XIpu+ILlaS/V9lZL\nubhzEFnTIZd+50xx+7LSYK05qAvqFyFWhfFQDlnrzuBZ6brJFe+GnY+EgPbk6ZGQ\n3BebYhtF8GaV0nxvwuo77x/Py9auJ/GpsMiu/X1+mvoiBOv/2X/qkSsisRcOj/KK\nNFtY2PwByVS5uCbMiogziUwthDyC3+6WVwW6LLv3xLfHTjuCvjHIInNzktHCgKQ5\nORAzI4JMPJ+GslWYHb4phowim57iaztXOoJwTdwJx4nLCgdNbOhdjsnvzqvHu7Ur\nTkXWStAmzOVyyghqpZXjFaH3pO3JLF+l+/+sKAIuvtd7u+Nxe5AW0wdeRlN8NwdC\njNPElpzVmbUq4JUagEiuTDkHzsxHpFKVK7q4+63SM1N95R1NbdWhscdCb+ZAJzVc\noyi3B43njTOQ5yOf+1CceWxG1bQVs5ZufpsMljq4Ui0/1lvh+wjChP4kqKOJ2qxq\n4RgqsahDYVvTH9w7jXbyLeiNdd8XM2w9U/t7y0Ff/9yi0GE44Za4rF2LN9d11TPA\nmRGunUHBcnWEvgJBQl9nJEiU0Zsnvgc/ubhPgXRR4Xq37Z0j4r7g1SgEEzwxA57d\nemyPxgcYxn/eR44/KJ4EBs+lVDR3veyJm+kXQ99b21/+jh5Xos1AnX5iItreGCc=\n-----END CERTIFICATE-----";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dd.j f5075b = dd.k.b(new qd.a() { // from class: com.benshikj.ii.n
        @Override // qd.a
        public final Object a() {
            return SSLUtils.b();
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\u00020\t8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/benshikj/ii/SSLUtils$Companion;", "", "<init>", "()V", "", "", "certificates", "", "trustSystemCertificate", "Ljavax/net/ssl/SSLSocketFactory;", "createSSLSocketFactory", "([Ljava/lang/String;Z)Ljavax/net/ssl/SSLSocketFactory;", "ISRGRootX1SSLSocketFactory$delegate", "Ldd/j;", "getISRGRootX1SSLSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "getISRGRootX1SSLSocketFactory$annotations", "ISRGRootX1SSLSocketFactory", "ISRGRootX1", "Ljava/lang/String;", "iilib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public static /* synthetic */ SSLSocketFactory createSSLSocketFactory$default(Companion companion, String[] strArr, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return companion.createSSLSocketFactory(strArr, z10);
        }

        public static /* synthetic */ void getISRGRootX1SSLSocketFactory$annotations() {
        }

        public final SSLSocketFactory createSSLSocketFactory(String[] certificates, boolean trustSystemCertificate) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
            rd.m.e(certificates, "certificates");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            if (trustSystemCertificate) {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                rd.m.d(trustManagers, "getTrustManagers(...)");
                if (!(trustManagers.length == 0)) {
                    TrustManager trustManager = trustManagerFactory.getTrustManagers()[0];
                    X509TrustManager x509TrustManager = trustManager instanceof X509TrustManager ? (X509TrustManager) trustManager : null;
                    if (x509TrustManager != null) {
                        int length = x509TrustManager.getAcceptedIssuers().length;
                        for (int i10 = 0; i10 < length; i10++) {
                            keyStore.setCertificateEntry("s-" + i10, x509TrustManager.getAcceptedIssuers()[i10]);
                        }
                    }
                }
            }
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            int length2 = certificates.length;
            for (int i11 = 0; i11 < length2; i11++) {
                byte[] bytes = certificates[i11].getBytes(rg.d.f26007b);
                rd.m.d(bytes, "getBytes(...)");
                keyStore.setCertificateEntry("c-" + i11, certificateFactory.generateCertificate(new ByteArrayInputStream(bytes)));
            }
            TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory2.init(keyStore);
            TrustManager[] trustManagers2 = trustManagerFactory2.getTrustManagers();
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            rd.m.d(sSLContext, "getInstance(...)");
            sSLContext.init(null, trustManagers2, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            rd.m.d(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }

        public final SSLSocketFactory getISRGRootX1SSLSocketFactory() {
            return (SSLSocketFactory) SSLUtils.f5075b.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SSLSocketFactory b() {
        return Companion.createSSLSocketFactory$default(INSTANCE, new String[]{f5074a}, false, 2, null);
    }

    public static final SSLSocketFactory createSSLSocketFactory(String[] strArr, boolean z10) {
        return INSTANCE.createSSLSocketFactory(strArr, z10);
    }

    public static final SSLSocketFactory getISRGRootX1SSLSocketFactory() {
        return INSTANCE.getISRGRootX1SSLSocketFactory();
    }
}
