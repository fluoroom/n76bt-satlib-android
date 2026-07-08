package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import ed.q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import qh.f;
import qh.g;
import qh.i;
import qh.j;
import qh.k;
import rd.h;
import rd.m;
import th.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c implements ph.c {

    /* JADX INFO: renamed from: f */
    public static final a f23677f = new a(null);

    /* JADX INFO: renamed from: g */
    private static final String f23678g = "OkHttp";

    /* JADX INFO: renamed from: h */
    private static final boolean f23679h;

    /* JADX INFO: renamed from: d */
    private Context f23680d;

    /* JADX INFO: renamed from: e */
    private final List f23681e;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a() {
            if (c()) {
                return new b();
            }
            return null;
        }

        public final String b() {
            return b.f23678g;
        }

        public final boolean c() {
            return b.f23679h;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.platform.b$b */
    public static final class C0323b implements e {

        /* JADX INFO: renamed from: a */
        private final X509TrustManager f23682a;

        /* JADX INFO: renamed from: b */
        private final Method f23683b;

        public C0323b(X509TrustManager x509TrustManager, Method method) {
            m.e(x509TrustManager, "trustManager");
            m.e(method, "findByIssuerAndSignatureMethod");
            this.f23682a = x509TrustManager;
            this.f23683b = method;
        }

        @Override // th.e
        public X509Certificate a(X509Certificate x509Certificate) {
            m.e(x509Certificate, "cert");
            try {
                Object objInvoke = this.f23683b.invoke(this.f23682a, x509Certificate);
                m.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0323b)) {
                return false;
            }
            C0323b c0323b = (C0323b) obj;
            return m.a(this.f23682a, c0323b.f23682a) && m.a(this.f23683b, c0323b.f23683b);
        }

        public int hashCode() {
            return (this.f23682a.hashCode() * 31) + this.f23683b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f23682a + ", findByIssuerAndSignatureMethod=" + this.f23683b + ')';
        }
    }

    static {
        f23679h = c.f23684a.f() && Build.VERSION.SDK_INT < 29;
    }

    public b() {
        List listP = q.p(k.a.b(k.f25244j, null, 1, null), new i(f.f25228f.d()), new i(qh.h.f25239a.b()), new i(g.f25236a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((j) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f23681e = arrayList;
    }

    @Override // ph.c
    public void a(Context context) {
        this.f23680d = context;
    }

    @Override // ph.c
    public Context b() {
        return this.f23680d;
    }

    @Override // okhttp3.internal.platform.c
    public th.c e(X509TrustManager x509TrustManager) {
        m.e(x509TrustManager, "trustManager");
        qh.b bVarA = qh.b.f25221d.a(x509TrustManager);
        return bVarA != null ? bVarA : super.e(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.c
    public e f(X509TrustManager x509TrustManager) {
        m.e(x509TrustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            m.b(declaredMethod);
            return new C0323b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.f(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void g(SSLSocket sSLSocket, String str, List list) {
        Object next;
        m.e(sSLSocket, "sslSocket");
        m.e(list, "protocols");
        Iterator it = this.f23681e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((j) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            jVar.d(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        m.e(socket, "socket");
        m.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // okhttp3.internal.platform.c
    public String j(SSLSocket sSLSocket) {
        Object next;
        m.e(sSLSocket, "sslSocket");
        Iterator it = this.f23681e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((j) next).a(sSLSocket)) {
                break;
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            return jVar.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.c
    public boolean l(String str) {
        m.e(str, "hostname");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i10 >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // okhttp3.internal.platform.c
    public void m(String str, int i10, Throwable th2) {
        m.e(str, "message");
        if (i10 == 5) {
            Log.w(f23678g, str, th2);
        } else {
            Log.i(f23678g, str, th2);
        }
    }

    @Override // okhttp3.internal.platform.c
    public SSLContext o() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.o();
    }
}
