package rb;

import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
abstract class f extends SSLSocket {
    f() {
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getEnableSessionCreation() {
        return false;
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledProtocols() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getNeedClientAuth() {
        return false;
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        return null;
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedProtocols() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getUseClientMode() {
        return false;
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getWantClientAuth() {
        return false;
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() {
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnableSessionCreation(boolean z10) {
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledCipherSuites(String[] strArr) {
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledProtocols(String[] strArr) {
    }

    @Override // javax.net.ssl.SSLSocket
    public void setNeedClientAuth(boolean z10) {
    }

    @Override // javax.net.ssl.SSLSocket
    public void setUseClientMode(boolean z10) {
    }

    @Override // javax.net.ssl.SSLSocket
    public void setWantClientAuth(boolean z10) {
    }
}
