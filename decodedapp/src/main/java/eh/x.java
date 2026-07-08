package eh;

import eh.x;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12612e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f12613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f12614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd.j f12616d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final x c(k0 k0Var, j jVar, List list, List list2) {
            rd.m.e(k0Var, "tlsVersion");
            rd.m.e(jVar, "cipherSuite");
            rd.m.e(list, "peerCertificates");
            rd.m.e(list2, "localCertificates");
            final List listV = fh.p.v(list);
            return new x(k0Var, jVar, fh.p.v(list2), new qd.a() { // from class: eh.v
                @Override // qd.a
                public final Object a() {
                    return x.a.e(listV);
                }
            });
        }

        public final x d(SSLSession sSLSession) throws IOException {
            final List listK;
            rd.m.e(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (rd.m.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || rd.m.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            j jVarB = j.f12469b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (rd.m.a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            k0 k0VarA = k0.f12541b.a(protocol);
            try {
                listK = fh.p.w(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listK = ed.q.k();
            }
            return new x(k0VarA, jVarB, fh.p.w(sSLSession.getLocalCertificates()), new qd.a() { // from class: eh.w
                @Override // qd.a
                public final Object a() {
                    return x.a.f(listK);
                }
            });
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e(List list) {
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List f(List list) {
            return list;
        }
    }

    public x(k0 k0Var, j jVar, List list, final qd.a aVar) {
        rd.m.e(k0Var, "tlsVersion");
        rd.m.e(jVar, "cipherSuite");
        rd.m.e(list, "localCertificates");
        rd.m.e(aVar, "peerCertificatesFn");
        this.f12613a = k0Var;
        this.f12614b = jVar;
        this.f12615c = list;
        this.f12616d = dd.k.b(new qd.a() { // from class: eh.u
            @Override // qd.a
            public final Object a() {
                return x.f(aVar);
            }
        });
    }

    private final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        rd.m.d(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(qd.a aVar) {
        try {
            return (List) aVar.a();
        } catch (SSLPeerUnverifiedException unused) {
            return ed.q.k();
        }
    }

    public final j b() {
        return this.f12614b;
    }

    public final List d() {
        return this.f12615c;
    }

    public final List e() {
        return (List) this.f12616d.getValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return xVar.f12613a == this.f12613a && rd.m.a(xVar.f12614b, this.f12614b) && rd.m.a(xVar.e(), e()) && rd.m.a(xVar.f12615c, this.f12615c);
    }

    public final k0 g() {
        return this.f12613a;
    }

    public int hashCode() {
        return ((((((527 + this.f12613a.hashCode()) * 31) + this.f12614b.hashCode()) * 31) + e().hashCode()) * 31) + this.f12615c.hashCode();
    }

    public String toString() {
        List listE = e();
        ArrayList arrayList = new ArrayList(ed.q.v(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f12613a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f12614b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List list = this.f12615c;
        ArrayList arrayList2 = new ArrayList(ed.q.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
