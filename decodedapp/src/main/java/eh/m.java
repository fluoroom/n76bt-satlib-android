package eh;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f12554e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f12555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f12556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f12557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f12558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m f12559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f12560k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f12563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f12564d;

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    static {
        j jVar = j.f12510o1;
        j jVar2 = j.f12513p1;
        j jVar3 = j.f12516q1;
        j jVar4 = j.f12468a1;
        j jVar5 = j.f12480e1;
        j jVar6 = j.f12471b1;
        j jVar7 = j.f12483f1;
        j jVar8 = j.f12501l1;
        j jVar9 = j.f12498k1;
        List listN = ed.q.n(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9);
        f12555f = listN;
        List listN2 = ed.q.n(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, j.L0, j.M0, j.f12494j0, j.f12497k0, j.H, j.L, j.f12499l);
        f12556g = listN2;
        a aVar = new a(true);
        j[] jVarArr = (j[]) listN.toArray(new j[0]);
        a aVarB = aVar.b((j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        k0 k0Var = k0.f12542c;
        k0 k0Var2 = k0.f12543d;
        f12557h = aVarB.e(k0Var, k0Var2).d(true).a();
        a aVar2 = new a(true);
        j[] jVarArr2 = (j[]) listN2.toArray(new j[0]);
        f12558i = aVar2.b((j[]) Arrays.copyOf(jVarArr2, jVarArr2.length)).e(k0Var, k0Var2).d(true).a();
        a aVar3 = new a(true);
        j[] jVarArr3 = (j[]) listN2.toArray(new j[0]);
        f12559j = aVar3.b((j[]) Arrays.copyOf(jVarArr3, jVarArr3.length)).e(k0Var, k0Var2, k0.f12544e, k0.f12545f).d(true).a();
        f12560k = new a(false).a();
    }

    public m(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f12561a = z10;
        this.f12562b = z11;
        this.f12563c = strArr;
        this.f12564d = strArr2;
    }

    private final m g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        rd.m.b(enabledCipherSuites);
        String[] strArrC = fh.b.c(this, enabledCipherSuites);
        if (this.f12564d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            rd.m.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = fh.m.w(enabledProtocols2, this.f12564d, gd.a.f());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        rd.m.b(supportedCipherSuites);
        int iO = fh.m.o(supportedCipherSuites, "TLS_FALLBACK_SCSV", j.f12469b.c());
        if (z10 && iO != -1) {
            String str = supportedCipherSuites[iO];
            rd.m.d(str, "get(...)");
            strArrC = fh.m.g(strArrC, str);
        }
        return new a(this).c((String[]) Arrays.copyOf(strArrC, strArrC.length)).f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final void b(SSLSocket sSLSocket, boolean z10) {
        rd.m.e(sSLSocket, "sslSocket");
        m mVarG = g(sSLSocket, z10);
        if (mVarG.i() != null) {
            sSLSocket.setEnabledProtocols(mVarG.f12564d);
        }
        if (mVarG.c() != null) {
            sSLSocket.setEnabledCipherSuites(mVarG.f12563c);
        }
    }

    public final List c() {
        String[] strArr = this.f12563c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(j.f12469b.b(str));
        }
        return arrayList;
    }

    public final String[] d() {
        return this.f12563c;
    }

    public final boolean e(SSLSocket sSLSocket) {
        rd.m.e(sSLSocket, "socket");
        if (!this.f12561a) {
            return false;
        }
        String[] strArr = this.f12564d;
        if (strArr != null && !fh.m.n(strArr, sSLSocket.getEnabledProtocols(), gd.a.f())) {
            return false;
        }
        String[] strArr2 = this.f12563c;
        return strArr2 == null || fh.m.n(strArr2, sSLSocket.getEnabledCipherSuites(), j.f12469b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f12561a;
        m mVar = (m) obj;
        if (z10 != mVar.f12561a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f12563c, mVar.f12563c) && Arrays.equals(this.f12564d, mVar.f12564d) && this.f12562b == mVar.f12562b);
    }

    public final boolean f() {
        return this.f12561a;
    }

    public final boolean h() {
        return this.f12562b;
    }

    public int hashCode() {
        if (!this.f12561a) {
            return 17;
        }
        String[] strArr = this.f12563c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f12564d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f12562b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f12564d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k0.f12541b.a(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.f12561a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f12562b + ')';
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f12566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f12567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12568d;

        public a(boolean z10) {
            this.f12565a = z10;
        }

        public final m a() {
            return new m(this.f12565a, this.f12568d, this.f12566b, this.f12567c);
        }

        public final a b(j... jVarArr) {
            rd.m.e(jVarArr, "cipherSuites");
            if (!this.f12565a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(jVarArr.length);
            for (j jVar : jVarArr) {
                arrayList.add(jVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... strArr) {
            rd.m.e(strArr, "cipherSuites");
            if (!this.f12565a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            rd.m.d(objArrCopyOf, "copyOf(...)");
            this.f12566b = (String[]) objArrCopyOf;
            return this;
        }

        public final a d(boolean z10) {
            if (!this.f12565a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f12568d = z10;
            return this;
        }

        public final a e(k0... k0VarArr) {
            rd.m.e(k0VarArr, "tlsVersions");
            if (!this.f12565a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(k0VarArr.length);
            for (k0 k0Var : k0VarArr) {
                arrayList.add(k0Var.d());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... strArr) {
            rd.m.e(strArr, "tlsVersions");
            if (!this.f12565a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            rd.m.d(objArrCopyOf, "copyOf(...)");
            this.f12567c = (String[]) objArrCopyOf;
            return this;
        }

        public a(m mVar) {
            rd.m.e(mVar, "connectionSpec");
            this.f12565a = mVar.f();
            this.f12566b = mVar.d();
            this.f12567c = mVar.f12564d;
            this.f12568d = mVar.h();
        }
    }
}
