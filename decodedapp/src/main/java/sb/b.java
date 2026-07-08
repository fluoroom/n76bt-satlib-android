package sb;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final sb.a[] f27209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f27210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f27211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f27212h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f27213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f27214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f27215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f27216d;

    static {
        sb.a[] aVarArr = {sb.a.TLS_AES_128_GCM_SHA256, sb.a.TLS_AES_256_GCM_SHA384, sb.a.TLS_CHACHA20_POLY1305_SHA256, sb.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, sb.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, sb.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, sb.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, sb.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, sb.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, sb.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, sb.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, sb.a.TLS_RSA_WITH_AES_128_GCM_SHA256, sb.a.TLS_RSA_WITH_AES_256_GCM_SHA384, sb.a.TLS_RSA_WITH_AES_128_CBC_SHA, sb.a.TLS_RSA_WITH_AES_256_CBC_SHA, sb.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f27209e = aVarArr;
        C0376b c0376bG = new C0376b(true).g(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        b bVarE = c0376bG.j(kVar, kVar2).h(true).e();
        f27210f = bVarE;
        f27211g = new C0376b(bVarE).j(kVar, kVar2, k.TLS_1_1, k.TLS_1_0).h(true).e();
        f27212h = new C0376b(false).e();
    }

    private b e(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        if (this.f27214b != null) {
            enabledCipherSuites = (String[]) l.c(String.class, this.f27214b, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z10 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        return new C0376b(this).f(enabledCipherSuites).i((String[]) l.c(String.class, this.f27215c, sSLSocket.getEnabledProtocols())).e();
    }

    public void c(SSLSocket sSLSocket, boolean z10) {
        b bVarE = e(sSLSocket, z10);
        sSLSocket.setEnabledProtocols(bVarE.f27215c);
        String[] strArr = bVarE.f27214b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List d() {
        String[] strArr = this.f27214b;
        if (strArr == null) {
            return null;
        }
        sb.a[] aVarArr = new sb.a[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f27214b;
            if (i10 >= strArr2.length) {
                return l.a(aVarArr);
            }
            aVarArr[i10] = sb.a.a(strArr2[i10]);
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z10 = this.f27213a;
        if (z10 != bVar.f27213a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f27214b, bVar.f27214b) && Arrays.equals(this.f27215c, bVar.f27215c) && this.f27216d == bVar.f27216d);
    }

    public boolean f() {
        return this.f27216d;
    }

    public List g() {
        k[] kVarArr = new k[this.f27215c.length];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f27215c;
            if (i10 >= strArr.length) {
                return l.a(kVarArr);
            }
            kVarArr[i10] = k.a(strArr[i10]);
            i10++;
        }
    }

    public int hashCode() {
        if (this.f27213a) {
            return ((((527 + Arrays.hashCode(this.f27214b)) * 31) + Arrays.hashCode(this.f27215c)) * 31) + (!this.f27216d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f27213a) {
            return "ConnectionSpec()";
        }
        List listD = d();
        return "ConnectionSpec(cipherSuites=" + (listD == null ? "[use default]" : listD.toString()) + ", tlsVersions=" + g() + ", supportsTlsExtensions=" + this.f27216d + ")";
    }

    /* JADX INFO: renamed from: sb.b$b, reason: collision with other inner class name */
    public static final class C0376b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f27218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f27219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f27220d;

        public C0376b(boolean z10) {
            this.f27217a = z10;
        }

        public b e() {
            return new b(this);
        }

        public C0376b f(String... strArr) {
            if (!this.f27217a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f27218b = null;
                return this;
            }
            this.f27218b = (String[]) strArr.clone();
            return this;
        }

        public C0376b g(sb.a... aVarArr) {
            if (!this.f27217a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                strArr[i10] = aVarArr[i10].f27208a;
            }
            this.f27218b = strArr;
            return this;
        }

        public C0376b h(boolean z10) {
            if (!this.f27217a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f27220d = z10;
            return this;
        }

        public C0376b i(String... strArr) {
            if (!this.f27217a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f27219c = null;
                return this;
            }
            this.f27219c = (String[]) strArr.clone();
            return this;
        }

        public C0376b j(k... kVarArr) {
            if (!this.f27217a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (kVarArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[kVarArr.length];
            for (int i10 = 0; i10 < kVarArr.length; i10++) {
                strArr[i10] = kVarArr[i10].f27275a;
            }
            this.f27219c = strArr;
            return this;
        }

        public C0376b(b bVar) {
            this.f27217a = bVar.f27213a;
            this.f27218b = bVar.f27214b;
            this.f27219c = bVar.f27215c;
            this.f27220d = bVar.f27216d;
        }
    }

    private b(C0376b c0376b) {
        this.f27213a = c0376b.f27217a;
        this.f27214b = c0376b.f27218b;
        this.f27215c = c0376b.f27219c;
        this.f27216d = c0376b.f27220d;
    }
}
