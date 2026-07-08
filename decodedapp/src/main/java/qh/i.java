package qh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f25243b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        j b(SSLSocket sSLSocket);
    }

    public i(a aVar) {
        m.e(aVar, "socketAdapterFactory");
        this.f25242a = aVar;
    }

    private final synchronized j e(SSLSocket sSLSocket) {
        try {
            if (this.f25243b == null && this.f25242a.a(sSLSocket)) {
                this.f25243b = this.f25242a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f25243b;
    }

    @Override // qh.j
    public boolean a(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        return this.f25242a.a(sSLSocket);
    }

    @Override // qh.j
    public boolean b() {
        return true;
    }

    @Override // qh.j
    public String c(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        j jVarE = e(sSLSocket);
        if (jVarE != null) {
            return jVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // qh.j
    public void d(SSLSocket sSLSocket, String str, List list) {
        m.e(sSLSocket, "sslSocket");
        m.e(list, "protocols");
        j jVarE = e(sSLSocket);
        if (jVarE != null) {
            jVarE.d(sSLSocket, str, list);
        }
    }
}
