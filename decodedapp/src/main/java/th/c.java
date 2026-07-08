package th;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27886a = new a(null);

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(X509TrustManager x509TrustManager) {
            m.e(x509TrustManager, "trustManager");
            return okhttp3.internal.platform.c.f23684a.e().e(x509TrustManager);
        }

        private a() {
        }
    }

    public abstract List a(List list, String str);
}
