package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import ed.q;
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
import rd.h;
import rd.m;
import th.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c implements ph.c {

    /* JADX INFO: renamed from: f */
    public static final C0322a f23673f = new C0322a(null);

    /* JADX INFO: renamed from: g */
    private static final boolean f23674g;

    /* JADX INFO: renamed from: d */
    private Context f23675d;

    /* JADX INFO: renamed from: e */
    private final List f23676e;

    /* JADX INFO: renamed from: okhttp3.internal.platform.a$a */
    public static final class C0322a {
        public /* synthetic */ C0322a(h hVar) {
            this();
        }

        public final c a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f23674g;
        }

        private C0322a() {
        }
    }

    static {
        f23674g = c.f23684a.f() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listP = q.p(qh.a.f25220a.a(), new i(f.f25228f.d()), new i(qh.h.f25239a.b()), new i(g.f25236a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((j) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f23676e = arrayList;
    }

    @Override // ph.c
    public void a(Context context) {
        this.f23675d = context;
    }

    @Override // ph.c
    public Context b() {
        return this.f23675d;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.f(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.c
    public void g(SSLSocket sSLSocket, String str, List list) {
        Object next;
        m.e(sSLSocket, "sslSocket");
        m.e(list, "protocols");
        Iterator it = this.f23676e.iterator();
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
    public String j(SSLSocket sSLSocket) {
        Object next;
        m.e(sSLSocket, "sslSocket");
        Iterator it = this.f23676e.iterator();
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
    public Object k(String str) {
        m.e(str, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.k(str);
        }
        CloseGuard closeGuardA = ph.a.a();
        closeGuardA.open(str);
        return closeGuardA;
    }

    @Override // okhttp3.internal.platform.c
    public boolean l(String str) {
        m.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.c
    public void m(String str, int i10, Throwable th2) {
        m.e(str, "message");
        if (i10 == 5) {
            Log.w(b.f23677f.b(), str, th2);
        } else {
            Log.i(b.f23677f.b(), str, th2);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void n(String str, Object obj) {
        m.e(str, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.n(str, obj);
        } else {
            m.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            ph.b.a(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.c
    public SSLContext o() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.o();
    }
}
