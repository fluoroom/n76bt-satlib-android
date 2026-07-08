package rb;

import j$.util.DesugarCollections;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final List f25838a = DesugarCollections.unmodifiableList(Arrays.asList(sb.i.HTTP_2));

    static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, sb.b bVar) throws SSLPeerUnverifiedException {
        r9.l.o(sSLSocketFactory, "sslSocketFactory");
        r9.l.o(socket, "socket");
        r9.l.o(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        bVar.c(sSLSocket, false);
        String strH = l.e().h(sSLSocket, str, bVar.f() ? f25838a : null);
        List list = f25838a;
        r9.l.w(list.contains(sb.i.a(strH)), "Only " + list + " are supported, but negotiated protocol is %s", strH);
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
