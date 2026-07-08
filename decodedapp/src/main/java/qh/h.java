package qh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import qh.i;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f25239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i.a f25240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f25241c;

    public static final class a implements i.a {
        a() {
        }

        @Override // qh.i.a
        public boolean a(SSLSocket sSLSocket) {
            m.e(sSLSocket, "sslSocket");
            return h.f25239a.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // qh.i.a
        public j b(SSLSocket sSLSocket) {
            m.e(sSLSocket, "sslSocket");
            return new h();
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        public final i.a b() {
            return h.f25240b;
        }

        public final boolean c() {
            return h.f25241c;
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        f25239a = bVar;
        f25240b = new a();
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, bVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (bVar.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f25241c = z10;
    }

    @Override // qh.j
    public boolean a(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // qh.j
    public boolean b() {
        return f25241c;
    }

    @Override // qh.j
    public String c(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // qh.j
    public void d(SSLSocket sSLSocket, String str, List list) {
        m.e(sSLSocket, "sslSocket");
        m.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) okhttp3.internal.platform.c.f23684a.b(list).toArray(new String[0]));
        }
    }
}
