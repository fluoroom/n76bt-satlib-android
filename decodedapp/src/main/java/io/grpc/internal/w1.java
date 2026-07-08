package io.grpc.internal;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w1 implements SSLSession {
    @Override // javax.net.ssl.SSLSession
    public int getApplicationBufferSize() {
        return 0;
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        return 0L;
    }

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
        return new byte[0];
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        return 0L;
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getLocalCertificates() {
        return new Certificate[0];
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPacketBufferSize() {
        return 0;
    }

    @Override // javax.net.ssl.SSLSession
    public X509Certificate[] getPeerCertificateChain() {
        throw new UnsupportedOperationException("This method is deprecated and marked for removal. Use the getPeerCertificates() method instead.");
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getPeerCertificates() {
        return new Certificate[0];
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        return 0;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() {
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public String getProtocol() {
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public String[] getValueNames() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSession
    public void invalidate() {
    }

    @Override // javax.net.ssl.SSLSession
    public boolean isValid() {
        return false;
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
    }
}
